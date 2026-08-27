import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cge extends cfl {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int s = 8;
   public static final int t = 26;
   public static final int u = 44;
   private static final int w = 98;
   public static final int v = 48;
   private final cpv x;
   @Nullable
   private cmk<cmx> y;
   private final List<cmk<cmx>> z;

   public cge(int $$0, cbt $$1) {
      this($$0, $$1, cew.a);
   }

   public cge(int $$0, cbt $$1, cew $$2) {
      super(cfq.u, $$0, $$1, $$2);
      this.x = $$1.m.dL();
      this.z = this.x.q().a(cmn.g);
   }

   @Override
   protected cfm l() {
      return cfm.a()
         .a(0, 8, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().a($$0)))
         .a(1, 26, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().b($$0)))
         .a(2, 44, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().c($$0)))
         .a(3, 98, 48)
         .a();
   }

   @Override
   protected boolean a(dfj $$0) {
      return $$0.a(csw.ob);
   }

   @Override
   protected boolean a(cbu $$0, boolean $$1) {
      return this.y != null && this.y.b().a(this.q, this.x);
   }

   @Override
   protected void a(cbu $$0, cjf $$1) {
      $$1.a($$0.dL(), $$0, $$1.L());
      this.r.a($$0, this.n());
      this.e(0);
      this.e(1);
      this.e(2);
      this.o.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cjf> n() {
      return List.of(this.q.a(0), this.q.a(1), this.q.a(2));
   }

   private void e(int $$0) {
      cjf $$1 = this.q.a($$0);
      if (!$$1.b()) {
         $$1.h(1);
         this.q.a($$0, $$1);
      }
   }

   @Override
   public void m() {
      List<cmk<cmx>> $$0 = this.x.q().b(cmn.g, this.q, this.x);
      if ($$0.isEmpty()) {
         this.r.a(0, cjf.b);
      } else {
         cmk<cmx> $$1 = $$0.get(0);
         cjf $$2 = $$1.b().a(this.q, this.x.G_());
         if ($$2.a(this.x.G())) {
            this.y = $$1;
            this.r.a($$1);
            this.r.a(0, $$2);
         }
      }
   }

   @Override
   public int d(cjf $$0) {
      return this.e($$0).orElse(0);
   }

   private static OptionalInt a(cmx $$0, cjf $$1) {
      if ($$0.a($$1)) {
         return OptionalInt.of(0);
      } else if ($$0.b($$1)) {
         return OptionalInt.of(1);
      } else {
         return $$0.c($$1) ? OptionalInt.of(2) : OptionalInt.empty();
      }
   }

   @Override
   public boolean a(cjf $$0, cgd $$1) {
      return $$1.d != this.r && super.a($$0, $$1);
   }

   @Override
   public boolean c(cjf $$0) {
      return this.e($$0).isPresent();
   }

   private OptionalInt e(cjf $$0) {
      return this.z.stream().flatMapToInt($$1 -> a($$1.b(), $$0).stream()).filter($$0x -> !this.b($$0x).f()).findFirst();
   }
}
