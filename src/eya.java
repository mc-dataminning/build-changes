import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eya {
   public boolean a(@Nullable eya $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String b();

   public abstract xs d(xe var1);

   public abstract boolean i();

   public abstract boolean h();

   public abstract eya.b j();

   public abstract n n();

   public abstract Collection<String> g();

   public abstract eya.b k();

   public abstract eya.a l();

   public static enum a {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      private static final Map<String, eya.a> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (eya.a)$$0));
      public final String e;
      public final int f;

      @Nullable
      public static eya.a a(String $$0) {
         return g.get($$0);
      }

      private a(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public xe a() {
         return xe.c("team.collision." + this.e);
      }
   }

   public static enum b {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      private static final Map<String, eya.b> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (eya.b)$$0));
      public final String e;
      public final int f;

      public static String[] a() {
         return g.keySet().toArray(new String[0]);
      }

      @Nullable
      public static eya.b a(String $$0) {
         return g.get($$0);
      }

      private b(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public xe b() {
         return xe.c("team.visibility." + this.e);
      }
   }
}
