import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class drg extends dmm implements dtx {
   public static final MapCodec<drg> a = b(drg::new);
   public static final int b = 15;
   public static final ebo c = ebe.aS;
   public static final ebf d = ebe.I;
   public static final ToIntFunction<eao> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<drg> a() {
      return a;
   }

   public drg(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C && $$3.gF()) {
         $$1.a($$2, $$0.a(c), 2);
         return bug.b;
      } else {
         return bug.c;
      }
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return $$3.a(czo.ig) ? ffo.b() : ffo.a();
   }

   @Override
   protected boolean e_(eao $$0) {
      return $$0.y().c();
   }

   @Override
   protected dsz a_(eao $$0) {
      return dsz.a;
   }

   @Override
   protected float c(eao $$0, din $$1, iv $$2) {
      return 1.0F;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(d) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static czk a(czk $$0, int $$1) {
      $$0.b(kk.aq, dbk.a.a(c, $$1));
      return $$0;
   }
}
