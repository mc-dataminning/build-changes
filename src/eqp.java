import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eqp {
   private final List<eqn> a;
   @Nullable
   private eqp.a b;
   private int c;
   private final je d;
   private final float e;
   private final boolean f;

   public eqp(List<eqn> $$0, je $$1, boolean $$2) {
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
   public eqn d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public eqn a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, eqn $$1) {
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

   public eye a(btj $$0, int $$1) {
      eqn $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dn() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dn() + 1.0F)) * 0.5;
      return new eye($$3, $$4, $$5);
   }

   public je d(int $$0) {
      return this.a.get($$0).a();
   }

   public eye a(btj $$0) {
      return this.a($$0, this.c);
   }

   public je g() {
      return this.a.get(this.c).a();
   }

   public eqn h() {
      return this.a.get(this.c);
   }

   @Nullable
   public eqn i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable eqp $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            eqn $$2 = this.a.get($$1);
            eqn $$3 = $$0.a.get($$1);
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

   @bai
   void a(eqn[] $$0, eqn[] $$1, Set<eqw> $$2) {
      this.b = new eqp.a($$0, $$1, $$2);
   }

   @Nullable
   public eqp.a k() {
      return this.b;
   }

   public void a(wa $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.q(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static eqp b(wa $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      je $$3 = $$0.e();
      List<eqn> $$4 = $$0.a(eqn::b);
      eqp.a $$5 = eqp.a.b($$0);
      eqp $$6 = new eqp($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public je l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static eqn[] c(wa $$0) {
      eqn[] $$1 = new eqn[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = eqn.b($$0);
      }

      return $$1;
   }

   static void a(wa $$0, eqn[] $$1) {
      $$0.c($$1.length);

      for (eqn $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public eqp n() {
      eqp $$0 = new eqp(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(eqn[] a, eqn[] b, Set<eqw> c) {

      public void a(wa $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         eqp.a($$0, this.a);
         eqp.a($$0, this.b);
      }

      public static eqp.a b(wa $$0) {
         HashSet<eqw> $$1 = $$0.a(HashSet::new, eqw::c);
         eqn[] $$2 = eqp.c($$0);
         eqn[] $$3 = eqp.c($$0);
         return new eqp.a($$2, $$3, $$1);
      }
   }
}
