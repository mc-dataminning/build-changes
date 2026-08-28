import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class czy implements cpg {
   private final czy.b b;
   @Nullable
   protected String a;
   private final ji.c<czy> c = lp.f.f(this);

   public static czy.a a(int $$0) {
      return new czy.a($$0, 0);
   }

   public static czy.a a(int $$0, int $$1) {
      return new czy.a($$0, $$1);
   }

   public static czy.b a(axe<cui> $$0, axe<cui> $$1, int $$2, int $$3, czy.a $$4, czy.a $$5, int $$6, bsz... $$7) {
      return new czy.b($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, cpl.h, $$7);
   }

   public static czy.b a(axe<cui> $$0, int $$1, int $$2, czy.a $$3, czy.a $$4, int $$5, bsz... $$6) {
      return new czy.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, cpl.h, $$6);
   }

   public static czy.b a(axe<cui> $$0, int $$1, int $$2, czy.a $$3, czy.a $$4, int $$5, cpj $$6, bsz... $$7) {
      return new czy.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   public static czy b(int $$0) {
      return lp.f.a($$0);
   }

   public czy(czy.b $$0) {
      this.b = $$0;
   }

   public Map<bsz, cun> a(btn $$0) {
      Map<bsz, cun> $$1 = Maps.newEnumMap(bsz.class);

      for (bsz $$2 : this.b.i()) {
         cun $$3 = $$0.a($$2);
         if (!$$3.e()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public final axe<cui> c() {
      return this.b.a();
   }

   public final boolean a(cun $$0) {
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

   public int a(int $$0, brl $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bsy<?> $$1) {
      return 0.0F;
   }

   public final boolean b(czy $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(czy $$0) {
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

   public boolean b(cun $$0) {
      return $$0.g().o().a(this.b.a());
   }

   public void a(btn $$0, bss $$1, int $$2) {
   }

   public void b(btn $$0, bss $$1, int $$2) {
   }

   public void c(btn $$0, bss $$1, int $$2) {
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
   public ji.c<czy> m() {
      return this.c;
   }

   @Override
   public cpj i() {
      return this.b.h();
   }

   public static record a(int a, int b) {
      public int a(int $$0) {
         return this.a + this.b * ($$0 - 1);
      }
   }

   public static record b(axe<cui> a, Optional<axe<cui>> b, int c, int d, czy.a e, czy.a f, int g, cpj h, bsz[] i) {
   }
}
