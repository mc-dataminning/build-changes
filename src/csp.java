import java.util.List;
import javax.annotation.Nullable;

public class csp extends crn implements cqu {
   public static final int a = 5;
   public static final float b = 3.0F;

   public csp(crn.a $$0) {
      super($$0);
      dem.a(this, cph.a);
   }

   @Override
   public String i(crs $$0) {
      cql $$1 = $$0.a(jr.O);
      return $$1 != null ? this.a() + "." + $$1.b() : super.i($$0);
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      cpn.a($$0, $$2);
   }

   @Override
   public ctk c(crs $$0) {
      return ctk.d;
   }

   @Override
   public int b(crs $$0) {
      return 72000;
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      $$1.c($$2);
      return bog.b($$3);
   }

   @Override
   public boolean a(crs $$0, crs $$1) {
      return $$1.a(avm.b) || super.a($$0, $$1);
   }

   @Override
   public bqh k() {
      return bqh.b;
   }
}
