import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ecv {
   private final List<ect> a;
   @Nullable
   private ecv.a b;
   private int c;
   private final ht d;
   private final float e;
   private final boolean f;

   public ecv(List<ect> $$0, ht $$1, boolean $$2) {
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
   public ect d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public ect a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, ect $$1) {
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

   public eji a(bki $$0, int $$1) {
      ect $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.df() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.df() + 1.0F)) * 0.5;
      return new eji($$3, $$4, $$5);
   }

   public ht d(int $$0) {
      return this.a.get($$0).a();
   }

   public eji a(bki $$0) {
      return this.a($$0, this.c);
   }

   public ht g() {
      return this.a.get(this.c).a();
   }

   public ect h() {
      return this.a.get(this.c);
   }

   @Nullable
   public ect i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable ecv $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            ect $$2 = this.a.get($$1);
            ect $$3 = $$0.a.get($$1);
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

   @auk
   void a(ect[] $$0, ect[] $$1, Set<ecz> $$2) {
      this.b = new ecv.a($$0, $$1, $$2);
   }

   @Nullable
   public ecv.a k() {
      return this.b;
   }

   public void a(tu $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.p(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static ecv b(tu $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      ht $$3 = $$0.e();
      List<ect> $$4 = $$0.a(ect::b);
      ecv.a $$5 = ecv.a.b($$0);
      ecv $$6 = new ecv($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public ht l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static ect[] c(tu $$0) {
      ect[] $$1 = new ect[$$0.n()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = ect.b($$0);
      }

      return $$1;
   }

   static void a(tu $$0, ect[] $$1) {
      $$0.c($$1.length);

      for (ect $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public ecv n() {
      ecv $$0 = new ecv(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(ect[] a, ect[] b, Set<ecz> c) {

      public void a(tu $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         ecv.a($$0, this.a);
         ecv.a($$0, this.b);
      }

      public static ecv.a b(tu $$0) {
         HashSet<ecz> $$1 = $$0.a(HashSet::new, ecz::c);
         ect[] $$2 = ecv.c($$0);
         ect[] $$3 = ecv.c($$0);
         return new ecv.a($$2, $$3, $$1);
      }
   }
}
