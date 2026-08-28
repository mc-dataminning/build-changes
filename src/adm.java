public class adm implements zb<abn> {
   public static final ys<vr, adm> a = zb.a(adm::a, adm::new);
   private final int b;
   private final akk c;

   public adm(int $$0, cyk<?> $$1) {
      this.b = $$0;
      this.c = $$1.a();
   }

   private adm(vr $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
   }

   private void a(vr $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<adm> a() {
      return afz.Y;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public akk b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
