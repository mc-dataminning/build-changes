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

public class ddo {
   public static final int a = 3;
   static final Logger ab = LogUtils.getLogger();
   private static final Map<ddo.e<?>, ddo.f<?>> ac = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final ddo.e<ddo.a> b = a("doFireTick", ddo.b.e, ddo.a.a(true));
   public static final ddo.e<ddo.a> c = a("mobGriefing", ddo.b.b, ddo.a.a(true));
   public static final ddo.e<ddo.a> d = a("keepInventory", ddo.b.a, ddo.a.a(false));
   public static final ddo.e<ddo.a> e = a("doMobSpawning", ddo.b.c, ddo.a.a(true));
   public static final ddo.e<ddo.a> f = a("doMobLoot", ddo.b.d, ddo.a.a(true));
   public static final ddo.e<ddo.a> g = a("projectilesCanBreakBlocks", ddo.b.d, ddo.a.a(true));
   public static final ddo.e<ddo.a> h = a("doTileDrops", ddo.b.d, ddo.a.a(true));
   public static final ddo.e<ddo.a> i = a("doEntityDrops", ddo.b.d, ddo.a.a(true));
   public static final ddo.e<ddo.a> j = a("commandBlockOutput", ddo.b.f, ddo.a.a(true));
   public static final ddo.e<ddo.a> k = a("naturalRegeneration", ddo.b.a, ddo.a.a(true));
   public static final ddo.e<ddo.a> l = a("doDaylightCycle", ddo.b.e, ddo.a.a(true));
   public static final ddo.e<ddo.a> m = a("logAdminCommands", ddo.b.f, ddo.a.a(true));
   public static final ddo.e<ddo.a> n = a("showDeathMessages", ddo.b.f, ddo.a.a(true));
   public static final ddo.e<ddo.d> o = a("randomTickSpeed", ddo.b.e, ddo.d.a(3));
   public static final ddo.e<ddo.a> p = a("sendCommandFeedback", ddo.b.f, ddo.a.a(true));
   public static final ddo.e<ddo.a> q = a("reducedDebugInfo", ddo.b.g, ddo.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arh $$3 : $$0.ag().t()) {
         $$3.c.b(new add($$3, $$2));
      }
   }));
   public static final ddo.e<ddo.a> r = a("spectatorsGenerateChunks", ddo.b.a, ddo.a.a(true));
   public static final ddo.e<ddo.d> s = a("spawnRadius", ddo.b.a, ddo.d.a(10));
   public static final ddo.e<ddo.a> t = a("disableElytraMovementCheck", ddo.b.a, ddo.a.a(false));
   public static final ddo.e<ddo.d> u = a("maxEntityCramming", ddo.b.b, ddo.d.a(24));
   public static final ddo.e<ddo.a> v = a("doWeatherCycle", ddo.b.e, ddo.a.a(true));
   public static final ddo.e<ddo.a> w = a("doLimitedCrafting", ddo.b.a, ddo.a.a(false, ($$0, $$1) -> {
      for (arh $$2 : $$0.ag().t()) {
         $$2.c.b(new adg(adg.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final ddo.e<ddo.d> x = a("maxCommandChainLength", ddo.b.g, ddo.d.a(65536));
   public static final ddo.e<ddo.d> y = a("maxCommandForkCount", ddo.b.g, ddo.d.a(65536));
   public static final ddo.e<ddo.d> z = a("commandModificationBlockLimit", ddo.b.g, ddo.d.a(32768));
   public static final ddo.e<ddo.a> A = a("announceAdvancements", ddo.b.f, ddo.a.a(true));
   public static final ddo.e<ddo.a> B = a("disableRaids", ddo.b.b, ddo.a.a(false));
   public static final ddo.e<ddo.a> C = a("doInsomnia", ddo.b.c, ddo.a.a(true));
   public static final ddo.e<ddo.a> D = a("doImmediateRespawn", ddo.b.a, ddo.a.a(false, ($$0, $$1) -> {
      for (arh $$2 : $$0.ag().t()) {
         $$2.c.b(new adg(adg.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final ddo.e<ddo.d> E = a("playersNetherPortalDefaultDelay", ddo.b.a, ddo.d.a(80));
   public static final ddo.e<ddo.d> F = a("playersNetherPortalCreativeDelay", ddo.b.a, ddo.d.a(0));
   public static final ddo.e<ddo.a> G = a("drowningDamage", ddo.b.a, ddo.a.a(true));
   public static final ddo.e<ddo.a> H = a("fallDamage", ddo.b.a, ddo.a.a(true));
   public static final ddo.e<ddo.a> I = a("fireDamage", ddo.b.a, ddo.a.a(true));
   public static final ddo.e<ddo.a> J = a("freezeDamage", ddo.b.a, ddo.a.a(true));
   public static final ddo.e<ddo.a> K = a("doPatrolSpawning", ddo.b.c, ddo.a.a(true));
   public static final ddo.e<ddo.a> L = a("doTraderSpawning", ddo.b.c, ddo.a.a(true));
   public static final ddo.e<ddo.a> M = a("doWardenSpawning", ddo.b.c, ddo.a.a(true));
   public static final ddo.e<ddo.a> N = a("forgiveDeadPlayers", ddo.b.b, ddo.a.a(true));
   public static final ddo.e<ddo.a> O = a("universalAnger", ddo.b.b, ddo.a.a(false));
   public static final ddo.e<ddo.d> P = a("playersSleepingPercentage", ddo.b.a, ddo.d.a(100));
   public static final ddo.e<ddo.a> Q = a("blockExplosionDropDecay", ddo.b.d, ddo.a.a(true));
   public static final ddo.e<ddo.a> R = a("mobExplosionDropDecay", ddo.b.d, ddo.a.a(true));
   public static final ddo.e<ddo.a> S = a("tntExplosionDropDecay", ddo.b.d, ddo.a.a(false));
   public static final ddo.e<ddo.d> T = a("snowAccumulationHeight", ddo.b.e, ddo.d.a(1));
   public static final ddo.e<ddo.a> U = a("waterSourceConversion", ddo.b.e, ddo.a.a(true));
   public static final ddo.e<ddo.a> V = a("lavaSourceConversion", ddo.b.e, ddo.a.a(false));
   public static final ddo.e<ddo.a> W = a("globalSoundEvents", ddo.b.g, ddo.a.a(true));
   public static final ddo.e<ddo.a> X = a("doVinesSpread", ddo.b.e, ddo.a.a(true));
   public static final ddo.e<ddo.a> Y = a("enderPearlsVanishOnDeath", ddo.b.a, ddo.a.a(true));
   public static final ddo.e<ddo.d> Z = a("minecartMaxSpeed", ddo.b.g, ddo.d.a(8, 1, 1000, cqh.a(cqj.e), ($$0, $$1) -> {
   }));
   public static final ddo.e<ddo.d> aa = a("spawnChunkRadius", ddo.b.g, ddo.d.a(2, 0, 32, cqh.a(), ($$0, $$1) -> {
      arg $$2 = $$0.J();
      $$2.a($$2.W(), $$2.X());
   }));
   private final Map<ddo.e<?>, ddo.g<?>> ad;
   private final cqh ae;

   private static <T extends ddo.g<T>> ddo.e<T> a(String $$0, ddo.b $$1, ddo.f<T> $$2) {
      ddo.e<T> $$3 = new ddo.e<>($$0, $$1);
      ddo.f<?> $$4 = ac.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public ddo(cqh $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public ddo(cqh $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((ddo.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<ddo.e<?>, ddo.f<?>>> b(cqh $$0) {
      return ac.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private ddo(Map<ddo.e<?>, ddo.g<?>> $$0, cqh $$1) {
      this.ad = $$0;
      this.ae = $$1;
   }

   public <T extends ddo.g<T>> T a(ddo.e<T> $$0) {
      T $$1 = (T)this.ad.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public uf a() {
      uf $$0 = new uf();
      this.ad.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ad.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public ddo a(cqh $$0) {
      return new ddo(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ad.containsKey($$0x.getKey()) ? this.ad.get($$0x.getKey()) : ((ddo.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(ddo.c $$0) {
      ac.forEach(($$1, $$2) -> this.a($$0, (ddo.e<?>)$$1, (ddo.f<?>)$$2));
   }

   private <T extends ddo.g<T>> void a(ddo.c $$0, ddo.e<?> $$1, ddo.f<?> $$2) {
      if ($$2.e.a(this.ae)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(ddo $$0, @Nullable MinecraftServer $$1) {
      $$0.ad.keySet().forEach($$2 -> this.a((ddo.e<?>)$$2, $$0, $$1));
   }

   private <T extends ddo.g<T>> void a(ddo.e<T> $$0, ddo $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(ddo.e<ddo.a> $$0) {
      return this.a($$0).a();
   }

   public int c(ddo.e<ddo.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends ddo.g<ddo.a> {
      private boolean b;

      static ddo.f<ddo.a> a(boolean $$0, BiConsumer<MinecraftServer, ddo.a> $$1) {
         return new ddo.f<>(BoolArgumentType::bool, $$1x -> new ddo.a($$1x, $$0), $$1, ddo.c::b, cqh.a());
      }

      static ddo.f<ddo.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(ddo.f<ddo.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<et> $$0, String $$1) {
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

      protected ddo.a d() {
         return this;
      }

      protected ddo.a e() {
         return new ddo.a(this.a, this.b);
      }

      public void a(ddo.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends ddo.g<T>> void a(ddo.e<T> $$0, ddo.f<T> $$1) {
      }

      default void b(ddo.e<ddo.a> $$0, ddo.f<ddo.a> $$1) {
      }

      default void c(ddo.e<ddo.d> $$0, ddo.f<ddo.d> $$1) {
      }
   }

   public static class d extends ddo.g<ddo.d> {
      private int b;

      private static ddo.f<ddo.d> a(int $$0, BiConsumer<MinecraftServer, ddo.d> $$1) {
         return new ddo.f<>(IntegerArgumentType::integer, $$1x -> new ddo.d($$1x, $$0), $$1, ddo.c::c, cqh.a());
      }

      static ddo.f<ddo.d> a(int $$0, int $$1, int $$2, cqh $$3, BiConsumer<MinecraftServer, ddo.d> $$4) {
         return new ddo.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new ddo.d($$1x, $$0), $$4, ddo.c::c, $$3);
      }

      static ddo.f<ddo.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(ddo.f<ddo.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<et> $$0, String $$1) {
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
               ddo.ab.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected ddo.d d() {
         return this;
      }

      protected ddo.d e() {
         return new ddo.d(this.a, this.b);
      }

      public void a(ddo.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends ddo.g<T>> {
      final String a;
      private final ddo.b b;

      public e(String $$0, ddo.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof ddo.e && ((ddo.e)$$0).a.equals(this.a);
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

      public ddo.b c() {
         return this.b;
      }
   }

   public static class f<T extends ddo.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<ddo.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final ddo.h<T> d;
      final cqh e;

      f(Supplier<ArgumentType<?>> $$0, Function<ddo.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, ddo.h<T> $$3, cqh $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public RequiredArgumentBuilder<et, ?> a(String $$0) {
         return eu.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(ddo.c $$0, ddo.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cqh b() {
         return this.e;
      }
   }

   public abstract static class g<T extends ddo.g<T>> {
      protected final ddo.f<T> a;

      public g(ddo.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<et> var1, String var2);

      public void b(CommandContext<et> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((et)$$0.getSource()).l());
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

   interface h<T extends ddo.g<T>> {
      void call(ddo.c var1, ddo.e<T> var2, ddo.f<T> var3);
   }
}
