import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ekw {
   private static final Map<String, ekw> n = Maps.newHashMap();
   private static final Map<String, ekw> o = Maps.newHashMap();
   public static final ekw a = b("dummy");
   public static final ekw b = b("trigger");
   public static final ekw c = b("deathCount");
   public static final ekw d = b("playerKillCount");
   public static final ekw e = b("totalKillCount");
   public static final ekw f = a("health", true, ekw.a.b);
   public static final ekw g = a("food", true, ekw.a.a);
   public static final ekw h = a("air", true, ekw.a.a);
   public static final ekw i = a("armor", true, ekw.a.a);
   public static final ekw j = a("xp", true, ekw.a.a);
   public static final ekw k = a("level", true, ekw.a.a);
   public static final ekw[] l = new ekw[]{
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
   public static final ekw[] m = new ekw[]{
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
   private final ekw.a r;

   private static ekw a(String $$0, boolean $$1, ekw.a $$2) {
      ekw $$3 = new ekw($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static ekw b(String $$0) {
      return a($$0, false, ekw.a.a);
   }

   protected ekw(String $$0) {
      this($$0, false, ekw.a.a);
   }

   protected ekw(String $$0, boolean $$1, ekw.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<ekw> a(String $$0) {
      ekw $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : jy.y.b(agi.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, agi.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<ekw> a(ara<T> $$0, agi $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public ekw.a f() {
      return this.r;
   }

   public static enum a implements aug {
      a("integer"),
      b("hearts");

      private final String d;
      public static final aug.a<ekw.a> c = aug.a(ekw.a::values);

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

      public static ekw.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
