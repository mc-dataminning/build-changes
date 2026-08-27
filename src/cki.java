import java.util.List;
import javax.annotation.Nullable;

public class cki extends cjg implements cim {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cki(cjg.a $$0) {
      super($$0);
      cvf.a(this, cgv.a);
   }

   @Override
   public String j(cjl $$0) {
      return che.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
      chb.a($$0, $$2);
   }

   @Override
   public cle c(cjl $$0) {
      return cle.d;
   }

   @Override
   public int b(cjl $$0) {
      return 72000;
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      $$1.c($$2);
      return bhf.b($$3);
   }

   @Override
   public boolean a(cjl $$0, cjl $$1) {
      return $$1.a(aqd.b) || super.a($$0, $$1);
   }

   public static chz d(cjl $$0) {
      qw $$1 = che.a($$0);
      return $$1 != null ? chz.a($$1.h("Base")) : chz.a;
   }

   @Override
   public bjb g() {
      return bjb.b;
   }
}
