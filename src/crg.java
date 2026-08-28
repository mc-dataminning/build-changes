import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class crg extends cqk {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int s = 8;
   public static final int t = 26;
   public static final int u = 44;
   private static final int w = 98;
   public static final int v = 48;
   private final dcf x;
   @Nullable
   private cyk<cza> y;
   private final List<cyk<cza>> z;

   public crg(int $$0, cmj $$1) {
      this($$0, $$1, cpt.a);
   }

   public crg(int $$0, cmj $$1, cpt $$2) {
      super(cqp.v, $$0, $$1, $$2);
      this.x = $$1.l.dQ();
      this.z = this.x.r().a(cyo.g);
   }

   @Override
   protected cql l() {
      return cql.a()
         .a(0, 8, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().a($$0)))
         .a(1, 26, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().b($$0)))
         .a(2, 44, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().c($$0)))
         .a(3, 98, 48)
         .a();
   }

   @Override
   protected boolean a(dsk $$0) {
      return $$0.a(dfj.ob);
   }

   @Override
   protected boolean a(cmk $$0, boolean $$1) {
      return this.y != null && this.y.b().a(this.p(), this.x);
   }

   @Override
   protected void a(cmk $$0, cuc $$1) {
      $$1.a($$0.dQ(), $$0, $$1.H());
      this.r.a($$0, this.n());
      this.e(0);
      this.e(1);
      this.e(2);
      this.o.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cuc> n() {
      return List.of(this.q.a(0), this.q.a(1), this.q.a(2));
   }

   private czb p() {
      return new czb(this.q.a(0), this.q.a(1), this.q.a(2));
   }

   private void e(int $$0) {
      cuc $$1 = this.q.a($$0);
      if (!$$1.e()) {
         $$1.h(1);
         this.q.a($$0, $$1);
      }
   }

   @Override
   public void m() {
      czb $$0 = this.p();
      List<cyk<cza>> $$1 = this.x.r().b(cyo.g, $$0, this.x);
      if ($$1.isEmpty()) {
         this.r.a(0, cuc.l);
      } else {
         cyk<cza> $$2 = $$1.get(0);
         cuc $$3 = $$2.b().a($$0, this.x.H_());
         if ($$3.a(this.x.J())) {
            this.y = $$2;
            this.r.a($$2);
            this.r.a(0, $$3);
         }
      }
   }

   @Override
   public int d(cuc $$0) {
      return this.e($$0).orElse(0);
   }

   private static OptionalInt a(cza $$0, cuc $$1) {
      if ($$0.a($$1)) {
         return OptionalInt.of(0);
      } else if ($$0.b($$1)) {
         return OptionalInt.of(1);
      } else {
         return $$0.c($$1) ? OptionalInt.of(2) : OptionalInt.empty();
      }
   }

   @Override
   public boolean a(cuc $$0, crd $$1) {
      return $$1.c != this.r && super.a($$0, $$1);
   }

   @Override
   public boolean c(cuc $$0) {
      return this.e($$0).isPresent();
   }

   private OptionalInt e(cuc $$0) {
      return this.z.stream().flatMapToInt($$1 -> a($$1.b(), $$0).stream()).filter($$0x -> !this.b($$0x).h()).findFirst();
   }
}
