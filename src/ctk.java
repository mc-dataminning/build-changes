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

public class ctk {
   public static final int a = 3;
   static final Logger Z = LogUtils.getLogger();
   private static final Map<ctk.e<?>, ctk.f<?>> aa = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final ctk.e<ctk.a> b = a("doFireTick", ctk.b.e, ctk.a.a(true));
   public static final ctk.e<ctk.a> c = a("mobGriefing", ctk.b.b, ctk.a.a(true));
   public static final ctk.e<ctk.a> d = a("keepInventory", ctk.b.a, ctk.a.a(false));
   public static final ctk.e<ctk.a> e = a("doMobSpawning", ctk.b.c, ctk.a.a(true));
   public static final ctk.e<ctk.a> f = a("doMobLoot", ctk.b.d, ctk.a.a(true));
   public static final ctk.e<ctk.a> g = a("projectilesCanBreakBlocks", ctk.b.d, ctk.a.a(true));
   public static final ctk.e<ctk.a> h = a("doTileDrops", ctk.b.d, ctk.a.a(true));
   public static final ctk.e<ctk.a> i = a("doEntityDrops", ctk.b.d, ctk.a.a(true));
   public static final ctk.e<ctk.a> j = a("commandBlockOutput", ctk.b.f, ctk.a.a(true));
   public static final ctk.e<ctk.a> k = a("naturalRegeneration", ctk.b.a, ctk.a.a(true));
   public static final ctk.e<ctk.a> l = a("doDaylightCycle", ctk.b.e, ctk.a.a(true));
   public static final ctk.e<ctk.a> m = a("logAdminCommands", ctk.b.f, ctk.a.a(true));
   public static final ctk.e<ctk.a> n = a("showDeathMessages", ctk.b.f, ctk.a.a(true));
   public static final ctk.e<ctk.d> o = a("randomTickSpeed", ctk.b.e, ctk.d.a(3));
   public static final ctk.e<ctk.a> p = a("sendCommandFeedback", ctk.b.f, ctk.a.a(true));
   public static final ctk.e<ctk.a> q = a("reducedDebugInfo", ctk.b.g, ctk.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (ane $$3 : $$0.ae().t()) {
         $$3.c.b(new aac($$3, $$2));
      }
   }));
   public static final ctk.e<ctk.a> r = a("spectatorsGenerateChunks", ctk.b.a, ctk.a.a(true));
   public static final ctk.e<ctk.d> s = a("spawnRadius", ctk.b.a, ctk.d.a(10));
   public static final ctk.e<ctk.a> t = a("disableElytraMovementCheck", ctk.b.a, ctk.a.a(false));
   public static final ctk.e<ctk.d> u = a("maxEntityCramming", ctk.b.b, ctk.d.a(24));
   public static final ctk.e<ctk.a> v = a("doWeatherCycle", ctk.b.e, ctk.a.a(true));
   public static final ctk.e<ctk.a> w = a("doLimitedCrafting", ctk.b.a, ctk.a.a(false, ($$0, $$1) -> {
      for (ane $$2 : $$0.ae().t()) {
         $$2.c.b(new aaf(aaf.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final ctk.e<ctk.d> x = a("maxCommandChainLength", ctk.b.g, ctk.d.a(65536));
   public static final ctk.e<ctk.d> y = a("maxCommandForkCount", ctk.b.g, ctk.d.a(65536));
   public static final ctk.e<ctk.d> z = a("commandModificationBlockLimit", ctk.b.g, ctk.d.a(32768));
   public static final ctk.e<ctk.a> A = a("announceAdvancements", ctk.b.f, ctk.a.a(true));
   public static final ctk.e<ctk.a> B = a("disableRaids", ctk.b.b, ctk.a.a(false));
   public static final ctk.e<ctk.a> C = a("doInsomnia", ctk.b.c, ctk.a.a(true));
   public static final ctk.e<ctk.a> D = a("doImmediateRespawn", ctk.b.a, ctk.a.a(false, ($$0, $$1) -> {
      for (ane $$2 : $$0.ae().t()) {
         $$2.c.b(new aaf(aaf.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final ctk.e<ctk.d> E = a("playersNetherPortalDefaultDelay", ctk.b.a, ctk.d.a(80));
   public static final ctk.e<ctk.d> F = a("playersNetherPortalCreativeDelay", ctk.b.a, ctk.d.a(1));
   public static final ctk.e<ctk.a> G = a("drowningDamage", ctk.b.a, ctk.a.a(true));
   public static final ctk.e<ctk.a> H = a("fallDamage", ctk.b.a, ctk.a.a(true));
   public static final ctk.e<ctk.a> I = a("fireDamage", ctk.b.a, ctk.a.a(true));
   public static final ctk.e<ctk.a> J = a("freezeDamage", ctk.b.a, ctk.a.a(true));
   public static final ctk.e<ctk.a> K = a("doPatrolSpawning", ctk.b.c, ctk.a.a(true));
   public static final ctk.e<ctk.a> L = a("doTraderSpawning", ctk.b.c, ctk.a.a(true));
   public static final ctk.e<ctk.a> M = a("doWardenSpawning", ctk.b.c, ctk.a.a(true));
   public static final ctk.e<ctk.a> N = a("forgiveDeadPlayers", ctk.b.b, ctk.a.a(true));
   public static final ctk.e<ctk.a> O = a("universalAnger", ctk.b.b, ctk.a.a(false));
   public static final ctk.e<ctk.d> P = a("playersSleepingPercentage", ctk.b.a, ctk.d.a(100));
   public static final ctk.e<ctk.a> Q = a("blockExplosionDropDecay", ctk.b.d, ctk.a.a(true));
   public static final ctk.e<ctk.a> R = a("mobExplosionDropDecay", ctk.b.d, ctk.a.a(true));
   public static final ctk.e<ctk.a> S = a("tntExplosionDropDecay", ctk.b.d, ctk.a.a(false));
   public static final ctk.e<ctk.d> T = a("snowAccumulationHeight", ctk.b.e, ctk.d.a(1));
   public static final ctk.e<ctk.a> U = a("waterSourceConversion", ctk.b.e, ctk.a.a(true));
   public static final ctk.e<ctk.a> V = a("lavaSourceConversion", ctk.b.e, ctk.a.a(false));
   public static final ctk.e<ctk.a> W = a("globalSoundEvents", ctk.b.g, ctk.a.a(true));
   public static final ctk.e<ctk.a> X = a("doVinesSpread", ctk.b.e, ctk.a.a(true));
   public static final ctk.e<ctk.a> Y = a("enderPearlsVanishOnDeath", ctk.b.a, ctk.a.a(true));
   private final Map<ctk.e<?>, ctk.g<?>> ab;

   private static <T extends ctk.g<T>> ctk.e<T> a(String $$0, ctk.b $$1, ctk.f<T> $$2) {
      ctk.e<T> $$3 = new ctk.e<>($$0, $$1);
      ctk.f<?> $$4 = aa.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public ctk(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public ctk() {
      this.ab = aa.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((ctk.f)$$0.getValue()).a()));
   }

   private ctk(Map<ctk.e<?>, ctk.g<?>> $$0) {
      this.ab = $$0;
   }

   public <T extends ctk.g<T>> T a(ctk.e<T> $$0) {
      return (T)this.ab.get($$0);
   }

   public sn a() {
      sn $$0 = new sn();
      this.ab.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ab.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public ctk b() {
      return new ctk(this.ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((ctk.g)$$0.getValue()).f())));
   }

   public static void a(ctk.c $$0) {
      aa.forEach(($$1, $$2) -> a($$0, (ctk.e<?>)$$1, (ctk.f<?>)$$2));
   }

   private static <T extends ctk.g<T>> void a(ctk.c $$0, ctk.e<?> $$1, ctk.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(ctk $$0, @Nullable MinecraftServer $$1) {
      $$0.ab.keySet().forEach($$2 -> this.a((ctk.e<?>)$$2, $$0, $$1));
   }

   private <T extends ctk.g<T>> void a(ctk.e<T> $$0, ctk $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(ctk.e<ctk.a> $$0) {
      return this.a($$0).a();
   }

   public int c(ctk.e<ctk.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends ctk.g<ctk.a> {
      private boolean b;

      static ctk.f<ctk.a> a(boolean $$0, BiConsumer<MinecraftServer, ctk.a> $$1) {
         return new ctk.f<>(BoolArgumentType::bool, $$1x -> new ctk.a($$1x, $$0), $$1, ctk.c::b);
      }

      static ctk.f<ctk.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(ctk.f<ctk.a> $$0, boolean $$1) {
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

      protected ctk.a d() {
         return this;
      }

      protected ctk.a e() {
         return new ctk.a(this.a, this.b);
      }

      public void a(ctk.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends ctk.g<T>> void a(ctk.e<T> $$0, ctk.f<T> $$1) {
      }

      default void b(ctk.e<ctk.a> $$0, ctk.f<ctk.a> $$1) {
      }

      default void c(ctk.e<ctk.d> $$0, ctk.f<ctk.d> $$1) {
      }
   }

   public static class d extends ctk.g<ctk.d> {
      private int b;

      private static ctk.f<ctk.d> a(int $$0, BiConsumer<MinecraftServer, ctk.d> $$1) {
         return new ctk.f<>(IntegerArgumentType::integer, $$1x -> new ctk.d($$1x, $$0), $$1, ctk.c::c);
      }

      static ctk.f<ctk.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(ctk.f<ctk.d> $$0, int $$1) {
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
               ctk.Z.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected ctk.d d() {
         return this;
      }

      protected ctk.d e() {
         return new ctk.d(this.a, this.b);
      }

      public void a(ctk.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends ctk.g<T>> {
      final String a;
      private final ctk.b b;

      public e(String $$0, ctk.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof ctk.e && ((ctk.e)$$0).a.equals(this.a);
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

      public ctk.b c() {
         return this.b;
      }
   }

   public static class f<T extends ctk.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<ctk.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final ctk.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<ctk.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, ctk.h<T> $$3) {
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

      public void a(ctk.c $$0, ctk.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends ctk.g<T>> {
      protected final ctk.f<T> a;

      public g(ctk.f<T> $$0) {
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

   interface h<T extends ctk.g<T>> {
      void call(ctk.c var1, ctk.e<T> var2, ctk.f<T> var3);
   }
}
