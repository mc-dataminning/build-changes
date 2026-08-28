import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlz extends djx implements drp {
   public static final MapCodec<dlz> a = b(dlz::new);
   public static final dyl b = dyk.D;
   private static final int d = 3;
   protected static final fcr c = dkl.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   public dlz(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return a($$2, duy.A, $$0.C ? dvi::a : dvi::b);
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.b;
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return c;
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(aya.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
