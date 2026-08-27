import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dfm extends dfd implements biq {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final il<clj> e = il.a(6, clj.b);
   private int f = -1;

   public dfm(ht $$0, dhi $$1) {
      super(dff.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dhi $$1 = this.q();

         for (int $$2 = 0; $$2 < cwe.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            dhz $$4 = cwe.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dls.c, this.p, dls.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(rz $$0) {
      this.e.clear();
      bir.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(rz $$0) {
      bir.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(clj::b)).count();
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
      return this.e.stream().allMatch(clj::b);
   }

   @Override
   public clj a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public clj a(int $$0, int $$1) {
      clj $$2 = Objects.requireNonNullElse(this.e.get($$0), clj.b);
      this.e.set($$0, clj.b);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public clj b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, clj $$1) {
      if ($$1.a(aro.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(biq $$0, int $$1, clj $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : clj.c($$2, $$2x) && $$2x.L() + $$2.L() <= Math.min($$2x.g(), $$0.aj_()));
   }

   @Override
   public int aj_() {
      return 1;
   }

   @Override
   public boolean a(cdu $$0) {
      return biq.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, clj $$1) {
      return $$1.a(aro.av) && this.a($$0).b();
   }

   public int g() {
      return this.f;
   }
}
