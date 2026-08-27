import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eii {
   public boolean a(@Nullable eii $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String b();

   public abstract tz d(tl var1);

   public abstract boolean i();

   public abstract boolean h();

   public abstract eii.b j();

   public abstract n n();

   public abstract Collection<String> g();

   public abstract eii.b k();

   public abstract eii.a l();

   public static enum a {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      private static final Map<String, eii.a> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (eii.a)$$0));
      public final String e;
      public final int f;

      @Nullable
      public static eii.a a(String $$0) {
         return g.get($$0);
      }

      private a(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public tl a() {
         return tl.c("team.collision." + this.e);
      }
   }

   public static enum b {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      private static final Map<String, eii.b> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (eii.b)$$0));
      public final String e;
      public final int f;

      public static String[] a() {
         return g.keySet().toArray(new String[0]);
      }

      @Nullable
      public static eii.b a(String $$0) {
         return g.get($$0);
      }

      private b(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public tl b() {
         return tl.c("team.visibility." + this.e);
      }
   }
}
