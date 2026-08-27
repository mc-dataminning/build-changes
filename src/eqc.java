import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eqc {
   private static final Map<String, eqc> a = Maps.newHashMap();
   private static final Map<String, eqc> o = Maps.newHashMap();
   public static final eqc b = b("dummy");
   public static final eqc c = b("trigger");
   public static final eqc d = b("deathCount");
   public static final eqc e = b("playerKillCount");
   public static final eqc f = b("totalKillCount");
   public static final eqc g = a("health", true, eqc.a.b);
   public static final eqc h = a("food", true, eqc.a.a);
   public static final eqc i = a("air", true, eqc.a.a);
   public static final eqc j = a("armor", true, eqc.a.a);
   public static final eqc k = a("xp", true, eqc.a.a);
   public static final eqc l = a("level", true, eqc.a.a);
   public static final eqc[] m = new eqc[]{
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
   public static final eqc[] n = new eqc[]{
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
   private final eqc.a r;

   private static eqc a(String $$0, boolean $$1, eqc.a $$2) {
      eqc $$3 = new eqc($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static eqc b(String $$0) {
      return a($$0, false, eqc.a.a);
   }

   protected eqc(String $$0) {
      this($$0, false, eqc.a.a);
   }

   protected eqc(String $$0, boolean $$1, eqc.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<eqc> a(String $$0) {
      eqc $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : kh.x.b(ajc.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ajc.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eqc> a(aty<T> $$0, ajc $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eqc.a f() {
      return this.r;
   }

   public static enum a implements axg {
      a("integer"),
      b("hearts");

      private final String d;
      public static final axg.a<eqc.a> c = axg.a(eqc.a::values);

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

      public static eqc.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
