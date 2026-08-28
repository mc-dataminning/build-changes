import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class faa {
   private static final Map<String, faa> a = Maps.newHashMap();
   private static final Map<String, faa> o = Maps.newHashMap();
   public static final faa b = b("dummy");
   public static final faa c = b("trigger");
   public static final faa d = b("deathCount");
   public static final faa e = b("playerKillCount");
   public static final faa f = b("totalKillCount");
   public static final faa g = a("health", true, faa.a.b);
   public static final faa h = a("food", true, faa.a.a);
   public static final faa i = a("air", true, faa.a.a);
   public static final faa j = a("armor", true, faa.a.a);
   public static final faa k = a("xp", true, faa.a.a);
   public static final faa l = a("level", true, faa.a.a);
   public static final faa[] m = new faa[]{
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
   public static final faa[] n = new faa[]{
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
   private final faa.a r;

   private static faa a(String $$0, boolean $$1, faa.a $$2) {
      faa $$3 = new faa($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static faa b(String $$0) {
      return a($$0, false, faa.a.a);
   }

   protected faa(String $$0) {
      this($$0, false, faa.a.a);
   }

   protected faa(String $$0, boolean $$1, faa.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<faa> a(String $$0) {
      faa $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lu.v.b(alc.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, alc.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<faa> a(awn<T> $$0, alc $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public faa.a f() {
      return this.r;
   }

   public static enum a implements azz {
      a("integer"),
      b("hearts");

      private final String d;
      public static final azz.a<faa.a> c = azz.a(faa.a::values);

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

      public static faa.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
