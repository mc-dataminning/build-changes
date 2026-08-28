import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dpr extends dvy implements dmp, dtt {
   public static final MapCodec<dpr> a = b(dpr::new);
   public static final ebm<jb> b = ebe.T;
   public static final ebo c = ebe.U;
   private final Function<eao, ffr> g;

   @Override
   public MapCodec<dpr> a() {
      return a;
   }

   protected dpr(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Integer.valueOf(1)));
      this.g = this.q();
   }

   private Function<eao, ffr> q() {
      return this.a(this.a(b, c));
   }

   @Override
   public eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(eao $$0, ddd $$1) {
      return this.a($$0, $$1, c) ? true : super.a($$0, $$1);
   }

   @Override
   public ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.g.apply($$0);
   }

   @Override
   public double b() {
      return 3.0;
   }

   @Override
   public ebo c() {
      return c;
   }

   @Override
   public eao a(ddd $$0) {
      return this.a($$0, this, c, b);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return true;
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      int $$4 = $$3.c(c);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(c, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new czk(this));
      }
   }
}
