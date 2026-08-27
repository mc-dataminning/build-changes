import java.util.List;
import javax.annotation.Nullable;

public class cqn extends cpl implements cos {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cqn(cpl.a $$0) {
      super($$0);
      dbk.a(this, cnc.a);
   }

   @Override
   public String j(cpq $$0) {
      return cnl.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      cni.a($$0, $$2);
   }

   @Override
   public crj c(cpq $$0) {
      return crj.d;
   }

   @Override
   public int b(cpq $$0) {
      return 72000;
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      $$1.c($$2);
      return bmm.b($$3);
   }

   @Override
   public boolean a(cpq $$0, cpq $$1) {
      return $$1.a(aum.b) || super.a($$0, $$1);
   }

   public static cog d(cpq $$0) {
      sy $$1 = cnl.a($$0);
      return $$1 != null ? cog.a($$1.h("Base")) : cog.a;
   }

   @Override
   public bom i() {
      return bom.b;
   }
}
