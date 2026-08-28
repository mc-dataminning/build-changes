import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eww {
   private static final Map<String, eww> a = Maps.newHashMap();
   private static final Map<String, eww> o = Maps.newHashMap();
   public static final eww b = b("dummy");
   public static final eww c = b("trigger");
   public static final eww d = b("deathCount");
   public static final eww e = b("playerKillCount");
   public static final eww f = b("totalKillCount");
   public static final eww g = a("health", true, eww.a.b);
   public static final eww h = a("food", true, eww.a.a);
   public static final eww i = a("air", true, eww.a.a);
   public static final eww j = a("armor", true, eww.a.a);
   public static final eww k = a("xp", true, eww.a.a);
   public static final eww l = a("level", true, eww.a.a);
   public static final eww[] m = new eww[]{
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
   public static final eww[] n = new eww[]{
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
   private final eww.a r;

   private static eww a(String $$0, boolean $$1, eww.a $$2) {
      eww $$3 = new eww($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static eww b(String $$0) {
      return a($$0, false, eww.a.a);
   }

   protected eww(String $$0) {
      this($$0, false, eww.a.a);
   }

   protected eww(String $$0, boolean $$1, eww.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<eww> a(String $$0) {
      eww $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lp.x.b(ale.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ale.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eww> a(awi<T> $$0, ale $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eww.a f() {
      return this.r;
   }

   public static enum a implements azs {
      a("integer"),
      b("hearts");

      private final String d;
      public static final azs.a<eww.a> c = azs.a(eww.a::values);

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

      public static eww.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
