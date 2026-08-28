import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ezz {
   public boolean a(@Nullable ezz $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String b();

   public abstract xr d(xd var1);

   public abstract boolean i();

   public abstract boolean h();

   public abstract ezz.b j();

   public abstract n n();

   public abstract Collection<String> g();

   public abstract ezz.b k();

   public abstract ezz.a l();

   public static enum a {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      private static final Map<String, ezz.a> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (ezz.a)$$0));
      public final String e;
      public final int f;

      @Nullable
      public static ezz.a a(String $$0) {
         return g.get($$0);
      }

      private a(final String $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public xd a() {
         return xd.c("team.collision." + this.e);
      }
   }

   public static enum b {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      private static final Map<String, ezz.b> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (ezz.b)$$0));
      public final String e;
      public final int f;

      public static String[] a() {
         return g.keySet().toArray(new String[0]);
      }

      @Nullable
      public static ezz.b a(String $$0) {
         return g.get($$0);
      }

      private b(final String $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public xd b() {
         return xd.c("team.visibility." + this.e);
      }
   }
}
