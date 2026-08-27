import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dmo extends dmf implements bnt {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final iu<crj> e = iu.a(6, crj.i);
   private int f = -1;

   public dmo(ib $$0, doz $$1) {
      super(dmh.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         doz $$1 = this.n();

         for (int $$2 = 0; $$2 < ddc.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).d();
            dpq $$4 = ddc.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dts.c, this.p, dts.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      this.e.clear();
      bnu.b($$0, this.e, $$1);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      bnu.a($$0, this.e, true, $$1);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(crj::d)).count();
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
   public boolean ah_() {
      return this.e.stream().allMatch(crj::d);
   }

   @Override
   public crj a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public crj a(int $$0, int $$1) {
      crj $$2 = Objects.requireNonNullElse(this.e.get($$0), crj.i);
      this.e.set($$0, crj.i);
      if (!$$2.d()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public crj b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, crj $$1) {
      if ($$1.a(avk.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.d()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bnt $$0, int $$1, crj $$2) {
      return $$0.a_($$2x -> $$2x.d() ? true : crj.c($$2, $$2x) && $$2x.G() + $$2.G() <= Math.min($$2x.i(), $$0.aj_()));
   }

   @Override
   public int aj_() {
      return 1;
   }

   @Override
   public boolean a(cjt $$0) {
      return bnt.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, crj $$1) {
      return $$1.a(avk.av) && this.a($$0).d() && $$1.G() == this.aj_();
   }

   public int j() {
      return this.f;
   }
}
