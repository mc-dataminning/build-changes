import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class exo {
   private final List<exm> a;
   @Nullable
   private exo.a b;
   private int c;
   private final iv d;
   private final float e;
   private final boolean f;

   public exo(List<exm> $$0, iv $$1, boolean $$2) {
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
   public exm d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public exm a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, exm $$1) {
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

   public ffc a(bwi $$0, int $$1) {
      exm $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dp() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dp() + 1.0F)) * 0.5;
      return new ffc($$3, $$4, $$5);
   }

   public iv d(int $$0) {
      return this.a.get($$0).a();
   }

   public ffc a(bwi $$0) {
      return this.a($$0, this.c);
   }

   public iv g() {
      return this.a.get(this.c).a();
   }

   public exm h() {
      return this.a.get(this.c);
   }

   @Nullable
   public exm i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable exo $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            exm $$2 = this.a.get($$1);
            exm $$3 = $$0.a.get($$1);
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

   @bav
   void a(exm[] $$0, exm[] $$1, Set<exv> $$2) {
      this.b = new exo.a($$0, $$1, $$2);
   }

   @Nullable
   public exo.a k() {
      return this.b;
   }

   public void a(vu $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.q(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static exo b(vu $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      iv $$3 = $$0.e();
      List<exm> $$4 = $$0.a(exm::b);
      exo.a $$5 = exo.a.b($$0);
      exo $$6 = new exo($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public iv l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static exm[] c(vu $$0) {
      exm[] $$1 = new exm[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = exm.b($$0);
      }

      return $$1;
   }

   static void a(vu $$0, exm[] $$1) {
      $$0.c($$1.length);

      for (exm $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public exo n() {
      exo $$0 = new exo(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(exm[] a, exm[] b, Set<exv> c) {

      public void a(vu $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         exo.a($$0, this.a);
         exo.a($$0, this.b);
      }

      public static exo.a b(vu $$0) {
         HashSet<exv> $$1 = $$0.a(HashSet::new, exv::c);
         exm[] $$2 = exo.c($$0);
         exm[] $$3 = exo.c($$0);
         return new exo.a($$2, $$3, $$1);
      }
   }
}
