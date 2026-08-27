import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dqq {
   private static final Map<String, dqq> k = new Object2ObjectArrayMap();
   public static final Codec<dqq> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final dqq b = new dqq(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(ry.g), Optional.of(ry.n), Optional.of(ry.C), Optional.of(ry.I)
   );
   public static final dqq c = new dqq(
      "spruce", 0.5F, Optional.of(ry.q), Optional.of(ry.r), Optional.of(ry.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dqq d = new dqq(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(ry.x), Optional.of(ry.y), Optional.empty(), Optional.empty()
   );
   public static final dqq e = new dqq("azalea", Optional.empty(), Optional.of(ry.w), Optional.empty());
   public static final dqq f = new dqq("birch", Optional.empty(), Optional.of(ry.i), Optional.of(ry.F));
   public static final dqq g = new dqq("jungle", Optional.of(ry.p), Optional.of(ry.o), Optional.empty());
   public static final dqq h = new dqq("acacia", Optional.empty(), Optional.of(ry.j), Optional.empty());
   public static final dqq i = new dqq("cherry", Optional.empty(), Optional.of(ry.z), Optional.of(ry.K));
   public static final dqq j = new dqq("dark_oak", Optional.of(ry.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<akl<dzk<?, ?>>> n;
   private final Optional<akl<dzk<?, ?>>> o;
   private final Optional<akl<dzk<?, ?>>> p;
   private final Optional<akl<dzk<?, ?>>> q;
   private final Optional<akl<dzk<?, ?>>> r;
   private final Optional<akl<dzk<?, ?>>> s;

   public dqq(String $$0, Optional<akl<dzk<?, ?>>> $$1, Optional<akl<dzk<?, ?>>> $$2, Optional<akl<dzk<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dqq(
      String $$0,
      float $$1,
      Optional<akl<dzk<?, ?>>> $$2,
      Optional<akl<dzk<?, ?>>> $$3,
      Optional<akl<dzk<?, ?>>> $$4,
      Optional<akl<dzk<?, ?>>> $$5,
      Optional<akl<dzk<?, ?>>> $$6,
      Optional<akl<dzk<?, ?>>> $$7
   ) {
      this.l = $$0;
      this.m = $$1;
      this.n = $$2;
      this.o = $$3;
      this.p = $$4;
      this.q = $$5;
      this.r = $$6;
      this.s = $$7;
      k.put($$0, this);
   }

   @Nullable
   private akl<dzk<?, ?>> a(ayk $$0, boolean $$1) {
      if ($$0.i() < this.m) {
         if ($$1 && this.s.isPresent()) {
            return this.s.get();
         }

         if (this.q.isPresent()) {
            return this.q.get();
         }
      }

      return $$1 && this.r.isPresent() ? this.r.get() : this.p.orElse(null);
   }

   @Nullable
   private akl<dzk<?, ?>> a(ayk $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(aqm $$0, dsy $$1, io $$2, drb $$3, ayk $$4) {
      akl<dzk<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ix<dzk<?, ?>> $$6 = $$0.H_().d(lf.aC).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dzk<?, ?> $$9 = $$6.a();
                     drb $$10 = dea.a.n();
                     $$0.a($$2.b($$7, 0, $$8), $$10, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$10, 4);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$10, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$10, 4);
                     if ($$9.a($$0, $$1, $$4, $$2.b($$7, 0, $$8))) {
                        return true;
                     }

                     $$0.a($$2.b($$7, 0, $$8), $$3, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$3, 4);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$3, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$3, 4);
                     return false;
                  }
               }
            }
         }
      }

      akl<dzk<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ix<dzk<?, ?>> $$12 = $$0.H_().d(lf.aC).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dzk<?, ?> $$13 = $$12.a();
            drb $$14 = $$0.b_($$2).g();
            $$0.a($$2, $$14, 4);
            if ($$13.a($$0, $$1, $$4, $$2)) {
               if ($$0.a_($$2) == $$14) {
                  $$0.a($$2, $$3, $$14, 2);
               }

               return true;
            } else {
               $$0.a($$2, $$3, 4);
               return false;
            }
         }
      }
   }

   private static boolean a(drb $$0, dad $$1, io $$2, int $$3, int $$4) {
      ddy $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(day $$0, io $$1) {
      for (io $$2 : io.a.c($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(avw.U)) {
            return true;
         }
      }

      return false;
   }
}
