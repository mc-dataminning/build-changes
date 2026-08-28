import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class duz extends duq implements bst {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jz<cxg> d = jz.a(6, cxg.j);
   private int e = -1;

   public duz(jh $$0, dxo $$1) {
      super(dus.N, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dxo $$1 = this.m();

         for (int $$2 = 0; $$2 < dlh.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            dyf $$4 = dlh.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(eck.c, this.p, eck.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      bsu.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      bsu.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cxg::f)).count();
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
      return this.d.stream().allMatch(cxg::f);
   }

   @Override
   public cxg a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cxg a(int $$0, int $$1) {
      cxg $$2 = Objects.requireNonNullElse(this.d.get($$0), cxg.j);
      this.d.set($$0, cxg.j);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cxg b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cxg $$1) {
      if ($$1.a(axt.bb)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bst $$0, int $$1, cxg $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : cxg.c($$2, $$2x) && $$2x.M() + $$2.M() <= $$0.e_($$2x));
   }

   @Override
   public int ao_() {
      return 1;
   }

   @Override
   public boolean a(cpo $$0) {
      return bst.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cxg $$1) {
      return $$1.a(axt.bb) && this.a($$0).f() && $$1.M() == this.ao_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(duq.b $$0) {
      super.a($$0);
      $$0.a(ku.al, czy.a).a(this.d);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.al, czy.a(this.d));
   }

   @Override
   public void a(um $$0) {
      $$0.r("Items");
   }
}
