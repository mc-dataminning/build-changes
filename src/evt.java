import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class evt {
   private static final Map<String, evt> a = Maps.newHashMap();
   private static final Map<String, evt> o = Maps.newHashMap();
   public static final evt b = b("dummy");
   public static final evt c = b("trigger");
   public static final evt d = b("deathCount");
   public static final evt e = b("playerKillCount");
   public static final evt f = b("totalKillCount");
   public static final evt g = a("health", true, evt.a.b);
   public static final evt h = a("food", true, evt.a.a);
   public static final evt i = a("air", true, evt.a.a);
   public static final evt j = a("armor", true, evt.a.a);
   public static final evt k = a("xp", true, evt.a.a);
   public static final evt l = a("level", true, evt.a.a);
   public static final evt[] m = new evt[]{
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
   public static final evt[] n = new evt[]{
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
   private final evt.a r;

   private static evt a(String $$0, boolean $$1, evt.a $$2) {
      evt $$3 = new evt($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static evt b(String $$0) {
      return a($$0, false, evt.a.a);
   }

   protected evt(String $$0) {
      this($$0, false, evt.a.a);
   }

   protected evt(String $$0, boolean $$1, evt.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<evt> a(String $$0) {
      evt $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : le.x.b(akn.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, akn.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<evt> a(avr<T> $$0, akn $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public evt.a f() {
      return this.r;
   }

   public static enum a implements ayz {
      a("integer"),
      b("hearts");

      private final String d;
      public static final ayz.a<evt.a> c = ayz.a(evt.a::values);

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

      public static evt.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
