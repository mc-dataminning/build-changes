import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class czz implements cph {
   private final czz.b b;
   @Nullable
   protected String a;
   private final ji.c<czz> c = lp.f.f(this);

   public static czz.a a(int $$0) {
      return new czz.a($$0, 0);
   }

   public static czz.a a(int $$0, int $$1) {
      return new czz.a($$0, $$1);
   }

   public static czz.b a(axe<cuj> $$0, axe<cuj> $$1, int $$2, int $$3, czz.a $$4, czz.a $$5, int $$6, bta... $$7) {
      return new czz.b($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, cpm.h, $$7);
   }

   public static czz.b a(axe<cuj> $$0, int $$1, int $$2, czz.a $$3, czz.a $$4, int $$5, bta... $$6) {
      return new czz.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, cpm.h, $$6);
   }

   public static czz.b a(axe<cuj> $$0, int $$1, int $$2, czz.a $$3, czz.a $$4, int $$5, cpk $$6, bta... $$7) {
      return new czz.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   public static czz b(int $$0) {
      return lp.f.a($$0);
   }

   public czz(czz.b $$0) {
      this.b = $$0;
   }

   public Map<bta, cuo> a(bto $$0) {
      Map<bta, cuo> $$1 = Maps.newEnumMap(bta.class);

      for (bta $$2 : this.b.i()) {
         cuo $$3 = $$0.a($$2);
         if (!$$3.e()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public final axe<cuj> c() {
      return this.b.a();
   }

   public final boolean a(cuo $$0) {
      return this.b.b.isEmpty() || $$0.a(this.b.b.get());
   }

   public final int d() {
      return this.b.c();
   }

   public final int e() {
      return this.b.g();
   }

   public final int f() {
      return 1;
   }

   public final int g() {
      return this.b.d();
   }

   public final int c(int $$0) {
      return this.b.e().a($$0);
   }

   public final int d(int $$0) {
      return this.b.f().a($$0);
   }

   public int a(int $$0, brm $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bsz<?> $$1) {
      return 0.0F;
   }

   public final boolean b(czz $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(czz $$0) {
      return this != $$0;
   }

   protected String h() {
      if (this.a == null) {
         this.a = ac.a("enchantment", lp.f.b(this));
      }

      return this.a;
   }

   public String j() {
      return this.h();
   }

   public xo e(int $$0) {
      yc $$1 = xo.c(this.j());
      if (this.b()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.g() != 1) {
         $$1.b(xn.v).b(xo.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean b(cuo $$0) {
      return $$0.g().o().a(this.b.a());
   }

   public void a(bto $$0, bst $$1, int $$2) {
   }

   public void b(bto $$0, bst $$1, int $$2) {
   }

   public void c(bto $$0, bst $$1, int $$2) {
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean k() {
      return true;
   }

   public boolean l() {
      return true;
   }

   @Deprecated
   public ji.c<czz> m() {
      return this.c;
   }

   @Override
   public cpk i() {
      return this.b.h();
   }

   public static record a(int a, int b) {
      public int a(int $$0) {
         return this.a + this.b * ($$0 - 1);
      }
   }

   public static record b(axe<cuj> a, Optional<axe<cuj>> b, int c, int d, czz.a e, czz.a f, int g, cpk h, bta[] i) {
   }
}
