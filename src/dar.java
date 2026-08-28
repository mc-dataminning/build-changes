import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class dar extends czg {
   private static final Map<bwr<? extends bxl>, dar> a = Maps.newIdentityHashMap();
   private final bwr<?> b;

   public dar(bwr<? extends bxl> $$0, czg.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bug a(ddf $$0) {
      djh $$1 = $$0.q();
      if ($$1.C) {
         return bug.a;
      } else {
         czk $$2 = $$0.n();
         iv $$3 = $$0.a();
         jb $$4 = $$0.k();
         eao $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dkc $$6) {
            bwr<?> $$7 = this.a($$1.F_(), $$2);
            $$6.a($$7, $$1.C_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), efo.c, $$3);
            $$2.h(1);
            return bug.a;
         } else {
            iv $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bwr<?> $$10 = this.a($$1.F_(), $$2);
            if ($$10.a((arq)$$1, $$2, $$0.o(), $$8, bwq.m, true, !Objects.equals($$3, $$8) && $$4 == jb.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), efo.t, $$3);
            }

            return bug.a;
         }
      }
   }

   @Override
   public bug a(djh $$0, crj $$1, buf $$2) {
      czk $$3 = $$1.b($$2);
      fet $$4 = a($$0, $$1, diq.b.b);
      if ($$4.d() != fev.a.b) {
         return bug.e;
      } else if ($$0 instanceof arq $$5) {
         iv $$8 = $$4.b();
         if (!($$0.a_($$8).b() instanceof dri)) {
            return bug.e;
         } else if ($$0.a($$1, $$8) && $$1.a($$8, $$4.c(), $$3)) {
            bwr<?> $$9 = this.a($$5.F_(), $$3);
            bwi $$10 = $$9.a($$5, $$3, $$1, $$8, bwq.m, false, false);
            if ($$10 == null) {
               return bug.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awx.c.b(this));
               $$0.a($$1, efo.t, $$10.ds());
               return bug.a;
            }
         } else {
            return bug.d;
         }
      } else {
         return bug.a;
      }
   }

   public boolean a(jh.a $$0, czk $$1, bwr<?> $$2) {
      return Objects.equals(this.a($$0, $$1), $$2);
   }

   @Nullable
   public static dar a(@Nullable bwr<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<dar> a() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bwr<?> a(jh.a $$0, czk $$1) {
      dbs $$2 = $$1.a(kk.Y, dbs.a);
      if (!$$2.c()) {
         bwr<?> $$3 = $$2.a($$0, mh.B);
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.b;
   }

   @Override
   public cut k() {
      return this.b.k();
   }

   public Optional<bxl> a(crj $$0, bxl $$1, bwr<? extends bxl> $$2, arq $$3, fex $$4, czk $$5) {
      if (!this.a($$3.F_(), $$5, $$2)) {
         return Optional.empty();
      } else {
         bxl $$6;
         if ($$1 instanceof bvy) {
            $$6 = ((bvy)$$1).a($$3, (bvy)$$1);
         } else {
            $$6 = $$2.a($$3, bwq.m);
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
   public boolean a(czk $$0, @Nullable crj $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dbs $$2 = $$0.a(kk.Y);
         if ($$2 != null) {
            bwr<?> $$3 = $$2.a($$1.dU().F_(), mh.B);
            return $$3 != null && $$3.s();
         }
      }

      return false;
   }
}
