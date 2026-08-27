import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dhd extends dgu implements bjt {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final iq<cmx> e = iq.a(6, cmx.f);
   private int f = -1;

   public dhd(hx $$0, djg $$1) {
      super(dgw.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         djg $$1 = this.r();

         for (int $$2 = 0; $$2 < cxt.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            djx $$4 = cxt.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dnq.c, this.p, dnq.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(sn $$0) {
      this.e.clear();
      bju.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(sn $$0) {
      bju.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(cmx::b)).count();
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
      return this.e.stream().allMatch(cmx::b);
   }

   @Override
   public cmx a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public cmx a(int $$0, int $$1) {
      cmx $$2 = Objects.requireNonNullElse(this.e.get($$0), cmx.f);
      this.e.set($$0, cmx.f);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cmx b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cmx $$1) {
      if ($$1.a(aso.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bjt $$0, int $$1, cmx $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : cmx.c($$2, $$2x) && $$2x.L() + $$2.L() <= Math.min($$2x.g(), $$0.ak_()));
   }

   @Override
   public int ak_() {
      return 1;
   }

   @Override
   public boolean a(cfh $$0) {
      return bjt.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cmx $$1) {
      return $$1.a(aso.av) && this.a($$0).b() && $$1.L() == this.ak_();
   }

   public int g() {
      return this.f;
   }
}
