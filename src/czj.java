import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czj extends dac implements dhc {
   public static final MapCodec<czj> a = b(czj::new);
   public static final dns b = dnr.C;

   @Override
   public MapCodec<czj> a() {
      return a;
   }

   protected czj(dna.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dnb $$0, cwh $$1, ib $$2) {
      return true;
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.a;
   }

   @Override
   protected float d(dnb $$0, cwh $$1, ib $$2) {
      return 1.0F;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(b) ? eiq.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eiq.c));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Override
   public cqm a(@Nullable ciu $$0, cxc $$1, ib $$2, dnb $$3) {
      return $$0 != null && $$0.f() ? dhc.super.a($$0, $$1, $$2, $$3) : cqm.h;
   }

   @Override
   public boolean a(@Nullable ciu $$0, cwh $$1, ib $$2, dnb $$3, eio $$4) {
      return $$0 != null && $$0.f() ? dhc.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
