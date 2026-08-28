import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dxp extends dxf implements btw {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jn<czd> d = jn.a(6, czd.k);
   private int e = -1;

   public dxp(iu $$0, eah $$1) {
      super(dxh.N, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         eah $$1 = this.m();

         for (int $$2 = 0; $$2 < dnk.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            eay $$4 = dnk.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.n).a(this.o, $$1, 3);
         this.n.a(efh.c, this.o, efh.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      btx.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      btx.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(czd::f)).count();
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
      return this.d.stream().allMatch(czd::f);
   }

   @Override
   public czd a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public czd a(int $$0, int $$1) {
      czd $$2 = Objects.requireNonNullElse(this.d.get($$0), czd.k);
      this.d.set($$0, czd.k);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public czd b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, czd $$1) {
      if ($$1.a(axk.ba)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(btw $$0, int $$1, czd $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : czd.c($$2, $$2x) && $$2x.M() + $$2.M() <= $$0.f_($$2x));
   }

   @Override
   public int ak_() {
      return 1;
   }

   @Override
   public boolean a(crc $$0) {
      return btw.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, czd $$1) {
      return $$1.a(axk.ba) && this.a($$0).f() && $$1.M() == this.ak_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      $$0.a(kj.ap, dbv.a).a(this.d);
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.ap, dbv.a(this.d));
   }

   @Override
   public void a(tz $$0) {
      $$0.r("Items");
   }
}
