import com.mojang.serialization.MapCodec;

public class djo extends dmj {
   public static final MapCodec<djo> a = b(djo::new);

   @Override
   public MapCodec<djo> a() {
      return a;
   }

   public djo(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ji.a.b));
   }

   @Override
   public void a(dcu $$0, dta $$1, jd $$2, bsq $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.aj().l());
   }
}
