import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ewj {
   private final List<ewh> a;
   @Nullable
   private ewj.a b;
   private int c;
   private final iu d;
   private final float e;
   private final boolean f;

   public ewj(List<ewh> $$0, iu $$1, boolean $$2) {
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
   public ewh d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public ewh a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, ewh $$1) {
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

   public fdw a(bwa $$0, int $$1) {
      ewh $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dq() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dq() + 1.0F)) * 0.5;
      return new fdw($$3, $$4, $$5);
   }

   public iu d(int $$0) {
      return this.a.get($$0).a();
   }

   public fdw a(bwa $$0) {
      return this.a($$0, this.c);
   }

   public iu g() {
      return this.a.get(this.c).a();
   }

   public ewh h() {
      return this.a.get(this.c);
   }

   @Nullable
   public ewh i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable ewj $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            ewh $$2 = this.a.get($$1);
            ewh $$3 = $$0.a.get($$1);
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

   @bat
   void a(ewh[] $$0, ewh[] $$1, Set<ewq> $$2) {
      this.b = new ewj.a($$0, $$1, $$2);
   }

   @Nullable
   public ewj.a k() {
      return this.b;
   }

   public void a(vs $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.q(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static ewj b(vs $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      iu $$3 = $$0.e();
      List<ewh> $$4 = $$0.a(ewh::b);
      ewj.a $$5 = ewj.a.b($$0);
      ewj $$6 = new ewj($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public iu l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static ewh[] c(vs $$0) {
      ewh[] $$1 = new ewh[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = ewh.b($$0);
      }

      return $$1;
   }

   static void a(vs $$0, ewh[] $$1) {
      $$0.c($$1.length);

      for (ewh $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public ewj n() {
      ewj $$0 = new ewj(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(ewh[] a, ewh[] b, Set<ewq> c) {

      public void a(vs $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         ewj.a($$0, this.a);
         ewj.a($$0, this.b);
      }

      public static ewj.a b(vs $$0) {
         HashSet<ewq> $$1 = $$0.a(HashSet::new, ewq::c);
         ewh[] $$2 = ewj.c($$0);
         ewh[] $$3 = ewj.c($$0);
         return new ewj.a($$2, $$3, $$1);
      }
   }
}
