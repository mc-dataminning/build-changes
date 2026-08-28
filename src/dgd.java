import java.util.Arrays;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum dgd implements azu {
   a(0, "survival"),
   b(1, "creative"),
   c(2, "adventure"),
   d(3, "spectator");

   public static final dgd e = a;
   public static final azu.a<dgd> f = azu.a(dgd::values);
   private static final IntFunction<dgd> g = axp.a(dgd::a, values(), axp.a.a);
   private static final int h = -1;
   private final int i;
   private final String j;
   private final wo k;
   private final wo l;

   private dgd(final int $$0, final String $$1) {
      this.i = $$0;
      this.j = $$1;
      this.k = wo.c("selectWorld.gameMode." + $$1);
      this.l = wo.c("gameMode." + $$1);
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

   public wo d() {
      return this.l;
   }

   public wo e() {
      return this.k;
   }

   public void a(cor $$0) {
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

   public static dgd a(int $$0) {
      return g.apply($$0);
   }

   public static dgd a(String $$0) {
      return a($$0, a);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static dgd a(String $$0, @Nullable dgd $$1) {
      dgd $$2 = f.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   public static int a(@Nullable dgd $$0) {
      return $$0 != null ? $$0.i : -1;
   }

   @Nullable
   public static dgd b(int $$0) {
      return $$0 == -1 ? null : a($$0);
   }

   public static boolean c(int $$0) {
      return Arrays.stream(values()).anyMatch($$1 -> $$1.i == $$0);
   }
}
