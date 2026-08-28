import javax.annotation.Nullable;

public class dzu extends dyc implements dks {
   private final dix a = new dix() {
      @Override
      public void a(djx $$0, iv $$1, int $$2) {
         $$0.a($$1, dne.cD, $$2, 0);
      }

      @Override
      public void a(@Nullable djx $$0, iv $$1, dkr $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            ebe $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 260);
         }
      }
   };

   public dzu(iv $$0, ebe $$1) {
      super(dye.j, $$0, $$1);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dzu $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(djx $$0, iv $$1, ebe $$2, dzu $$3) {
      $$3.a.a((ars)$$0, $$1);
   }

   public acc a() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      tz $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(bxc<?> $$0, azx $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dix c() {
      return this.a;
   }
}
