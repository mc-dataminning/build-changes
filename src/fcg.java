import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class fcg {
   private static final Map<String, fcg> a = Maps.newHashMap();
   private static final Map<String, fcg> o = Maps.newHashMap();
   public static final fcg b = b("dummy");
   public static final fcg c = b("trigger");
   public static final fcg d = b("deathCount");
   public static final fcg e = b("playerKillCount");
   public static final fcg f = b("totalKillCount");
   public static final fcg g = a("health", true, fcg.a.b);
   public static final fcg h = a("food", true, fcg.a.a);
   public static final fcg i = a("air", true, fcg.a.a);
   public static final fcg j = a("armor", true, fcg.a.a);
   public static final fcg k = a("xp", true, fcg.a.a);
   public static final fcg l = a("level", true, fcg.a.a);
   public static final fcg[] m = new fcg[]{
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
   public static final fcg[] n = new fcg[]{
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
   private final fcg.a r;

   private static fcg a(String $$0, boolean $$1, fcg.a $$2) {
      fcg $$3 = new fcg($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static fcg b(String $$0) {
      return a($$0, false, fcg.a.a);
   }

   protected fcg(String $$0) {
      this($$0, false, fcg.a.a);
   }

   protected fcg(String $$0, boolean $$1, fcg.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<fcg> a(String $$0) {
      fcg $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : mb.v.b(aku.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, aku.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<fcg> a(awi<T> $$0, aku $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public fcg.a f() {
      return this.r;
   }

   public static enum a implements azu {
      a("integer"),
      b("hearts");

      private final String d;
      public static final azu.a<fcg.a> c = azu.a(fcg.a::values);

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

      public static fcg.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
