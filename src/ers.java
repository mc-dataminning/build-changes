import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ers {
   private final List<erq> a;
   @Nullable
   private ers.a b;
   private int c;
   private final jg d;
   private final float e;
   private final boolean f;

   public ers(List<erq> $$0, jg $$1, boolean $$2) {
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
   public erq d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public erq a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, erq $$1) {
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

   public ezh a(btz $$0, int $$1) {
      erq $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.ds() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.ds() + 1.0F)) * 0.5;
      return new ezh($$3, $$4, $$5);
   }

   public jg d(int $$0) {
      return this.a.get($$0).a();
   }

   public ezh a(btz $$0) {
      return this.a($$0, this.c);
   }

   public jg g() {
      return this.a.get(this.c).a();
   }

   public erq h() {
      return this.a.get(this.c);
   }

   @Nullable
   public erq i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable ers $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            erq $$2 = this.a.get($$1);
            erq $$3 = $$0.a.get($$1);
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

   @bap
   void a(erq[] $$0, erq[] $$1, Set<erz> $$2) {
      this.b = new ers.a($$0, $$1, $$2);
   }

   @Nullable
   public ers.a k() {
      return this.b;
   }

   public void a(we $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.q(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static ers b(we $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      jg $$3 = $$0.e();
      List<erq> $$4 = $$0.a(erq::b);
      ers.a $$5 = ers.a.b($$0);
      ers $$6 = new ers($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public jg l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static erq[] c(we $$0) {
      erq[] $$1 = new erq[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = erq.b($$0);
      }

      return $$1;
   }

   static void a(we $$0, erq[] $$1) {
      $$0.c($$1.length);

      for (erq $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public ers n() {
      ers $$0 = new ers(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(erq[] a, erq[] b, Set<erz> c) {

      public void a(we $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         ers.a($$0, this.a);
         ers.a($$0, this.b);
      }

      public static ers.a b(we $$0) {
         HashSet<erz> $$1 = $$0.a(HashSet::new, erz::c);
         erq[] $$2 = ers.c($$0);
         erq[] $$3 = ers.c($$0);
         return new ers.a($$2, $$3, $$1);
      }
   }
}
