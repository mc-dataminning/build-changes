import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dei extends dfc implements dmr {
   public static final MapCodec<dei> a = b(dei::new);
   public static final dtt b = dts.C;

   @Override
   public MapCodec<dei> a() {
      return a;
   }

   protected dei(dtb.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dtc $$0, dbg $$1, ir $$2) {
      return true;
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.a;
   }

   @Override
   protected float d(dtc $$0, dbg $$1, ir $$2) {
      return 1.0F;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
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
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == epf.c));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   public cuh a(@Nullable cly $$0, dcb $$1, ir $$2, dtc $$3) {
      return $$0 != null && $$0.f() ? dmr.super.a($$0, $$1, $$2, $$3) : cuh.i;
   }

   @Override
   public boolean a(@Nullable cly $$0, dbg $$1, ir $$2, dtc $$3, epd $$4) {
      return $$0 != null && $$0.f() ? dmr.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
