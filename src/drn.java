import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class drn extends dre implements brd {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jw<cvl> d = jw.a(6, cvl.k);
   private int e = -1;

   public drn(je $$0, dua $$1) {
      super(drg.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dua $$1 = this.m();

         for (int $$2 = 0; $$2 < dhz.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            dur $$4 = dhz.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dyx.c, this.p, dyx.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      bre.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      bre.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cvl::f)).count();
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
      return this.d.stream().allMatch(cvl::f);
   }

   @Override
   public cvl a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cvl a(int $$0, int $$1) {
      cvl $$2 = Objects.requireNonNullElse(this.d.get($$0), cvl.k);
      this.d.set($$0, cvl.k);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cvl b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cvl $$1) {
      if ($$1.a(axb.aV)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(brd $$0, int $$1, cvl $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : cvl.c($$2, $$2x) && $$2x.J() + $$2.J() <= $$0.f_($$2x));
   }

   @Override
   public int ak_() {
      return 1;
   }

   @Override
   public boolean a(cnp $$0) {
      return brd.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cvl $$1) {
      return $$1.a(axb.aV) && this.a($$0).f() && $$1.J() == this.ak_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(dre.b $$0) {
      super.a($$0);
      $$0.a(kr.ad, cyh.a).a(this.d);
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kr.ad, cyh.a(this.d));
   }

   @Override
   public void a(uf $$0) {
      $$0.r("Items");
   }
}
