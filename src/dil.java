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

public class dil {
   public static final int a = 3;
   static final Logger ac = LogUtils.getLogger();
   private static final Map<dil.e<?>, dil.f<?>> ad = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dil.e<dil.a> b = a("doFireTick", dil.b.e, dil.a.a(true));
   public static final dil.e<dil.a> c = a("mobGriefing", dil.b.b, dil.a.a(true));
   public static final dil.e<dil.a> d = a("keepInventory", dil.b.a, dil.a.a(false));
   public static final dil.e<dil.a> e = a("doMobSpawning", dil.b.c, dil.a.a(true));
   public static final dil.e<dil.a> f = a("doMobLoot", dil.b.d, dil.a.a(true));
   public static final dil.e<dil.a> g = a("projectilesCanBreakBlocks", dil.b.d, dil.a.a(true));
   public static final dil.e<dil.a> h = a("doTileDrops", dil.b.d, dil.a.a(true));
   public static final dil.e<dil.a> i = a("doEntityDrops", dil.b.d, dil.a.a(true));
   public static final dil.e<dil.a> j = a("commandBlockOutput", dil.b.f, dil.a.a(true));
   public static final dil.e<dil.a> k = a("naturalRegeneration", dil.b.a, dil.a.a(true));
   public static final dil.e<dil.a> l = a("doDaylightCycle", dil.b.e, dil.a.a(true));
   public static final dil.e<dil.a> m = a("logAdminCommands", dil.b.f, dil.a.a(true));
   public static final dil.e<dil.a> n = a("showDeathMessages", dil.b.f, dil.a.a(true));
   public static final dil.e<dil.d> o = a("randomTickSpeed", dil.b.e, dil.d.a(3));
   public static final dil.e<dil.a> p = a("sendCommandFeedback", dil.b.f, dil.a.a(true));
   public static final dil.e<dil.a> q = a("reducedDebugInfo", dil.b.g, dil.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arp $$3 : $$0.ag().t()) {
         $$3.f.b(new acv($$3, $$2));
      }
   }));
   public static final dil.e<dil.a> r = a("spectatorsGenerateChunks", dil.b.a, dil.a.a(true));
   public static final dil.e<dil.d> s = a("spawnRadius", dil.b.a, dil.d.a(10));
   public static final dil.e<dil.a> t = a("disablePlayerMovementCheck", dil.b.a, dil.a.a(false));
   public static final dil.e<dil.a> u = a("disableElytraMovementCheck", dil.b.a, dil.a.a(false));
   public static final dil.e<dil.d> v = a("maxEntityCramming", dil.b.b, dil.d.a(24));
   public static final dil.e<dil.a> w = a("doWeatherCycle", dil.b.e, dil.a.a(true));
   public static final dil.e<dil.a> x = a("doLimitedCrafting", dil.b.a, dil.a.a(false, ($$0, $$1) -> {
      for (arp $$2 : $$0.ag().t()) {
         $$2.f.b(new acz(acz.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dil.e<dil.d> y = a("maxCommandChainLength", dil.b.g, dil.d.a(65536));
   public static final dil.e<dil.d> z = a("maxCommandForkCount", dil.b.g, dil.d.a(65536));
   public static final dil.e<dil.d> A = a("commandModificationBlockLimit", dil.b.g, dil.d.a(32768));
   public static final dil.e<dil.a> B = a("announceAdvancements", dil.b.f, dil.a.a(true));
   public static final dil.e<dil.a> C = a("disableRaids", dil.b.b, dil.a.a(false));
   public static final dil.e<dil.a> D = a("doInsomnia", dil.b.c, dil.a.a(true));
   public static final dil.e<dil.a> E = a("doImmediateRespawn", dil.b.a, dil.a.a(false, ($$0, $$1) -> {
      for (arp $$2 : $$0.ag().t()) {
         $$2.f.b(new acz(acz.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dil.e<dil.d> F = a("playersNetherPortalDefaultDelay", dil.b.a, dil.d.a(80));
   public static final dil.e<dil.d> G = a("playersNetherPortalCreativeDelay", dil.b.a, dil.d.a(0));
   public static final dil.e<dil.a> H = a("drowningDamage", dil.b.a, dil.a.a(true));
   public static final dil.e<dil.a> I = a("fallDamage", dil.b.a, dil.a.a(true));
   public static final dil.e<dil.a> J = a("fireDamage", dil.b.a, dil.a.a(true));
   public static final dil.e<dil.a> K = a("freezeDamage", dil.b.a, dil.a.a(true));
   public static final dil.e<dil.a> L = a("doPatrolSpawning", dil.b.c, dil.a.a(true));
   public static final dil.e<dil.a> M = a("doTraderSpawning", dil.b.c, dil.a.a(true));
   public static final dil.e<dil.a> N = a("doWardenSpawning", dil.b.c, dil.a.a(true));
   public static final dil.e<dil.a> O = a("forgiveDeadPlayers", dil.b.b, dil.a.a(true));
   public static final dil.e<dil.a> P = a("universalAnger", dil.b.b, dil.a.a(false));
   public static final dil.e<dil.d> Q = a("playersSleepingPercentage", dil.b.a, dil.d.a(100));
   public static final dil.e<dil.a> R = a("blockExplosionDropDecay", dil.b.d, dil.a.a(true));
   public static final dil.e<dil.a> S = a("mobExplosionDropDecay", dil.b.d, dil.a.a(true));
   public static final dil.e<dil.a> T = a("tntExplosionDropDecay", dil.b.d, dil.a.a(false));
   public static final dil.e<dil.d> U = a("snowAccumulationHeight", dil.b.e, dil.d.a(1));
   public static final dil.e<dil.a> V = a("waterSourceConversion", dil.b.e, dil.a.a(true));
   public static final dil.e<dil.a> W = a("lavaSourceConversion", dil.b.e, dil.a.a(false));
   public static final dil.e<dil.a> X = a("globalSoundEvents", dil.b.g, dil.a.a(true));
   public static final dil.e<dil.a> Y = a("doVinesSpread", dil.b.e, dil.a.a(true));
   public static final dil.e<dil.a> Z = a("enderPearlsVanishOnDeath", dil.b.a, dil.a.a(true));
   public static final dil.e<dil.d> aa = a("minecartMaxSpeed", dil.b.g, dil.d.a(8, 1, 1000, cub.a(cud.d), ($$0, $$1) -> {
   }));
   public static final dil.e<dil.d> ab = a("spawnChunkRadius", dil.b.g, dil.d.a(2, 0, 32, cub.a(), ($$0, $$1) -> {
      aro $$2 = $$0.J();
      $$2.a($$2.aa(), $$2.ab());
   }));
   private final Map<dil.e<?>, dil.g<?>> ae;
   private final cub af;

   public static <T extends dil.g<T>> dil.f<T> a(dil.e<T> $$0) {
      return (dil.f<T>)ad.get($$0);
   }

   public static <T extends dil.g<T>> Codec<dil.e<T>> a(Class<T> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> ad.entrySet()
                  .stream()
                  .filter($$1x -> ((dil.f)$$1x.getValue()).e == $$0)
                  .map(Entry::getKey)
                  .filter($$1x -> $$1x.a().equals($$1))
                  .map($$0xx -> $$0xx)
                  .findFirst()
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Invalid game rule ID for type: " + $$1)),
            dil.e::a
         );
   }

   private static <T extends dil.g<T>> dil.e<T> a(String $$0, dil.b $$1, dil.f<T> $$2) {
      dil.e<T> $$3 = new dil.e<>($$0, $$1);
      dil.f<?> $$4 = ad.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dil(cub $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dil(cub $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dil.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dil.e<?>, dil.f<?>>> b(cub $$0) {
      return ad.entrySet().stream().filter($$1 -> $$1.getValue().f.a($$0));
   }

   private dil(Map<dil.e<?>, dil.g<?>> $$0, cub $$1) {
      this.ae = $$0;
      this.af = $$1;
   }

   public <T extends dil.g<T>> T b(dil.e<T> $$0) {
      T $$1 = (T)this.ae.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public tx a() {
      tx $$0 = new tx();
      this.ae.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ae.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dil a(cub $$0) {
      return new dil(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ae.containsKey($$0x.getKey()) ? this.ae.get($$0x.getKey()) : ((dil.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dil.c $$0) {
      ad.forEach(($$1, $$2) -> this.a($$0, (dil.e<?>)$$1, (dil.f<?>)$$2));
   }

   private <T extends dil.g<T>> void a(dil.c $$0, dil.e<?> $$1, dil.f<?> $$2) {
      if ($$2.f.a(this.af)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dil $$0, @Nullable MinecraftServer $$1) {
      $$0.ae.keySet().forEach($$2 -> this.a((dil.e<?>)$$2, $$0, $$1));
   }

   private <T extends dil.g<T>> void a(dil.e<T> $$0, dil $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.b($$0);
      this.<T>b($$0).a($$3, $$2);
   }

   public boolean c(dil.e<dil.a> $$0) {
      return this.b($$0).a();
   }

   public int d(dil.e<dil.d> $$0) {
      return this.b($$0).a();
   }

   public static class a extends dil.g<dil.a> {
      private boolean b;

      static dil.f<dil.a> a(boolean $$0, BiConsumer<MinecraftServer, dil.a> $$1) {
         return new dil.f<>(BoolArgumentType::bool, $$1x -> new dil.a($$1x, $$0), $$1, dil.c::b, dil.a.class, cub.a());
      }

      static dil.f<dil.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dil.f<dil.a> $$0, boolean $$1) {
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

      protected dil.a d() {
         return this;
      }

      protected dil.a e() {
         return new dil.a(this.a, this.b);
      }

      public void a(dil.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dil.g<T>> void a(dil.e<T> $$0, dil.f<T> $$1) {
      }

      default void b(dil.e<dil.a> $$0, dil.f<dil.a> $$1) {
      }

      default void c(dil.e<dil.d> $$0, dil.f<dil.d> $$1) {
      }
   }

   public static class d extends dil.g<dil.d> {
      private int b;

      private static dil.f<dil.d> a(int $$0, BiConsumer<MinecraftServer, dil.d> $$1) {
         return new dil.f<>(IntegerArgumentType::integer, $$1x -> new dil.d($$1x, $$0), $$1, dil.c::c, dil.d.class, cub.a());
      }

      static dil.f<dil.d> a(int $$0, int $$1, int $$2, cub $$3, BiConsumer<MinecraftServer, dil.d> $$4) {
         return new dil.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dil.d($$1x, $$0), $$4, dil.c::c, dil.d.class, $$3);
      }

      static dil.f<dil.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dil.f<dil.d> $$0, int $$1) {
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
               dil.ac.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dil.d d() {
         return this;
      }

      protected dil.d e() {
         return new dil.d(this.a, this.b);
      }

      public void a(dil.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dil.g<T>> {
      final String a;
      private final dil.b b;

      public e(String $$0, dil.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dil.e && ((dil.e)$$0).a.equals(this.a);
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

      public dil.b c() {
         return this.b;
      }
   }

   public static class f<T extends dil.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dil.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dil.h<T> d;
      final Class<T> e;
      final cub f;

      f(Supplier<ArgumentType<?>> $$0, Function<dil.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dil.h<T> $$3, Class<T> $$4, cub $$5) {
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

      public void a(dil.c $$0, dil.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cub b() {
         return this.f;
      }
   }

   public abstract static class g<T extends dil.g<T>> {
      protected final dil.f<T> a;

      public g(dil.f<T> $$0) {
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

   interface h<T extends dil.g<T>> {
      void call(dil.c var1, dil.e<T> var2, dil.f<T> var3);
   }
}
