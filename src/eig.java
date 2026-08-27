import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eig {
   private static final Map<String, eig> n = Maps.newHashMap();
   private static final Map<String, eig> o = Maps.newHashMap();
   public static final eig a = b("dummy");
   public static final eig b = b("trigger");
   public static final eig c = b("deathCount");
   public static final eig d = b("playerKillCount");
   public static final eig e = b("totalKillCount");
   public static final eig f = a("health", true, eig.a.b);
   public static final eig g = a("food", true, eig.a.a);
   public static final eig h = a("air", true, eig.a.a);
   public static final eig i = a("armor", true, eig.a.a);
   public static final eig j = a("xp", true, eig.a.a);
   public static final eig k = a("level", true, eig.a.a);
   public static final eig[] l = new eig[]{
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
   public static final eig[] m = new eig[]{
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
   private final eig.a r;

   private static eig a(String $$0, boolean $$1, eig.a $$2) {
      eig $$3 = new eig($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static eig b(String $$0) {
      return a($$0, false, eig.a.a);
   }

   protected eig(String $$0) {
      this($$0, false, eig.a.a);
   }

   protected eig(String $$0, boolean $$1, eig.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<eig> a(String $$0) {
      eig $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : jb.y.b(aer.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, aer.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eig> a(apf<T> $$0, aer $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eig.a f() {
      return this.r;
   }

   public static enum a implements ash {
      a("integer"),
      b("hearts");

      private final String d;
      public static final ash.a<eig.a> c = ash.a(eig.a::values);

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

      public static eig.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
