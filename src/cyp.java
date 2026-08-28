import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyp extends cxd {
   private static final Map<bvi<? extends bwa>, cyp> a = Maps.newIdentityHashMap();
   private final bvi<?> b;

   public cyp(bvi<? extends bwa> $$0, cxd.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      if ($$1.C) {
         return bsy.a;
      } else {
         cxh $$2 = $$0.n();
         ji $$3 = $$0.a();
         jn $$4 = $$0.k();
         dxq $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dhu $$6) {
            bvi<?> $$7 = this.a($$1.F_(), $$2);
            $$6.a($$7, $$1.C_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), ecp.c, $$3);
            $$2.h(1);
            return bsy.a;
         } else {
            ji $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bvi<?> $$10 = this.a($$1.F_(), $$2);
            if ($$10.a((ard)$$1, $$2, $$0.o(), $$8, bvh.m, true, !Objects.equals($$3, $$8) && $$4 == jn.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), ecp.t, $$3);
            }

            return bsy.a;
         }
      }
   }

   @Override
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      cxh $$3 = $$1.b($$2);
      fbt $$4 = a($$0, $$1, dgi.b.b);
      if ($$4.d() != fbv.a.b) {
         return bsy.e;
      } else if ($$0 instanceof ard $$5) {
         ji $$8 = $$4.b();
         if (!($$0.a_($$8).b() instanceof doy)) {
            return bsy.e;
         } else if ($$0.a($$1, $$8) && $$1.a($$8, $$4.c(), $$3)) {
            bvi<?> $$9 = this.a($$5.F_(), $$3);
            bva $$10 = $$9.a($$5, $$3, $$1, $$8, bvh.m, false, false);
            if ($$10 == null) {
               return bsy.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awk.c.b(this));
               $$0.a($$1, ecp.t, $$10.ds());
               return bsy.a;
            }
         } else {
            return bsy.d;
         }
      } else {
         return bsy.a;
      }
   }

   public boolean a(jt.a $$0, cxh $$1, bvi<?> $$2) {
      return Objects.equals(this.a($$0, $$1), $$2);
   }

   @Nullable
   public static cyp a(@Nullable bvi<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cyp> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bvi<?> a(jt.a $$0, cxh $$1) {
      czo $$2 = $$1.a(kv.Y, czo.a);
      if (!$$2.c()) {
         bvi<?> $$3 = $$2.a($$0, mc.z);
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.b;
   }

   @Override
   public csn k() {
      return this.b.k();
   }

   public Optional<bwa> a(cpr $$0, bwa $$1, bvi<? extends bwa> $$2, ard $$3, fbx $$4, cxh $$5) {
      if (!this.a($$3.F_(), $$5, $$2)) {
         return Optional.empty();
      } else {
         bwa $$6;
         if ($$1 instanceof buq) {
            $$6 = ((buq)$$1).a($$3, (buq)$$1);
         } else {
            $$6 = $$2.a($$3, bvh.m);
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
               $$6.b($$5.a(kv.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }

   @Override
   public boolean a(cxh $$0, @Nullable cpr $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         czo $$2 = $$0.a(kv.Y);
         if ($$2 != null) {
            bvi<?> $$3 = $$2.a($$1.dU().F_(), mc.z);
            return $$3 != null && $$3.s();
         }
      }

      return false;
   }
}
