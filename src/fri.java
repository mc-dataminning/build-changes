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

public class fri implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final azg b = azg.a();
   private static final float c = 32.0F;
   private final heo d;
   private final aku e;
   private frm f;
   private frm g;
   private List<fdr.a> h = List.of();
   private List<fdr> i = List.of();
   private final frf<frm> j = new frf<>(frm[]::new, frm[][]::new);
   private final frf<fri.a> k = new frf<>(fri.a[]::new, fri.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<frj> m = Lists.newArrayList();
   private final IntFunction<fri.a> n = this::b;
   private final IntFunction<frm> o = this::c;

   public fri(heo $$0, aku $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fdr.a> $$0, Set<frh> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<frh> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.d();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = fro.b.bake(this::a);
      this.g = fro.a.bake(this::a);
   }

   private List<fdr> b(List<fdr.a> $$0, Set<frh> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fdr> $$3 = new ArrayList<>();

      for (fdr.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fdr> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fdr $$3x : $$3) {
            fdq $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fro.b) {
                  ((IntList)this.l.computeIfAbsent(ayy.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (frj $$0 : this.m) {
         $$0.close();
      }

      this.m.clear();
   }

   private static boolean b(fdq $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fri.a b(int $$0) {
      fdq $$1 = null;

      for (fdr $$2 : this.i) {
         fdq $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fri.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fri.a($$1, fro.b) : fri.a.c;
   }

   public fdq a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private frm c(int $$0) {
      for (fdr $$1 : this.i) {
         fdq $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public frm a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private frm a(fds $$0) {
      for (frj $$1 : this.m) {
         frm $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      aku $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      frk $$5 = $$4 ? frk.b($$3) : frk.a($$3);
      frj $$6 = new frj($$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      frm $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public frm a(fdq $$0) {
      IntList $$1 = (IntList)this.l.get(ayy.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public aku a() {
      return this.e;
   }

   public frm b() {
      return this.g;
   }

   static record a(fdq a, fdq b) {
      static final fri.a c = new fri.a(fro.b, fro.b);

      fdq a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
