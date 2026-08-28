import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dwl {
   private static final Map<String, dwl> l = new Object2ObjectArrayMap();
   public static final Codec<dwl> a = Codec.stringResolver($$0 -> $$0.m, l::get);
   public static final dwl b = new dwl(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rk.g), Optional.of(rk.q), Optional.of(rk.F), Optional.of(rk.L)
   );
   public static final dwl c = new dwl(
      "spruce", 0.5F, Optional.of(rk.t), Optional.of(rk.u), Optional.of(rk.n), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dwl d = new dwl(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rk.A), Optional.of(rk.B), Optional.empty(), Optional.empty()
   );
   public static final dwl e = new dwl("azalea", Optional.empty(), Optional.of(rk.z), Optional.empty());
   public static final dwl f = new dwl("birch", Optional.empty(), Optional.of(rk.l), Optional.of(rk.I));
   public static final dwl g = new dwl("jungle", Optional.of(rk.s), Optional.of(rk.r), Optional.empty());
   public static final dwl h = new dwl("acacia", Optional.empty(), Optional.of(rk.m), Optional.empty());
   public static final dwl i = new dwl("cherry", Optional.empty(), Optional.of(rk.C), Optional.of(rk.N));
   public static final dwl j = new dwl("dark_oak", Optional.of(rk.h), Optional.empty(), Optional.empty());
   public static final dwl k = new dwl("pale_oak", Optional.of(rk.j), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<aku<efj<?, ?>>> o;
   private final Optional<aku<efj<?, ?>>> p;
   private final Optional<aku<efj<?, ?>>> q;
   private final Optional<aku<efj<?, ?>>> r;
   private final Optional<aku<efj<?, ?>>> s;
   private final Optional<aku<efj<?, ?>>> t;

   public dwl(String $$0, Optional<aku<efj<?, ?>>> $$1, Optional<aku<efj<?, ?>>> $$2, Optional<aku<efj<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dwl(
      String $$0,
      float $$1,
      Optional<aku<efj<?, ?>>> $$2,
      Optional<aku<efj<?, ?>>> $$3,
      Optional<aku<efj<?, ?>>> $$4,
      Optional<aku<efj<?, ?>>> $$5,
      Optional<aku<efj<?, ?>>> $$6,
      Optional<aku<efj<?, ?>>> $$7
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
   private aku<efj<?, ?>> a(azh $$0, boolean $$1) {
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
   private aku<efj<?, ?>> a(azh $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(ard $$0, dys $$1, ji $$2, dww $$3, azh $$4) {
      aku<efj<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jr<efj<?, ?>> $$6 = $$0.K_().e(mc.aL).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     efj<?, ?> $$9 = $$6.a();
                     dww $$10 = djn.a.m();
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

      aku<efj<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jr<efj<?, ?>> $$12 = $$0.K_().e(mc.aL).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            efj<?, ?> $$13 = $$12.a();
            dww $$14 = $$0.b_($$2).g();
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

   private static boolean a(dww $$0, dfm $$1, ji $$2, int $$3, int $$4) {
      djl $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dgi $$0, ji $$1) {
      for (ji $$2 : ji.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(awp.V)) {
            return true;
         }
      }

      return false;
   }
}
