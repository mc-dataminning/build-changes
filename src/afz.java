import javax.annotation.Nullable;

public class afz implements zk<abz> {
   public static final zb<wa, afz> a = zk.a(afz::a, afz::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final alc d;
   @Nullable
   private final awf e;

   public afz(@Nullable alc $$0, @Nullable awf $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afz(wa $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(awf.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(wa $$0) {
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
   public zm<afz> a() {
      return ago.aV;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   @Nullable
   public alc b() {
      return this.d;
   }

   @Nullable
   public awf e() {
      return this.e;
   }
}
