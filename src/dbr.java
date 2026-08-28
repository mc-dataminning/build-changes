import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbr extends dag {
   private static final Map<bxn<? extends byh>, dbr> a = Maps.newIdentityHashMap();
   private final bxn<?> b;

   public dbr(bxn<? extends byh> $$0, dag.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      if ($$1.C) {
         return bvc.a;
      } else {
         dak $$2 = $$0.n();
         iw $$3 = $$0.a();
         jc $$4 = $$0.k();
         ebq $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dle $$6) {
            bxn<?> $$7 = this.a($$1.J_(), $$2);
            $$6.a($$7, $$1.G_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), egq.c, $$3);
            $$2.h(1);
            return bvc.a;
         } else {
            iw $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bxn<?> $$10 = this.a($$1.J_(), $$2);
            if ($$10.a((asb)$$1, $$2, $$0.o(), $$8, bxm.m, true, !Objects.equals($$3, $$8) && $$4 == jc.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), egq.t, $$3);
            }

            return bvc.a;
         }
      }
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      ffy $$4 = a($$0, $$1, djq.b.b);
      if ($$4.d() != fga.a.b) {
         return bvc.e;
      } else if ($$0 instanceof asb $$5) {
         iw $$8 = $$4.b();
         if (!($$0.a_($$8).b() instanceof dsk)) {
            return bvc.e;
         } else if ($$0.a($$1, $$8) && $$1.a($$8, $$4.c(), $$3)) {
            bxn<?> $$9 = this.a($$5.J_(), $$3);
            bxe $$10 = $$9.a($$5, $$3, $$1, $$8, bxm.m, false, false);
            if ($$10 == null) {
               return bvc.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(axi.c.b(this));
               $$0.a($$1, egq.t, $$10.dt());
               return bvc.a;
            }
         } else {
            return bvc.d;
         }
      } else {
         return bvc.a;
      }
   }

   public boolean a(ji.a $$0, dak $$1, bxn<?> $$2) {
      return Objects.equals(this.a($$0, $$1), $$2);
   }

   @Nullable
   public static dbr a(@Nullable bxn<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<dbr> a() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bxn<?> a(ji.a $$0, dak $$1) {
      dcs $$2 = $$1.a(kl.Y, dcs.a);
      if (!$$2.c()) {
         bxn<?> $$3 = $$2.a($$0, mi.B);
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.b;
   }

   @Override
   public cvs k() {
      return this.b.k();
   }

   public Optional<byh> a(csi $$0, byh $$1, bxn<? extends byh> $$2, asb $$3, fgc $$4, dak $$5) {
      if (!this.a($$3.J_(), $$5, $$2)) {
         return Optional.empty();
      } else {
         byh $$6;
         if ($$1 instanceof bwu) {
            $$6 = ((bwu)$$1).a($$3, (bwu)$$1);
         } else {
            $$6 = $$2.a($$3, bxm.m);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.e_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$6.c($$5);
               $$3.a_($$6);
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }

   @Override
   public boolean a(dak $$0, @Nullable csi $$1) {
      if ($$1 != null && $$1.F() >= 2) {
         dcs $$2 = $$0.a(kl.Y);
         if ($$2 != null) {
            bxn<?> $$3 = $$2.a($$1.dV().J_(), mi.B);
            return $$3 != null && $$3.s();
         }
      }

      return false;
   }
}
