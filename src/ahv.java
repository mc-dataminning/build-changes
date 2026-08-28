public class ahv implements zo<agu> {
   public static final zf<we, ahv> a = zo.a(ahv::a, ahv::new);
   private final boolean b;
   private final boolean c;

   public ahv(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahv(we $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   @Override
   public zq<ahv> a() {
      return ags.bJ;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
