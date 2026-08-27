import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dcu extends dcl implements bgj {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final hn<cix> e = hn.a(6, cix.b);
   private int f = -1;

   public dcu(gu $$0, dez $$1) {
      super(dcn.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dez $$1 = this.q();

         for (int $$2 = 0; $$2 < cto.b.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            dfq $$4 = cto.b.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(djj.c, this.p, djj.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(qr $$0) {
      this.e.clear();
      bgk.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(qr $$0) {
      bgk.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(cix::b)).count();
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
      return this.e.stream().allMatch(cix::b);
   }

   @Override
   public cix a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public cix a(int $$0, int $$1) {
      cix $$2 = Objects.requireNonNullElse(this.e.get($$0), cix.b);
      this.e.set($$0, cix.b);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cix b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cix $$1) {
      if ($$1.a(apt.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bgj $$0, int $$1, cix $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : cix.c($$2, $$2x) && $$2x.L() + $$2.L() <= Math.min($$2x.g(), $$0.ab_()));
   }

   @Override
   public int ab_() {
      return 1;
   }

   @Override
   public boolean a(cbm $$0) {
      return bgj.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cix $$1) {
      return $$1.a(apt.av) && this.a($$0).b();
   }

   public int g() {
      return this.f;
   }
}
