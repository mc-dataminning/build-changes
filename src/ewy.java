import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ewy {
   private static final Map<String, ewy> a = Maps.newHashMap();
   private static final Map<String, ewy> o = Maps.newHashMap();
   public static final ewy b = b("dummy");
   public static final ewy c = b("trigger");
   public static final ewy d = b("deathCount");
   public static final ewy e = b("playerKillCount");
   public static final ewy f = b("totalKillCount");
   public static final ewy g = a("health", true, ewy.a.b);
   public static final ewy h = a("food", true, ewy.a.a);
   public static final ewy i = a("air", true, ewy.a.a);
   public static final ewy j = a("armor", true, ewy.a.a);
   public static final ewy k = a("xp", true, ewy.a.a);
   public static final ewy l = a("level", true, ewy.a.a);
   public static final ewy[] m = new ewy[]{
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
   public static final ewy[] n = new ewy[]{
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
   private final ewy.a r;

   private static ewy a(String $$0, boolean $$1, ewy.a $$2) {
      ewy $$3 = new ewy($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static ewy b(String $$0) {
      return a($$0, false, ewy.a.a);
   }

   protected ewy(String $$0) {
      this($$0, false, ewy.a.a);
   }

   protected ewy(String $$0, boolean $$1, ewy.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<ewy> a(String $$0) {
      ewy $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lp.x.b(alf.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, alf.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<ewy> a(awj<T> $$0, alf $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public ewy.a f() {
      return this.r;
   }

   public static enum a implements azu {
      a("integer"),
      b("hearts");

      private final String d;
      public static final azu.a<ewy.a> c = azu.a(ewy.a::values);

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

      public static ewy.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
