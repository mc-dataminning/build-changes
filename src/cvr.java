import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvr extends cuf {
   private static final Map<bsv<? extends btm>, cvr> a = Maps.newIdentityHashMap();
   private static final MapCodec<bsv<?>> b = lp.g.q().fieldOf("id");
   private final int c;
   private final int j;
   private final bsv<?> k;

   public cvr(bsv<? extends btm> $$0, int $$1, int $$2, cuf.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      if (!($$1 instanceof arb)) {
         return bqp.a;
      } else {
         cuk $$2 = $$0.n();
         iz $$3 = $$0.a();
         je $$4 = $$0.k();
         drx $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dcl $$6) {
            bsv<?> $$7 = this.j($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dwq.c, $$3);
            $$2.h(1);
            return bqp.c;
         } else {
            iz $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bsv<?> $$10 = this.j($$2);
            if ($$10.a((arb)$$1, $$2, $$0.o(), $$8, bto.m, true, !Objects.equals($$3, $$8) && $$4 == je.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dwq.t, $$3);
            }

            return bqp.c;
         }
      }
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      evi $$4 = a($$0, $$1, dbc.b.b);
      if ($$4.c() != evk.a.b) {
         return bqq.c($$3);
      } else if (!($$0 instanceof arb)) {
         return bqq.a($$3);
      } else {
         iz $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof djk)) {
            return bqq.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bsv<?> $$7 = this.j($$3);
            bsp $$8 = $$7.a((arb)$$0, $$3, $$1, $$6, bto.m, false, false);
            if ($$8 == null) {
               return bqq.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(awg.c.b(this));
               $$0.a($$1, dwq.t, $$8.dn());
               return bqq.b($$3);
            }
         } else {
            return bqq.d($$3);
         }
      }
   }

   public boolean a(cuk $$0, bsv<?> $$1) {
      return Objects.equals(this.j($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cvr a(@Nullable bsv<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cvr> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bsv<?> j(cuk $$0) {
      cwz $$1 = $$0.a(km.L, cwz.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cpg i() {
      return this.k.i();
   }

   public Optional<btm> a(cms $$0, btm $$1, bsv<? extends btm> $$2, arb $$3, evm $$4, cuk $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         btm $$6;
         if ($$1 instanceof bsj) {
            $$6 = ((bsj)$$1).a($$3, (bsj)$$1);
         } else {
            $$6 = $$2.a((dbt)$$3);
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
               $$6.b($$5.a(km.f));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
