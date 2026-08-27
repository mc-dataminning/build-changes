import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eik {
   private static final Map<String, eik> n = Maps.newHashMap();
   private static final Map<String, eik> o = Maps.newHashMap();
   public static final eik a = b("dummy");
   public static final eik b = b("trigger");
   public static final eik c = b("deathCount");
   public static final eik d = b("playerKillCount");
   public static final eik e = b("totalKillCount");
   public static final eik f = a("health", true, eik.a.b);
   public static final eik g = a("food", true, eik.a.a);
   public static final eik h = a("air", true, eik.a.a);
   public static final eik i = a("armor", true, eik.a.a);
   public static final eik j = a("xp", true, eik.a.a);
   public static final eik k = a("level", true, eik.a.a);
   public static final eik[] l = new eik[]{
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
   public static final eik[] m = new eik[]{
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
   private final eik.a r;

   private static eik a(String $$0, boolean $$1, eik.a $$2) {
      eik $$3 = new eik($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static eik b(String $$0) {
      return a($$0, false, eik.a.a);
   }

   protected eik(String $$0) {
      this($$0, false, eik.a.a);
   }

   protected eik(String $$0, boolean $$1, eik.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<eik> a(String $$0) {
      eik $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : jd.y.b(aeu.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, aeu.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eik> a(api<T> $$0, aeu $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eik.a f() {
      return this.r;
   }

   public static enum a implements ask {
      a("integer"),
      b("hearts");

      private final String d;
      public static final ask.a<eik.a> c = ask.a(eik.a::values);

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

      public static eik.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
