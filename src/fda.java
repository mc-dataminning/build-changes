import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class fda {
   private static final Map<String, fda> a = Maps.newHashMap();
   private static final Map<String, fda> o = Maps.newHashMap();
   public static final fda b = b("dummy");
   public static final fda c = b("trigger");
   public static final fda d = b("deathCount");
   public static final fda e = b("playerKillCount");
   public static final fda f = b("totalKillCount");
   public static final fda g = a("health", true, fda.a.b);
   public static final fda h = a("food", true, fda.a.a);
   public static final fda i = a("air", true, fda.a.a);
   public static final fda j = a("armor", true, fda.a.a);
   public static final fda k = a("xp", true, fda.a.a);
   public static final fda l = a("level", true, fda.a.a);
   public static final fda[] m = new fda[]{
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
   public static final fda[] n = new fda[]{
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
   private final fda.a r;

   private static fda a(String $$0, boolean $$1, fda.a $$2) {
      fda $$3 = new fda($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static fda b(String $$0) {
      return a($$0, false, fda.a.a);
   }

   protected fda(String $$0) {
      this($$0, false, fda.a.a);
   }

   protected fda(String $$0, boolean $$1, fda.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<fda> a(String $$0) {
      fda $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : ma.v.b(alz.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, alz.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<fda> a(axo<T> $$0, alz $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public fda.a f() {
      return this.r;
   }

   public static enum a implements bba {
      a("integer"),
      b("hearts");

      private final String d;
      public static final bba.a<fda.a> c = bba.a(fda.a::values);

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

      public static fda.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
