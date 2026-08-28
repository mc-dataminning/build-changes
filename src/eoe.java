import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eoe {
   private final List<eoc> a;
   @Nullable
   private eoe.a b;
   private int c;
   private final iz d;
   private final float e;
   private final boolean f;

   public eoe(List<eoc> $$0, iz $$1, boolean $$2) {
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
   public eoc d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public eoc a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, eoc $$1) {
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

   public evm a(bsp $$0, int $$1) {
      eoc $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dj() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dj() + 1.0F)) * 0.5;
      return new evm($$3, $$4, $$5);
   }

   public iz d(int $$0) {
      return this.a.get($$0).a();
   }

   public evm a(bsp $$0) {
      return this.a($$0, this.c);
   }

   public iz g() {
      return this.a.get(this.c).a();
   }

   public eoc h() {
      return this.a.get(this.c);
   }

   @Nullable
   public eoc i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable eoe $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            eoc $$2 = this.a.get($$1);
            eoc $$3 = $$0.a.get($$1);
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

   @azy
   void a(eoc[] $$0, eoc[] $$1, Set<eol> $$2) {
      this.b = new eoe.a($$0, $$1, $$2);
   }

   @Nullable
   public eoe.a k() {
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

   public static eoe b(wl $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      iz $$3 = $$0.e();
      List<eoc> $$4 = $$0.a(eoc::b);
      eoe.a $$5 = eoe.a.b($$0);
      eoe $$6 = new eoe($$4, $$3, $$1);
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

   static eoc[] c(wl $$0) {
      eoc[] $$1 = new eoc[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = eoc.b($$0);
      }

      return $$1;
   }

   static void a(wl $$0, eoc[] $$1) {
      $$0.c($$1.length);

      for (eoc $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public eoe n() {
      eoe $$0 = new eoe(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(eoc[] a, eoc[] b, Set<eol> c) {

      public void a(wl $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         eoe.a($$0, this.a);
         eoe.a($$0, this.b);
      }

      public static eoe.a b(wl $$0) {
         HashSet<eol> $$1 = $$0.a(HashSet::new, eol::c);
         eoc[] $$2 = eoe.c($$0);
         eoc[] $$3 = eoe.c($$0);
         return new eoe.a($$2, $$3, $$1);
      }
   }
}
