public class ahz implements zs<agy> {
   public static final zj<wi, ahz> a = zs.a(ahz::a, ahz::new);
   private final boolean b;
   private final boolean c;

   public ahz(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahz(wi $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agy $$0) {
      $$0.a(this);
   }

   @Override
   public zu<ahz> a() {
      return agw.bJ;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
