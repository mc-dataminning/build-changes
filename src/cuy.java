import com.mojang.serialization.MapCodec;

public class cuy extends cxn implements cud, cuw {
   public static final MapCodec<cuy> c = b(cuy::new);

   @Override
   public MapCodec<cuy> a() {
      return c;
   }

   public cuy(dga.d $$0) {
      super($$0, hx.a, r_, false);
      this.k(this.E.b().a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected cxo c() {
      return (cxo)cuc.ru;
   }

   @Override
   protected dgb a(dgb $$0, dgb $$1) {
      return $$1.a(s_, $$0.c(s_));
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
