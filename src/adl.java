public class adl implements zb<abn> {
   public static final ys<vr, adl> a = zb.a(adl::a, adl::new);
   private final ja b;
   private final boolean c;

   public adl(ja $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private adl(vr $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<adl> a() {
      return afz.X;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public ja b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
