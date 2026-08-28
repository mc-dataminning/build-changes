import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class exo {
   private static final Map<String, exo> a = Maps.newHashMap();
   private static final Map<String, exo> o = Maps.newHashMap();
   public static final exo b = b("dummy");
   public static final exo c = b("trigger");
   public static final exo d = b("deathCount");
   public static final exo e = b("playerKillCount");
   public static final exo f = b("totalKillCount");
   public static final exo g = a("health", true, exo.a.b);
   public static final exo h = a("food", true, exo.a.a);
   public static final exo i = a("air", true, exo.a.a);
   public static final exo j = a("armor", true, exo.a.a);
   public static final exo k = a("xp", true, exo.a.a);
   public static final exo l = a("level", true, exo.a.a);
   public static final exo[] m = new exo[]{
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
   public static final exo[] n = new exo[]{
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
   private final exo.a r;

   private static exo a(String $$0, boolean $$1, exo.a $$2) {
      exo $$3 = new exo($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static exo b(String $$0) {
      return a($$0, false, exo.a.a);
   }

   protected exo(String $$0) {
      this($$0, false, exo.a.a);
   }

   protected exo(String $$0, boolean $$1, exo.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<exo> a(String $$0) {
      exo $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lq.v.b(akk.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, akk.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<exo> a(avq<T> $$0, akk $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public exo.a f() {
      return this.r;
   }

   public static enum a implements azc {
      a("integer"),
      b("hearts");

      private final String d;
      public static final azc.a<exo.a> c = azc.a(exo.a::values);

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

      public static exo.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
