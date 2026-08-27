import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class dhc {
   private static final Map<String, dhc> k = new Object2ObjectArrayMap();
   public static final Codec<dhc> a = asy.a((Function<dhc, String>)($$0 -> $$0.l), k::get);
   public static final dhc b = new dhc(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(qe.g), Optional.of(qe.n), Optional.of(qe.C), Optional.of(qe.I)
   );
   public static final dhc c = new dhc(
      "spruce", 0.5F, Optional.of(qe.q), Optional.of(qe.r), Optional.of(qe.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dhc d = new dhc(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(qe.x), Optional.of(qe.y), Optional.empty(), Optional.empty()
   );
   public static final dhc e = new dhc("azalea", Optional.empty(), Optional.of(qe.w), Optional.empty());
   public static final dhc f = new dhc("birch", Optional.empty(), Optional.of(qe.i), Optional.of(qe.F));
   public static final dhc g = new dhc("jungle", Optional.of(qe.p), Optional.of(qe.o), Optional.empty());
   public static final dhc h = new dhc("acacia", Optional.empty(), Optional.of(qe.j), Optional.empty());
   public static final dhc i = new dhc("cherry", Optional.empty(), Optional.of(qe.z), Optional.of(qe.K));
   public static final dhc j = new dhc("dark_oak", Optional.of(qe.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<agl<dpn<?, ?>>> n;
   private final Optional<agl<dpn<?, ?>>> o;
   private final Optional<agl<dpn<?, ?>>> p;
   private final Optional<agl<dpn<?, ?>>> q;
   private final Optional<agl<dpn<?, ?>>> r;
   private final Optional<agl<dpn<?, ?>>> s;

   public dhc(String $$0, Optional<agl<dpn<?, ?>>> $$1, Optional<agl<dpn<?, ?>>> $$2, Optional<agl<dpn<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dhc(
      String $$0,
      float $$1,
      Optional<agl<dpn<?, ?>>> $$2,
      Optional<agl<dpn<?, ?>>> $$3,
      Optional<agl<dpn<?, ?>>> $$4,
      Optional<agl<dpn<?, ?>>> $$5,
      Optional<agl<dpn<?, ?>>> $$6,
      Optional<agl<dpn<?, ?>>> $$7
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
   private agl<dpn<?, ?>> a(atw $$0, boolean $$1) {
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
   private agl<dpn<?, ?>> a(atw $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(ami $$0, djk $$1, hx $$2, dhn $$3, atw $$4) {
      agl<dpn<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ig<dpn<?, ?>> $$6 = $$0.I_().d(kd.au).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dpn<?, ?> $$9 = $$6.a();
                     dhn $$10 = cvh.a.o();
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

      agl<dpn<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ig<dpn<?, ?>> $$12 = $$0.I_().d(kd.au).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dpn<?, ?> $$13 = $$12.a();
            dhn $$14 = $$0.b_($$2).g();
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

   private static boolean a(dhn $$0, crl $$1, hx $$2, int $$3, int $$4) {
      cvf $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(csg $$0, hx $$1) {
      for (hx $$2 : hx.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(ark.U)) {
            return true;
         }
      }

      return false;
   }
}
