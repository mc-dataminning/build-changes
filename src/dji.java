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

public class dji {
   public static final int a = 3;
   static final Logger ad = LogUtils.getLogger();
   private static final Map<dji.e<?>, dji.f<?>> ae = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dji.e<dji.a> b = a("doFireTick", dji.b.e, dji.a.a(true));
   public static final dji.e<dji.a> c = a("allowFireTicksAwayFromPlayer", dji.b.e, dji.a.a(false));
   public static final dji.e<dji.a> d = a("mobGriefing", dji.b.b, dji.a.a(true));
   public static final dji.e<dji.a> e = a("keepInventory", dji.b.a, dji.a.a(false));
   public static final dji.e<dji.a> f = a("doMobSpawning", dji.b.c, dji.a.a(true));
   public static final dji.e<dji.a> g = a("doMobLoot", dji.b.d, dji.a.a(true));
   public static final dji.e<dji.a> h = a("projectilesCanBreakBlocks", dji.b.d, dji.a.a(true));
   public static final dji.e<dji.a> i = a("doTileDrops", dji.b.d, dji.a.a(true));
   public static final dji.e<dji.a> j = a("doEntityDrops", dji.b.d, dji.a.a(true));
   public static final dji.e<dji.a> k = a("commandBlockOutput", dji.b.f, dji.a.a(true));
   public static final dji.e<dji.a> l = a("naturalRegeneration", dji.b.a, dji.a.a(true));
   public static final dji.e<dji.a> m = a("doDaylightCycle", dji.b.e, dji.a.a(true));
   public static final dji.e<dji.a> n = a("logAdminCommands", dji.b.f, dji.a.a(true));
   public static final dji.e<dji.a> o = a("showDeathMessages", dji.b.f, dji.a.a(true));
   public static final dji.e<dji.d> p = a("randomTickSpeed", dji.b.e, dji.d.a(3));
   public static final dji.e<dji.a> q = a("sendCommandFeedback", dji.b.f, dji.a.a(true));
   public static final dji.e<dji.a> r = a("reducedDebugInfo", dji.b.g, dji.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arr $$3 : $$0.ag().t()) {
         $$3.f.b(new acx($$3, $$2));
      }
   }));
   public static final dji.e<dji.a> s = a("spectatorsGenerateChunks", dji.b.a, dji.a.a(true));
   public static final dji.e<dji.d> t = a("spawnRadius", dji.b.a, dji.d.a(10));
   public static final dji.e<dji.a> u = a("disablePlayerMovementCheck", dji.b.a, dji.a.a(false));
   public static final dji.e<dji.a> v = a("disableElytraMovementCheck", dji.b.a, dji.a.a(false));
   public static final dji.e<dji.d> w = a("maxEntityCramming", dji.b.b, dji.d.a(24));
   public static final dji.e<dji.a> x = a("doWeatherCycle", dji.b.e, dji.a.a(true));
   public static final dji.e<dji.a> y = a("doLimitedCrafting", dji.b.a, dji.a.a(false, ($$0, $$1) -> {
      for (arr $$2 : $$0.ag().t()) {
         $$2.f.b(new adb(adb.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dji.e<dji.d> z = a("maxCommandChainLength", dji.b.g, dji.d.a(65536));
   public static final dji.e<dji.d> A = a("maxCommandForkCount", dji.b.g, dji.d.a(65536));
   public static final dji.e<dji.d> B = a("commandModificationBlockLimit", dji.b.g, dji.d.a(32768));
   public static final dji.e<dji.a> C = a("announceAdvancements", dji.b.f, dji.a.a(true));
   public static final dji.e<dji.a> D = a("disableRaids", dji.b.b, dji.a.a(false));
   public static final dji.e<dji.a> E = a("doInsomnia", dji.b.c, dji.a.a(true));
   public static final dji.e<dji.a> F = a("doImmediateRespawn", dji.b.a, dji.a.a(false, ($$0, $$1) -> {
      for (arr $$2 : $$0.ag().t()) {
         $$2.f.b(new adb(adb.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dji.e<dji.d> G = a("playersNetherPortalDefaultDelay", dji.b.a, dji.d.a(80));
   public static final dji.e<dji.d> H = a("playersNetherPortalCreativeDelay", dji.b.a, dji.d.a(0));
   public static final dji.e<dji.a> I = a("drowningDamage", dji.b.a, dji.a.a(true));
   public static final dji.e<dji.a> J = a("fallDamage", dji.b.a, dji.a.a(true));
   public static final dji.e<dji.a> K = a("fireDamage", dji.b.a, dji.a.a(true));
   public static final dji.e<dji.a> L = a("freezeDamage", dji.b.a, dji.a.a(true));
   public static final dji.e<dji.a> M = a("doPatrolSpawning", dji.b.c, dji.a.a(true));
   public static final dji.e<dji.a> N = a("doTraderSpawning", dji.b.c, dji.a.a(true));
   public static final dji.e<dji.a> O = a("doWardenSpawning", dji.b.c, dji.a.a(true));
   public static final dji.e<dji.a> P = a("forgiveDeadPlayers", dji.b.b, dji.a.a(true));
   public static final dji.e<dji.a> Q = a("universalAnger", dji.b.b, dji.a.a(false));
   public static final dji.e<dji.d> R = a("playersSleepingPercentage", dji.b.a, dji.d.a(100));
   public static final dji.e<dji.a> S = a("blockExplosionDropDecay", dji.b.d, dji.a.a(true));
   public static final dji.e<dji.a> T = a("mobExplosionDropDecay", dji.b.d, dji.a.a(true));
   public static final dji.e<dji.a> U = a("tntExplosionDropDecay", dji.b.d, dji.a.a(false));
   public static final dji.e<dji.d> V = a("snowAccumulationHeight", dji.b.e, dji.d.a(1));
   public static final dji.e<dji.a> W = a("waterSourceConversion", dji.b.e, dji.a.a(true));
   public static final dji.e<dji.a> X = a("lavaSourceConversion", dji.b.e, dji.a.a(false));
   public static final dji.e<dji.a> Y = a("globalSoundEvents", dji.b.g, dji.a.a(true));
   public static final dji.e<dji.a> Z = a("doVinesSpread", dji.b.e, dji.a.a(true));
   public static final dji.e<dji.a> aa = a("enderPearlsVanishOnDeath", dji.b.a, dji.a.a(true));
   public static final dji.e<dji.d> ab = a("minecartMaxSpeed", dji.b.g, dji.d.a(8, 1, 1000, cuw.a(cuy.d), ($$0, $$1) -> {
   }));
   public static final dji.e<dji.d> ac = a("spawnChunkRadius", dji.b.g, dji.d.a(2, 0, 32, cuw.a(), ($$0, $$1) -> {
      arq $$2 = $$0.J();
      $$2.a($$2.aa(), $$2.ab());
   }));
   private final Map<dji.e<?>, dji.g<?>> af;
   private final cuw ag;

   public static <T extends dji.g<T>> dji.f<T> a(dji.e<T> $$0) {
      return (dji.f<T>)ae.get($$0);
   }

   public static <T extends dji.g<T>> Codec<dji.e<T>> a(Class<T> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> ae.entrySet()
                  .stream()
                  .filter($$1x -> ((dji.f)$$1x.getValue()).e == $$0)
                  .map(Entry::getKey)
                  .filter($$1x -> $$1x.a().equals($$1))
                  .map($$0xx -> $$0xx)
                  .findFirst()
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Invalid game rule ID for type: " + $$1)),
            dji.e::a
         );
   }

   private static <T extends dji.g<T>> dji.e<T> a(String $$0, dji.b $$1, dji.f<T> $$2) {
      dji.e<T> $$3 = new dji.e<>($$0, $$1);
      dji.f<?> $$4 = ae.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dji(cuw $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dji(cuw $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dji.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dji.e<?>, dji.f<?>>> b(cuw $$0) {
      return ae.entrySet().stream().filter($$1 -> $$1.getValue().f.a($$0));
   }

   private dji(Map<dji.e<?>, dji.g<?>> $$0, cuw $$1) {
      this.af = $$0;
      this.ag = $$1;
   }

   public <T extends dji.g<T>> T b(dji.e<T> $$0) {
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

   public dji a(cuw $$0) {
      return new dji(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.af.containsKey($$0x.getKey()) ? this.af.get($$0x.getKey()) : ((dji.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dji.c $$0) {
      ae.forEach(($$1, $$2) -> this.a($$0, (dji.e<?>)$$1, (dji.f<?>)$$2));
   }

   private <T extends dji.g<T>> void a(dji.c $$0, dji.e<?> $$1, dji.f<?> $$2) {
      if ($$2.f.a(this.ag)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dji $$0, @Nullable MinecraftServer $$1) {
      $$0.af.keySet().forEach($$2 -> this.a((dji.e<?>)$$2, $$0, $$1));
   }

   private <T extends dji.g<T>> void a(dji.e<T> $$0, dji $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.b($$0);
      this.<T>b($$0).a($$3, $$2);
   }

   public boolean c(dji.e<dji.a> $$0) {
      return this.b($$0).a();
   }

   public int d(dji.e<dji.d> $$0) {
      return this.b($$0).a();
   }

   public static class a extends dji.g<dji.a> {
      private boolean b;

      static dji.f<dji.a> a(boolean $$0, BiConsumer<MinecraftServer, dji.a> $$1) {
         return new dji.f<>(BoolArgumentType::bool, $$1x -> new dji.a($$1x, $$0), $$1, dji.c::b, dji.a.class, cuw.a());
      }

      static dji.f<dji.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dji.f<dji.a> $$0, boolean $$1) {
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

      protected dji.a d() {
         return this;
      }

      protected dji.a e() {
         return new dji.a(this.a, this.b);
      }

      public void a(dji.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dji.g<T>> void a(dji.e<T> $$0, dji.f<T> $$1) {
      }

      default void b(dji.e<dji.a> $$0, dji.f<dji.a> $$1) {
      }

      default void c(dji.e<dji.d> $$0, dji.f<dji.d> $$1) {
      }
   }

   public static class d extends dji.g<dji.d> {
      private int b;

      private static dji.f<dji.d> a(int $$0, BiConsumer<MinecraftServer, dji.d> $$1) {
         return new dji.f<>(IntegerArgumentType::integer, $$1x -> new dji.d($$1x, $$0), $$1, dji.c::c, dji.d.class, cuw.a());
      }

      static dji.f<dji.d> a(int $$0, int $$1, int $$2, cuw $$3, BiConsumer<MinecraftServer, dji.d> $$4) {
         return new dji.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dji.d($$1x, $$0), $$4, dji.c::c, dji.d.class, $$3);
      }

      static dji.f<dji.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dji.f<dji.d> $$0, int $$1) {
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
               dji.ad.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dji.d d() {
         return this;
      }

      protected dji.d e() {
         return new dji.d(this.a, this.b);
      }

      public void a(dji.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dji.g<T>> {
      final String a;
      private final dji.b b;

      public e(String $$0, dji.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dji.e && ((dji.e)$$0).a.equals(this.a);
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

      public dji.b c() {
         return this.b;
      }
   }

   public static class f<T extends dji.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dji.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dji.h<T> d;
      final Class<T> e;
      final cuw f;

      f(Supplier<ArgumentType<?>> $$0, Function<dji.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dji.h<T> $$3, Class<T> $$4, cuw $$5) {
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

      public void a(dji.c $$0, dji.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cuw b() {
         return this.f;
      }
   }

   public abstract static class g<T extends dji.g<T>> {
      protected final dji.f<T> a;

      public g(dji.f<T> $$0) {
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

   interface h<T extends dji.g<T>> {
      void call(dji.c var1, dji.e<T> var2, dji.f<T> var3);
   }
}
