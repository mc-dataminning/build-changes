import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class fdg {
   private static final Map<String, fdg> a = Maps.newHashMap();
   private static final Map<String, fdg> o = Maps.newHashMap();
   public static final fdg b = b("dummy");
   public static final fdg c = b("trigger");
   public static final fdg d = b("deathCount");
   public static final fdg e = b("playerKillCount");
   public static final fdg f = b("totalKillCount");
   public static final fdg g = a("health", true, fdg.a.b);
   public static final fdg h = a("food", true, fdg.a.a);
   public static final fdg i = a("air", true, fdg.a.a);
   public static final fdg j = a("armor", true, fdg.a.a);
   public static final fdg k = a("xp", true, fdg.a.a);
   public static final fdg l = a("level", true, fdg.a.a);
   public static final fdg[] m = new fdg[]{
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
   public static final fdg[] n = new fdg[]{
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
   private final fdg.a r;

   private static fdg a(String $$0, boolean $$1, fdg.a $$2) {
      fdg $$3 = new fdg($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static fdg b(String $$0) {
      return a($$0, false, fdg.a.a);
   }

   protected fdg(String $$0) {
      this($$0, false, fdg.a.a);
   }

   protected fdg(String $$0, boolean $$1, fdg.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<fdg> a(String $$0) {
      fdg $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : ma.v.b(alz.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, alz.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<fdg> a(axo<T> $$0, alz $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public fdg.a f() {
      return this.r;
   }

   public static enum a implements bba {
      a("integer"),
      b("hearts");

      private final String d;
      public static final bba.a<fdg.a> c = bba.a(fdg.a::values);

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

      public static fdg.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
