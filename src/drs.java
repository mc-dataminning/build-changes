import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class drs {
   private static final Map<String, drs> k = new Object2ObjectArrayMap();
   public static final Codec<drs> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final drs b = new drs(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(sn.g), Optional.of(sn.n), Optional.of(sn.C), Optional.of(sn.I)
   );
   public static final drs c = new drs(
      "spruce", 0.5F, Optional.of(sn.q), Optional.of(sn.r), Optional.of(sn.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final drs d = new drs(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(sn.x), Optional.of(sn.y), Optional.empty(), Optional.empty()
   );
   public static final drs e = new drs("azalea", Optional.empty(), Optional.of(sn.w), Optional.empty());
   public static final drs f = new drs("birch", Optional.empty(), Optional.of(sn.i), Optional.of(sn.F));
   public static final drs g = new drs("jungle", Optional.of(sn.p), Optional.of(sn.o), Optional.empty());
   public static final drs h = new drs("acacia", Optional.empty(), Optional.of(sn.j), Optional.empty());
   public static final drs i = new drs("cherry", Optional.empty(), Optional.of(sn.z), Optional.of(sn.K));
   public static final drs j = new drs("dark_oak", Optional.of(sn.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ale<eam<?, ?>>> n;
   private final Optional<ale<eam<?, ?>>> o;
   private final Optional<ale<eam<?, ?>>> p;
   private final Optional<ale<eam<?, ?>>> q;
   private final Optional<ale<eam<?, ?>>> r;
   private final Optional<ale<eam<?, ?>>> s;

   public drs(String $$0, Optional<ale<eam<?, ?>>> $$1, Optional<ale<eam<?, ?>>> $$2, Optional<ale<eam<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public drs(
      String $$0,
      float $$1,
      Optional<ale<eam<?, ?>>> $$2,
      Optional<ale<eam<?, ?>>> $$3,
      Optional<ale<eam<?, ?>>> $$4,
      Optional<ale<eam<?, ?>>> $$5,
      Optional<ale<eam<?, ?>>> $$6,
      Optional<ale<eam<?, ?>>> $$7
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
   private ale<eam<?, ?>> a(azh $$0, boolean $$1) {
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
   private ale<eam<?, ?>> a(azh $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(arf $$0, dua $$1, iz $$2, dsd $$3, azh $$4) {
      ale<eam<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ji<eam<?, ?>> $$6 = $$0.H_().d(lq.aC).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     eam<?, ?> $$9 = $$6.a();
                     dsd $$10 = dfc.a.o();
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

      ale<eam<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ji<eam<?, ?>> $$12 = $$0.H_().d(lq.aC).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            eam<?, ?> $$13 = $$12.a();
            dsd $$14 = $$0.b_($$2).g();
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

   private static boolean a(dsd $$0, dbf $$1, iz $$2, int $$3, int $$4) {
      dfa $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dca $$0, iz $$1) {
      for (iz $$2 : iz.a.c($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(awp.U)) {
            return true;
         }
      }

      return false;
   }
}
