import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dug extends dtx implements bsb {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final ka<cwn> d = ka.a(6, cwn.j);
   private int e = -1;

   public dug(ji $$0, dwv $$1) {
      super(dtz.N, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dwv $$1 = this.m();

         for (int $$2 = 0; $$2 < dko.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            dxm $$4 = dko.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(ebr.c, this.p, ebr.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      bsc.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      bsc.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cwn::f)).count();
   }

   @Override
   public void a() {
      this.d.clear();
   }

   @Override
   public int b() {
      return 6;
   }

   @Override
   public boolean c() {
      return this.d.stream().allMatch(cwn::f);
   }

   @Override
   public cwn a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cwn a(int $$0, int $$1) {
      cwn $$2 = Objects.requireNonNullElse(this.d.get($$0), cwn.j);
      this.d.set($$0, cwn.j);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cwn b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cwn $$1) {
      if ($$1.a(awx.aZ)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bsb $$0, int $$1, cwn $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : cwn.c($$2, $$2x) && $$2x.M() + $$2.M() <= $$0.e_($$2x));
   }

   @Override
   public int an_() {
      return 1;
   }

   @Override
   public boolean a(cov $$0) {
      return bsb.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cwn $$1) {
      return $$1.a(awx.aZ) && this.a($$0).f() && $$1.M() == this.an_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(dtx.b $$0) {
      super.a($$0);
      $$0.a(kv.al, czf.a).a(this.d);
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.al, czf.a(this.d));
   }

   @Override
   public void a(tq $$0) {
      $$0.r("Items");
   }
}
