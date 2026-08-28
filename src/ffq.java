import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ffq {
   private static final Map<String, ffq> a = Maps.newHashMap();
   private static final Map<String, ffq> p = Maps.newHashMap();
   public static final Codec<ffq> b = Codec.STRING
      .comapFlatMap($$0 -> a($$0).<DataResult>map(DataResult::success).orElse(DataResult.error(() -> "No scoreboard criteria with name: " + $$0)), ffq::d);
   public static final ffq c = b("dummy");
   public static final ffq d = b("trigger");
   public static final ffq e = b("deathCount");
   public static final ffq f = b("playerKillCount");
   public static final ffq g = b("totalKillCount");
   public static final ffq h = a("health", true, ffq.a.b);
   public static final ffq i = a("food", true, ffq.a.a);
   public static final ffq j = a("air", true, ffq.a.a);
   public static final ffq k = a("armor", true, ffq.a.a);
   public static final ffq l = a("xp", true, ffq.a.a);
   public static final ffq m = a("level", true, ffq.a.a);
   public static final ffq[] n = new ffq[]{
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
   public static final ffq[] o = new ffq[]{
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
   private final ffq.a s;

   private static ffq a(String $$0, boolean $$1, ffq.a $$2) {
      ffq $$3 = new ffq($$0, $$1, $$2);
      a.put($$0, $$3);
      return $$3;
   }

   private static ffq b(String $$0) {
      return a($$0, false, ffq.a.a);
   }

   protected ffq(String $$0) {
      this($$0, false, ffq.a.a);
   }

   protected ffq(String $$0, boolean $$1, ffq.a $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      p.put($$0, this);
   }

   public static Set<String> c() {
      return ImmutableSet.copyOf(a.keySet());
   }

   public static Optional<ffq> a(String $$0) {
      ffq $$1 = p.get($$0);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         int $$2 = $$0.indexOf(58);
         return $$2 < 0 ? Optional.empty() : mf.v.b(alg.a($$0.substring(0, $$2), '.')).flatMap($$2x -> a($$2x, alg.a($$0.substring($$2 + 1), '.')));
      }
   }

   private static <T> Optional<ffq> a(aww<T> $$0, alg $$1) {
      return $$0.b().b($$1).map($$0::b);
   }

   public String d() {
      return this.q;
   }

   public boolean e() {
      return this.r;
   }

   public ffq.a f() {
      return this.s;
   }

   public static enum a implements bak {
      a("integer"),
      b("hearts");

      private final String d;
      public static final bak.a<ffq.a> c = bak.a(ffq.a::values);

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

      public static ffq.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
