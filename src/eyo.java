import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eyo {
   private final List<eym> a;
   @Nullable
   private eyo.a b;
   private int c;
   private final iw d;
   private final float e;
   private final boolean f;

   public eyo(List<eym> $$0, iw $$1, boolean $$2) {
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
   public eym d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public eym a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, eym $$1) {
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

   public fgc a(bxe $$0, int $$1) {
      eym $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dq() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dq() + 1.0F)) * 0.5;
      return new fgc($$3, $$4, $$5);
   }

   public iw d(int $$0) {
      return this.a.get($$0).a();
   }

   public fgc a(bxe $$0) {
      return this.a($$0, this.c);
   }

   public iw g() {
      return this.a.get(this.c).a();
   }

   public eym h() {
      return this.a.get(this.c);
   }

   @Nullable
   public eym i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable eyo $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            eym $$2 = this.a.get($$1);
            eym $$3 = $$0.a.get($$1);
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

   @bbi
   void a(eym[] $$0, eym[] $$1, Set<eyv> $$2) {
      this.b = new eyo.a($$0, $$1, $$2);
   }

   @Nullable
   public eyo.a k() {
      return this.b;
   }

   public void a(vy $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.q(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static eyo b(vy $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      iw $$3 = $$0.e();
      List<eym> $$4 = $$0.a(eym::b);
      eyo.a $$5 = eyo.a.b($$0);
      eyo $$6 = new eyo($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public iw l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static eym[] c(vy $$0) {
      eym[] $$1 = new eym[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = eym.b($$0);
      }

      return $$1;
   }

   static void a(vy $$0, eym[] $$1) {
      $$0.c($$1.length);

      for (eym $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public eyo n() {
      eyo $$0 = new eyo(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(eym[] a, eym[] b, Set<eyv> c) {

      public void a(vy $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         eyo.a($$0, this.a);
         eyo.a($$0, this.b);
      }

      public static eyo.a b(vy $$0) {
         HashSet<eyv> $$1 = $$0.a(HashSet::new, eyv::c);
         eym[] $$2 = eyo.c($$0);
         eym[] $$3 = eyo.c($$0);
         return new eyo.a($$2, $$3, $$1);
      }
   }
}
