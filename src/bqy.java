import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bqy implements bqi, crp {
   private final int b;
   private final jr<cuk> c;
   @Nullable
   private List<bqk> d;

   public bqy(int $$0) {
      this.b = $$0;
      this.c = jr.a($$0, cuk.l);
   }

   public bqy(cuk... $$0) {
      this.b = $$0.length;
      this.c = jr.a(cuk.l, $$0);
   }

   public void a(bqk $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bqk $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cuk a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cuk.l;
   }

   public List<cuk> f() {
      List<cuk> $$0 = this.c.stream().filter($$0x -> !$$0x.e()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cuk a(int $$0, int $$1) {
      cuk $$2 = bqj.a(this.c, $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   public cuk a(cuf $$0, int $$1) {
      cuk $$2 = new cuk($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cuk $$4 = this.a($$3);
         if ($$4.g().equals($$0)) {
            int $$5 = $$1 - $$2.I();
            cuk $$6 = $$4.a($$5);
            $$2.g($$6.I());
            if ($$2.I() == $$1) {
               break;
            }
         }
      }

      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   public cuk b(cuk $$0) {
      if ($$0.e()) {
         return cuk.l;
      } else {
         cuk $$1 = $$0.s();
         this.e($$1);
         if ($$1.e()) {
            return cuk.l;
         } else {
            this.d($$1);
            return $$1.e() ? cuk.l : $$1;
         }
      }
   }

   public boolean c(cuk $$0) {
      boolean $$1 = false;

      for (cuk $$2 : this.c) {
         if ($$2.e() || cuk.c($$2, $$0) && $$2.I() < $$2.j()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cuk b(int $$0) {
      cuk $$1 = this.c.get($$0);
      if ($$1.e()) {
         return cuk.l;
      } else {
         this.c.set($$0, cuk.l);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cuk $$1) {
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
      for (cuk $$0 : this.c) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bqk $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cms $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void a(cmw $$0) {
      for (cuk $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.e()).collect(Collectors.toList()).toString();
   }

   private void d(cuk $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cuk $$2 = this.a($$1);
         if ($$2.e()) {
            this.a($$1, $$0.f());
            return;
         }
      }
   }

   private void e(cuk $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cuk $$2 = this.a($$1);
         if (cuk.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.e()) {
               return;
            }
         }
      }
   }

   private void a(cuk $$0, cuk $$1) {
      int $$2 = this.e_($$1);
      int $$3 = Math.min($$0.I(), $$2 - $$1.I());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(ux $$0, jk.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cuk.a($$1, (vo)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public ux a(jk.a $$0) {
      ux $$1 = new ux();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cuk $$3 = this.a($$2);
         if (!$$3.e()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jr<cuk> g() {
      return this.c;
   }
}
