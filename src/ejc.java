import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ejc {
   private final List<eja> a;
   @Nullable
   private ejc.a b;
   private int c;
   private final ib d;
   private final float e;
   private final boolean f;

   public ejc(List<eja> $$0, ib $$1, boolean $$2) {
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
   public eja d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public eja a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, eja $$1) {
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

   public epr a(bow $$0, int $$1) {
      eja $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dg() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dg() + 1.0F)) * 0.5;
      return new epr($$3, $$4, $$5);
   }

   public ib d(int $$0) {
      return this.a.get($$0).a();
   }

   public epr a(bow $$0) {
      return this.a($$0, this.c);
   }

   public ib g() {
      return this.a.get(this.c).a();
   }

   public eja h() {
      return this.a.get(this.c);
   }

   @Nullable
   public eja i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable ejc $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            eja $$2 = this.a.get($$1);
            eja $$3 = $$0.a.get($$1);
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

   @axz
   void a(eja[] $$0, eja[] $$1, Set<ejg> $$2) {
      this.b = new ejc.a($$0, $$1, $$2);
   }

   @Nullable
   public ejc.a k() {
      return this.b;
   }

   public void a(uu $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.p(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static ejc b(uu $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      ib $$3 = $$0.e();
      List<eja> $$4 = $$0.a(eja::b);
      ejc.a $$5 = ejc.a.b($$0);
      ejc $$6 = new ejc($$4, $$3, $$1);
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

   static eja[] c(uu $$0) {
      eja[] $$1 = new eja[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = eja.b($$0);
      }

      return $$1;
   }

   static void a(uu $$0, eja[] $$1) {
      $$0.c($$1.length);

      for (eja $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public ejc n() {
      ejc $$0 = new ejc(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(eja[] a, eja[] b, Set<ejg> c) {

      public void a(uu $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         ejc.a($$0, this.a);
         ejc.a($$0, this.b);
      }

      public static ejc.a b(uu $$0) {
         HashSet<ejg> $$1 = $$0.a(HashSet::new, ejg::c);
         eja[] $$2 = ejc.c($$0);
         eja[] $$3 = ejc.c($$0);
         return new ejc.a($$2, $$3, $$1);
      }
   }
}
