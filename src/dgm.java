import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dgm extends dgd implements bje {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final io<cmh> e = io.a(6, cmh.f);
   private int f = -1;

   public dgm(hv $$0, dip $$1) {
      super(dgf.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dip $$1 = this.r();

         for (int $$2 = 0; $$2 < cxd.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            djg $$4 = cxd.c.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
         this.o.a(dmz.c, this.p, dmz.a.a($$1));
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(sj $$0) {
      this.e.clear();
      bjf.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(sj $$0) {
      bjf.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(cmh::b)).count();
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
      return this.e.stream().allMatch(cmh::b);
   }

   @Override
   public cmh a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public cmh a(int $$0, int $$1) {
      cmh $$2 = Objects.requireNonNullElse(this.e.get($$0), cmh.f);
      this.e.set($$0, cmh.f);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cmh b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cmh $$1) {
      if ($$1.a(arz.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bje $$0, int $$1, cmh $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : cmh.c($$2, $$2x) && $$2x.L() + $$2.L() <= Math.min($$2x.g(), $$0.ak_()));
   }

   @Override
   public int ak_() {
      return 1;
   }

   @Override
   public boolean a(cer $$0) {
      return bje.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cmh $$1) {
      return $$1.a(arz.av) && this.a($$0).b();
   }

   public int g() {
      return this.f;
   }
}
