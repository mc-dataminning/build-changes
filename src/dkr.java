import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dkr extends dki implements bmw {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final iu<cqm> e = iu.a(6, cqm.h);
   private int f = -1;

   public dkr(ib $$0, dnb $$1) {
      super(dkk.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dnb $$1 = this.n();

         for (int $$2 = 0; $$2 < dbg.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            dns $$4 = dbg.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(drp.c, this.p, drp.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      this.e.clear();
      bmx.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      bmx.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(cqm::b)).count();
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
   public boolean ai_() {
      return this.e.stream().allMatch(cqm::b);
   }

   @Override
   public cqm a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public cqm a(int $$0, int $$1) {
      cqm $$2 = Objects.requireNonNullElse(this.e.get($$0), cqm.h);
      this.e.set($$0, cqm.h);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cqm b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cqm $$1) {
      if ($$1.a(auv.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bmw $$0, int $$1, cqm $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : cqm.c($$2, $$2x) && $$2x.M() + $$2.M() <= Math.min($$2x.g(), $$0.ak_()));
   }

   @Override
   public int ak_() {
      return 1;
   }

   @Override
   public boolean a(ciu $$0) {
      return bmw.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cqm $$1) {
      return $$1.a(auv.av) && this.a($$0).b() && $$1.M() == this.ak_();
   }

   public int j() {
      return this.f;
   }
}
