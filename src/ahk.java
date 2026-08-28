public class ahk implements zg<agi> {
   public static final yx<vw, ahk> a = zg.a(ahk::a, ahk::new);
   private final int b;
   private final akr c;
   private final boolean d;

   public ahk(int $$0, czb<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private ahk(vw $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(vw $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zi<ahk> a() {
      return agg.bI;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public akr e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
