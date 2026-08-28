import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvy extends cum {
   private static final Map<btc<? extends btt>, cvy> a = Maps.newIdentityHashMap();
   private static final MapCodec<btc<?>> b = lp.g.q().fieldOf("id");
   private final int c;
   private final int j;
   private final btc<?> k;

   public cvy(btc<? extends btt> $$0, int $$1, int $$2, cum.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      if (!($$1 instanceof arf)) {
         return bqw.a;
      } else {
         cur $$2 = $$0.n();
         iz $$3 = $$0.a();
         je $$4 = $$0.k();
         dse $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dcs $$6) {
            btc<?> $$7 = this.j($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dwx.c, $$3);
            $$2.h(1);
            return bqw.c;
         } else {
            iz $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            btc<?> $$10 = this.j($$2);
            if ($$10.a((arf)$$1, $$2, $$0.o(), $$8, btv.m, true, !Objects.equals($$3, $$8) && $$4 == je.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dwx.t, $$3);
            }

            return bqw.c;
         }
      }
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      cur $$3 = $$1.b($$2);
      evp $$4 = a($$0, $$1, dbj.b.b);
      if ($$4.c() != evr.a.b) {
         return bqx.c($$3);
      } else if (!($$0 instanceof arf)) {
         return bqx.a($$3);
      } else {
         iz $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof djr)) {
            return bqx.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            btc<?> $$7 = this.j($$3);
            bsw $$8 = $$7.a((arf)$$0, $$3, $$1, $$6, btv.m, false, false);
            if ($$8 == null) {
               return bqx.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(awk.c.b(this));
               $$0.a($$1, dwx.t, $$8.dn());
               return bqx.b($$3);
            }
         } else {
            return bqx.d($$3);
         }
      }
   }

   public boolean a(cur $$0, btc<?> $$1) {
      return Objects.equals(this.j($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cvy a(@Nullable btc<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cvy> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public btc<?> j(cur $$0) {
      cxg $$1 = $$0.a(km.M, cxg.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cpn i() {
      return this.k.i();
   }

   public Optional<btt> a(cmz $$0, btt $$1, btc<? extends btt> $$2, arf $$3, evt $$4, cur $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         btt $$6;
         if ($$1 instanceof bsq) {
            $$6 = ((bsq)$$1).a($$3, (bsq)$$1);
         } else {
            $$6 = $$2.a((dca)$$3);
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
               $$6.b($$5.a(km.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
