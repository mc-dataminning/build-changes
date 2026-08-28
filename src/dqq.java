import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dqq extends dqh implements bqk {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jv<cuq> d = jv.a(6, cuq.l);
   private int e = -1;

   public dqq(jd $$0, dtc $$1) {
      super(dqj.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dtc $$1 = this.n();

         for (int $$2 = 0; $$2 < dhc.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).e();
            dtt $$4 = dhc.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.n).a(this.o, $$1, 3);
         this.n.a(dxz.c, this.o, dxz.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      bql.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      bql.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cuq::e)).count();
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
      return this.d.stream().allMatch(cuq::e);
   }

   @Override
   public cuq a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cuq a(int $$0, int $$1) {
      cuq $$2 = Objects.requireNonNullElse(this.d.get($$0), cuq.l);
      this.d.set($$0, cuq.l);
      if (!$$2.e()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cuq b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cuq $$1) {
      if ($$1.a(awn.aV)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.e()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bqk $$0, int $$1, cuq $$2) {
      return $$0.a_($$2x -> $$2x.e() ? true : cuq.c($$2, $$2x) && $$2x.H() + $$2.H() <= $$0.e_($$2x));
   }

   @Override
   public int al_() {
      return 1;
   }

   @Override
   public boolean a(cmx $$0) {
      return bqk.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cuq $$1) {
      return $$1.a(awn.aV) && this.a($$0).e() && $$1.H() == this.al_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(dqh.b $$0) {
      super.a($$0);
      $$0.a(kq.ab, cxo.a).a(this.d);
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.ab, cxo.a(this.d));
   }

   @Override
   public void a(ub $$0) {
      $$0.r("Items");
   }
}
