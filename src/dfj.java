import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum dfj implements bai {
   a(0, "survival"),
   b(1, "creative"),
   c(2, "adventure"),
   d(3, "spectator");

   public static final dfj e = a;
   public static final bai.a<dfj> f = bai.a(dfj::values);
   private static final IntFunction<dfj> g = ayd.a(dfj::a, values(), ayd.a.a);
   private static final int h = -1;
   private final int i;
   private final String j;
   private final xj k;
   private final xj l;

   private dfj(final int $$0, final String $$1) {
      this.i = $$0;
      this.j = $$1;
      this.k = xj.c("selectWorld.gameMode." + $$1);
      this.l = xj.c("gameMode." + $$1);
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

   public xj d() {
      return this.l;
   }

   public xj e() {
      return this.k;
   }

   public void a(coq $$0) {
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

   public static dfj a(int $$0) {
      return g.apply($$0);
   }

   public static dfj a(String $$0) {
      return a($$0, a);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static dfj a(String $$0, @Nullable dfj $$1) {
      dfj $$2 = f.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   public static int a(@Nullable dfj $$0) {
      return $$0 != null ? $$0.i : -1;
   }

   @Nullable
   public static dfj b(int $$0) {
      return $$0 == -1 ? null : a($$0);
   }
}
