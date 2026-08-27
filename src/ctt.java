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

public class ctt {
   public static final int a = 3;
   static final Logger Z = LogUtils.getLogger();
   private static final Map<ctt.e<?>, ctt.f<?>> aa = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final ctt.e<ctt.a> b = a("doFireTick", ctt.b.e, ctt.a.a(true));
   public static final ctt.e<ctt.a> c = a("mobGriefing", ctt.b.b, ctt.a.a(true));
   public static final ctt.e<ctt.a> d = a("keepInventory", ctt.b.a, ctt.a.a(false));
   public static final ctt.e<ctt.a> e = a("doMobSpawning", ctt.b.c, ctt.a.a(true));
   public static final ctt.e<ctt.a> f = a("doMobLoot", ctt.b.d, ctt.a.a(true));
   public static final ctt.e<ctt.a> g = a("projectilesCanBreakBlocks", ctt.b.d, ctt.a.a(true));
   public static final ctt.e<ctt.a> h = a("doTileDrops", ctt.b.d, ctt.a.a(true));
   public static final ctt.e<ctt.a> i = a("doEntityDrops", ctt.b.d, ctt.a.a(true));
   public static final ctt.e<ctt.a> j = a("commandBlockOutput", ctt.b.f, ctt.a.a(true));
   public static final ctt.e<ctt.a> k = a("naturalRegeneration", ctt.b.a, ctt.a.a(true));
   public static final ctt.e<ctt.a> l = a("doDaylightCycle", ctt.b.e, ctt.a.a(true));
   public static final ctt.e<ctt.a> m = a("logAdminCommands", ctt.b.f, ctt.a.a(true));
   public static final ctt.e<ctt.a> n = a("showDeathMessages", ctt.b.f, ctt.a.a(true));
   public static final ctt.e<ctt.d> o = a("randomTickSpeed", ctt.b.e, ctt.d.a(3));
   public static final ctt.e<ctt.a> p = a("sendCommandFeedback", ctt.b.f, ctt.a.a(true));
   public static final ctt.e<ctt.a> q = a("reducedDebugInfo", ctt.b.g, ctt.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (anf $$3 : $$0.ae().t()) {
         $$3.c.b(new aad($$3, $$2));
      }
   }));
   public static final ctt.e<ctt.a> r = a("spectatorsGenerateChunks", ctt.b.a, ctt.a.a(true));
   public static final ctt.e<ctt.d> s = a("spawnRadius", ctt.b.a, ctt.d.a(10));
   public static final ctt.e<ctt.a> t = a("disableElytraMovementCheck", ctt.b.a, ctt.a.a(false));
   public static final ctt.e<ctt.d> u = a("maxEntityCramming", ctt.b.b, ctt.d.a(24));
   public static final ctt.e<ctt.a> v = a("doWeatherCycle", ctt.b.e, ctt.a.a(true));
   public static final ctt.e<ctt.a> w = a("doLimitedCrafting", ctt.b.a, ctt.a.a(false, ($$0, $$1) -> {
      for (anf $$2 : $$0.ae().t()) {
         $$2.c.b(new aag(aag.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final ctt.e<ctt.d> x = a("maxCommandChainLength", ctt.b.g, ctt.d.a(65536));
   public static final ctt.e<ctt.d> y = a("maxCommandForkCount", ctt.b.g, ctt.d.a(65536));
   public static final ctt.e<ctt.d> z = a("commandModificationBlockLimit", ctt.b.g, ctt.d.a(32768));
   public static final ctt.e<ctt.a> A = a("announceAdvancements", ctt.b.f, ctt.a.a(true));
   public static final ctt.e<ctt.a> B = a("disableRaids", ctt.b.b, ctt.a.a(false));
   public static final ctt.e<ctt.a> C = a("doInsomnia", ctt.b.c, ctt.a.a(true));
   public static final ctt.e<ctt.a> D = a("doImmediateRespawn", ctt.b.a, ctt.a.a(false, ($$0, $$1) -> {
      for (anf $$2 : $$0.ae().t()) {
         $$2.c.b(new aag(aag.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final ctt.e<ctt.d> E = a("playersNetherPortalDefaultDelay", ctt.b.a, ctt.d.a(80));
   public static final ctt.e<ctt.d> F = a("playersNetherPortalCreativeDelay", ctt.b.a, ctt.d.a(1));
   public static final ctt.e<ctt.a> G = a("drowningDamage", ctt.b.a, ctt.a.a(true));
   public static final ctt.e<ctt.a> H = a("fallDamage", ctt.b.a, ctt.a.a(true));
   public static final ctt.e<ctt.a> I = a("fireDamage", ctt.b.a, ctt.a.a(true));
   public static final ctt.e<ctt.a> J = a("freezeDamage", ctt.b.a, ctt.a.a(true));
   public static final ctt.e<ctt.a> K = a("doPatrolSpawning", ctt.b.c, ctt.a.a(true));
   public static final ctt.e<ctt.a> L = a("doTraderSpawning", ctt.b.c, ctt.a.a(true));
   public static final ctt.e<ctt.a> M = a("doWardenSpawning", ctt.b.c, ctt.a.a(true));
   public static final ctt.e<ctt.a> N = a("forgiveDeadPlayers", ctt.b.b, ctt.a.a(true));
   public static final ctt.e<ctt.a> O = a("universalAnger", ctt.b.b, ctt.a.a(false));
   public static final ctt.e<ctt.d> P = a("playersSleepingPercentage", ctt.b.a, ctt.d.a(100));
   public static final ctt.e<ctt.a> Q = a("blockExplosionDropDecay", ctt.b.d, ctt.a.a(true));
   public static final ctt.e<ctt.a> R = a("mobExplosionDropDecay", ctt.b.d, ctt.a.a(true));
   public static final ctt.e<ctt.a> S = a("tntExplosionDropDecay", ctt.b.d, ctt.a.a(false));
   public static final ctt.e<ctt.d> T = a("snowAccumulationHeight", ctt.b.e, ctt.d.a(1));
   public static final ctt.e<ctt.a> U = a("waterSourceConversion", ctt.b.e, ctt.a.a(true));
   public static final ctt.e<ctt.a> V = a("lavaSourceConversion", ctt.b.e, ctt.a.a(false));
   public static final ctt.e<ctt.a> W = a("globalSoundEvents", ctt.b.g, ctt.a.a(true));
   public static final ctt.e<ctt.a> X = a("doVinesSpread", ctt.b.e, ctt.a.a(true));
   public static final ctt.e<ctt.a> Y = a("enderPearlsVanishOnDeath", ctt.b.a, ctt.a.a(true));
   private final Map<ctt.e<?>, ctt.g<?>> ab;

   private static <T extends ctt.g<T>> ctt.e<T> a(String $$0, ctt.b $$1, ctt.f<T> $$2) {
      ctt.e<T> $$3 = new ctt.e<>($$0, $$1);
      ctt.f<?> $$4 = aa.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public ctt(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public ctt() {
      this.ab = aa.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((ctt.f)$$0.getValue()).a()));
   }

   private ctt(Map<ctt.e<?>, ctt.g<?>> $$0) {
      this.ab = $$0;
   }

   public <T extends ctt.g<T>> T a(ctt.e<T> $$0) {
      return (T)this.ab.get($$0);
   }

   public so a() {
      so $$0 = new so();
      this.ab.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ab.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public ctt b() {
      return new ctt(this.ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((ctt.g)$$0.getValue()).f())));
   }

   public static void a(ctt.c $$0) {
      aa.forEach(($$1, $$2) -> a($$0, (ctt.e<?>)$$1, (ctt.f<?>)$$2));
   }

   private static <T extends ctt.g<T>> void a(ctt.c $$0, ctt.e<?> $$1, ctt.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(ctt $$0, @Nullable MinecraftServer $$1) {
      $$0.ab.keySet().forEach($$2 -> this.a((ctt.e<?>)$$2, $$0, $$1));
   }

   private <T extends ctt.g<T>> void a(ctt.e<T> $$0, ctt $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(ctt.e<ctt.a> $$0) {
      return this.a($$0).a();
   }

   public int c(ctt.e<ctt.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends ctt.g<ctt.a> {
      private boolean b;

      static ctt.f<ctt.a> a(boolean $$0, BiConsumer<MinecraftServer, ctt.a> $$1) {
         return new ctt.f<>(BoolArgumentType::bool, $$1x -> new ctt.a($$1x, $$0), $$1, ctt.c::b);
      }

      static ctt.f<ctt.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(ctt.f<ctt.a> $$0, boolean $$1) {
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

      protected ctt.a d() {
         return this;
      }

      protected ctt.a e() {
         return new ctt.a(this.a, this.b);
      }

      public void a(ctt.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends ctt.g<T>> void a(ctt.e<T> $$0, ctt.f<T> $$1) {
      }

      default void b(ctt.e<ctt.a> $$0, ctt.f<ctt.a> $$1) {
      }

      default void c(ctt.e<ctt.d> $$0, ctt.f<ctt.d> $$1) {
      }
   }

   public static class d extends ctt.g<ctt.d> {
      private int b;

      private static ctt.f<ctt.d> a(int $$0, BiConsumer<MinecraftServer, ctt.d> $$1) {
         return new ctt.f<>(IntegerArgumentType::integer, $$1x -> new ctt.d($$1x, $$0), $$1, ctt.c::c);
      }

      static ctt.f<ctt.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(ctt.f<ctt.d> $$0, int $$1) {
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
               ctt.Z.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected ctt.d d() {
         return this;
      }

      protected ctt.d e() {
         return new ctt.d(this.a, this.b);
      }

      public void a(ctt.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends ctt.g<T>> {
      final String a;
      private final ctt.b b;

      public e(String $$0, ctt.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof ctt.e && ((ctt.e)$$0).a.equals(this.a);
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

      public ctt.b c() {
         return this.b;
      }
   }

   public static class f<T extends ctt.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<ctt.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final ctt.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<ctt.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, ctt.h<T> $$3) {
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

      public void a(ctt.c $$0, ctt.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends ctt.g<T>> {
      protected final ctt.f<T> a;

      public g(ctt.f<T> $$0) {
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

   interface h<T extends ctt.g<T>> {
      void call(ctt.c var1, ctt.e<T> var2, ctt.f<T> var3);
   }
}
