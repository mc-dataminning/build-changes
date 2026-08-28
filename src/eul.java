import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eul {
   private final List<euj> a;
   @Nullable
   private eul.a b;
   private int c;
   private final jh d;
   private final float e;
   private final boolean f;

   public eul(List<euj> $$0, jh $$1, boolean $$2) {
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
   public euj d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public euj a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, euj $$1) {
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

   public fby a(bvk $$0, int $$1) {
      euj $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dr() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dr() + 1.0F)) * 0.5;
      return new fby($$3, $$4, $$5);
   }

   public jh d(int $$0) {
      return this.a.get($$0).a();
   }

   public fby a(bvk $$0) {
      return this.a($$0, this.c);
   }

   public jh g() {
      return this.a.get(this.c).a();
   }

   public euj h() {
      return this.a.get(this.c);
   }

   @Nullable
   public euj i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable eul $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            euj $$2 = this.a.get($$1);
            euj $$3 = $$0.a.get($$1);
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

   @bbl
   void a(euj[] $$0, euj[] $$1, Set<eus> $$2) {
      this.b = new eul.a($$0, $$1, $$2);
   }

   @Nullable
   public eul.a k() {
      return this.b;
   }

   public void a(ws $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.q(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static eul b(ws $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      jh $$3 = $$0.e();
      List<euj> $$4 = $$0.a(euj::b);
      eul.a $$5 = eul.a.b($$0);
      eul $$6 = new eul($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public jh l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static euj[] c(ws $$0) {
      euj[] $$1 = new euj[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = euj.b($$0);
      }

      return $$1;
   }

   static void a(ws $$0, euj[] $$1) {
      $$0.c($$1.length);

      for (euj $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public eul n() {
      eul $$0 = new eul(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(euj[] a, euj[] b, Set<eus> c) {

      public void a(ws $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         eul.a($$0, this.a);
         eul.a($$0, this.b);
      }

      public static eul.a b(ws $$0) {
         HashSet<eus> $$1 = $$0.a(HashSet::new, eus::c);
         euj[] $$2 = eul.c($$0);
         euj[] $$3 = eul.c($$0);
         return new eul.a($$2, $$3, $$1);
      }
   }
}
