import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxy extends cwl {
   private static final Map<bus<? extends bvj>, cxy> a = Maps.newIdentityHashMap();
   private final bus<?> b;

   public cxy(bus<? extends bvj> $$0, cwl.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bsk a(dai $$0) {
      dgi $$1 = $$0.q();
      if ($$1.C) {
         return bsk.a;
      } else {
         cwp $$2 = $$0.n();
         ji $$3 = $$0.a();
         jn $$4 = $$0.k();
         dwx $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dhd $$6) {
            bus<?> $$7 = this.a($$1.K_(), $$2);
            $$6.a($$7, $$1.H_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), ebt.c, $$3);
            $$2.h(1);
            return bsk.a;
         } else {
            ji $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bus<?> $$10 = this.a($$1.K_(), $$2);
            if ($$10.a((ard)$$1, $$2, $$0.o(), $$8, bur.m, true, !Objects.equals($$3, $$8) && $$4 == jn.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), ebt.t, $$3);
            }

            return bsk.a;
         }
      }
   }

   @Override
   public bsk a(dgi $$0, cox $$1, bsj $$2) {
      cwp $$3 = $$1.b($$2);
      faw $$4 = a($$0, $$1, dfq.b.b);
      if ($$4.d() != fay.a.b) {
         return bsk.e;
      } else if ($$0 instanceof ard $$5) {
         ji $$8 = $$4.b();
         if (!($$0.a_($$8).b() instanceof doe)) {
            return bsk.e;
         } else if ($$0.a($$1, $$8) && $$1.a($$8, $$4.c(), $$3)) {
            bus<?> $$9 = this.a($$5.K_(), $$3);
            bul $$10 = $$9.a($$5, $$3, $$1, $$8, bur.m, false, false);
            if ($$10 == null) {
               return bsk.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awk.c.b(this));
               $$0.a($$1, ebt.t, $$10.dt());
               return bsk.a;
            }
         } else {
            return bsk.d;
         }
      } else {
         return bsk.a;
      }
   }

   public boolean a(jt.a $$0, cwp $$1, bus<?> $$2) {
      return Objects.equals(this.a($$0, $$1), $$2);
   }

   @Nullable
   public static cxy a(@Nullable bus<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cxy> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bus<?> a(jt.a $$0, cwp $$1) {
      cyy $$2 = $$1.a(kv.W, cyy.a);
      if (!$$2.c()) {
         bus<?> $$3 = $$2.a($$0, mc.z);
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.b;
   }

   @Override
   public crt i() {
      return this.b.i();
   }

   public Optional<bvj> a(cox $$0, bvj $$1, bus<? extends bvj> $$2, ard $$3, fba $$4, cwp $$5) {
      if (!this.a($$3.K_(), $$5, $$2)) {
         return Optional.empty();
      } else {
         bvj $$6;
         if ($$1 instanceof buc) {
            $$6 = ((buc)$$1).a($$3, (buc)$$1);
         } else {
            $$6 = $$2.a($$3, bur.m);
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
   public boolean a(cwp $$0, @Nullable cox $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         cyy $$2 = $$0.a(kv.W);
         if ($$2 != null) {
            bus<?> $$3 = $$2.a($$1.dV().K_(), mc.z);
            return $$3 != null && $$3.s();
         }
      }

      return false;
   }
}
