import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyg {
   private final cyg.b b;
   @Nullable
   protected String a;
   private final iw.c<cyg> c = ld.f.f(this);

   public static cyg.a a(int $$0) {
      return new cyg.a($$0, 0);
   }

   public static cyg.a a(int $$0, int $$1) {
      return new cyg.a($$0, $$1);
   }

   public static cyg.b a(awg<csu> $$0, awg<csu> $$1, int $$2, int $$3, cyg.a $$4, cyg.a $$5, int $$6, bro... $$7) {
      return new cyg.b($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public static cyg.b a(awg<csu> $$0, int $$1, int $$2, cyg.a $$3, cyg.a $$4, int $$5, bro... $$6) {
      return new cyg.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   public static cyg b(int $$0) {
      return ld.f.a($$0);
   }

   public cyg(cyg.b $$0) {
      this.b = $$0;
   }

   public Map<bro, csz> a(bsa $$0) {
      Map<bro, csz> $$1 = Maps.newEnumMap(bro.class);

      for (bro $$2 : this.b.h()) {
         csz $$3 = $$0.d($$2);
         if (!$$3.d()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public final awg<csu> c() {
      return this.b.a();
   }

   public final boolean a(csz $$0) {
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

   public int a(int $$0, bqf $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable brn<?> $$1) {
      return 0.0F;
   }

   public final boolean b(cyg $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cyg $$0) {
      return this != $$0;
   }

   protected String h() {
      if (this.a == null) {
         this.a = ac.a("enchantment", ld.f.b(this));
      }

      return this.a;
   }

   public String i() {
      return this.h();
   }

   public wu e(int $$0) {
      xi $$1 = wu.c(this.i());
      if (this.b()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.g() != 1) {
         $$1.b(wt.v).b(wu.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean b(csz $$0) {
      return $$0.f().n().a(this.b.a());
   }

   public void a(bsa $$0, brh $$1, int $$2) {
   }

   public void b(bsa $$0, brh $$1, int $$2) {
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean j() {
      return true;
   }

   public boolean k() {
      return true;
   }

   @Deprecated
   public iw.c<cyg> l() {
      return this.c;
   }

   public static record a(int a, int b) {
      public int a(int $$0) {
         return this.a + this.b * ($$0 - 1);
      }
   }

   public static record b(awg<csu> a, Optional<awg<csu>> b, int c, int d, cyg.a e, cyg.a f, int g, bro[] h) {
   }
}
