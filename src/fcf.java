import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class fcf {
   public boolean a(@Nullable fcf $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String b();

   public abstract xc d(wo var1);

   public abstract boolean i();

   public abstract boolean h();

   public abstract fcf.b j();

   public abstract n n();

   public abstract Collection<String> g();

   public abstract fcf.b k();

   public abstract fcf.a l();

   public static enum a {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      private static final Map<String, fcf.a> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (fcf.a)$$0));
      public final String e;
      public final int f;

      @Nullable
      public static fcf.a a(String $$0) {
         return g.get($$0);
      }

      private a(final String $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public wo a() {
         return wo.c("team.collision." + this.e);
      }
   }

   public static enum b {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      private static final Map<String, fcf.b> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (fcf.b)$$0));
      public final String e;
      public final int f;

      public static String[] a() {
         return g.keySet().toArray(new String[0]);
      }

      @Nullable
      public static fcf.b a(String $$0) {
         return g.get($$0);
      }

      private b(final String $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public wo b() {
         return wo.c("team.visibility." + this.e);
      }
   }
}
