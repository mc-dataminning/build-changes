import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eif {
   private static final Map<String, eif> n = Maps.newHashMap();
   private static final Map<String, eif> o = Maps.newHashMap();
   public static final eif a = b("dummy");
   public static final eif b = b("trigger");
   public static final eif c = b("deathCount");
   public static final eif d = b("playerKillCount");
   public static final eif e = b("totalKillCount");
   public static final eif f = a("health", true, eif.a.b);
   public static final eif g = a("food", true, eif.a.a);
   public static final eif h = a("air", true, eif.a.a);
   public static final eif i = a("armor", true, eif.a.a);
   public static final eif j = a("xp", true, eif.a.a);
   public static final eif k = a("level", true, eif.a.a);
   public static final eif[] l = new eif[]{
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
   public static final eif[] m = new eif[]{
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
   private final eif.a r;

   private static eif a(String $$0, boolean $$1, eif.a $$2) {
      eif $$3 = new eif($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static eif b(String $$0) {
      return a($$0, false, eif.a.a);
   }

   protected eif(String $$0) {
      this($$0, false, eif.a.a);
   }

   protected eif(String $$0, boolean $$1, eif.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<eif> a(String $$0) {
      eif $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : jb.y.b(aer.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, aer.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eif> a(apf<T> $$0, aer $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eif.a f() {
      return this.r;
   }

   public static enum a implements ash {
      a("integer"),
      b("hearts");

      private final String d;
      public static final ash.a<eif.a> c = ash.a(eif.a::values);

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

      public static eif.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
