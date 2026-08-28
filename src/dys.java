import java.util.List;

public abstract class dys {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(djz var1, iw var2, ebg var3);

   protected abstract void b(djz var1, iw var2, ebg var3);

   protected abstract void a(djz var1, iw var2, ebg var3, int var4, int var5);

   protected abstract boolean a(crz var1);

   public void a(crz $$0, djz $$1, iw $$2, ebg $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, egg.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gL(), this.c);
   }

   public void b(crz $$0, djz $$1, iw $$2, ebg $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, egg.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<crz> a(djz $$0, iw $$1) {
      double $$2 = this.c + 4.0;
      ffn $$3 = new ffn($$1).g($$2);
      return $$0.a(efs.a(crz.class), $$3, this::a);
   }

   public void c(djz $$0, iw $$1, ebg $$2) {
      List<crz> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (crz $$4 : $$3) {
         this.c = Math.max($$4.gL(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, egg.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, egg.j, $$1);
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

   private static void d(djz $$0, iw $$1, ebg $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
