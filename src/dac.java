import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dac implements cpk {
   private final dac.b b;
   @Nullable
   protected String a;
   private final ji.c<dac> c = lp.f.f(this);

   public static dac.a a(int $$0) {
      return new dac.a($$0, 0);
   }

   public static dac.a a(int $$0, int $$1) {
      return new dac.a($$0, $$1);
   }

   public static dac.b a(axf<cum> $$0, axf<cum> $$1, int $$2, int $$3, dac.a $$4, dac.a $$5, int $$6, btd... $$7) {
      return new dac.b($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, cpp.h, $$7);
   }

   public static dac.b a(axf<cum> $$0, int $$1, int $$2, dac.a $$3, dac.a $$4, int $$5, btd... $$6) {
      return new dac.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, cpp.h, $$6);
   }

   public static dac.b a(axf<cum> $$0, int $$1, int $$2, dac.a $$3, dac.a $$4, int $$5, cpn $$6, btd... $$7) {
      return new dac.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   public static dac b(int $$0) {
      return lp.f.a($$0);
   }

   public dac(dac.b $$0) {
      this.b = $$0;
   }

   public Map<btd, cur> a(btr $$0) {
      Map<btd, cur> $$1 = Maps.newEnumMap(btd.class);

      for (btd $$2 : this.b.i()) {
         cur $$3 = $$0.a($$2);
         if (!$$3.e()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public final axf<cum> c() {
      return this.b.a();
   }

   public final boolean a(cur $$0) {
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

   public int a(int $$0, brp $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable btc<?> $$1) {
      return 0.0F;
   }

   public final boolean b(dac $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(dac $$0) {
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

   public boolean b(cur $$0) {
      return $$0.g().o().a(this.b.a());
   }

   public void a(btr $$0, bsw $$1, int $$2) {
   }

   public void b(btr $$0, bsw $$1, int $$2) {
   }

   public void c(btr $$0, bsw $$1, int $$2) {
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
   public ji.c<dac> m() {
      return this.c;
   }

   @Override
   public cpn i() {
      return this.b.h();
   }

   public static record a(int a, int b) {
      public int a(int $$0) {
         return this.a + this.b * ($$0 - 1);
      }
   }

   public static record b(axf<cum> a, Optional<axf<cum>> b, int c, int d, dac.a e, dac.a f, int g, cpn h, btd[] i) {
   }
}
