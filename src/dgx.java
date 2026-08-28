import java.util.Arrays;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum dgx implements bba {
   a(0, "survival"),
   b(1, "creative"),
   c(2, "adventure"),
   d(3, "spectator");

   public static final dgx e = a;
   public static final bba.a<dgx> f = bba.a(dgx::values);
   private static final IntFunction<dgx> g = ayv.a(dgx::a, values(), ayv.a.a);
   private static final int h = -1;
   private final int i;
   private final String j;
   private final xv k;
   private final xv l;

   private dgx(final int $$0, final String $$1) {
      this.i = $$0;
      this.j = $$1;
      this.k = xv.c("selectWorld.gameMode." + $$1);
      this.l = xv.c("gameMode." + $$1);
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

   public xv d() {
      return this.l;
   }

   public xv e() {
      return this.k;
   }

   public void a(cpo $$0) {
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

   public static dgx a(int $$0) {
      return g.apply($$0);
   }

   public static dgx a(String $$0) {
      return a($$0, a);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static dgx a(String $$0, @Nullable dgx $$1) {
      dgx $$2 = f.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   public static int a(@Nullable dgx $$0) {
      return $$0 != null ? $$0.i : -1;
   }

   @Nullable
   public static dgx b(int $$0) {
      return $$0 == -1 ? null : a($$0);
   }

   public static boolean c(int $$0) {
      return Arrays.stream(values()).anyMatch($$1 -> $$1.i == $$0);
   }
}
