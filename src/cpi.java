import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cpi implements ash {
   a(0, "survival"),
   b(1, "creative"),
   c(2, "adventure"),
   d(3, "spectator");

   public static final cpi e = a;
   public static final ash.a<cpi> f = ash.a(cpi::values);
   private static final IntFunction<cpi> g = aqk.a(cpi::a, values(), aqk.a.a);
   private static final int h = -1;
   private final int i;
   private final String j;
   private final tf k;
   private final tf l;

   private cpi(int $$0, String $$1) {
      this.i = $$0;
      this.j = $$1;
      this.k = tf.c("selectWorld.gameMode." + $$1);
      this.l = tf.c("gameMode." + $$1);
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

   public tf d() {
      return this.l;
   }

   public tf e() {
      return this.k;
   }

   public void a(cbj $$0) {
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

   public static cpi a(int $$0) {
      return g.apply($$0);
   }

   public static cpi a(String $$0) {
      return a($$0, a);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cpi a(String $$0, @Nullable cpi $$1) {
      cpi $$2 = f.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   public static int a(@Nullable cpi $$0) {
      return $$0 != null ? $$0.i : -1;
   }

   @Nullable
   public static cpi b(int $$0) {
      return $$0 == -1 ? null : a($$0);
   }
}
