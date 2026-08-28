import javax.annotation.Nullable;

public class afr implements zg<abu> {
   public static final yx<vw, afr> a = zg.a(afr::a, afr::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final akr d;
   @Nullable
   private final avq e;

   public afr(@Nullable akr $$0, @Nullable avq $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private afr(vw $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(avq.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(vw $$0) {
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
   public zi<afr> a() {
      return agg.aU;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   @Nullable
   public akr b() {
      return this.d;
   }

   @Nullable
   public avq e() {
      return this.e;
   }
}
