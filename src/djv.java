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

public class djv {
   public static final int a = 3;
   static final Logger ae = LogUtils.getLogger();
   private static final Map<djv.e<?>, djv.f<?>> af = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final djv.e<djv.a> b = a("doFireTick", djv.b.e, djv.a.a(true));
   public static final djv.e<djv.a> c = a("allowFireTicksAwayFromPlayer", djv.b.e, djv.a.a(false));
   public static final djv.e<djv.a> d = a("mobGriefing", djv.b.b, djv.a.a(true));
   public static final djv.e<djv.a> e = a("keepInventory", djv.b.a, djv.a.a(false));
   public static final djv.e<djv.a> f = a("doMobSpawning", djv.b.c, djv.a.a(true));
   public static final djv.e<djv.a> g = a("doMobLoot", djv.b.d, djv.a.a(true));
   public static final djv.e<djv.a> h = a("projectilesCanBreakBlocks", djv.b.d, djv.a.a(true));
   public static final djv.e<djv.a> i = a("doTileDrops", djv.b.d, djv.a.a(true));
   public static final djv.e<djv.a> j = a("doEntityDrops", djv.b.d, djv.a.a(true));
   public static final djv.e<djv.a> k = a("commandBlockOutput", djv.b.f, djv.a.a(true));
   public static final djv.e<djv.a> l = a("naturalRegeneration", djv.b.a, djv.a.a(true));
   public static final djv.e<djv.a> m = a("doDaylightCycle", djv.b.e, djv.a.a(true));
   public static final djv.e<djv.a> n = a("logAdminCommands", djv.b.f, djv.a.a(true));
   public static final djv.e<djv.a> o = a("showDeathMessages", djv.b.f, djv.a.a(true));
   public static final djv.e<djv.d> p = a("randomTickSpeed", djv.b.e, djv.d.a(3));
   public static final djv.e<djv.a> q = a("sendCommandFeedback", djv.b.f, djv.a.a(true));
   public static final djv.e<djv.a> r = a("reducedDebugInfo", djv.b.g, djv.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arv $$3 : $$0.ag().t()) {
         $$3.f.b(new adb($$3, $$2));
      }
   }));
   public static final djv.e<djv.a> s = a("spectatorsGenerateChunks", djv.b.a, djv.a.a(true));
   public static final djv.e<djv.d> t = a("spawnRadius", djv.b.a, djv.d.a(10));
   public static final djv.e<djv.a> u = a("disablePlayerMovementCheck", djv.b.a, djv.a.a(false));
   public static final djv.e<djv.a> v = a("disableElytraMovementCheck", djv.b.a, djv.a.a(false));
   public static final djv.e<djv.d> w = a("maxEntityCramming", djv.b.b, djv.d.a(24));
   public static final djv.e<djv.a> x = a("doWeatherCycle", djv.b.e, djv.a.a(true));
   public static final djv.e<djv.a> y = a("doLimitedCrafting", djv.b.a, djv.a.a(false, ($$0, $$1) -> {
      for (arv $$2 : $$0.ag().t()) {
         $$2.f.b(new adf(adf.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final djv.e<djv.d> z = a("maxCommandChainLength", djv.b.g, djv.d.a(65536));
   public static final djv.e<djv.d> A = a("maxCommandForkCount", djv.b.g, djv.d.a(65536));
   public static final djv.e<djv.d> B = a("commandModificationBlockLimit", djv.b.g, djv.d.a(32768));
   public static final djv.e<djv.a> C = a("announceAdvancements", djv.b.f, djv.a.a(true));
   public static final djv.e<djv.a> D = a("disableRaids", djv.b.b, djv.a.a(false));
   public static final djv.e<djv.a> E = a("doInsomnia", djv.b.c, djv.a.a(true));
   public static final djv.e<djv.a> F = a("doImmediateRespawn", djv.b.a, djv.a.a(false, ($$0, $$1) -> {
      for (arv $$2 : $$0.ag().t()) {
         $$2.f.b(new adf(adf.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final djv.e<djv.d> G = a("playersNetherPortalDefaultDelay", djv.b.a, djv.d.a(80));
   public static final djv.e<djv.d> H = a("playersNetherPortalCreativeDelay", djv.b.a, djv.d.a(0));
   public static final djv.e<djv.a> I = a("drowningDamage", djv.b.a, djv.a.a(true));
   public static final djv.e<djv.a> J = a("fallDamage", djv.b.a, djv.a.a(true));
   public static final djv.e<djv.a> K = a("fireDamage", djv.b.a, djv.a.a(true));
   public static final djv.e<djv.a> L = a("freezeDamage", djv.b.a, djv.a.a(true));
   public static final djv.e<djv.a> M = a("doPatrolSpawning", djv.b.c, djv.a.a(true));
   public static final djv.e<djv.a> N = a("doTraderSpawning", djv.b.c, djv.a.a(true));
   public static final djv.e<djv.a> O = a("doWardenSpawning", djv.b.c, djv.a.a(true));
   public static final djv.e<djv.a> P = a("forgiveDeadPlayers", djv.b.b, djv.a.a(true));
   public static final djv.e<djv.a> Q = a("universalAnger", djv.b.b, djv.a.a(false));
   public static final djv.e<djv.d> R = a("playersSleepingPercentage", djv.b.a, djv.d.a(100));
   public static final djv.e<djv.a> S = a("blockExplosionDropDecay", djv.b.d, djv.a.a(true));
   public static final djv.e<djv.a> T = a("mobExplosionDropDecay", djv.b.d, djv.a.a(true));
   public static final djv.e<djv.a> U = a("tntExplosionDropDecay", djv.b.d, djv.a.a(false));
   public static final djv.e<djv.d> V = a("snowAccumulationHeight", djv.b.e, djv.d.a(1));
   public static final djv.e<djv.a> W = a("waterSourceConversion", djv.b.e, djv.a.a(true));
   public static final djv.e<djv.a> X = a("lavaSourceConversion", djv.b.e, djv.a.a(false));
   public static final djv.e<djv.a> Y = a("globalSoundEvents", djv.b.g, djv.a.a(true));
   public static final djv.e<djv.a> Z = a("doVinesSpread", djv.b.e, djv.a.a(true));
   public static final djv.e<djv.a> aa = a("enderPearlsVanishOnDeath", djv.b.a, djv.a.a(true));
   public static final djv.e<djv.d> ab = a("minecartMaxSpeed", djv.b.g, djv.d.a(8, 1, 1000, cvj.a(cvl.d), ($$0, $$1) -> {
   }));
   public static final djv.e<djv.d> ac = a("spawnChunkRadius", djv.b.g, djv.d.a(2, 0, 32, cvj.a(), ($$0, $$1) -> {
      aru $$2 = $$0.J();
      $$2.a($$2.aa(), $$2.ab());
   }));
   public static final djv.e<djv.a> ad = a("tntExplodes", djv.b.g, djv.a.a(true));
   private final Map<djv.e<?>, djv.g<?>> ag;
   private final cvj ah;

   public static <T extends djv.g<T>> djv.f<T> a(djv.e<T> $$0) {
      return (djv.f<T>)af.get($$0);
   }

   public static <T extends djv.g<T>> Codec<djv.e<T>> a(Class<T> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> af.entrySet()
                  .stream()
                  .filter($$1x -> ((djv.f)$$1x.getValue()).e == $$0)
                  .map(Entry::getKey)
                  .filter($$1x -> $$1x.a().equals($$1))
                  .map($$0xx -> $$0xx)
                  .findFirst()
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Invalid game rule ID for type: " + $$1)),
            djv.e::a
         );
   }

   private static <T extends djv.g<T>> djv.e<T> a(String $$0, djv.b $$1, djv.f<T> $$2) {
      djv.e<T> $$3 = new djv.e<>($$0, $$1);
      djv.f<?> $$4 = af.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public djv(cvj $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public djv(cvj $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((djv.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<djv.e<?>, djv.f<?>>> b(cvj $$0) {
      return af.entrySet().stream().filter($$1 -> $$1.getValue().f.a($$0));
   }

   private djv(Map<djv.e<?>, djv.g<?>> $$0, cvj $$1) {
      this.ag = $$0;
      this.ah = $$1;
   }

   public <T extends djv.g<T>> T b(djv.e<T> $$0) {
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

   public djv a(cvj $$0) {
      return new djv(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ag.containsKey($$0x.getKey()) ? this.ag.get($$0x.getKey()) : ((djv.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(djv.c $$0) {
      af.forEach(($$1, $$2) -> this.a($$0, (djv.e<?>)$$1, (djv.f<?>)$$2));
   }

   private <T extends djv.g<T>> void a(djv.c $$0, djv.e<?> $$1, djv.f<?> $$2) {
      if ($$2.f.a(this.ah)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(djv $$0, @Nullable MinecraftServer $$1) {
      $$0.ag.keySet().forEach($$2 -> this.a((djv.e<?>)$$2, $$0, $$1));
   }

   private <T extends djv.g<T>> void a(djv.e<T> $$0, djv $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.b($$0);
      this.<T>b($$0).a($$3, $$2);
   }

   public boolean c(djv.e<djv.a> $$0) {
      return this.b($$0).a();
   }

   public int d(djv.e<djv.d> $$0) {
      return this.b($$0).a();
   }

   public static class a extends djv.g<djv.a> {
      private boolean b;

      static djv.f<djv.a> a(boolean $$0, BiConsumer<MinecraftServer, djv.a> $$1) {
         return new djv.f<>(BoolArgumentType::bool, $$1x -> new djv.a($$1x, $$0), $$1, djv.c::b, djv.a.class, cvj.a());
      }

      static djv.f<djv.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(djv.f<djv.a> $$0, boolean $$1) {
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

      protected djv.a d() {
         return this;
      }

      protected djv.a e() {
         return new djv.a(this.a, this.b);
      }

      public void a(djv.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends djv.g<T>> void a(djv.e<T> $$0, djv.f<T> $$1) {
      }

      default void b(djv.e<djv.a> $$0, djv.f<djv.a> $$1) {
      }

      default void c(djv.e<djv.d> $$0, djv.f<djv.d> $$1) {
      }
   }

   public static class d extends djv.g<djv.d> {
      private int b;

      private static djv.f<djv.d> a(int $$0, BiConsumer<MinecraftServer, djv.d> $$1) {
         return new djv.f<>(IntegerArgumentType::integer, $$1x -> new djv.d($$1x, $$0), $$1, djv.c::c, djv.d.class, cvj.a());
      }

      static djv.f<djv.d> a(int $$0, int $$1, int $$2, cvj $$3, BiConsumer<MinecraftServer, djv.d> $$4) {
         return new djv.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new djv.d($$1x, $$0), $$4, djv.c::c, djv.d.class, $$3);
      }

      static djv.f<djv.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(djv.f<djv.d> $$0, int $$1) {
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
               djv.ae.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected djv.d d() {
         return this;
      }

      protected djv.d e() {
         return new djv.d(this.a, this.b);
      }

      public void a(djv.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends djv.g<T>> {
      final String a;
      private final djv.b b;

      public e(String $$0, djv.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof djv.e && ((djv.e)$$0).a.equals(this.a);
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

      public djv.b c() {
         return this.b;
      }
   }

   public static class f<T extends djv.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<djv.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final djv.h<T> d;
      final Class<T> e;
      final cvj f;

      f(Supplier<ArgumentType<?>> $$0, Function<djv.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, djv.h<T> $$3, Class<T> $$4, cvj $$5) {
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

      public void a(djv.c $$0, djv.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cvj b() {
         return this.f;
      }
   }

   public abstract static class g<T extends djv.g<T>> {
      protected final djv.f<T> a;

      public g(djv.f<T> $$0) {
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

   interface h<T extends djv.g<T>> {
      void call(djv.c var1, djv.e<T> var2, djv.f<T> var3);
   }
}
