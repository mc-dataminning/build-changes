import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cmb extends clh {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int s = 8;
   public static final int t = 26;
   public static final int u = 44;
   private static final int w = 98;
   public static final int v = 48;
   private final cvr x;
   @Nullable
   private csh<csv> y;
   private final List<csh<csv>> z;

   public cmb(int $$0, chk $$1) {
      this($$0, $$1, ckq.a);
   }

   public cmb(int $$0, chk $$1, ckq $$2) {
      super(clm.v, $$0, $$1, $$2);
      this.x = $$1.m.dM();
      this.z = this.x.r().a(csk.g);
   }

   @Override
   protected cli l() {
      return cli.a()
         .a(0, 8, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().a($$0)))
         .a(1, 26, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().b($$0)))
         .a(2, 44, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().c($$0)))
         .a(3, 98, 48)
         .a();
   }

   @Override
   protected boolean a(dlj $$0) {
      return $$0.a(cyu.ob);
   }

   @Override
   protected boolean a(chl $$0, boolean $$1) {
      return this.y != null && this.y.b().a(this.q, this.x);
   }

   @Override
   protected void a(chl $$0, cpd $$1) {
      $$1.a($$0.dM(), $$0, $$1.M());
      this.r.a($$0, this.n());
      this.e(0);
      this.e(1);
      this.e(2);
      this.o.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cpd> n() {
      return List.of(this.q.a(0), this.q.a(1), this.q.a(2));
   }

   private void e(int $$0) {
      cpd $$1 = this.q.a($$0);
      if (!$$1.b()) {
         $$1.h(1);
         this.q.a($$0, $$1);
      }
   }

   @Override
   public void m() {
      List<csh<csv>> $$0 = this.x.r().b(csk.g, this.q, this.x);
      if ($$0.isEmpty()) {
         this.r.a(0, cpd.h);
      } else {
         csh<csv> $$1 = $$0.get(0);
         cpd $$2 = $$1.b().a(this.q, this.x.I_());
         if ($$2.a(this.x.I())) {
            this.y = $$1;
            this.r.a($$1);
            this.r.a(0, $$2);
         }
      }
   }

   @Override
   public int d(cpd $$0) {
      return this.e($$0).orElse(0);
   }

   private static OptionalInt a(csv $$0, cpd $$1) {
      if ($$0.a($$1)) {
         return OptionalInt.of(0);
      } else if ($$0.b($$1)) {
         return OptionalInt.of(1);
      } else {
         return $$0.c($$1) ? OptionalInt.of(2) : OptionalInt.empty();
      }
   }

   @Override
   public boolean a(cpd $$0, cma $$1) {
      return $$1.d != this.r && super.a($$0, $$1);
   }

   @Override
   public boolean c(cpd $$0) {
      return this.e($$0).isPresent();
   }

   private OptionalInt e(cpd $$0) {
      return this.z.stream().flatMapToInt($$1 -> a($$1.b(), $$0).stream()).filter($$0x -> !this.b($$0x).h()).findFirst();
   }
}
