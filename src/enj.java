import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class enj {
   private static final Map<String, enj> n = Maps.newHashMap();
   private static final Map<String, enj> o = Maps.newHashMap();
   public static final enj a = b("dummy");
   public static final enj b = b("trigger");
   public static final enj c = b("deathCount");
   public static final enj d = b("playerKillCount");
   public static final enj e = b("totalKillCount");
   public static final enj f = a("health", true, enj.a.b);
   public static final enj g = a("food", true, enj.a.a);
   public static final enj h = a("air", true, enj.a.a);
   public static final enj i = a("armor", true, enj.a.a);
   public static final enj j = a("xp", true, enj.a.a);
   public static final enj k = a("level", true, enj.a.a);
   public static final enj[] l = new enj[]{
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
   public static final enj[] m = new enj[]{
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
   private final enj.a r;

   private static enj a(String $$0, boolean $$1, enj.a $$2) {
      enj $$3 = new enj($$0, $$1, $$2);
      n.put($$0, $$3);
      return $$3;
   }

   private static enj b(String $$0) {
      return a($$0, false, enj.a.a);
   }

   protected enj(String $$0) {
      this($$0, false, enj.a.a);
   }

   protected enj(String $$0, boolean $$1, enj.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(n.keySet());
   }

   public static Optional<enj> a(String $$0) {
      enj $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : kd.x.b(ahh.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ahh.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<enj> a(asc<T> $$0, ahh $$1) {
      return $$0.a().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public enj.a f() {
      return this.r;
   }

   public static enum a implements avl {
      a("integer"),
      b("hearts");

      private final String d;
      public static final avl.a<enj.a> c = avl.a(enj.a::values);

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

      public static enj.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
