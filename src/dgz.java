import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgz extends dgh {
   public static final MapCodec<dgz> a = b(dgz::new);
   public static final dur[] b = new dur[]{duq.k, duq.l, duq.m};
   protected static final eyx c = eyu.a(dgv.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dgv.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   public dgz(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new drh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return $$0.B ? null : a($$2, drg.l, drh::a);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof drh $$5) {
         $$3.a($$5);
         $$3.a(awn.aa);
      }

      return brk.a;
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ln.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      brg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return cqq.a($$1.c_($$2));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
