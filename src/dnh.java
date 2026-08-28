import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnh extends dmo {
   public static final MapCodec<dnh> a = b(dnh::new);
   public static final ebv[] b = new ebv[]{ebu.n, ebu.o, ebu.p};
   private static final fgk c = fgh.a(dnc.b(2.0, 2.0, 14.0), dnc.b(14.0, 0.0, 2.0));

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dyg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return $$0.C ? null : a($$2, dye.m, dyg::a);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c;
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dyg $$5) {
         $$3.a($$5);
         $$3.a(awz.aa);
      }

      return bur.a;
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ly.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      bun.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return cvq.a($$1.c_($$2));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
