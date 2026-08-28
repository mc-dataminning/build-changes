import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class fgy {
   private static final Map<String, fgy> a = Maps.newHashMap();
   private static final Map<String, fgy> p = Maps.newHashMap();
   public static final Codec<fgy> b = Codec.STRING
      .comapFlatMap($$0 -> a($$0).<DataResult>map(DataResult::success).orElse(DataResult.error(() -> "No scoreboard criteria with name: " + $$0)), fgy::d);
   public static final fgy c = b("dummy");
   public static final fgy d = b("trigger");
   public static final fgy e = b("deathCount");
   public static final fgy f = b("playerKillCount");
   public static final fgy g = b("totalKillCount");
   public static final fgy h = a("health", true, fgy.a.b);
   public static final fgy i = a("food", true, fgy.a.a);
   public static final fgy j = a("air", true, fgy.a.a);
   public static final fgy k = a("armor", true, fgy.a.a);
   public static final fgy l = a("xp", true, fgy.a.a);
   public static final fgy m = a("level", true, fgy.a.a);
   public static final fgy[] n = new fgy[]{
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
   public static final fgy[] o = new fgy[]{
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
   private final fgy.a s;

   private static fgy a(String $$0, boolean $$1, fgy.a $$2) {
      fgy $$3 = new fgy($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static fgy b(String $$0) {
      return a($$0, false, fgy.a.a);
   }

   protected fgy(String $$0) {
      this($$0, false, fgy.a.a);
   }

   protected fgy(String $$0, boolean $$1, fgy.a $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      p.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<fgy> a(String $$0) {
      fgy $$1 = p.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : mg.v.b(ali.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, ali.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<fgy> a(awy<T> $$0, ali $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.q;
   }

   public boolean e() {
      return this.r;
   }

   public fgy.a f() {
      return this.s;
   }

   public static enum a implements bam {
      a("integer"),
      b("hearts");

      private final String d;
      public static final bam.a<fgy.a> c = bam.a(fgy.a::values);

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

      public static fgy.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
