import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dui extends dtz implements bsd {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final ka<cwp> d = ka.a(6, cwp.j);
   private int e = -1;

   public dui(ji $$0, dwx $$1) {
      super(dub.N, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dwx $$1 = this.m();

         for (int $$2 = 0; $$2 < dkq.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            dxo $$4 = dkq.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.n).a(this.o, $$1, 3);
         this.n.a(ebt.c, this.o, ebt.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      bse.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      bse.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cwp::f)).count();
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
      return this.d.stream().allMatch(cwp::f);
   }

   @Override
   public cwp a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cwp a(int $$0, int $$1) {
      cwp $$2 = Objects.requireNonNullElse(this.d.get($$0), cwp.j);
      this.d.set($$0, cwp.j);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cwp b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cwp $$1) {
      if ($$1.a(awy.aZ)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bsd $$0, int $$1, cwp $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : cwp.c($$2, $$2x) && $$2x.M() + $$2.M() <= $$0.e_($$2x));
   }

   @Override
   public int an_() {
      return 1;
   }

   @Override
   public boolean a(cox $$0) {
      return bsd.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cwp $$1) {
      return $$1.a(awy.aZ) && this.a($$0).f() && $$1.M() == this.an_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(dtz.b $$0) {
      super.a($$0);
      $$0.a(kv.al, czh.a).a(this.d);
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.al, czh.a(this.d));
   }

   @Override
   public void a(tq $$0) {
      $$0.r("Items");
   }
}
