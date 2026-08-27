import java.util.List;
import javax.annotation.Nullable;

public class cqa extends coy implements coe {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cqa(coy.a $$0) {
      super($$0);
      dax.a(this, cmn.a);
   }

   @Override
   public String j(cpd $$0) {
      return cmw.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      cmt.a($$0, $$2);
   }

   @Override
   public cqw c(cpd $$0) {
      return cqw.d;
   }

   @Override
   public int b(cpd $$0) {
      return 72000;
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      $$1.c($$2);
      return blx.b($$3);
   }

   @Override
   public boolean a(cpd $$0, cpd $$1) {
      return $$1.a(aui.b) || super.a($$0, $$1);
   }

   public static cnr d(cpd $$0) {
      sw $$1 = cmw.a($$0);
      return $$1 != null ? cnr.a($$1.h("Base")) : cnr.a;
   }

   @Override
   public bnx g() {
      return bnx.b;
   }
}
