import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class fap {
   private static final Map<String, fap> a = Maps.newHashMap();
   private static final Map<String, fap> o = Maps.newHashMap();
   public static final fap b = b("dummy");
   public static final fap c = b("trigger");
   public static final fap d = b("deathCount");
   public static final fap e = b("playerKillCount");
   public static final fap f = b("totalKillCount");
   public static final fap g = a("health", true, fap.a.b);
   public static final fap h = a("food", true, fap.a.a);
   public static final fap i = a("air", true, fap.a.a);
   public static final fap j = a("armor", true, fap.a.a);
   public static final fap k = a("xp", true, fap.a.a);
   public static final fap l = a("level", true, fap.a.a);
   public static final fap[] m = new fap[]{
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
   public static final fap[] n = new fap[]{
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
   private final fap.a r;

   private static fap a(String $$0, boolean $$1, fap.a $$2) {
      fap $$3 = new fap($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static fap b(String $$0) {
      return a($$0, false, fap.a.a);
   }

   protected fap(String $$0) {
      this($$0, false, fap.a.a);
   }

   protected fap(String $$0, boolean $$1, fap.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<fap> a(String $$0) {
      fap $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lx.v.b(alh.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, alh.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<fap> a(awt<T> $$0, alh $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public fap.a f() {
      return this.r;
   }

   public static enum a implements baf {
      a("integer"),
      b("hearts");

      private final String d;
      public static final baf.a<fap.a> c = baf.a(fap.a::values);

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

      public static fap.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
