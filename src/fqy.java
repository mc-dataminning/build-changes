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

public class fqy implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final bam b = bam.a();
   private static final float c = 32.0F;
   private final hbm d;
   private final alz e;
   private frc f;
   private frc g;
   private List<fer.a> h = List.of();
   private List<fer> i = List.of();
   private final fqv<frc> j = new fqv<>(frc[]::new, frc[][]::new);
   private final fqv<fqy.a> k = new fqv<>(fqy.a[]::new, fqy.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<fqz> m = Lists.newArrayList();
   private final IntFunction<fqy.a> n = this::b;
   private final IntFunction<frc> o = this::c;

   public fqy(hbm $$0, alz $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fer.a> $$0, Set<fqx> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<fqx> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.d();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = fre.b.bake(this::a);
      this.g = fre.a.bake(this::a);
   }

   private List<fer> b(List<fer.a> $$0, Set<fqx> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fer> $$3 = new ArrayList<>();

      for (fer.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fer> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fer $$3x : $$3) {
            feq $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fre.b) {
                  ((IntList)this.l.computeIfAbsent(bae.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fqz $$0 : this.m) {
         $$0.close();
      }

      this.m.clear();
   }

   private static boolean b(feq $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fqy.a b(int $$0) {
      feq $$1 = null;

      for (fer $$2 : this.i) {
         feq $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fqy.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fqy.a($$1, fre.b) : fqy.a.c;
   }

   public feq a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private frc c(int $$0) {
      for (fer $$1 : this.i) {
         feq $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public frc a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private frc a(fes $$0) {
      for (fqz $$1 : this.m) {
         frc $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alz $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      fra $$5 = $$4 ? fra.b($$3) : fra.a($$3);
      fqz $$6 = new fqz($$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      frc $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public frc a(feq $$0) {
      IntList $$1 = (IntList)this.l.get(bae.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public alz a() {
      return this.e;
   }

   public frc b() {
      return this.g;
   }

   static record a(feq a, feq b) {
      static final fqy.a c = new fqy.a(fre.b, fre.b);

      feq a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
