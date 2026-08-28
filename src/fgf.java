import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class fgf {
   private static final Map<String, fgf> a = Maps.newHashMap();
   private static final Map<String, fgf> p = Maps.newHashMap();
   public static final Codec<fgf> b = Codec.STRING
      .comapFlatMap($$0 -> a($$0).<DataResult>map(DataResult::success).orElse(DataResult.error(() -> "No scoreboard criteria with name: " + $$0)), fgf::d);
   public static final fgf c = b("dummy");
   public static final fgf d = b("trigger");
   public static final fgf e = b("deathCount");
   public static final fgf f = b("playerKillCount");
   public static final fgf g = b("totalKillCount");
   public static final fgf h = a("health", true, fgf.a.b);
   public static final fgf i = a("food", true, fgf.a.a);
   public static final fgf j = a("air", true, fgf.a.a);
   public static final fgf k = a("armor", true, fgf.a.a);
   public static final fgf l = a("xp", true, fgf.a.a);
   public static final fgf m = a("level", true, fgf.a.a);
   public static final fgf[] n = new fgf[]{
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
   public static final fgf[] o = new fgf[]{
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
   private final fgf.a s;

   private static fgf a(String $$0, boolean $$1, fgf.a $$2) {
      fgf $$3 = new fgf($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static fgf b(String $$0) {
      return a($$0, false, fgf.a.a);
   }

   protected fgf(String $$0) {
      this($$0, false, fgf.a.a);
   }

   protected fgf(String $$0, boolean $$1, fgf.a $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      p.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<fgf> a(String $$0) {
      fgf $$1 = p.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : mg.v.b(alg.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, alg.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<fgf> a(aww<T> $$0, alg $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.q;
   }

   public boolean e() {
      return this.r;
   }

   public fgf.a f() {
      return this.s;
   }

   public static enum a implements bak {
      a("integer"),
      b("hearts");

      private final String d;
      public static final bak.a<fgf.a> c = bak.a(fgf.a::values);

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

      public static fgf.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
