import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class djc extends dit implements bln {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final is<coz> e = is.a(6, coz.h);
   private int f = -1;

   public djc(hz $$0, dlf $$1) {
      super(div.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dlf $$1 = this.r();

         for (int $$2 = 0; $$2 < czs.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            dlw $$4 = czs.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dpp.c, this.p, dpp.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(sw $$0) {
      this.e.clear();
      blo.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(sw $$0) {
      blo.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(coz::b)).count();
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
      return this.e.stream().allMatch(coz::b);
   }

   @Override
   public coz a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public coz a(int $$0, int $$1) {
      coz $$2 = Objects.requireNonNullElse(this.e.get($$0), coz.h);
      this.e.set($$0, coz.h);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public coz b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, coz $$1) {
      if ($$1.a(auh.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bln $$0, int $$1, coz $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : coz.c($$2, $$2x) && $$2x.M() + $$2.M() <= Math.min($$2x.g(), $$0.al_()));
   }

   @Override
   public int al_() {
      return 1;
   }

   @Override
   public boolean a(chh $$0) {
      return bln.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, coz $$1) {
      return $$1.a(auh.av) && this.a($$0).b() && $$1.M() == this.al_();
   }

   public int g() {
      return this.f;
   }
}
