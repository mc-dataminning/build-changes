import javax.annotation.Nullable;

public class afq implements zf<abt> {
   public static final yw<vv, afq> a = zf.a(afq::a, afq::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final akq d;
   @Nullable
   private final avp e;

   public afq(@Nullable akq $$0, @Nullable avp $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afq(vv $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(avp.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vv $$0) {
      if (this.e != null) {
         if (this.d != null) {
            $$0.k(3);
            $$0.a(this.e);
            $$0.a(this.d);
         } else {
            $$0.k(1);
            $$0.a(this.e);
         }
      } else if (this.d != null) {
         $$0.k(2);
         $$0.a(this.d);
      } else {
         $$0.k(0);
      }
   }

   @Override
   public zh<afq> a() {
      return agf.aU;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   @Nullable
   public akq b() {
      return this.d;
   }

   @Nullable
   public avp e() {
      return this.e;
   }
}
