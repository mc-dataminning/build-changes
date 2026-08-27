import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ccy extends ccf {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int s = 8;
   public static final int t = 26;
   public static final int u = 44;
   private static final int w = 98;
   public static final int v = 48;
   private final cmm x;
   @Nullable
   private cjp y;
   private final List<cjp> z;

   public ccy(int $$0, byn $$1) {
      this($$0, $$1, cbq.a);
   }

   public ccy(int $$0, byn $$1, cbq $$2) {
      super(cck.u, $$0, $$1, $$2);
      this.x = $$1.m.dI();
      this.z = this.x.q().a(cjf.g);
   }

   @Override
   protected ccg l() {
      return ccg.a()
         .a(0, 8, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.a($$0)))
         .a(1, 26, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b($$0)))
         .a(2, 44, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.c($$0)))
         .a(3, 98, 48)
         .a();
   }

   @Override
   protected boolean a(dcb $$0) {
      return $$0.a(cpo.ob);
   }

   @Override
   protected boolean a(byo $$0, boolean $$1) {
      return this.y != null && this.y.a(this.q, this.x);
   }

   @Override
   protected void a(byo $$0, cfz $$1) {
      $$1.a($$0.dI(), $$0, $$1.L());
      this.r.a($$0, this.n());
      this.e(0);
      this.e(1);
      this.e(2);
      this.o.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cfz> n() {
      return List.of(this.q.a(0), this.q.a(1), this.q.a(2));
   }

   private void e(int $$0) {
      cfz $$1 = this.q.a($$0);
      if (!$$1.b()) {
         $$1.h(1);
         this.q.a($$0, $$1);
      }
   }

   @Override
   public void m() {
      List<cjp> $$0 = this.x.q().b(cjf.g, this.q, this.x);
      if ($$0.isEmpty()) {
         this.r.a(0, cfz.b);
      } else {
         cjp $$1 = $$0.get(0);
         cfz $$2 = $$1.a(this.q, this.x.B_());
         if ($$2.a(this.x.G())) {
            this.y = $$1;
            this.r.a($$1);
            this.r.a(0, $$2);
         }
      }
   }

   @Override
   public int d(cfz $$0) {
      return this.z.stream().map($$1 -> a($$1, $$0)).filter(Optional::isPresent).findFirst().orElse(Optional.of(0)).get();
   }

   private static Optional<Integer> a(cjp $$0, cfz $$1) {
      if ($$0.a($$1)) {
         return Optional.of(0);
      } else if ($$0.b($$1)) {
         return Optional.of(1);
      } else {
         return $$0.c($$1) ? Optional.of(2) : Optional.empty();
      }
   }

   @Override
   public boolean a(cfz $$0, ccx $$1) {
      return $$1.d != this.r && super.a($$0, $$1);
   }

   @Override
   public boolean c(cfz $$0) {
      return this.z.stream().map($$1 -> a($$1, $$0)).anyMatch(Optional::isPresent);
   }
}
