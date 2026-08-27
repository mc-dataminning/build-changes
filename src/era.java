import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class era {
   private static final Map<String, era> a = Maps.newHashMap();
   private static final Map<String, era> o = Maps.newHashMap();
   public static final era b = b("dummy");
   public static final era c = b("trigger");
   public static final era d = b("deathCount");
   public static final era e = b("playerKillCount");
   public static final era f = b("totalKillCount");
   public static final era g = a("health", true, era.a.b);
   public static final era h = a("food", true, era.a.a);
   public static final era i = a("air", true, era.a.a);
   public static final era j = a("armor", true, era.a.a);
   public static final era k = a("xp", true, era.a.a);
   public static final era l = a("level", true, era.a.a);
   public static final era[] m = new era[]{
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
   public static final era[] n = new era[]{
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
   private final era.a r;

   private static era a(String $$0, boolean $$1, era.a $$2) {
      era $$3 = new era($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static era b(String $$0) {
      return a($$0, false, era.a.a);
   }

   protected era(String $$0) {
      this($$0, false, era.a.a);
   }

   protected era(String $$0, boolean $$1, era.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<era> a(String $$0) {
      era $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : ki.x.b(ajh.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ajh.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<era> a(auh<T> $$0, ajh $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public era.a f() {
      return this.r;
   }

   public static enum a implements axq {
      a("integer"),
      b("hearts");

      private final String d;
      public static final axq.a<era.a> c = axq.a(era.a::values);

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

      public static era.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
