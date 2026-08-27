import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class col extends cnr {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int s = 8;
   public static final int t = 26;
   public static final int u = 44;
   private static final int w = 98;
   public static final int v = 48;
   private final cyx x;
   @Nullable
   private cvl<cvz> y;
   private final List<cvl<cvz>> z;

   public col(int $$0, cjs $$1) {
      this($$0, $$1, cna.a);
   }

   public col(int $$0, cjs $$1, cna $$2) {
      super(cnw.v, $$0, $$1, $$2);
      this.x = $$1.m.dM();
      this.z = this.x.r().a(cvo.g);
   }

   @Override
   protected cns l() {
      return cns.a()
         .a(0, 8, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().a($$0)))
         .a(1, 26, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().b($$0)))
         .a(2, 44, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().c($$0)))
         .a(3, 98, 48)
         .a();
   }

   @Override
   protected boolean a(doz $$0) {
      return $$0.a(dca.ob);
   }

   @Override
   protected boolean a(cjt $$0, boolean $$1) {
      return this.y != null && this.y.b().a(this.q, this.x);
   }

   @Override
   protected void a(cjt $$0, crj $$1) {
      $$1.a($$0.dM(), $$0, $$1.G());
      this.r.a($$0, this.n());
      this.e(0);
      this.e(1);
      this.e(2);
      this.o.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<crj> n() {
      return List.of(this.q.a(0), this.q.a(1), this.q.a(2));
   }

   private void e(int $$0) {
      crj $$1 = this.q.a($$0);
      if (!$$1.d()) {
         $$1.g(1);
         this.q.a($$0, $$1);
      }
   }

   @Override
   public void m() {
      List<cvl<cvz>> $$0 = this.x.r().b(cvo.g, this.q, this.x);
      if ($$0.isEmpty()) {
         this.r.a(0, crj.i);
      } else {
         cvl<cvz> $$1 = $$0.get(0);
         crj $$2 = $$1.b().a(this.q, this.x.H_());
         if ($$2.a(this.x.J())) {
            this.y = $$1;
            this.r.a($$1);
            this.r.a(0, $$2);
         }
      }
   }

   @Override
   public int d(crj $$0) {
      return this.e($$0).orElse(0);
   }

   private static OptionalInt a(cvz $$0, crj $$1) {
      if ($$0.a($$1)) {
         return OptionalInt.of(0);
      } else if ($$0.b($$1)) {
         return OptionalInt.of(1);
      } else {
         return $$0.c($$1) ? OptionalInt.of(2) : OptionalInt.empty();
      }
   }

   @Override
   public boolean a(crj $$0, cok $$1) {
      return $$1.d != this.r && super.a($$0, $$1);
   }

   @Override
   public boolean c(crj $$0) {
      return this.e($$0).isPresent();
   }

   private OptionalInt e(crj $$0) {
      return this.z.stream().flatMapToInt($$1 -> a($$1.b(), $$0).stream()).filter($$0x -> !this.b($$0x).h()).findFirst();
   }
}
