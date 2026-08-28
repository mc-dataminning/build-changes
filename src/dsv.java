import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dsv extends dsm implements brw {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jz<cwb> d = jz.a(6, cwb.k);
   private int e = -1;

   public dsv(jh $$0, dvj $$1) {
      super(dso.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dvj $$1 = this.m();

         for (int $$2 = 0; $$2 < dji.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            dwa $$4 = dji.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(eag.c, this.p, eag.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      brx.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      brx.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cwb::f)).count();
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
      return this.d.stream().allMatch(cwb::f);
   }

   @Override
   public cwb a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cwb a(int $$0, int $$1) {
      cwb $$2 = Objects.requireNonNullElse(this.d.get($$0), cwb.k);
      this.d.set($$0, cwb.k);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cwb b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cwb $$1) {
      if ($$1.a(axj.aZ)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(brw $$0, int $$1, cwb $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : cwb.c($$2, $$2x) && $$2x.L() + $$2.L() <= $$0.e_($$2x));
   }

   @Override
   public int am_() {
      return 1;
   }

   @Override
   public boolean a(com $$0) {
      return brw.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cwb $$1) {
      return $$1.a(axj.aZ) && this.a($$0).f() && $$1.L() == this.am_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(dsm.b $$0) {
      super.a($$0);
      $$0.a(ku.al, cyt.a).a(this.d);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.al, cyt.a(this.d));
   }

   @Override
   public void a(uk $$0) {
      $$0.r("Items");
   }
}
