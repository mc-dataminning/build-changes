import java.util.List;
import javax.annotation.Nullable;

public class csg extends cre implements cql {
   public static final int a = 5;
   public static final float b = 3.0F;

   public csg(cre.a $$0) {
      super($$0);
      ded.a(this, coy.a);
   }

   @Override
   public String i(crj $$0) {
      cqc $$1 = $$0.a(jp.O);
      return $$1 != null ? this.a() + "." + $$1.b() : super.i($$0);
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      cpe.a($$0, $$2);
   }

   @Override
   public ctb c(crj $$0) {
      return ctb.d;
   }

   @Override
   public int b(crj $$0) {
      return 72000;
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      crj $$3 = $$1.b($$2);
      $$1.c($$2);
      return bob.b($$3);
   }

   @Override
   public boolean a(crj $$0, crj $$1) {
      return $$1.a(avk.b) || super.a($$0, $$1);
   }

   @Override
   public bqc k() {
      return bqc.b;
   }
}
