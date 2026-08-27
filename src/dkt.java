import java.util.List;

public abstract class dkt {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(cwz var1, ib var2, dmz var3);

   protected abstract void b(cwz var1, ib var2, dmz var3);

   protected abstract void a(cwz var1, ib var2, dmz var3, int var4, int var5);

   protected abstract boolean a(cis var1);

   public void a(cis $$0, cwz $$1, ib $$2, dmz $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, drn.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gz(), this.c);
   }

   public void b(cis $$0, cwz $$1, ib $$2, dmz $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, drn.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cis> a(cwz $$0, ib $$1) {
      double $$2 = this.c + 4.0;
      epm $$3 = new epm($$1).g($$2);
      return $$0.a(drb.a(cis.class), $$3, this::a);
   }

   public void c(cwz $$0, ib $$1, dmz $$2) {
      List<cis> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cis $$4 : $$3) {
         this.c = Math.max($$4.gz(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, drn.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, drn.j, $$1);
         }

         this.b = $$5;
      }

      this.a($$0, $$1, $$2, $$6, $$5);
      if ($$5 > 0) {
         d($$0, $$1, $$2);
      }
   }

   public int a() {
      return this.b;
   }

   private static void d(cwz $$0, ib $$1, dmz $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
