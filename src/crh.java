import java.util.List;
import javax.annotation.Nullable;

public class crh extends cqf implements cpm {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public crh(cqf.a $$0) {
      super($$0);
      dcf.a(this, cnw.a);
   }

   @Override
   public String j(cqk $$0) {
      return cof.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cqk $$0, @Nullable cwz $$1, List<vu> $$2, csb $$3) {
      coc.a($$0, $$2);
   }

   @Override
   public csd c(cqk $$0) {
      return csd.d;
   }

   @Override
   public int b(cqk $$0) {
      return 72000;
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      $$1.c($$2);
      return bnd.b($$3);
   }

   @Override
   public boolean a(cqk $$0, cqk $$1) {
      return $$1.a(auv.b) || super.a($$0, $$1);
   }

   public static cpb d(cqk $$0) {
      ta $$1 = cof.a($$0);
      return $$1 != null ? cpb.a($$1.h("Base")) : cpb.a;
   }

   @Override
   public bpd i() {
      return bpd.b;
   }
}
