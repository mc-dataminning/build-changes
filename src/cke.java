import java.util.List;
import javax.annotation.Nullable;

public class cke extends cjc implements cii {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cke(cjc.a $$0) {
      super($$0);
      cuy.a(this, cgr.a);
   }

   @Override
   public String j(cjh $$0) {
      return cha.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      cgx.a($$0, $$2);
   }

   @Override
   public cla c(cjh $$0) {
      return cla.d;
   }

   @Override
   public int b(cjh $$0) {
      return 72000;
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      $$1.c($$2);
      return bhb.b($$3);
   }

   @Override
   public boolean a(cjh $$0, cjh $$1) {
      return $$1.a(aqc.b) || super.a($$0, $$1);
   }

   public static chv d(cjh $$0) {
      qy $$1 = cha.a($$0);
      return $$1 != null ? chv.a($$1.h("Base")) : chv.a;
   }

   @Override
   public bix g() {
      return bix.b;
   }
}
