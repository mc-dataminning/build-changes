import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgv extends deu implements dmj {
   public static final MapCodec<dgv> a = b(dgv::new);
   public static final dtc b = dtb.C;
   private static final int d = 3;
   protected static final exa c = dfi.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dgv> a() {
      return a;
   }

   public dgv(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return a($$2, dps.z, $$0.B ? dqc::a : dqc::b);
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.b;
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(b) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return c;
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(awc.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
