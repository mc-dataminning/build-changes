import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class erh {
   private final List<erf> a;
   @Nullable
   private erh.a b;
   private int c;
   private final jf d;
   private final float e;
   private final boolean f;

   public erh(List<erf> $$0, jf $$1, boolean $$2) {
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
   public erf d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public erf a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, erf $$1) {
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

   public eyw a(btr $$0, int $$1) {
      erf $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dn() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dn() + 1.0F)) * 0.5;
      return new eyw($$3, $$4, $$5);
   }

   public jf d(int $$0) {
      return this.a.get($$0).a();
   }

   public eyw a(btr $$0) {
      return this.a($$0, this.c);
   }

   public jf g() {
      return this.a.get(this.c).a();
   }

   public erf h() {
      return this.a.get(this.c);
   }

   @Nullable
   public erf i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable erh $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            erf $$2 = this.a.get($$1);
            erf $$3 = $$0.a.get($$1);
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

   @bal
   void a(erf[] $$0, erf[] $$1, Set<ero> $$2) {
      this.b = new erh.a($$0, $$1, $$2);
   }

   @Nullable
   public erh.a k() {
      return this.b;
   }

   public void a(wb $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.q(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static erh b(wb $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      jf $$3 = $$0.e();
      List<erf> $$4 = $$0.a(erf::b);
      erh.a $$5 = erh.a.b($$0);
      erh $$6 = new erh($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public jf l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static erf[] c(wb $$0) {
      erf[] $$1 = new erf[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = erf.b($$0);
      }

      return $$1;
   }

   static void a(wb $$0, erf[] $$1) {
      $$0.c($$1.length);

      for (erf $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public erh n() {
      erh $$0 = new erh(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(erf[] a, erf[] b, Set<ero> c) {

      public void a(wb $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         erh.a($$0, this.a);
         erh.a($$0, this.b);
      }

      public static erh.a b(wb $$0) {
         HashSet<ero> $$1 = $$0.a(HashSet::new, ero::c);
         erf[] $$2 = erh.c($$0);
         erf[] $$3 = erh.c($$0);
         return new erh.a($$2, $$3, $$1);
      }
   }
}
