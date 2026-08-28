import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class esc {
   private final List<esa> a;
   @Nullable
   private esc.a b;
   private int c;
   private final jh d;
   private final float e;
   private final boolean f;

   public esc(List<esa> $$0, jh $$1, boolean $$2) {
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
   public esa d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public esa a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, esa $$1) {
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

   public ezr a(bui $$0, int $$1) {
      esa $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dt() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dt() + 1.0F)) * 0.5;
      return new ezr($$3, $$4, $$5);
   }

   public jh d(int $$0) {
      return this.a.get($$0).a();
   }

   public ezr a(bui $$0) {
      return this.a($$0, this.c);
   }

   public jh g() {
      return this.a.get(this.c).a();
   }

   public esa h() {
      return this.a.get(this.c);
   }

   @Nullable
   public esa i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable esc $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            esa $$2 = this.a.get($$1);
            esa $$3 = $$0.a.get($$1);
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

   @bau
   void a(esa[] $$0, esa[] $$1, Set<esj> $$2) {
      this.b = new esc.a($$0, $$1, $$2);
   }

   @Nullable
   public esc.a k() {
      return this.b;
   }

   public void a(wi $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.q(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static esc b(wi $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      jh $$3 = $$0.e();
      List<esa> $$4 = $$0.a(esa::b);
      esc.a $$5 = esc.a.b($$0);
      esc $$6 = new esc($$4, $$3, $$1);
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

   static esa[] c(wi $$0) {
      esa[] $$1 = new esa[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = esa.b($$0);
      }

      return $$1;
   }

   static void a(wi $$0, esa[] $$1) {
      $$0.c($$1.length);

      for (esa $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public esc n() {
      esc $$0 = new esc(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(esa[] a, esa[] b, Set<esj> c) {

      public void a(wi $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         esc.a($$0, this.a);
         esc.a($$0, this.b);
      }

      public static esc.a b(wi $$0) {
         HashSet<esj> $$1 = $$0.a(HashSet::new, esj::c);
         esa[] $$2 = esc.c($$0);
         esa[] $$3 = esc.c($$0);
         return new esc.a($$2, $$3, $$1);
      }
   }
}
