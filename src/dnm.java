import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dnm extends dnd implements boj {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final je<csd> e = je.a(6, csd.i);
   private int f = -1;

   public dnm(im $$0, dpy $$1) {
      super(dnf.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dpy $$1 = this.n();

         for (int $$2 = 0; $$2 < ddz.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).d();
            dqp $$4 = ddz.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dur.c, this.p, dur.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      this.e.clear();
      bok.b($$0, this.e, $$1);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      bok.a($$0, this.e, true, $$1);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(csd::d)).count();
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
   public boolean c() {
      return this.e.stream().allMatch(csd::d);
   }

   @Override
   public csd a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public csd a(int $$0, int $$1) {
      csd $$2 = Objects.requireNonNullElse(this.e.get($$0), csd.i);
      this.e.set($$0, csd.i);
      if (!$$2.d()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public csd b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, csd $$1) {
      if ($$1.a(avw.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.d()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(boj $$0, int $$1, csd $$2) {
      return $$0.a_($$2x -> $$2x.d() ? true : csd.c($$2, $$2x) && $$2x.G() + $$2.G() <= Math.min($$2x.i(), $$0.ah_()));
   }

   @Override
   public int ah_() {
      return 1;
   }

   @Override
   public boolean a(ckl $$0) {
      return boj.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, csd $$1) {
      return $$1.a(avw.av) && this.a($$0).d() && $$1.G() == this.ah_();
   }

   public int j() {
      return this.f;
   }

   @Override
   public void a(jv $$0) {
      $$0.a(jz.Q, cux.a).a(this.e);
   }

   @Override
   public void a(jv.a $$0) {
      $$0.a(jz.Q, cux.a(this.e));
   }

   @Override
   public void a(ty $$0) {
      $$0.r("Items");
   }
}
