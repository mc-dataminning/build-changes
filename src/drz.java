import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class drz {
   private static final Map<String, drz> k = new Object2ObjectArrayMap();
   public static final Codec<drz> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final drz b = new drz(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rs.g), Optional.of(rs.n), Optional.of(rs.C), Optional.of(rs.I)
   );
   public static final drz c = new drz(
      "spruce", 0.5F, Optional.of(rs.q), Optional.of(rs.r), Optional.of(rs.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final drz d = new drz(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rs.x), Optional.of(rs.y), Optional.empty(), Optional.empty()
   );
   public static final drz e = new drz("azalea", Optional.empty(), Optional.of(rs.w), Optional.empty());
   public static final drz f = new drz("birch", Optional.empty(), Optional.of(rs.i), Optional.of(rs.F));
   public static final drz g = new drz("jungle", Optional.of(rs.p), Optional.of(rs.o), Optional.empty());
   public static final drz h = new drz("acacia", Optional.empty(), Optional.of(rs.j), Optional.empty());
   public static final drz i = new drz("cherry", Optional.empty(), Optional.of(rs.z), Optional.of(rs.K));
   public static final drz j = new drz("dark_oak", Optional.of(rs.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<akj<eax<?, ?>>> n;
   private final Optional<akj<eax<?, ?>>> o;
   private final Optional<akj<eax<?, ?>>> p;
   private final Optional<akj<eax<?, ?>>> q;
   private final Optional<akj<eax<?, ?>>> r;
   private final Optional<akj<eax<?, ?>>> s;

   public drz(String $$0, Optional<akj<eax<?, ?>>> $$1, Optional<akj<eax<?, ?>>> $$2, Optional<akj<eax<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public drz(
      String $$0,
      float $$1,
      Optional<akj<eax<?, ?>>> $$2,
      Optional<akj<eax<?, ?>>> $$3,
      Optional<akj<eax<?, ?>>> $$4,
      Optional<akj<eax<?, ?>>> $$5,
      Optional<akj<eax<?, ?>>> $$6,
      Optional<akj<eax<?, ?>>> $$7
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
   private akj<eax<?, ?>> a(ayo $$0, boolean $$1) {
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
   private akj<eax<?, ?>> a(ayo $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(aqm $$0, duh $$1, ja $$2, dsk $$3, ayo $$4) {
      akj<eax<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jj<eax<?, ?>> $$6 = $$0.H_().d(lr.aH).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     eax<?, ?> $$9 = $$6.a();
                     dsk $$10 = dfj.a.o();
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

      akj<eax<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jj<eax<?, ?>> $$12 = $$0.H_().d(lr.aH).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            eax<?, ?> $$13 = $$12.a();
            dsk $$14 = $$0.b_($$2).g();
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

   private static boolean a(dsk $$0, dbl $$1, ja $$2, int $$3, int $$4) {
      dfh $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dcg $$0, ja $$1) {
      for (ja $$2 : ja.a.c($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(avw.U)) {
            return true;
         }
      }

      return false;
   }
}
