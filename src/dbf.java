import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbf extends czu {
   private static final Map<bxc<? extends bxw>, dbf> a = Maps.newIdentityHashMap();
   private final bxc<?> b;

   public dbf(bxc<? extends bxw> $$0, czu.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      if ($$1.C) {
         return bur.a;
      } else {
         czy $$2 = $$0.n();
         iv $$3 = $$0.a();
         jb $$4 = $$0.k();
         ebe $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dks $$6) {
            bxc<?> $$7 = this.a($$1.J_(), $$2);
            $$6.a($$7, $$1.G_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), ege.c, $$3);
            $$2.h(1);
            return bur.a;
         } else {
            iv $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bxc<?> $$10 = this.a($$1.J_(), $$2);
            if ($$10.a((ars)$$1, $$2, $$0.o(), $$8, bxb.m, true, !Objects.equals($$3, $$8) && $$4 == jb.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), ege.t, $$3);
            }

            return bur.a;
         }
      }
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      ffm $$4 = a($$0, $$1, dje.b.b);
      if ($$4.d() != ffo.a.b) {
         return bur.e;
      } else if ($$0 instanceof ars $$5) {
         iv $$8 = $$4.b();
         if (!($$0.a_($$8).b() instanceof dry)) {
            return bur.e;
         } else if ($$0.a($$1, $$8) && $$1.a($$8, $$4.c(), $$3)) {
            bxc<?> $$9 = this.a($$5.J_(), $$3);
            bwt $$10 = $$9.a($$5, $$3, $$1, $$8, bxb.m, false, false);
            if ($$10 == null) {
               return bur.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awz.c.b(this));
               $$0.a($$1, ege.t, $$10.dt());
               return bur.a;
            }
         } else {
            return bur.d;
         }
      } else {
         return bur.a;
      }
   }

   public boolean a(jh.a $$0, czy $$1, bxc<?> $$2) {
      return Objects.equals(this.a($$0, $$1), $$2);
   }

   @Nullable
   public static dbf a(@Nullable bxc<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<dbf> a() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bxc<?> a(jh.a $$0, czy $$1) {
      dcg $$2 = $$1.a(kk.Y, dcg.a);
      if (!$$2.c()) {
         bxc<?> $$3 = $$2.a($$0, mh.B);
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.b;
   }

   @Override
   public cvh k() {
      return this.b.k();
   }

   public Optional<bxw> a(crx $$0, bxw $$1, bxc<? extends bxw> $$2, ars $$3, ffq $$4, czy $$5) {
      if (!this.a($$3.J_(), $$5, $$2)) {
         return Optional.empty();
      } else {
         bxw $$6;
         if ($$1 instanceof bwj) {
            $$6 = ((bwj)$$1).a($$3, (bwj)$$1);
         } else {
            $$6 = $$2.a($$3, bxb.m);
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
   public boolean a(czy $$0, @Nullable crx $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dcg $$2 = $$0.a(kk.Y);
         if ($$2 != null) {
            bxc<?> $$3 = $$2.a($$1.dV().J_(), mh.B);
            return $$3 != null && $$3.s();
         }
      }

      return false;
   }
}
