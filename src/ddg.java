import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class ddg extends dcx implements bgt {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final hp<cjh> e = hp.a(6, cjh.b);
   private int f = -1;

   public ddg(gw $$0, dfl $$1) {
      super(dcz.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dfl $$1 = this.q();

         for (int $$2 = 0; $$2 < cua.b.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            dgc $$4 = cua.b.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(djv.c, this.p, djv.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(qy $$0) {
      this.e.clear();
      bgu.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(qy $$0) {
      bgu.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(cjh::b)).count();
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
      return this.e.stream().allMatch(cjh::b);
   }

   @Override
   public cjh a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public cjh a(int $$0, int $$1) {
      cjh $$2 = Objects.requireNonNullElse(this.e.get($$0), cjh.b);
      this.e.set($$0, cjh.b);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cjh b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cjh $$1) {
      if ($$1.a(aqc.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bgt $$0, int $$1, cjh $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : cjh.c($$2, $$2x) && $$2x.L() + $$2.L() <= Math.min($$2x.g(), $$0.ag_()));
   }

   @Override
   public int ag_() {
      return 1;
   }

   @Override
   public boolean a(cbw $$0) {
      return bgt.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cjh $$1) {
      return $$1.a(aqc.av) && this.a($$0).b();
   }

   public int g() {
      return this.f;
   }
}
