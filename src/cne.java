import java.util.List;
import javax.annotation.Nullable;

public class cne extends cmc implements cli {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cne(cmc.a $$0) {
      super($$0);
      cye.a(this, cjr.a);
   }

   @Override
   public String j(cmh $$0) {
      return cka.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      cjx.a($$0, $$2);
   }

   @Override
   public coa c(cmh $$0) {
      return coa.d;
   }

   @Override
   public int b(cmh $$0) {
      return 72000;
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      $$1.c($$2);
      return bjm.b($$3);
   }

   @Override
   public boolean a(cmh $$0, cmh $$1) {
      return $$1.a(arz.b) || super.a($$0, $$1);
   }

   public static ckv d(cmh $$0) {
      sj $$1 = cka.a($$0);
      return $$1 != null ? ckv.a($$1.h("Base")) : ckv.a;
   }

   @Override
   public blk g() {
      return blk.b;
   }
}
