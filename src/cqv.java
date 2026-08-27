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

public class cqv {
   public static final int a = 3;
   static final Logger W = LogUtils.getLogger();
   private static final Map<cqv.e<?>, cqv.f<?>> X = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cqv.e<cqv.a> b = a("doFireTick", cqv.b.e, cqv.a.a(true));
   public static final cqv.e<cqv.a> c = a("mobGriefing", cqv.b.b, cqv.a.a(true));
   public static final cqv.e<cqv.a> d = a("keepInventory", cqv.b.a, cqv.a.a(false));
   public static final cqv.e<cqv.a> e = a("doMobSpawning", cqv.b.c, cqv.a.a(true));
   public static final cqv.e<cqv.a> f = a("doMobLoot", cqv.b.d, cqv.a.a(true));
   public static final cqv.e<cqv.a> g = a("doTileDrops", cqv.b.d, cqv.a.a(true));
   public static final cqv.e<cqv.a> h = a("doEntityDrops", cqv.b.d, cqv.a.a(true));
   public static final cqv.e<cqv.a> i = a("commandBlockOutput", cqv.b.f, cqv.a.a(true));
   public static final cqv.e<cqv.a> j = a("naturalRegeneration", cqv.b.a, cqv.a.a(true));
   public static final cqv.e<cqv.a> k = a("doDaylightCycle", cqv.b.e, cqv.a.a(true));
   public static final cqv.e<cqv.a> l = a("logAdminCommands", cqv.b.f, cqv.a.a(true));
   public static final cqv.e<cqv.a> m = a("showDeathMessages", cqv.b.f, cqv.a.a(true));
   public static final cqv.e<cqv.d> n = a("randomTickSpeed", cqv.b.e, cqv.d.a(3));
   public static final cqv.e<cqv.a> o = a("sendCommandFeedback", cqv.b.f, cqv.a.a(true));
   public static final cqv.e<cqv.a> p = a("reducedDebugInfo", cqv.b.g, cqv.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (alr $$3 : $$0.ac().t()) {
         $$3.c.b(new yw($$3, $$2));
      }
   }));
   public static final cqv.e<cqv.a> q = a("spectatorsGenerateChunks", cqv.b.a, cqv.a.a(true));
   public static final cqv.e<cqv.d> r = a("spawnRadius", cqv.b.a, cqv.d.a(10));
   public static final cqv.e<cqv.a> s = a("disableElytraMovementCheck", cqv.b.a, cqv.a.a(false));
   public static final cqv.e<cqv.d> t = a("maxEntityCramming", cqv.b.b, cqv.d.a(24));
   public static final cqv.e<cqv.a> u = a("doWeatherCycle", cqv.b.e, cqv.a.a(true));
   public static final cqv.e<cqv.a> v = a("doLimitedCrafting", cqv.b.a, cqv.a.a(false, ($$0, $$1) -> {
      for (alr $$2 : $$0.ac().t()) {
         $$2.c.b(new yz(yz.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cqv.e<cqv.d> w = a("maxCommandChainLength", cqv.b.g, cqv.d.a(65536));
   public static final cqv.e<cqv.d> x = a("maxCommandForkCount", cqv.b.g, cqv.d.a(65536));
   public static final cqv.e<cqv.d> y = a("commandModificationBlockLimit", cqv.b.g, cqv.d.a(32768));
   public static final cqv.e<cqv.a> z = a("announceAdvancements", cqv.b.f, cqv.a.a(true));
   public static final cqv.e<cqv.a> A = a("disableRaids", cqv.b.b, cqv.a.a(false));
   public static final cqv.e<cqv.a> B = a("doInsomnia", cqv.b.c, cqv.a.a(true));
   public static final cqv.e<cqv.a> C = a("doImmediateRespawn", cqv.b.a, cqv.a.a(false, ($$0, $$1) -> {
      for (alr $$2 : $$0.ac().t()) {
         $$2.c.b(new yz(yz.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cqv.e<cqv.a> D = a("drowningDamage", cqv.b.a, cqv.a.a(true));
   public static final cqv.e<cqv.a> E = a("fallDamage", cqv.b.a, cqv.a.a(true));
   public static final cqv.e<cqv.a> F = a("fireDamage", cqv.b.a, cqv.a.a(true));
   public static final cqv.e<cqv.a> G = a("freezeDamage", cqv.b.a, cqv.a.a(true));
   public static final cqv.e<cqv.a> H = a("doPatrolSpawning", cqv.b.c, cqv.a.a(true));
   public static final cqv.e<cqv.a> I = a("doTraderSpawning", cqv.b.c, cqv.a.a(true));
   public static final cqv.e<cqv.a> J = a("doWardenSpawning", cqv.b.c, cqv.a.a(true));
   public static final cqv.e<cqv.a> K = a("forgiveDeadPlayers", cqv.b.b, cqv.a.a(true));
   public static final cqv.e<cqv.a> L = a("universalAnger", cqv.b.b, cqv.a.a(false));
   public static final cqv.e<cqv.d> M = a("playersSleepingPercentage", cqv.b.a, cqv.d.a(100));
   public static final cqv.e<cqv.a> N = a("blockExplosionDropDecay", cqv.b.d, cqv.a.a(true));
   public static final cqv.e<cqv.a> O = a("mobExplosionDropDecay", cqv.b.d, cqv.a.a(true));
   public static final cqv.e<cqv.a> P = a("tntExplosionDropDecay", cqv.b.d, cqv.a.a(false));
   public static final cqv.e<cqv.d> Q = a("snowAccumulationHeight", cqv.b.e, cqv.d.a(1));
   public static final cqv.e<cqv.a> R = a("waterSourceConversion", cqv.b.e, cqv.a.a(true));
   public static final cqv.e<cqv.a> S = a("lavaSourceConversion", cqv.b.e, cqv.a.a(false));
   public static final cqv.e<cqv.a> T = a("globalSoundEvents", cqv.b.g, cqv.a.a(true));
   public static final cqv.e<cqv.a> U = a("doVinesSpread", cqv.b.e, cqv.a.a(true));
   public static final cqv.e<cqv.a> V = a("enderPearlsVanishOnDeath", cqv.b.a, cqv.a.a(true));
   private final Map<cqv.e<?>, cqv.g<?>> Y;

   private static <T extends cqv.g<T>> cqv.e<T> a(String $$0, cqv.b $$1, cqv.f<T> $$2) {
      cqv.e<T> $$3 = new cqv.e<>($$0, $$1);
      cqv.f<?> $$4 = X.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cqv(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cqv() {
      this.Y = X.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cqv.f)$$0.getValue()).a()));
   }

   private cqv(Map<cqv.e<?>, cqv.g<?>> $$0) {
      this.Y = $$0;
   }

   public <T extends cqv.g<T>> T a(cqv.e<T> $$0) {
      return (T)this.Y.get($$0);
   }

   public rt a() {
      rt $$0 = new rt();
      this.Y.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.Y.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public cqv b() {
      return new cqv(this.Y.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cqv.g)$$0.getValue()).f())));
   }

   public static void a(cqv.c $$0) {
      X.forEach(($$1, $$2) -> a($$0, (cqv.e<?>)$$1, (cqv.f<?>)$$2));
   }

   private static <T extends cqv.g<T>> void a(cqv.c $$0, cqv.e<?> $$1, cqv.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cqv $$0, @Nullable MinecraftServer $$1) {
      $$0.Y.keySet().forEach($$2 -> this.a((cqv.e<?>)$$2, $$0, $$1));
   }

   private <T extends cqv.g<T>> void a(cqv.e<T> $$0, cqv $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cqv.e<cqv.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cqv.e<cqv.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cqv.g<cqv.a> {
      private boolean b;

      static cqv.f<cqv.a> a(boolean $$0, BiConsumer<MinecraftServer, cqv.a> $$1) {
         return new cqv.f<>(BoolArgumentType::bool, $$1x -> new cqv.a($$1x, $$0), $$1, cqv.c::b);
      }

      static cqv.f<cqv.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cqv.f<cqv.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<du> $$0, String $$1) {
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

      protected cqv.a d() {
         return this;
      }

      protected cqv.a e() {
         return new cqv.a(this.a, this.b);
      }

      public void a(cqv.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cqv.g<T>> void a(cqv.e<T> $$0, cqv.f<T> $$1) {
      }

      default void b(cqv.e<cqv.a> $$0, cqv.f<cqv.a> $$1) {
      }

      default void c(cqv.e<cqv.d> $$0, cqv.f<cqv.d> $$1) {
      }
   }

   public static class d extends cqv.g<cqv.d> {
      private int b;

      private static cqv.f<cqv.d> a(int $$0, BiConsumer<MinecraftServer, cqv.d> $$1) {
         return new cqv.f<>(IntegerArgumentType::integer, $$1x -> new cqv.d($$1x, $$0), $$1, cqv.c::c);
      }

      static cqv.f<cqv.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cqv.f<cqv.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<du> $$0, String $$1) {
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
               cqv.W.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cqv.d d() {
         return this;
      }

      protected cqv.d e() {
         return new cqv.d(this.a, this.b);
      }

      public void a(cqv.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cqv.g<T>> {
      final String a;
      private final cqv.b b;

      public e(String $$0, cqv.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cqv.e && ((cqv.e)$$0).a.equals(this.a);
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

      public cqv.b c() {
         return this.b;
      }
   }

   public static class f<T extends cqv.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<cqv.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cqv.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cqv.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cqv.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<du, ?> a(String $$0) {
         return dv.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(cqv.c $$0, cqv.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cqv.g<T>> {
      protected final cqv.f<T> a;

      public g(cqv.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<du> var1, String var2);

      public void b(CommandContext<du> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((du)$$0.getSource()).m());
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

   interface h<T extends cqv.g<T>> {
      void call(cqv.c var1, cqv.e<T> var2, cqv.f<T> var3);
   }
}
