import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class div {
   private static final Map<String, div> k = new Object2ObjectArrayMap();
   public static final Codec<div> a = atv.a((Function<div, String>)($$0 -> $$0.l), k::get);
   public static final div b = new div(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(qo.g), Optional.of(qo.n), Optional.of(qo.C), Optional.of(qo.I)
   );
   public static final div c = new div(
      "spruce", 0.5F, Optional.of(qo.q), Optional.of(qo.r), Optional.of(qo.k), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final div d = new div(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(qo.x), Optional.of(qo.y), Optional.empty(), Optional.empty()
   );
   public static final div e = new div("azalea", Optional.empty(), Optional.of(qo.w), Optional.empty());
   public static final div f = new div("birch", Optional.empty(), Optional.of(qo.i), Optional.of(qo.F));
   public static final div g = new div("jungle", Optional.of(qo.p), Optional.of(qo.o), Optional.empty());
   public static final div h = new div("acacia", Optional.empty(), Optional.of(qo.j), Optional.empty());
   public static final div i = new div("cherry", Optional.empty(), Optional.of(qo.z), Optional.of(qo.K));
   public static final div j = new div("dark_oak", Optional.of(qo.h), Optional.empty(), Optional.empty());
   private final String l;
   private final float m;
   private final Optional<ahf<drg<?, ?>>> n;
   private final Optional<ahf<drg<?, ?>>> o;
   private final Optional<ahf<drg<?, ?>>> p;
   private final Optional<ahf<drg<?, ?>>> q;
   private final Optional<ahf<drg<?, ?>>> r;
   private final Optional<ahf<drg<?, ?>>> s;

   public div(String $$0, Optional<ahf<drg<?, ?>>> $$1, Optional<ahf<drg<?, ?>>> $$2, Optional<ahf<drg<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public div(
      String $$0,
      float $$1,
      Optional<ahf<drg<?, ?>>> $$2,
      Optional<ahf<drg<?, ?>>> $$3,
      Optional<ahf<drg<?, ?>>> $$4,
      Optional<ahf<drg<?, ?>>> $$5,
      Optional<ahf<drg<?, ?>>> $$6,
      Optional<ahf<drg<?, ?>>> $$7
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
   private ahf<drg<?, ?>> a(auu $$0, boolean $$1) {
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
   private ahf<drg<?, ?>> a(auu $$0) {
      return this.o.isPresent() && $$0.i() < this.m ? this.o.get() : this.n.orElse(null);
   }

   public boolean a(and $$0, dld $$1, hx $$2, djg $$3, auu $$4) {
      ahf<drg<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ih<drg<?, ?>> $$6 = $$0.I_().d(ke.aw).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     drg<?, ?> $$9 = $$6.a();
                     djg $$10 = cwr.a.o();
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

      ahf<drg<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ih<drg<?, ?>> $$12 = $$0.I_().d(ke.aw).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            drg<?, ?> $$13 = $$12.a();
            djg $$14 = $$0.b_($$2).g();
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

   private static boolean a(djg $$0, csu $$1, hx $$2, int $$3, int $$4) {
      cwp $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(ctp $$0, hx $$1) {
      for (hx $$2 : hx.a.a($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(asg.U)) {
            return true;
         }
      }

      return false;
   }
}
