import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cph implements asf {
   a(0, "survival"),
   b(1, "creative"),
   c(2, "adventure"),
   d(3, "spectator");

   public static final cph e = a;
   public static final asf.a<cph> f = asf.a(cph::values);
   private static final IntFunction<cph> g = aqi.a(cph::a, values(), aqi.a.a);
   private static final int h = -1;
   private final int i;
   private final String j;
   private final te k;
   private final te l;

   private cph(int $$0, String $$1) {
      this.i = $$0;
      this.j = $$1;
      this.k = te.c("selectWorld.gameMode." + $$1);
      this.l = te.c("gameMode." + $$1);
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

   public te d() {
      return this.l;
   }

   public te e() {
      return this.k;
   }

   public void a(cbi $$0) {
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

   public static cph a(int $$0) {
      return g.apply($$0);
   }

   public static cph a(String $$0) {
      return a($$0, a);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cph a(String $$0, @Nullable cph $$1) {
      cph $$2 = f.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   public static int a(@Nullable cph $$0) {
      return $$0 != null ? $$0.i : -1;
   }

   @Nullable
   public static cph b(int $$0) {
      return $$0 == -1 ? null : a($$0);
   }
}
