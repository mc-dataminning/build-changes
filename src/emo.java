import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class emo {
   private final List<emm> a;
   @Nullable
   private emo.a b;
   private int c;
   private final in d;
   private final float e;
   private final boolean f;

   public emo(List<emm> $$0, in $$1, boolean $$2) {
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
   public emm d() {
      return !this.a.isEmpty() ? this.a.get(this.a.size() - 1) : null;
   }

   public emm a(int $$0) {
      return this.a.get($$0);
   }

   public void b(int $$0) {
      if (this.a.size() > $$0) {
         this.a.subList($$0, this.a.size()).clear();
      }
   }

   public void a(int $$0, emm $$1) {
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

   public etp a(brh $$0, int $$1) {
      emm $$2 = this.a.get($$1);
      double $$3 = (double)$$2.a + (double)((int)($$0.dh() + 1.0F)) * 0.5;
      double $$4 = (double)$$2.b;
      double $$5 = (double)$$2.c + (double)((int)($$0.dh() + 1.0F)) * 0.5;
      return new etp($$3, $$4, $$5);
   }

   public in d(int $$0) {
      return this.a.get($$0).a();
   }

   public etp a(brh $$0) {
      return this.a($$0, this.c);
   }

   public in g() {
      return this.a.get(this.c).a();
   }

   public emm h() {
      return this.a.get(this.c);
   }

   @Nullable
   public emm i() {
      return this.c > 0 ? this.a.get(this.c - 1) : null;
   }

   public boolean a(@Nullable emo $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.a.size() != this.a.size()) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
            emm $$2 = this.a.get($$1);
            emm $$3 = $$0.a.get($$1);
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

   @azc
   void a(emm[] $$0, emm[] $$1, Set<emv> $$2) {
      this.b = new emo.a($$0, $$1, $$2);
   }

   @Nullable
   public emo.a k() {
      return this.b;
   }

   public void a(vu $$0) {
      if (this.b != null && !this.b.c.isEmpty()) {
         $$0.a(this.f);
         $$0.p(this.c);
         $$0.a(this.d);
         $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
         this.b.a($$0);
      }
   }

   public static emo b(vu $$0) {
      boolean $$1 = $$0.readBoolean();
      int $$2 = $$0.readInt();
      in $$3 = $$0.e();
      List<emm> $$4 = $$0.a(emm::b);
      emo.a $$5 = emo.a.b($$0);
      emo $$6 = new emo($$4, $$3, $$1);
      $$6.b = $$5;
      $$6.c = $$2;
      return $$6;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.a.size() + ")";
   }

   public in l() {
      return this.d;
   }

   public float m() {
      return this.e;
   }

   static emm[] c(vu $$0) {
      emm[] $$1 = new emm[$$0.l()];

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$1[$$2] = emm.b($$0);
      }

      return $$1;
   }

   static void a(vu $$0, emm[] $$1) {
      $$0.c($$1.length);

      for (emm $$2 : $$1) {
         $$2.a($$0);
      }
   }

   public emo n() {
      emo $$0 = new emo(this.a, this.d, this.f);
      $$0.b = this.b;
      $$0.c = this.c;
      return $$0;
   }

   public static record a(emm[] a, emm[] b, Set<emv> c) {

      public void a(vu $$0) {
         $$0.a(this.c, ($$0x, $$1) -> $$1.a($$0x));
         emo.a($$0, this.a);
         emo.a($$0, this.b);
      }

      public static emo.a b(vu $$0) {
         HashSet<emv> $$1 = $$0.a(HashSet::new, emv::c);
         emm[] $$2 = emo.c($$0);
         emm[] $$3 = emo.c($$0);
         return new emo.a($$2, $$3, $$1);
      }
   }
}
