import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eir {
   private static final Map<String, eir> n = Maps.newHashMap();
   private static final Map<String, eir> o = Maps.newHashMap();
   public static final eir a = b("dummy");
   public static final eir b = b("trigger");
   public static final eir c = b("deathCount");
   public static final eir d = b("playerKillCount");
   public static final eir e = b("totalKillCount");
   public static final eir f = a("health", true, eir.a.b);
   public static final eir g = a("food", true, eir.a.a);
   public static final eir h = a("air", true, eir.a.a);
   public static final eir i = a("armor", true, eir.a.a);
   public static final eir j = a("xp", true, eir.a.a);
   public static final eir k = a("level", true, eir.a.a);
   public static final eir[] l = new eir[]{
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
   public static final eir[] m = new eir[]{
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
   private final eir.a r;

   private static eir a(String $$0, boolean $$1, eir.a $$2) {
      eir $$3 = new eir($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static eir b(String $$0) {
      return a($$0, false, eir.a.a);
   }

   protected eir(String $$0) {
      this($$0, false, eir.a.a);
   }

   protected eir(String $$0, boolean $$1, eir.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<eir> a(String $$0) {
      eir $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : jd.y.b(aey.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, aey.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eir> a(apo<T> $$0, aey $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eir.a f() {
      return this.r;
   }

   public static enum a implements asr {
      a("integer"),
      b("hearts");

      private final String d;
      public static final asr.a<eir.a> c = asr.a(eir.a::values);

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

      public static eir.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
