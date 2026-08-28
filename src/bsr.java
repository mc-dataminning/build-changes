import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bsr implements bsd, cue {
   private final int b;
   private final ka<cwp> c;
   @Nullable
   private List<bsf> d;

   public bsr(int $$0) {
      this.b = $$0;
      this.c = ka.a($$0, cwp.j);
   }

   public bsr(cwp... $$0) {
      this.b = $$0.length;
      this.c = ka.a(cwp.j, $$0);
   }

   public void a(bsf $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bsf $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cwp a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cwp.j;
   }

   public List<cwp> f() {
      List<cwp> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cwp a(int $$0, int $$1) {
      cwp $$2 = bse.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cwp a(cwl $$0, int $$1) {
      cwp $$2 = new cwp($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cwp $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.M();
            cwp $$6 = $$4.a($$5);
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

   public cwp b(cwp $$0) {
      if ($$0.f()) {
         return cwp.j;
      } else {
         cwp $$1 = $$0.v();
         this.e($$1);
         if ($$1.f()) {
            return cwp.j;
         } else {
            this.d($$1);
            return $$1.f() ? cwp.j : $$1;
         }
      }
   }

   public boolean c(cwp $$0) {
      boolean $$1 = false;

      for (cwp $$2 : this.c) {
         if ($$2.f() || cwp.c($$2, $$0) && $$2.M() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cwp b(int $$0) {
      cwp $$1 = this.c.get($$0);
      if ($$1.f()) {
         return cwp.j;
      } else {
         this.c.set($$0, cwp.j);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cwp $$1) {
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
      for (cwp $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bsf $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cox $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(cpc $$0) {
      for (cwp $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(cwp $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cwp $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(cwp $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cwp $$2 = this.a($$1);
         if (cwp.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(cwp $$0, cwp $$1) {
      int $$2 = this.e_($$1);
      int $$3 = Math.min($$0.M(), $$2 - $$1.M());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(tw $$0, jt.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cwp.a($$1, (un)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public tw a(jt.a $$0) {
      tw $$1 = new tw();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwp $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public ka<cwp> g() {
      return this.c;
   }
}
