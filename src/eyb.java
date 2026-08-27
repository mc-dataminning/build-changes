import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eyb {
   private static final Map<String, eyb> a = Maps.newHashMap();
   private static final Map<String, eyb> o = Maps.newHashMap();
   public static final eyb b = b("dummy");
   public static final eyb c = b("trigger");
   public static final eyb d = b("deathCount");
   public static final eyb e = b("playerKillCount");
   public static final eyb f = b("totalKillCount");
   public static final eyb g = a("health", true, eyb.a.b);
   public static final eyb h = a("food", true, eyb.a.a);
   public static final eyb i = a("air", true, eyb.a.a);
   public static final eyb j = a("armor", true, eyb.a.a);
   public static final eyb k = a("xp", true, eyb.a.a);
   public static final eyb l = a("level", true, eyb.a.a);
   public static final eyb[] m = new eyb[]{
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
   public static final eyb[] n = new eyb[]{
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
   private final eyb.a r;

   private static eyb a(String $$0, boolean $$1, eyb.a $$2) {
      eyb $$3 = new eyb($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static eyb b(String $$0) {
      return a($$0, false, eyb.a.a);
   }

   protected eyb(String $$0) {
      this($$0, false, eyb.a.a);
   }

   protected eyb(String $$0, boolean $$1, eyb.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<eyb> a(String $$0) {
      eyb $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lh.x.b(akt.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, akt.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eyb> a(avy<T> $$0, akt $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eyb.a f() {
      return this.r;
   }

   public static enum a implements azg {
      a("integer"),
      b("hearts");

      private final String d;
      public static final azg.a<eyb.a> c = azg.a(eyb.a::values);

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

      public static eyb.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
