import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class epm {
   private final List<epk> a;
   @Nullable
   private epm.a b;
   private int c;
   private final jd d;
   private final float e;
   private final boolean f;

   public epm(List<epk> $$0, jd $$1, boolean $$2) {
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
   public epk d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public epk a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, epk $$1) {
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

   public eww a(bsq $$0, int $$1) {
      epk $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dk() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dk() + 1.0F)) * 0.5;
      return new eww($$3, $$4, $$5);
   }

   public jd d(int $$0) {
      return this.a.get($$0).a();
   }

   public eww a(bsq $$0) {
      return this.a($$0, this.c);
   }

   public jd g() {
      return this.a.get(this.c).a();
   }

   public epk h() {
      return this.a.get(this.c);
   }

   @Nullable
   public epk i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable epm $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            epk $$2 = this.a.get($$1);
            epk $$3 = $$0.a.get($$1);
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

   @azs
   void a(epk[] $$0, epk[] $$1, Set<ept> $$2) {
      this.b = new epm.a($$0, $$1, $$2);
   }

   @Nullable
   public epm.a k() {
      return this.b;
   }

   public void a(vv $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.p(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static epm b(vv $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      jd $$3 = $$0.e();
      List<epk> $$4 = $$0.a(epk::b);
      epm.a $$5 = epm.a.b($$0);
      epm $$6 = new epm($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public jd l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static epk[] c(vv $$0) {
      epk[] $$1 = new epk[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = epk.b($$0);
      }

      return $$1;
   }

   static void a(vv $$0, epk[] $$1) {
      $$0.c($$1.length);

      for (epk $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public epm n() {
      epm $$0 = new epm(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(epk[] a, epk[] b, Set<ept> c) {

      public void a(vv $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         epm.a($$0, this.a);
         epm.a($$0, this.b);
      }

      public static epm.a b(vv $$0) {
         HashSet<ept> $$1 = $$0.a(HashSet::new, ept::c);
         epk[] $$2 = epm.c($$0);
         epk[] $$3 = epm.c($$0);
         return new epm.a($$2, $$3, $$1);
      }
   }
}
