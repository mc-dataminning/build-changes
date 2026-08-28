import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dpq extends dph implements bqn {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final jr<cup> d = jr.a(6, cup.l);
   private int e = -1;

   public dpq(iz $$0, dsc $$1) {
      super(dpj.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dsc $$1 = this.n();

         for (int $$2 = 0; $$2 < dgd.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).e();
            dst $$4 = dgd.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.n).a(this.o, $$1, 3);
         this.n.a(dwv.c, this.o, dwv.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      bqo.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      bqo.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cup::e)).count();
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
      return this.d.stream().allMatch(cup::e);
   }

   @Override
   public cup a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cup a(int $$0, int $$1) {
      cup $$2 = Objects.requireNonNullElse(this.d.get($$0), cup.l);
      this.d.set($$0, cup.l);
      if (!$$2.e()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cup b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cup $$1) {
      if ($$1.a(awy.aW)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.e()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bqn $$0, int $$1, cup $$2) {
      return $$0.a_($$2x -> $$2x.e() ? true : cup.c($$2, $$2x) && $$2x.I() + $$2.I() <= $$0.e_($$2x));
   }

   @Override
   public int ah_() {
      return 1;
   }

   @Override
   public boolean a(cmx $$0) {
      return bqn.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cup $$1) {
      return $$1.a(awy.aW) && this.a($$0).e() && $$1.I() == this.ah_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(dph.b $$0) {
      super.a($$0);
      $$0.a(km.aa, cxl.a).a(this.d);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.aa, cxl.a(this.d));
   }

   @Override
   public void a(us $$0) {
      $$0.r("Items");
   }
}
