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
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class dcs {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<dcs.e<?>, dcs.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dcs.e<dcs.a> b = a("doFireTick", dcs.b.e, dcs.a.a(true));
   public static final dcs.e<dcs.a> c = a("mobGriefing", dcs.b.b, dcs.a.a(true));
   public static final dcs.e<dcs.a> d = a("keepInventory", dcs.b.a, dcs.a.a(false));
   public static final dcs.e<dcs.a> e = a("doMobSpawning", dcs.b.c, dcs.a.a(true));
   public static final dcs.e<dcs.a> f = a("doMobLoot", dcs.b.d, dcs.a.a(true));
   public static final dcs.e<dcs.a> g = a("projectilesCanBreakBlocks", dcs.b.d, dcs.a.a(true));
   public static final dcs.e<dcs.a> h = a("doTileDrops", dcs.b.d, dcs.a.a(true));
   public static final dcs.e<dcs.a> i = a("doEntityDrops", dcs.b.d, dcs.a.a(true));
   public static final dcs.e<dcs.a> j = a("commandBlockOutput", dcs.b.f, dcs.a.a(true));
   public static final dcs.e<dcs.a> k = a("naturalRegeneration", dcs.b.a, dcs.a.a(true));
   public static final dcs.e<dcs.a> l = a("doDaylightCycle", dcs.b.e, dcs.a.a(true));
   public static final dcs.e<dcs.a> m = a("logAdminCommands", dcs.b.f, dcs.a.a(true));
   public static final dcs.e<dcs.a> n = a("showDeathMessages", dcs.b.f, dcs.a.a(true));
   public static final dcs.e<dcs.d> o = a("randomTickSpeed", dcs.b.e, dcs.d.a(3));
   public static final dcs.e<dcs.a> p = a("sendCommandFeedback", dcs.b.f, dcs.a.a(true));
   public static final dcs.e<dcs.a> q = a("reducedDebugInfo", dcs.b.g, dcs.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aqv $$3 : $$0.ah().t()) {
         $$3.c.b(new acy($$3, $$2));
      }
   }));
   public static final dcs.e<dcs.a> r = a("spectatorsGenerateChunks", dcs.b.a, dcs.a.a(true));
   public static final dcs.e<dcs.d> s = a("spawnRadius", dcs.b.a, dcs.d.a(10));
   public static final dcs.e<dcs.a> t = a("disableElytraMovementCheck", dcs.b.a, dcs.a.a(false));
   public static final dcs.e<dcs.d> u = a("maxEntityCramming", dcs.b.b, dcs.d.a(24));
   public static final dcs.e<dcs.a> v = a("doWeatherCycle", dcs.b.e, dcs.a.a(true));
   public static final dcs.e<dcs.a> w = a("doLimitedCrafting", dcs.b.a, dcs.a.a(false, ($$0, $$1) -> {
      for (aqv $$2 : $$0.ah().t()) {
         $$2.c.b(new adb(adb.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dcs.e<dcs.d> x = a("maxCommandChainLength", dcs.b.g, dcs.d.a(65536));
   public static final dcs.e<dcs.d> y = a("maxCommandForkCount", dcs.b.g, dcs.d.a(65536));
   public static final dcs.e<dcs.d> z = a("commandModificationBlockLimit", dcs.b.g, dcs.d.a(32768));
   public static final dcs.e<dcs.a> A = a("announceAdvancements", dcs.b.f, dcs.a.a(true));
   public static final dcs.e<dcs.a> B = a("disableRaids", dcs.b.b, dcs.a.a(false));
   public static final dcs.e<dcs.a> C = a("doInsomnia", dcs.b.c, dcs.a.a(true));
   public static final dcs.e<dcs.a> D = a("doImmediateRespawn", dcs.b.a, dcs.a.a(false, ($$0, $$1) -> {
      for (aqv $$2 : $$0.ah().t()) {
         $$2.c.b(new adb(adb.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dcs.e<dcs.d> E = a("playersNetherPortalDefaultDelay", dcs.b.a, dcs.d.a(80));
   public static final dcs.e<dcs.d> F = a("playersNetherPortalCreativeDelay", dcs.b.a, dcs.d.a(1));
   public static final dcs.e<dcs.a> G = a("drowningDamage", dcs.b.a, dcs.a.a(true));
   public static final dcs.e<dcs.a> H = a("fallDamage", dcs.b.a, dcs.a.a(true));
   public static final dcs.e<dcs.a> I = a("fireDamage", dcs.b.a, dcs.a.a(true));
   public static final dcs.e<dcs.a> J = a("freezeDamage", dcs.b.a, dcs.a.a(true));
   public static final dcs.e<dcs.a> K = a("doPatrolSpawning", dcs.b.c, dcs.a.a(true));
   public static final dcs.e<dcs.a> L = a("doTraderSpawning", dcs.b.c, dcs.a.a(true));
   public static final dcs.e<dcs.a> M = a("doWardenSpawning", dcs.b.c, dcs.a.a(true));
   public static final dcs.e<dcs.a> N = a("forgiveDeadPlayers", dcs.b.b, dcs.a.a(true));
   public static final dcs.e<dcs.a> O = a("universalAnger", dcs.b.b, dcs.a.a(false));
   public static final dcs.e<dcs.d> P = a("playersSleepingPercentage", dcs.b.a, dcs.d.a(100));
   public static final dcs.e<dcs.a> Q = a("blockExplosionDropDecay", dcs.b.d, dcs.a.a(true));
   public static final dcs.e<dcs.a> R = a("mobExplosionDropDecay", dcs.b.d, dcs.a.a(true));
   public static final dcs.e<dcs.a> S = a("tntExplosionDropDecay", dcs.b.d, dcs.a.a(false));
   public static final dcs.e<dcs.d> T = a("snowAccumulationHeight", dcs.b.e, dcs.d.a(1));
   public static final dcs.e<dcs.a> U = a("waterSourceConversion", dcs.b.e, dcs.a.a(true));
   public static final dcs.e<dcs.a> V = a("lavaSourceConversion", dcs.b.e, dcs.a.a(false));
   public static final dcs.e<dcs.a> W = a("globalSoundEvents", dcs.b.g, dcs.a.a(true));
   public static final dcs.e<dcs.a> X = a("doVinesSpread", dcs.b.e, dcs.a.a(true));
   public static final dcs.e<dcs.a> Y = a("enderPearlsVanishOnDeath", dcs.b.a, dcs.a.a(true));
   public static final dcs.e<dcs.d> Z = a("spawnChunkRadius", dcs.b.g, dcs.d.a(2, 0, 32, ($$0, $$1) -> {
      aqu $$2 = $$0.I();
      $$2.a($$2.V(), $$2.W());
   }));
   private final Map<dcs.e<?>, dcs.g<?>> ac;

   private static <T extends dcs.g<T>> dcs.e<T> a(String $$0, dcs.b $$1, dcs.f<T> $$2) {
      dcs.e<T> $$3 = new dcs.e<>($$0, $$1);
      dcs.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dcs(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public dcs() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dcs.f)$$0.getValue()).a()));
   }

   private dcs(Map<dcs.e<?>, dcs.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends dcs.g<T>> T a(dcs.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public ub a() {
      ub $$0 = new ub();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dcs b() {
      return new dcs(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dcs.g)$$0.getValue()).f())));
   }

   public static void a(dcs.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (dcs.e<?>)$$1, (dcs.f<?>)$$2));
   }

   private static <T extends dcs.g<T>> void a(dcs.c $$0, dcs.e<?> $$1, dcs.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(dcs $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((dcs.e<?>)$$2, $$0, $$1));
   }

   private <T extends dcs.g<T>> void a(dcs.e<T> $$0, dcs $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dcs.e<dcs.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dcs.e<dcs.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dcs.g<dcs.a> {
      private boolean b;

      static dcs.f<dcs.a> a(boolean $$0, BiConsumer<MinecraftServer, dcs.a> $$1) {
         return new dcs.f<>(BoolArgumentType::bool, $$1x -> new dcs.a($$1x, $$0), $$1, dcs.c::b);
      }

      static dcs.f<dcs.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dcs.f<dcs.a> $$0, boolean $$1) {
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

      protected dcs.a d() {
         return this;
      }

      protected dcs.a e() {
         return new dcs.a(this.a, this.b);
      }

      public void a(dcs.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dcs.g<T>> void a(dcs.e<T> $$0, dcs.f<T> $$1) {
      }

      default void b(dcs.e<dcs.a> $$0, dcs.f<dcs.a> $$1) {
      }

      default void c(dcs.e<dcs.d> $$0, dcs.f<dcs.d> $$1) {
      }
   }

   public static class d extends dcs.g<dcs.d> {
      private int b;

      private static dcs.f<dcs.d> a(int $$0, BiConsumer<MinecraftServer, dcs.d> $$1) {
         return new dcs.f<>(IntegerArgumentType::integer, $$1x -> new dcs.d($$1x, $$0), $$1, dcs.c::c);
      }

      static dcs.f<dcs.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, dcs.d> $$3) {
         return new dcs.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dcs.d($$1x, $$0), $$3, dcs.c::c);
      }

      static dcs.f<dcs.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dcs.f<dcs.d> $$0, int $$1) {
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
               dcs.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dcs.d d() {
         return this;
      }

      protected dcs.d e() {
         return new dcs.d(this.a, this.b);
      }

      public void a(dcs.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dcs.g<T>> {
      final String a;
      private final dcs.b b;

      public e(String $$0, dcs.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dcs.e && ((dcs.e)$$0).a.equals(this.a);
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

      public dcs.b c() {
         return this.b;
      }
   }

   public static class f<T extends dcs.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dcs.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dcs.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<dcs.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dcs.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<et, ?> a(String $$0) {
         return eu.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dcs.c $$0, dcs.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends dcs.g<T>> {
      protected final dcs.f<T> a;

      public g(dcs.f<T> $$0) {
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

   interface h<T extends dcs.g<T>> {
      void call(dcs.c var1, dcs.e<T> var2, dcs.f<T> var3);
   }
}
