import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class deg extends ddx implements bhu {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final il<ckj> e = il.a(6, ckj.b);
   private int f = -1;

   public deg(ht $$0, dgb $$1) {
      super(ddz.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dgb $$1 = this.q();

         for (int $$2 = 0; $$2 < cve.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            dgs $$4 = cve.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dkl.c, this.p, dkl.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(rt $$0) {
      this.e.clear();
      bhv.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(rt $$0) {
      bhv.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(ckj::b)).count();
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
   public boolean ai_() {
      return this.e.stream().allMatch(ckj::b);
   }

   @Override
   public ckj a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public ckj a(int $$0, int $$1) {
      ckj $$2 = Objects.requireNonNullElse(this.e.get($$0), ckj.b);
      this.e.set($$0, ckj.b);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public ckj b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, ckj $$1) {
      if ($$1.a(ara.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bhu $$0, int $$1, ckj $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : ckj.c($$2, $$2x) && $$2x.L() + $$2.L() <= Math.min($$2x.g(), $$0.aj_()));
   }

   @Override
   public int aj_() {
      return 1;
   }

   @Override
   public boolean a(ccx $$0) {
      return bhu.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, ckj $$1) {
      return $$1.a(ara.av) && this.a($$0).b();
   }

   public int g() {
      return this.f;
   }
}
