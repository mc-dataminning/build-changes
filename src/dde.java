import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dde extends dcv implements bgr {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final hp<cjf> e = hp.a(6, cjf.b);
   private int f = -1;

   public dde(gw $$0, dfj $$1) {
      super(dcx.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dfj $$1 = this.q();

         for (int $$2 = 0; $$2 < cty.b.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            dga $$4 = cty.b.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(djt.c, this.p, djt.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(qy $$0) {
      this.e.clear();
      bgs.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(qy $$0) {
      bgs.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(cjf::b)).count();
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
   public boolean af_() {
      return this.e.stream().allMatch(cjf::b);
   }

   @Override
   public cjf a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public cjf a(int $$0, int $$1) {
      cjf $$2 = Objects.requireNonNullElse(this.e.get($$0), cjf.b);
      this.e.set($$0, cjf.b);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cjf b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cjf $$1) {
      if ($$1.a(aqb.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bgr $$0, int $$1, cjf $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : cjf.c($$2, $$2x) && $$2x.L() + $$2.L() <= Math.min($$2x.g(), $$0.ag_()));
   }

   @Override
   public int ag_() {
      return 1;
   }

   @Override
   public boolean a(cbu $$0) {
      return bgr.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cjf $$1) {
      return $$1.a(aqb.av) && this.a($$0).b();
   }

   public int g() {
      return this.f;
   }
}
