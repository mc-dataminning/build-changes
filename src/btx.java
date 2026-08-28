import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class btx implements btj, cvp {
   private final int b;
   private final kb<cxy> c;
   @Nullable
   private List<btl> d;

   public btx(int $$0) {
      this.b = $$0;
      this.c = kb.a($$0, cxy.k);
   }

   public btx(cxy... $$0) {
      this.b = $$0.length;
      this.c = kb.a(cxy.k, $$0);
   }

   public void a(btl $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(btl $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cxy a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cxy.k;
   }

   public List<cxy> f() {
      List<cxy> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cxy a(int $$0, int $$1) {
      cxy $$2 = btk.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cxy a(cxu $$0, int $$1) {
      cxy $$2 = new cxy($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cxy $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.M();
            cxy $$6 = $$4.a($$5);
            $$2.g($$6.M());
            if ($$2.M() == $$1) {
               break;
            }
         }
      }

      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cxy b(cxy $$0) {
      if ($$0.f()) {
         return cxy.k;
      } else {
         cxy $$1 = $$0.v();
         this.e($$1);
         if ($$1.f()) {
            return cxy.k;
         } else {
            this.d($$1);
            return $$1.f() ? cxy.k : $$1;
         }
      }
   }

   public boolean c(cxy $$0) {
      boolean $$1 = false;

      for (cxy $$2 : this.c) {
         if ($$2.f() || cxy.c($$2, $$0) && $$2.M() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cxy b(int $$0) {
      cxy $$1 = this.c.get($$0);
      if ($$1.f()) {
         return cxy.k;
      } else {
         this.c.set($$0, cxy.k);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cxy $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public int b() {
      return this.b;
   }

   @Override
   public boolean c() {
      for (cxy $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (btl $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cqi $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(cqn $$0) {
      for (cxy $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(cxy $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cxy $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(cxy $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cxy $$2 = this.a($$1);
         if (cxy.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(cxy $$0, cxy $$1) {
      int $$2 = this.e_($$1);
      int $$3 = Math.min($$0.M(), $$2 - $$1.M());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(uc $$0, ju.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cxy.a($$1, (ut)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public uc a(ju.a $$0) {
      uc $$1 = new uc();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cxy $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public kb<cxy> g() {
      return this.c;
   }
}
