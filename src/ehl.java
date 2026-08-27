import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ehl {
   private final List<ehj> a;
   @Nullable
   private ehl.a b;
   private int c;
   private final hz d;
   private final float e;
   private final boolean f;

   public ehl(List<ehj> $$0, hz $$1, boolean $$2) {
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
   public ehj d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public ehj a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, ehj $$1) {
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

   public enz a(bnq $$0, int $$1) {
      ehj $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dg() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dg() + 1.0F)) * 0.5;
      return new enz($$3, $$4, $$5);
   }

   public hz d(int $$0) {
      return this.a.get($$0).a();
   }

   public enz a(bnq $$0) {
      return this.a($$0, this.c);
   }

   public hz g() {
      return this.a.get(this.c).a();
   }

   public ehj h() {
      return this.a.get(this.c);
   }

   @Nullable
   public ehj i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable ehl $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            ehj $$2 = this.a.get($$1);
            ehj $$3 = $$0.a.get($$1);
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

   @axl
   void a(ehj[] $$0, ehj[] $$1, Set<ehp> $$2) {
      this.b = new ehl.a($$0, $$1, $$2);
   }

   @Nullable
   public ehl.a k() {
      return this.b;
   }

   public void a(uq $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.p(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static ehl b(uq $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      hz $$3 = $$0.e();
      List<ehj> $$4 = $$0.a(ehj::b);
      ehl.a $$5 = ehl.a.b($$0);
      ehl $$6 = new ehl($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public hz l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static ehj[] c(uq $$0) {
      ehj[] $$1 = new ehj[$$0.n()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = ehj.b($$0);
      }

      return $$1;
   }

   static void a(uq $$0, ehj[] $$1) {
      $$0.c($$1.length);

      for (ehj $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public ehl n() {
      ehl $$0 = new ehl(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(ehj[] a, ehj[] b, Set<ehp> c) {

      public void a(uq $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         ehl.a($$0, this.a);
         ehl.a($$0, this.b);
      }

      public static ehl.a b(uq $$0) {
         HashSet<ehp> $$1 = $$0.a(HashSet::new, ehp::c);
         ehj[] $$2 = ehl.c($$0);
         ehj[] $$3 = ehl.c($$0);
         return new ehl.a($$2, $$3, $$1);
      }
   }
}
