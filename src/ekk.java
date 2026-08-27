import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ekk {
   private static final Map<String, ekk> n = Maps.newHashMap();
   private static final Map<String, ekk> o = Maps.newHashMap();
   public static final ekk a = b("dummy");
   public static final ekk b = b("trigger");
   public static final ekk c = b("deathCount");
   public static final ekk d = b("playerKillCount");
   public static final ekk e = b("totalKillCount");
   public static final ekk f = a("health", true, ekk.a.b);
   public static final ekk g = a("food", true, ekk.a.a);
   public static final ekk h = a("air", true, ekk.a.a);
   public static final ekk i = a("armor", true, ekk.a.a);
   public static final ekk j = a("xp", true, ekk.a.a);
   public static final ekk k = a("level", true, ekk.a.a);
   public static final ekk[] l = new ekk[]{
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
   public static final ekk[] m = new ekk[]{
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
   private final ekk.a r;

   private static ekk a(String $$0, boolean $$1, ekk.a $$2) {
      ekk $$3 = new ekk($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static ekk b(String $$0) {
      return a($$0, false, ekk.a.a);
   }

   protected ekk(String $$0) {
      this($$0, false, ekk.a.a);
   }

   protected ekk(String $$0, boolean $$1, ekk.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<ekk> a(String $$0) {
      ekk $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : jy.y.b(agg.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, agg.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<ekk> a(aqw<T> $$0, agg $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public ekk.a f() {
      return this.r;
   }

   public static enum a implements aub {
      a("integer"),
      b("hearts");

      private final String d;
      public static final aub.a<ekk.a> c = aub.a(ekk.a::values);

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

      public static ekk.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
