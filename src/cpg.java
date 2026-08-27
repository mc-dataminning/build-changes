import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cpg extends coj {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int s = 8;
   public static final int t = 26;
   public static final int u = 44;
   private static final int w = 98;
   public static final int v = 48;
   private final czu x;
   @Nullable
   private cwi<cww> y;
   private final List<cwi<cww>> z;

   public cpg(int $$0, ckk $$1) {
      this($$0, $$1, cns.a);
   }

   public cpg(int $$0, ckk $$1, cns $$2) {
      super(cop.v, $$0, $$1, $$2);
      this.x = $$1.m.dN();
      this.z = this.x.r().a(cwl.g);
   }

   @Override
   protected cok l() {
      return cok.a()
         .a(0, 8, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().a($$0)))
         .a(1, 26, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().b($$0)))
         .a(2, 44, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().c($$0)))
         .a(3, 98, 48)
         .a();
   }

   @Override
   protected boolean a(dpy $$0) {
      return $$0.a(dcx.ob);
   }

   @Override
   protected boolean a(ckl $$0, boolean $$1) {
      return this.y != null && this.y.b().a(this.q, this.x);
   }

   @Override
   protected void a(ckl $$0, csd $$1) {
      $$1.a($$0.dN(), $$0, $$1.G());
      this.r.a($$0, this.n());
      this.e(0);
      this.e(1);
      this.e(2);
      this.o.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<csd> n() {
      return List.of(this.q.a(0), this.q.a(1), this.q.a(2));
   }

   private void e(int $$0) {
      csd $$1 = this.q.a($$0);
      if (!$$1.d()) {
         $$1.g(1);
         this.q.a($$0, $$1);
      }
   }

   @Override
   public void m() {
      List<cwi<cww>> $$0 = this.x.r().b(cwl.g, this.q, this.x);
      if ($$0.isEmpty()) {
         this.r.a(0, csd.i);
      } else {
         cwi<cww> $$1 = $$0.get(0);
         csd $$2 = $$1.b().a(this.q, this.x.H_());
         if ($$2.a(this.x.J())) {
            this.y = $$1;
            this.r.a($$1);
            this.r.a(0, $$2);
         }
      }
   }

   @Override
   public int d(csd $$0) {
      return this.e($$0).orElse(0);
   }

   private static OptionalInt a(cww $$0, csd $$1) {
      if ($$0.a($$1)) {
         return OptionalInt.of(0);
      } else if ($$0.b($$1)) {
         return OptionalInt.of(1);
      } else {
         return $$0.c($$1) ? OptionalInt.of(2) : OptionalInt.empty();
      }
   }

   @Override
   public boolean a(csd $$0, cpd $$1) {
      return $$1.d != this.r && super.a($$0, $$1);
   }

   @Override
   public boolean c(csd $$0) {
      return this.e($$0).isPresent();
   }

   private OptionalInt e(csd $$0) {
      return this.z.stream().flatMapToInt($$1 -> a($$1.b(), $$0).stream()).filter($$0x -> !this.b($$0x).h()).findFirst();
   }
}
