import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ffy {
   private static final Map<String, ffy> a = Maps.newHashMap();
   private static final Map<String, ffy> p = Maps.newHashMap();
   public static final Codec<ffy> b = Codec.STRING
      .comapFlatMap($$0 -> a($$0).<DataResult>map(DataResult::success).orElse(DataResult.error(() -> "No scoreboard criteria with name: " + $$0)), ffy::d);
   public static final ffy c = b("dummy");
   public static final ffy d = b("trigger");
   public static final ffy e = b("deathCount");
   public static final ffy f = b("playerKillCount");
   public static final ffy g = b("totalKillCount");
   public static final ffy h = a("health", true, ffy.a.b);
   public static final ffy i = a("food", true, ffy.a.a);
   public static final ffy j = a("air", true, ffy.a.a);
   public static final ffy k = a("armor", true, ffy.a.a);
   public static final ffy l = a("xp", true, ffy.a.a);
   public static final ffy m = a("level", true, ffy.a.a);
   public static final ffy[] n = new ffy[]{
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
   public static final ffy[] o = new ffy[]{
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
   private final String q;
   private final boolean r;
   private final ffy.a s;

   private static ffy a(String $$0, boolean $$1, ffy.a $$2) {
      ffy $$3 = new ffy($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static ffy b(String $$0) {
      return a($$0, false, ffy.a.a);
   }

   protected ffy(String $$0) {
      this($$0, false, ffy.a.a);
   }

   protected ffy(String $$0, boolean $$1, ffy.a $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      p.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<ffy> a(String $$0) {
      ffy $$1 = p.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : mf.v.b(alg.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, alg.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<ffy> a(aww<T> $$0, alg $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.q;
   }

   public boolean e() {
      return this.r;
   }

   public ffy.a f() {
      return this.s;
   }

   public static enum a implements bak {
      a("integer"),
      b("hearts");

      private final String d;
      public static final bak.a<ffy.a> c = bak.a(ffy.a::values);

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

      public static ffy.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
