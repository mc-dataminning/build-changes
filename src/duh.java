import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class duh extends dty implements bsc {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final ka<cwo> d = ka.a(6, cwo.j);
   private int e = -1;

   public duh(ji $$0, dww $$1) {
      super(dua.N, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dww $$1 = this.m();

         for (int $$2 = 0; $$2 < dkp.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            dxn $$4 = dkp.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(ebs.c, this.p, ebs.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      bsd.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      bsd.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cwo::f)).count();
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
      return this.d.stream().allMatch(cwo::f);
   }

   @Override
   public cwo a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cwo a(int $$0, int $$1) {
      cwo $$2 = Objects.requireNonNullElse(this.d.get($$0), cwo.j);
      this.d.set($$0, cwo.j);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cwo b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cwo $$1) {
      if ($$1.a(awy.aZ)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bsc $$0, int $$1, cwo $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : cwo.c($$2, $$2x) && $$2x.M() + $$2.M() <= $$0.e_($$2x));
   }

   @Override
   public int an_() {
      return 1;
   }

   @Override
   public boolean a(cow $$0) {
      return bsc.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cwo $$1) {
      return $$1.a(awy.aZ) && this.a($$0).f() && $$1.M() == this.an_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(dty.b $$0) {
      super.a($$0);
      $$0.a(kv.al, czg.a).a(this.d);
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.al, czg.a(this.d));
   }

   @Override
   public void a(tq $$0) {
      $$0.r("Items");
   }
}
