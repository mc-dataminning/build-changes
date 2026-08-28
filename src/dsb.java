import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dsb extends drs implements bri {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jw<cvp> d = jw.a(6, cvp.k);
   private int e = -1;

   public dsb(je $$0, duo $$1) {
      super(dru.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         duo $$1 = this.m();

         for (int $$2 = 0; $$2 < din.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            dvf $$4 = din.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dzl.c, this.p, dzl.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      brj.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      brj.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cvp::f)).count();
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
      return this.d.stream().allMatch(cvp::f);
   }

   @Override
   public cvp a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cvp a(int $$0, int $$1) {
      cvp $$2 = Objects.requireNonNullElse(this.d.get($$0), cvp.k);
      this.d.set($$0, cvp.k);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cvp b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cvp $$1) {
      if ($$1.a(axc.aV)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bri $$0, int $$1, cvp $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : cvp.c($$2, $$2x) && $$2x.J() + $$2.J() <= $$0.f_($$2x));
   }

   @Override
   public int ak_() {
      return 1;
   }

   @Override
   public boolean a(cnu $$0) {
      return bri.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cvp $$1) {
      return $$1.a(axc.aV) && this.a($$0).f() && $$1.J() == this.ak_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(drs.b $$0) {
      super.a($$0);
      $$0.a(kr.ag, cyl.a).a(this.d);
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kr.ag, cyl.a(this.d));
   }

   @Override
   public void a(uf $$0) {
      $$0.r("Items");
   }
}
