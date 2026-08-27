import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class czw extends czn implements bdq {
   public static final int c = 6;
   private static final Logger d = LogUtils.getLogger();
   private final hn<cfz> e = hn.a(6, cfz.b);
   private int f = -1;

   public czw(gu $$0, dcb $$1) {
      super(czp.M, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         dcb $$1 = this.q();

         for (int $$2 = 0; $$2 < cqq.b.size(); $$2++) {
            boolean $$3 = !this.a($$2).b();
            dcs $$4 = cqq.b.get($$2);
            $$1 = $$1.a($$4, Boolean.valueOf($$3));
         }

         Objects.requireNonNull(this.o).a(this.p, $$1, 3);
      } else {
         d.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   public void a(qr $$0) {
      this.e.clear();
      bdr.b($$0, this.e);
      this.f = $$0.h("last_interacted_slot");
   }

   @Override
   protected void b(qr $$0) {
      bdr.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(cfz::b)).count();
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
      return this.e.stream().allMatch(cfz::b);
   }

   @Override
   public cfz a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public cfz a(int $$0, int $$1) {
      cfz $$2 = Objects.requireNonNullElse(this.e.get($$0), cfz.b);
      this.e.set($$0, cfz.b);
      if (!$$2.b()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public cfz b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, cfz $$1) {
      if ($$1.a(ane.av)) {
         this.e.set($$0, $$1);
         this.c($$0);
      }
   }

   @Override
   public boolean a(bdq $$0, int $$1, cfz $$2) {
      return $$0.a_($$2x -> $$2x.b() ? true : cfz.c($$2, $$2x) && $$2x.L() + $$2.L() <= Math.min($$2x.g(), $$0.ac_()));
   }

   @Override
   public int ac_() {
      return 1;
   }

   @Override
   public boolean a(byo $$0) {
      return bdq.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cfz $$1) {
      return $$1.a(ane.av) && this.a($$0).b();
   }

   public int g() {
      return this.f;
   }
}
