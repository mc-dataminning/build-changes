import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dps extends dpj implements bqp {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jr<cur> d = jr.a(6, cur.l);
   private int e = -1;

   public dps(iz $$0, dse $$1) {
      super(dpl.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dse $$1 = this.n();

         for (int $$2 = 0; $$2 < dgf.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).e();
            dsv $$4 = dgf.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.n).a(this.o, $$1, 3);
         this.n.a(dwx.c, this.o, dwx.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      bqq.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      bqq.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cur::e)).count();
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
      return this.d.stream().allMatch(cur::e);
   }

   @Override
   public cur a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cur a(int $$0, int $$1) {
      cur $$2 = Objects.requireNonNullElse(this.d.get($$0), cur.l);
      this.d.set($$0, cur.l);
      if (!$$2.e()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cur b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cur $$1) {
      if ($$1.a(awy.aW)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.e()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bqp $$0, int $$1, cur $$2) {
      return $$0.a_($$2x -> $$2x.e() ? true : cur.c($$2, $$2x) && $$2x.I() + $$2.I() <= $$0.e_($$2x));
   }

   @Override
   public int ah_() {
      return 1;
   }

   @Override
   public boolean a(cmz $$0) {
      return bqp.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cur $$1) {
      return $$1.a(awy.aW) && this.a($$0).e() && $$1.I() == this.ah_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(dpj.b $$0) {
      super.a($$0);
      $$0.a(km.aa, cxn.a).a(this.d);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.aa, cxn.a(this.d));
   }

   @Override
   public void a(us $$0) {
      $$0.r("Items");
   }
}
