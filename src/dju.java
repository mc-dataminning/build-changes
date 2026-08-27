import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dju extends djl implements bme {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final iu<cpq> e = iu.a(6, cpq.h);
   private int f = -1;

   public dju(ib $$0, dme $$1) {
      super(djn.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dme $$1 = this.n();

         for (int $$2 = 0; $$2 < daj.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            dmv $$4 = daj.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dqr.c, this.p, dqr.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      this.e.clear();
      bmf.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      bmf.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(cpq::b)).count();
   }

   @Override
   public void a() {
      this.e.clear();
   }

   @Override
   public int b() {
      return 6;
   }

   @Override
   public boolean aj_() {
      return this.e.stream().allMatch(cpq::b);
   }

   @Override
   public cpq a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public cpq a(int $$0, int $$1) {
      cpq $$2 = Objects.requireNonNullElse(this.e.get($$0), cpq.h);
      this.e.set($$0, cpq.h);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cpq b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cpq $$1) {
      if ($$1.a(aum.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bme $$0, int $$1, cpq $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : cpq.c($$2, $$2x) && $$2x.M() + $$2.M() <= Math.min($$2x.g(), $$0.al_()));
   }

   @Override
   public int al_() {
      return 1;
   }

   @Override
   public boolean a(cia $$0) {
      return bme.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cpq $$1) {
      return $$1.a(aum.av) && this.a($$0).b() && $$1.M() == this.al_();
   }

   public int j() {
      return this.f;
   }
}
