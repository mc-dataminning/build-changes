import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class emf {
   private final List<emd> a;
   @Nullable
   private emf.a b;
   private int c;
   private final im d;
   private final float e;
   private final boolean f;

   public emf(List<emd> $$0, im $$1, boolean $$2) {
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
   public emd d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public emd a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, emd $$1) {
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

   public etf a(bql $$0, int $$1) {
      emd $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dh() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dh() + 1.0F)) * 0.5;
      return new etf($$3, $$4, $$5);
   }

   public im d(int $$0) {
      return this.a.get($$0).a();
   }

   public etf a(bql $$0) {
      return this.a($$0, this.c);
   }

   public im g() {
      return this.a.get(this.c).a();
   }

   public emd h() {
      return this.a.get(this.c);
   }

   @Nullable
   public emd i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable emf $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            emd $$2 = this.a.get($$1);
            emd $$3 = $$0.a.get($$1);
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

   @ayz
   void a(emd[] $$0, emd[] $$1, Set<emm> $$2) {
      this.b = new emf.a($$0, $$1, $$2);
   }

   @Nullable
   public emf.a k() {
      return this.b;
   }

   public void a(vs $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.p(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static emf b(vs $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      im $$3 = $$0.e();
      List<emd> $$4 = $$0.a(emd::b);
      emf.a $$5 = emf.a.b($$0);
      emf $$6 = new emf($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public im l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static emd[] c(vs $$0) {
      emd[] $$1 = new emd[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = emd.b($$0);
      }

      return $$1;
   }

   static void a(vs $$0, emd[] $$1) {
      $$0.c($$1.length);

      for (emd $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public emf n() {
      emf $$0 = new emf(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(emd[] a, emd[] b, Set<emm> c) {

      public void a(vs $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         emf.a($$0, this.a);
         emf.a($$0, this.b);
      }

      public static emf.a b(vs $$0) {
         HashSet<emm> $$1 = $$0.a(HashSet::new, emm::c);
         emd[] $$2 = emf.c($$0);
         emd[] $$3 = emf.c($$0);
         return new emf.a($$2, $$3, $$1);
      }
   }
}
