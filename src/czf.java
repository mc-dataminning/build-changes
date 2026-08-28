import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class czf extends cxu {
   private static final Map<bwb<? extends bwt>, czf> a = Maps.newIdentityHashMap();
   private final bwb<?> b;

   public czf(bwb<? extends bwt> $$0, cxu.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      if ($$1.C) {
         return btq.a;
      } else {
         cxy $$2 = $$0.n();
         jj $$3 = $$0.a();
         jo $$4 = $$0.k();
         dym $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dik $$6) {
            bwb<?> $$7 = this.a($$1.F_(), $$2);
            $$6.a($$7, $$1.C_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), edm.c, $$3);
            $$2.h(1);
            return btq.a;
         } else {
            jj $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bwb<?> $$10 = this.a($$1.F_(), $$2);
            if ($$10.a((arn)$$1, $$2, $$0.o(), $$8, bwa.m, true, !Objects.equals($$3, $$8) && $$4 == jo.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), edm.t, $$3);
            }

            return btq.a;
         }
      }
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      fcq $$4 = a($$0, $$1, dgy.b.b);
      if ($$4.d() != fcs.a.b) {
         return btq.e;
      } else if ($$0 instanceof arn $$5) {
         jj $$8 = $$4.b();
         if (!($$0.a_($$8).b() instanceof dpo)) {
            return btq.e;
         } else if ($$0.a($$1, $$8) && $$1.a($$8, $$4.c(), $$3)) {
            bwb<?> $$9 = this.a($$5.F_(), $$3);
            bvs $$10 = $$9.a($$5, $$3, $$1, $$8, bwa.m, false, false);
            if ($$10 == null) {
               return btq.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awu.c.b(this));
               $$0.a($$1, edm.t, $$10.dt());
               return btq.a;
            }
         } else {
            return btq.d;
         }
      } else {
         return btq.a;
      }
   }

   public boolean a(ju.a $$0, cxy $$1, bwb<?> $$2) {
      return Objects.equals(this.a($$0, $$1), $$2);
   }

   @Nullable
   public static czf a(@Nullable bwb<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<czf> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bwb<?> a(ju.a $$0, cxy $$1) {
      dae $$2 = $$1.a(kx.Y, dae.a);
      if (!$$2.c()) {
         bwb<?> $$3 = $$2.a($$0, me.z);
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.b;
   }

   @Override
   public cte k() {
      return this.b.k();
   }

   public Optional<bwt> a(cqi $$0, bwt $$1, bwb<? extends bwt> $$2, arn $$3, fcu $$4, cxy $$5) {
      if (!this.a($$3.F_(), $$5, $$2)) {
         return Optional.empty();
      } else {
         bwt $$6;
         if ($$1 instanceof bvi) {
            $$6 = ((bvi)$$1).a($$3, (bvi)$$1);
         } else {
            $$6 = $$2.a($$3, bwa.m);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.n_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               $$6.c($$5);
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }

   @Override
   public boolean a(cxy $$0, @Nullable cqi $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dae $$2 = $$0.a(kx.Y);
         if ($$2 != null) {
            bwb<?> $$3 = $$2.a($$1.dV().F_(), me.z);
            return $$3 != null && $$3.s();
         }
      }

      return false;
   }
}
