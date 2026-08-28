import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class fay {
   public boolean a(@Nullable fay $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String b();

   public abstract xz d(xl var1);

   public abstract boolean i();

   public abstract boolean h();

   public abstract fay.b j();

   public abstract n n();

   public abstract Collection<String> g();

   public abstract fay.b k();

   public abstract fay.a l();

   public static enum a {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      private static final Map<String, fay.a> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (fay.a)$$0));
      public final String e;
      public final int f;

      @Nullable
      public static fay.a a(String $$0) {
         return g.get($$0);
      }

      private a(final String $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public xl a() {
         return xl.c("team.collision." + this.e);
      }
   }

   public static enum b {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      private static final Map<String, fay.b> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (fay.b)$$0));
      public final String e;
      public final int f;

      public static String[] a() {
         return g.keySet().toArray(new String[0]);
      }

      @Nullable
      public static fay.b a(String $$0) {
         return g.get($$0);
      }

      private b(final String $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public xl b() {
         return xl.c("team.visibility." + this.e);
      }
   }
}
