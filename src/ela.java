import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ela {
   public boolean a(@Nullable ela $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String b();

   public abstract vj d(uv var1);

   public abstract boolean i();

   public abstract boolean h();

   public abstract ela.b j();

   public abstract n n();

   public abstract Collection<String> g();

   public abstract ela.b k();

   public abstract ela.a l();

   public static enum a {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      private static final Map<String, ela.a> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (ela.a)$$0));
      public final String e;
      public final int f;

      @Nullable
      public static ela.a a(String $$0) {
         return g.get($$0);
      }

      private a(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public uv a() {
         return uv.c("team.collision." + this.e);
      }
   }

   public static enum b {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      private static final Map<String, ela.b> g = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, $$0 -> (ela.b)$$0));
      public final String e;
      public final int f;

      public static String[] a() {
         return g.keySet().toArray(new String[0]);
      }

      @Nullable
      public static ela.b a(String $$0) {
         return g.get($$0);
      }

      private b(String $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public uv b() {
         return uv.c("team.visibility." + this.e);
      }
   }
}
