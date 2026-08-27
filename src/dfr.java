import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dfr extends dfi implements biu {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final ip<clo> e = ip.a(6, clo.b);
   private int f = -1;

   public dfr(hx $$0, dhn $$1) {
      super(dfk.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dhn $$1 = this.r();

         for (int $$2 = 0; $$2 < cwj.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            die $$4 = cwj.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dlx.c, this.p, dlx.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(sd $$0) {
      this.e.clear();
      biv.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(sd $$0) {
      biv.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(clo::b)).count();
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
      return this.e.stream().allMatch(clo::b);
   }

   @Override
   public clo a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public clo a(int $$0, int $$1) {
      clo $$2 = Objects.requireNonNullElse(this.e.get($$0), clo.b);
      this.e.set($$0, clo.b);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public clo b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, clo $$1) {
      if ($$1.a(ars.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(biu $$0, int $$1, clo $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : clo.c($$2, $$2x) && $$2x.L() + $$2.L() <= Math.min($$2x.g(), $$0.al_()));
   }

   @Override
   public int al_() {
      return 1;
   }

   @Override
   public boolean a(cdz $$0) {
      return biu.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, clo $$1) {
      return $$1.a(ars.av) && this.a($$0).b();
   }

   public int g() {
      return this.f;
   }
}
