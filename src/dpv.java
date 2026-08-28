import java.util.List;

public abstract class dpv {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dbz var1, iz var2, dsd var3);

   protected abstract void b(dbz var1, iz var2, dsd var3);

   protected abstract void a(dbz var1, iz var2, dsd var3, int var4, int var5);

   protected abstract boolean a(cmy var1);

   public void a(cmy $$0, dbz $$1, iz $$2, dsd $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dww.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gC(), this.c);
   }

   public void b(cmy $$0, dbz $$1, iz $$2, dsd $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dww.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cmy> a(dbz $$0, iz $$1) {
      double $$2 = this.c + 4.0;
      evn $$3 = new evn($$1).g($$2);
      return $$0.a(dwk.a(cmy.class), $$3, this::a);
   }

   public void c(dbz $$0, iz $$1, dsd $$2) {
      List<cmy> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cmy $$4 : $$3) {
         this.c = Math.max($$4.gC(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dww.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dww.j, $$1);
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

   private static void d(dbz $$0, iz $$1, dsd $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
