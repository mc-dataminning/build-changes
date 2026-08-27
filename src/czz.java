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

public class czz {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<czz.e<?>, czz.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final czz.e<czz.a> b = a("doFireTick", czz.b.e, czz.a.a(true));
   public static final czz.e<czz.a> c = a("mobGriefing", czz.b.b, czz.a.a(true));
   public static final czz.e<czz.a> d = a("keepInventory", czz.b.a, czz.a.a(false));
   public static final czz.e<czz.a> e = a("doMobSpawning", czz.b.c, czz.a.a(true));
   public static final czz.e<czz.a> f = a("doMobLoot", czz.b.d, czz.a.a(true));
   public static final czz.e<czz.a> g = a("projectilesCanBreakBlocks", czz.b.d, czz.a.a(true));
   public static final czz.e<czz.a> h = a("doTileDrops", czz.b.d, czz.a.a(true));
   public static final czz.e<czz.a> i = a("doEntityDrops", czz.b.d, czz.a.a(true));
   public static final czz.e<czz.a> j = a("commandBlockOutput", czz.b.f, czz.a.a(true));
   public static final czz.e<czz.a> k = a("naturalRegeneration", czz.b.a, czz.a.a(true));
   public static final czz.e<czz.a> l = a("doDaylightCycle", czz.b.e, czz.a.a(true));
   public static final czz.e<czz.a> m = a("logAdminCommands", czz.b.f, czz.a.a(true));
   public static final czz.e<czz.a> n = a("showDeathMessages", czz.b.f, czz.a.a(true));
   public static final czz.e<czz.d> o = a("randomTickSpeed", czz.b.e, czz.d.a(3));
   public static final czz.e<czz.a> p = a("sendCommandFeedback", czz.b.f, czz.a.a(true));
   public static final czz.e<czz.a> q = a("reducedDebugInfo", czz.b.g, czz.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aqi $$3 : $$0.ah().t()) {
         $$3.d.b(new acq($$3, $$2));
      }
   }));
   public static final czz.e<czz.a> r = a("spectatorsGenerateChunks", czz.b.a, czz.a.a(true));
   public static final czz.e<czz.d> s = a("spawnRadius", czz.b.a, czz.d.a(10));
   public static final czz.e<czz.a> t = a("disableElytraMovementCheck", czz.b.a, czz.a.a(false));
   public static final czz.e<czz.d> u = a("maxEntityCramming", czz.b.b, czz.d.a(24));
   public static final czz.e<czz.a> v = a("doWeatherCycle", czz.b.e, czz.a.a(true));
   public static final czz.e<czz.a> w = a("doLimitedCrafting", czz.b.a, czz.a.a(false, ($$0, $$1) -> {
      for (aqi $$2 : $$0.ah().t()) {
         $$2.d.b(new act(act.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final czz.e<czz.d> x = a("maxCommandChainLength", czz.b.g, czz.d.a(65536));
   public static final czz.e<czz.d> y = a("maxCommandForkCount", czz.b.g, czz.d.a(65536));
   public static final czz.e<czz.d> z = a("commandModificationBlockLimit", czz.b.g, czz.d.a(32768));
   public static final czz.e<czz.a> A = a("announceAdvancements", czz.b.f, czz.a.a(true));
   public static final czz.e<czz.a> B = a("disableRaids", czz.b.b, czz.a.a(false));
   public static final czz.e<czz.a> C = a("doInsomnia", czz.b.c, czz.a.a(true));
   public static final czz.e<czz.a> D = a("doImmediateRespawn", czz.b.a, czz.a.a(false, ($$0, $$1) -> {
      for (aqi $$2 : $$0.ah().t()) {
         $$2.d.b(new act(act.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final czz.e<czz.d> E = a("playersNetherPortalDefaultDelay", czz.b.a, czz.d.a(80));
   public static final czz.e<czz.d> F = a("playersNetherPortalCreativeDelay", czz.b.a, czz.d.a(1));
   public static final czz.e<czz.a> G = a("drowningDamage", czz.b.a, czz.a.a(true));
   public static final czz.e<czz.a> H = a("fallDamage", czz.b.a, czz.a.a(true));
   public static final czz.e<czz.a> I = a("fireDamage", czz.b.a, czz.a.a(true));
   public static final czz.e<czz.a> J = a("freezeDamage", czz.b.a, czz.a.a(true));
   public static final czz.e<czz.a> K = a("doPatrolSpawning", czz.b.c, czz.a.a(true));
   public static final czz.e<czz.a> L = a("doTraderSpawning", czz.b.c, czz.a.a(true));
   public static final czz.e<czz.a> M = a("doWardenSpawning", czz.b.c, czz.a.a(true));
   public static final czz.e<czz.a> N = a("forgiveDeadPlayers", czz.b.b, czz.a.a(true));
   public static final czz.e<czz.a> O = a("universalAnger", czz.b.b, czz.a.a(false));
   public static final czz.e<czz.d> P = a("playersSleepingPercentage", czz.b.a, czz.d.a(100));
   public static final czz.e<czz.a> Q = a("blockExplosionDropDecay", czz.b.d, czz.a.a(true));
   public static final czz.e<czz.a> R = a("mobExplosionDropDecay", czz.b.d, czz.a.a(true));
   public static final czz.e<czz.a> S = a("tntExplosionDropDecay", czz.b.d, czz.a.a(false));
   public static final czz.e<czz.d> T = a("snowAccumulationHeight", czz.b.e, czz.d.a(1));
   public static final czz.e<czz.a> U = a("waterSourceConversion", czz.b.e, czz.a.a(true));
   public static final czz.e<czz.a> V = a("lavaSourceConversion", czz.b.e, czz.a.a(false));
   public static final czz.e<czz.a> W = a("globalSoundEvents", czz.b.g, czz.a.a(true));
   public static final czz.e<czz.a> X = a("doVinesSpread", czz.b.e, czz.a.a(true));
   public static final czz.e<czz.a> Y = a("enderPearlsVanishOnDeath", czz.b.a, czz.a.a(true));
   public static final czz.e<czz.d> Z = a("spawnChunkRadius", czz.b.g, czz.d.a(2, 0, 32, ($$0, $$1) -> {
      aqh $$2 = $$0.I();
      $$2.a($$2.U(), $$2.V());
   }));
   private final Map<czz.e<?>, czz.g<?>> ac;

   private static <T extends czz.g<T>> czz.e<T> a(String $$0, czz.b $$1, czz.f<T> $$2) {
      czz.e<T> $$3 = new czz.e<>($$0, $$1);
      czz.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public czz(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public czz() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((czz.f)$$0.getValue()).a()));
   }

   private czz(Map<czz.e<?>, czz.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends czz.g<T>> T a(czz.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public ua a() {
      ua $$0 = new ua();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public czz b() {
      return new czz(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((czz.g)$$0.getValue()).f())));
   }

   public static void a(czz.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (czz.e<?>)$$1, (czz.f<?>)$$2));
   }

   private static <T extends czz.g<T>> void a(czz.c $$0, czz.e<?> $$1, czz.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(czz $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((czz.e<?>)$$2, $$0, $$1));
   }

   private <T extends czz.g<T>> void a(czz.e<T> $$0, czz $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(czz.e<czz.a> $$0) {
      return this.a($$0).a();
   }

   public int c(czz.e<czz.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends czz.g<czz.a> {
      private boolean b;

      static czz.f<czz.a> a(boolean $$0, BiConsumer<MinecraftServer, czz.a> $$1) {
         return new czz.f<>(BoolArgumentType::bool, $$1x -> new czz.a($$1x, $$0), $$1, czz.c::b);
      }

      static czz.f<czz.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(czz.f<czz.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ed> $$0, String $$1) {
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

      protected czz.a d() {
         return this;
      }

      protected czz.a e() {
         return new czz.a(this.a, this.b);
      }

      public void a(czz.a $$0, @Nullable MinecraftServer $$1) {
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

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }
   }

   public interface c {
      default <T extends czz.g<T>> void a(czz.e<T> $$0, czz.f<T> $$1) {
      }

      default void b(czz.e<czz.a> $$0, czz.f<czz.a> $$1) {
      }

      default void c(czz.e<czz.d> $$0, czz.f<czz.d> $$1) {
      }
   }

   public static class d extends czz.g<czz.d> {
      private int b;

      private static czz.f<czz.d> a(int $$0, BiConsumer<MinecraftServer, czz.d> $$1) {
         return new czz.f<>(IntegerArgumentType::integer, $$1x -> new czz.d($$1x, $$0), $$1, czz.c::c);
      }

      static czz.f<czz.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, czz.d> $$3) {
         return new czz.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new czz.d($$1x, $$0), $$3, czz.c::c);
      }

      static czz.f<czz.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(czz.f<czz.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ed> $$0, String $$1) {
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
               czz.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected czz.d d() {
         return this;
      }

      protected czz.d e() {
         return new czz.d(this.a, this.b);
      }

      public void a(czz.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends czz.g<T>> {
      final String a;
      private final czz.b b;

      public e(String $$0, czz.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof czz.e && ((czz.e)$$0).a.equals(this.a);
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

      public czz.b c() {
         return this.b;
      }
   }

   public static class f<T extends czz.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<czz.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final czz.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<czz.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, czz.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<ed, ?> a(String $$0) {
         return ee.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(czz.c $$0, czz.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends czz.g<T>> {
      protected final czz.f<T> a;

      public g(czz.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ed> var1, String var2);

      public void b(CommandContext<ed> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ed)$$0.getSource()).l());
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

   interface h<T extends czz.g<T>> {
      void call(czz.c var1, czz.e<T> var2, czz.f<T> var3);
   }
}
