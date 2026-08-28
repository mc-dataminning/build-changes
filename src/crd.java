import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class crd extends cqh {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int s = 8;
   public static final int t = 26;
   public static final int u = 44;
   private static final int w = 98;
   public static final int v = 48;
   private final dcd x;
   @Nullable
   private cyi<cyy> y;
   private final List<cyi<cyy>> z;

   public crd(int $$0, cmg $$1) {
      this($$0, $$1, cpq.a);
   }

   public crd(int $$0, cmg $$1, cpq $$2) {
      super(cqm.v, $$0, $$1, $$2);
      this.x = $$1.l.dP();
      this.z = this.x.r().a(cym.g);
   }

   @Override
   protected cqi l() {
      return cqi.a()
         .a(0, 8, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().a($$0)))
         .a(1, 26, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().b($$0)))
         .a(2, 44, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().c($$0)))
         .a(3, 98, 48)
         .a();
   }

   @Override
   protected boolean a(dsh $$0) {
      return $$0.a(dfh.ob);
   }

   @Override
   protected boolean a(cmh $$0, boolean $$1) {
      return this.y != null && this.y.b().a(this.p(), this.x);
   }

   @Override
   protected void a(cmh $$0, cua $$1) {
      $$1.a($$0.dP(), $$0, $$1.H());
      this.r.a($$0, this.n());
      this.e(0);
      this.e(1);
      this.e(2);
      this.o.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cua> n() {
      return List.of(this.q.a(0), this.q.a(1), this.q.a(2));
   }

   private cyz p() {
      return new cyz(this.q.a(0), this.q.a(1), this.q.a(2));
   }

   private void e(int $$0) {
      cua $$1 = this.q.a($$0);
      if (!$$1.e()) {
         $$1.h(1);
         this.q.a($$0, $$1);
      }
   }

   @Override
   public void m() {
      cyz $$0 = this.p();
      List<cyi<cyy>> $$1 = this.x.r().b(cym.g, $$0, this.x);
      if ($$1.isEmpty()) {
         this.r.a(0, cua.l);
      } else {
         cyi<cyy> $$2 = $$1.get(0);
         cua $$3 = $$2.b().a($$0, this.x.H_());
         if ($$3.a(this.x.J())) {
            this.y = $$2;
            this.r.a($$2);
            this.r.a(0, $$3);
         }
      }
   }

   @Override
   public int d(cua $$0) {
      return this.e($$0).orElse(0);
   }

   private static OptionalInt a(cyy $$0, cua $$1) {
      if ($$0.a($$1)) {
         return OptionalInt.of(0);
      } else if ($$0.b($$1)) {
         return OptionalInt.of(1);
      } else {
         return $$0.c($$1) ? OptionalInt.of(2) : OptionalInt.empty();
      }
   }

   @Override
   public boolean a(cua $$0, cra $$1) {
      return $$1.c != this.r && super.a($$0, $$1);
   }

   @Override
   public boolean c(cua $$0) {
      return this.e($$0).isPresent();
   }

   private OptionalInt e(cua $$0) {
      return this.z.stream().flatMapToInt($$1 -> a($$1.b(), $$0).stream()).filter($$0x -> !this.b($$0x).h()).findFirst();
   }
}
