import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dxd {
   private static final Map<String, dxd> l = new Object2ObjectArrayMap();
   public static final Codec<dxd> a = Codec.stringResolver($$0 -> $$0.m, l::get);
   public static final dxd b = new dxd(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(sg.g), Optional.of(sg.q), Optional.of(sg.F), Optional.of(sg.L)
   );
   public static final dxd c = new dxd(
      "spruce", 0.5F, Optional.of(sg.t), Optional.of(sg.u), Optional.of(sg.n), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dxd d = new dxd(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(sg.A), Optional.of(sg.B), Optional.empty(), Optional.empty()
   );
   public static final dxd e = new dxd("azalea", Optional.empty(), Optional.of(sg.z), Optional.empty());
   public static final dxd f = new dxd("birch", Optional.empty(), Optional.of(sg.l), Optional.of(sg.I));
   public static final dxd g = new dxd("jungle", Optional.of(sg.s), Optional.of(sg.r), Optional.empty());
   public static final dxd h = new dxd("acacia", Optional.empty(), Optional.of(sg.m), Optional.empty());
   public static final dxd i = new dxd("cherry", Optional.empty(), Optional.of(sg.C), Optional.of(sg.N));
   public static final dxd j = new dxd("dark_oak", Optional.of(sg.h), Optional.empty(), Optional.empty());
   public static final dxd k = new dxd("pale_oak", Optional.of(sg.j), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<alo<egb<?, ?>>> o;
   private final Optional<alo<egb<?, ?>>> p;
   private final Optional<alo<egb<?, ?>>> q;
   private final Optional<alo<egb<?, ?>>> r;
   private final Optional<alo<egb<?, ?>>> s;
   private final Optional<alo<egb<?, ?>>> t;

   public dxd(String $$0, Optional<alo<egb<?, ?>>> $$1, Optional<alo<egb<?, ?>>> $$2, Optional<alo<egb<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dxd(
      String $$0,
      float $$1,
      Optional<alo<egb<?, ?>>> $$2,
      Optional<alo<egb<?, ?>>> $$3,
      Optional<alo<egb<?, ?>>> $$4,
      Optional<alo<egb<?, ?>>> $$5,
      Optional<alo<egb<?, ?>>> $$6,
      Optional<alo<egb<?, ?>>> $$7
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
   private alo<egb<?, ?>> a(bac $$0, boolean $$1) {
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
   private alo<egb<?, ?>> a(bac $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(arx $$0, dzk $$1, jh $$2, dxo $$3, bac $$4) {
      alo<egb<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jq<egb<?, ?>> $$6 = $$0.K_().e(mb.aL).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     egb<?, ?> $$9 = $$6.a();
                     dxo $$10 = dkf.a.m();
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

      alo<egb<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jq<egb<?, ?>> $$12 = $$0.K_().e(mb.aL).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            egb<?, ?> $$13 = $$12.a();
            dxo $$14 = $$0.b_($$2).g();
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

   private static boolean a(dxo $$0, dge $$1, jh $$2, int $$3, int $$4) {
      dkd $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dha $$0, jh $$1) {
      for (jh $$2 : jh.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(axk.W)) {
            return true;
         }
      }

      return false;
   }
}
