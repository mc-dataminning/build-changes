import com.mojang.serialization.MapCodec;

public class dgv extends djn implements dgb, dgu {
   public static final MapCodec<dgv> c = b(dgv::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dgv> a() {
      return c;
   }

   public dgv(dtb.d $$0) {
      super($$0, ji.a, r_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(ayw $$0) {
      return 1;
   }

   @Override
   protected boolean g(dtc $$0) {
      return $$0.i();
   }

   @Override
   protected dfy b() {
      return dga.sw;
   }

   @Override
   protected dtc a(dtc $$0, dtc $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   protected dtc a(dtc $$0, ayw $$1) {
      return super.a($$0, $$1).a(s_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return new cuq(cut.wv);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      return dgu.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      super.a($$0);
      $$0.a(s_);
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
