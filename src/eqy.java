import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class eqy {
   private static final Map<String, eqy> a = Maps.newHashMap();
   private static final Map<String, eqy> o = Maps.newHashMap();
   public static final eqy b = b("dummy");
   public static final eqy c = b("trigger");
   public static final eqy d = b("deathCount");
   public static final eqy e = b("playerKillCount");
   public static final eqy f = b("totalKillCount");
   public static final eqy g = a("health", true, eqy.a.b);
   public static final eqy h = a("food", true, eqy.a.a);
   public static final eqy i = a("air", true, eqy.a.a);
   public static final eqy j = a("armor", true, eqy.a.a);
   public static final eqy k = a("xp", true, eqy.a.a);
   public static final eqy l = a("level", true, eqy.a.a);
   public static final eqy[] m = new eqy[]{
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
   public static final eqy[] n = new eqy[]{
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
   private final eqy.a r;

   private static eqy a(String $$0, boolean $$1, eqy.a $$2) {
      eqy $$3 = new eqy($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static eqy b(String $$0) {
      return a($$0, false, eqy.a.a);
   }

   protected eqy(String $$0) {
      this($$0, false, eqy.a.a);
   }

   protected eqy(String $$0, boolean $$1, eqy.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<eqy> a(String $$0) {
      eqy $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : ki.x.b(ajh.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ajh.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<eqy> a(auh<T> $$0, ajh $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public eqy.a f() {
      return this.r;
   }

   public static enum a implements axq {
      a("integer"),
      b("hearts");

      private final String d;
      public static final axq.a<eqy.a> c = axq.a(eqy.a::values);

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

      public static eqy.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
