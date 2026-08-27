import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class emt {
   private static final Map<String, emt> n = Maps.newHashMap();
   private static final Map<String, emt> o = Maps.newHashMap();
   public static final emt a = b("dummy");
   public static final emt b = b("trigger");
   public static final emt c = b("deathCount");
   public static final emt d = b("playerKillCount");
   public static final emt e = b("totalKillCount");
   public static final emt f = a("health", true, emt.a.b);
   public static final emt g = a("food", true, emt.a.a);
   public static final emt h = a("air", true, emt.a.a);
   public static final emt i = a("armor", true, emt.a.a);
   public static final emt j = a("xp", true, emt.a.a);
   public static final emt k = a("level", true, emt.a.a);
   public static final emt[] l = new emt[]{
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
   public static final emt[] m = new emt[]{
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
   private final emt.a r;

   private static emt a(String $$0, boolean $$1, emt.a $$2) {
      emt $$3 = new emt($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static emt b(String $$0) {
      return a($$0, false, emt.a.a);
   }

   protected emt(String $$0) {
      this($$0, false, emt.a.a);
   }

   protected emt(String $$0, boolean $$1, emt.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<emt> a(String $$0) {
      emt $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : kd.x.b(ahd.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ahd.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<emt> a(arv<T> $$0, ahd $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public emt.a f() {
      return this.r;
   }

   public static enum a implements ave {
      a("integer"),
      b("hearts");

      private final String d;
      public static final ave.a<emt.a> c = ave.a(emt.a::values);

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

      public static emt.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
