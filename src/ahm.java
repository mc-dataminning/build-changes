public class ahm implements zl<agl> {
   public static final zc<we, ahm> a = zl.a(ahm::a, ahm::new);
   private final int b;
   private final akt c;
   private final boolean d;

   public ahm(int $$0, czc<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private ahm(we $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zn<ahm> a() {
      return agj.bI;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public akt e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
