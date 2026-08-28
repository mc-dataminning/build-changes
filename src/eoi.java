import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eoi {
   private final List<eog> a;
   @Nullable
   private eoi.a b;
   private int c;
   private final iz d;
   private final float e;
   private final boolean f;

   public eoi(List<eog> $$0, iz $$1, boolean $$2) {
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
   public eog d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public eog a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, eog $$1) {
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

   public evq a(bst $$0, int $$1) {
      eog $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dj() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dj() + 1.0F)) * 0.5;
      return new evq($$3, $$4, $$5);
   }

   public iz d(int $$0) {
      return this.a.get($$0).a();
   }

   public evq a(bst $$0) {
      return this.a($$0, this.c);
   }

   public iz g() {
      return this.a.get(this.c).a();
   }

   public eog h() {
      return this.a.get(this.c);
   }

   @Nullable
   public eog i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable eoi $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            eog $$2 = this.a.get($$1);
            eog $$3 = $$0.a.get($$1);
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

   @bac
   void a(eog[] $$0, eog[] $$1, Set<eop> $$2) {
      this.b = new eoi.a($$0, $$1, $$2);
   }

   @Nullable
   public eoi.a k() {
      return this.b;
   }

   public void a(wl $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.p(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static eoi b(wl $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      iz $$3 = $$0.e();
      List<eog> $$4 = $$0.a(eog::b);
      eoi.a $$5 = eoi.a.b($$0);
      eoi $$6 = new eoi($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public iz l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static eog[] c(wl $$0) {
      eog[] $$1 = new eog[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = eog.b($$0);
      }

      return $$1;
   }

   static void a(wl $$0, eog[] $$1) {
      $$0.c($$1.length);

      for (eog $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public eoi n() {
      eoi $$0 = new eoi(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(eog[] a, eog[] b, Set<eop> c) {

      public void a(wl $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         eoi.a($$0, this.a);
         eoi.a($$0, this.b);
      }

      public static eoi.a b(wl $$0) {
         HashSet<eop> $$1 = $$0.a(HashSet::new, eop::c);
         eog[] $$2 = eoi.c($$0);
         eog[] $$3 = eoi.c($$0);
         return new eoi.a($$2, $$3, $$1);
      }
   }
}
