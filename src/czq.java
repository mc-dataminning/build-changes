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

public class czq {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<czq.e<?>, czq.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final czq.e<czq.a> b = a("doFireTick", czq.b.e, czq.a.a(true));
   public static final czq.e<czq.a> c = a("mobGriefing", czq.b.b, czq.a.a(true));
   public static final czq.e<czq.a> d = a("keepInventory", czq.b.a, czq.a.a(false));
   public static final czq.e<czq.a> e = a("doMobSpawning", czq.b.c, czq.a.a(true));
   public static final czq.e<czq.a> f = a("doMobLoot", czq.b.d, czq.a.a(true));
   public static final czq.e<czq.a> g = a("projectilesCanBreakBlocks", czq.b.d, czq.a.a(true));
   public static final czq.e<czq.a> h = a("doTileDrops", czq.b.d, czq.a.a(true));
   public static final czq.e<czq.a> i = a("doEntityDrops", czq.b.d, czq.a.a(true));
   public static final czq.e<czq.a> j = a("commandBlockOutput", czq.b.f, czq.a.a(true));
   public static final czq.e<czq.a> k = a("naturalRegeneration", czq.b.a, czq.a.a(true));
   public static final czq.e<czq.a> l = a("doDaylightCycle", czq.b.e, czq.a.a(true));
   public static final czq.e<czq.a> m = a("logAdminCommands", czq.b.f, czq.a.a(true));
   public static final czq.e<czq.a> n = a("showDeathMessages", czq.b.f, czq.a.a(true));
   public static final czq.e<czq.d> o = a("randomTickSpeed", czq.b.e, czq.d.a(3));
   public static final czq.e<czq.a> p = a("sendCommandFeedback", czq.b.f, czq.a.a(true));
   public static final czq.e<czq.a> q = a("reducedDebugInfo", czq.b.g, czq.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aqf $$3 : $$0.ah().t()) {
         $$3.d.b(new aco($$3, $$2));
      }
   }));
   public static final czq.e<czq.a> r = a("spectatorsGenerateChunks", czq.b.a, czq.a.a(true));
   public static final czq.e<czq.d> s = a("spawnRadius", czq.b.a, czq.d.a(10));
   public static final czq.e<czq.a> t = a("disableElytraMovementCheck", czq.b.a, czq.a.a(false));
   public static final czq.e<czq.d> u = a("maxEntityCramming", czq.b.b, czq.d.a(24));
   public static final czq.e<czq.a> v = a("doWeatherCycle", czq.b.e, czq.a.a(true));
   public static final czq.e<czq.a> w = a("doLimitedCrafting", czq.b.a, czq.a.a(false, ($$0, $$1) -> {
      for (aqf $$2 : $$0.ah().t()) {
         $$2.d.b(new acr(acr.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final czq.e<czq.d> x = a("maxCommandChainLength", czq.b.g, czq.d.a(65536));
   public static final czq.e<czq.d> y = a("maxCommandForkCount", czq.b.g, czq.d.a(65536));
   public static final czq.e<czq.d> z = a("commandModificationBlockLimit", czq.b.g, czq.d.a(32768));
   public static final czq.e<czq.a> A = a("announceAdvancements", czq.b.f, czq.a.a(true));
   public static final czq.e<czq.a> B = a("disableRaids", czq.b.b, czq.a.a(false));
   public static final czq.e<czq.a> C = a("doInsomnia", czq.b.c, czq.a.a(true));
   public static final czq.e<czq.a> D = a("doImmediateRespawn", czq.b.a, czq.a.a(false, ($$0, $$1) -> {
      for (aqf $$2 : $$0.ah().t()) {
         $$2.d.b(new acr(acr.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final czq.e<czq.d> E = a("playersNetherPortalDefaultDelay", czq.b.a, czq.d.a(80));
   public static final czq.e<czq.d> F = a("playersNetherPortalCreativeDelay", czq.b.a, czq.d.a(1));
   public static final czq.e<czq.a> G = a("drowningDamage", czq.b.a, czq.a.a(true));
   public static final czq.e<czq.a> H = a("fallDamage", czq.b.a, czq.a.a(true));
   public static final czq.e<czq.a> I = a("fireDamage", czq.b.a, czq.a.a(true));
   public static final czq.e<czq.a> J = a("freezeDamage", czq.b.a, czq.a.a(true));
   public static final czq.e<czq.a> K = a("doPatrolSpawning", czq.b.c, czq.a.a(true));
   public static final czq.e<czq.a> L = a("doTraderSpawning", czq.b.c, czq.a.a(true));
   public static final czq.e<czq.a> M = a("doWardenSpawning", czq.b.c, czq.a.a(true));
   public static final czq.e<czq.a> N = a("forgiveDeadPlayers", czq.b.b, czq.a.a(true));
   public static final czq.e<czq.a> O = a("universalAnger", czq.b.b, czq.a.a(false));
   public static final czq.e<czq.d> P = a("playersSleepingPercentage", czq.b.a, czq.d.a(100));
   public static final czq.e<czq.a> Q = a("blockExplosionDropDecay", czq.b.d, czq.a.a(true));
   public static final czq.e<czq.a> R = a("mobExplosionDropDecay", czq.b.d, czq.a.a(true));
   public static final czq.e<czq.a> S = a("tntExplosionDropDecay", czq.b.d, czq.a.a(false));
   public static final czq.e<czq.d> T = a("snowAccumulationHeight", czq.b.e, czq.d.a(1));
   public static final czq.e<czq.a> U = a("waterSourceConversion", czq.b.e, czq.a.a(true));
   public static final czq.e<czq.a> V = a("lavaSourceConversion", czq.b.e, czq.a.a(false));
   public static final czq.e<czq.a> W = a("globalSoundEvents", czq.b.g, czq.a.a(true));
   public static final czq.e<czq.a> X = a("doVinesSpread", czq.b.e, czq.a.a(true));
   public static final czq.e<czq.a> Y = a("enderPearlsVanishOnDeath", czq.b.a, czq.a.a(true));
   public static final czq.e<czq.d> Z = a("spawnChunkRadius", czq.b.g, czq.d.a(2, 0, 32, ($$0, $$1) -> {
      aqe $$2 = $$0.I();
      $$2.a($$2.U(), $$2.V());
   }));
   private final Map<czq.e<?>, czq.g<?>> ac;

   private static <T extends czq.g<T>> czq.e<T> a(String $$0, czq.b $$1, czq.f<T> $$2) {
      czq.e<T> $$3 = new czq.e<>($$0, $$1);
      czq.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public czq(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public czq() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((czq.f)$$0.getValue()).a()));
   }

   private czq(Map<czq.e<?>, czq.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends czq.g<T>> T a(czq.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public ty a() {
      ty $$0 = new ty();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public czq b() {
      return new czq(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((czq.g)$$0.getValue()).f())));
   }

   public static void a(czq.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (czq.e<?>)$$1, (czq.f<?>)$$2));
   }

   private static <T extends czq.g<T>> void a(czq.c $$0, czq.e<?> $$1, czq.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(czq $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((czq.e<?>)$$2, $$0, $$1));
   }

   private <T extends czq.g<T>> void a(czq.e<T> $$0, czq $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(czq.e<czq.a> $$0) {
      return this.a($$0).a();
   }

   public int c(czq.e<czq.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends czq.g<czq.a> {
      private boolean b;

      static czq.f<czq.a> a(boolean $$0, BiConsumer<MinecraftServer, czq.a> $$1) {
         return new czq.f<>(BoolArgumentType::bool, $$1x -> new czq.a($$1x, $$0), $$1, czq.c::b);
      }

      static czq.f<czq.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(czq.f<czq.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ec> $$0, String $$1) {
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

      protected czq.a d() {
         return this;
      }

      protected czq.a e() {
         return new czq.a(this.a, this.b);
      }

      public void a(czq.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends czq.g<T>> void a(czq.e<T> $$0, czq.f<T> $$1) {
      }

      default void b(czq.e<czq.a> $$0, czq.f<czq.a> $$1) {
      }

      default void c(czq.e<czq.d> $$0, czq.f<czq.d> $$1) {
      }
   }

   public static class d extends czq.g<czq.d> {
      private int b;

      private static czq.f<czq.d> a(int $$0, BiConsumer<MinecraftServer, czq.d> $$1) {
         return new czq.f<>(IntegerArgumentType::integer, $$1x -> new czq.d($$1x, $$0), $$1, czq.c::c);
      }

      static czq.f<czq.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, czq.d> $$3) {
         return new czq.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new czq.d($$1x, $$0), $$3, czq.c::c);
      }

      static czq.f<czq.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(czq.f<czq.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ec> $$0, String $$1) {
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
               czq.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected czq.d d() {
         return this;
      }

      protected czq.d e() {
         return new czq.d(this.a, this.b);
      }

      public void a(czq.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends czq.g<T>> {
      final String a;
      private final czq.b b;

      public e(String $$0, czq.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof czq.e && ((czq.e)$$0).a.equals(this.a);
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

      public czq.b c() {
         return this.b;
      }
   }

   public static class f<T extends czq.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<czq.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final czq.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<czq.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, czq.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<ec, ?> a(String $$0) {
         return ed.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(czq.c $$0, czq.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends czq.g<T>> {
      protected final czq.f<T> a;

      public g(czq.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ec> var1, String var2);

      public void b(CommandContext<ec> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ec)$$0.getSource()).l());
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

   interface h<T extends czq.g<T>> {
      void call(czq.c var1, czq.e<T> var2, czq.f<T> var3);
   }
}
