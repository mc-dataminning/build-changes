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

public class dkf {
   public static final int a = 3;
   static final Logger ae = LogUtils.getLogger();
   private static final Map<dkf.e<?>, dkf.f<?>> af = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dkf.e<dkf.a> b = a("doFireTick", dkf.b.e, dkf.a.a(true));
   public static final dkf.e<dkf.a> c = a("allowFireTicksAwayFromPlayer", dkf.b.e, dkf.a.a(false));
   public static final dkf.e<dkf.a> d = a("mobGriefing", dkf.b.b, dkf.a.a(true));
   public static final dkf.e<dkf.a> e = a("keepInventory", dkf.b.a, dkf.a.a(false));
   public static final dkf.e<dkf.a> f = a("doMobSpawning", dkf.b.c, dkf.a.a(true));
   public static final dkf.e<dkf.a> g = a("doMobLoot", dkf.b.d, dkf.a.a(true));
   public static final dkf.e<dkf.a> h = a("projectilesCanBreakBlocks", dkf.b.d, dkf.a.a(true));
   public static final dkf.e<dkf.a> i = a("doTileDrops", dkf.b.d, dkf.a.a(true));
   public static final dkf.e<dkf.a> j = a("doEntityDrops", dkf.b.d, dkf.a.a(true));
   public static final dkf.e<dkf.a> k = a("commandBlockOutput", dkf.b.f, dkf.a.a(true));
   public static final dkf.e<dkf.a> l = a("naturalRegeneration", dkf.b.a, dkf.a.a(true));
   public static final dkf.e<dkf.a> m = a("doDaylightCycle", dkf.b.e, dkf.a.a(true));
   public static final dkf.e<dkf.a> n = a("logAdminCommands", dkf.b.f, dkf.a.a(true));
   public static final dkf.e<dkf.a> o = a("showDeathMessages", dkf.b.f, dkf.a.a(true));
   public static final dkf.e<dkf.d> p = a("randomTickSpeed", dkf.b.e, dkf.d.a(3));
   public static final dkf.e<dkf.a> q = a("sendCommandFeedback", dkf.b.f, dkf.a.a(true));
   public static final dkf.e<dkf.a> r = a("reducedDebugInfo", dkf.b.g, dkf.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (asc $$3 : $$0.ag().t()) {
         $$3.f.b(new adi($$3, $$2));
      }
   }));
   public static final dkf.e<dkf.a> s = a("spectatorsGenerateChunks", dkf.b.a, dkf.a.a(true));
   public static final dkf.e<dkf.d> t = a("spawnRadius", dkf.b.a, dkf.d.a(10));
   public static final dkf.e<dkf.a> u = a("disablePlayerMovementCheck", dkf.b.a, dkf.a.a(false));
   public static final dkf.e<dkf.a> v = a("disableElytraMovementCheck", dkf.b.a, dkf.a.a(false));
   public static final dkf.e<dkf.d> w = a("maxEntityCramming", dkf.b.b, dkf.d.a(24));
   public static final dkf.e<dkf.a> x = a("doWeatherCycle", dkf.b.e, dkf.a.a(true));
   public static final dkf.e<dkf.a> y = a("doLimitedCrafting", dkf.b.a, dkf.a.a(false, ($$0, $$1) -> {
      for (asc $$2 : $$0.ag().t()) {
         $$2.f.b(new adm(adm.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dkf.e<dkf.d> z = a("maxCommandChainLength", dkf.b.g, dkf.d.a(65536));
   public static final dkf.e<dkf.d> A = a("maxCommandForkCount", dkf.b.g, dkf.d.a(65536));
   public static final dkf.e<dkf.d> B = a("commandModificationBlockLimit", dkf.b.g, dkf.d.a(32768));
   public static final dkf.e<dkf.a> C = a("announceAdvancements", dkf.b.f, dkf.a.a(true));
   public static final dkf.e<dkf.a> D = a("disableRaids", dkf.b.b, dkf.a.a(false));
   public static final dkf.e<dkf.a> E = a("doInsomnia", dkf.b.c, dkf.a.a(true));
   public static final dkf.e<dkf.a> F = a("doImmediateRespawn", dkf.b.a, dkf.a.a(false, ($$0, $$1) -> {
      for (asc $$2 : $$0.ag().t()) {
         $$2.f.b(new adm(adm.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dkf.e<dkf.d> G = a("playersNetherPortalDefaultDelay", dkf.b.a, dkf.d.a(80));
   public static final dkf.e<dkf.d> H = a("playersNetherPortalCreativeDelay", dkf.b.a, dkf.d.a(0));
   public static final dkf.e<dkf.a> I = a("drowningDamage", dkf.b.a, dkf.a.a(true));
   public static final dkf.e<dkf.a> J = a("fallDamage", dkf.b.a, dkf.a.a(true));
   public static final dkf.e<dkf.a> K = a("fireDamage", dkf.b.a, dkf.a.a(true));
   public static final dkf.e<dkf.a> L = a("freezeDamage", dkf.b.a, dkf.a.a(true));
   public static final dkf.e<dkf.a> M = a("doPatrolSpawning", dkf.b.c, dkf.a.a(true));
   public static final dkf.e<dkf.a> N = a("doTraderSpawning", dkf.b.c, dkf.a.a(true));
   public static final dkf.e<dkf.a> O = a("doWardenSpawning", dkf.b.c, dkf.a.a(true));
   public static final dkf.e<dkf.a> P = a("forgiveDeadPlayers", dkf.b.b, dkf.a.a(true));
   public static final dkf.e<dkf.a> Q = a("universalAnger", dkf.b.b, dkf.a.a(false));
   public static final dkf.e<dkf.d> R = a("playersSleepingPercentage", dkf.b.a, dkf.d.a(100));
   public static final dkf.e<dkf.a> S = a("blockExplosionDropDecay", dkf.b.d, dkf.a.a(true));
   public static final dkf.e<dkf.a> T = a("mobExplosionDropDecay", dkf.b.d, dkf.a.a(true));
   public static final dkf.e<dkf.a> U = a("tntExplosionDropDecay", dkf.b.d, dkf.a.a(false));
   public static final dkf.e<dkf.d> V = a("snowAccumulationHeight", dkf.b.e, dkf.d.a(1));
   public static final dkf.e<dkf.a> W = a("waterSourceConversion", dkf.b.e, dkf.a.a(true));
   public static final dkf.e<dkf.a> X = a("lavaSourceConversion", dkf.b.e, dkf.a.a(false));
   public static final dkf.e<dkf.a> Y = a("globalSoundEvents", dkf.b.g, dkf.a.a(true));
   public static final dkf.e<dkf.a> Z = a("doVinesSpread", dkf.b.e, dkf.a.a(true));
   public static final dkf.e<dkf.a> aa = a("enderPearlsVanishOnDeath", dkf.b.a, dkf.a.a(true));
   public static final dkf.e<dkf.d> ab = a("minecartMaxSpeed", dkf.b.g, dkf.d.a(8, 1, 1000, cvs.a(cvu.d), ($$0, $$1) -> {
   }));
   public static final dkf.e<dkf.d> ac = a("spawnChunkRadius", dkf.b.g, dkf.d.a(2, 0, 32, cvs.a(), ($$0, $$1) -> {
      asb $$2 = $$0.J();
      $$2.a($$2.aa(), $$2.ab());
   }));
   public static final dkf.e<dkf.a> ad = a("tntExplodes", dkf.b.g, dkf.a.a(true));
   private final Map<dkf.e<?>, dkf.g<?>> ag;
   private final cvs ah;

   public static <T extends dkf.g<T>> dkf.f<T> a(dkf.e<T> $$0) {
      return (dkf.f<T>)af.get($$0);
   }

   public static <T extends dkf.g<T>> Codec<dkf.e<T>> a(Class<T> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> af.entrySet()
                  .stream()
                  .filter($$1x -> ((dkf.f)$$1x.getValue()).e == $$0)
                  .map(Entry::getKey)
                  .filter($$1x -> $$1x.a().equals($$1))
                  .map($$0xx -> $$0xx)
                  .findFirst()
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Invalid game rule ID for type: " + $$1)),
            dkf.e::a
         );
   }

   private static <T extends dkf.g<T>> dkf.e<T> a(String $$0, dkf.b $$1, dkf.f<T> $$2) {
      dkf.e<T> $$3 = new dkf.e<>($$0, $$1);
      dkf.f<?> $$4 = af.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dkf(cvs $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dkf(cvs $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dkf.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dkf.e<?>, dkf.f<?>>> b(cvs $$0) {
      return af.entrySet().stream().filter($$1 -> $$1.getValue().f.a($$0));
   }

   private dkf(Map<dkf.e<?>, dkf.g<?>> $$0, cvs $$1) {
      this.ag = $$0;
      this.ah = $$1;
   }

   public <T extends dkf.g<T>> T b(dkf.e<T> $$0) {
      T $$1 = (T)this.ag.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public ua a() {
      ua $$0 = new ua();
      this.ag.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ag.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dkf a(cvs $$0) {
      return new dkf(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ag.containsKey($$0x.getKey()) ? this.ag.get($$0x.getKey()) : ((dkf.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dkf.c $$0) {
      af.forEach(($$1, $$2) -> this.a($$0, (dkf.e<?>)$$1, (dkf.f<?>)$$2));
   }

   private <T extends dkf.g<T>> void a(dkf.c $$0, dkf.e<?> $$1, dkf.f<?> $$2) {
      if ($$2.f.a(this.ah)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dkf $$0, @Nullable MinecraftServer $$1) {
      $$0.ag.keySet().forEach($$2 -> this.a((dkf.e<?>)$$2, $$0, $$1));
   }

   private <T extends dkf.g<T>> void a(dkf.e<T> $$0, dkf $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.b($$0);
      this.<T>b($$0).a($$3, $$2);
   }

   public boolean c(dkf.e<dkf.a> $$0) {
      return this.b($$0).a();
   }

   public int d(dkf.e<dkf.d> $$0) {
      return this.b($$0).a();
   }

   public static class a extends dkf.g<dkf.a> {
      private boolean b;

      static dkf.f<dkf.a> a(boolean $$0, BiConsumer<MinecraftServer, dkf.a> $$1) {
         return new dkf.f<>(BoolArgumentType::bool, $$1x -> new dkf.a($$1x, $$0), $$1, dkf.c::b, dkf.a.class, cvs.a());
      }

      static dkf.f<dkf.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dkf.f<dkf.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ek> $$0, String $$1) {
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

      protected dkf.a d() {
         return this;
      }

      protected dkf.a e() {
         return new dkf.a(this.a, this.b);
      }

      public void a(dkf.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dkf.g<T>> void a(dkf.e<T> $$0, dkf.f<T> $$1) {
      }

      default void b(dkf.e<dkf.a> $$0, dkf.f<dkf.a> $$1) {
      }

      default void c(dkf.e<dkf.d> $$0, dkf.f<dkf.d> $$1) {
      }
   }

   public static class d extends dkf.g<dkf.d> {
      private int b;

      private static dkf.f<dkf.d> a(int $$0, BiConsumer<MinecraftServer, dkf.d> $$1) {
         return new dkf.f<>(IntegerArgumentType::integer, $$1x -> new dkf.d($$1x, $$0), $$1, dkf.c::c, dkf.d.class, cvs.a());
      }

      static dkf.f<dkf.d> a(int $$0, int $$1, int $$2, cvs $$3, BiConsumer<MinecraftServer, dkf.d> $$4) {
         return new dkf.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dkf.d($$1x, $$0), $$4, dkf.c::c, dkf.d.class, $$3);
      }

      static dkf.f<dkf.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dkf.f<dkf.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ek> $$0, String $$1) {
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
               dkf.ae.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dkf.d d() {
         return this;
      }

      protected dkf.d e() {
         return new dkf.d(this.a, this.b);
      }

      public void a(dkf.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dkf.g<T>> {
      final String a;
      private final dkf.b b;

      public e(String $$0, dkf.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dkf.e && ((dkf.e)$$0).a.equals(this.a);
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

      public dkf.b c() {
         return this.b;
      }
   }

   public static class f<T extends dkf.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dkf.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dkf.h<T> d;
      final Class<T> e;
      final cvs f;

      f(Supplier<ArgumentType<?>> $$0, Function<dkf.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dkf.h<T> $$3, Class<T> $$4, cvs $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      public RequiredArgumentBuilder<ek, ?> a(String $$0) {
         return el.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dkf.c $$0, dkf.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cvs b() {
         return this.f;
      }
   }

   public abstract static class g<T extends dkf.g<T>> {
      protected final dkf.f<T> a;

      public g(dkf.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ek> var1, String var2);

      public void b(CommandContext<ek> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ek)$$0.getSource()).l());
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

   interface h<T extends dkf.g<T>> {
      void call(dkf.c var1, dkf.e<T> var2, dkf.f<T> var3);
   }
}
