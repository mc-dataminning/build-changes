import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvh extends ctv {
   private static final Map<bsj<? extends bta>, cvh> a = Maps.newIdentityHashMap();
   private static final MapCodec<bsj<?>> b = lq.f.r().fieldOf("id");
   private final int c;
   private final int j;
   private final bsj<?> k;

   public cvh(bsj<? extends bta> $$0, int $$1, int $$2, ctv.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      if (!($$1 instanceof aqk)) {
         return bqd.a;
      } else {
         cua $$2 = $$0.n();
         ja $$3 = $$0.a();
         jf $$4 = $$0.k();
         dsh $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dcw $$6) {
            bsj<?> $$7 = this.i($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dxa.c, $$3);
            $$2.h(1);
            return bqd.c;
         } else {
            ja $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bsj<?> $$10 = this.i($$2);
            if ($$10.a((aqk)$$1, $$2, $$0.o(), $$8, btc.m, true, !Objects.equals($$3, $$8) && $$4 == jf.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dxa.t, $$3);
            }

            return bqd.c;
         }
      }
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      evv $$4 = a($$0, $$1, dbm.b.b);
      if ($$4.c() != evx.a.b) {
         return bqe.c($$3);
      } else if (!($$0 instanceof aqk)) {
         return bqe.a($$3);
      } else {
         ja $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof djv)) {
            return bqe.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bsj<?> $$7 = this.i($$3);
            bsd $$8 = $$7.a((aqk)$$0, $$3, $$1, $$6, btc.m, false, false);
            if ($$8 == null) {
               return bqe.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(avp.c.b(this));
               $$0.a($$1, dxa.t, $$8.dn());
               return bqe.b($$3);
            }
         } else {
            return bqe.d($$3);
         }
      }
   }

   public boolean a(cua $$0, bsj<?> $$1) {
      return Objects.equals(this.i($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cvh a(@Nullable bsj<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cvh> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bsj<?> i(cua $$0) {
      cwo $$1 = $$0.a(kn.M, cwo.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cov i() {
      return this.k.i();
   }

   public Optional<bta> a(cmh $$0, bta $$1, bsj<? extends bta> $$2, aqk $$3, evz $$4, cua $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bta $$6;
         if ($$1 instanceof brx) {
            $$6 = ((brx)$$1).a($$3, (brx)$$1);
         } else {
            $$6 = $$2.a((dcd)$$3);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.p_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               $$6.b($$5.a(kn.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
