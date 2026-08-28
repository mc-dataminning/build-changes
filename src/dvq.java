import javax.annotation.Nullable;

public class dvq extends dtz implements dhd {
   private final dfj a = new dfj() {
      @Override
      public void a(dgi $$0, ji $$1, int $$2) {
         $$0.a($$1, djo.cA, $$2, 0);
      }

      @Override
      public void a(@Nullable dgi $$0, ji $$1, dhc $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dwx $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dvq(ji $$0, dwx $$1) {
      super(dub.j, $$0, $$1);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dgi $$0, ji $$1, dwx $$2, dvq $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dgi $$0, ji $$1, dwx $$2, dvq $$3) {
      $$3.a.a((arc)$$0, $$1);
   }

   public abr b() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      tq $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(bur<?> $$0, azh $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public dfj c() {
      return this.a;
   }
}
