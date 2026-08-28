import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dlx extends dlu {
   public static final MapCodec<dlx> c = b(dlx::new);
   public static final ebm<jb> d = dqn.e;
   private static final Map<jb, ffr> e = ffo.c(dmm.b(16.0, 8.0, 5.0, 16.0));

   @Override
   public MapCodec<? extends dlx> a() {
      return c;
   }

   protected dlx(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, jb.c).b(b, Boolean.valueOf(true)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return e.get($$0.c(d));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(d, b);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return $$4.g() == $$0.c(d) && !$$0.a($$1, $$3) ? dmo.a.m() : $$0;
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      jb $$3 = $$0.c(d);
      iv $$4 = $$2.a($$3.g());
      eao $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      eao $$1 = super.a($$0);
      djk $$2 = $$0.q();
      iv $$3 = $$0.a();
      jb[] $$4 = $$0.f();

      for (jb $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(d, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
