public class aho implements zb<afz> {
   public static final ys<wf, aho> a = zb.a(aho::a, aho::new);
   private final int b;
   private final csz c;

   public aho(int $$0, csz $$1) {
      this.b = $$0;
      this.c = $$1.r();
   }

   private aho(wf $$0) {
      this.b = $$0.readShort();
      this.c = csz.e.decode($$0);
   }

   private void a(wf $$0) {
      $$0.l(this.b);
      csz.e.encode($$0, this.c);
   }

   @Override
   public zd<aho> a() {
      return afx.bU;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public csz e() {
      return this.c;
   }
}
