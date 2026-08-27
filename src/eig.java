import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eig {
   private final List<eie> a;
   @Nullable
   private eig.a b;
   private int c;
   private final ib d;
   private final float e;
   private final boolean f;

   public eig(List<eie> $$0, ib $$1, boolean $$2) {
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
   public eie d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public eie a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, eie $$1) {
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

   public eov a(bof $$0, int $$1) {
      eie $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dd() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dd() + 1.0F)) * 0.5;
      return new eov($$3, $$4, $$5);
   }

   public ib d(int $$0) {
      return this.a.get($$0).a();
   }

   public eov a(bof $$0) {
      return this.a($$0, this.c);
   }

   public ib g() {
      return this.a.get(this.c).a();
   }

   public eie h() {
      return this.a.get(this.c);
   }

   @Nullable
   public eie i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable eig $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            eie $$2 = this.a.get($$1);
            eie $$3 = $$0.a.get($$1);
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

   @axp
   void a(eie[] $$0, eie[] $$1, Set<eik> $$2) {
      this.b = new eig.a($$0, $$1, $$2);
   }

   @Nullable
   public eig.a k() {
      return this.b;
   }

   public void a(us $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.p(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static eig b(us $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      ib $$3 = $$0.e();
      List<eie> $$4 = $$0.a(eie::b);
      eig.a $$5 = eig.a.b($$0);
      eig $$6 = new eig($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public ib l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static eie[] c(us $$0) {
      eie[] $$1 = new eie[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = eie.b($$0);
      }

      return $$1;
   }

   static void a(us $$0, eie[] $$1) {
      $$0.c($$1.length);

      for (eie $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public eig n() {
      eig $$0 = new eig(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(eie[] a, eie[] b, Set<eik> c) {

      public void a(us $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         eig.a($$0, this.a);
         eig.a($$0, this.b);
      }

      public static eig.a b(us $$0) {
         HashSet<eik> $$1 = $$0.a(HashSet::new, eik::c);
         eie[] $$2 = eig.c($$0);
         eie[] $$3 = eig.c($$0);
         return new eig.a($$2, $$3, $$1);
      }
   }
}
