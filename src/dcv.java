import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dcv extends dcm implements bgj {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final hn<ciy> e = hn.a(6, ciy.b);
   private int f = -1;

   public dcv(gu $$0, dfa $$1) {
      super(dco.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dfa $$1 = this.q();

         for (int $$2 = 0; $$2 < ctp.b.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            dfr $$4 = ctp.b.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(djk.c, this.p, djk.a.a($$1));
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
      return (int)this.e.stream().filter(Predicate.not(ciy::b)).count();
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
   public boolean ab_() {
      return this.e.stream().allMatch(ciy::b);
   }

   @Override
   public ciy a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public ciy a(int $$0, int $$1) {
      ciy $$2 = Objects.requireNonNullElse(this.e.get($$0), ciy.b);
      this.e.set($$0, ciy.b);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public ciy b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, ciy $$1) {
      if ($$1.a(apt.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bgj $$0, int $$1, ciy $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : ciy.c($$2, $$2x) && $$2x.L() + $$2.L() <= Math.min($$2x.g(), $$0.ac_()));
   }

   @Override
   public int ac_() {
      return 1;
   }

   @Override
   public boolean a(cbn $$0) {
      return bgj.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, ciy $$1) {
      return $$1.a(apt.av) && this.a($$0).b();
   }

   public int g() {
      return this.f;
   }
}
