import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ejh {
   private static final Map<String, ejh> n = Maps.newHashMap();
   private static final Map<String, ejh> o = Maps.newHashMap();
   public static final ejh a = b("dummy");
   public static final ejh b = b("trigger");
   public static final ejh c = b("deathCount");
   public static final ejh d = b("playerKillCount");
   public static final ejh e = b("totalKillCount");
   public static final ejh f = a("health", true, ejh.a.b);
   public static final ejh g = a("food", true, ejh.a.a);
   public static final ejh h = a("air", true, ejh.a.a);
   public static final ejh i = a("armor", true, ejh.a.a);
   public static final ejh j = a("xp", true, ejh.a.a);
   public static final ejh k = a("level", true, ejh.a.a);
   public static final ejh[] l = new ejh[]{
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
   public static final ejh[] m = new ejh[]{
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
   private final ejh.a r;

   private static ejh a(String $$0, boolean $$1, ejh.a $$2) {
      ejh $$3 = new ejh($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static ejh b(String $$0) {
      return a($$0, false, ejh.a.a);
   }

   protected ejh(String $$0) {
      this($$0, false, ejh.a.a);
   }

   protected ejh(String $$0, boolean $$1, ejh.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<ejh> a(String $$0) {
      ejh $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : jy.y.b(afw.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, afw.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<ejh> a(aqm<T> $$0, afw $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public ejh.a f() {
      return this.r;
   }

   public static enum a implements atr {
      a("integer"),
      b("hearts");

      private final String d;
      public static final atr.a<ejh.a> c = atr.a(ejh.a::values);

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

      public static ejh.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
