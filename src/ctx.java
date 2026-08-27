import java.util.List;
import javax.annotation.Nullable;

public class ctx extends csu implements csb {
   public static final int a = 5;
   public static final float b = 3.0F;

   public ctx(csu.a $$0) {
      super($$0);
      dfj.a(this, cqo.a);
   }

   @Override
   public String i(csz $$0) {
      crs $$1 = $$0.a(ka.V);
      return $$1 != null ? this.a() + "." + $$1.b() : super.i($$0);
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      cqu.a($$0, $$2);
   }

   @Override
   public cus c(csz $$0) {
      return cus.d;
   }

   @Override
   public int b(csz $$0) {
      return 72000;
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      $$1.c($$2);
      return bpn.b($$3);
   }

   @Override
   public boolean a(csz $$0, csz $$1) {
      return $$1.a(avz.b) || super.a($$0, $$1);
   }

   @Override
   public bro k() {
      return bro.b;
   }
}
