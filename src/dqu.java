import javax.annotation.Nullable;

public class dqu extends dpg implements dcp {
   private final daz a = new daz() {
      @Override
      public void a(dbx $$0, iz $$1, int $$2) {
         $$0.a($$1, dfa.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dbx $$0, iz $$1, dco $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dsb $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dqu(iz $$0, dsb $$1) {
      super(dpi.j, $$0, $$1);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dbx $$0, iz $$1, dsb $$2, dqu $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dbx $$0, iz $$1, dsb $$2, dqu $$3) {
      $$3.a.a((are)$$0, $$1);
   }

   public aco b() {
      return aco.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      ur $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsz<?> $$0, azg $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public daz c() {
      return this.a;
   }
}
