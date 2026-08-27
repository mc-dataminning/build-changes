import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dql extends dqc implements bpt {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jj<cuh> d = jj.a(6, cuh.i);
   private int e = -1;

   public dql(ir $$0, dtc $$1) {
      super(dqe.N, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dtc $$1 = this.n();

         for (int $$2 = 0; $$2 < dgg.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).d();
            dtt $$4 = dgg.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.n).a(this.o, $$1, 3);
         this.n.a(dxv.c, this.o, dxv.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      this.d.clear();
      bpu.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      bpu.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cuh::d)).count();
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
      return this.d.stream().allMatch(cuh::d);
   }

   @Override
   public cuh a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cuh a(int $$0, int $$1) {
      cuh $$2 = Objects.requireNonNullElse(this.d.get($$0), cuh.i);
      this.d.set($$0, cuh.i);
      if (!$$2.d()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cuh b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cuh $$1) {
      if ($$1.a(awm.aX)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.d()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bpt $$0, int $$1, cuh $$2) {
      return $$0.b($$2x -> $$2x.d() ? true : cuh.c($$2, $$2x) && $$2x.G() + $$2.G() <= $$0.a($$2x));
   }

   @Override
   public int ai_() {
      return 1;
   }

   @Override
   public boolean a(cly $$0) {
      return bpt.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cuh $$1) {
      return $$1.a(awm.aX) && this.a($$0).d() && $$1.G() == this.ai_();
   }

   public int j() {
      return this.e;
   }

   @Override
   public void a(ka $$0) {
      $$0.a(ke.Z, cxm.a).a(this.d);
   }

   @Override
   public void a(ka.a $$0) {
      $$0.a(ke.Z, cxm.a(this.d));
   }

   @Override
   public void a(uk $$0) {
      $$0.r("Items");
   }
}
