import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class fcy {
   public boolean a(@Nullable fcy $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String b();

   public abstract xy d(xk var1);

   public abstract boolean i();

   public abstract boolean h();

   public abstract fcy.b j();

   public abstract n n();

   public abstract Collection<String> g();

   public abstract fcy.b k();

   public abstract fcy.a l();

   public static enum a {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      private static final Map<String, fcy.a> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (fcy.a)$$0));
      public final String e;
      public final int f;

      @Nullable
      public static fcy.a a(String $$0) {
         return g.get($$0);
      }

      private a(final String $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public xk a() {
         return xk.c("team.collision." + this.e);
      }
   }

   public static enum b {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      private static final Map<String, fcy.b> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (fcy.b)$$0));
      public final String e;
      public final int f;

      public static String[] a() {
         return g.keySet().toArray(new String[0]);
      }

      @Nullable
      public static fcy.b a(String $$0) {
         return g.get($$0);
      }

      private b(final String $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public xk b() {
         return xk.c("team.visibility." + this.e);
      }
   }
}
