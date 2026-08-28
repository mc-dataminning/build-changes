import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class etn {
   private final List<etl> a;
   @Nullable
   private etn.a b;
   private int c;
   private final ji d;
   private final float e;
   private final boolean f;

   public etn(List<etl> $$0, ji $$1, boolean $$2) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$0.isEmpty() ? Float.MAX_VALUE : this.a.get(this.a.size() - 1).c(this.d);
      this.f = $$2;
   }

   public void a() {
      this.c++;
   }

   public boolean b() {
      return this.c <= 0;
   }

   public boolean c() {
      return this.c >= this.a.size();
   }

   @Nullable
   public etl d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public etl a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, etl $$1) {
      this.a.set($$0, $$1);
   }

   public int e() {
      return this.a.size();
   }

   public int f() {
      return this.c;
   }

   public void c(int $$0) {
      this.c = $$0;
   }

   public fba a(buk $$0, int $$1) {
      etl $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dr() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dr() + 1.0F)) * 0.5;
      return new fba($$3, $$4, $$5);
   }

   public ji d(int $$0) {
      return this.a.get($$0).a();
   }

   public fba a(buk $$0) {
      return this.a($$0, this.c);
   }

   public ji g() {
      return this.a.get(this.c).a();
   }

   public etl h() {
      return this.a.get(this.c);
   }

   @Nullable
   public etl i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable etn $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            etl $$2 = this.a.get($$1);
            etl $$3 = $$0.a.get($$1);
            if ($$2.a != $$3.a || $$2.b != $$3.b || $$2.c != $$3.c) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean j() {
      return this.f;
   }

   @bag
   void a(etl[] $$0, etl[] $$1, Set<etu> $$2) {
      this.b = new etn.a($$0, $$1, $$2);
   }

   @Nullable
   public etn.a k() {
      return this.b;
   }

   public void a(vl $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.q(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static etn b(vl $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      ji $$3 = $$0.e();
      List<etl> $$4 = $$0.a(etl::b);
      etn.a $$5 = etn.a.b($$0);
      etn $$6 = new etn($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public ji l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static etl[] c(vl $$0) {
      etl[] $$1 = new etl[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = etl.b($$0);
      }

      return $$1;
   }

   static void a(vl $$0, etl[] $$1) {
      $$0.c($$1.length);

      for (etl $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public etn n() {
      etn $$0 = new etn(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(etl[] a, etl[] b, Set<etu> c) {

      public void a(vl $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         etn.a($$0, this.a);
         etn.a($$0, this.b);
      }

      public static etn.a b(vl $$0) {
         HashSet<etu> $$1 = $$0.a(HashSet::new, etu::c);
         etl[] $$2 = etn.c($$0);
         etl[] $$3 = etn.c($$0);
         return new etn.a($$2, $$3, $$1);
      }
   }
}
