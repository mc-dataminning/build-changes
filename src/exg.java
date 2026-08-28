import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class exg {
   private static final Map<String, exg> a = Maps.newHashMap();
   private static final Map<String, exg> o = Maps.newHashMap();
   public static final exg b = b("dummy");
   public static final exg c = b("trigger");
   public static final exg d = b("deathCount");
   public static final exg e = b("playerKillCount");
   public static final exg f = b("totalKillCount");
   public static final exg g = a("health", true, exg.a.b);
   public static final exg h = a("food", true, exg.a.a);
   public static final exg i = a("air", true, exg.a.a);
   public static final exg j = a("armor", true, exg.a.a);
   public static final exg k = a("xp", true, exg.a.a);
   public static final exg l = a("level", true, exg.a.a);
   public static final exg[] m = new exg[]{
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
   public static final exg[] n = new exg[]{
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
   private final exg.a r;

   private static exg a(String $$0, boolean $$1, exg.a $$2) {
      exg $$3 = new exg($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static exg b(String $$0) {
      return a($$0, false, exg.a.a);
   }

   protected exg(String $$0) {
      this($$0, false, exg.a.a);
   }

   protected exg(String $$0, boolean $$1, exg.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<exg> a(String $$0) {
      exg $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lq.v.b(akk.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, akk.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<exg> a(avo<T> $$0, akk $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public exg.a f() {
      return this.r;
   }

   public static enum a implements ayz {
      a("integer"),
      b("hearts");

      private final String d;
      public static final ayz.a<exg.a> c = ayz.a(exg.a::values);

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

      public static exg.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
