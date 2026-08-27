import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cfz extends cfg {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int s = 8;
   public static final int t = 26;
   public static final int u = 44;
   private static final int w = 98;
   public static final int v = 48;
   private final cpq x;
   @Nullable
   private cmf<cms> y;
   private final List<cmf<cms>> z;

   public cfz(int $$0, cbo $$1) {
      this($$0, $$1, cer.a);
   }

   public cfz(int $$0, cbo $$1, cer $$2) {
      super(cfl.u, $$0, $$1, $$2);
      this.x = $$1.m.dK();
      this.z = this.x.q().a(cmi.g);
   }

   @Override
   protected cfh l() {
      return cfh.a()
         .a(0, 8, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().a($$0)))
         .a(1, 26, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().b($$0)))
         .a(2, 44, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().c($$0)))
         .a(3, 98, 48)
         .a();
   }

   @Override
   protected boolean a(dfe $$0) {
      return $$0.a(csr.ob);
   }

   @Override
   protected boolean a(cbp $$0, boolean $$1) {
      return this.y != null && this.y.b().a(this.q, this.x);
   }

   @Override
   protected void a(cbp $$0, cja $$1) {
      $$1.a($$0.dK(), $$0, $$1.L());
      this.r.a($$0, this.n());
      this.e(0);
      this.e(1);
      this.e(2);
      this.o.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cja> n() {
      return List.of(this.q.a(0), this.q.a(1), this.q.a(2));
   }

   private void e(int $$0) {
      cja $$1 = this.q.a($$0);
      if (!$$1.b()) {
         $$1.h(1);
         this.q.a($$0, $$1);
      }
   }

   @Override
   public void m() {
      List<cmf<cms>> $$0 = this.x.q().b(cmi.g, this.q, this.x);
      if ($$0.isEmpty()) {
         this.r.a(0, cja.b);
      } else {
         cmf<cms> $$1 = $$0.get(0);
         cja $$2 = $$1.b().a(this.q, this.x.B_());
         if ($$2.a(this.x.G())) {
            this.y = $$1;
            this.r.a($$1);
            this.r.a(0, $$2);
         }
      }
   }

   @Override
   public int d(cja $$0) {
      return this.e($$0).orElse(0);
   }

   private static OptionalInt a(cms $$0, cja $$1) {
      if ($$0.a($$1)) {
         return OptionalInt.of(0);
      } else if ($$0.b($$1)) {
         return OptionalInt.of(1);
      } else {
         return $$0.c($$1) ? OptionalInt.of(2) : OptionalInt.empty();
      }
   }

   @Override
   public boolean a(cja $$0, cfy $$1) {
      return $$1.d != this.r && super.a($$0, $$1);
   }

   @Override
   public boolean c(cja $$0) {
      return this.e($$0).isPresent();
   }

   private OptionalInt e(cja $$0) {
      return this.z.stream().flatMapToInt($$1 -> a($$1.b(), $$0).stream()).filter($$0x -> !this.b($$0x).f()).findFirst();
   }
}
