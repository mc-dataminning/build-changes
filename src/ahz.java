public class ahz implements zp<agv> {
   public static final zg<wf, ahz> a = zp.a(ahz::a, ahz::new);
   private static final int b = 2;
   private final boolean c;

   public ahz(coi $$0) {
      this.c = $$0.b;
   }

   private ahz(wf $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(wf $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public zr<ahz> a() {
      return agt.bM;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
