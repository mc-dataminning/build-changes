import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import org.slf4j.Logger;

public class ftf implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final azs b = azs.a();
   private static final float c = 32.0F;
   private final hgu d;
   private final ald e;
   private ftj f;
   private ftj g;
   private List<ffn.a> h = List.of();
   private List<ffn> i = List.of();
   private final ftc<ftj> j = new ftc<>(ftj[]::new, ftj[][]::new);
   private final ftc<ftf.a> k = new ftc<>(ftf.a[]::new, ftf.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<ftg> m = Lists.newArrayList();
   private final IntFunction<ftf.a> n = this::b;
   private final IntFunction<ftj> o = this::c;

   public ftf(hgu $$0, ald $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<ffn.a> $$0, Set<fte> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<fte> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.d();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = ftl.b.bake(this::a);
      this.g = ftl.a.bake(this::a);
   }

   private List<ffn> b(List<ffn.a> $$0, Set<fte> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<ffn> $$3 = new ArrayList<>();

      for (ffn.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<ffn> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (ffn $$3x : $$3) {
            ffm $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != ftl.b) {
                  ((IntList)this.l.computeIfAbsent(azk.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
               }
               break;
            }
         }
      });
      return $$3.stream().filter($$5::contains).toList();
   }

   @Override
   public void close() {
      this.d();
   }

   private void d() {
      for (ftg $$0 : this.m) {
         $$0.close();
      }

      this.m.clear();
   }

   private static boolean b(ffm $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private ftf.a b(int $$0) {
      ffm $$1 = null;

      for (ffn $$2 : this.i) {
         ffm $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new ftf.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new ftf.a($$1, ftl.b) : ftf.a.c;
   }

   public ffm a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private ftj c(int $$0) {
      for (ffn $$1 : this.i) {
         ffm $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public ftj a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private ftj a(ffo $$0) {
      for (ftg $$1 : this.m) {
         ftj $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      ald $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      fth $$5 = $$4 ? fth.b($$3) : fth.a($$3);
      ftg $$6 = new ftg($$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      ftj $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public ftj a(ffm $$0) {
      IntList $$1 = (IntList)this.l.get(azk.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public ald a() {
      return this.e;
   }

   public ftj b() {
      return this.g;
   }

   static record a(ffm a, ffm b) {
      static final ftf.a c = new ftf.a(ftl.b, ftl.b);

      ffm a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
