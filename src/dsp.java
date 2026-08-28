import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dsp extends dsg implements brr {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jy<cvx> d = jy.a(6, cvx.k);
   private int e = -1;

   public dsp(jg $$0, dvd $$1) {
      super(dsi.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dvd $$1 = this.m();

         for (int $$2 = 0; $$2 < djc.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            dvu $$4 = djc.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(eaa.c, this.p, eaa.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      brs.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      brs.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cvx::f)).count();
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
      return this.d.stream().allMatch(cvx::f);
   }

   @Override
   public cvx a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cvx a(int $$0, int $$1) {
      cvx $$2 = Objects.requireNonNullElse(this.d.get($$0), cvx.k);
      this.d.set($$0, cvx.k);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cvx b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cvx $$1) {
      if ($$1.a(axi.aW)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(brr $$0, int $$1, cvx $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : cvx.c($$2, $$2x) && $$2x.L() + $$2.L() <= $$0.e_($$2x));
   }

   @Override
   public int am_() {
      return 1;
   }

   @Override
   public boolean a(coh $$0) {
      return brr.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cvx $$1) {
      return $$1.a(axi.aW) && this.a($$0).f() && $$1.L() == this.am_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(dsg.b $$0) {
      super.a($$0);
      $$0.a(kt.ak, cyn.a).a(this.d);
   }

   @Override
   protected void a(kp.a $$0) {
      super.a($$0);
      $$0.a(kt.ak, cyn.a(this.d));
   }

   @Override
   public void a(uj $$0) {
      $$0.r("Items");
   }
}
