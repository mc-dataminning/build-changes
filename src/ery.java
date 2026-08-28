import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ery {
   private final List<erw> a;
   @Nullable
   private ery.a b;
   private int c;
   private final jh d;
   private final float e;
   private final boolean f;

   public ery(List<erw> $$0, jh $$1, boolean $$2) {
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
   public erw d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public erw a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, erw $$1) {
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

   public ezn a(bue $$0, int $$1) {
      erw $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.ds() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.ds() + 1.0F)) * 0.5;
      return new ezn($$3, $$4, $$5);
   }

   public jh d(int $$0) {
      return this.a.get($$0).a();
   }

   public ezn a(bue $$0) {
      return this.a($$0, this.c);
   }

   public jh g() {
      return this.a.get(this.c).a();
   }

   public erw h() {
      return this.a.get(this.c);
   }

   @Nullable
   public erw i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable ery $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            erw $$2 = this.a.get($$1);
            erw $$3 = $$0.a.get($$1);
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

   @baq
   void a(erw[] $$0, erw[] $$1, Set<esf> $$2) {
      this.b = new ery.a($$0, $$1, $$2);
   }

   @Nullable
   public ery.a k() {
      return this.b;
   }

   public void a(wf $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.q(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static ery b(wf $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      jh $$3 = $$0.e();
      List<erw> $$4 = $$0.a(erw::b);
      ery.a $$5 = ery.a.b($$0);
      ery $$6 = new ery($$4, $$3, $$1);
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

   static erw[] c(wf $$0) {
      erw[] $$1 = new erw[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = erw.b($$0);
      }

      return $$1;
   }

   static void a(wf $$0, erw[] $$1) {
      $$0.c($$1.length);

      for (erw $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public ery n() {
      ery $$0 = new ery(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(erw[] a, erw[] b, Set<esf> c) {

      public void a(wf $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         ery.a($$0, this.a);
         ery.a($$0, this.b);
      }

      public static ery.a b(wf $$0) {
         HashSet<esf> $$1 = $$0.a(HashSet::new, esf::c);
         erw[] $$2 = ery.c($$0);
         erw[] $$3 = ery.c($$0);
         return new ery.a($$2, $$3, $$1);
      }
   }
}
