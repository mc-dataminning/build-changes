import java.util.ArrayList;
import java.util.List;

public class dbs implements dck {
   public static final dbs a = new dbs(0, 0, List.of());
   private final int b;
   private final int c;
   private final List<cxp> d;
   private final cqc e = new cqc();
   private final int f;

   private dbs(int $$0, int $$1, List<cxp> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      int $$3 = 0;

      for (cxp $$4 : $$2) {
         if (!$$4.f()) {
            $$3++;
            this.e.a($$4, 1);
         }
      }

      this.f = $$3;
   }

   public static dbs a(int $$0, int $$1, List<cxp> $$2) {
      return b($$0, $$1, $$2).a();
   }

   public static dbs.a b(int $$0, int $$1, List<cxp> $$2) {
      if ($$0 != 0 && $$1 != 0) {
         int $$3 = $$0 - 1;
         int $$4 = 0;
         int $$5 = $$1 - 1;
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$1; $$7++) {
            boolean $$8 = true;

            for (int $$9 = 0; $$9 < $$0; $$9++) {
               cxp $$10 = $$2.get($$9 + $$7 * $$0);
               if (!$$10.f()) {
                  $$3 = Math.min($$3, $$9);
                  $$4 = Math.max($$4, $$9);
                  $$8 = false;
               }
            }

            if (!$$8) {
               $$5 = Math.min($$5, $$7);
               $$6 = Math.max($$6, $$7);
            }
         }

         int $$11 = $$4 - $$3 + 1;
         int $$12 = $$6 - $$5 + 1;
         if ($$11 <= 0 || $$12 <= 0) {
            return dbs.a.a;
         } else if ($$11 == $$0 && $$12 == $$1) {
            return new dbs.a(new dbs($$0, $$1, $$2), $$3, $$5);
         } else {
            List<cxp> $$13 = new ArrayList<>($$11 * $$12);

            for (int $$14 = 0; $$14 < $$12; $$14++) {
               for (int $$15 = 0; $$15 < $$11; $$15++) {
                  int $$16 = $$15 + $$3 + ($$14 + $$5) * $$0;
                  $$13.add($$2.get($$16));
               }
            }

            return new dbs.a(new dbs($$11, $$12, $$13), $$3, $$5);
         }
      } else {
         return dbs.a.a;
      }
   }

   @Override
   public cxp a(int $$0) {
      return this.d.get($$0);
   }

   public cxp a(int $$0, int $$1) {
      return this.d.get($$0 + $$1 * this.b);
   }

   @Override
   public int a() {
      return this.d.size();
   }

   @Override
   public boolean b() {
      return this.f == 0;
   }

   public cqc c() {
      return this.e;
   }

   public List<cxp> d() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public int f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof dbs $$1) ? false : this.b == $$1.b && this.c == $$1.c && this.f == $$1.f && cxp.a(this.d, $$1.d);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = cxp.a(this.d);
      $$0 = 31 * $$0 + this.b;
      return 31 * $$0 + this.c;
   }

   public static record a(dbs b, int c, int d) {
      public static final dbs.a a = new dbs.a(dbs.a, 0, 0);

      public dbs a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
