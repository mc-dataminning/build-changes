import javax.annotation.Nullable;

public class aga implements zl<aca> {
   public static final zc<wb, aga> a = zl.a(aga::a, aga::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final ale d;
   @Nullable
   private final awh e;

   public aga(@Nullable ale $$0, @Nullable awh $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private aga(wb $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(awh.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(wb $$0) {
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
   public zn<aga> a() {
      return agp.aV;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   @Nullable
   public ale b() {
      return this.d;
   }

   @Nullable
   public awh e() {
      return this.e;
   }
}
