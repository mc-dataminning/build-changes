import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class eau {
   private static final Map<String, eau> l = new Object2ObjectArrayMap();
   public static final Codec<eau> a = Codec.stringResolver($$0 -> $$0.m, l::get);
   public static final eau b = new eau(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(ro.g), Optional.of(ro.q), Optional.of(ro.F), Optional.of(ro.M)
   );
   public static final eau c = new eau(
      "spruce", 0.5F, Optional.of(ro.t), Optional.of(ro.u), Optional.of(ro.n), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final eau d = new eau(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(ro.A), Optional.of(ro.B), Optional.empty(), Optional.empty()
   );
   public static final eau e = new eau("azalea", Optional.empty(), Optional.of(ro.z), Optional.empty());
   public static final eau f = new eau("birch", Optional.empty(), Optional.of(ro.l), Optional.of(ro.J));
   public static final eau g = new eau("jungle", Optional.of(ro.s), Optional.of(ro.r), Optional.empty());
   public static final eau h = new eau("acacia", Optional.empty(), Optional.of(ro.m), Optional.empty());
   public static final eau i = new eau("cherry", Optional.empty(), Optional.of(ro.C), Optional.of(ro.O));
   public static final eau j = new eau("dark_oak", Optional.of(ro.h), Optional.empty(), Optional.empty());
   public static final eau k = new eau("pale_oak", Optional.of(ro.j), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<alj<ejx<?, ?>>> o;
   private final Optional<alj<ejx<?, ?>>> p;
   private final Optional<alj<ejx<?, ?>>> q;
   private final Optional<alj<ejx<?, ?>>> r;
   private final Optional<alj<ejx<?, ?>>> s;
   private final Optional<alj<ejx<?, ?>>> t;

   public eau(String $$0, Optional<alj<ejx<?, ?>>> $$1, Optional<alj<ejx<?, ?>>> $$2, Optional<alj<ejx<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public eau(
      String $$0,
      float $$1,
      Optional<alj<ejx<?, ?>>> $$2,
      Optional<alj<ejx<?, ?>>> $$3,
      Optional<alj<ejx<?, ?>>> $$4,
      Optional<alj<ejx<?, ?>>> $$5,
      Optional<alj<ejx<?, ?>>> $$6,
      Optional<alj<ejx<?, ?>>> $$7
   ) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
      this.q = $$4;
      this.r = $$5;
      this.s = $$6;
      this.t = $$7;
      l.put($$0, this);
   }

   @Nullable
   private alj<ejx<?, ?>> a(azz $$0, boolean $$1) {
      if ($$0.i() < this.n) {
         if ($$1 && this.t.isPresent()) {
            return this.t.get();
         }

         if (this.r.isPresent()) {
            return this.r.get();
         }
      }

      return $$1 && this.s.isPresent() ? this.s.get() : this.q.orElse(null);
   }

   @Nullable
   private alj<ejx<?, ?>> a(azz $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(aru $$0, ede $$1, iw $$2, ebg $$3, azz $$4) {
      alj<ejx<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jg<ejx<?, ?>> $$6 = $$0.J_().f(mi.aL).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     ejx<?, ?> $$9 = $$6.a();
                     ebg $$10 = dng.a.m();
                     $$0.a($$2.b($$7, 0, $$8), $$10, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$10, 260);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$10, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$10, 260);
                     if ($$9.a($$0, $$1, $$4, $$2.b($$7, 0, $$8))) {
                        return true;
                     }

                     $$0.a($$2.b($$7, 0, $$8), $$3, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$3, 260);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$3, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$3, 260);
                     return false;
                  }
               }
            }
         }
      }

      alj<ejx<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jg<ejx<?, ?>> $$12 = $$0.J_().f(mi.aL).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            ejx<?, ?> $$13 = $$12.a();
            ebg $$14 = $$0.b_($$2).g();
            $$0.a($$2, $$14, 260);
            if ($$13.a($$0, $$1, $$4, $$2)) {
               if ($$0.a_($$2) == $$14) {
                  $$0.a($$2, $$3, $$14, 2);
               }

               return true;
            } else {
               $$0.a($$2, $$3, 260);
               return false;
            }
         }
      }
   }

   private static boolean a(ebg $$0, djd $$1, iw $$2, int $$3, int $$4) {
      dne $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dka $$0, iw $$1) {
      for (iw $$2 : iw.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(axg.V)) {
            return true;
         }
      }

      return false;
   }
}
