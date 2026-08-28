import java.util.Arrays;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum dgw implements baq {
   a(0, "survival"),
   b(1, "creative"),
   c(2, "adventure"),
   d(3, "spectator");

   public static final dgw e = a;
   public static final baq.a<dgw> f = baq.a(dgw::values);
   private static final IntFunction<dgw> g = ayl.a(dgw::a, values(), ayl.a.a);
   private static final int h = -1;
   private final int i;
   private final String j;
   private final xk k;
   private final xk l;

   private dgw(final int $$0, final String $$1) {
      this.i = $$0;
      this.j = $$1;
      this.k = xk.c("selectWorld.gameMode." + $$1);
      this.l = xk.c("gameMode." + $$1);
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

   public xk d() {
      return this.l;
   }

   public xk e() {
      return this.k;
   }

   public void a(cpk $$0) {
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

   public static dgw a(int $$0) {
      return g.apply($$0);
   }

   public static dgw a(String $$0) {
      return a($$0, a);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static dgw a(String $$0, @Nullable dgw $$1) {
      dgw $$2 = f.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   public static int a(@Nullable dgw $$0) {
      return $$0 != null ? $$0.i : -1;
   }

   @Nullable
   public static dgw b(int $$0) {
      return $$0 == -1 ? null : a($$0);
   }

   public static boolean c(int $$0) {
      return Arrays.stream(values()).anyMatch($$1 -> $$1.i == $$0);
   }
}
