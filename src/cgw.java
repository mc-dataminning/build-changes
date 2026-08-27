import java.util.List;
import javax.annotation.Nullable;

public class cgw extends cfu implements cfa {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cgw(cfu.a $$0) {
      super($$0);
      cro.a(this, cdj.a);
   }

   @Override
   public String j(cfz $$0) {
      return cds.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
      cdp.a($$0, $$2);
   }

   @Override
   public chs c(cfz $$0) {
      return chs.d;
   }

   @Override
   public int b(cfz $$0) {
      return 72000;
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      cfz $$3 = $$1.b($$2);
      $$1.c($$2);
      return bdy.b($$3);
   }

   @Override
   public boolean a(cfz $$0, cfz $$1) {
      return $$1.a(ane.b) || super.a($$0, $$1);
   }

   public static cen d(cfz $$0) {
      qr $$1 = cds.a($$0);
      return $$1 != null ? cen.a($$1.h("Base")) : cen.a;
   }

   @Override
   public bfo g() {
      return bfo.b;
   }
}
