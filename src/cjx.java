import java.util.List;
import javax.annotation.Nullable;

public class cjx extends civ implements cib {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cjx(civ.a $$0) {
      super($$0);
      cur.a(this, cgk.a);
   }

   @Override
   public String j(cja $$0) {
      return cgt.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      cgq.a($$0, $$2);
   }

   @Override
   public ckt c(cja $$0) {
      return ckt.d;
   }

   @Override
   public int b(cja $$0) {
      return 72000;
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      $$1.c($$2);
      return bgu.b($$3);
   }

   @Override
   public boolean a(cja $$0, cja $$1) {
      return $$1.a(apw.b) || super.a($$0, $$1);
   }

   public static cho d(cja $$0) {
      qu $$1 = cgt.a($$0);
      return $$1 != null ? cho.a($$1.h("Base")) : cho.a;
   }

   @Override
   public biq g() {
      return biq.b;
   }
}
