import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum dju implements bam {
   a(0, "survival"),
   b(1, "creative"),
   c(2, "adventure"),
   d(3, "spectator");

   public static final dju e = a;
   public static final bam.a<dju> f = bam.a(dju::values);
   private static final IntFunction<dju> h = aye.a(dju::a, values(), aye.a.a);
   @Deprecated
   public static final Codec<dju> g = Codec.INT.xmap(dju::a, dju::a);
   private static final int i = -1;
   private final int j;
   private final String k;
   private final xa l;
   private final xa m;

   private dju(final int $$0, final String $$1) {
      this.j = $$0;
      this.k = $$1;
      this.l = xa.c("selectWorld.gameMode." + $$1);
      this.m = xa.c("gameMode." + $$1);
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

   public xa d() {
      return this.m;
   }

   public xa e() {
      return this.l;
   }

   public void a(crt $$0) {
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

   public static dju a(int $$0) {
      return h.apply($$0);
   }

   public static dju a(String $$0) {
      return a($$0, a);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static dju a(String $$0, @Nullable dju $$1) {
      dju $$2 = f.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   public static int a(@Nullable dju $$0) {
      return $$0 != null ? $$0.j : -1;
   }

   @Nullable
   public static dju b(int $$0) {
      return $$0 == -1 ? null : a($$0);
   }

   public static boolean c(int $$0) {
      return Arrays.stream(values()).anyMatch($$1 -> $$1.j == $$0);
   }
}
