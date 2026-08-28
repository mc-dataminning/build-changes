import java.util.List;

public abstract class dxl {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(div var1, iu var2, dzz var3);

   protected abstract void b(div var1, iu var2, dzz var3);

   protected abstract void a(div var1, iu var2, dzz var3, int var4, int var5);

   protected abstract boolean a(cqy var1);

   public void a(cqy $$0, div $$1, iu $$2, dzz $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, eez.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gK(), this.c);
   }

   public void b(cqy $$0, div $$1, iu $$2, dzz $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, eez.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cqy> a(div $$0, iu $$1) {
      double $$2 = this.c + 4.0;
      fed $$3 = new fed($$1).g($$2);
      return $$0.a(eel.a(cqy.class), $$3, this::a);
   }

   public void c(div $$0, iu $$1, dzz $$2) {
      List<cqy> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cqy $$4 : $$3) {
         this.c = Math.max($$4.gK(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, eez.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, eez.j, $$1);
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

   private static void d(div $$0, iu $$1, dzz $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
