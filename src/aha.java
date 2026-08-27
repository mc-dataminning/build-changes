public class aha implements yn<afl> {
   public static final ye<vr, aha> a = yn.a(aha::a, aha::new);
   private final int b;
   private final crj c;

   public aha(int $$0, crj $$1) {
      this.b = $$0;
      this.c = $$1.r();
   }

   private aha(vr $$0) {
      this.b = $$0.readShort();
      this.c = crj.e.decode($$0);
   }

   private void a(vr $$0) {
      $$0.l(this.b);
      crj.e.encode($$0, this.c);
   }

   @Override
   public yp<aha> a() {
      return afj.bU;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public crj e() {
      return this.c;
   }
}
