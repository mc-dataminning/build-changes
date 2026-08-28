import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eyd {
   private static final Map<String, eyd> a = Maps.newHashMap();
   private static final Map<String, eyd> o = Maps.newHashMap();
   public static final eyd b = b("dummy");
   public static final eyd c = b("trigger");
   public static final eyd d = b("deathCount");
   public static final eyd e = b("playerKillCount");
   public static final eyd f = b("totalKillCount");
   public static final eyd g = a("health", true, eyd.a.b);
   public static final eyd h = a("food", true, eyd.a.a);
   public static final eyd i = a("air", true, eyd.a.a);
   public static final eyd j = a("armor", true, eyd.a.a);
   public static final eyd k = a("xp", true, eyd.a.a);
   public static final eyd l = a("level", true, eyd.a.a);
   public static final eyd[] m = new eyd[]{
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
   public static final eyd[] n = new eyd[]{
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
   private final eyd.a r;

   private static eyd a(String $$0, boolean $$1, eyd.a $$2) {
      eyd $$3 = new eyd($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static eyd b(String $$0) {
      return a($$0, false, eyd.a.a);
   }

   protected eyd(String $$0) {
      this($$0, false, eyd.a.a);
   }

   protected eyd(String $$0, boolean $$1, eyd.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<eyd> a(String $$0) {
      eyd $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lt.v.b(akq.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, akq.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eyd> a(avx<T> $$0, akq $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eyd.a f() {
      return this.r;
   }

   public static enum a implements azj {
      a("integer"),
      b("hearts");

      private final String d;
      public static final azj.a<eyd.a> c = azj.a(eyd.a::values);

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

      public static eyd.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
