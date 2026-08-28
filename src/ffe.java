import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ffe {
   private static final Map<String, ffe> a = Maps.newHashMap();
   private static final Map<String, ffe> o = Maps.newHashMap();
   public static final ffe b = b("dummy");
   public static final ffe c = b("trigger");
   public static final ffe d = b("deathCount");
   public static final ffe e = b("playerKillCount");
   public static final ffe f = b("totalKillCount");
   public static final ffe g = a("health", true, ffe.a.b);
   public static final ffe h = a("food", true, ffe.a.a);
   public static final ffe i = a("air", true, ffe.a.a);
   public static final ffe j = a("armor", true, ffe.a.a);
   public static final ffe k = a("xp", true, ffe.a.a);
   public static final ffe l = a("level", true, ffe.a.a);
   public static final ffe[] m = new ffe[]{
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
   public static final ffe[] n = new ffe[]{
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
   private final ffe.a r;

   private static ffe a(String $$0, boolean $$1, ffe.a $$2) {
      ffe $$3 = new ffe($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static ffe b(String $$0) {
      return a($$0, false, ffe.a.a);
   }

   protected ffe(String $$0) {
      this($$0, false, ffe.a.a);
   }

   protected ffe(String $$0, boolean $$1, ffe.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<ffe> a(String $$0) {
      ffe $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : mf.v.b(ale.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ale.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<ffe> a(awu<T> $$0, ale $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public ffe.a f() {
      return this.r;
   }

   public static enum a implements bai {
      a("integer"),
      b("hearts");

      private final String d;
      public static final bai.a<ffe.a> c = bai.a(ffe.a::values);

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

      public static ffe.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
