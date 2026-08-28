import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class daa implements cpi {
   private final daa.b b;
   @Nullable
   protected String a;
   private final ji.c<daa> c = lp.f.f(this);

   public static daa.a a(int $$0) {
      return new daa.a($$0, 0);
   }

   public static daa.a a(int $$0, int $$1) {
      return new daa.a($$0, $$1);
   }

   public static daa.b a(axf<cuk> $$0, axf<cuk> $$1, int $$2, int $$3, daa.a $$4, daa.a $$5, int $$6, btb... $$7) {
      return new daa.b($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, cpn.h, $$7);
   }

   public static daa.b a(axf<cuk> $$0, int $$1, int $$2, daa.a $$3, daa.a $$4, int $$5, btb... $$6) {
      return new daa.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, cpn.h, $$6);
   }

   public static daa.b a(axf<cuk> $$0, int $$1, int $$2, daa.a $$3, daa.a $$4, int $$5, cpl $$6, btb... $$7) {
      return new daa.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   public static daa b(int $$0) {
      return lp.f.a($$0);
   }

   public daa(daa.b $$0) {
      this.b = $$0;
   }

   public Map<btb, cup> a(btp $$0) {
      Map<btb, cup> $$1 = Maps.newEnumMap(btb.class);

      for (btb $$2 : this.b.i()) {
         cup $$3 = $$0.a($$2);
         if (!$$3.e()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public final axf<cuk> c() {
      return this.b.a();
   }

   public final boolean a(cup $$0) {
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

   public int a(int $$0, brn $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bta<?> $$1) {
      return 0.0F;
   }

   public final boolean b(daa $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(daa $$0) {
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

   public xp e(int $$0) {
      yd $$1 = xp.c(this.j());
      if (this.b()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.g() != 1) {
         $$1.b(xo.v).b(xp.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean b(cup $$0) {
      return $$0.g().o().a(this.b.a());
   }

   public void a(btp $$0, bsu $$1, int $$2) {
   }

   public void b(btp $$0, bsu $$1, int $$2) {
   }

   public void c(btp $$0, bsu $$1, int $$2) {
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
   public ji.c<daa> m() {
      return this.c;
   }

   @Override
   public cpl i() {
      return this.b.h();
   }

   public static record a(int a, int b) {
      public int a(int $$0) {
         return this.a + this.b * ($$0 - 1);
      }
   }

   public static record b(axf<cuk> a, Optional<axf<cuk>> b, int c, int d, daa.a e, daa.a f, int g, cpl h, btb[] i) {
   }
}
