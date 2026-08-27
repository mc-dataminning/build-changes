import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ena {
   private static final Map<String, ena> n = Maps.newHashMap();
   private static final Map<String, ena> o = Maps.newHashMap();
   public static final ena a = b("dummy");
   public static final ena b = b("trigger");
   public static final ena c = b("deathCount");
   public static final ena d = b("playerKillCount");
   public static final ena e = b("totalKillCount");
   public static final ena f = a("health", true, ena.a.b);
   public static final ena g = a("food", true, ena.a.a);
   public static final ena h = a("air", true, ena.a.a);
   public static final ena i = a("armor", true, ena.a.a);
   public static final ena j = a("xp", true, ena.a.a);
   public static final ena k = a("level", true, ena.a.a);
   public static final ena[] l = new ena[]{
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
   public static final ena[] m = new ena[]{
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
   private final ena.a r;

   private static ena a(String $$0, boolean $$1, ena.a $$2) {
      ena $$3 = new ena($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static ena b(String $$0) {
      return a($$0, false, ena.a.a);
   }

   protected ena(String $$0) {
      this($$0, false, ena.a.a);
   }

   protected ena(String $$0, boolean $$1, ena.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<ena> a(String $$0) {
      ena $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : kd.x.b(ahg.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ahg.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<ena> a(asb<T> $$0, ahg $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public ena.a f() {
      return this.r;
   }

   public static enum a implements avk {
      a("integer"),
      b("hearts");

      private final String d;
      public static final avk.a<ena.a> c = avk.a(ena.a::values);

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

      public static ena.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
