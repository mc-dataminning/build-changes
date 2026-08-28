import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbh extends czw {
   private static final Map<bxe<? extends bxy>, dbh> a = Maps.newIdentityHashMap();
   private final bxe<?> b;

   public dbh(bxe<? extends bxy> $$0, czw.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      if ($$1.C) {
         return but.a;
      } else {
         daa $$2 = $$0.n();
         iw $$3 = $$0.a();
         jc $$4 = $$0.k();
         ebg $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dku $$6) {
            bxe<?> $$7 = this.a($$1.J_(), $$2);
            $$6.a($$7, $$1.G_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), egg.c, $$3);
            $$2.h(1);
            return but.a;
         } else {
            iw $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bxe<?> $$10 = this.a($$1.J_(), $$2);
            if ($$10.a((aru)$$1, $$2, $$0.o(), $$8, bxd.m, true, !Objects.equals($$3, $$8) && $$4 == jc.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), egg.t, $$3);
            }

            return but.a;
         }
      }
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      ffo $$4 = a($$0, $$1, djg.b.b);
      if ($$4.d() != ffq.a.b) {
         return but.e;
      } else if ($$0 instanceof aru $$5) {
         iw $$8 = $$4.b();
         if (!($$0.a_($$8).b() instanceof dsa)) {
            return but.e;
         } else if ($$0.a($$1, $$8) && $$1.a($$8, $$4.c(), $$3)) {
            bxe<?> $$9 = this.a($$5.J_(), $$3);
            bwv $$10 = $$9.a($$5, $$3, $$1, $$8, bxd.m, false, false);
            if ($$10 == null) {
               return but.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(axb.c.b(this));
               $$0.a($$1, egg.t, $$10.dt());
               return but.a;
            }
         } else {
            return but.d;
         }
      } else {
         return but.a;
      }
   }

   public boolean a(ji.a $$0, daa $$1, bxe<?> $$2) {
      return Objects.equals(this.a($$0, $$1), $$2);
   }

   @Nullable
   public static dbh a(@Nullable bxe<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<dbh> a() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bxe<?> a(ji.a $$0, daa $$1) {
      dci $$2 = $$1.a(kl.Y, dci.a);
      if (!$$2.c()) {
         bxe<?> $$3 = $$2.a($$0, mi.B);
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.b;
   }

   @Override
   public cvj k() {
      return this.b.k();
   }

   public Optional<bxy> a(crz $$0, bxy $$1, bxe<? extends bxy> $$2, aru $$3, ffs $$4, daa $$5) {
      if (!this.a($$3.J_(), $$5, $$2)) {
         return Optional.empty();
      } else {
         bxy $$6;
         if ($$1 instanceof bwl) {
            $$6 = ((bwl)$$1).a($$3, (bwl)$$1);
         } else {
            $$6 = $$2.a($$3, bxd.m);
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
   public boolean a(daa $$0, @Nullable crz $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dci $$2 = $$0.a(kl.Y);
         if ($$2 != null) {
            bxe<?> $$3 = $$2.a($$1.dV().J_(), mi.B);
            return $$3 != null && $$3.s();
         }
      }

      return false;
   }
}
