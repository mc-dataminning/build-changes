import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class boa extends bof<bmx> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bmx> g = $$0 -> $$0.eh() != null || $$0.dA() || $$0.bN();
   private final float h;
   private final Predicate<bmx> i;

   public boa(float $$0) {
      this($$0, g);
   }

   public boa(float $$0, Predicate<bmx> $$1) {
      super(ImmutableMap.of(bvq.Z, bvr.c, bvq.x, bvr.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(ane $$0, bmx $$1) {
      return $$1.dN().a(bvq.x) || this.i.test($$1) || $$1.dN().a(bvq.Z);
   }

   protected boolean a(ane $$0, bmx $$1, long $$2) {
      return true;
   }

   protected void b(ane $$0, bmx $$1, long $$2) {
      $$1.dN().a(bvq.Z, true);
      $$1.dN().b(bvq.m);
   }

   protected void c(ane $$0, bmx $$1, long $$2) {
      bno<?> $$3 = $$1.dN();
      $$3.b(bvq.Z);
   }

   protected void d(ane $$0, bmx $$1, long $$2) {
      if ($$1.N().l()) {
         emc $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dN().a(bvq.m, new bvt($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private emc a(bmx $$0, ane $$1) {
      if ($$0.bN()) {
         Optional<emc> $$2 = this.a((ctd)$$1, (blw)$$0).map(emc::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bxk.a($$0, 5, 4);
   }

   private Optional<hx> a(ctd $$0, blw $$1) {
      hx $$2 = $$1.dl();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<hx> $$3;
         if (aup.f($$1.dg()) == 2) {
            $$3 = $$1x -> hx.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(asn.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(asn.a);
         }

         return hx.a($$2, 5, 1, $$3);
      }
   }
}
