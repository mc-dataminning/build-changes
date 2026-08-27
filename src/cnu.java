import java.util.List;
import javax.annotation.Nullable;

public class cnu extends cms implements cly {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cnu(cms.a $$0) {
      super($$0);
      cyu.a(this, ckh.a);
   }

   @Override
   public String j(cmx $$0) {
      return ckq.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
      ckn.a($$0, $$2);
   }

   @Override
   public cor c(cmx $$0) {
      return cor.d;
   }

   @Override
   public int b(cmx $$0) {
      return 72000;
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      cmx $$3 = $$1.b($$2);
      $$1.c($$2);
      return bkb.b($$3);
   }

   @Override
   public boolean a(cmx $$0, cmx $$1) {
      return $$1.a(aso.b) || super.a($$0, $$1);
   }

   public static cll d(cmx $$0) {
      sn $$1 = ckq.a($$0);
      return $$1 != null ? cll.a($$1.h("Base")) : cll.a;
   }

   @Override
   public blz g() {
      return blz.b;
   }
}
