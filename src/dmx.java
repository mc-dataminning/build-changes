import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dmx extends dmo implements bny {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final iw<crs> e = iw.a(6, crs.i);
   private int f = -1;

   public dmx(id $$0, dpi $$1) {
      super(dmq.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dpi $$1 = this.n();

         for (int $$2 = 0; $$2 < ddl.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).d();
            dpz $$4 = ddl.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dub.c, this.p, dub.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      this.e.clear();
      bnz.b($$0, this.e, $$1);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      bnz.a($$0, this.e, true, $$1);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(crs::d)).count();
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
      return this.e.stream().allMatch(crs::d);
   }

   @Override
   public crs a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public crs a(int $$0, int $$1) {
      crs $$2 = Objects.requireNonNullElse(this.e.get($$0), crs.i);
      this.e.set($$0, crs.i);
      if (!$$2.d()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public crs b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, crs $$1) {
      if ($$1.a(avm.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.d()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bny $$0, int $$1, crs $$2) {
      return $$0.a_($$2x -> $$2x.d() ? true : crs.c($$2, $$2x) && $$2x.G() + $$2.G() <= Math.min($$2x.i(), $$0.ah_()));
   }

   @Override
   public int ah_() {
      return 1;
   }

   @Override
   public boolean a(cka $$0) {
      return bny.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, crs $$1) {
      return $$1.a(avm.av) && this.a($$0).d() && $$1.G() == this.ah_();
   }

   public int j() {
      return this.f;
   }

   @Override
   public void a(jn $$0) {
      $$0.a(jr.Q, cuj.a).a(this.e);
   }

   @Override
   public void a(jn.a $$0) {
      $$0.a(jr.Q, cuj.a(this.e));
   }

   @Override
   public void a(to $$0) {
      $$0.r("Items");
   }
}
