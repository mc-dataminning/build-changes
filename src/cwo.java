import java.util.List;

public class cwo extends cvg implements cun {
   public static final int a = 5;
   public static final float b = 3.0F;

   public cwo(cvg.a $$0) {
      super($$0);
      dja.a(this, ctc.a);
   }

   @Override
   public String d_(cvl $$0) {
      cue $$1 = $$0.a(kr.ab);
      return $$1 != null ? this.a() + "." + $$1.b() : super.d_($$0);
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      cti.a($$0, $$2);
   }

   @Override
   public cxh b(cvl $$0) {
      return cxh.d;
   }

   @Override
   public int a(cvl $$0, buf $$1) {
      return 72000;
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      $$1.c($$2);
      return brk.c;
   }

   @Override
   public btr m() {
      return btr.b;
   }
}
