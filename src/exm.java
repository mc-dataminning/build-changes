import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class exm {
   private static final Map<String, exm> a = Maps.newHashMap();
   private static final Map<String, exm> o = Maps.newHashMap();
   public static final exm b = b("dummy");
   public static final exm c = b("trigger");
   public static final exm d = b("deathCount");
   public static final exm e = b("playerKillCount");
   public static final exm f = b("totalKillCount");
   public static final exm g = a("health", true, exm.a.b);
   public static final exm h = a("food", true, exm.a.a);
   public static final exm i = a("air", true, exm.a.a);
   public static final exm j = a("armor", true, exm.a.a);
   public static final exm k = a("xp", true, exm.a.a);
   public static final exm l = a("level", true, exm.a.a);
   public static final exm[] m = new exm[]{
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
   public static final exm[] n = new exm[]{
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
   private final exm.a r;

   private static exm a(String $$0, boolean $$1, exm.a $$2) {
      exm $$3 = new exm($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static exm b(String $$0) {
      return a($$0, false, exm.a.a);
   }

   protected exm(String $$0) {
      this($$0, false, exm.a.a);
   }

   protected exm(String $$0, boolean $$1, exm.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<exm> a(String $$0) {
      exm $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lq.v.b(akk.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, akk.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<exm> a(avq<T> $$0, akk $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public exm.a f() {
      return this.r;
   }

   public static enum a implements azc {
      a("integer"),
      b("hearts");

      private final String d;
      public static final azc.a<exm.a> c = azc.a(exm.a::values);

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

      public static exm.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
