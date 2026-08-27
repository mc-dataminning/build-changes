import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ebb {
   private final List<eaz> a;
   @Nullable
   private ebb.a b;
   private int c;
   private final gw d;
   private final float e;
   private final boolean f;

   public ebb(List<eaz> $$0, gw $$1, boolean $$2) {
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
   public eaz d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public eaz a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, eaz $$1) {
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

   public ehn a(biq $$0, int $$1) {
      eaz $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.df() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.df() + 1.0F)) * 0.5;
      return new ehn($$3, $$4, $$5);
   }

   public gw d(int $$0) {
      return this.a.get($$0).a();
   }

   public ehn a(biq $$0) {
      return this.a($$0, this.c);
   }

   public gw g() {
      return this.a.get(this.c).a();
   }

   public eaz h() {
      return this.a.get(this.c);
   }

   @Nullable
   public eaz i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable ebb $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            eaz $$2 = this.a.get($$1);
            eaz $$3 = $$0.a.get($$1);
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

   @asy
   void a(eaz[] $$0, eaz[] $$1, Set<ebf> $$2) {
      this.b = new ebb.a($$0, $$1, $$2);
   }

   @Nullable
   public ebb.a k() {
      return this.b;
   }

   public void a(sp $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.p(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static ebb b(sp $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      gw $$3 = $$0.e();
      List<eaz> $$4 = $$0.a(eaz::b);
      ebb.a $$5 = ebb.a.b($$0);
      ebb $$6 = new ebb($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public gw l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static eaz[] c(sp $$0) {
      eaz[] $$1 = new eaz[$$0.m()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = eaz.b($$0);
      }

      return $$1;
   }

   static void a(sp $$0, eaz[] $$1) {
      $$0.c($$1.length);

      for (eaz $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public ebb n() {
      ebb $$0 = new ebb(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(eaz[] a, eaz[] b, Set<ebf> c) {

      public void a(sp $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         ebb.a($$0, this.a);
         ebb.a($$0, this.b);
      }

      public static ebb.a b(sp $$0) {
         HashSet<ebf> $$1 = $$0.a(HashSet::new, ebf::c);
         eaz[] $$2 = ebb.c($$0);
         eaz[] $$3 = ebb.c($$0);
         return new ebb.a($$2, $$3, $$1);
      }
   }
}
