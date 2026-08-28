import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class fav {
   private static final Map<String, fav> a = Maps.newHashMap();
   private static final Map<String, fav> o = Maps.newHashMap();
   public static final fav b = b("dummy");
   public static final fav c = b("trigger");
   public static final fav d = b("deathCount");
   public static final fav e = b("playerKillCount");
   public static final fav f = b("totalKillCount");
   public static final fav g = a("health", true, fav.a.b);
   public static final fav h = a("food", true, fav.a.a);
   public static final fav i = a("air", true, fav.a.a);
   public static final fav j = a("armor", true, fav.a.a);
   public static final fav k = a("xp", true, fav.a.a);
   public static final fav l = a("level", true, fav.a.a);
   public static final fav[] m = new fav[]{
      b("teamkill." + n.a.g()),
      b("teamkill." + n.b.g()),
      b("teamkill." + n.c.g()),
      b("teamkill." + n.d.g()),
      b("teamkill." + n.e.g()),
      b("teamkill." + n.f.g()),
      b("teamkill." + n.g.g()),
      b("teamkill." + n.h.g()),
      b("teamkill." + n.i.g()),
      b("teamkill." + n.j.g()),
      b("teamkill." + n.k.g()),
      b("teamkill." + n.l.g()),
      b("teamkill." + n.m.g()),
      b("teamkill." + n.n.g()),
      b("teamkill." + n.o.g()),
      b("teamkill." + n.p.g())
   };
   public static final fav[] n = new fav[]{
      b("killedByTeam." + n.a.g()),
      b("killedByTeam." + n.b.g()),
      b("killedByTeam." + n.c.g()),
      b("killedByTeam." + n.d.g()),
      b("killedByTeam." + n.e.g()),
      b("killedByTeam." + n.f.g()),
      b("killedByTeam." + n.g.g()),
      b("killedByTeam." + n.h.g()),
      b("killedByTeam." + n.i.g()),
      b("killedByTeam." + n.j.g()),
      b("killedByTeam." + n.k.g()),
      b("killedByTeam." + n.l.g()),
      b("killedByTeam." + n.m.g()),
      b("killedByTeam." + n.n.g()),
      b("killedByTeam." + n.o.g()),
      b("killedByTeam." + n.p.g())
   };
   private final String p;
   private final boolean q;
   private final fav.a r;

   private static fav a(String $$0, boolean $$1, fav.a $$2) {
      fav $$3 = new fav($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static fav b(String $$0) {
      return a($$0, false, fav.a.a);
   }

   protected fav(String $$0) {
      this($$0, false, fav.a.a);
   }

   protected fav(String $$0, boolean $$1, fav.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<fav> a(String $$0) {
      fav $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : ly.v.b(ali.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ali.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<fav> a(awu<T> $$0, ali $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public fav.a f() {
      return this.r;
   }

   public static enum a implements bag {
      a("integer"),
      b("hearts");

      private final String d;
      public static final bag.a<fav.a> c = bag.a(fav.a::values);

      private a(final String $$0) {
         this.d = $$0;
      }

      public String a() {
         return this.d;
      }

      @Override
      public String c() {
         return this.d;
      }

      public static fav.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
