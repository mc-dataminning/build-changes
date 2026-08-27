import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eas {
   private final List<eaq> a;
   @Nullable
   private eas.a b;
   private int c;
   private final gu d;
   private final float e;
   private final boolean f;

   public eas(List<eaq> $$0, gu $$1, boolean $$2) {
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
   public eaq d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public eaq a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, eaq $$1) {
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

   public ehe a(bii $$0, int $$1) {
      eaq $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.df() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.df() + 1.0F)) * 0.5;
      return new ehe($$3, $$4, $$5);
   }

   public gu d(int $$0) {
      return this.a.get($$0).a();
   }

   public ehe a(bii $$0) {
      return this.a($$0, this.c);
   }

   public gu g() {
      return this.a.get(this.c).a();
   }

   public eaq h() {
      return this.a.get(this.c);
   }

   @Nullable
   public eaq i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable eas $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            eaq $$2 = this.a.get($$1);
            eaq $$3 = $$0.a.get($$1);
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

   @asq
   void a(eaq[] $$0, eaq[] $$1, Set<eaw> $$2) {
      this.b = new eas.a($$0, $$1, $$2);
   }

   @Nullable
   public eas.a k() {
      return this.b;
   }

   public void a(si $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.p(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static eas b(si $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      gu $$3 = $$0.e();
      List<eaq> $$4 = $$0.a(eaq::b);
      eas.a $$5 = eas.a.b($$0);
      eas $$6 = new eas($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public gu l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static eaq[] c(si $$0) {
      eaq[] $$1 = new eaq[$$0.m()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = eaq.b($$0);
      }

      return $$1;
   }

   static void a(si $$0, eaq[] $$1) {
      $$0.c($$1.length);

      for (eaq $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public eas n() {
      eas $$0 = new eas(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(eaq[] a, eaq[] b, Set<eaw> c) {

      public void a(si $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         eas.a($$0, this.a);
         eas.a($$0, this.b);
      }

      public static eas.a b(si $$0) {
         HashSet<eaw> $$1 = $$0.a(HashSet::new, eaw::c);
         eaq[] $$2 = eas.c($$0);
         eaq[] $$3 = eas.c($$0);
         return new eas.a($$2, $$3, $$1);
      }
   }
}
