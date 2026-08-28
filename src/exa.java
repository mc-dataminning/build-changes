import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class exa {
   private static final Map<String, exa> a = Maps.newHashMap();
   private static final Map<String, exa> o = Maps.newHashMap();
   public static final exa b = b("dummy");
   public static final exa c = b("trigger");
   public static final exa d = b("deathCount");
   public static final exa e = b("playerKillCount");
   public static final exa f = b("totalKillCount");
   public static final exa g = a("health", true, exa.a.b);
   public static final exa h = a("food", true, exa.a.a);
   public static final exa i = a("air", true, exa.a.a);
   public static final exa j = a("armor", true, exa.a.a);
   public static final exa k = a("xp", true, exa.a.a);
   public static final exa l = a("level", true, exa.a.a);
   public static final exa[] m = new exa[]{
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
   public static final exa[] n = new exa[]{
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
   private final exa.a r;

   private static exa a(String $$0, boolean $$1, exa.a $$2) {
      exa $$3 = new exa($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static exa b(String $$0) {
      return a($$0, false, exa.a.a);
   }

   protected exa(String $$0) {
      this($$0, false, exa.a.a);
   }

   protected exa(String $$0, boolean $$1, exa.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<exa> a(String $$0) {
      exa $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lp.x.b(alf.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, alf.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<exa> a(awj<T> $$0, alf $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public exa.a f() {
      return this.r;
   }

   public static enum a implements azu {
      a("integer"),
      b("hearts");

      private final String d;
      public static final azu.a<exa.a> c = azu.a(exa.a::values);

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

      public static exa.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
