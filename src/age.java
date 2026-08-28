import javax.annotation.Nullable;

public class age implements zp<ace> {
   public static final zg<wf, age> a = zp.a(age::a, age::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final ali d;
   @Nullable
   private final awm e;

   public age(@Nullable ali $$0, @Nullable awm $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private age(wf $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(awm.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(wf $$0) {
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
   public zr<age> a() {
      return agt.aV;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   @Nullable
   public ali b() {
      return this.d;
   }

   @Nullable
   public awm e() {
      return this.e;
   }
}
