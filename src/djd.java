import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicLike;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class djd {
   public static final int a = 3;
   static final Logger ad = LogUtils.getLogger();
   private static final Map<djd.e<?>, djd.f<?>> ae = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final djd.e<djd.a> b = a("doFireTick", djd.b.e, djd.a.a(true));
   public static final djd.e<djd.a> c = a("allowFireTicksAwayFromPlayer", djd.b.e, djd.a.a(false));
   public static final djd.e<djd.a> d = a("mobGriefing", djd.b.b, djd.a.a(true));
   public static final djd.e<djd.a> e = a("keepInventory", djd.b.a, djd.a.a(false));
   public static final djd.e<djd.a> f = a("doMobSpawning", djd.b.c, djd.a.a(true));
   public static final djd.e<djd.a> g = a("doMobLoot", djd.b.d, djd.a.a(true));
   public static final djd.e<djd.a> h = a("projectilesCanBreakBlocks", djd.b.d, djd.a.a(true));
   public static final djd.e<djd.a> i = a("doTileDrops", djd.b.d, djd.a.a(true));
   public static final djd.e<djd.a> j = a("doEntityDrops", djd.b.d, djd.a.a(true));
   public static final djd.e<djd.a> k = a("commandBlockOutput", djd.b.f, djd.a.a(true));
   public static final djd.e<djd.a> l = a("naturalRegeneration", djd.b.a, djd.a.a(true));
   public static final djd.e<djd.a> m = a("doDaylightCycle", djd.b.e, djd.a.a(true));
   public static final djd.e<djd.a> n = a("logAdminCommands", djd.b.f, djd.a.a(true));
   public static final djd.e<djd.a> o = a("showDeathMessages", djd.b.f, djd.a.a(true));
   public static final djd.e<djd.d> p = a("randomTickSpeed", djd.b.e, djd.d.a(3));
   public static final djd.e<djd.a> q = a("sendCommandFeedback", djd.b.f, djd.a.a(true));
   public static final djd.e<djd.a> r = a("reducedDebugInfo", djd.b.g, djd.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arr $$3 : $$0.ag().t()) {
         $$3.f.b(new acx($$3, $$2));
      }
   }));
   public static final djd.e<djd.a> s = a("spectatorsGenerateChunks", djd.b.a, djd.a.a(true));
   public static final djd.e<djd.d> t = a("spawnRadius", djd.b.a, djd.d.a(10));
   public static final djd.e<djd.a> u = a("disablePlayerMovementCheck", djd.b.a, djd.a.a(false));
   public static final djd.e<djd.a> v = a("disableElytraMovementCheck", djd.b.a, djd.a.a(false));
   public static final djd.e<djd.d> w = a("maxEntityCramming", djd.b.b, djd.d.a(24));
   public static final djd.e<djd.a> x = a("doWeatherCycle", djd.b.e, djd.a.a(true));
   public static final djd.e<djd.a> y = a("doLimitedCrafting", djd.b.a, djd.a.a(false, ($$0, $$1) -> {
      for (arr $$2 : $$0.ag().t()) {
         $$2.f.b(new adb(adb.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final djd.e<djd.d> z = a("maxCommandChainLength", djd.b.g, djd.d.a(65536));
   public static final djd.e<djd.d> A = a("maxCommandForkCount", djd.b.g, djd.d.a(65536));
   public static final djd.e<djd.d> B = a("commandModificationBlockLimit", djd.b.g, djd.d.a(32768));
   public static final djd.e<djd.a> C = a("announceAdvancements", djd.b.f, djd.a.a(true));
   public static final djd.e<djd.a> D = a("disableRaids", djd.b.b, djd.a.a(false));
   public static final djd.e<djd.a> E = a("doInsomnia", djd.b.c, djd.a.a(true));
   public static final djd.e<djd.a> F = a("doImmediateRespawn", djd.b.a, djd.a.a(false, ($$0, $$1) -> {
      for (arr $$2 : $$0.ag().t()) {
         $$2.f.b(new adb(adb.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final djd.e<djd.d> G = a("playersNetherPortalDefaultDelay", djd.b.a, djd.d.a(80));
   public static final djd.e<djd.d> H = a("playersNetherPortalCreativeDelay", djd.b.a, djd.d.a(0));
   public static final djd.e<djd.a> I = a("drowningDamage", djd.b.a, djd.a.a(true));
   public static final djd.e<djd.a> J = a("fallDamage", djd.b.a, djd.a.a(true));
   public static final djd.e<djd.a> K = a("fireDamage", djd.b.a, djd.a.a(true));
   public static final djd.e<djd.a> L = a("freezeDamage", djd.b.a, djd.a.a(true));
   public static final djd.e<djd.a> M = a("doPatrolSpawning", djd.b.c, djd.a.a(true));
   public static final djd.e<djd.a> N = a("doTraderSpawning", djd.b.c, djd.a.a(true));
   public static final djd.e<djd.a> O = a("doWardenSpawning", djd.b.c, djd.a.a(true));
   public static final djd.e<djd.a> P = a("forgiveDeadPlayers", djd.b.b, djd.a.a(true));
   public static final djd.e<djd.a> Q = a("universalAnger", djd.b.b, djd.a.a(false));
   public static final djd.e<djd.d> R = a("playersSleepingPercentage", djd.b.a, djd.d.a(100));
   public static final djd.e<djd.a> S = a("blockExplosionDropDecay", djd.b.d, djd.a.a(true));
   public static final djd.e<djd.a> T = a("mobExplosionDropDecay", djd.b.d, djd.a.a(true));
   public static final djd.e<djd.a> U = a("tntExplosionDropDecay", djd.b.d, djd.a.a(false));
   public static final djd.e<djd.d> V = a("snowAccumulationHeight", djd.b.e, djd.d.a(1));
   public static final djd.e<djd.a> W = a("waterSourceConversion", djd.b.e, djd.a.a(true));
   public static final djd.e<djd.a> X = a("lavaSourceConversion", djd.b.e, djd.a.a(false));
   public static final djd.e<djd.a> Y = a("globalSoundEvents", djd.b.g, djd.a.a(true));
   public static final djd.e<djd.a> Z = a("doVinesSpread", djd.b.e, djd.a.a(true));
   public static final djd.e<djd.a> aa = a("enderPearlsVanishOnDeath", djd.b.a, djd.a.a(true));
   public static final djd.e<djd.d> ab = a("minecartMaxSpeed", djd.b.g, djd.d.a(8, 1, 1000, cut.a(cuv.d), ($$0, $$1) -> {
   }));
   public static final djd.e<djd.d> ac = a("spawnChunkRadius", djd.b.g, djd.d.a(2, 0, 32, cut.a(), ($$0, $$1) -> {
      arq $$2 = $$0.J();
      $$2.a($$2.aa(), $$2.ab());
   }));
   private final Map<djd.e<?>, djd.g<?>> af;
   private final cut ag;

   public static <T extends djd.g<T>> djd.f<T> a(djd.e<T> $$0) {
      return (djd.f<T>)ae.get($$0);
   }

   public static <T extends djd.g<T>> Codec<djd.e<T>> a(Class<T> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> ae.entrySet()
                  .stream()
                  .filter($$1x -> ((djd.f)$$1x.getValue()).e == $$0)
                  .map(Entry::getKey)
                  .filter($$1x -> $$1x.a().equals($$1))
                  .map($$0xx -> $$0xx)
                  .findFirst()
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Invalid game rule ID for type: " + $$1)),
            djd.e::a
         );
   }

   private static <T extends djd.g<T>> djd.e<T> a(String $$0, djd.b $$1, djd.f<T> $$2) {
      djd.e<T> $$3 = new djd.e<>($$0, $$1);
      djd.f<?> $$4 = ae.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public djd(cut $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public djd(cut $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((djd.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<djd.e<?>, djd.f<?>>> b(cut $$0) {
      return ae.entrySet().stream().filter($$1 -> $$1.getValue().f.a($$0));
   }

   private djd(Map<djd.e<?>, djd.g<?>> $$0, cut $$1) {
      this.af = $$0;
      this.ag = $$1;
   }

   public <T extends djd.g<T>> T b(djd.e<T> $$0) {
      T $$1 = (T)this.af.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public tz a() {
      tz $$0 = new tz();
      this.af.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.af.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public djd a(cut $$0) {
      return new djd(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.af.containsKey($$0x.getKey()) ? this.af.get($$0x.getKey()) : ((djd.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(djd.c $$0) {
      ae.forEach(($$1, $$2) -> this.a($$0, (djd.e<?>)$$1, (djd.f<?>)$$2));
   }

   private <T extends djd.g<T>> void a(djd.c $$0, djd.e<?> $$1, djd.f<?> $$2) {
      if ($$2.f.a(this.ag)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(djd $$0, @Nullable MinecraftServer $$1) {
      $$0.af.keySet().forEach($$2 -> this.a((djd.e<?>)$$2, $$0, $$1));
   }

   private <T extends djd.g<T>> void a(djd.e<T> $$0, djd $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.b($$0);
      this.<T>b($$0).a($$3, $$2);
   }

   public boolean c(djd.e<djd.a> $$0) {
      return this.b($$0).a();
   }

   public int d(djd.e<djd.d> $$0) {
      return this.b($$0).a();
   }

   public static class a extends djd.g<djd.a> {
      private boolean b;

      static djd.f<djd.a> a(boolean $$0, BiConsumer<MinecraftServer, djd.a> $$1) {
         return new djd.f<>(BoolArgumentType::bool, $$1x -> new djd.a($$1x, $$0), $$1, djd.c::b, djd.a.class, cut.a());
      }

      static djd.f<djd.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(djd.f<djd.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ej> $$0, String $$1) {
         this.b = BoolArgumentType.getBool($$0, $$1);
      }

      public boolean a() {
         return this.b;
      }

      public void a(boolean $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0;
         this.a($$1);
      }

      @Override
      public String b() {
         return Boolean.toString(this.b);
      }

      @Override
      protected void a(String $$0) {
         this.b = Boolean.parseBoolean($$0);
      }

      @Override
      public int c() {
         return this.b ? 1 : 0;
      }

      protected djd.a d() {
         return this;
      }

      protected djd.a e() {
         return new djd.a(this.a, this.b);
      }

      public void a(djd.a $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static enum b {
      a("gamerule.category.player"),
      b("gamerule.category.mobs"),
      c("gamerule.category.spawning"),
      d("gamerule.category.drops"),
      e("gamerule.category.updates"),
      f("gamerule.category.chat"),
      g("gamerule.category.misc");

      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }
   }

   public interface c {
      default <T extends djd.g<T>> void a(djd.e<T> $$0, djd.f<T> $$1) {
      }

      default void b(djd.e<djd.a> $$0, djd.f<djd.a> $$1) {
      }

      default void c(djd.e<djd.d> $$0, djd.f<djd.d> $$1) {
      }
   }

   public static class d extends djd.g<djd.d> {
      private int b;

      private static djd.f<djd.d> a(int $$0, BiConsumer<MinecraftServer, djd.d> $$1) {
         return new djd.f<>(IntegerArgumentType::integer, $$1x -> new djd.d($$1x, $$0), $$1, djd.c::c, djd.d.class, cut.a());
      }

      static djd.f<djd.d> a(int $$0, int $$1, int $$2, cut $$3, BiConsumer<MinecraftServer, djd.d> $$4) {
         return new djd.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new djd.d($$1x, $$0), $$4, djd.c::c, djd.d.class, $$3);
      }

      static djd.f<djd.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(djd.f<djd.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ej> $$0, String $$1) {
         this.b = IntegerArgumentType.getInteger($$0, $$1);
      }

      public int a() {
         return this.b;
      }

      public void a(int $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0;
         this.a($$1);
      }

      @Override
      public String b() {
         return Integer.toString(this.b);
      }

      @Override
      protected void a(String $$0) {
         this.b = c($$0);
      }

      public boolean b(String $$0) {
         try {
            StringReader $$1 = new StringReader($$0);
            this.b = (Integer)this.a.a.get().parse($$1);
            return !$$1.canRead();
         } catch (CommandSyntaxException var3) {
            return false;
         }
      }

      private static int c(String $$0) {
         if (!$$0.isEmpty()) {
            try {
               return Integer.parseInt($$0);
            } catch (NumberFormatException var2) {
               djd.ad.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected djd.d d() {
         return this;
      }

      protected djd.d e() {
         return new djd.d(this.a, this.b);
      }

      public void a(djd.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends djd.g<T>> {
      final String a;
      private final djd.b b;

      public e(String $$0, djd.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof djd.e && ((djd.e)$$0).a.equals(this.a);
      }

      @Override
      public int hashCode() {
         return this.a.hashCode();
      }

      public String a() {
         return this.a;
      }

      public String b() {
         return "gamerule." + this.a;
      }

      public djd.b c() {
         return this.b;
      }
   }

   public static class f<T extends djd.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<djd.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final djd.h<T> d;
      final Class<T> e;
      final cut f;

      f(Supplier<ArgumentType<?>> $$0, Function<djd.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, djd.h<T> $$3, Class<T> $$4, cut $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      public RequiredArgumentBuilder<ej, ?> a(String $$0) {
         return ek.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(djd.c $$0, djd.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cut b() {
         return this.f;
      }
   }

   public abstract static class g<T extends djd.g<T>> {
      protected final djd.f<T> a;

      public g(djd.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ej> var1, String var2);

      public void b(CommandContext<ej> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ej)$$0.getSource()).l());
      }

      protected void a(@Nullable MinecraftServer $$0) {
         if ($$0 != null) {
            this.a.c.accept($$0, this.g());
         }
      }

      protected abstract void a(String var1);

      public abstract String b();

      @Override
      public String toString() {
         return this.b();
      }

      public abstract int c();

      protected abstract T g();

      protected abstract T f();

      public abstract void a(T var1, @Nullable MinecraftServer var2);
   }

   interface h<T extends djd.g<T>> {
      void call(djd.c var1, djd.e<T> var2, djd.f<T> var3);
   }
}
