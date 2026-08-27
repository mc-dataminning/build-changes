import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eiq {
   public boolean a(@Nullable eiq $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String b();

   public abstract ua d(tn var1);

   public abstract boolean i();

   public abstract boolean h();

   public abstract eiq.b j();

   public abstract n n();

   public abstract Collection<String> g();

   public abstract eiq.b k();

   public abstract eiq.a l();

   public static enum a {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      private static final Map<String, eiq.a> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (eiq.a)$$0));
      public final String e;
      public final int f;

      @Nullable
      public static eiq.a a(String $$0) {
         return g.get($$0);
      }

      private a(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public tn a() {
         return tn.c("team.collision." + this.e);
      }
   }

   public static enum b {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      private static final Map<String, eiq.b> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (eiq.b)$$0));
      public final String e;
      public final int f;

      public static String[] a() {
         return g.keySet().toArray(new String[0]);
      }

      @Nullable
      public static eiq.b a(String $$0) {
         return g.get($$0);
      }

      private b(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public tn b() {
         return tn.c("team.visibility." + this.e);
      }
   }
}
