import java.util.List;
import javax.annotation.Nullable;

public class cjv extends cit implements chz {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cjv(cit.a $$0) {
      super($$0);
      cun.a(this, cgi.a);
   }

   @Override
   public String j(ciy $$0) {
      return cgr.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(ciy $$0, @Nullable cpm $$1, List<tf> $$2, ckp $$3) {
      cgo.a($$0, $$2);
   }

   @Override
   public ckr c(ciy $$0) {
      return ckr.d;
   }

   @Override
   public int b(ciy $$0) {
      return 72000;
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
      $$1.c($$2);
      return bgr.b($$3);
   }

   @Override
   public boolean a(ciy $$0, ciy $$1) {
      return $$1.a(apt.b) || super.a($$0, $$1);
   }

   public static chm d(ciy $$0) {
      qr $$1 = cgr.a($$0);
      return $$1 != null ? chm.a($$1.h("Base")) : chm.a;
   }

   @Override
   public bin g() {
      return bin.b;
   }
}
