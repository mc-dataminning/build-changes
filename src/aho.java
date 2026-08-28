public class aho implements zd<agn> {
   public static final yu<vs, aho> a = zd.a(aho::a, aho::new);
   private final boolean b;
   private final boolean c;

   public aho(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aho(vs $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   @Override
   public zf<aho> a() {
      return agl.bN;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
