import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class evh {
   private final List<evf> a;
   @Nullable
   private evh.a b;
   private int c;
   private final jj d;
   private final float e;
   private final boolean f;

   public evh(List<evf> $$0, jj $$1, boolean $$2) {
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
   public evf d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public evf a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, evf $$1) {
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

   public fcu a(bvs $$0, int $$1) {
      evf $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dq() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dq() + 1.0F)) * 0.5;
      return new fcu($$3, $$4, $$5);
   }

   public jj d(int $$0) {
      return this.a.get($$0).a();
   }

   public fcu a(bvs $$0) {
      return this.a($$0, this.c);
   }

   public jj g() {
      return this.a.get(this.c).a();
   }

   public evf h() {
      return this.a.get(this.c);
   }

   @Nullable
   public evf i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable evh $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            evf $$2 = this.a.get($$1);
            evf $$3 = $$0.a.get($$1);
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

   @bar
   void a(evf[] $$0, evf[] $$1, Set<evo> $$2) {
      this.b = new evh.a($$0, $$1, $$2);
   }

   @Nullable
   public evh.a k() {
      return this.b;
   }

   public void a(vr $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.q(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static evh b(vr $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      jj $$3 = $$0.e();
      List<evf> $$4 = $$0.a(evf::b);
      evh.a $$5 = evh.a.b($$0);
      evh $$6 = new evh($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public jj l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static evf[] c(vr $$0) {
      evf[] $$1 = new evf[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = evf.b($$0);
      }

      return $$1;
   }

   static void a(vr $$0, evf[] $$1) {
      $$0.c($$1.length);

      for (evf $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public evh n() {
      evh $$0 = new evh(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(evf[] a, evf[] b, Set<evo> c) {

      public void a(vr $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         evh.a($$0, this.a);
         evh.a($$0, this.b);
      }

      public static evh.a b(vr $$0) {
         HashSet<evo> $$1 = $$0.a(HashSet::new, evo::c);
         evf[] $$2 = evh.c($$0);
         evf[] $$3 = evh.c($$0);
         return new evh.a($$2, $$3, $$1);
      }
   }
}
