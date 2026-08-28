import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dyo extends dye implements bum {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private static final int d = -1;
   private final jp<daa> e = jp.a(6, daa.k);
   private int f = -1;

   public dyo(iw $$0, ebg $$1) {
      super(dyg.N, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         ebg $$1 = this.m();

         for (int $$2 = 0; $$2 < doj.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            ebx $$4 = doj.c.get($$2);
            $$1 = $$1.b($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.n).a(this.o, $$1, 3);
         this.n.a(egg.c, this.o, egg.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.e.clear();
      bun.b($$0, this.e, $$1);
      this.f = $$0.b("last_interacted_slot", -1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      bun.a($$0, this.e, true, $$1);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(daa::f)).count();
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
   public boolean c() {
      return this.e.stream().allMatch(daa::f);
   }

   @Override
   public daa a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public daa a(int $$0, int $$1) {
      daa $$2 = Objects.requireNonNullElse(this.e.get($$0), daa.k);
      this.e.set($$0, daa.k);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public daa b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, daa $$1) {
      if ($$1.a(axo.bb)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bum $$0, int $$1, daa $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : daa.c($$2, $$2x) && $$2x.M() + $$2.M() <= $$0.f_($$2x));
   }

   @Override
   public int ao_() {
      return 1;
   }

   @Override
   public boolean a(crz $$0) {
      return bum.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, daa $$1) {
      return $$1.a(axo.bb) && this.a($$0).f() && $$1.M() == this.ao_();
   }

   public int j() {
      return this.f;
   }

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      $$0.a(kl.ap, dcs.a).a(this.e);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(kl.ap, dcs.a(this.e));
   }

   @Override
   public void a(ua $$0) {
      $$0.r("Items");
   }
}
