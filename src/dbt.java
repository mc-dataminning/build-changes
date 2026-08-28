import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum dbt implements azs {
   a(0, "survival"),
   b(1, "creative"),
   c(2, "adventure"),
   d(3, "spectator");

   public static final dbt e = a;
   public static final azs.a<dbt> f = azs.a(dbt::values);
   private static final IntFunction<dbt> g = axo.a(dbt::a, values(), axo.a.a);
   private static final int h = -1;
   private final int i;
   private final String j;
   private final xo k;
   private final xo l;

   private dbt(final int $$0, final String $$1) {
      this.i = $$0;
      this.j = $$1;
      this.k = xo.c("selectWorld.gameMode." + $$1);
      this.l = xo.c("gameMode." + $$1);
   }

   public int a() {
      return this.i;
   }

   public String b() {
      return this.j;
   }

   @Override
   public String c() {
      return this.j;
   }

   public xo d() {
      return this.l;
   }

   public xo e() {
      return this.k;
   }

   public void a(cms $$0) {
      if (this == b) {
         $$0.c = true;
         $$0.d = true;
         $$0.a = true;
      } else if (this == d) {
         $$0.c = true;
         $$0.d = false;
         $$0.a = true;
         $$0.b = true;
      } else {
         $$0.c = false;
         $$0.d = false;
         $$0.a = false;
         $$0.b = false;
      }

      $$0.e = !this.f();
   }

   public boolean f() {
      return this == c || this == d;
   }

   public boolean g() {
      return this == b;
   }

   public boolean h() {
      return this == a || this == c;
   }

   public static dbt a(int $$0) {
      return g.apply($$0);
   }

   public static dbt a(String $$0) {
      return a($$0, a);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static dbt a(String $$0, @Nullable dbt $$1) {
      dbt $$2 = f.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   public static int a(@Nullable dbt $$0) {
      return $$0 != null ? $$0.i : -1;
   }

   @Nullable
   public static dbt b(int $$0) {
      return $$0 == -1 ? null : a($$0);
   }
}
