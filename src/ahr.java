public class ahr implements zc<agm> {
   public static final yt<vr, ahr> a = zc.a(ahr::a, ahr::new);
   private static final int b = 2;
   private final boolean c;

   public ahr(cqe $$0) {
      this.c = $$0.b;
   }

   private ahr(vr $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vr $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public ze<ahr> a() {
      return agk.bR;
   }

   public void a(agm $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
