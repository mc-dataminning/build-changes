import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ezl {
   private static final Map<String, ezl> a = Maps.newHashMap();
   private static final Map<String, ezl> o = Maps.newHashMap();
   public static final ezl b = b("dummy");
   public static final ezl c = b("trigger");
   public static final ezl d = b("deathCount");
   public static final ezl e = b("playerKillCount");
   public static final ezl f = b("totalKillCount");
   public static final ezl g = a("health", true, ezl.a.b);
   public static final ezl h = a("food", true, ezl.a.a);
   public static final ezl i = a("air", true, ezl.a.a);
   public static final ezl j = a("armor", true, ezl.a.a);
   public static final ezl k = a("xp", true, ezl.a.a);
   public static final ezl l = a("level", true, ezl.a.a);
   public static final ezl[] m = new ezl[]{
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
   public static final ezl[] n = new ezl[]{
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
   private final ezl.a r;

   private static ezl a(String $$0, boolean $$1, ezl.a $$2) {
      ezl $$3 = new ezl($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static ezl b(String $$0) {
      return a($$0, false, ezl.a.a);
   }

   protected ezl(String $$0) {
      this($$0, false, ezl.a.a);
   }

   protected ezl(String $$0, boolean $$1, ezl.a $$2) {
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      o.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<ezl> a(String $$0) {
      ezl $$1 = o.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : lu.v.b(alb.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, alb.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<ezl> a(awm<T> $$0, alb $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public ezl.a f() {
      return this.r;
   }

   public static enum a implements azy {
      a("integer"),
      b("hearts");

      private final String d;
      public static final azy.a<ezl.a> c = azy.a(ezl.a::values);

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

      public static ezl.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
