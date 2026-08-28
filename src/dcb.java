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

public class dcb {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<dcb.e<?>, dcb.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dcb.e<dcb.a> b = a("doFireTick", dcb.b.e, dcb.a.a(true));
   public static final dcb.e<dcb.a> c = a("mobGriefing", dcb.b.b, dcb.a.a(true));
   public static final dcb.e<dcb.a> d = a("keepInventory", dcb.b.a, dcb.a.a(false));
   public static final dcb.e<dcb.a> e = a("doMobSpawning", dcb.b.c, dcb.a.a(true));
   public static final dcb.e<dcb.a> f = a("doMobLoot", dcb.b.d, dcb.a.a(true));
   public static final dcb.e<dcb.a> g = a("projectilesCanBreakBlocks", dcb.b.d, dcb.a.a(true));
   public static final dcb.e<dcb.a> h = a("doTileDrops", dcb.b.d, dcb.a.a(true));
   public static final dcb.e<dcb.a> i = a("doEntityDrops", dcb.b.d, dcb.a.a(true));
   public static final dcb.e<dcb.a> j = a("commandBlockOutput", dcb.b.f, dcb.a.a(true));
   public static final dcb.e<dcb.a> k = a("naturalRegeneration", dcb.b.a, dcb.a.a(true));
   public static final dcb.e<dcb.a> l = a("doDaylightCycle", dcb.b.e, dcb.a.a(true));
   public static final dcb.e<dcb.a> m = a("logAdminCommands", dcb.b.f, dcb.a.a(true));
   public static final dcb.e<dcb.a> n = a("showDeathMessages", dcb.b.f, dcb.a.a(true));
   public static final dcb.e<dcb.d> o = a("randomTickSpeed", dcb.b.e, dcb.d.a(3));
   public static final dcb.e<dcb.a> p = a("sendCommandFeedback", dcb.b.f, dcb.a.a(true));
   public static final dcb.e<dcb.a> q = a("reducedDebugInfo", dcb.b.g, dcb.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aqn $$3 : $$0.ai().t()) {
         $$3.c.b(new acr($$3, $$2));
      }
   }));
   public static final dcb.e<dcb.a> r = a("spectatorsGenerateChunks", dcb.b.a, dcb.a.a(true));
   public static final dcb.e<dcb.d> s = a("spawnRadius", dcb.b.a, dcb.d.a(10));
   public static final dcb.e<dcb.a> t = a("disableElytraMovementCheck", dcb.b.a, dcb.a.a(false));
   public static final dcb.e<dcb.d> u = a("maxEntityCramming", dcb.b.b, dcb.d.a(24));
   public static final dcb.e<dcb.a> v = a("doWeatherCycle", dcb.b.e, dcb.a.a(true));
   public static final dcb.e<dcb.a> w = a("doLimitedCrafting", dcb.b.a, dcb.a.a(false, ($$0, $$1) -> {
      for (aqn $$2 : $$0.ai().t()) {
         $$2.c.b(new acu(acu.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dcb.e<dcb.d> x = a("maxCommandChainLength", dcb.b.g, dcb.d.a(65536));
   public static final dcb.e<dcb.d> y = a("maxCommandForkCount", dcb.b.g, dcb.d.a(65536));
   public static final dcb.e<dcb.d> z = a("commandModificationBlockLimit", dcb.b.g, dcb.d.a(32768));
   public static final dcb.e<dcb.a> A = a("announceAdvancements", dcb.b.f, dcb.a.a(true));
   public static final dcb.e<dcb.a> B = a("disableRaids", dcb.b.b, dcb.a.a(false));
   public static final dcb.e<dcb.a> C = a("doInsomnia", dcb.b.c, dcb.a.a(true));
   public static final dcb.e<dcb.a> D = a("doImmediateRespawn", dcb.b.a, dcb.a.a(false, ($$0, $$1) -> {
      for (aqn $$2 : $$0.ai().t()) {
         $$2.c.b(new acu(acu.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dcb.e<dcb.d> E = a("playersNetherPortalDefaultDelay", dcb.b.a, dcb.d.a(80));
   public static final dcb.e<dcb.d> F = a("playersNetherPortalCreativeDelay", dcb.b.a, dcb.d.a(1));
   public static final dcb.e<dcb.a> G = a("drowningDamage", dcb.b.a, dcb.a.a(true));
   public static final dcb.e<dcb.a> H = a("fallDamage", dcb.b.a, dcb.a.a(true));
   public static final dcb.e<dcb.a> I = a("fireDamage", dcb.b.a, dcb.a.a(true));
   public static final dcb.e<dcb.a> J = a("freezeDamage", dcb.b.a, dcb.a.a(true));
   public static final dcb.e<dcb.a> K = a("doPatrolSpawning", dcb.b.c, dcb.a.a(true));
   public static final dcb.e<dcb.a> L = a("doTraderSpawning", dcb.b.c, dcb.a.a(true));
   public static final dcb.e<dcb.a> M = a("doWardenSpawning", dcb.b.c, dcb.a.a(true));
   public static final dcb.e<dcb.a> N = a("forgiveDeadPlayers", dcb.b.b, dcb.a.a(true));
   public static final dcb.e<dcb.a> O = a("universalAnger", dcb.b.b, dcb.a.a(false));
   public static final dcb.e<dcb.d> P = a("playersSleepingPercentage", dcb.b.a, dcb.d.a(100));
   public static final dcb.e<dcb.a> Q = a("blockExplosionDropDecay", dcb.b.d, dcb.a.a(true));
   public static final dcb.e<dcb.a> R = a("mobExplosionDropDecay", dcb.b.d, dcb.a.a(true));
   public static final dcb.e<dcb.a> S = a("tntExplosionDropDecay", dcb.b.d, dcb.a.a(false));
   public static final dcb.e<dcb.d> T = a("snowAccumulationHeight", dcb.b.e, dcb.d.a(1));
   public static final dcb.e<dcb.a> U = a("waterSourceConversion", dcb.b.e, dcb.a.a(true));
   public static final dcb.e<dcb.a> V = a("lavaSourceConversion", dcb.b.e, dcb.a.a(false));
   public static final dcb.e<dcb.a> W = a("globalSoundEvents", dcb.b.g, dcb.a.a(true));
   public static final dcb.e<dcb.a> X = a("doVinesSpread", dcb.b.e, dcb.a.a(true));
   public static final dcb.e<dcb.a> Y = a("enderPearlsVanishOnDeath", dcb.b.a, dcb.a.a(true));
   public static final dcb.e<dcb.d> Z = a("spawnChunkRadius", dcb.b.g, dcb.d.a(2, 0, 32, ($$0, $$1) -> {
      aqm $$2 = $$0.J();
      $$2.a($$2.V(), $$2.W());
   }));
   private final Map<dcb.e<?>, dcb.g<?>> ac;

   private static <T extends dcb.g<T>> dcb.e<T> a(String $$0, dcb.b $$1, dcb.f<T> $$2) {
      dcb.e<T> $$3 = new dcb.e<>($$0, $$1);
      dcb.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dcb(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public dcb() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dcb.f)$$0.getValue()).a()));
   }

   private dcb(Map<dcb.e<?>, dcb.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends dcb.g<T>> T a(dcb.e<T> $$0) {
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

   public dcb b() {
      return new dcb(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dcb.g)$$0.getValue()).f())));
   }

   public static void a(dcb.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (dcb.e<?>)$$1, (dcb.f<?>)$$2));
   }

   private static <T extends dcb.g<T>> void a(dcb.c $$0, dcb.e<?> $$1, dcb.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(dcb $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((dcb.e<?>)$$2, $$0, $$1));
   }

   private <T extends dcb.g<T>> void a(dcb.e<T> $$0, dcb $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dcb.e<dcb.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dcb.e<dcb.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dcb.g<dcb.a> {
      private boolean b;

      static dcb.f<dcb.a> a(boolean $$0, BiConsumer<MinecraftServer, dcb.a> $$1) {
         return new dcb.f<>(BoolArgumentType::bool, $$1x -> new dcb.a($$1x, $$0), $$1, dcb.c::b);
      }

      static dcb.f<dcb.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dcb.f<dcb.a> $$0, boolean $$1) {
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

      protected dcb.a d() {
         return this;
      }

      protected dcb.a e() {
         return new dcb.a(this.a, this.b);
      }

      public void a(dcb.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dcb.g<T>> void a(dcb.e<T> $$0, dcb.f<T> $$1) {
      }

      default void b(dcb.e<dcb.a> $$0, dcb.f<dcb.a> $$1) {
      }

      default void c(dcb.e<dcb.d> $$0, dcb.f<dcb.d> $$1) {
      }
   }

   public static class d extends dcb.g<dcb.d> {
      private int b;

      private static dcb.f<dcb.d> a(int $$0, BiConsumer<MinecraftServer, dcb.d> $$1) {
         return new dcb.f<>(IntegerArgumentType::integer, $$1x -> new dcb.d($$1x, $$0), $$1, dcb.c::c);
      }

      static dcb.f<dcb.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, dcb.d> $$3) {
         return new dcb.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dcb.d($$1x, $$0), $$3, dcb.c::c);
      }

      static dcb.f<dcb.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dcb.f<dcb.d> $$0, int $$1) {
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
               dcb.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dcb.d d() {
         return this;
      }

      protected dcb.d e() {
         return new dcb.d(this.a, this.b);
      }

      public void a(dcb.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dcb.g<T>> {
      final String a;
      private final dcb.b b;

      public e(String $$0, dcb.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dcb.e && ((dcb.e)$$0).a.equals(this.a);
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

      public dcb.b c() {
         return this.b;
      }
   }

   public static class f<T extends dcb.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dcb.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dcb.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<dcb.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dcb.h<T> $$3) {
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

      public void a(dcb.c $$0, dcb.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends dcb.g<T>> {
      protected final dcb.f<T> a;

      public g(dcb.f<T> $$0) {
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

   interface h<T extends dcb.g<T>> {
      void call(dcb.c var1, dcb.e<T> var2, dcb.f<T> var3);
   }
}
