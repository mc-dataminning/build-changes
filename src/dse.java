import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dse extends drv implements brl {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jx<cvs> d = jx.a(6, cvs.k);
   private int e = -1;

   public dse(jf $$0, dus $$1) {
      super(drx.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dus $$1 = this.m();

         for (int $$2 = 0; $$2 < diq.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            dvj $$4 = diq.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dzp.c, this.p, dzp.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      brm.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      brm.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cvs::f)).count();
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
      return this.d.stream().allMatch(cvs::f);
   }

   @Override
   public cvs a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cvs a(int $$0, int $$1) {
      cvs $$2 = Objects.requireNonNullElse(this.d.get($$0), cvs.k);
      this.d.set($$0, cvs.k);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cvs b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cvs $$1) {
      if ($$1.a(axe.aV)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(brl $$0, int $$1, cvs $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : cvs.c($$2, $$2x) && $$2x.K() + $$2.K() <= $$0.f_($$2x));
   }

   @Override
   public int al_() {
      return 1;
   }

   @Override
   public boolean a(cnx $$0) {
      return brl.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cvs $$1) {
      return $$1.a(axe.aV) && this.a($$0).f() && $$1.K() == this.al_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(drv.b $$0) {
      super.a($$0);
      $$0.a(ks.ag, cyo.a).a(this.d);
   }

   @Override
   protected void a(ko.a $$0) {
      super.a($$0);
      $$0.a(ks.ag, cyo.a(this.d));
   }

   @Override
   public void a(ug $$0) {
      $$0.r("Items");
   }
}
