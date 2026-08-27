import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eum {
   private static final Map<String, eum> a = Maps.newHashMap();
   private static final Map<String, eum> o = Maps.newHashMap();
   public static final eum b = b("dummy");
   public static final eum c = b("trigger");
   public static final eum d = b("deathCount");
   public static final eum e = b("playerKillCount");
   public static final eum f = b("totalKillCount");
   public static final eum g = a("health", true, eum.a.b);
   public static final eum h = a("food", true, eum.a.a);
   public static final eum i = a("air", true, eum.a.a);
   public static final eum j = a("armor", true, eum.a.a);
   public static final eum k = a("xp", true, eum.a.a);
   public static final eum l = a("level", true, eum.a.a);
   public static final eum[] m = new eum[]{
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
   public static final eum[] n = new eum[]{
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
   private final eum.a r;

   private static eum a(String $$0, boolean $$1, eum.a $$2) {
      eum $$3 = new eum($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static eum b(String $$0) {
      return a($$0, false, eum.a.a);
   }

   protected eum(String $$0) {
      this($$0, false, eum.a.a);
   }

   protected eum(String $$0, boolean $$1, eum.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<eum> a(String $$0) {
      eum $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lc.x.b(akf.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, akf.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eum> a(avi<T> $$0, akf $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eum.a f() {
      return this.r;
   }

   public static enum a implements ayq {
      a("integer"),
      b("hearts");

      private final String d;
      public static final ayq.a<eum.a> c = ayq.a(eum.a::values);

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

      public static eum.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
