import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eth {
   private static final Map<String, eth> a = Maps.newHashMap();
   private static final Map<String, eth> o = Maps.newHashMap();
   public static final eth b = b("dummy");
   public static final eth c = b("trigger");
   public static final eth d = b("deathCount");
   public static final eth e = b("playerKillCount");
   public static final eth f = b("totalKillCount");
   public static final eth g = a("health", true, eth.a.b);
   public static final eth h = a("food", true, eth.a.a);
   public static final eth i = a("air", true, eth.a.a);
   public static final eth j = a("armor", true, eth.a.a);
   public static final eth k = a("xp", true, eth.a.a);
   public static final eth l = a("level", true, eth.a.a);
   public static final eth[] m = new eth[]{
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
   public static final eth[] n = new eth[]{
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
   private final eth.a r;

   private static eth a(String $$0, boolean $$1, eth.a $$2) {
      eth $$3 = new eth($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static eth b(String $$0) {
      return a($$0, false, eth.a.a);
   }

   protected eth(String $$0) {
      this($$0, false, eth.a.a);
   }

   protected eth(String $$0, boolean $$1, eth.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<eth> a(String $$0) {
      eth $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : kr.x.b(ajt.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ajt.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eth> a(auv<T> $$0, ajt $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eth.a f() {
      return this.r;
   }

   public static enum a implements aye {
      a("integer"),
      b("hearts");

      private final String d;
      public static final aye.a<eth.a> c = aye.a(eth.a::values);

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

      public static eth.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
