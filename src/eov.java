import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eov {
   private final List<eot> a;
   @Nullable
   private eov.a b;
   private int c;
   private final ja d;
   private final float e;
   private final boolean f;

   public eov(List<eot> $$0, ja $$1, boolean $$2) {
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
   public eot d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public eot a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, eot $$1) {
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

   public ewf a(bsg $$0, int $$1) {
      eot $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dk() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dk() + 1.0F)) * 0.5;
      return new ewf($$3, $$4, $$5);
   }

   public ja d(int $$0) {
      return this.a.get($$0).a();
   }

   public ewf a(bsg $$0) {
      return this.a($$0, this.c);
   }

   public ja g() {
      return this.a.get(this.c).a();
   }

   public eot h() {
      return this.a.get(this.c);
   }

   @Nullable
   public eot i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable eov $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            eot $$2 = this.a.get($$1);
            eot $$3 = $$0.a.get($$1);
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

   @azl
   void a(eot[] $$0, eot[] $$1, Set<epc> $$2) {
      this.b = new eov.a($$0, $$1, $$2);
   }

   @Nullable
   public eov.a k() {
      return this.b;
   }

   public void a(vr $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.p(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static eov b(vr $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      ja $$3 = $$0.e();
      List<eot> $$4 = $$0.a(eot::b);
      eov.a $$5 = eov.a.b($$0);
      eov $$6 = new eov($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public ja l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static eot[] c(vr $$0) {
      eot[] $$1 = new eot[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = eot.b($$0);
      }

      return $$1;
   }

   static void a(vr $$0, eot[] $$1) {
      $$0.c($$1.length);

      for (eot $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public eov n() {
      eov $$0 = new eov(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(eot[] a, eot[] b, Set<epc> c) {

      public void a(vr $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         eov.a($$0, this.a);
         eov.a($$0, this.b);
      }

      public static eov.a b(vr $$0) {
         HashSet<epc> $$1 = $$0.a(HashSet::new, epc::c);
         eot[] $$2 = eov.c($$0);
         eot[] $$3 = eov.c($$0);
         return new eov.a($$2, $$3, $$1);
      }
   }
}
