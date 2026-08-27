import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum csv implements aut {
   a(0, "survival"),
   b(1, "creative"),
   c(2, "adventure"),
   d(3, "spectator");

   public static final csv e = a;
   public static final aut.a<csv> f = aut.a(csv::values);
   private static final IntFunction<csv> g = asq.a(csv::a, values(), asq.a.a);
   private static final int h = -1;
   private final int i;
   private final String j;
   private final vb k;
   private final vb l;

   private csv(int $$0, String $$1) {
      this.i = $$0;
      this.j = $$1;
      this.k = vb.c("selectWorld.gameMode." + $$1);
      this.l = vb.c("gameMode." + $$1);
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

   public vb d() {
      return this.l;
   }

   public vb e() {
      return this.k;
   }

   public void a(ceo $$0) {
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

   public static csv a(int $$0) {
      return g.apply($$0);
   }

   public static csv a(String $$0) {
      return a($$0, a);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static csv a(String $$0, @Nullable csv $$1) {
      csv $$2 = f.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   public static int a(@Nullable csv $$0) {
      return $$0 != null ? $$0.i : -1;
   }

   @Nullable
   public static csv b(int $$0) {
      return $$0 == -1 ? null : a($$0);
   }
}
