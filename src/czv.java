import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class czv implements cpd {
   private final czv.b b;
   @Nullable
   protected String a;
   private final ji.c<czv> c = lp.f.f(this);

   public static czv.a a(int $$0) {
      return new czv.a($$0, 0);
   }

   public static czv.a a(int $$0, int $$1) {
      return new czv.a($$0, $$1);
   }

   public static czv.b a(axb<cuf> $$0, axb<cuf> $$1, int $$2, int $$3, czv.a $$4, czv.a $$5, int $$6, bsw... $$7) {
      return new czv.b($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, cpi.h, $$7);
   }

   public static czv.b a(axb<cuf> $$0, int $$1, int $$2, czv.a $$3, czv.a $$4, int $$5, bsw... $$6) {
      return new czv.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, cpi.h, $$6);
   }

   public static czv.b a(axb<cuf> $$0, int $$1, int $$2, czv.a $$3, czv.a $$4, int $$5, cpg $$6, bsw... $$7) {
      return new czv.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   public static czv b(int $$0) {
      return lp.f.a($$0);
   }

   public czv(czv.b $$0) {
      this.b = $$0;
   }

   public Map<bsw, cuk> a(btk $$0) {
      Map<bsw, cuk> $$1 = Maps.newEnumMap(bsw.class);

      for (bsw $$2 : this.b.i()) {
         cuk $$3 = $$0.a($$2);
         if (!$$3.e()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public final axb<cuf> c() {
      return this.b.a();
   }

   public final boolean a(cuk $$0) {
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

   public int a(int $$0, bri $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bsv<?> $$1) {
      return 0.0F;
   }

   public final boolean b(czv $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(czv $$0) {
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

   public xl e(int $$0) {
      xz $$1 = xl.c(this.j());
      if (this.b()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.g() != 1) {
         $$1.b(xk.v).b(xl.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean b(cuk $$0) {
      return $$0.g().o().a(this.b.a());
   }

   public void a(btk $$0, bsp $$1, int $$2) {
   }

   public void b(btk $$0, bsp $$1, int $$2) {
   }

   public void c(btk $$0, bsp $$1, int $$2) {
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
   public ji.c<czv> m() {
      return this.c;
   }

   @Override
   public cpg i() {
      return this.b.h();
   }

   public static record a(int a, int b) {
      public int a(int $$0) {
         return this.a + this.b * ($$0 - 1);
      }
   }

   public static record b(axb<cuf> a, Optional<axb<cuf>> b, int c, int d, czv.a e, czv.a f, int g, cpg h, bsw[] i) {
   }
}
