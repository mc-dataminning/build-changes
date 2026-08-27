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

public class cvj {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<cvj.e<?>, cvj.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cvj.e<cvj.a> b = a("doFireTick", cvj.b.e, cvj.a.a(true));
   public static final cvj.e<cvj.a> c = a("mobGriefing", cvj.b.b, cvj.a.a(true));
   public static final cvj.e<cvj.a> d = a("keepInventory", cvj.b.a, cvj.a.a(false));
   public static final cvj.e<cvj.a> e = a("doMobSpawning", cvj.b.c, cvj.a.a(true));
   public static final cvj.e<cvj.a> f = a("doMobLoot", cvj.b.d, cvj.a.a(true));
   public static final cvj.e<cvj.a> g = a("projectilesCanBreakBlocks", cvj.b.d, cvj.a.a(true));
   public static final cvj.e<cvj.a> h = a("doTileDrops", cvj.b.d, cvj.a.a(true));
   public static final cvj.e<cvj.a> i = a("doEntityDrops", cvj.b.d, cvj.a.a(true));
   public static final cvj.e<cvj.a> j = a("commandBlockOutput", cvj.b.f, cvj.a.a(true));
   public static final cvj.e<cvj.a> k = a("naturalRegeneration", cvj.b.a, cvj.a.a(true));
   public static final cvj.e<cvj.a> l = a("doDaylightCycle", cvj.b.e, cvj.a.a(true));
   public static final cvj.e<cvj.a> m = a("logAdminCommands", cvj.b.f, cvj.a.a(true));
   public static final cvj.e<cvj.a> n = a("showDeathMessages", cvj.b.f, cvj.a.a(true));
   public static final cvj.e<cvj.d> o = a("randomTickSpeed", cvj.b.e, cvj.d.a(3));
   public static final cvj.e<cvj.a> p = a("sendCommandFeedback", cvj.b.f, cvj.a.a(true));
   public static final cvj.e<cvj.a> q = a("reducedDebugInfo", cvj.b.g, cvj.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aow $$3 : $$0.ae().t()) {
         $$3.d.b(new abj($$3, $$2));
      }
   }));
   public static final cvj.e<cvj.a> r = a("spectatorsGenerateChunks", cvj.b.a, cvj.a.a(true));
   public static final cvj.e<cvj.d> s = a("spawnRadius", cvj.b.a, cvj.d.a(10));
   public static final cvj.e<cvj.a> t = a("disableElytraMovementCheck", cvj.b.a, cvj.a.a(false));
   public static final cvj.e<cvj.d> u = a("maxEntityCramming", cvj.b.b, cvj.d.a(24));
   public static final cvj.e<cvj.a> v = a("doWeatherCycle", cvj.b.e, cvj.a.a(true));
   public static final cvj.e<cvj.a> w = a("doLimitedCrafting", cvj.b.a, cvj.a.a(false, ($$0, $$1) -> {
      for (aow $$2 : $$0.ae().t()) {
         $$2.d.b(new abm(abm.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cvj.e<cvj.d> x = a("maxCommandChainLength", cvj.b.g, cvj.d.a(65536));
   public static final cvj.e<cvj.d> y = a("maxCommandForkCount", cvj.b.g, cvj.d.a(65536));
   public static final cvj.e<cvj.d> z = a("commandModificationBlockLimit", cvj.b.g, cvj.d.a(32768));
   public static final cvj.e<cvj.a> A = a("announceAdvancements", cvj.b.f, cvj.a.a(true));
   public static final cvj.e<cvj.a> B = a("disableRaids", cvj.b.b, cvj.a.a(false));
   public static final cvj.e<cvj.a> C = a("doInsomnia", cvj.b.c, cvj.a.a(true));
   public static final cvj.e<cvj.a> D = a("doImmediateRespawn", cvj.b.a, cvj.a.a(false, ($$0, $$1) -> {
      for (aow $$2 : $$0.ae().t()) {
         $$2.d.b(new abm(abm.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cvj.e<cvj.d> E = a("playersNetherPortalDefaultDelay", cvj.b.a, cvj.d.a(80));
   public static final cvj.e<cvj.d> F = a("playersNetherPortalCreativeDelay", cvj.b.a, cvj.d.a(1));
   public static final cvj.e<cvj.a> G = a("drowningDamage", cvj.b.a, cvj.a.a(true));
   public static final cvj.e<cvj.a> H = a("fallDamage", cvj.b.a, cvj.a.a(true));
   public static final cvj.e<cvj.a> I = a("fireDamage", cvj.b.a, cvj.a.a(true));
   public static final cvj.e<cvj.a> J = a("freezeDamage", cvj.b.a, cvj.a.a(true));
   public static final cvj.e<cvj.a> K = a("doPatrolSpawning", cvj.b.c, cvj.a.a(true));
   public static final cvj.e<cvj.a> L = a("doTraderSpawning", cvj.b.c, cvj.a.a(true));
   public static final cvj.e<cvj.a> M = a("doWardenSpawning", cvj.b.c, cvj.a.a(true));
   public static final cvj.e<cvj.a> N = a("forgiveDeadPlayers", cvj.b.b, cvj.a.a(true));
   public static final cvj.e<cvj.a> O = a("universalAnger", cvj.b.b, cvj.a.a(false));
   public static final cvj.e<cvj.d> P = a("playersSleepingPercentage", cvj.b.a, cvj.d.a(100));
   public static final cvj.e<cvj.a> Q = a("blockExplosionDropDecay", cvj.b.d, cvj.a.a(true));
   public static final cvj.e<cvj.a> R = a("mobExplosionDropDecay", cvj.b.d, cvj.a.a(true));
   public static final cvj.e<cvj.a> S = a("tntExplosionDropDecay", cvj.b.d, cvj.a.a(false));
   public static final cvj.e<cvj.d> T = a("snowAccumulationHeight", cvj.b.e, cvj.d.a(1));
   public static final cvj.e<cvj.a> U = a("waterSourceConversion", cvj.b.e, cvj.a.a(true));
   public static final cvj.e<cvj.a> V = a("lavaSourceConversion", cvj.b.e, cvj.a.a(false));
   public static final cvj.e<cvj.a> W = a("globalSoundEvents", cvj.b.g, cvj.a.a(true));
   public static final cvj.e<cvj.a> X = a("doVinesSpread", cvj.b.e, cvj.a.a(true));
   public static final cvj.e<cvj.a> Y = a("enderPearlsVanishOnDeath", cvj.b.a, cvj.a.a(true));
   public static final cvj.e<cvj.d> Z = a("spawnChunkRadius", cvj.b.g, cvj.d.a(2, 0, 32, ($$0, $$1) -> {
      aov $$2 = $$0.F();
      $$2.a($$2.T(), $$2.U());
   }));
   private final Map<cvj.e<?>, cvj.g<?>> ac;

   private static <T extends cvj.g<T>> cvj.e<T> a(String $$0, cvj.b $$1, cvj.f<T> $$2) {
      cvj.e<T> $$3 = new cvj.e<>($$0, $$1);
      cvj.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cvj(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cvj() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cvj.f)$$0.getValue()).a()));
   }

   private cvj(Map<cvj.e<?>, cvj.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends cvj.g<T>> T a(cvj.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public sw a() {
      sw $$0 = new sw();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public cvj b() {
      return new cvj(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cvj.g)$$0.getValue()).f())));
   }

   public static void a(cvj.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (cvj.e<?>)$$1, (cvj.f<?>)$$2));
   }

   private static <T extends cvj.g<T>> void a(cvj.c $$0, cvj.e<?> $$1, cvj.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cvj $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((cvj.e<?>)$$2, $$0, $$1));
   }

   private <T extends cvj.g<T>> void a(cvj.e<T> $$0, cvj $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cvj.e<cvj.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cvj.e<cvj.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cvj.g<cvj.a> {
      private boolean b;

      static cvj.f<cvj.a> a(boolean $$0, BiConsumer<MinecraftServer, cvj.a> $$1) {
         return new cvj.f<>(BoolArgumentType::bool, $$1x -> new cvj.a($$1x, $$0), $$1, cvj.c::b);
      }

      static cvj.f<cvj.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cvj.f<cvj.a> $$0, boolean $$1) {
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

      protected cvj.a d() {
         return this;
      }

      protected cvj.a e() {
         return new cvj.a(this.a, this.b);
      }

      public void a(cvj.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cvj.g<T>> void a(cvj.e<T> $$0, cvj.f<T> $$1) {
      }

      default void b(cvj.e<cvj.a> $$0, cvj.f<cvj.a> $$1) {
      }

      default void c(cvj.e<cvj.d> $$0, cvj.f<cvj.d> $$1) {
      }
   }

   public static class d extends cvj.g<cvj.d> {
      private int b;

      private static cvj.f<cvj.d> a(int $$0, BiConsumer<MinecraftServer, cvj.d> $$1) {
         return new cvj.f<>(IntegerArgumentType::integer, $$1x -> new cvj.d($$1x, $$0), $$1, cvj.c::c);
      }

      static cvj.f<cvj.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, cvj.d> $$3) {
         return new cvj.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new cvj.d($$1x, $$0), $$3, cvj.c::c);
      }

      static cvj.f<cvj.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cvj.f<cvj.d> $$0, int $$1) {
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
               cvj.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cvj.d d() {
         return this;
      }

      protected cvj.d e() {
         return new cvj.d(this.a, this.b);
      }

      public void a(cvj.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cvj.g<T>> {
      final String a;
      private final cvj.b b;

      public e(String $$0, cvj.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cvj.e && ((cvj.e)$$0).a.equals(this.a);
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

      public cvj.b c() {
         return this.b;
      }
   }

   public static class f<T extends cvj.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<cvj.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cvj.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cvj.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cvj.h<T> $$3) {
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

      public void a(cvj.c $$0, cvj.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cvj.g<T>> {
      protected final cvj.f<T> a;

      public g(cvj.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<du> var1, String var2);

      public void b(CommandContext<du> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((du)$$0.getSource()).l());
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

   interface h<T extends cvj.g<T>> {
      void call(cvj.c var1, cvj.e<T> var2, cvj.f<T> var3);
   }
}
