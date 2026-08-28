import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class fgk {
   private static final Map<String, fgk> a = Maps.newHashMap();
   private static final Map<String, fgk> p = Maps.newHashMap();
   public static final Codec<fgk> b = Codec.STRING
      .comapFlatMap($$0 -> a($$0).<DataResult>map(DataResult::success).orElse(DataResult.error(() -> "No scoreboard criteria with name: " + $$0)), fgk::d);
   public static final fgk c = b("dummy");
   public static final fgk d = b("trigger");
   public static final fgk e = b("deathCount");
   public static final fgk f = b("playerKillCount");
   public static final fgk g = b("totalKillCount");
   public static final fgk h = a("health", true, fgk.a.b);
   public static final fgk i = a("food", true, fgk.a.a);
   public static final fgk j = a("air", true, fgk.a.a);
   public static final fgk k = a("armor", true, fgk.a.a);
   public static final fgk l = a("xp", true, fgk.a.a);
   public static final fgk m = a("level", true, fgk.a.a);
   public static final fgk[] n = new fgk[]{
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
   public static final fgk[] o = new fgk[]{
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
   private final fgk.a s;

   private static fgk a(String $$0, boolean $$1, fgk.a $$2) {
      fgk $$3 = new fgk($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static fgk b(String $$0) {
      return a($$0, false, fgk.a.a);
   }

   protected fgk(String $$0) {
      this($$0, false, fgk.a.a);
   }

   protected fgk(String $$0, boolean $$1, fgk.a $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      p.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<fgk> a(String $$0) {
      fgk $$1 = p.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : mg.v.b(alg.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, alg.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<fgk> a(aww<T> $$0, alg $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.q;
   }

   public boolean e() {
      return this.r;
   }

   public fgk.a f() {
      return this.s;
   }

   public static enum a implements bak {
      a("integer"),
      b("hearts");

      private final String d;
      public static final bak.a<fgk.a> c = bak.a(fgk.a::values);

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

      public static fgk.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
