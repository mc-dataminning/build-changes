import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dvv extends dvl implements btj {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private final kb<cxy> d = kb.a(6, cxy.k);
   private int e = -1;

   public dvv(jj $$0, dym $$1) {
      super(dvn.N, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.e = $$0;
         dym $$1 = this.m();

         for (int $$2 = 0; $$2 < dly.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            dzd $$4 = dly.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.n).a(this.o, $$1, 3);
         this.n.a(edm.c, this.o, edm.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      btk.b($$0, this.d, $$1);
      this.e = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      btk.a($$0, this.d, true, $$1);
      $$0.a("last_interacted_slot", this.e);
   }

   public int f() {
      return (int)this.d.stream().filter(Predicate.not(cxy::f)).count();
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
      return this.d.stream().allMatch(cxy::f);
   }

   @Override
   public cxy a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cxy a(int $$0, int $$1) {
      cxy $$2 = Objects.requireNonNullElse(this.d.get($$0), cxy.k);
      this.d.set($$0, cxy.k);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cxy b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cxy $$1) {
      if ($$1.a(axi.aZ)) {
         this.d.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(btj $$0, int $$1, cxy $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : cxy.c($$2, $$2x) && $$2x.M() + $$2.M() <= $$0.e_($$2x));
   }

   @Override
   public int aj_() {
      return 1;
   }

   @Override
   public boolean a(cqi $$0) {
      return btj.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cxy $$1) {
      return $$1.a(axi.aZ) && this.a($$0).f() && $$1.M() == this.aj_();
   }

   public int j() {
      return this.e;
   }

   @Override
   protected void a(kr $$0) {
      super.a($$0);
      $$0.a(kx.an, dan.a).a(this.d);
   }

   @Override
   protected void a(kt.a $$0) {
      super.a($$0);
      $$0.a(kx.an, dan.a(this.d));
   }

   @Override
   public void a(tw $$0) {
      $$0.r("Items");
   }
}
