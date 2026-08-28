import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class fec {
   private static final Map<String, fec> a = Maps.newHashMap();
   private static final Map<String, fec> o = Maps.newHashMap();
   public static final fec b = b("dummy");
   public static final fec c = b("trigger");
   public static final fec d = b("deathCount");
   public static final fec e = b("playerKillCount");
   public static final fec f = b("totalKillCount");
   public static final fec g = a("health", true, fec.a.b);
   public static final fec h = a("food", true, fec.a.a);
   public static final fec i = a("air", true, fec.a.a);
   public static final fec j = a("armor", true, fec.a.a);
   public static final fec k = a("xp", true, fec.a.a);
   public static final fec l = a("level", true, fec.a.a);
   public static final fec[] m = new fec[]{
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
   public static final fec[] n = new fec[]{
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
   private final fec.a r;

   private static fec a(String $$0, boolean $$1, fec.a $$2) {
      fec $$3 = new fec($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static fec b(String $$0) {
      return a($$0, false, fec.a.a);
   }

   protected fec(String $$0) {
      this($$0, false, fec.a.a);
   }

   protected fec(String $$0, boolean $$1, fec.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<fec> a(String $$0) {
      fec $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : md.v.b(ald.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ald.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<fec> a(awt<T> $$0, ald $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public fec.a f() {
      return this.r;
   }

   public static enum a implements bag {
      a("integer"),
      b("hearts");

      private final String d;
      public static final bag.a<fec.a> c = bag.a(fec.a::values);

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

      public static fec.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
