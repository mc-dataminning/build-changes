import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvx extends cul {
   private static final Map<btb<? extends bts>, cvx> a = Maps.newIdentityHashMap();
   private static final MapCodec<btb<?>> b = lp.g.q().fieldOf("id");
   private final int c;
   private final int j;
   private final btb<?> k;

   public cvx(btb<? extends bts> $$0, int $$1, int $$2, cul.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      if (!($$1 instanceof arf)) {
         return bqv.a;
      } else {
         cuq $$2 = $$0.n();
         iz $$3 = $$0.a();
         je $$4 = $$0.k();
         dsd $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dcr $$6) {
            btb<?> $$7 = this.j($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dww.c, $$3);
            $$2.h(1);
            return bqv.c;
         } else {
            iz $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            btb<?> $$10 = this.j($$2);
            if ($$10.a((arf)$$1, $$2, $$0.o(), $$8, btu.m, true, !Objects.equals($$3, $$8) && $$4 == je.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dww.t, $$3);
            }

            return bqv.c;
         }
      }
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      cuq $$3 = $$1.b($$2);
      evo $$4 = a($$0, $$1, dbi.b.b);
      if ($$4.c() != evq.a.b) {
         return bqw.c($$3);
      } else if (!($$0 instanceof arf)) {
         return bqw.a($$3);
      } else {
         iz $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof djq)) {
            return bqw.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            btb<?> $$7 = this.j($$3);
            bsv $$8 = $$7.a((arf)$$0, $$3, $$1, $$6, btu.m, false, false);
            if ($$8 == null) {
               return bqw.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(awk.c.b(this));
               $$0.a($$1, dww.t, $$8.dn());
               return bqw.b($$3);
            }
         } else {
            return bqw.d($$3);
         }
      }
   }

   public boolean a(cuq $$0, btb<?> $$1) {
      return Objects.equals(this.j($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cvx a(@Nullable btb<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cvx> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public btb<?> j(cuq $$0) {
      cxf $$1 = $$0.a(km.M, cxf.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cpm i() {
      return this.k.i();
   }

   public Optional<bts> a(cmy $$0, bts $$1, btb<? extends bts> $$2, arf $$3, evs $$4, cuq $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bts $$6;
         if ($$1 instanceof bsp) {
            $$6 = ((bsp)$$1).a($$3, (bsp)$$1);
         } else {
            $$6 = $$2.a((dbz)$$3);
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
