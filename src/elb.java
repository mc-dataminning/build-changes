import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class elb {
   private static final Map<String, elb> n = Maps.newHashMap();
   private static final Map<String, elb> o = Maps.newHashMap();
   public static final elb a = b("dummy");
   public static final elb b = b("trigger");
   public static final elb c = b("deathCount");
   public static final elb d = b("playerKillCount");
   public static final elb e = b("totalKillCount");
   public static final elb f = a("health", true, elb.a.b);
   public static final elb g = a("food", true, elb.a.a);
   public static final elb h = a("air", true, elb.a.a);
   public static final elb i = a("armor", true, elb.a.a);
   public static final elb j = a("xp", true, elb.a.a);
   public static final elb k = a("level", true, elb.a.a);
   public static final elb[] l = new elb[]{
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
   public static final elb[] m = new elb[]{
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
   private final elb.a r;

   private static elb a(String $$0, boolean $$1, elb.a $$2) {
      elb $$3 = new elb($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static elb b(String $$0) {
      return a($$0, false, elb.a.a);
   }

   protected elb(String $$0) {
      this($$0, false, elb.a.a);
   }

   protected elb(String $$0, boolean $$1, elb.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<elb> a(String $$0) {
      elb $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : kc.y.b(agm.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, agm.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<elb> a(are<T> $$0, agm $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public elb.a f() {
      return this.r;
   }

   public static enum a implements auk {
      a("integer"),
      b("hearts");

      private final String d;
      public static final auk.a<elb.a> c = auk.a(elb.a::values);

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

      public static elb.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
