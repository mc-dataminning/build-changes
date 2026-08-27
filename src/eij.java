import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eij {
   private static final Map<String, eij> n = Maps.newHashMap();
   private static final Map<String, eij> o = Maps.newHashMap();
   public static final eij a = b("dummy");
   public static final eij b = b("trigger");
   public static final eij c = b("deathCount");
   public static final eij d = b("playerKillCount");
   public static final eij e = b("totalKillCount");
   public static final eij f = a("health", true, eij.a.b);
   public static final eij g = a("food", true, eij.a.a);
   public static final eij h = a("air", true, eij.a.a);
   public static final eij i = a("armor", true, eij.a.a);
   public static final eij j = a("xp", true, eij.a.a);
   public static final eij k = a("level", true, eij.a.a);
   public static final eij[] l = new eij[]{
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
   public static final eij[] m = new eij[]{
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
   private final eij.a r;

   private static eij a(String $$0, boolean $$1, eij.a $$2) {
      eij $$3 = new eij($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static eij b(String $$0) {
      return a($$0, false, eij.a.a);
   }

   protected eij(String $$0) {
      this($$0, false, eij.a.a);
   }

   protected eij(String $$0, boolean $$1, eij.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<eij> a(String $$0) {
      eij $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : jb.y.b(aez.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, aez.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eij> a(app<T> $$0, aez $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eij.a f() {
      return this.r;
   }

   public static enum a implements asu {
      a("integer"),
      b("hearts");

      private final String d;
      public static final asu.a<eij.a> c = asu.a(eij.a::values);

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

      public static eij.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
