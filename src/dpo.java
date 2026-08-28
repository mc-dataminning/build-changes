import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dpo extends dpf implements bql {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jr<cun> d = jr.a(6, cun.l);
   private int e = -1;

   public dpo(iz $$0, dsa $$1) {
      super(dph.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dsa $$1 = this.n();

         for (int $$2 = 0; $$2 < dgb.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).e();
            dsr $$4 = dgb.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.n).a(this.o, $$1, 3);
         this.n.a(dwt.c, this.o, dwt.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      bqm.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      bqm.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cun::e)).count();
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
      return this.d.stream().allMatch(cun::e);
   }

   @Override
   public cun a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cun a(int $$0, int $$1) {
      cun $$2 = Objects.requireNonNullElse(this.d.get($$0), cun.l);
      this.d.set($$0, cun.l);
      if (!$$2.e()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cun b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cun $$1) {
      if ($$1.a(awx.aW)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.e()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bql $$0, int $$1, cun $$2) {
      return $$0.a_($$2x -> $$2x.e() ? true : cun.c($$2, $$2x) && $$2x.I() + $$2.I() <= $$0.e_($$2x));
   }

   @Override
   public int ai_() {
      return 1;
   }

   @Override
   public boolean a(cmv $$0) {
      return bql.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cun $$1) {
      return $$1.a(awx.aW) && this.a($$0).e() && $$1.I() == this.ai_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(dpf.b $$0) {
      super.a($$0);
      $$0.a(km.Z, cxj.a).a(this.d);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.Z, cxj.a(this.d));
   }

   @Override
   public void a(ur $$0) {
      $$0.r("Items");
   }
}
