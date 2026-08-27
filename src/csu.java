import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
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

public class csu {
   public static final int a = 3;
   static final Logger Z = LogUtils.getLogger();
   private static final Map<csu.e<?>, csu.f<?>> aa = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final csu.e<csu.a> b = a("doFireTick", csu.b.e, csu.a.a(true));
   public static final csu.e<csu.a> c = a("mobGriefing", csu.b.b, csu.a.a(true));
   public static final csu.e<csu.a> d = a("keepInventory", csu.b.a, csu.a.a(false));
   public static final csu.e<csu.a> e = a("doMobSpawning", csu.b.c, csu.a.a(true));
   public static final csu.e<csu.a> f = a("doMobLoot", csu.b.d, csu.a.a(true));
   public static final csu.e<csu.a> g = a("projectilesCanBreakBlocks", csu.b.d, csu.a.a(true));
   public static final csu.e<csu.a> h = a("doTileDrops", csu.b.d, csu.a.a(true));
   public static final csu.e<csu.a> i = a("doEntityDrops", csu.b.d, csu.a.a(true));
   public static final csu.e<csu.a> j = a("commandBlockOutput", csu.b.f, csu.a.a(true));
   public static final csu.e<csu.a> k = a("naturalRegeneration", csu.b.a, csu.a.a(true));
   public static final csu.e<csu.a> l = a("doDaylightCycle", csu.b.e, csu.a.a(true));
   public static final csu.e<csu.a> m = a("logAdminCommands", csu.b.f, csu.a.a(true));
   public static final csu.e<csu.a> n = a("showDeathMessages", csu.b.f, csu.a.a(true));
   public static final csu.e<csu.d> o = a("randomTickSpeed", csu.b.e, csu.d.a(3));
   public static final csu.e<csu.a> p = a("sendCommandFeedback", csu.b.f, csu.a.a(true));
   public static final csu.e<csu.a> q = a("reducedDebugInfo", csu.b.g, csu.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (amq $$3 : $$0.ae().t()) {
         $$3.c.b(new zq($$3, $$2));
      }
   }));
   public static final csu.e<csu.a> r = a("spectatorsGenerateChunks", csu.b.a, csu.a.a(true));
   public static final csu.e<csu.d> s = a("spawnRadius", csu.b.a, csu.d.a(10));
   public static final csu.e<csu.a> t = a("disableElytraMovementCheck", csu.b.a, csu.a.a(false));
   public static final csu.e<csu.d> u = a("maxEntityCramming", csu.b.b, csu.d.a(24));
   public static final csu.e<csu.a> v = a("doWeatherCycle", csu.b.e, csu.a.a(true));
   public static final csu.e<csu.a> w = a("doLimitedCrafting", csu.b.a, csu.a.a(false, ($$0, $$1) -> {
      for (amq $$2 : $$0.ae().t()) {
         $$2.c.b(new zt(zt.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final csu.e<csu.d> x = a("maxCommandChainLength", csu.b.g, csu.d.a(65536));
   public static final csu.e<csu.d> y = a("maxCommandForkCount", csu.b.g, csu.d.a(65536));
   public static final csu.e<csu.d> z = a("commandModificationBlockLimit", csu.b.g, csu.d.a(32768));
   public static final csu.e<csu.a> A = a("announceAdvancements", csu.b.f, csu.a.a(true));
   public static final csu.e<csu.a> B = a("disableRaids", csu.b.b, csu.a.a(false));
   public static final csu.e<csu.a> C = a("doInsomnia", csu.b.c, csu.a.a(true));
   public static final csu.e<csu.a> D = a("doImmediateRespawn", csu.b.a, csu.a.a(false, ($$0, $$1) -> {
      for (amq $$2 : $$0.ae().t()) {
         $$2.c.b(new zt(zt.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final csu.e<csu.d> E = a("playersNetherPortalDefaultDelay", csu.b.a, csu.d.a(80));
   public static final csu.e<csu.d> F = a("playersNetherPortalCreativeDelay", csu.b.a, csu.d.a(1));
   public static final csu.e<csu.a> G = a("drowningDamage", csu.b.a, csu.a.a(true));
   public static final csu.e<csu.a> H = a("fallDamage", csu.b.a, csu.a.a(true));
   public static final csu.e<csu.a> I = a("fireDamage", csu.b.a, csu.a.a(true));
   public static final csu.e<csu.a> J = a("freezeDamage", csu.b.a, csu.a.a(true));
   public static final csu.e<csu.a> K = a("doPatrolSpawning", csu.b.c, csu.a.a(true));
   public static final csu.e<csu.a> L = a("doTraderSpawning", csu.b.c, csu.a.a(true));
   public static final csu.e<csu.a> M = a("doWardenSpawning", csu.b.c, csu.a.a(true));
   public static final csu.e<csu.a> N = a("forgiveDeadPlayers", csu.b.b, csu.a.a(true));
   public static final csu.e<csu.a> O = a("universalAnger", csu.b.b, csu.a.a(false));
   public static final csu.e<csu.d> P = a("playersSleepingPercentage", csu.b.a, csu.d.a(100));
   public static final csu.e<csu.a> Q = a("blockExplosionDropDecay", csu.b.d, csu.a.a(true));
   public static final csu.e<csu.a> R = a("mobExplosionDropDecay", csu.b.d, csu.a.a(true));
   public static final csu.e<csu.a> S = a("tntExplosionDropDecay", csu.b.d, csu.a.a(false));
   public static final csu.e<csu.d> T = a("snowAccumulationHeight", csu.b.e, csu.d.a(1));
   public static final csu.e<csu.a> U = a("waterSourceConversion", csu.b.e, csu.a.a(true));
   public static final csu.e<csu.a> V = a("lavaSourceConversion", csu.b.e, csu.a.a(false));
   public static final csu.e<csu.a> W = a("globalSoundEvents", csu.b.g, csu.a.a(true));
   public static final csu.e<csu.a> X = a("doVinesSpread", csu.b.e, csu.a.a(true));
   public static final csu.e<csu.a> Y = a("enderPearlsVanishOnDeath", csu.b.a, csu.a.a(true));
   private final Map<csu.e<?>, csu.g<?>> ab;

   private static <T extends csu.g<T>> csu.e<T> a(String $$0, csu.b $$1, csu.f<T> $$2) {
      csu.e<T> $$3 = new csu.e<>($$0, $$1);
      csu.f<?> $$4 = aa.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public csu(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public csu() {
      this.ab = aa.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((csu.f)$$0.getValue()).a()));
   }

   private csu(Map<csu.e<?>, csu.g<?>> $$0) {
      this.ab = $$0;
   }

   public <T extends csu.g<T>> T a(csu.e<T> $$0) {
      return (T)this.ab.get($$0);
   }

   public sj a() {
      sj $$0 = new sj();
      this.ab.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ab.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public csu b() {
      return new csu(this.ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((csu.g)$$0.getValue()).f())));
   }

   public static void a(csu.c $$0) {
      aa.forEach(($$1, $$2) -> a($$0, (csu.e<?>)$$1, (csu.f<?>)$$2));
   }

   private static <T extends csu.g<T>> void a(csu.c $$0, csu.e<?> $$1, csu.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(csu $$0, @Nullable MinecraftServer $$1) {
      $$0.ab.keySet().forEach($$2 -> this.a((csu.e<?>)$$2, $$0, $$1));
   }

   private <T extends csu.g<T>> void a(csu.e<T> $$0, csu $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(csu.e<csu.a> $$0) {
      return this.a($$0).a();
   }

   public int c(csu.e<csu.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends csu.g<csu.a> {
      private boolean b;

      static csu.f<csu.a> a(boolean $$0, BiConsumer<MinecraftServer, csu.a> $$1) {
         return new csu.f<>(BoolArgumentType::bool, $$1x -> new csu.a($$1x, $$0), $$1, csu.c::b);
      }

      static csu.f<csu.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(csu.f<csu.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ds> $$0, String $$1) {
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

      protected csu.a d() {
         return this;
      }

      protected csu.a e() {
         return new csu.a(this.a, this.b);
      }

      public void a(csu.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends csu.g<T>> void a(csu.e<T> $$0, csu.f<T> $$1) {
      }

      default void b(csu.e<csu.a> $$0, csu.f<csu.a> $$1) {
      }

      default void c(csu.e<csu.d> $$0, csu.f<csu.d> $$1) {
      }
   }

   public static class d extends csu.g<csu.d> {
      private int b;

      private static csu.f<csu.d> a(int $$0, BiConsumer<MinecraftServer, csu.d> $$1) {
         return new csu.f<>(IntegerArgumentType::integer, $$1x -> new csu.d($$1x, $$0), $$1, csu.c::c);
      }

      static csu.f<csu.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(csu.f<csu.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ds> $$0, String $$1) {
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
            this.b = Integer.parseInt($$0);
            return true;
         } catch (NumberFormatException var3) {
            return false;
         }
      }

      private static int c(String $$0) {
         if (!$$0.isEmpty()) {
            try {
               return Integer.parseInt($$0);
            } catch (NumberFormatException var2) {
               csu.Z.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected csu.d d() {
         return this;
      }

      protected csu.d e() {
         return new csu.d(this.a, this.b);
      }

      public void a(csu.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends csu.g<T>> {
      final String a;
      private final csu.b b;

      public e(String $$0, csu.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof csu.e && ((csu.e)$$0).a.equals(this.a);
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

      public csu.b c() {
         return this.b;
      }
   }

   public static class f<T extends csu.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<csu.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final csu.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<csu.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, csu.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<ds, ?> a(String $$0) {
         return dt.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(csu.c $$0, csu.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends csu.g<T>> {
      protected final csu.f<T> a;

      public g(csu.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ds> var1, String var2);

      public void b(CommandContext<ds> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ds)$$0.getSource()).l());
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

   interface h<T extends csu.g<T>> {
      void call(csu.c var1, csu.e<T> var2, csu.f<T> var3);
   }
}
