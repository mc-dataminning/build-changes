import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dhm extends dhd implements bjv {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final iq<cng> e = iq.a(6, cng.f);
   private int f = -1;

   public dhm(hx $$0, djp $$1) {
      super(dhf.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         djp $$1 = this.r();

         for (int $$2 = 0; $$2 < cyc.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            dkg $$4 = cyc.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dnz.c, this.p, dnz.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(so $$0) {
      this.e.clear();
      bjw.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(so $$0) {
      bjw.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(cng::b)).count();
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
      return this.e.stream().allMatch(cng::b);
   }

   @Override
   public cng a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public cng a(int $$0, int $$1) {
      cng $$2 = Objects.requireNonNullElse(this.e.get($$0), cng.f);
      this.e.set($$0, cng.f);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cng b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cng $$1) {
      if ($$1.a(asq.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bjv $$0, int $$1, cng $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : cng.c($$2, $$2x) && $$2x.L() + $$2.L() <= Math.min($$2x.g(), $$0.al_()));
   }

   @Override
   public int al_() {
      return 1;
   }

   @Override
   public boolean a(cfq $$0) {
      return bjv.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cng $$1) {
      return $$1.a(asq.av) && this.a($$0).b() && $$1.L() == this.al_();
   }

   public int g() {
      return this.f;
   }
}
