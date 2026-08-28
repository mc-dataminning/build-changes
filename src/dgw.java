import com.mojang.serialization.MapCodec;

public class dgw extends djm implements dgb, dgu {
   public static final MapCodec<dgw> c = b(dgw::new);

   @Override
   public MapCodec<dgw> a() {
      return c;
   }

   public dgw(dtb.d $$0) {
      super($$0, ji.a, r_, false);
      this.k(this.E.b().a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected djn c() {
      return (djn)dga.sv;
   }

   @Override
   protected dtc a(dtc $$0, dtc $$1) {
      return $$1.a(s_, $$0.c(s_));
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
