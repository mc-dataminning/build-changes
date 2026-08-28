import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eyj {
   private static final Map<String, eyj> a = Maps.newHashMap();
   private static final Map<String, eyj> o = Maps.newHashMap();
   public static final eyj b = b("dummy");
   public static final eyj c = b("trigger");
   public static final eyj d = b("deathCount");
   public static final eyj e = b("playerKillCount");
   public static final eyj f = b("totalKillCount");
   public static final eyj g = a("health", true, eyj.a.b);
   public static final eyj h = a("food", true, eyj.a.a);
   public static final eyj i = a("air", true, eyj.a.a);
   public static final eyj j = a("armor", true, eyj.a.a);
   public static final eyj k = a("xp", true, eyj.a.a);
   public static final eyj l = a("level", true, eyj.a.a);
   public static final eyj[] m = new eyj[]{
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
   public static final eyj[] n = new eyj[]{
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
   private final eyj.a r;

   private static eyj a(String $$0, boolean $$1, eyj.a $$2) {
      eyj $$3 = new eyj($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static eyj b(String $$0) {
      return a($$0, false, eyj.a.a);
   }

   protected eyj(String $$0) {
      this($$0, false, eyj.a.a);
   }

   protected eyj(String $$0, boolean $$1, eyj.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<eyj> a(String $$0) {
      eyj $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lt.v.b(akr.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, akr.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eyj> a(avy<T> $$0, akr $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eyj.a f() {
      return this.r;
   }

   public static enum a implements azk {
      a("integer"),
      b("hearts");

      private final String d;
      public static final azk.a<eyj.a> c = azk.a(eyj.a::values);

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

      public static eyj.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
