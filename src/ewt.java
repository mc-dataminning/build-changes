import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ewt {
   private static final Map<String, ewt> a = Maps.newHashMap();
   private static final Map<String, ewt> o = Maps.newHashMap();
   public static final ewt b = b("dummy");
   public static final ewt c = b("trigger");
   public static final ewt d = b("deathCount");
   public static final ewt e = b("playerKillCount");
   public static final ewt f = b("totalKillCount");
   public static final ewt g = a("health", true, ewt.a.b);
   public static final ewt h = a("food", true, ewt.a.a);
   public static final ewt i = a("air", true, ewt.a.a);
   public static final ewt j = a("armor", true, ewt.a.a);
   public static final ewt k = a("xp", true, ewt.a.a);
   public static final ewt l = a("level", true, ewt.a.a);
   public static final ewt[] m = new ewt[]{
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
   public static final ewt[] n = new ewt[]{
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
   private final ewt.a r;

   private static ewt a(String $$0, boolean $$1, ewt.a $$2) {
      ewt $$3 = new ewt($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static ewt b(String $$0) {
      return a($$0, false, ewt.a.a);
   }

   protected ewt(String $$0) {
      this($$0, false, ewt.a.a);
   }

   protected ewt(String $$0, boolean $$1, ewt.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<ewt> a(String $$0) {
      ewt $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lp.x.b(alb.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, alb.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<ewt> a(awf<T> $$0, alb $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public ewt.a f() {
      return this.r;
   }

   public static enum a implements azp {
      a("integer"),
      b("hearts");

      private final String d;
      public static final azp.a<ewt.a> c = azp.a(ewt.a::values);

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

      public static ewt.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
