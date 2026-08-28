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

public class dir {
   public static final int a = 3;
   static final Logger ac = LogUtils.getLogger();
   private static final Map<dir.e<?>, dir.f<?>> ad = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dir.e<dir.a> b = a("doFireTick", dir.b.e, dir.a.a(true));
   public static final dir.e<dir.a> c = a("mobGriefing", dir.b.b, dir.a.a(true));
   public static final dir.e<dir.a> d = a("keepInventory", dir.b.a, dir.a.a(false));
   public static final dir.e<dir.a> e = a("doMobSpawning", dir.b.c, dir.a.a(true));
   public static final dir.e<dir.a> f = a("doMobLoot", dir.b.d, dir.a.a(true));
   public static final dir.e<dir.a> g = a("projectilesCanBreakBlocks", dir.b.d, dir.a.a(true));
   public static final dir.e<dir.a> h = a("doTileDrops", dir.b.d, dir.a.a(true));
   public static final dir.e<dir.a> i = a("doEntityDrops", dir.b.d, dir.a.a(true));
   public static final dir.e<dir.a> j = a("commandBlockOutput", dir.b.f, dir.a.a(true));
   public static final dir.e<dir.a> k = a("naturalRegeneration", dir.b.a, dir.a.a(true));
   public static final dir.e<dir.a> l = a("doDaylightCycle", dir.b.e, dir.a.a(true));
   public static final dir.e<dir.a> m = a("logAdminCommands", dir.b.f, dir.a.a(true));
   public static final dir.e<dir.a> n = a("showDeathMessages", dir.b.f, dir.a.a(true));
   public static final dir.e<dir.d> o = a("randomTickSpeed", dir.b.e, dir.d.a(3));
   public static final dir.e<dir.a> p = a("sendCommandFeedback", dir.b.f, dir.a.a(true));
   public static final dir.e<dir.a> q = a("reducedDebugInfo", dir.b.g, dir.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arr $$3 : $$0.ag().t()) {
         $$3.f.b(new acx($$3, $$2));
      }
   }));
   public static final dir.e<dir.a> r = a("spectatorsGenerateChunks", dir.b.a, dir.a.a(true));
   public static final dir.e<dir.d> s = a("spawnRadius", dir.b.a, dir.d.a(10));
   public static final dir.e<dir.a> t = a("disablePlayerMovementCheck", dir.b.a, dir.a.a(false));
   public static final dir.e<dir.a> u = a("disableElytraMovementCheck", dir.b.a, dir.a.a(false));
   public static final dir.e<dir.d> v = a("maxEntityCramming", dir.b.b, dir.d.a(24));
   public static final dir.e<dir.a> w = a("doWeatherCycle", dir.b.e, dir.a.a(true));
   public static final dir.e<dir.a> x = a("doLimitedCrafting", dir.b.a, dir.a.a(false, ($$0, $$1) -> {
      for (arr $$2 : $$0.ag().t()) {
         $$2.f.b(new adb(adb.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dir.e<dir.d> y = a("maxCommandChainLength", dir.b.g, dir.d.a(65536));
   public static final dir.e<dir.d> z = a("maxCommandForkCount", dir.b.g, dir.d.a(65536));
   public static final dir.e<dir.d> A = a("commandModificationBlockLimit", dir.b.g, dir.d.a(32768));
   public static final dir.e<dir.a> B = a("announceAdvancements", dir.b.f, dir.a.a(true));
   public static final dir.e<dir.a> C = a("disableRaids", dir.b.b, dir.a.a(false));
   public static final dir.e<dir.a> D = a("doInsomnia", dir.b.c, dir.a.a(true));
   public static final dir.e<dir.a> E = a("doImmediateRespawn", dir.b.a, dir.a.a(false, ($$0, $$1) -> {
      for (arr $$2 : $$0.ag().t()) {
         $$2.f.b(new adb(adb.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dir.e<dir.d> F = a("playersNetherPortalDefaultDelay", dir.b.a, dir.d.a(80));
   public static final dir.e<dir.d> G = a("playersNetherPortalCreativeDelay", dir.b.a, dir.d.a(0));
   public static final dir.e<dir.a> H = a("drowningDamage", dir.b.a, dir.a.a(true));
   public static final dir.e<dir.a> I = a("fallDamage", dir.b.a, dir.a.a(true));
   public static final dir.e<dir.a> J = a("fireDamage", dir.b.a, dir.a.a(true));
   public static final dir.e<dir.a> K = a("freezeDamage", dir.b.a, dir.a.a(true));
   public static final dir.e<dir.a> L = a("doPatrolSpawning", dir.b.c, dir.a.a(true));
   public static final dir.e<dir.a> M = a("doTraderSpawning", dir.b.c, dir.a.a(true));
   public static final dir.e<dir.a> N = a("doWardenSpawning", dir.b.c, dir.a.a(true));
   public static final dir.e<dir.a> O = a("forgiveDeadPlayers", dir.b.b, dir.a.a(true));
   public static final dir.e<dir.a> P = a("universalAnger", dir.b.b, dir.a.a(false));
   public static final dir.e<dir.d> Q = a("playersSleepingPercentage", dir.b.a, dir.d.a(100));
   public static final dir.e<dir.a> R = a("blockExplosionDropDecay", dir.b.d, dir.a.a(true));
   public static final dir.e<dir.a> S = a("mobExplosionDropDecay", dir.b.d, dir.a.a(true));
   public static final dir.e<dir.a> T = a("tntExplosionDropDecay", dir.b.d, dir.a.a(false));
   public static final dir.e<dir.d> U = a("snowAccumulationHeight", dir.b.e, dir.d.a(1));
   public static final dir.e<dir.a> V = a("waterSourceConversion", dir.b.e, dir.a.a(true));
   public static final dir.e<dir.a> W = a("lavaSourceConversion", dir.b.e, dir.a.a(false));
   public static final dir.e<dir.a> X = a("globalSoundEvents", dir.b.g, dir.a.a(true));
   public static final dir.e<dir.a> Y = a("doVinesSpread", dir.b.e, dir.a.a(true));
   public static final dir.e<dir.a> Z = a("enderPearlsVanishOnDeath", dir.b.a, dir.a.a(true));
   public static final dir.e<dir.d> aa = a("minecartMaxSpeed", dir.b.g, dir.d.a(8, 1, 1000, cuh.a(cuj.d), ($$0, $$1) -> {
   }));
   public static final dir.e<dir.d> ab = a("spawnChunkRadius", dir.b.g, dir.d.a(2, 0, 32, cuh.a(), ($$0, $$1) -> {
      arq $$2 = $$0.J();
      $$2.a($$2.aa(), $$2.ab());
   }));
   private final Map<dir.e<?>, dir.g<?>> ae;
   private final cuh af;

   public static <T extends dir.g<T>> dir.f<T> a(dir.e<T> $$0) {
      return (dir.f<T>)ad.get($$0);
   }

   public static <T extends dir.g<T>> Codec<dir.e<T>> a(Class<T> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> ad.entrySet()
                  .stream()
                  .filter($$1x -> ((dir.f)$$1x.getValue()).e == $$0)
                  .map(Entry::getKey)
                  .filter($$1x -> $$1x.a().equals($$1))
                  .map($$0xx -> $$0xx)
                  .findFirst()
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Invalid game rule ID for type: " + $$1)),
            dir.e::a
         );
   }

   private static <T extends dir.g<T>> dir.e<T> a(String $$0, dir.b $$1, dir.f<T> $$2) {
      dir.e<T> $$3 = new dir.e<>($$0, $$1);
      dir.f<?> $$4 = ad.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dir(cuh $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dir(cuh $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dir.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dir.e<?>, dir.f<?>>> b(cuh $$0) {
      return ad.entrySet().stream().filter($$1 -> $$1.getValue().f.a($$0));
   }

   private dir(Map<dir.e<?>, dir.g<?>> $$0, cuh $$1) {
      this.ae = $$0;
      this.af = $$1;
   }

   public <T extends dir.g<T>> T b(dir.e<T> $$0) {
      T $$1 = (T)this.ae.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public tz a() {
      tz $$0 = new tz();
      this.ae.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ae.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dir a(cuh $$0) {
      return new dir(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ae.containsKey($$0x.getKey()) ? this.ae.get($$0x.getKey()) : ((dir.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dir.c $$0) {
      ad.forEach(($$1, $$2) -> this.a($$0, (dir.e<?>)$$1, (dir.f<?>)$$2));
   }

   private <T extends dir.g<T>> void a(dir.c $$0, dir.e<?> $$1, dir.f<?> $$2) {
      if ($$2.f.a(this.af)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dir $$0, @Nullable MinecraftServer $$1) {
      $$0.ae.keySet().forEach($$2 -> this.a((dir.e<?>)$$2, $$0, $$1));
   }

   private <T extends dir.g<T>> void a(dir.e<T> $$0, dir $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.b($$0);
      this.<T>b($$0).a($$3, $$2);
   }

   public boolean c(dir.e<dir.a> $$0) {
      return this.b($$0).a();
   }

   public int d(dir.e<dir.d> $$0) {
      return this.b($$0).a();
   }

   public static class a extends dir.g<dir.a> {
      private boolean b;

      static dir.f<dir.a> a(boolean $$0, BiConsumer<MinecraftServer, dir.a> $$1) {
         return new dir.f<>(BoolArgumentType::bool, $$1x -> new dir.a($$1x, $$0), $$1, dir.c::b, dir.a.class, cuh.a());
      }

      static dir.f<dir.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dir.f<dir.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ei> $$0, String $$1) {
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

      protected dir.a d() {
         return this;
      }

      protected dir.a e() {
         return new dir.a(this.a, this.b);
      }

      public void a(dir.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dir.g<T>> void a(dir.e<T> $$0, dir.f<T> $$1) {
      }

      default void b(dir.e<dir.a> $$0, dir.f<dir.a> $$1) {
      }

      default void c(dir.e<dir.d> $$0, dir.f<dir.d> $$1) {
      }
   }

   public static class d extends dir.g<dir.d> {
      private int b;

      private static dir.f<dir.d> a(int $$0, BiConsumer<MinecraftServer, dir.d> $$1) {
         return new dir.f<>(IntegerArgumentType::integer, $$1x -> new dir.d($$1x, $$0), $$1, dir.c::c, dir.d.class, cuh.a());
      }

      static dir.f<dir.d> a(int $$0, int $$1, int $$2, cuh $$3, BiConsumer<MinecraftServer, dir.d> $$4) {
         return new dir.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dir.d($$1x, $$0), $$4, dir.c::c, dir.d.class, $$3);
      }

      static dir.f<dir.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dir.f<dir.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ei> $$0, String $$1) {
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
               dir.ac.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dir.d d() {
         return this;
      }

      protected dir.d e() {
         return new dir.d(this.a, this.b);
      }

      public void a(dir.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dir.g<T>> {
      final String a;
      private final dir.b b;

      public e(String $$0, dir.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dir.e && ((dir.e)$$0).a.equals(this.a);
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

      public dir.b c() {
         return this.b;
      }
   }

   public static class f<T extends dir.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dir.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dir.h<T> d;
      final Class<T> e;
      final cuh f;

      f(Supplier<ArgumentType<?>> $$0, Function<dir.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dir.h<T> $$3, Class<T> $$4, cuh $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      public RequiredArgumentBuilder<ei, ?> a(String $$0) {
         return ej.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dir.c $$0, dir.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cuh b() {
         return this.f;
      }
   }

   public abstract static class g<T extends dir.g<T>> {
      protected final dir.f<T> a;

      public g(dir.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ei> var1, String var2);

      public void b(CommandContext<ei> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ei)$$0.getSource()).l());
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

   interface h<T extends dir.g<T>> {
      void call(dir.c var1, dir.e<T> var2, dir.f<T> var3);
   }
}
