import java.util.List;
import javax.annotation.Nullable;

public class cju extends cis implements chy {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cju(cis.a $$0) {
      super($$0);
      cum.a(this, cgh.a);
   }

   @Override
   public String j(cix $$0) {
      return cgq.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      cgn.a($$0, $$2);
   }

   @Override
   public ckq c(cix $$0) {
      return ckq.d;
   }

   @Override
   public int b(cix $$0) {
      return 72000;
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      cix $$3 = $$1.b($$2);
      $$1.c($$2);
      return bgr.b($$3);
   }

   @Override
   public boolean a(cix $$0, cix $$1) {
      return $$1.a(apt.b) || super.a($$0, $$1);
   }

   public static chl d(cix $$0) {
      qr $$1 = cgq.a($$0);
      return $$1 != null ? chl.a($$1.h("Base")) : chl.a;
   }

   @Override
   public bin g() {
      return bin.b;
   }
}
