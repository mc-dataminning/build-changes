import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dcz extends dcq implements bgm {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final hp<cja> e = hp.a(6, cja.b);
   private int f = -1;

   public dcz(gw $$0, dfe $$1) {
      super(dcs.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dfe $$1 = this.q();

         for (int $$2 = 0; $$2 < ctt.b.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            dfv $$4 = ctt.b.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(djo.c, this.p, djo.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(qu $$0) {
      this.e.clear();
      bgn.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(qu $$0) {
      bgn.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(cja::b)).count();
   }

   @Override
   public void a() {
      this.e.clear();
   }

   @Override
   public int b() {
      return 6;
   }

   @Override
   public boolean aa_() {
      return this.e.stream().allMatch(cja::b);
   }

   @Override
   public cja a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public cja a(int $$0, int $$1) {
      cja $$2 = Objects.requireNonNullElse(this.e.get($$0), cja.b);
      this.e.set($$0, cja.b);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cja b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cja $$1) {
      if ($$1.a(apw.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bgm $$0, int $$1, cja $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : cja.c($$2, $$2x) && $$2x.L() + $$2.L() <= Math.min($$2x.g(), $$0.ab_()));
   }

   @Override
   public int ab_() {
      return 1;
   }

   @Override
   public boolean a(cbp $$0) {
      return bgm.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cja $$1) {
      return $$1.a(apw.av) && this.a($$0).b();
   }

   public int g() {
      return this.f;
   }
}
