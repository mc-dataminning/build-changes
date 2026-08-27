import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eff {
   private final List<efd> a;
   @Nullable
   private eff.a b;
   private int c;
   private final hx d;
   private final float e;
   private final boolean f;

   public eff(List<efd> $$0, hx $$1, boolean $$2) {
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
   public efd d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public efd a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, efd $$1) {
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

   public els a(blu $$0, int $$1) {
      efd $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dg() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dg() + 1.0F)) * 0.5;
      return new els($$3, $$4, $$5);
   }

   public hx d(int $$0) {
      return this.a.get($$0).a();
   }

   public els a(blu $$0) {
      return this.a($$0, this.c);
   }

   public hx g() {
      return this.a.get(this.c).a();
   }

   public efd h() {
      return this.a.get(this.c);
   }

   @Nullable
   public efd i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable eff $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            efd $$2 = this.a.get($$1);
            efd $$3 = $$0.a.get($$1);
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

   @avs
   void a(efd[] $$0, efd[] $$1, Set<efj> $$2) {
      this.b = new eff.a($$0, $$1, $$2);
   }

   @Nullable
   public eff.a k() {
      return this.b;
   }

   public void a(ui $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.p(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static eff b(ui $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      hx $$3 = $$0.e();
      List<efd> $$4 = $$0.a(efd::b);
      eff.a $$5 = eff.a.b($$0);
      eff $$6 = new eff($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public hx l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static efd[] c(ui $$0) {
      efd[] $$1 = new efd[$$0.n()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = efd.b($$0);
      }

      return $$1;
   }

   static void a(ui $$0, efd[] $$1) {
      $$0.c($$1.length);

      for (efd $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public eff n() {
      eff $$0 = new eff(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(efd[] a, efd[] b, Set<efj> c) {

      public void a(ui $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         eff.a($$0, this.a);
         eff.a($$0, this.b);
      }

      public static eff.a b(ui $$0) {
         HashSet<efj> $$1 = $$0.a(HashSet::new, efj::c);
         efd[] $$2 = eff.c($$0);
         efd[] $$3 = eff.c($$0);
         return new eff.a($$2, $$3, $$1);
      }
   }
}
