import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bth implements bst, cuv {
   private final int b;
   private final jz<cxg> c;
   @Nullable
   private List<bsv> d;

   public bth(int $$0) {
      this.b = $$0;
      this.c = jz.a($$0, cxg.j);
   }

   public bth(cxg... $$0) {
      this.b = $$0.length;
      this.c = jz.a(cxg.j, $$0);
   }

   public void a(bsv $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bsv $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cxg a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cxg.j;
   }

   public List<cxg> f() {
      List<cxg> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cxg a(int $$0, int $$1) {
      cxg $$2 = bsu.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cxg a(cxc $$0, int $$1) {
      cxg $$2 = new cxg($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cxg $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.M();
            cxg $$6 = $$4.a($$5);
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

   public cxg b(cxg $$0) {
      if ($$0.f()) {
         return cxg.j;
      } else {
         cxg $$1 = $$0.v();
         this.e($$1);
         if ($$1.f()) {
            return cxg.j;
         } else {
            this.d($$1);
            return $$1.f() ? cxg.j : $$1;
         }
      }
   }

   public boolean c(cxg $$0) {
      boolean $$1 = false;

      for (cxg $$2 : this.c) {
         if ($$2.f() || cxg.c($$2, $$0) && $$2.M() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cxg b(int $$0) {
      cxg $$1 = this.c.get($$0);
      if ($$1.f()) {
         return cxg.j;
      } else {
         this.c.set($$0, cxg.j);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cxg $$1) {
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
      for (cxg $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bsv $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cpo $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(cpt $$0) {
      for (cxg $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(cxg $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cxg $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(cxg $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cxg $$2 = this.a($$1);
         if (cxg.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(cxg $$0, cxg $$1) {
      int $$2 = this.e_($$1);
      int $$3 = Math.min($$0.M(), $$2 - $$1.M());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(us $$0, js.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cxg.a($$1, (vj)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public us a(js.a $$0) {
      us $$1 = new us();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cxg $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jz<cxg> g() {
      return this.c;
   }
}
