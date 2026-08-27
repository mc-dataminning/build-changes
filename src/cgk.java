import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cgk extends cfr {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int s = 8;
   public static final int t = 26;
   public static final int u = 44;
   private static final int w = 98;
   public static final int v = 48;
   private final cqb x;
   @Nullable
   private cmq<cnd> y;
   private final List<cmq<cnd>> z;

   public cgk(int $$0, cbz $$1) {
      this($$0, $$1, cfc.a);
   }

   public cgk(int $$0, cbz $$1, cfc $$2) {
      super(cfw.u, $$0, $$1, $$2);
      this.x = $$1.m.dL();
      this.z = this.x.q().a(cmt.g);
   }

   @Override
   protected cfs l() {
      return cfs.a()
         .a(0, 8, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().a($$0)))
         .a(1, 26, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().b($$0)))
         .a(2, 44, 48, $$0 -> this.z.stream().anyMatch($$1 -> $$1.b().c($$0)))
         .a(3, 98, 48)
         .a();
   }

   @Override
   protected boolean a(dfd $$0) {
      return $$0.a(cte.ob);
   }

   @Override
   protected boolean a(cca $$0, boolean $$1) {
      return this.y != null && this.y.b().a(this.q, this.x);
   }

   @Override
   protected void a(cca $$0, cjl $$1) {
      $$1.a($$0.dL(), $$0, $$1.L());
      this.r.a($$0, this.n());
      this.e(0);
      this.e(1);
      this.e(2);
      this.o.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cjl> n() {
      return List.of(this.q.a(0), this.q.a(1), this.q.a(2));
   }

   private void e(int $$0) {
      cjl $$1 = this.q.a($$0);
      if (!$$1.b()) {
         $$1.h(1);
         this.q.a($$0, $$1);
      }
   }

   @Override
   public void m() {
      List<cmq<cnd>> $$0 = this.x.q().b(cmt.g, this.q, this.x);
      if ($$0.isEmpty()) {
         this.r.a(0, cjl.b);
      } else {
         cmq<cnd> $$1 = $$0.get(0);
         cjl $$2 = $$1.b().a(this.q, this.x.G_());
         if ($$2.a(this.x.G())) {
            this.y = $$1;
            this.r.a($$1);
            this.r.a(0, $$2);
         }
      }
   }

   @Override
   public int d(cjl $$0) {
      return this.e($$0).orElse(0);
   }

   private static OptionalInt a(cnd $$0, cjl $$1) {
      if ($$0.a($$1)) {
         return OptionalInt.of(0);
      } else if ($$0.b($$1)) {
         return OptionalInt.of(1);
      } else {
         return $$0.c($$1) ? OptionalInt.of(2) : OptionalInt.empty();
      }
   }

   @Override
   public boolean a(cjl $$0, cgj $$1) {
      return $$1.d != this.r && super.a($$0, $$1);
   }

   @Override
   public boolean c(cjl $$0) {
      return this.e($$0).isPresent();
   }

   private OptionalInt e(cjl $$0) {
      return this.z.stream().flatMapToInt($$1 -> a($$1.b(), $$0).stream()).filter($$0x -> !this.b($$0x).f()).findFirst();
   }
}
