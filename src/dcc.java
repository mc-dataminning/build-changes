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

public class dcc {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<dcc.e<?>, dcc.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dcc.e<dcc.a> b = a("doFireTick", dcc.b.e, dcc.a.a(true));
   public static final dcc.e<dcc.a> c = a("mobGriefing", dcc.b.b, dcc.a.a(true));
   public static final dcc.e<dcc.a> d = a("keepInventory", dcc.b.a, dcc.a.a(false));
   public static final dcc.e<dcc.a> e = a("doMobSpawning", dcc.b.c, dcc.a.a(true));
   public static final dcc.e<dcc.a> f = a("doMobLoot", dcc.b.d, dcc.a.a(true));
   public static final dcc.e<dcc.a> g = a("projectilesCanBreakBlocks", dcc.b.d, dcc.a.a(true));
   public static final dcc.e<dcc.a> h = a("doTileDrops", dcc.b.d, dcc.a.a(true));
   public static final dcc.e<dcc.a> i = a("doEntityDrops", dcc.b.d, dcc.a.a(true));
   public static final dcc.e<dcc.a> j = a("commandBlockOutput", dcc.b.f, dcc.a.a(true));
   public static final dcc.e<dcc.a> k = a("naturalRegeneration", dcc.b.a, dcc.a.a(true));
   public static final dcc.e<dcc.a> l = a("doDaylightCycle", dcc.b.e, dcc.a.a(true));
   public static final dcc.e<dcc.a> m = a("logAdminCommands", dcc.b.f, dcc.a.a(true));
   public static final dcc.e<dcc.a> n = a("showDeathMessages", dcc.b.f, dcc.a.a(true));
   public static final dcc.e<dcc.d> o = a("randomTickSpeed", dcc.b.e, dcc.d.a(3));
   public static final dcc.e<dcc.a> p = a("sendCommandFeedback", dcc.b.f, dcc.a.a(true));
   public static final dcc.e<dcc.a> q = a("reducedDebugInfo", dcc.b.g, dcc.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aqn $$3 : $$0.ai().t()) {
         $$3.c.b(new acr($$3, $$2));
      }
   }));
   public static final dcc.e<dcc.a> r = a("spectatorsGenerateChunks", dcc.b.a, dcc.a.a(true));
   public static final dcc.e<dcc.d> s = a("spawnRadius", dcc.b.a, dcc.d.a(10));
   public static final dcc.e<dcc.a> t = a("disableElytraMovementCheck", dcc.b.a, dcc.a.a(false));
   public static final dcc.e<dcc.d> u = a("maxEntityCramming", dcc.b.b, dcc.d.a(24));
   public static final dcc.e<dcc.a> v = a("doWeatherCycle", dcc.b.e, dcc.a.a(true));
   public static final dcc.e<dcc.a> w = a("doLimitedCrafting", dcc.b.a, dcc.a.a(false, ($$0, $$1) -> {
      for (aqn $$2 : $$0.ai().t()) {
         $$2.c.b(new acu(acu.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dcc.e<dcc.d> x = a("maxCommandChainLength", dcc.b.g, dcc.d.a(65536));
   public static final dcc.e<dcc.d> y = a("maxCommandForkCount", dcc.b.g, dcc.d.a(65536));
   public static final dcc.e<dcc.d> z = a("commandModificationBlockLimit", dcc.b.g, dcc.d.a(32768));
   public static final dcc.e<dcc.a> A = a("announceAdvancements", dcc.b.f, dcc.a.a(true));
   public static final dcc.e<dcc.a> B = a("disableRaids", dcc.b.b, dcc.a.a(false));
   public static final dcc.e<dcc.a> C = a("doInsomnia", dcc.b.c, dcc.a.a(true));
   public static final dcc.e<dcc.a> D = a("doImmediateRespawn", dcc.b.a, dcc.a.a(false, ($$0, $$1) -> {
      for (aqn $$2 : $$0.ai().t()) {
         $$2.c.b(new acu(acu.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dcc.e<dcc.d> E = a("playersNetherPortalDefaultDelay", dcc.b.a, dcc.d.a(80));
   public static final dcc.e<dcc.d> F = a("playersNetherPortalCreativeDelay", dcc.b.a, dcc.d.a(1));
   public static final dcc.e<dcc.a> G = a("drowningDamage", dcc.b.a, dcc.a.a(true));
   public static final dcc.e<dcc.a> H = a("fallDamage", dcc.b.a, dcc.a.a(true));
   public static final dcc.e<dcc.a> I = a("fireDamage", dcc.b.a, dcc.a.a(true));
   public static final dcc.e<dcc.a> J = a("freezeDamage", dcc.b.a, dcc.a.a(true));
   public static final dcc.e<dcc.a> K = a("doPatrolSpawning", dcc.b.c, dcc.a.a(true));
   public static final dcc.e<dcc.a> L = a("doTraderSpawning", dcc.b.c, dcc.a.a(true));
   public static final dcc.e<dcc.a> M = a("doWardenSpawning", dcc.b.c, dcc.a.a(true));
   public static final dcc.e<dcc.a> N = a("forgiveDeadPlayers", dcc.b.b, dcc.a.a(true));
   public static final dcc.e<dcc.a> O = a("universalAnger", dcc.b.b, dcc.a.a(false));
   public static final dcc.e<dcc.d> P = a("playersSleepingPercentage", dcc.b.a, dcc.d.a(100));
   public static final dcc.e<dcc.a> Q = a("blockExplosionDropDecay", dcc.b.d, dcc.a.a(true));
   public static final dcc.e<dcc.a> R = a("mobExplosionDropDecay", dcc.b.d, dcc.a.a(true));
   public static final dcc.e<dcc.a> S = a("tntExplosionDropDecay", dcc.b.d, dcc.a.a(false));
   public static final dcc.e<dcc.d> T = a("snowAccumulationHeight", dcc.b.e, dcc.d.a(1));
   public static final dcc.e<dcc.a> U = a("waterSourceConversion", dcc.b.e, dcc.a.a(true));
   public static final dcc.e<dcc.a> V = a("lavaSourceConversion", dcc.b.e, dcc.a.a(false));
   public static final dcc.e<dcc.a> W = a("globalSoundEvents", dcc.b.g, dcc.a.a(true));
   public static final dcc.e<dcc.a> X = a("doVinesSpread", dcc.b.e, dcc.a.a(true));
   public static final dcc.e<dcc.a> Y = a("enderPearlsVanishOnDeath", dcc.b.a, dcc.a.a(true));
   public static final dcc.e<dcc.d> Z = a("spawnChunkRadius", dcc.b.g, dcc.d.a(2, 0, 32, ($$0, $$1) -> {
      aqm $$2 = $$0.J();
      $$2.a($$2.V(), $$2.W());
   }));
   private final Map<dcc.e<?>, dcc.g<?>> ac;

   private static <T extends dcc.g<T>> dcc.e<T> a(String $$0, dcc.b $$1, dcc.f<T> $$2) {
      dcc.e<T> $$3 = new dcc.e<>($$0, $$1);
      dcc.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dcc(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public dcc() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dcc.f)$$0.getValue()).a()));
   }

   private dcc(Map<dcc.e<?>, dcc.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends dcc.g<T>> T a(dcc.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public tx a() {
      tx $$0 = new tx();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dcc b() {
      return new dcc(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dcc.g)$$0.getValue()).f())));
   }

   public static void a(dcc.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (dcc.e<?>)$$1, (dcc.f<?>)$$2));
   }

   private static <T extends dcc.g<T>> void a(dcc.c $$0, dcc.e<?> $$1, dcc.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(dcc $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((dcc.e<?>)$$2, $$0, $$1));
   }

   private <T extends dcc.g<T>> void a(dcc.e<T> $$0, dcc $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dcc.e<dcc.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dcc.e<dcc.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dcc.g<dcc.a> {
      private boolean b;

      static dcc.f<dcc.a> a(boolean $$0, BiConsumer<MinecraftServer, dcc.a> $$1) {
         return new dcc.f<>(BoolArgumentType::bool, $$1x -> new dcc.a($$1x, $$0), $$1, dcc.c::b);
      }

      static dcc.f<dcc.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dcc.f<dcc.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<eq> $$0, String $$1) {
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

      protected dcc.a d() {
         return this;
      }

      protected dcc.a e() {
         return new dcc.a(this.a, this.b);
      }

      public void a(dcc.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dcc.g<T>> void a(dcc.e<T> $$0, dcc.f<T> $$1) {
      }

      default void b(dcc.e<dcc.a> $$0, dcc.f<dcc.a> $$1) {
      }

      default void c(dcc.e<dcc.d> $$0, dcc.f<dcc.d> $$1) {
      }
   }

   public static class d extends dcc.g<dcc.d> {
      private int b;

      private static dcc.f<dcc.d> a(int $$0, BiConsumer<MinecraftServer, dcc.d> $$1) {
         return new dcc.f<>(IntegerArgumentType::integer, $$1x -> new dcc.d($$1x, $$0), $$1, dcc.c::c);
      }

      static dcc.f<dcc.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, dcc.d> $$3) {
         return new dcc.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dcc.d($$1x, $$0), $$3, dcc.c::c);
      }

      static dcc.f<dcc.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dcc.f<dcc.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<eq> $$0, String $$1) {
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
               dcc.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dcc.d d() {
         return this;
      }

      protected dcc.d e() {
         return new dcc.d(this.a, this.b);
      }

      public void a(dcc.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dcc.g<T>> {
      final String a;
      private final dcc.b b;

      public e(String $$0, dcc.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dcc.e && ((dcc.e)$$0).a.equals(this.a);
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

      public dcc.b c() {
         return this.b;
      }
   }

   public static class f<T extends dcc.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dcc.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dcc.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<dcc.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dcc.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<eq, ?> a(String $$0) {
         return er.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dcc.c $$0, dcc.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends dcc.g<T>> {
      protected final dcc.f<T> a;

      public g(dcc.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<eq> var1, String var2);

      public void b(CommandContext<eq> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((eq)$$0.getSource()).l());
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

   interface h<T extends dcc.g<T>> {
      void call(dcc.c var1, dcc.e<T> var2, dcc.f<T> var3);
   }
}
