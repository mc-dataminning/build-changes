public class acl implements zw<aci> {
   public static final zn<wm, acl> a = zw.a(acl::a, acl::new);
   public static final int b = 0;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public acl(bsv $$0, int $$1) {
      this.g = $$0.al();
      this.h = $$1;
   }

   private acl(wm $$0) {
      this.g = $$0.l();
      this.h = $$0.readUnsignedByte();
   }

   private void a(wm $$0) {
      $$0.c(this.g);
      $$0.k(this.h);
   }

   @Override
   public zy<acl> a() {
      return agu.e;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
