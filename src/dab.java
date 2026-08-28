import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dab implements cpj {
   private final dab.b b;
   @Nullable
   protected String a;
   private final ji.c<dab> c = lp.f.f(this);

   public static dab.a a(int $$0) {
      return new dab.a($$0, 0);
   }

   public static dab.a a(int $$0, int $$1) {
      return new dab.a($$0, $$1);
   }

   public static dab.b a(axf<cul> $$0, axf<cul> $$1, int $$2, int $$3, dab.a $$4, dab.a $$5, int $$6, btc... $$7) {
      return new dab.b($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, cpo.h, $$7);
   }

   public static dab.b a(axf<cul> $$0, int $$1, int $$2, dab.a $$3, dab.a $$4, int $$5, btc... $$6) {
      return new dab.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, cpo.h, $$6);
   }

   public static dab.b a(axf<cul> $$0, int $$1, int $$2, dab.a $$3, dab.a $$4, int $$5, cpm $$6, btc... $$7) {
      return new dab.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   public static dab b(int $$0) {
      return lp.f.a($$0);
   }

   public dab(dab.b $$0) {
      this.b = $$0;
   }

   public Map<btc, cuq> a(btq $$0) {
      Map<btc, cuq> $$1 = Maps.newEnumMap(btc.class);

      for (btc $$2 : this.b.i()) {
         cuq $$3 = $$0.a($$2);
         if (!$$3.e()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public final axf<cul> c() {
      return this.b.a();
   }

   public final boolean a(cuq $$0) {
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

   public int a(int $$0, bro $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable btb<?> $$1) {
      return 0.0F;
   }

   public final boolean b(dab $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(dab $$0) {
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

   public boolean b(cuq $$0) {
      return $$0.g().o().a(this.b.a());
   }

   public void a(btq $$0, bsv $$1, int $$2) {
   }

   public void b(btq $$0, bsv $$1, int $$2) {
   }

   public void c(btq $$0, bsv $$1, int $$2) {
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
   public ji.c<dab> m() {
      return this.c;
   }

   @Override
   public cpm i() {
      return this.b.h();
   }

   public static record a(int a, int b) {
      public int a(int $$0) {
         return this.a + this.b * ($$0 - 1);
      }
   }

   public static record b(axf<cul> a, Optional<axf<cul>> b, int c, int d, dab.a e, dab.a f, int g, cpm h, btc[] i) {
   }
}
