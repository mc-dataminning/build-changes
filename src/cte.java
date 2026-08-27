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

public class cte {
   public static final int a = 3;
   static final Logger Z = LogUtils.getLogger();
   private static final Map<cte.e<?>, cte.f<?>> aa = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cte.e<cte.a> b = a("doFireTick", cte.b.e, cte.a.a(true));
   public static final cte.e<cte.a> c = a("mobGriefing", cte.b.b, cte.a.a(true));
   public static final cte.e<cte.a> d = a("keepInventory", cte.b.a, cte.a.a(false));
   public static final cte.e<cte.a> e = a("doMobSpawning", cte.b.c, cte.a.a(true));
   public static final cte.e<cte.a> f = a("doMobLoot", cte.b.d, cte.a.a(true));
   public static final cte.e<cte.a> g = a("projectilesCanBreakBlocks", cte.b.d, cte.a.a(true));
   public static final cte.e<cte.a> h = a("doTileDrops", cte.b.d, cte.a.a(true));
   public static final cte.e<cte.a> i = a("doEntityDrops", cte.b.d, cte.a.a(true));
   public static final cte.e<cte.a> j = a("commandBlockOutput", cte.b.f, cte.a.a(true));
   public static final cte.e<cte.a> k = a("naturalRegeneration", cte.b.a, cte.a.a(true));
   public static final cte.e<cte.a> l = a("doDaylightCycle", cte.b.e, cte.a.a(true));
   public static final cte.e<cte.a> m = a("logAdminCommands", cte.b.f, cte.a.a(true));
   public static final cte.e<cte.a> n = a("showDeathMessages", cte.b.f, cte.a.a(true));
   public static final cte.e<cte.d> o = a("randomTickSpeed", cte.b.e, cte.d.a(3));
   public static final cte.e<cte.a> p = a("sendCommandFeedback", cte.b.f, cte.a.a(true));
   public static final cte.e<cte.a> q = a("reducedDebugInfo", cte.b.g, cte.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (ana $$3 : $$0.ae().t()) {
         $$3.c.b(new zz($$3, $$2));
      }
   }));
   public static final cte.e<cte.a> r = a("spectatorsGenerateChunks", cte.b.a, cte.a.a(true));
   public static final cte.e<cte.d> s = a("spawnRadius", cte.b.a, cte.d.a(10));
   public static final cte.e<cte.a> t = a("disableElytraMovementCheck", cte.b.a, cte.a.a(false));
   public static final cte.e<cte.d> u = a("maxEntityCramming", cte.b.b, cte.d.a(24));
   public static final cte.e<cte.a> v = a("doWeatherCycle", cte.b.e, cte.a.a(true));
   public static final cte.e<cte.a> w = a("doLimitedCrafting", cte.b.a, cte.a.a(false, ($$0, $$1) -> {
      for (ana $$2 : $$0.ae().t()) {
         $$2.c.b(new aac(aac.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cte.e<cte.d> x = a("maxCommandChainLength", cte.b.g, cte.d.a(65536));
   public static final cte.e<cte.d> y = a("maxCommandForkCount", cte.b.g, cte.d.a(65536));
   public static final cte.e<cte.d> z = a("commandModificationBlockLimit", cte.b.g, cte.d.a(32768));
   public static final cte.e<cte.a> A = a("announceAdvancements", cte.b.f, cte.a.a(true));
   public static final cte.e<cte.a> B = a("disableRaids", cte.b.b, cte.a.a(false));
   public static final cte.e<cte.a> C = a("doInsomnia", cte.b.c, cte.a.a(true));
   public static final cte.e<cte.a> D = a("doImmediateRespawn", cte.b.a, cte.a.a(false, ($$0, $$1) -> {
      for (ana $$2 : $$0.ae().t()) {
         $$2.c.b(new aac(aac.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cte.e<cte.d> E = a("playersNetherPortalDefaultDelay", cte.b.a, cte.d.a(80));
   public static final cte.e<cte.d> F = a("playersNetherPortalCreativeDelay", cte.b.a, cte.d.a(1));
   public static final cte.e<cte.a> G = a("drowningDamage", cte.b.a, cte.a.a(true));
   public static final cte.e<cte.a> H = a("fallDamage", cte.b.a, cte.a.a(true));
   public static final cte.e<cte.a> I = a("fireDamage", cte.b.a, cte.a.a(true));
   public static final cte.e<cte.a> J = a("freezeDamage", cte.b.a, cte.a.a(true));
   public static final cte.e<cte.a> K = a("doPatrolSpawning", cte.b.c, cte.a.a(true));
   public static final cte.e<cte.a> L = a("doTraderSpawning", cte.b.c, cte.a.a(true));
   public static final cte.e<cte.a> M = a("doWardenSpawning", cte.b.c, cte.a.a(true));
   public static final cte.e<cte.a> N = a("forgiveDeadPlayers", cte.b.b, cte.a.a(true));
   public static final cte.e<cte.a> O = a("universalAnger", cte.b.b, cte.a.a(false));
   public static final cte.e<cte.d> P = a("playersSleepingPercentage", cte.b.a, cte.d.a(100));
   public static final cte.e<cte.a> Q = a("blockExplosionDropDecay", cte.b.d, cte.a.a(true));
   public static final cte.e<cte.a> R = a("mobExplosionDropDecay", cte.b.d, cte.a.a(true));
   public static final cte.e<cte.a> S = a("tntExplosionDropDecay", cte.b.d, cte.a.a(false));
   public static final cte.e<cte.d> T = a("snowAccumulationHeight", cte.b.e, cte.d.a(1));
   public static final cte.e<cte.a> U = a("waterSourceConversion", cte.b.e, cte.a.a(true));
   public static final cte.e<cte.a> V = a("lavaSourceConversion", cte.b.e, cte.a.a(false));
   public static final cte.e<cte.a> W = a("globalSoundEvents", cte.b.g, cte.a.a(true));
   public static final cte.e<cte.a> X = a("doVinesSpread", cte.b.e, cte.a.a(true));
   public static final cte.e<cte.a> Y = a("enderPearlsVanishOnDeath", cte.b.a, cte.a.a(true));
   private final Map<cte.e<?>, cte.g<?>> ab;

   private static <T extends cte.g<T>> cte.e<T> a(String $$0, cte.b $$1, cte.f<T> $$2) {
      cte.e<T> $$3 = new cte.e<>($$0, $$1);
      cte.f<?> $$4 = aa.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cte(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cte() {
      this.ab = aa.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cte.f)$$0.getValue()).a()));
   }

   private cte(Map<cte.e<?>, cte.g<?>> $$0) {
      this.ab = $$0;
   }

   public <T extends cte.g<T>> T a(cte.e<T> $$0) {
      return (T)this.ab.get($$0);
   }

   public sl a() {
      sl $$0 = new sl();
      this.ab.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ab.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public cte b() {
      return new cte(this.ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cte.g)$$0.getValue()).f())));
   }

   public static void a(cte.c $$0) {
      aa.forEach(($$1, $$2) -> a($$0, (cte.e<?>)$$1, (cte.f<?>)$$2));
   }

   private static <T extends cte.g<T>> void a(cte.c $$0, cte.e<?> $$1, cte.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cte $$0, @Nullable MinecraftServer $$1) {
      $$0.ab.keySet().forEach($$2 -> this.a((cte.e<?>)$$2, $$0, $$1));
   }

   private <T extends cte.g<T>> void a(cte.e<T> $$0, cte $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cte.e<cte.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cte.e<cte.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cte.g<cte.a> {
      private boolean b;

      static cte.f<cte.a> a(boolean $$0, BiConsumer<MinecraftServer, cte.a> $$1) {
         return new cte.f<>(BoolArgumentType::bool, $$1x -> new cte.a($$1x, $$0), $$1, cte.c::b);
      }

      static cte.f<cte.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cte.f<cte.a> $$0, boolean $$1) {
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

      protected cte.a d() {
         return this;
      }

      protected cte.a e() {
         return new cte.a(this.a, this.b);
      }

      public void a(cte.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cte.g<T>> void a(cte.e<T> $$0, cte.f<T> $$1) {
      }

      default void b(cte.e<cte.a> $$0, cte.f<cte.a> $$1) {
      }

      default void c(cte.e<cte.d> $$0, cte.f<cte.d> $$1) {
      }
   }

   public static class d extends cte.g<cte.d> {
      private int b;

      private static cte.f<cte.d> a(int $$0, BiConsumer<MinecraftServer, cte.d> $$1) {
         return new cte.f<>(IntegerArgumentType::integer, $$1x -> new cte.d($$1x, $$0), $$1, cte.c::c);
      }

      static cte.f<cte.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cte.f<cte.d> $$0, int $$1) {
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
               cte.Z.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cte.d d() {
         return this;
      }

      protected cte.d e() {
         return new cte.d(this.a, this.b);
      }

      public void a(cte.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cte.g<T>> {
      final String a;
      private final cte.b b;

      public e(String $$0, cte.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cte.e && ((cte.e)$$0).a.equals(this.a);
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

      public cte.b c() {
         return this.b;
      }
   }

   public static class f<T extends cte.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<cte.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cte.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cte.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cte.h<T> $$3) {
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

      public void a(cte.c $$0, cte.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cte.g<T>> {
      protected final cte.f<T> a;

      public g(cte.f<T> $$0) {
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

   interface h<T extends cte.g<T>> {
      void call(cte.c var1, cte.e<T> var2, cte.f<T> var3);
   }
}
