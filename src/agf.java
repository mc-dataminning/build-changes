import javax.annotation.Nullable;

public class agf implements zq<acf> {
   public static final zh<wg, agf> a = zq.a(agf::a, agf::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final alj d;
   @Nullable
   private final awo e;

   public agf(@Nullable alj $$0, @Nullable awo $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private agf(wg $$0) {
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

   private void a(wg $$0) {
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
   public zs<agf> a() {
      return agu.aV;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   @Nullable
   public alj b() {
      return this.d;
   }

   @Nullable
   public awo e() {
      return this.e;
   }
}
