import javax.annotation.Nullable;

public class afx implements zf<abu> {
   public static final yw<vu, afx> a = zf.a(afx::a, afx::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final alg d;
   @Nullable
   private final awo e;

   public afx(@Nullable alg $$0, @Nullable awo $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afx(vu $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(awo.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vu $$0) {
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
   public zh<afx> a() {
      return agn.aY;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   @Nullable
   public alg b() {
      return this.d;
   }

   @Nullable
   public awo e() {
      return this.e;
   }
}
