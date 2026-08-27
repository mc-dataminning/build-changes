import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcw extends cwi implements cwc, dap {
   public static final MapCodec<dcw> a = b(dcw::new);
   protected static final float b = 6.0F;
   protected static final elu c = cvz.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dcw> a() {
      return a;
   }

   protected dcw(dio.d $$0) {
      super($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return c;
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.d($$1, $$2, ia.b) && !$$0.a(cwb.kJ);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());
      return $$1.a(arw.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      dip $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return true;
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public edz c_(dip $$0) {
      return eea.c.a(false);
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      dip $$4 = cwb.bx.o();
      dip $$5 = $$4.a(dee.d, djl.a);
      hv $$6 = $$2.c();
      if ($$0.a_($$6).a(cwb.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cer $$0, cse $$1, hv $$2, dip $$3, edy $$4) {
      return false;
   }

   @Override
   public boolean a(csz $$0, hv $$1, dip $$2, edz $$3) {
      return false;
   }
}
