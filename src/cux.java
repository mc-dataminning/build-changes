import com.mojang.serialization.MapCodec;

public class cux extends cxo implements cud, cuw {
   public static final MapCodec<cux> c = b(cux::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<cux> a() {
      return c;
   }

   public cux(dga.d $$0) {
      super($$0, hx.a, r_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(ate $$0) {
      return 1;
   }

   @Override
   protected boolean g(dgb $$0) {
      return $$0.i();
   }

   @Override
   protected cua b() {
      return cuc.rv;
   }

   @Override
   protected dgb a(dgb $$0, dgb $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   protected dgb a(dgb $$0, ate $$1) {
      return super.a($$0, $$1).a(s_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return new ckj(ckm.vw);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      return cuw.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      super.a($$0);
      $$0.a(s_);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
