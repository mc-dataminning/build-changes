import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dzd {
   private static final Map<String, dzd> l = new Object2ObjectArrayMap();
   public static final Codec<dzd> a = Codec.stringResolver($$0 -> $$0.m, l::get);
   public static final dzd b = new dzd(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rn.g), Optional.of(rn.q), Optional.of(rn.F), Optional.of(rn.M)
   );
   public static final dzd c = new dzd(
      "spruce", 0.5F, Optional.of(rn.t), Optional.of(rn.u), Optional.of(rn.n), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dzd d = new dzd(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rn.A), Optional.of(rn.B), Optional.empty(), Optional.empty()
   );
   public static final dzd e = new dzd("azalea", Optional.empty(), Optional.of(rn.z), Optional.empty());
   public static final dzd f = new dzd("birch", Optional.empty(), Optional.of(rn.l), Optional.of(rn.J));
   public static final dzd g = new dzd("jungle", Optional.of(rn.s), Optional.of(rn.r), Optional.empty());
   public static final dzd h = new dzd("acacia", Optional.empty(), Optional.of(rn.m), Optional.empty());
   public static final dzd i = new dzd("cherry", Optional.empty(), Optional.of(rn.C), Optional.of(rn.O));
   public static final dzd j = new dzd("dark_oak", Optional.of(rn.h), Optional.empty(), Optional.empty());
   public static final dzd k = new dzd("pale_oak", Optional.of(rn.j), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<ald<eif<?, ?>>> o;
   private final Optional<ald<eif<?, ?>>> p;
   private final Optional<ald<eif<?, ?>>> q;
   private final Optional<ald<eif<?, ?>>> r;
   private final Optional<ald<eif<?, ?>>> s;
   private final Optional<ald<eif<?, ?>>> t;

   public dzd(String $$0, Optional<ald<eif<?, ?>>> $$1, Optional<ald<eif<?, ?>>> $$2, Optional<ald<eif<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dzd(
      String $$0,
      float $$1,
      Optional<ald<eif<?, ?>>> $$2,
      Optional<ald<eif<?, ?>>> $$3,
      Optional<ald<eif<?, ?>>> $$4,
      Optional<ald<eif<?, ?>>> $$5,
      Optional<ald<eif<?, ?>>> $$6,
      Optional<ald<eif<?, ?>>> $$7
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
   private ald<eif<?, ?>> a(azt $$0, boolean $$1) {
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
   private ald<eif<?, ?>> a(azt $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(aro $$0, ebm $$1, iu $$2, dzo $$3, azt $$4) {
      ald<eif<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         je<eif<?, ?>> $$6 = $$0.F_().f(mg.aK).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     eif<?, ?> $$9 = $$6.a();
                     dzo $$10 = dlw.a.m();
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

      ald<eif<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         je<eif<?, ?>> $$12 = $$0.F_().f(mg.aK).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            eif<?, ?> $$13 = $$12.a();
            dzo $$14 = $$0.b_($$2).g();
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

   private static boolean a(dzo $$0, dhv $$1, iu $$2, int $$3, int $$4) {
      dlu $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(diq $$0, iu $$1) {
      for (iu $$2 : iu.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(axa.V)) {
            return true;
         }
      }

      return false;
   }
}
