import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class etg {
   public boolean a(@Nullable etg $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String b();

   public abstract wu d(wg var1);

   public abstract boolean i();

   public abstract boolean h();

   public abstract etg.b j();

   public abstract n n();

   public abstract Collection<String> g();

   public abstract etg.b k();

   public abstract etg.a l();

   public static enum a {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      private static final Map<String, etg.a> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (etg.a)$$0));
      public final String e;
      public final int f;

      @Nullable
      public static etg.a a(String $$0) {
         return g.get($$0);
      }

      private a(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public wg a() {
         return wg.c("team.collision." + this.e);
      }
   }

   public static enum b {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      private static final Map<String, etg.b> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (etg.b)$$0));
      public final String e;
      public final int f;

      public static String[] a() {
         return g.keySet().toArray(new String[0]);
      }

      @Nullable
      public static etg.b a(String $$0) {
         return g.get($$0);
      }

      private b(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public wg b() {
         return wg.c("team.visibility." + this.e);
      }
   }
}
