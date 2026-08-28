import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dvf extends duw implements btb {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jz<cxo> d = jz.a(6, cxo.j);
   private int e = -1;

   public dvf(jh $$0, dxu $$1) {
      super(duy.N, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dxu $$1 = this.m();

         for (int $$2 = 0; $$2 < dlq.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            dyl $$4 = dlq.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(ecq.c, this.p, ecq.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      btc.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      btc.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cxo::f)).count();
   }

   @Override
   public void a() {
      this.d.clear();
   }

   @Override
   public int b() {
      return 6;
   }

   @Override
   public boolean c() {
      return this.d.stream().allMatch(cxo::f);
   }

   @Override
   public cxo a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cxo a(int $$0, int $$1) {
      cxo $$2 = Objects.requireNonNullElse(this.d.get($$0), cxo.j);
      this.d.set($$0, cxo.j);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cxo b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cxo $$1) {
      if ($$1.a(ayd.bb)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(btb $$0, int $$1, cxo $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : cxo.c($$2, $$2x) && $$2x.L() + $$2.L() <= $$0.e_($$2x));
   }

   @Override
   public int ao_() {
      return 1;
   }

   @Override
   public boolean a(cpw $$0) {
      return btb.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cxo $$1) {
      return $$1.a(ayd.bb) && this.a($$0).f() && $$1.L() == this.ao_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(duw.b $$0) {
      super.a($$0);
      $$0.a(ku.al, dag.a).a(this.d);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.al, dag.a(this.d));
   }

   @Override
   public void a(ux $$0) {
      $$0.r("Items");
   }
}
