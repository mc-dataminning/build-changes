public class ahu implements ze<age> {
   public static final yv<wi, ahu> a = ze.a(ahu::a, ahu::new);
   private final int b;
   private final ctq c;

   public ahu(int $$0, ctq $$1) {
      this.b = $$0;
      this.c = $$1.s();
   }

   private ahu(wi $$0) {
      this.b = $$0.readShort();
      this.c = ctq.e.decode($$0);
   }

   private void a(wi $$0) {
      $$0.l(this.b);
      ctq.e.encode($$0, this.c);
   }

   @Override
   public zg<ahu> a() {
      return agc.bW;
   }

   public void a(age $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ctq e() {
      return this.c;
   }
}
