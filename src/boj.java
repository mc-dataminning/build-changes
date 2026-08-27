import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class boj implements bnt, coo {
   private final int c;
   private final iu<crj> d;
   @Nullable
   private List<bnv> e;

   public boj(int $$0) {
      this.c = $$0;
      this.d = iu.a($$0, crj.i);
   }

   public boj(crj... $$0) {
      this.c = $$0.length;
      this.d = iu.a(crj.i, $$0);
   }

   public void a(bnv $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bnv $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public crj a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : crj.i;
   }

   public List<crj> f() {
      List<crj> $$0 = this.d.stream().filter($$0x -> !$$0x.d()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public crj a(int $$0, int $$1) {
      crj $$2 = bnu.a(this.d, $$0, $$1);
      if (!$$2.d()) {
         this.e();
      }

      return $$2;
   }

   public crj a(cre $$0, int $$1) {
      crj $$2 = new crj($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         crj $$4 = this.a($$3);
         if ($$4.f().equals($$0)) {
            int $$5 = $$1 - $$2.G();
            crj $$6 = $$4.a($$5);
            $$2.f($$6.G());
            if ($$2.G() == $$1) {
               break;
            }
         }
      }

      if (!$$2.d()) {
         this.e();
      }

      return $$2;
   }

   public crj a(crj $$0) {
      if ($$0.d()) {
         return crj.i;
      } else {
         crj $$1 = $$0.r();
         this.d($$1);
         if ($$1.d()) {
            return crj.i;
         } else {
            this.c($$1);
            return $$1.d() ? crj.i : $$1;
         }
      }
   }

   public boolean b(crj $$0) {
      boolean $$1 = false;

      for (crj $$2 : this.d) {
         if ($$2.d() || crj.c($$2, $$0) && $$2.G() < $$2.i()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public crj b(int $$0) {
      crj $$1 = this.d.get($$0);
      if ($$1.d()) {
         return crj.i;
      } else {
         this.d.set($$0, crj.i);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, crj $$1) {
      this.d.set($$0, $$1);
      if (!$$1.d() && $$1.G() > this.aj_()) {
         $$1.e(this.aj_());
      }

      this.e();
   }

   @Override
   public int b() {
      return this.c;
   }

   @Override
   public boolean ah_() {
      for (crj $$0 : this.d) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bnv $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cjx $$0) {
      for (crj $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.d()).collect(Collectors.toList()).toString();
   }

   private void c(crj $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         crj $$2 = this.a($$1);
         if ($$2.d()) {
            this.a($$1, $$0.e());
            return;
         }
      }
   }

   private void d(crj $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         crj $$2 = this.a($$1);
         if (crj.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.d()) {
               return;
            }
         }
      }
   }

   private void a(crj $$0, crj $$1) {
      int $$2 = Math.min(this.aj_(), $$1.i());
      int $$3 = Math.min($$0.G(), $$2 - $$1.G());
      if ($$3 > 0) {
         $$1.f($$3);
         $$0.g($$3);
         this.e();
      }
   }

   public void a(ts $$0, in.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         crj.a($$1, (uj)$$0.a($$2)).ifPresent(this::a);
      }
   }

   public ts a(in.a $$0) {
      ts $$1 = new ts();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         crj $$3 = this.a($$2);
         if (!$$3.d()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public iu<crj> g() {
      return this.d;
   }
}
