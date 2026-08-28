import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dqo extends dqf implements bqj {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jv<cuo> d = jv.a(6, cuo.l);
   private int e = -1;

   public dqo(jd $$0, dta $$1) {
      super(dqh.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dta $$1 = this.n();

         for (int $$2 = 0; $$2 < dha.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).e();
            dtr $$4 = dha.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.n).a(this.o, $$1, 3);
         this.n.a(dxw.c, this.o, dxw.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      bqk.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      bqk.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cuo::e)).count();
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
      return this.d.stream().allMatch(cuo::e);
   }

   @Override
   public cuo a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cuo a(int $$0, int $$1) {
      cuo $$2 = Objects.requireNonNullElse(this.d.get($$0), cuo.l);
      this.d.set($$0, cuo.l);
      if (!$$2.e()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cuo b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cuo $$1) {
      if ($$1.a(awm.aV)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.e()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bqj $$0, int $$1, cuo $$2) {
      return $$0.a_($$2x -> $$2x.e() ? true : cuo.c($$2, $$2x) && $$2x.H() + $$2.H() <= $$0.e_($$2x));
   }

   @Override
   public int ah_() {
      return 1;
   }

   @Override
   public boolean a(cmv $$0) {
      return bqj.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cuo $$1) {
      return $$1.a(awm.aV) && this.a($$0).e() && $$1.H() == this.ah_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(dqf.b $$0) {
      super.a($$0);
      $$0.a(kq.ab, cxm.a).a(this.d);
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.ab, cxm.a(this.d));
   }

   @Override
   public void a(ua $$0) {
      $$0.r("Items");
   }
}
