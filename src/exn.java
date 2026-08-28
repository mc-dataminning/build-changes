import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class exn {
   public boolean a(@Nullable exn $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String b();

   public abstract xi d(wu var1);

   public abstract boolean i();

   public abstract boolean h();

   public abstract exn.b j();

   public abstract n n();

   public abstract Collection<String> g();

   public abstract exn.b k();

   public abstract exn.a l();

   public static enum a {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      private static final Map<String, exn.a> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (exn.a)$$0));
      public final String e;
      public final int f;

      @Nullable
      public static exn.a a(String $$0) {
         return g.get($$0);
      }

      private a(final String $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public wu a() {
         return wu.c("team.collision." + this.e);
      }
   }

   public static enum b {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      private static final Map<String, exn.b> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (exn.b)$$0));
      public final String e;
      public final int f;

      public static String[] a() {
         return g.keySet().toArray(new String[0]);
      }

      @Nullable
      public static exn.b a(String $$0) {
         return g.get($$0);
      }

      private b(final String $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public wu b() {
         return wu.c("team.visibility." + this.e);
      }
   }
}
