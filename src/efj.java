import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class efj {
   private static final Map<String, efj> n = Maps.newHashMap();
   private static final Map<String, efj> o = Maps.newHashMap();
   public static final efj a = b("dummy");
   public static final efj b = b("trigger");
   public static final efj c = b("deathCount");
   public static final efj d = b("playerKillCount");
   public static final efj e = b("totalKillCount");
   public static final efj f = a("health", true, efj.a.b);
   public static final efj g = a("food", true, efj.a.a);
   public static final efj h = a("air", true, efj.a.a);
   public static final efj i = a("armor", true, efj.a.a);
   public static final efj j = a("xp", true, efj.a.a);
   public static final efj k = a("level", true, efj.a.a);
   public static final efj[] l = new efj[]{
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
   public static final efj[] m = new efj[]{
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
   private final efj.a r;

   private static efj a(String $$0, boolean $$1, efj.a $$2) {
      efj $$3 = new efj($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static efj b(String $$0) {
      return a($$0, false, efj.a.a);
   }

   protected efj(String $$0) {
      this($$0, false, efj.a.a);
   }

   protected efj(String $$0, boolean $$1, efj.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<efj> a(String $$0) {
      efj $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : jb.y.b(acq.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, acq.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<efj> a(amq<T> $$0, acq $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public efj.a f() {
      return this.r;
   }

   public static enum a implements apr {
      a("integer"),
      b("hearts");

      private final String d;
      public static final apr.a<efj.a> c = apr.a(efj.a::values);

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

      public static efj.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
