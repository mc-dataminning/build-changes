import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eip {
   private static final Map<String, eip> n = Maps.newHashMap();
   private static final Map<String, eip> o = Maps.newHashMap();
   public static final eip a = b("dummy");
   public static final eip b = b("trigger");
   public static final eip c = b("deathCount");
   public static final eip d = b("playerKillCount");
   public static final eip e = b("totalKillCount");
   public static final eip f = a("health", true, eip.a.b);
   public static final eip g = a("food", true, eip.a.a);
   public static final eip h = a("air", true, eip.a.a);
   public static final eip i = a("armor", true, eip.a.a);
   public static final eip j = a("xp", true, eip.a.a);
   public static final eip k = a("level", true, eip.a.a);
   public static final eip[] l = new eip[]{
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
   public static final eip[] m = new eip[]{
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
   private final eip.a r;

   private static eip a(String $$0, boolean $$1, eip.a $$2) {
      eip $$3 = new eip($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static eip b(String $$0) {
      return a($$0, false, eip.a.a);
   }

   protected eip(String $$0) {
      this($$0, false, eip.a.a);
   }

   protected eip(String $$0, boolean $$1, eip.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<eip> a(String $$0) {
      eip $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : jd.y.b(aex.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, aex.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eip> a(apn<T> $$0, aex $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eip.a f() {
      return this.r;
   }

   public static enum a implements asp {
      a("integer"),
      b("hearts");

      private final String d;
      public static final asp.a<eip.a> c = asp.a(eip.a::values);

      private a(String $$0) {
         this.d = $$0;
      }

      public String a() {
         return this.d;
      }

      @Override
      public String c() {
         return this.d;
      }

      public static eip.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
