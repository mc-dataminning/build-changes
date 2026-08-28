import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dff extends dfy implements dna {
   public static final MapCodec<dff> a = b(dff::new);
   public static final dtt b = dts.C;

   @Override
   public MapCodec<dff> a() {
      return a;
   }

   protected dff(dtb.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dtc $$0, dcc $$1, jd $$2) {
      return $$0.u().c();
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.a;
   }

   @Override
   protected float d(dtc $$0, dcc $$1, jd $$2) {
      return 1.0F;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(b) ? epf.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == epf.c));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   public cuq a(@Nullable cmx $$0, dcx $$1, jd $$2, dtc $$3) {
      return $$0 != null && $$0.f() ? dna.super.a($$0, $$1, $$2, $$3) : cuq.l;
   }

   @Override
   public boolean a(@Nullable cmx $$0, dcc $$1, jd $$2, dtc $$3, epd $$4) {
      return $$0 != null && $$0.f() ? dna.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
