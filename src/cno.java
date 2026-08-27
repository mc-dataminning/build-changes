import java.util.List;
import javax.annotation.Nullable;

public class cno extends cmm implements cls {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public cno(cmm.a $$0) {
      super($$0);
      cyo.a(this, ckb.a);
   }

   @Override
   public String j(cmr $$0) {
      return ckk.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
      ckh.a($$0, $$2);
   }

   @Override
   public cok c(cmr $$0) {
      return cok.d;
   }

   @Override
   public int b(cmr $$0) {
      return 72000;
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      $$1.c($$2);
      return bjw.b($$3);
   }

   @Override
   public boolean a(cmr $$0, cmr $$1) {
      return $$1.a(asj.b) || super.a($$0, $$1);
   }

   public static clf d(cmr $$0) {
      sl $$1 = ckk.a($$0);
      return $$1 != null ? clf.a($$1.h("Base")) : clf.a;
   }

   @Override
   public blu g() {
      return blu.b;
   }
}
