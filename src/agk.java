import javax.annotation.Nullable;

public class agk implements zr<acg> {
   public static final zi<wh, agk> a = zr.a(agk::a, agk::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final alp d;
   @Nullable
   private final aww e;

   public agk(@Nullable alp $$0, @Nullable aww $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private agk(wh $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(aww.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(wh $$0) {
      if (this.e != null) {
         if (this.d != null) {
            $$0.l(3);
            $$0.a(this.e);
            $$0.a(this.d);
         } else {
            $$0.l(1);
            $$0.a(this.e);
         }
      } else if (this.d != null) {
         $$0.l(2);
         $$0.a(this.d);
      } else {
         $$0.l(0);
      }
   }

   @Override
   public zt<agk> a() {
      return agz.aY;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   @Nullable
   public alp b() {
      return this.d;
   }

   @Nullable
   public aww e() {
      return this.e;
   }
}
