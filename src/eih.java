import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eih {
   private static final Map<String, eih> n = Maps.newHashMap();
   private static final Map<String, eih> o = Maps.newHashMap();
   public static final eih a = b("dummy");
   public static final eih b = b("trigger");
   public static final eih c = b("deathCount");
   public static final eih d = b("playerKillCount");
   public static final eih e = b("totalKillCount");
   public static final eih f = a("health", true, eih.a.b);
   public static final eih g = a("food", true, eih.a.a);
   public static final eih h = a("air", true, eih.a.a);
   public static final eih i = a("armor", true, eih.a.a);
   public static final eih j = a("xp", true, eih.a.a);
   public static final eih k = a("level", true, eih.a.a);
   public static final eih[] l = new eih[]{
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
   public static final eih[] m = new eih[]{
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
   private final eih.a r;

   private static eih a(String $$0, boolean $$1, eih.a $$2) {
      eih $$3 = new eih($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static eih b(String $$0) {
      return a($$0, false, eih.a.a);
   }

   protected eih(String $$0) {
      this($$0, false, eih.a.a);
   }

   protected eih(String $$0, boolean $$1, eih.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<eih> a(String $$0) {
      eih $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : jc.y.b(aep.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, aep.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eih> a(apd<T> $$0, aep $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eih.a f() {
      return this.r;
   }

   public static enum a implements asf {
      a("integer"),
      b("hearts");

      private final String d;
      public static final asf.a<eih.a> c = asf.a(eih.a::values);

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

      public static eih.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
