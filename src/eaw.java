import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eaw {
   private final List<eau> a;
   @Nullable
   private eaw.a b;
   private int c;
   private final gw d;
   private final float e;
   private final boolean f;

   public eaw(List<eau> $$0, gw $$1, boolean $$2) {
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
   public eau d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public eau a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, eau $$1) {
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

   public ehi a(bil $$0, int $$1) {
      eau $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.df() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.df() + 1.0F)) * 0.5;
      return new ehi($$3, $$4, $$5);
   }

   public gw d(int $$0) {
      return this.a.get($$0).a();
   }

   public ehi a(bil $$0) {
      return this.a($$0, this.c);
   }

   public gw g() {
      return this.a.get(this.c).a();
   }

   public eau h() {
      return this.a.get(this.c);
   }

   @Nullable
   public eau i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable eaw $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            eau $$2 = this.a.get($$1);
            eau $$3 = $$0.a.get($$1);
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

   @ast
   void a(eau[] $$0, eau[] $$1, Set<eba> $$2) {
      this.b = new eaw.a($$0, $$1, $$2);
   }

   @Nullable
   public eaw.a k() {
      return this.b;
   }

   public void a(sl $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.p(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static eaw b(sl $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      gw $$3 = $$0.e();
      List<eau> $$4 = $$0.a(eau::b);
      eaw.a $$5 = eaw.a.b($$0);
      eaw $$6 = new eaw($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public gw l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static eau[] c(sl $$0) {
      eau[] $$1 = new eau[$$0.m()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = eau.b($$0);
      }

      return $$1;
   }

   static void a(sl $$0, eau[] $$1) {
      $$0.c($$1.length);

      for (eau $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public eaw n() {
      eaw $$0 = new eaw(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(eau[] a, eau[] b, Set<eba> c) {

      public void a(sl $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         eaw.a($$0, this.a);
         eaw.a($$0, this.b);
      }

      public static eaw.a b(sl $$0) {
         HashSet<eba> $$1 = $$0.a(HashSet::new, eba::c);
         eau[] $$2 = eaw.c($$0);
         eau[] $$3 = eaw.c($$0);
         return new eaw.a($$2, $$3, $$1);
      }
   }
}
