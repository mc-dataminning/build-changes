import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bqf implements bpp, cqv {
   private final int b;
   private final jg<ctq> c;
   @Nullable
   private List<bpr> d;

   public bqf(int $$0) {
      this.b = $$0;
      this.c = jg.a($$0, ctq.i);
   }

   public bqf(ctq... $$0) {
      this.b = $$0.length;
      this.c = jg.a(ctq.i, $$0);
   }

   public void a(bpr $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bpr $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public ctq a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : ctq.i;
   }

   public List<ctq> f() {
      List<ctq> $$0 = this.c.stream().filter($$0x -> !$$0x.e()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public ctq a(int $$0, int $$1) {
      ctq $$2 = bpq.a(this.c, $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   public ctq a(ctl $$0, int $$1) {
      ctq $$2 = new ctq($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         ctq $$4 = this.a($$3);
         if ($$4.g().equals($$0)) {
            int $$5 = $$1 - $$2.I();
            ctq $$6 = $$4.a($$5);
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

   public ctq b(ctq $$0) {
      if ($$0.e()) {
         return ctq.i;
      } else {
         ctq $$1 = $$0.s();
         this.e($$1);
         if ($$1.e()) {
            return ctq.i;
         } else {
            this.d($$1);
            return $$1.e() ? ctq.i : $$1;
         }
      }
   }

   public boolean c(ctq $$0) {
      boolean $$1 = false;

      for (ctq $$2 : this.c) {
         if ($$2.e() || ctq.c($$2, $$0) && $$2.I() < $$2.j()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public ctq b(int $$0) {
      ctq $$1 = this.c.get($$0);
      if ($$1.e()) {
         return ctq.i;
      } else {
         this.c.set($$0, ctq.i);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, ctq $$1) {
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
      for (ctq $$0 : this.c) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bpr $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cly $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void a(cmc $$0) {
      for (ctq $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.e()).collect(Collectors.toList()).toString();
   }

   private void d(ctq $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         ctq $$2 = this.a($$1);
         if ($$2.e()) {
            this.a($$1, $$0.f());
            return;
         }
      }
   }

   private void e(ctq $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         ctq $$2 = this.a($$1);
         if (ctq.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.e()) {
               return;
            }
         }
      }
   }

   private void a(ctq $$0, ctq $$1) {
      int $$2 = this.e_($$1);
      int $$3 = Math.min($$0.I(), $$2 - $$1.I());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(uj $$0, iz.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         ctq.a($$1, (va)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public uj a(iz.a $$0) {
      uj $$1 = new uj();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         ctq $$3 = this.a($$2);
         if (!$$3.e()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jg<ctq> g() {
      return this.c;
   }
}
