import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class brc implements bqm, crt {
   private final int b;
   private final jr<cuo> c;
   @Nullable
   private List<bqo> d;

   public brc(int $$0) {
      this.b = $$0;
      this.c = jr.a($$0, cuo.l);
   }

   public brc(cuo... $$0) {
      this.b = $$0.length;
      this.c = jr.a(cuo.l, $$0);
   }

   public void a(bqo $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bqo $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cuo a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cuo.l;
   }

   public List<cuo> f() {
      List<cuo> $$0 = this.c.stream().filter($$0x -> !$$0x.e()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cuo a(int $$0, int $$1) {
      cuo $$2 = bqn.a(this.c, $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   public cuo a(cuj $$0, int $$1) {
      cuo $$2 = new cuo($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cuo $$4 = this.a($$3);
         if ($$4.g().equals($$0)) {
            int $$5 = $$1 - $$2.I();
            cuo $$6 = $$4.a($$5);
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

   public cuo b(cuo $$0) {
      if ($$0.e()) {
         return cuo.l;
      } else {
         cuo $$1 = $$0.s();
         this.e($$1);
         if ($$1.e()) {
            return cuo.l;
         } else {
            this.d($$1);
            return $$1.e() ? cuo.l : $$1;
         }
      }
   }

   public boolean c(cuo $$0) {
      boolean $$1 = false;

      for (cuo $$2 : this.c) {
         if ($$2.e() || cuo.c($$2, $$0) && $$2.I() < $$2.j()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cuo b(int $$0) {
      cuo $$1 = this.c.get($$0);
      if ($$1.e()) {
         return cuo.l;
      } else {
         this.c.set($$0, cuo.l);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cuo $$1) {
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
      for (cuo $$0 : this.c) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bqo $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cmw $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void a(cna $$0) {
      for (cuo $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.e()).collect(Collectors.toList()).toString();
   }

   private void d(cuo $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cuo $$2 = this.a($$1);
         if ($$2.e()) {
            this.a($$1, $$0.f());
            return;
         }
      }
   }

   private void e(cuo $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cuo $$2 = this.a($$1);
         if (cuo.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.e()) {
               return;
            }
         }
      }
   }

   private void a(cuo $$0, cuo $$1) {
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
         cuo.a($$1, (vo)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public ux a(jk.a $$0) {
      ux $$1 = new ux();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cuo $$3 = this.a($$2);
         if (!$$3.e()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jr<cuo> g() {
      return this.c;
   }
}
