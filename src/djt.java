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

public class djt {
   public static final int a = 3;
   static final Logger ad = LogUtils.getLogger();
   private static final Map<djt.e<?>, djt.f<?>> ae = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final djt.e<djt.a> b = a("doFireTick", djt.b.e, djt.a.a(true));
   public static final djt.e<djt.a> c = a("allowFireTicksAwayFromPlayer", djt.b.e, djt.a.a(false));
   public static final djt.e<djt.a> d = a("mobGriefing", djt.b.b, djt.a.a(true));
   public static final djt.e<djt.a> e = a("keepInventory", djt.b.a, djt.a.a(false));
   public static final djt.e<djt.a> f = a("doMobSpawning", djt.b.c, djt.a.a(true));
   public static final djt.e<djt.a> g = a("doMobLoot", djt.b.d, djt.a.a(true));
   public static final djt.e<djt.a> h = a("projectilesCanBreakBlocks", djt.b.d, djt.a.a(true));
   public static final djt.e<djt.a> i = a("doTileDrops", djt.b.d, djt.a.a(true));
   public static final djt.e<djt.a> j = a("doEntityDrops", djt.b.d, djt.a.a(true));
   public static final djt.e<djt.a> k = a("commandBlockOutput", djt.b.f, djt.a.a(true));
   public static final djt.e<djt.a> l = a("naturalRegeneration", djt.b.a, djt.a.a(true));
   public static final djt.e<djt.a> m = a("doDaylightCycle", djt.b.e, djt.a.a(true));
   public static final djt.e<djt.a> n = a("logAdminCommands", djt.b.f, djt.a.a(true));
   public static final djt.e<djt.a> o = a("showDeathMessages", djt.b.f, djt.a.a(true));
   public static final djt.e<djt.d> p = a("randomTickSpeed", djt.b.e, djt.d.a(3));
   public static final djt.e<djt.a> q = a("sendCommandFeedback", djt.b.f, djt.a.a(true));
   public static final djt.e<djt.a> r = a("reducedDebugInfo", djt.b.g, djt.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (art $$3 : $$0.ag().t()) {
         $$3.f.b(new acz($$3, $$2));
      }
   }));
   public static final djt.e<djt.a> s = a("spectatorsGenerateChunks", djt.b.a, djt.a.a(true));
   public static final djt.e<djt.d> t = a("spawnRadius", djt.b.a, djt.d.a(10));
   public static final djt.e<djt.a> u = a("disablePlayerMovementCheck", djt.b.a, djt.a.a(false));
   public static final djt.e<djt.a> v = a("disableElytraMovementCheck", djt.b.a, djt.a.a(false));
   public static final djt.e<djt.d> w = a("maxEntityCramming", djt.b.b, djt.d.a(24));
   public static final djt.e<djt.a> x = a("doWeatherCycle", djt.b.e, djt.a.a(true));
   public static final djt.e<djt.a> y = a("doLimitedCrafting", djt.b.a, djt.a.a(false, ($$0, $$1) -> {
      for (art $$2 : $$0.ag().t()) {
         $$2.f.b(new add(add.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final djt.e<djt.d> z = a("maxCommandChainLength", djt.b.g, djt.d.a(65536));
   public static final djt.e<djt.d> A = a("maxCommandForkCount", djt.b.g, djt.d.a(65536));
   public static final djt.e<djt.d> B = a("commandModificationBlockLimit", djt.b.g, djt.d.a(32768));
   public static final djt.e<djt.a> C = a("announceAdvancements", djt.b.f, djt.a.a(true));
   public static final djt.e<djt.a> D = a("disableRaids", djt.b.b, djt.a.a(false));
   public static final djt.e<djt.a> E = a("doInsomnia", djt.b.c, djt.a.a(true));
   public static final djt.e<djt.a> F = a("doImmediateRespawn", djt.b.a, djt.a.a(false, ($$0, $$1) -> {
      for (art $$2 : $$0.ag().t()) {
         $$2.f.b(new add(add.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final djt.e<djt.d> G = a("playersNetherPortalDefaultDelay", djt.b.a, djt.d.a(80));
   public static final djt.e<djt.d> H = a("playersNetherPortalCreativeDelay", djt.b.a, djt.d.a(0));
   public static final djt.e<djt.a> I = a("drowningDamage", djt.b.a, djt.a.a(true));
   public static final djt.e<djt.a> J = a("fallDamage", djt.b.a, djt.a.a(true));
   public static final djt.e<djt.a> K = a("fireDamage", djt.b.a, djt.a.a(true));
   public static final djt.e<djt.a> L = a("freezeDamage", djt.b.a, djt.a.a(true));
   public static final djt.e<djt.a> M = a("doPatrolSpawning", djt.b.c, djt.a.a(true));
   public static final djt.e<djt.a> N = a("doTraderSpawning", djt.b.c, djt.a.a(true));
   public static final djt.e<djt.a> O = a("doWardenSpawning", djt.b.c, djt.a.a(true));
   public static final djt.e<djt.a> P = a("forgiveDeadPlayers", djt.b.b, djt.a.a(true));
   public static final djt.e<djt.a> Q = a("universalAnger", djt.b.b, djt.a.a(false));
   public static final djt.e<djt.d> R = a("playersSleepingPercentage", djt.b.a, djt.d.a(100));
   public static final djt.e<djt.a> S = a("blockExplosionDropDecay", djt.b.d, djt.a.a(true));
   public static final djt.e<djt.a> T = a("mobExplosionDropDecay", djt.b.d, djt.a.a(true));
   public static final djt.e<djt.a> U = a("tntExplosionDropDecay", djt.b.d, djt.a.a(false));
   public static final djt.e<djt.d> V = a("snowAccumulationHeight", djt.b.e, djt.d.a(1));
   public static final djt.e<djt.a> W = a("waterSourceConversion", djt.b.e, djt.a.a(true));
   public static final djt.e<djt.a> X = a("lavaSourceConversion", djt.b.e, djt.a.a(false));
   public static final djt.e<djt.a> Y = a("globalSoundEvents", djt.b.g, djt.a.a(true));
   public static final djt.e<djt.a> Z = a("doVinesSpread", djt.b.e, djt.a.a(true));
   public static final djt.e<djt.a> aa = a("enderPearlsVanishOnDeath", djt.b.a, djt.a.a(true));
   public static final djt.e<djt.d> ab = a("minecartMaxSpeed", djt.b.g, djt.d.a(8, 1, 1000, cvh.a(cvj.d), ($$0, $$1) -> {
   }));
   public static final djt.e<djt.d> ac = a("spawnChunkRadius", djt.b.g, djt.d.a(2, 0, 32, cvh.a(), ($$0, $$1) -> {
      ars $$2 = $$0.J();
      $$2.a($$2.aa(), $$2.ab());
   }));
   private final Map<djt.e<?>, djt.g<?>> af;
   private final cvh ag;

   public static <T extends djt.g<T>> djt.f<T> a(djt.e<T> $$0) {
      return (djt.f<T>)ae.get($$0);
   }

   public static <T extends djt.g<T>> Codec<djt.e<T>> a(Class<T> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> ae.entrySet()
                  .stream()
                  .filter($$1x -> ((djt.f)$$1x.getValue()).e == $$0)
                  .map(Entry::getKey)
                  .filter($$1x -> $$1x.a().equals($$1))
                  .map($$0xx -> $$0xx)
                  .findFirst()
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Invalid game rule ID for type: " + $$1)),
            djt.e::a
         );
   }

   private static <T extends djt.g<T>> djt.e<T> a(String $$0, djt.b $$1, djt.f<T> $$2) {
      djt.e<T> $$3 = new djt.e<>($$0, $$1);
      djt.f<?> $$4 = ae.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public djt(cvh $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public djt(cvh $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((djt.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<djt.e<?>, djt.f<?>>> b(cvh $$0) {
      return ae.entrySet().stream().filter($$1 -> $$1.getValue().f.a($$0));
   }

   private djt(Map<djt.e<?>, djt.g<?>> $$0, cvh $$1) {
      this.af = $$0;
      this.ag = $$1;
   }

   public <T extends djt.g<T>> T b(djt.e<T> $$0) {
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

   public djt a(cvh $$0) {
      return new djt(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.af.containsKey($$0x.getKey()) ? this.af.get($$0x.getKey()) : ((djt.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(djt.c $$0) {
      ae.forEach(($$1, $$2) -> this.a($$0, (djt.e<?>)$$1, (djt.f<?>)$$2));
   }

   private <T extends djt.g<T>> void a(djt.c $$0, djt.e<?> $$1, djt.f<?> $$2) {
      if ($$2.f.a(this.ag)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(djt $$0, @Nullable MinecraftServer $$1) {
      $$0.af.keySet().forEach($$2 -> this.a((djt.e<?>)$$2, $$0, $$1));
   }

   private <T extends djt.g<T>> void a(djt.e<T> $$0, djt $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.b($$0);
      this.<T>b($$0).a($$3, $$2);
   }

   public boolean c(djt.e<djt.a> $$0) {
      return this.b($$0).a();
   }

   public int d(djt.e<djt.d> $$0) {
      return this.b($$0).a();
   }

   public static class a extends djt.g<djt.a> {
      private boolean b;

      static djt.f<djt.a> a(boolean $$0, BiConsumer<MinecraftServer, djt.a> $$1) {
         return new djt.f<>(BoolArgumentType::bool, $$1x -> new djt.a($$1x, $$0), $$1, djt.c::b, djt.a.class, cvh.a());
      }

      static djt.f<djt.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(djt.f<djt.a> $$0, boolean $$1) {
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

      protected djt.a d() {
         return this;
      }

      protected djt.a e() {
         return new djt.a(this.a, this.b);
      }

      public void a(djt.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends djt.g<T>> void a(djt.e<T> $$0, djt.f<T> $$1) {
      }

      default void b(djt.e<djt.a> $$0, djt.f<djt.a> $$1) {
      }

      default void c(djt.e<djt.d> $$0, djt.f<djt.d> $$1) {
      }
   }

   public static class d extends djt.g<djt.d> {
      private int b;

      private static djt.f<djt.d> a(int $$0, BiConsumer<MinecraftServer, djt.d> $$1) {
         return new djt.f<>(IntegerArgumentType::integer, $$1x -> new djt.d($$1x, $$0), $$1, djt.c::c, djt.d.class, cvh.a());
      }

      static djt.f<djt.d> a(int $$0, int $$1, int $$2, cvh $$3, BiConsumer<MinecraftServer, djt.d> $$4) {
         return new djt.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new djt.d($$1x, $$0), $$4, djt.c::c, djt.d.class, $$3);
      }

      static djt.f<djt.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(djt.f<djt.d> $$0, int $$1) {
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
               djt.ad.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected djt.d d() {
         return this;
      }

      protected djt.d e() {
         return new djt.d(this.a, this.b);
      }

      public void a(djt.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends djt.g<T>> {
      final String a;
      private final djt.b b;

      public e(String $$0, djt.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof djt.e && ((djt.e)$$0).a.equals(this.a);
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

      public djt.b c() {
         return this.b;
      }
   }

   public static class f<T extends djt.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<djt.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final djt.h<T> d;
      final Class<T> e;
      final cvh f;

      f(Supplier<ArgumentType<?>> $$0, Function<djt.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, djt.h<T> $$3, Class<T> $$4, cvh $$5) {
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

      public void a(djt.c $$0, djt.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cvh b() {
         return this.f;
      }
   }

   public abstract static class g<T extends djt.g<T>> {
      protected final djt.f<T> a;

      public g(djt.f<T> $$0) {
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

   interface h<T extends djt.g<T>> {
      void call(djt.c var1, djt.e<T> var2, djt.f<T> var3);
   }
}
