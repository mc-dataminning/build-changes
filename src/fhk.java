import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class fhk {
   private static final Map<String, fhk> a = Maps.newHashMap();
   private static final Map<String, fhk> p = Maps.newHashMap();
   public static final Codec<fhk> b = Codec.STRING
      .comapFlatMap($$0 -> a($$0).<DataResult>map(DataResult::success).orElse(DataResult.error(() -> "No scoreboard criteria with name: " + $$0)), fhk::d);
   public static final fhk c = b("dummy");
   public static final fhk d = b("trigger");
   public static final fhk e = b("deathCount");
   public static final fhk f = b("playerKillCount");
   public static final fhk g = b("totalKillCount");
   public static final fhk h = a("health", true, fhk.a.b);
   public static final fhk i = a("food", true, fhk.a.a);
   public static final fhk j = a("air", true, fhk.a.a);
   public static final fhk k = a("armor", true, fhk.a.a);
   public static final fhk l = a("xp", true, fhk.a.a);
   public static final fhk m = a("level", true, fhk.a.a);
   public static final fhk[] n = new fhk[]{
      b("teamkill." + o.a.g()),
      b("teamkill." + o.b.g()),
      b("teamkill." + o.c.g()),
      b("teamkill." + o.d.g()),
      b("teamkill." + o.e.g()),
      b("teamkill." + o.f.g()),
      b("teamkill." + o.g.g()),
      b("teamkill." + o.h.g()),
      b("teamkill." + o.i.g()),
      b("teamkill." + o.j.g()),
      b("teamkill." + o.k.g()),
      b("teamkill." + o.l.g()),
      b("teamkill." + o.m.g()),
      b("teamkill." + o.n.g()),
      b("teamkill." + o.o.g()),
      b("teamkill." + o.p.g())
   };
   public static final fhk[] o = new fhk[]{
      b("killedByTeam." + o.a.g()),
      b("killedByTeam." + o.b.g()),
      b("killedByTeam." + o.c.g()),
      b("killedByTeam." + o.d.g()),
      b("killedByTeam." + o.e.g()),
      b("killedByTeam." + o.f.g()),
      b("killedByTeam." + o.g.g()),
      b("killedByTeam." + o.h.g()),
      b("killedByTeam." + o.i.g()),
      b("killedByTeam." + o.j.g()),
      b("killedByTeam." + o.k.g()),
      b("killedByTeam." + o.l.g()),
      b("killedByTeam." + o.m.g()),
      b("killedByTeam." + o.n.g()),
      b("killedByTeam." + o.o.g()),
      b("killedByTeam." + o.p.g())
   };
   private final String q;
   private final boolean r;
   private final fhk.a s;

   private static fhk a(String $$0, boolean $$1, fhk.a $$2) {
      fhk $$3 = new fhk($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static fhk b(String $$0) {
      return a($$0, false, fhk.a.a);
   }

   protected fhk(String $$0) {
      this($$0, false, fhk.a.a);
   }

   protected fhk(String $$0, boolean $$1, fhk.a $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      p.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<fhk> a(String $$0) {
      fhk $$1 = p.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : mh.v.b(alr.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, alr.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<fhk> a(axh<T> $$0, alr $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.q;
   }

   public boolean e() {
      return this.r;
   }

   public fhk.a f() {
      return this.s;
   }

   public static enum a implements bax {
      a("integer"),
      b("hearts");

      private final String d;
      public static final bax.a<fhk.a> c = bax.a(fhk.a::values);

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

      public static fhk.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
