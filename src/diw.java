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

public class diw {
   public static final int a = 3;
   static final Logger ad = LogUtils.getLogger();
   private static final Map<diw.e<?>, diw.f<?>> ae = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final diw.e<diw.a> b = a("doFireTick", diw.b.e, diw.a.a(true));
   public static final diw.e<diw.a> c = a("allowFireTicksAwayFromPlayer", diw.b.e, diw.a.a(false));
   public static final diw.e<diw.a> d = a("mobGriefing", diw.b.b, diw.a.a(true));
   public static final diw.e<diw.a> e = a("keepInventory", diw.b.a, diw.a.a(false));
   public static final diw.e<diw.a> f = a("doMobSpawning", diw.b.c, diw.a.a(true));
   public static final diw.e<diw.a> g = a("doMobLoot", diw.b.d, diw.a.a(true));
   public static final diw.e<diw.a> h = a("projectilesCanBreakBlocks", diw.b.d, diw.a.a(true));
   public static final diw.e<diw.a> i = a("doTileDrops", diw.b.d, diw.a.a(true));
   public static final diw.e<diw.a> j = a("doEntityDrops", diw.b.d, diw.a.a(true));
   public static final diw.e<diw.a> k = a("commandBlockOutput", diw.b.f, diw.a.a(true));
   public static final diw.e<diw.a> l = a("naturalRegeneration", diw.b.a, diw.a.a(true));
   public static final diw.e<diw.a> m = a("doDaylightCycle", diw.b.e, diw.a.a(true));
   public static final diw.e<diw.a> n = a("logAdminCommands", diw.b.f, diw.a.a(true));
   public static final diw.e<diw.a> o = a("showDeathMessages", diw.b.f, diw.a.a(true));
   public static final diw.e<diw.d> p = a("randomTickSpeed", diw.b.e, diw.d.a(3));
   public static final diw.e<diw.a> q = a("sendCommandFeedback", diw.b.f, diw.a.a(true));
   public static final diw.e<diw.a> r = a("reducedDebugInfo", diw.b.g, diw.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arr $$3 : $$0.ag().t()) {
         $$3.f.b(new acx($$3, $$2));
      }
   }));
   public static final diw.e<diw.a> s = a("spectatorsGenerateChunks", diw.b.a, diw.a.a(true));
   public static final diw.e<diw.d> t = a("spawnRadius", diw.b.a, diw.d.a(10));
   public static final diw.e<diw.a> u = a("disablePlayerMovementCheck", diw.b.a, diw.a.a(false));
   public static final diw.e<diw.a> v = a("disableElytraMovementCheck", diw.b.a, diw.a.a(false));
   public static final diw.e<diw.d> w = a("maxEntityCramming", diw.b.b, diw.d.a(24));
   public static final diw.e<diw.a> x = a("doWeatherCycle", diw.b.e, diw.a.a(true));
   public static final diw.e<diw.a> y = a("doLimitedCrafting", diw.b.a, diw.a.a(false, ($$0, $$1) -> {
      for (arr $$2 : $$0.ag().t()) {
         $$2.f.b(new adb(adb.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final diw.e<diw.d> z = a("maxCommandChainLength", diw.b.g, diw.d.a(65536));
   public static final diw.e<diw.d> A = a("maxCommandForkCount", diw.b.g, diw.d.a(65536));
   public static final diw.e<diw.d> B = a("commandModificationBlockLimit", diw.b.g, diw.d.a(32768));
   public static final diw.e<diw.a> C = a("announceAdvancements", diw.b.f, diw.a.a(true));
   public static final diw.e<diw.a> D = a("disableRaids", diw.b.b, diw.a.a(false));
   public static final diw.e<diw.a> E = a("doInsomnia", diw.b.c, diw.a.a(true));
   public static final diw.e<diw.a> F = a("doImmediateRespawn", diw.b.a, diw.a.a(false, ($$0, $$1) -> {
      for (arr $$2 : $$0.ag().t()) {
         $$2.f.b(new adb(adb.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final diw.e<diw.d> G = a("playersNetherPortalDefaultDelay", diw.b.a, diw.d.a(80));
   public static final diw.e<diw.d> H = a("playersNetherPortalCreativeDelay", diw.b.a, diw.d.a(0));
   public static final diw.e<diw.a> I = a("drowningDamage", diw.b.a, diw.a.a(true));
   public static final diw.e<diw.a> J = a("fallDamage", diw.b.a, diw.a.a(true));
   public static final diw.e<diw.a> K = a("fireDamage", diw.b.a, diw.a.a(true));
   public static final diw.e<diw.a> L = a("freezeDamage", diw.b.a, diw.a.a(true));
   public static final diw.e<diw.a> M = a("doPatrolSpawning", diw.b.c, diw.a.a(true));
   public static final diw.e<diw.a> N = a("doTraderSpawning", diw.b.c, diw.a.a(true));
   public static final diw.e<diw.a> O = a("doWardenSpawning", diw.b.c, diw.a.a(true));
   public static final diw.e<diw.a> P = a("forgiveDeadPlayers", diw.b.b, diw.a.a(true));
   public static final diw.e<diw.a> Q = a("universalAnger", diw.b.b, diw.a.a(false));
   public static final diw.e<diw.d> R = a("playersSleepingPercentage", diw.b.a, diw.d.a(100));
   public static final diw.e<diw.a> S = a("blockExplosionDropDecay", diw.b.d, diw.a.a(true));
   public static final diw.e<diw.a> T = a("mobExplosionDropDecay", diw.b.d, diw.a.a(true));
   public static final diw.e<diw.a> U = a("tntExplosionDropDecay", diw.b.d, diw.a.a(false));
   public static final diw.e<diw.d> V = a("snowAccumulationHeight", diw.b.e, diw.d.a(1));
   public static final diw.e<diw.a> W = a("waterSourceConversion", diw.b.e, diw.a.a(true));
   public static final diw.e<diw.a> X = a("lavaSourceConversion", diw.b.e, diw.a.a(false));
   public static final diw.e<diw.a> Y = a("globalSoundEvents", diw.b.g, diw.a.a(true));
   public static final diw.e<diw.a> Z = a("doVinesSpread", diw.b.e, diw.a.a(true));
   public static final diw.e<diw.a> aa = a("enderPearlsVanishOnDeath", diw.b.a, diw.a.a(true));
   public static final diw.e<diw.d> ab = a("minecartMaxSpeed", diw.b.g, diw.d.a(8, 1, 1000, cum.a(cuo.d), ($$0, $$1) -> {
   }));
   public static final diw.e<diw.d> ac = a("spawnChunkRadius", diw.b.g, diw.d.a(2, 0, 32, cum.a(), ($$0, $$1) -> {
      arq $$2 = $$0.J();
      $$2.a($$2.aa(), $$2.ab());
   }));
   private final Map<diw.e<?>, diw.g<?>> af;
   private final cum ag;

   public static <T extends diw.g<T>> diw.f<T> a(diw.e<T> $$0) {
      return (diw.f<T>)ae.get($$0);
   }

   public static <T extends diw.g<T>> Codec<diw.e<T>> a(Class<T> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> ae.entrySet()
                  .stream()
                  .filter($$1x -> ((diw.f)$$1x.getValue()).e == $$0)
                  .map(Entry::getKey)
                  .filter($$1x -> $$1x.a().equals($$1))
                  .map($$0xx -> $$0xx)
                  .findFirst()
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Invalid game rule ID for type: " + $$1)),
            diw.e::a
         );
   }

   private static <T extends diw.g<T>> diw.e<T> a(String $$0, diw.b $$1, diw.f<T> $$2) {
      diw.e<T> $$3 = new diw.e<>($$0, $$1);
      diw.f<?> $$4 = ae.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public diw(cum $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public diw(cum $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((diw.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<diw.e<?>, diw.f<?>>> b(cum $$0) {
      return ae.entrySet().stream().filter($$1 -> $$1.getValue().f.a($$0));
   }

   private diw(Map<diw.e<?>, diw.g<?>> $$0, cum $$1) {
      this.af = $$0;
      this.ag = $$1;
   }

   public <T extends diw.g<T>> T b(diw.e<T> $$0) {
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

   public diw a(cum $$0) {
      return new diw(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.af.containsKey($$0x.getKey()) ? this.af.get($$0x.getKey()) : ((diw.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(diw.c $$0) {
      ae.forEach(($$1, $$2) -> this.a($$0, (diw.e<?>)$$1, (diw.f<?>)$$2));
   }

   private <T extends diw.g<T>> void a(diw.c $$0, diw.e<?> $$1, diw.f<?> $$2) {
      if ($$2.f.a(this.ag)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(diw $$0, @Nullable MinecraftServer $$1) {
      $$0.af.keySet().forEach($$2 -> this.a((diw.e<?>)$$2, $$0, $$1));
   }

   private <T extends diw.g<T>> void a(diw.e<T> $$0, diw $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.b($$0);
      this.<T>b($$0).a($$3, $$2);
   }

   public boolean c(diw.e<diw.a> $$0) {
      return this.b($$0).a();
   }

   public int d(diw.e<diw.d> $$0) {
      return this.b($$0).a();
   }

   public static class a extends diw.g<diw.a> {
      private boolean b;

      static diw.f<diw.a> a(boolean $$0, BiConsumer<MinecraftServer, diw.a> $$1) {
         return new diw.f<>(BoolArgumentType::bool, $$1x -> new diw.a($$1x, $$0), $$1, diw.c::b, diw.a.class, cum.a());
      }

      static diw.f<diw.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(diw.f<diw.a> $$0, boolean $$1) {
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

      protected diw.a d() {
         return this;
      }

      protected diw.a e() {
         return new diw.a(this.a, this.b);
      }

      public void a(diw.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends diw.g<T>> void a(diw.e<T> $$0, diw.f<T> $$1) {
      }

      default void b(diw.e<diw.a> $$0, diw.f<diw.a> $$1) {
      }

      default void c(diw.e<diw.d> $$0, diw.f<diw.d> $$1) {
      }
   }

   public static class d extends diw.g<diw.d> {
      private int b;

      private static diw.f<diw.d> a(int $$0, BiConsumer<MinecraftServer, diw.d> $$1) {
         return new diw.f<>(IntegerArgumentType::integer, $$1x -> new diw.d($$1x, $$0), $$1, diw.c::c, diw.d.class, cum.a());
      }

      static diw.f<diw.d> a(int $$0, int $$1, int $$2, cum $$3, BiConsumer<MinecraftServer, diw.d> $$4) {
         return new diw.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new diw.d($$1x, $$0), $$4, diw.c::c, diw.d.class, $$3);
      }

      static diw.f<diw.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(diw.f<diw.d> $$0, int $$1) {
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
               diw.ad.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected diw.d d() {
         return this;
      }

      protected diw.d e() {
         return new diw.d(this.a, this.b);
      }

      public void a(diw.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends diw.g<T>> {
      final String a;
      private final diw.b b;

      public e(String $$0, diw.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof diw.e && ((diw.e)$$0).a.equals(this.a);
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

      public diw.b c() {
         return this.b;
      }
   }

   public static class f<T extends diw.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<diw.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final diw.h<T> d;
      final Class<T> e;
      final cum f;

      f(Supplier<ArgumentType<?>> $$0, Function<diw.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, diw.h<T> $$3, Class<T> $$4, cum $$5) {
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

      public void a(diw.c $$0, diw.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cum b() {
         return this.f;
      }
   }

   public abstract static class g<T extends diw.g<T>> {
      protected final diw.f<T> a;

      public g(diw.f<T> $$0) {
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

   interface h<T extends diw.g<T>> {
      void call(diw.c var1, diw.e<T> var2, diw.f<T> var3);
   }
}
