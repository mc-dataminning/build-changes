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

public class czc {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<czc.e<?>, czc.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final czc.e<czc.a> b = a("doFireTick", czc.b.e, czc.a.a(true));
   public static final czc.e<czc.a> c = a("mobGriefing", czc.b.b, czc.a.a(true));
   public static final czc.e<czc.a> d = a("keepInventory", czc.b.a, czc.a.a(false));
   public static final czc.e<czc.a> e = a("doMobSpawning", czc.b.c, czc.a.a(true));
   public static final czc.e<czc.a> f = a("doMobLoot", czc.b.d, czc.a.a(true));
   public static final czc.e<czc.a> g = a("projectilesCanBreakBlocks", czc.b.d, czc.a.a(true));
   public static final czc.e<czc.a> h = a("doTileDrops", czc.b.d, czc.a.a(true));
   public static final czc.e<czc.a> i = a("doEntityDrops", czc.b.d, czc.a.a(true));
   public static final czc.e<czc.a> j = a("commandBlockOutput", czc.b.f, czc.a.a(true));
   public static final czc.e<czc.a> k = a("naturalRegeneration", czc.b.a, czc.a.a(true));
   public static final czc.e<czc.a> l = a("doDaylightCycle", czc.b.e, czc.a.a(true));
   public static final czc.e<czc.a> m = a("logAdminCommands", czc.b.f, czc.a.a(true));
   public static final czc.e<czc.a> n = a("showDeathMessages", czc.b.f, czc.a.a(true));
   public static final czc.e<czc.d> o = a("randomTickSpeed", czc.b.e, czc.d.a(3));
   public static final czc.e<czc.a> p = a("sendCommandFeedback", czc.b.f, czc.a.a(true));
   public static final czc.e<czc.a> q = a("reducedDebugInfo", czc.b.g, czc.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (apv $$3 : $$0.ah().t()) {
         $$3.d.b(new ace($$3, $$2));
      }
   }));
   public static final czc.e<czc.a> r = a("spectatorsGenerateChunks", czc.b.a, czc.a.a(true));
   public static final czc.e<czc.d> s = a("spawnRadius", czc.b.a, czc.d.a(10));
   public static final czc.e<czc.a> t = a("disableElytraMovementCheck", czc.b.a, czc.a.a(false));
   public static final czc.e<czc.d> u = a("maxEntityCramming", czc.b.b, czc.d.a(24));
   public static final czc.e<czc.a> v = a("doWeatherCycle", czc.b.e, czc.a.a(true));
   public static final czc.e<czc.a> w = a("doLimitedCrafting", czc.b.a, czc.a.a(false, ($$0, $$1) -> {
      for (apv $$2 : $$0.ah().t()) {
         $$2.d.b(new ach(ach.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final czc.e<czc.d> x = a("maxCommandChainLength", czc.b.g, czc.d.a(65536));
   public static final czc.e<czc.d> y = a("maxCommandForkCount", czc.b.g, czc.d.a(65536));
   public static final czc.e<czc.d> z = a("commandModificationBlockLimit", czc.b.g, czc.d.a(32768));
   public static final czc.e<czc.a> A = a("announceAdvancements", czc.b.f, czc.a.a(true));
   public static final czc.e<czc.a> B = a("disableRaids", czc.b.b, czc.a.a(false));
   public static final czc.e<czc.a> C = a("doInsomnia", czc.b.c, czc.a.a(true));
   public static final czc.e<czc.a> D = a("doImmediateRespawn", czc.b.a, czc.a.a(false, ($$0, $$1) -> {
      for (apv $$2 : $$0.ah().t()) {
         $$2.d.b(new ach(ach.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final czc.e<czc.d> E = a("playersNetherPortalDefaultDelay", czc.b.a, czc.d.a(80));
   public static final czc.e<czc.d> F = a("playersNetherPortalCreativeDelay", czc.b.a, czc.d.a(1));
   public static final czc.e<czc.a> G = a("drowningDamage", czc.b.a, czc.a.a(true));
   public static final czc.e<czc.a> H = a("fallDamage", czc.b.a, czc.a.a(true));
   public static final czc.e<czc.a> I = a("fireDamage", czc.b.a, czc.a.a(true));
   public static final czc.e<czc.a> J = a("freezeDamage", czc.b.a, czc.a.a(true));
   public static final czc.e<czc.a> K = a("doPatrolSpawning", czc.b.c, czc.a.a(true));
   public static final czc.e<czc.a> L = a("doTraderSpawning", czc.b.c, czc.a.a(true));
   public static final czc.e<czc.a> M = a("doWardenSpawning", czc.b.c, czc.a.a(true));
   public static final czc.e<czc.a> N = a("forgiveDeadPlayers", czc.b.b, czc.a.a(true));
   public static final czc.e<czc.a> O = a("universalAnger", czc.b.b, czc.a.a(false));
   public static final czc.e<czc.d> P = a("playersSleepingPercentage", czc.b.a, czc.d.a(100));
   public static final czc.e<czc.a> Q = a("blockExplosionDropDecay", czc.b.d, czc.a.a(true));
   public static final czc.e<czc.a> R = a("mobExplosionDropDecay", czc.b.d, czc.a.a(true));
   public static final czc.e<czc.a> S = a("tntExplosionDropDecay", czc.b.d, czc.a.a(false));
   public static final czc.e<czc.d> T = a("snowAccumulationHeight", czc.b.e, czc.d.a(1));
   public static final czc.e<czc.a> U = a("waterSourceConversion", czc.b.e, czc.a.a(true));
   public static final czc.e<czc.a> V = a("lavaSourceConversion", czc.b.e, czc.a.a(false));
   public static final czc.e<czc.a> W = a("globalSoundEvents", czc.b.g, czc.a.a(true));
   public static final czc.e<czc.a> X = a("doVinesSpread", czc.b.e, czc.a.a(true));
   public static final czc.e<czc.a> Y = a("enderPearlsVanishOnDeath", czc.b.a, czc.a.a(true));
   public static final czc.e<czc.d> Z = a("spawnChunkRadius", czc.b.g, czc.d.a(2, 0, 32, ($$0, $$1) -> {
      apu $$2 = $$0.I();
      $$2.a($$2.U(), $$2.V());
   }));
   private final Map<czc.e<?>, czc.g<?>> ac;

   private static <T extends czc.g<T>> czc.e<T> a(String $$0, czc.b $$1, czc.f<T> $$2) {
      czc.e<T> $$3 = new czc.e<>($$0, $$1);
      czc.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public czc(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public czc() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((czc.f)$$0.getValue()).a()));
   }

   private czc(Map<czc.e<?>, czc.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends czc.g<T>> T a(czc.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public to a() {
      to $$0 = new to();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public czc b() {
      return new czc(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((czc.g)$$0.getValue()).f())));
   }

   public static void a(czc.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (czc.e<?>)$$1, (czc.f<?>)$$2));
   }

   private static <T extends czc.g<T>> void a(czc.c $$0, czc.e<?> $$1, czc.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(czc $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((czc.e<?>)$$2, $$0, $$1));
   }

   private <T extends czc.g<T>> void a(czc.e<T> $$0, czc $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(czc.e<czc.a> $$0) {
      return this.a($$0).a();
   }

   public int c(czc.e<czc.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends czc.g<czc.a> {
      private boolean b;

      static czc.f<czc.a> a(boolean $$0, BiConsumer<MinecraftServer, czc.a> $$1) {
         return new czc.f<>(BoolArgumentType::bool, $$1x -> new czc.a($$1x, $$0), $$1, czc.c::b);
      }

      static czc.f<czc.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(czc.f<czc.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<dv> $$0, String $$1) {
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

      protected czc.a d() {
         return this;
      }

      protected czc.a e() {
         return new czc.a(this.a, this.b);
      }

      public void a(czc.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends czc.g<T>> void a(czc.e<T> $$0, czc.f<T> $$1) {
      }

      default void b(czc.e<czc.a> $$0, czc.f<czc.a> $$1) {
      }

      default void c(czc.e<czc.d> $$0, czc.f<czc.d> $$1) {
      }
   }

   public static class d extends czc.g<czc.d> {
      private int b;

      private static czc.f<czc.d> a(int $$0, BiConsumer<MinecraftServer, czc.d> $$1) {
         return new czc.f<>(IntegerArgumentType::integer, $$1x -> new czc.d($$1x, $$0), $$1, czc.c::c);
      }

      static czc.f<czc.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, czc.d> $$3) {
         return new czc.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new czc.d($$1x, $$0), $$3, czc.c::c);
      }

      static czc.f<czc.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(czc.f<czc.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<dv> $$0, String $$1) {
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
               czc.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected czc.d d() {
         return this;
      }

      protected czc.d e() {
         return new czc.d(this.a, this.b);
      }

      public void a(czc.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends czc.g<T>> {
      final String a;
      private final czc.b b;

      public e(String $$0, czc.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof czc.e && ((czc.e)$$0).a.equals(this.a);
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

      public czc.b c() {
         return this.b;
      }
   }

   public static class f<T extends czc.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<czc.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final czc.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<czc.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, czc.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<dv, ?> a(String $$0) {
         return dw.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(czc.c $$0, czc.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends czc.g<T>> {
      protected final czc.f<T> a;

      public g(czc.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<dv> var1, String var2);

      public void b(CommandContext<dv> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((dv)$$0.getSource()).l());
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

   interface h<T extends czc.g<T>> {
      void call(czc.c var1, czc.e<T> var2, czc.f<T> var3);
   }
}
