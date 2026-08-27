import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eoz {
   private static final Map<String, eoz> a = Maps.newHashMap();
   private static final Map<String, eoz> o = Maps.newHashMap();
   public static final eoz b = b("dummy");
   public static final eoz c = b("trigger");
   public static final eoz d = b("deathCount");
   public static final eoz e = b("playerKillCount");
   public static final eoz f = b("totalKillCount");
   public static final eoz g = a("health", true, eoz.a.b);
   public static final eoz h = a("food", true, eoz.a.a);
   public static final eoz i = a("air", true, eoz.a.a);
   public static final eoz j = a("armor", true, eoz.a.a);
   public static final eoz k = a("xp", true, eoz.a.a);
   public static final eoz l = a("level", true, eoz.a.a);
   public static final eoz[] m = new eoz[]{
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
   public static final eoz[] n = new eoz[]{
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
   private final eoz.a r;

   private static eoz a(String $$0, boolean $$1, eoz.a $$2) {
      eoz $$3 = new eoz($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static eoz b(String $$0) {
      return a($$0, false, eoz.a.a);
   }

   protected eoz(String $$0) {
      this($$0, false, eoz.a.a);
   }

   protected eoz(String $$0, boolean $$1, eoz.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<eoz> a(String $$0) {
      eoz $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : kf.x.b(aiy.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, aiy.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eoz> a(att<T> $$0, aiy $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eoz.a f() {
      return this.r;
   }

   public static enum a implements axc {
      a("integer"),
      b("hearts");

      private final String d;
      public static final axc.a<eoz.a> c = axc.a(eoz.a::values);

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

      public static eoz.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
