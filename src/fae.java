import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class fae {
   private static final Map<String, fae> a = Maps.newHashMap();
   private static final Map<String, fae> o = Maps.newHashMap();
   public static final fae b = b("dummy");
   public static final fae c = b("trigger");
   public static final fae d = b("deathCount");
   public static final fae e = b("playerKillCount");
   public static final fae f = b("totalKillCount");
   public static final fae g = a("health", true, fae.a.b);
   public static final fae h = a("food", true, fae.a.a);
   public static final fae i = a("air", true, fae.a.a);
   public static final fae j = a("armor", true, fae.a.a);
   public static final fae k = a("xp", true, fae.a.a);
   public static final fae l = a("level", true, fae.a.a);
   public static final fae[] m = new fae[]{
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
   public static final fae[] n = new fae[]{
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
   private final fae.a r;

   private static fae a(String $$0, boolean $$1, fae.a $$2) {
      fae $$3 = new fae($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static fae b(String $$0) {
      return a($$0, false, fae.a.a);
   }

   protected fae(String $$0) {
      this($$0, false, fae.a.a);
   }

   protected fae(String $$0, boolean $$1, fae.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<fae> a(String $$0) {
      fae $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lv.v.b(ale.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ale.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<fae> a(awp<T> $$0, ale $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public fae.a f() {
      return this.r;
   }

   public static enum a implements bab {
      a("integer"),
      b("hearts");

      private final String d;
      public static final bab.a<fae.a> c = bab.a(fae.a::values);

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

      public static fae.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
