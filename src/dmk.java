import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmk extends dlr {
   public static final MapCodec<dmk> a = b(dmk::new);
   public static final eay[] b = new eay[]{eax.n, eax.o, eax.p};
   private static final ffk c = ffh.a(dmf.b(2.0, 2.0, 14.0), dmf.b(14.0, 0.0, 2.0));

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   public dmk(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dxj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return $$0.C ? null : a($$2, dxh.m, dxj::a);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c;
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxj $$5) {
         $$3.a($$5);
         $$3.a(awx.aa);
      }

      return bud.a;
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lx.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      btz.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return cuv.a($$1.c_($$2));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
