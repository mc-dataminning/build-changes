import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ear {
   private final List<eap> a;
   @Nullable
   private ear.a b;
   private int c;
   private final gu d;
   private final float e;
   private final boolean f;

   public ear(List<eap> $$0, gu $$1, boolean $$2) {
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
   public eap d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public eap a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, eap $$1) {
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

   public ehd a(bii $$0, int $$1) {
      eap $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.df() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.df() + 1.0F)) * 0.5;
      return new ehd($$3, $$4, $$5);
   }

   public gu d(int $$0) {
      return this.a.get($$0).a();
   }

   public ehd a(bii $$0) {
      return this.a($$0, this.c);
   }

   public gu g() {
      return this.a.get(this.c).a();
   }

   public eap h() {
      return this.a.get(this.c);
   }

   @Nullable
   public eap i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable ear $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            eap $$2 = this.a.get($$1);
            eap $$3 = $$0.a.get($$1);
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
   void a(eap[] $$0, eap[] $$1, Set<eav> $$2) {
      this.b = new ear.a($$0, $$1, $$2);
   }

   @Nullable
   public ear.a k() {
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

   public static ear b(si $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      gu $$3 = $$0.e();
      List<eap> $$4 = $$0.a(eap::b);
      ear.a $$5 = ear.a.b($$0);
      ear $$6 = new ear($$4, $$3, $$1);
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

   static eap[] c(si $$0) {
      eap[] $$1 = new eap[$$0.m()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = eap.b($$0);
      }

      return $$1;
   }

   static void a(si $$0, eap[] $$1) {
      $$0.c($$1.length);

      for (eap $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public ear n() {
      ear $$0 = new ear(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(eap[] a, eap[] b, Set<eav> c) {

      public void a(si $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         ear.a($$0, this.a);
         ear.a($$0, this.b);
      }

      public static ear.a b(si $$0) {
         HashSet<eav> $$1 = $$0.a(HashSet::new, eav::c);
         eap[] $$2 = ear.c($$0);
         eap[] $$3 = ear.c($$0);
         return new ear.a($$2, $$3, $$1);
      }
   }
}
