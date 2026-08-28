import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dvb extends dus implements bsr {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final ka<cxh> d = ka.a(6, cxh.k);
   private int e = -1;

   public dvb(ji $$0, dxq $$1) {
      super(duu.N, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dxq $$1 = this.m();

         for (int $$2 = 0; $$2 < dli.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            dyh $$4 = dli.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.n).a(this.o, $$1, 3);
         this.n.a(ecp.c, this.o, ecp.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      bss.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      bss.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cxh::f)).count();
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
      return this.d.stream().allMatch(cxh::f);
   }

   @Override
   public cxh a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cxh a(int $$0, int $$1) {
      cxh $$2 = Objects.requireNonNullElse(this.d.get($$0), cxh.k);
      this.d.set($$0, cxh.k);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cxh b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cxh $$1) {
      if ($$1.a(awy.aZ)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bsr $$0, int $$1, cxh $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : cxh.c($$2, $$2x) && $$2x.M() + $$2.M() <= $$0.e_($$2x));
   }

   @Override
   public int an_() {
      return 1;
   }

   @Override
   public boolean a(cpr $$0) {
      return bsr.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cxh $$1) {
      return $$1.a(awy.aZ) && this.a($$0).f() && $$1.M() == this.an_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(dus.b $$0) {
      super.a($$0);
      $$0.a(kv.an, czx.a).a(this.d);
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.an, czx.a(this.d));
   }

   @Override
   public void a(tq $$0) {
      $$0.r("Items");
   }
}
