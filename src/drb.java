import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class drb extends dvy implements dtt {
   public static final MapCodec<drb> a = b(drb::new);
   public static final ebm<jb> b = ebe.T;
   private final Function<eao, ffr> c;

   public drb(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(this.c(), Integer.valueOf(1)));
      this.c = this.q();
   }

   private Function<eao, ffr> q() {
      return this.a(this.a(b, this.c()));
   }

   @Override
   protected MapCodec<drb> a() {
      return a;
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
      return this.a($$0, $$1, this.c()) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return a($$1, $$2.e(), jb.b);
   }

   @Override
   public ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.c.apply($$0);
   }

   @Override
   public eao a(ddd $$0) {
      return this.a($$0, this, this.c(), b);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, this.c());
   }
}
