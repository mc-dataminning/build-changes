public class acl implements zo<acd> {
   public static final zf<ws, acl> a = zo.a(acl::a, acl::new);
   private final jg b;
   private final int c;
   private final int d;
   private final dhy e;

   public acl(jg $$0, dhy $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acl(ws $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = zd.a(ly.f).decode($$0);
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      zd.a(ly.f).encode($$0, this.e);
   }

   @Override
   public zq<acl> a() {
      return ags.j;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public jg b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dhy g() {
      return this.e;
   }
}
