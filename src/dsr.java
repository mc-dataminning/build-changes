import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dsr {
   private static final Map<String, dsr> k = new Object2ObjectArrayMap();
   public static final Codec<dsr> a = Codec.stringResolver($$0 -> $$0.l, k::get);
   public static final dsr b = new dsr(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rw.g), Optional.of(rw.n), Optional.of(rw.C), Optional.of(rw.I)
   );
   public static final dsr c = new dsr(
      "spruce", 0.5F, Optional.of(rw.q), Optional.of(rw.r), Optional.of(rw.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dsr d = new dsr(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rw.x), Optional.of(rw.y), Optional.empty(), Optional.empty()
   );
   public static final dsr e = new dsr("azalea", Optional.empty(), Optional.of(rw.w), Optional.empty());
   public static final dsr f = new dsr("birch", Optional.empty(), Optional.of(rw.i), Optional.of(rw.F));
   public static final dsr g = new dsr("jungle", Optional.of(rw.p), Optional.of(rw.o), Optional.empty());
   public static final dsr h = new dsr("acacia", Optional.empty(), Optional.of(rw.j), Optional.empty());
   public static final dsr i = new dsr("cherry", Optional.empty(), Optional.of(rw.z), Optional.of(rw.K));
   public static final dsr j = new dsr("dark_oak", Optional.of(rw.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<akq<ebq<?, ?>>> n;
   private final Optional<akq<ebq<?, ?>>> o;
   private final Optional<akq<ebq<?, ?>>> p;
   private final Optional<akq<ebq<?, ?>>> q;
   private final Optional<akq<ebq<?, ?>>> r;
   private final Optional<akq<ebq<?, ?>>> s;

   public dsr(String $$0, Optional<akq<ebq<?, ?>>> $$1, Optional<akq<ebq<?, ?>>> $$2, Optional<akq<ebq<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dsr(
      String $$0,
      float $$1,
      Optional<akq<ebq<?, ?>>> $$2,
      Optional<akq<ebq<?, ?>>> $$3,
      Optional<akq<ebq<?, ?>>> $$4,
      Optional<akq<ebq<?, ?>>> $$5,
      Optional<akq<ebq<?, ?>>> $$6,
      Optional<akq<ebq<?, ?>>> $$7
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
   private akq<ebq<?, ?>> a(ayw $$0, boolean $$1) {
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
   private akq<ebq<?, ?>> a(ayw $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(aqu $$0, duz $$1, jd $$2, dtc $$3, ayw $$4) {
      akq<ebq<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jm<ebq<?, ?>> $$6 = $$0.H_().d(lu.aI).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     ebq<?, ?> $$9 = $$6.a();
                     dtc $$10 = dga.a.o();
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

      akq<ebq<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jm<ebq<?, ?>> $$12 = $$0.H_().d(lu.aI).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            ebq<?, ?> $$13 = $$12.a();
            dtc $$14 = $$0.b_($$2).g();
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

   private static boolean a(dtc $$0, dcc $$1, jd $$2, int $$3, int $$4) {
      dfy $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dcx $$0, jd $$1) {
      for (jd $$2 : jd.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(awe.V)) {
            return true;
         }
      }

      return false;
   }
}
