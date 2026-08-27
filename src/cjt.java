import java.util.List;
import javax.annotation.Nullable;

public class cjt extends cir implements chx {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cjt(cir.a $$0) {
      super($$0);
      cul.a(this, cgg.a);
   }

   @Override
   public String j(ciw $$0) {
      return cgp.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      cgm.a($$0, $$2);
   }

   @Override
   public ckp c(ciw $$0) {
      return ckp.d;
   }

   @Override
   public int b(ciw $$0) {
      return 72000;
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      $$1.c($$2);
      return bgp.b($$3);
   }

   @Override
   public boolean a(ciw $$0, ciw $$1) {
      return $$1.a(apr.b) || super.a($$0, $$1);
   }

   public static chk d(ciw $$0) {
      qs $$1 = cgp.a($$0);
      return $$1 != null ? chk.a($$1.h("Base")) : chk.a;
   }

   @Override
   public bil g() {
      return bil.b;
   }
}
