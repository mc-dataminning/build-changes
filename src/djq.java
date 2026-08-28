import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djq extends dix {
   public static final MapCodec<djq> a = b(djq::new);
   public static final dxn[] b = new dxn[]{dxm.o, dxm.p, dxm.q};
   protected static final fbt c = fbq.a(djl.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), djl.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   public djq(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dub($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return $$0.C ? null : a($$2, dua.m, dub::a);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c;
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dub $$5) {
         $$3.a($$5);
         $$3.a(awk.aa);
      }

      return bsj.a;
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lt.ag, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      bsf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return csb.a($$1.c_($$2));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
