import java.util.List;

public abstract class dul {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dgh var1, ji var2, dww var3);

   protected abstract void b(dgh var1, ji var2, dww var3);

   protected abstract void a(dgh var1, ji var2, dww var3, int var4, int var5);

   protected abstract boolean a(cow var1);

   public void a(cow $$0, dgh $$1, ji $$2, dww $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, ebs.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gL(), this.c);
   }

   public void b(cow $$0, dgh $$1, ji $$2, dww $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, ebs.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<cow> a(dgh $$0, ji $$1) {
      double $$2 = this.c + 4.0;
      fau $$3 = new fau($$1).g($$2);
      return $$0.a(ebg.a(cow.class), $$3, this::a);
   }

   public void c(dgh $$0, ji $$1, dww $$2) {
      List<cow> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (cow $$4 : $$3) {
         this.c = Math.max($$4.gL(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, ebs.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, ebs.j, $$1);
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

   private static void d(dgh $$0, ji $$1, dww $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
