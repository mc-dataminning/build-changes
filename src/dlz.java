import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlz extends dlg {
   public static final MapCodec<dlz> a = b(dlz::new);
   public static final eaf[] b = new eaf[]{eae.n, eae.o, eae.p};
   private static final feq c = fen.a(dlu.b(2.0, 2.0, 14.0), dlu.b(14.0, 0.0, 2.0));

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   public dlz(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dwr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return $$0.C ? null : a($$2, dwp.m, dwr::a);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c;
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dwr $$5) {
         $$3.a($$5);
         $$3.a(awv.aa);
      }

      return bty.a;
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lx.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      btu.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return cuk.a($$1.c_($$2));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
