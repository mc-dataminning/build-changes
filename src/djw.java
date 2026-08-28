import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum djw implements bao {
   a(0, "survival"),
   b(1, "creative"),
   c(2, "adventure"),
   d(3, "spectator");

   public static final djw e = a;
   public static final bao.a<djw> f = bao.a(djw::values);
   private static final IntFunction<djw> h = ayg.a(djw::a, values(), ayg.a.a);
   @Deprecated
   public static final Codec<djw> g = Codec.INT.xmap(djw::a, djw::a);
   private static final int i = -1;
   private final int j;
   private final String k;
   private final xc l;
   private final xc m;

   private djw(final int $$0, final String $$1) {
      this.j = $$0;
      this.k = $$1;
      this.l = xc.c("selectWorld.gameMode." + $$1);
      this.m = xc.c("gameMode." + $$1);
   }

   public int a() {
      return this.j;
   }

   public String b() {
      return this.k;
   }

   @Override
   public String c() {
      return this.k;
   }

   public xc d() {
      return this.m;
   }

   public xc e() {
      return this.l;
   }

   public void a(crv $$0) {
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

   public static djw a(int $$0) {
      return h.apply($$0);
   }

   public static djw a(String $$0) {
      return a($$0, a);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static djw a(String $$0, @Nullable djw $$1) {
      djw $$2 = f.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   public static int a(@Nullable djw $$0) {
      return $$0 != null ? $$0.j : -1;
   }

   @Nullable
   public static djw b(int $$0) {
      return $$0 == -1 ? null : a($$0);
   }

   public static boolean c(int $$0) {
      return Arrays.stream(values()).anyMatch($$1 -> $$1.j == $$0);
   }
}
