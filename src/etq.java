import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class etq {
   private static final Map<String, etq> a = Maps.newHashMap();
   private static final Map<String, etq> o = Maps.newHashMap();
   public static final etq b = b("dummy");
   public static final etq c = b("trigger");
   public static final etq d = b("deathCount");
   public static final etq e = b("playerKillCount");
   public static final etq f = b("totalKillCount");
   public static final etq g = a("health", true, etq.a.b);
   public static final etq h = a("food", true, etq.a.a);
   public static final etq i = a("air", true, etq.a.a);
   public static final etq j = a("armor", true, etq.a.a);
   public static final etq k = a("xp", true, etq.a.a);
   public static final etq l = a("level", true, etq.a.a);
   public static final etq[] m = new etq[]{
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
   public static final etq[] n = new etq[]{
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
   private final etq.a r;

   private static etq a(String $$0, boolean $$1, etq.a $$2) {
      etq $$3 = new etq($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static etq b(String $$0) {
      return a($$0, false, etq.a.a);
   }

   protected etq(String $$0) {
      this($$0, false, etq.a.a);
   }

   protected etq(String $$0, boolean $$1, etq.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<etq> a(String $$0) {
      etq $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : kt.x.b(ajv.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ajv.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<etq> a(auy<T> $$0, ajv $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public etq.a f() {
      return this.r;
   }

   public static enum a implements ayg {
      a("integer"),
      b("hearts");

      private final String d;
      public static final ayg.a<etq.a> c = ayg.a(etq.a::values);

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

      public static etq.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
