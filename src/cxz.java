import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxz extends cwm {
   private static final Map<but<? extends bvk>, cxz> a = Maps.newIdentityHashMap();
   private final but<?> b;

   public cxz(but<? extends bvk> $$0, cwm.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bsl a(daj $$0) {
      dgj $$1 = $$0.q();
      if ($$1.C) {
         return bsl.a;
      } else {
         cwq $$2 = $$0.n();
         ji $$3 = $$0.a();
         jn $$4 = $$0.k();
         dwy $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dhe $$6) {
            but<?> $$7 = this.a($$1.K_(), $$2);
            $$6.a($$7, $$1.H_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), ebu.c, $$3);
            $$2.h(1);
            return bsl.a;
         } else {
            ji $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            but<?> $$10 = this.a($$1.K_(), $$2);
            if ($$10.a((ard)$$1, $$2, $$0.o(), $$8, bus.m, true, !Objects.equals($$3, $$8) && $$4 == jn.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), ebu.t, $$3);
            }

            return bsl.a;
         }
      }
   }

   @Override
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      cwq $$3 = $$1.b($$2);
      fax $$4 = a($$0, $$1, dfr.b.b);
      if ($$4.d() != faz.a.b) {
         return bsl.e;
      } else if ($$0 instanceof ard $$5) {
         ji $$8 = $$4.b();
         if (!($$0.a_($$8).b() instanceof dof)) {
            return bsl.e;
         } else if ($$0.a($$1, $$8) && $$1.a($$8, $$4.c(), $$3)) {
            but<?> $$9 = this.a($$5.K_(), $$3);
            bum $$10 = $$9.a($$5, $$3, $$1, $$8, bus.m, false, false);
            if ($$10 == null) {
               return bsl.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awk.c.b(this));
               $$0.a($$1, ebu.t, $$10.dt());
               return bsl.a;
            }
         } else {
            return bsl.d;
         }
      } else {
         return bsl.a;
      }
   }

   public boolean a(jt.a $$0, cwq $$1, but<?> $$2) {
      return Objects.equals(this.a($$0, $$1), $$2);
   }

   @Nullable
   public static cxz a(@Nullable but<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cxz> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public but<?> a(jt.a $$0, cwq $$1) {
      cyz $$2 = $$1.a(kv.W, cyz.a);
      if (!$$2.c()) {
         but<?> $$3 = $$2.a($$0, mc.z);
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.b;
   }

   @Override
   public cru i() {
      return this.b.i();
   }

   public Optional<bvk> a(coy $$0, bvk $$1, but<? extends bvk> $$2, ard $$3, fbb $$4, cwq $$5) {
      if (!this.a($$3.K_(), $$5, $$2)) {
         return Optional.empty();
      } else {
         bvk $$6;
         if ($$1 instanceof bud) {
            $$6 = ((bud)$$1).a($$3, (bud)$$1);
         } else {
            $$6 = $$2.a($$3, bus.m);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.e_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               $$6.b($$5.a(kv.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }

   @Override
   public boolean a(cwq $$0, @Nullable coy $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         cyz $$2 = $$0.a(kv.W);
         if ($$2 != null) {
            but<?> $$3 = $$2.a($$1.dV().K_(), mc.z);
            return $$3 != null && $$3.s();
         }
      }

      return false;
   }
}
