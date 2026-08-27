public class ahk implements zl<agl> {
   public static final zc<we, ahk> a = zl.a(ahk::a, ahk::new);
   private final boolean b;
   private final boolean c;

   public ahk(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahk(we $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   @Override
   public zn<ahk> a() {
      return agj.bG;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
