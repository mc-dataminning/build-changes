import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class efg {
   private final List<efe> a;
   @Nullable
   private efg.a b;
   private int c;
   private final hx d;
   private final float e;
   private final boolean f;

   public efg(List<efe> $$0, hx $$1, boolean $$2) {
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
   public efe d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public efe a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, efe $$1) {
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

   public elt a(blv $$0, int $$1) {
      efe $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dg() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dg() + 1.0F)) * 0.5;
      return new elt($$3, $$4, $$5);
   }

   public hx d(int $$0) {
      return this.a.get($$0).a();
   }

   public elt a(blv $$0) {
      return this.a($$0, this.c);
   }

   public hx g() {
      return this.a.get(this.c).a();
   }

   public efe h() {
      return this.a.get(this.c);
   }

   @Nullable
   public efe i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable efg $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            efe $$2 = this.a.get($$1);
            efe $$3 = $$0.a.get($$1);
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

   @avt
   void a(efe[] $$0, efe[] $$1, Set<efk> $$2) {
      this.b = new efg.a($$0, $$1, $$2);
   }

   @Nullable
   public efg.a k() {
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

   public static efg b(ui $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      hx $$3 = $$0.e();
      List<efe> $$4 = $$0.a(efe::b);
      efg.a $$5 = efg.a.b($$0);
      efg $$6 = new efg($$4, $$3, $$1);
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

   static efe[] c(ui $$0) {
      efe[] $$1 = new efe[$$0.n()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = efe.b($$0);
      }

      return $$1;
   }

   static void a(ui $$0, efe[] $$1) {
      $$0.c($$1.length);

      for (efe $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public efg n() {
      efg $$0 = new efg(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(efe[] a, efe[] b, Set<efk> c) {

      public void a(ui $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         efg.a($$0, this.a);
         efg.a($$0, this.b);
      }

      public static efg.a b(ui $$0) {
         HashSet<efk> $$1 = $$0.a(HashSet::new, efk::c);
         efe[] $$2 = efg.c($$0);
         efe[] $$3 = efg.c($$0);
         return new efg.a($$2, $$3, $$1);
      }
   }
}
