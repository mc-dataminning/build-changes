public class ace implements zd<abs> {
   public static final yu<vs, ace> a = zd.a(ace::a, ace::new);
   private final btv b;
   private final boolean c;

   public ace(btv $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ace(vs $$0) {
      this.b = btv.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zf<ace> a() {
      return agl.l;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public btv e() {
      return this.b;
   }
}
