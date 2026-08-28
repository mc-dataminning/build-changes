import com.mojang.serialization.MapCodec;

public class dow extends dmr {
   public static final MapCodec<dow> a = b(dow::new);
   private static final ffw b = dmr.b(16.0, 0.0, 15.0);

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   protected dow(eas.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(eat $$0) {
      return true;
   }

   @Override
   public eat a(ddg $$0) {
      return !this.m().a((djp)$$0.q(), $$0.a()) ? dmr.a(this.m(), dmt.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$4 == jb.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      dpq.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      eat $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dps;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
