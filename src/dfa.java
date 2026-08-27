import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dfa extends der implements bij {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final il<clb> e = il.a(6, clb.b);
   private int f = -1;

   public dfa(ht $$0, dgw $$1) {
      super(det.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dgw $$1 = this.q();

         for (int $$2 = 0; $$2 < cvx.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            dhn $$4 = cvx.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dlg.c, this.p, dlg.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(rz $$0) {
      this.e.clear();
      bik.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(rz $$0) {
      bik.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(clb::b)).count();
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
      return this.e.stream().allMatch(clb::b);
   }

   @Override
   public clb a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public clb a(int $$0, int $$1) {
      clb $$2 = Objects.requireNonNullElse(this.e.get($$0), clb.b);
      this.e.set($$0, clb.b);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public clb b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, clb $$1) {
      if ($$1.a(ark.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bij $$0, int $$1, clb $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : clb.c($$2, $$2x) && $$2x.L() + $$2.L() <= Math.min($$2x.g(), $$0.aj_()));
   }

   @Override
   public int aj_() {
      return 1;
   }

   @Override
   public boolean a(cdm $$0) {
      return bij.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, clb $$1) {
      return $$1.a(ark.av) && this.a($$0).b();
   }

   public int g() {
      return this.f;
   }
}
