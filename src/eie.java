import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eie {
   public boolean a(@Nullable eie $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String b();

   public abstract ts d(tf var1);

   public abstract boolean i();

   public abstract boolean h();

   public abstract eie.b j();

   public abstract n n();

   public abstract Collection<String> g();

   public abstract eie.b k();

   public abstract eie.a l();

   public static enum a {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      private static final Map<String, eie.a> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (eie.a)$$0));
      public final String e;
      public final int f;

      @Nullable
      public static eie.a a(String $$0) {
         return g.get($$0);
      }

      private a(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public tf a() {
         return tf.c("team.collision." + this.e);
      }
   }

   public static enum b {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      private static final Map<String, eie.b> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (eie.b)$$0));
      public final String e;
      public final int f;

      public static String[] a() {
         return g.keySet().toArray(new String[0]);
      }

      @Nullable
      public static eie.b a(String $$0) {
         return g.get($$0);
      }

      private b(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public tf b() {
         return tf.c("team.visibility." + this.e);
      }
   }
}
