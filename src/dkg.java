import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum dkg implements bax {
   a(0, "survival"),
   b(1, "creative"),
   c(2, "adventure"),
   d(3, "spectator");

   public static final dkg e = a;
   public static final bax.a<dkg> f = bax.a(dkg::values);
   private static final IntFunction<dkg> h = ayo.a(dkg::a, values(), ayo.a.a);
   @Deprecated
   public static final Codec<dkg> g = Codec.INT.xmap(dkg::a, dkg::a);
   private static final int i = -1;
   private final int j;
   private final String k;
   private final xg l;
   private final xg m;

   private dkg(final int $$0, final String $$1) {
      this.j = $$0;
      this.k = $$1;
      this.l = xg.c("selectWorld.gameMode." + $$1);
      this.m = xg.c("gameMode." + $$1);
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

   public xg d() {
      return this.m;
   }

   public xg e() {
      return this.l;
   }

   public void a(cse $$0) {
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

   public static dkg a(int $$0) {
      return h.apply($$0);
   }

   public static dkg a(String $$0) {
      return a($$0, a);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static dkg a(String $$0, @Nullable dkg $$1) {
      dkg $$2 = f.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   public static int a(@Nullable dkg $$0) {
      return $$0 != null ? $$0.j : -1;
   }

   @Nullable
   public static dkg b(int $$0) {
      return $$0 == -1 ? null : a($$0);
   }

   public static boolean c(int $$0) {
      return Arrays.stream(values()).anyMatch($$1 -> $$1.j == $$0);
   }
}
