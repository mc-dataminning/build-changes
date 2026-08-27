import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class dgx {
   private static final Map<String, dgx> k = new Object2ObjectArrayMap();
   public static final Codec<dgx> a = asu.a((Function<dgx, String>)($$0 -> $$0.l), k::get);
   public static final dgx b = new dgx(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(qa.g), Optional.of(qa.n), Optional.of(qa.C), Optional.of(qa.I)
   );
   public static final dgx c = new dgx(
      "spruce", 0.5F, Optional.of(qa.q), Optional.of(qa.r), Optional.of(qa.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dgx d = new dgx(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(qa.x), Optional.of(qa.y), Optional.empty(), Optional.empty()
   );
   public static final dgx e = new dgx("azalea", Optional.empty(), Optional.of(qa.w), Optional.empty());
   public static final dgx f = new dgx("birch", Optional.empty(), Optional.of(qa.i), Optional.of(qa.F));
   public static final dgx g = new dgx("jungle", Optional.of(qa.p), Optional.of(qa.o), Optional.empty());
   public static final dgx h = new dgx("acacia", Optional.empty(), Optional.of(qa.j), Optional.empty());
   public static final dgx i = new dgx("cherry", Optional.empty(), Optional.of(qa.z), Optional.of(qa.K));
   public static final dgx j = new dgx("dark_oak", Optional.of(qa.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<agh<dpi<?, ?>>> n;
   private final Optional<agh<dpi<?, ?>>> o;
   private final Optional<agh<dpi<?, ?>>> p;
   private final Optional<agh<dpi<?, ?>>> q;
   private final Optional<agh<dpi<?, ?>>> r;
   private final Optional<agh<dpi<?, ?>>> s;

   public dgx(String $$0, Optional<agh<dpi<?, ?>>> $$1, Optional<agh<dpi<?, ?>>> $$2, Optional<agh<dpi<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dgx(
      String $$0,
      float $$1,
      Optional<agh<dpi<?, ?>>> $$2,
      Optional<agh<dpi<?, ?>>> $$3,
      Optional<agh<dpi<?, ?>>> $$4,
      Optional<agh<dpi<?, ?>>> $$5,
      Optional<agh<dpi<?, ?>>> $$6,
      Optional<agh<dpi<?, ?>>> $$7
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
   private agh<dpi<?, ?>> a(ats $$0, boolean $$1) {
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
   private agh<dpi<?, ?>> a(ats $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(ame $$0, djf $$1, ht $$2, dhi $$3, ats $$4) {
      agh<dpi<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ib<dpi<?, ?>> $$6 = $$0.H_().d(jz.au).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     dpi<?, ?> $$9 = $$6.a();
                     dhi $$10 = cvc.a.o();
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

      agh<dpi<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ib<dpi<?, ?>> $$12 = $$0.H_().d(jz.au).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            dpi<?, ?> $$13 = $$12.a();
            dhi $$14 = $$0.b_($$2).g();
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

   private static boolean a(dhi $$0, crg $$1, ht $$2, int $$3, int $$4) {
      cva $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(csb $$0, ht $$1) {
      for (ht $$2 : ht.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(arg.U)) {
            return true;
         }
      }

      return false;
   }
}
