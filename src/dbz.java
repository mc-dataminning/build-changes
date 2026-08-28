import java.util.ArrayList;
import java.util.List;

public class dbz implements dcr {
   public static final dbz a = new dbz(0, 0, List.of());
   private final int b;
   private final int c;
   private final List<cxy> d;
   private final cqn e = new cqn();
   private final int f;

   private dbz(int $$0, int $$1, List<cxy> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      int $$3 = 0;

      for (cxy $$4 : $$2) {
         if (!$$4.f()) {
            $$3++;
            this.e.a($$4, 1);
         }
      }

      this.f = $$3;
   }

   public static dbz a(int $$0, int $$1, List<cxy> $$2) {
      return b($$0, $$1, $$2).a();
   }

   public static dbz.a b(int $$0, int $$1, List<cxy> $$2) {
      if ($$0 != 0 && $$1 != 0) {
         int $$3 = $$0 - 1;
         int $$4 = 0;
         int $$5 = $$1 - 1;
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$1; $$7++) {
            boolean $$8 = true;

            for (int $$9 = 0; $$9 < $$0; $$9++) {
               cxy $$10 = $$2.get($$9 + $$7 * $$0);
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
            return dbz.a.a;
         } else if ($$11 == $$0 && $$12 == $$1) {
            return new dbz.a(new dbz($$0, $$1, $$2), $$3, $$5);
         } else {
            List<cxy> $$13 = new ArrayList<>($$11 * $$12);

            for (int $$14 = 0; $$14 < $$12; $$14++) {
               for (int $$15 = 0; $$15 < $$11; $$15++) {
                  int $$16 = $$15 + $$3 + ($$14 + $$5) * $$0;
                  $$13.add($$2.get($$16));
               }
            }

            return new dbz.a(new dbz($$11, $$12, $$13), $$3, $$5);
         }
      } else {
         return dbz.a.a;
      }
   }

   @Override
   public cxy a(int $$0) {
      return this.d.get($$0);
   }

   public cxy a(int $$0, int $$1) {
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

   public cqn c() {
      return this.e;
   }

   public List<cxy> d() {
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
         return !($$0 instanceof dbz $$1) ? false : this.b == $$1.b && this.c == $$1.c && this.f == $$1.f && cxy.a(this.d, $$1.d);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = cxy.a(this.d);
      $$0 = 31 * $$0 + this.b;
      return 31 * $$0 + this.c;
   }

   public static record a(dbz b, int c, int d) {
      public static final dbz.a a = new dbz.a(dbz.a, 0, 0);

      public dbz a() {
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
