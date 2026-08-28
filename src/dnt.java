import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnt extends dna {
   public static final MapCodec<dnt> a = b(dnt::new);
   public static final ech[] b = new ech[]{ecg.n, ecg.o, ecg.p};
   private static final fgw c = fgt.a(dno.b(2.0, 2.0, 14.0), dno.b(14.0, 0.0, 2.0));

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   public dnt(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dys($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return $$0.C ? null : a($$2, dyq.m, dys::a);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c;
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dys $$5) {
         $$3.a($$5);
         $$3.a(axi.aa);
      }

      return bvc.a;
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lz.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      buy.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return cwb.a($$1.c_($$2));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
