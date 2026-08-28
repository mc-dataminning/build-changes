import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvj extends ctx {
   private static final Map<bsm<? extends btd>, cvj> a = Maps.newIdentityHashMap();
   private static final MapCodec<bsm<?>> b = lq.f.r().fieldOf("id");
   private final int c;
   private final int j;
   private final bsm<?> k;

   public cvj(bsm<? extends btd> $$0, int $$1, int $$2, ctx.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      if (!($$1 instanceof aqm)) {
         return bqg.a;
      } else {
         cuc $$2 = $$0.n();
         ja $$3 = $$0.a();
         jf $$4 = $$0.k();
         dsk $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dcy $$6) {
            bsm<?> $$7 = this.i($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dxg.c, $$3);
            $$2.h(1);
            return bqg.c;
         } else {
            ja $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bsm<?> $$10 = this.i($$2);
            if ($$10.a((aqm)$$1, $$2, $$0.o(), $$8, btf.m, true, !Objects.equals($$3, $$8) && $$4 == jf.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dxg.t, $$3);
            }

            return bqg.c;
         }
      }
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      ewb $$4 = a($$0, $$1, dbo.b.b);
      if ($$4.c() != ewd.a.b) {
         return bqh.c($$3);
      } else if (!($$0 instanceof aqm)) {
         return bqh.a($$3);
      } else {
         ja $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof djx)) {
            return bqh.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bsm<?> $$7 = this.i($$3);
            bsg $$8 = $$7.a((aqm)$$0, $$3, $$1, $$6, btf.m, false, false);
            if ($$8 == null) {
               return bqh.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(avr.c.b(this));
               $$0.a($$1, dxg.t, $$8.do());
               return bqh.b($$3);
            }
         } else {
            return bqh.d($$3);
         }
      }
   }

   public boolean a(cuc $$0, bsm<?> $$1) {
      return Objects.equals(this.i($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cvj a(@Nullable bsm<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cvj> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bsm<?> i(cuc $$0) {
      cwq $$1 = $$0.a(kn.M, cwq.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public coy i() {
      return this.k.i();
   }

   public Optional<btd> a(cmk $$0, btd $$1, bsm<? extends btd> $$2, aqm $$3, ewf $$4, cuc $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         btd $$6;
         if ($$1 instanceof bsa) {
            $$6 = ((bsa)$$1).a($$3, (bsa)$$1);
         } else {
            $$6 = $$2.a((dcf)$$3);
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
