import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnu extends dhe implements dgy, dlm {
   public static final MapCodec<dnu> a = b(dnu::new);
   protected static final float b = 6.0F;
   protected static final eyx c = dgv.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   protected dnu(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return $$0.c($$1, $$2, jj.b) && !$$0.a(dgx.kJ);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      return $$1.a(awy.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      dua $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.l()) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return $$0.a_($$1.d()).a(dgx.G);
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   protected eqb b_(dua $$0) {
      return eqc.c.a(false);
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      dua $$4 = dgx.bx.o();
      dua $$5 = $$4.b(dpc.d, duw.a);
      je $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable cnp $$0, dcx $$1, je $$2, dua $$3, eqa $$4) {
      return false;
   }

   @Override
   public boolean a(ddt $$0, je $$1, dua $$2, eqb $$3) {
      return false;
   }
}
