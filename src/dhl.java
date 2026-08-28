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

public class dhl {
   public static final int a = 3;
   static final Logger ac = LogUtils.getLogger();
   private static final Map<dhl.e<?>, dhl.f<?>> ad = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dhl.e<dhl.a> b = a("doFireTick", dhl.b.e, dhl.a.a(true));
   public static final dhl.e<dhl.a> c = a("mobGriefing", dhl.b.b, dhl.a.a(true));
   public static final dhl.e<dhl.a> d = a("keepInventory", dhl.b.a, dhl.a.a(false));
   public static final dhl.e<dhl.a> e = a("doMobSpawning", dhl.b.c, dhl.a.a(true));
   public static final dhl.e<dhl.a> f = a("doMobLoot", dhl.b.d, dhl.a.a(true));
   public static final dhl.e<dhl.a> g = a("projectilesCanBreakBlocks", dhl.b.d, dhl.a.a(true));
   public static final dhl.e<dhl.a> h = a("doTileDrops", dhl.b.d, dhl.a.a(true));
   public static final dhl.e<dhl.a> i = a("doEntityDrops", dhl.b.d, dhl.a.a(true));
   public static final dhl.e<dhl.a> j = a("commandBlockOutput", dhl.b.f, dhl.a.a(true));
   public static final dhl.e<dhl.a> k = a("naturalRegeneration", dhl.b.a, dhl.a.a(true));
   public static final dhl.e<dhl.a> l = a("doDaylightCycle", dhl.b.e, dhl.a.a(true));
   public static final dhl.e<dhl.a> m = a("logAdminCommands", dhl.b.f, dhl.a.a(true));
   public static final dhl.e<dhl.a> n = a("showDeathMessages", dhl.b.f, dhl.a.a(true));
   public static final dhl.e<dhl.d> o = a("randomTickSpeed", dhl.b.e, dhl.d.a(3));
   public static final dhl.e<dhl.a> p = a("sendCommandFeedback", dhl.b.f, dhl.a.a(true));
   public static final dhl.e<dhl.a> q = a("reducedDebugInfo", dhl.b.g, dhl.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aro $$3 : $$0.ag().t()) {
         $$3.f.b(new acu($$3, $$2));
      }
   }));
   public static final dhl.e<dhl.a> r = a("spectatorsGenerateChunks", dhl.b.a, dhl.a.a(true));
   public static final dhl.e<dhl.d> s = a("spawnRadius", dhl.b.a, dhl.d.a(10));
   public static final dhl.e<dhl.a> t = a("disablePlayerMovementCheck", dhl.b.a, dhl.a.a(false));
   public static final dhl.e<dhl.a> u = a("disableElytraMovementCheck", dhl.b.a, dhl.a.a(false));
   public static final dhl.e<dhl.d> v = a("maxEntityCramming", dhl.b.b, dhl.d.a(24));
   public static final dhl.e<dhl.a> w = a("doWeatherCycle", dhl.b.e, dhl.a.a(true));
   public static final dhl.e<dhl.a> x = a("doLimitedCrafting", dhl.b.a, dhl.a.a(false, ($$0, $$1) -> {
      for (aro $$2 : $$0.ag().t()) {
         $$2.f.b(new acy(acy.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dhl.e<dhl.d> y = a("maxCommandChainLength", dhl.b.g, dhl.d.a(65536));
   public static final dhl.e<dhl.d> z = a("maxCommandForkCount", dhl.b.g, dhl.d.a(65536));
   public static final dhl.e<dhl.d> A = a("commandModificationBlockLimit", dhl.b.g, dhl.d.a(32768));
   public static final dhl.e<dhl.a> B = a("announceAdvancements", dhl.b.f, dhl.a.a(true));
   public static final dhl.e<dhl.a> C = a("disableRaids", dhl.b.b, dhl.a.a(false));
   public static final dhl.e<dhl.a> D = a("doInsomnia", dhl.b.c, dhl.a.a(true));
   public static final dhl.e<dhl.a> E = a("doImmediateRespawn", dhl.b.a, dhl.a.a(false, ($$0, $$1) -> {
      for (aro $$2 : $$0.ag().t()) {
         $$2.f.b(new acy(acy.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dhl.e<dhl.d> F = a("playersNetherPortalDefaultDelay", dhl.b.a, dhl.d.a(80));
   public static final dhl.e<dhl.d> G = a("playersNetherPortalCreativeDelay", dhl.b.a, dhl.d.a(0));
   public static final dhl.e<dhl.a> H = a("drowningDamage", dhl.b.a, dhl.a.a(true));
   public static final dhl.e<dhl.a> I = a("fallDamage", dhl.b.a, dhl.a.a(true));
   public static final dhl.e<dhl.a> J = a("fireDamage", dhl.b.a, dhl.a.a(true));
   public static final dhl.e<dhl.a> K = a("freezeDamage", dhl.b.a, dhl.a.a(true));
   public static final dhl.e<dhl.a> L = a("doPatrolSpawning", dhl.b.c, dhl.a.a(true));
   public static final dhl.e<dhl.a> M = a("doTraderSpawning", dhl.b.c, dhl.a.a(true));
   public static final dhl.e<dhl.a> N = a("doWardenSpawning", dhl.b.c, dhl.a.a(true));
   public static final dhl.e<dhl.a> O = a("forgiveDeadPlayers", dhl.b.b, dhl.a.a(true));
   public static final dhl.e<dhl.a> P = a("universalAnger", dhl.b.b, dhl.a.a(false));
   public static final dhl.e<dhl.d> Q = a("playersSleepingPercentage", dhl.b.a, dhl.d.a(100));
   public static final dhl.e<dhl.a> R = a("blockExplosionDropDecay", dhl.b.d, dhl.a.a(true));
   public static final dhl.e<dhl.a> S = a("mobExplosionDropDecay", dhl.b.d, dhl.a.a(true));
   public static final dhl.e<dhl.a> T = a("tntExplosionDropDecay", dhl.b.d, dhl.a.a(false));
   public static final dhl.e<dhl.d> U = a("snowAccumulationHeight", dhl.b.e, dhl.d.a(1));
   public static final dhl.e<dhl.a> V = a("waterSourceConversion", dhl.b.e, dhl.a.a(true));
   public static final dhl.e<dhl.a> W = a("lavaSourceConversion", dhl.b.e, dhl.a.a(false));
   public static final dhl.e<dhl.a> X = a("globalSoundEvents", dhl.b.g, dhl.a.a(true));
   public static final dhl.e<dhl.a> Y = a("doVinesSpread", dhl.b.e, dhl.a.a(true));
   public static final dhl.e<dhl.a> Z = a("enderPearlsVanishOnDeath", dhl.b.a, dhl.a.a(true));
   public static final dhl.e<dhl.d> aa = a("minecartMaxSpeed", dhl.b.g, dhl.d.a(8, 1, 1000, cte.a(ctg.d), ($$0, $$1) -> {
   }));
   public static final dhl.e<dhl.d> ab = a("spawnChunkRadius", dhl.b.g, dhl.d.a(2, 0, 32, cte.a(), ($$0, $$1) -> {
      arn $$2 = $$0.J();
      $$2.a($$2.aa(), $$2.ab());
   }));
   private final Map<dhl.e<?>, dhl.g<?>> ae;
   private final cte af;

   public static <T extends dhl.g<T>> dhl.f<T> a(dhl.e<T> $$0) {
      return (dhl.f<T>)ad.get($$0);
   }

   public static <T extends dhl.g<T>> Codec<dhl.e<T>> a(Class<T> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> ad.entrySet()
                  .stream()
                  .filter($$1x -> ((dhl.f)$$1x.getValue()).e == $$0)
                  .map(Entry::getKey)
                  .filter($$1x -> $$1x.a().equals($$1))
                  .map($$0xx -> $$0xx)
                  .findFirst()
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Invalid game rule ID for type: " + $$1)),
            dhl.e::a
         );
   }

   private static <T extends dhl.g<T>> dhl.e<T> a(String $$0, dhl.b $$1, dhl.f<T> $$2) {
      dhl.e<T> $$3 = new dhl.e<>($$0, $$1);
      dhl.f<?> $$4 = ad.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dhl(cte $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dhl(cte $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dhl.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dhl.e<?>, dhl.f<?>>> b(cte $$0) {
      return ad.entrySet().stream().filter($$1 -> $$1.getValue().f.a($$0));
   }

   private dhl(Map<dhl.e<?>, dhl.g<?>> $$0, cte $$1) {
      this.ae = $$0;
      this.af = $$1;
   }

   public <T extends dhl.g<T>> T b(dhl.e<T> $$0) {
      T $$1 = (T)this.ae.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public tw a() {
      tw $$0 = new tw();
      this.ae.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ae.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dhl a(cte $$0) {
      return new dhl(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ae.containsKey($$0x.getKey()) ? this.ae.get($$0x.getKey()) : ((dhl.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dhl.c $$0) {
      ad.forEach(($$1, $$2) -> this.a($$0, (dhl.e<?>)$$1, (dhl.f<?>)$$2));
   }

   private <T extends dhl.g<T>> void a(dhl.c $$0, dhl.e<?> $$1, dhl.f<?> $$2) {
      if ($$2.f.a(this.af)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dhl $$0, @Nullable MinecraftServer $$1) {
      $$0.ae.keySet().forEach($$2 -> this.a((dhl.e<?>)$$2, $$0, $$1));
   }

   private <T extends dhl.g<T>> void a(dhl.e<T> $$0, dhl $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.b($$0);
      this.<T>b($$0).a($$3, $$2);
   }

   public boolean c(dhl.e<dhl.a> $$0) {
      return this.b($$0).a();
   }

   public int d(dhl.e<dhl.d> $$0) {
      return this.b($$0).a();
   }

   public static class a extends dhl.g<dhl.a> {
      private boolean b;

      static dhl.f<dhl.a> a(boolean $$0, BiConsumer<MinecraftServer, dhl.a> $$1) {
         return new dhl.f<>(BoolArgumentType::bool, $$1x -> new dhl.a($$1x, $$0), $$1, dhl.c::b, dhl.a.class, cte.a());
      }

      static dhl.f<dhl.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dhl.f<dhl.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ex> $$0, String $$1) {
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

      protected dhl.a d() {
         return this;
      }

      protected dhl.a e() {
         return new dhl.a(this.a, this.b);
      }

      public void a(dhl.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dhl.g<T>> void a(dhl.e<T> $$0, dhl.f<T> $$1) {
      }

      default void b(dhl.e<dhl.a> $$0, dhl.f<dhl.a> $$1) {
      }

      default void c(dhl.e<dhl.d> $$0, dhl.f<dhl.d> $$1) {
      }
   }

   public static class d extends dhl.g<dhl.d> {
      private int b;

      private static dhl.f<dhl.d> a(int $$0, BiConsumer<MinecraftServer, dhl.d> $$1) {
         return new dhl.f<>(IntegerArgumentType::integer, $$1x -> new dhl.d($$1x, $$0), $$1, dhl.c::c, dhl.d.class, cte.a());
      }

      static dhl.f<dhl.d> a(int $$0, int $$1, int $$2, cte $$3, BiConsumer<MinecraftServer, dhl.d> $$4) {
         return new dhl.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dhl.d($$1x, $$0), $$4, dhl.c::c, dhl.d.class, $$3);
      }

      static dhl.f<dhl.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dhl.f<dhl.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ex> $$0, String $$1) {
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
               dhl.ac.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dhl.d d() {
         return this;
      }

      protected dhl.d e() {
         return new dhl.d(this.a, this.b);
      }

      public void a(dhl.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dhl.g<T>> {
      final String a;
      private final dhl.b b;

      public e(String $$0, dhl.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dhl.e && ((dhl.e)$$0).a.equals(this.a);
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

      public dhl.b c() {
         return this.b;
      }
   }

   public static class f<T extends dhl.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dhl.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dhl.h<T> d;
      final Class<T> e;
      final cte f;

      f(Supplier<ArgumentType<?>> $$0, Function<dhl.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dhl.h<T> $$3, Class<T> $$4, cte $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      public RequiredArgumentBuilder<ex, ?> a(String $$0) {
         return ey.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dhl.c $$0, dhl.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cte b() {
         return this.f;
      }
   }

   public abstract static class g<T extends dhl.g<T>> {
      protected final dhl.f<T> a;

      public g(dhl.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ex> var1, String var2);

      public void b(CommandContext<ex> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ex)$$0.getSource()).l());
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

   interface h<T extends dhl.g<T>> {
      void call(dhl.c var1, dhl.e<T> var2, dhl.f<T> var3);
   }
}
