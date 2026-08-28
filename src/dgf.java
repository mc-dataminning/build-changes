import com.mojang.serialization.MapCodec;

public class dgf extends div implements dfk, dgd {
   public static final MapCodec<dgf> c = b(dgf::new);

   @Override
   public MapCodec<dgf> a() {
      return c;
   }

   public dgf(dsj.d $$0) {
      super($$0, jf.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected diw c() {
      return (diw)dfj.sv;
   }

   @Override
   protected dsk a(dsk $$0, dsk $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return new cuc(cuf.wv);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      return dgd.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
