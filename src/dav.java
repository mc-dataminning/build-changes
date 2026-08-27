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

public class dav {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<dav.e<?>, dav.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dav.e<dav.a> b = a("doFireTick", dav.b.e, dav.a.a(true));
   public static final dav.e<dav.a> c = a("mobGriefing", dav.b.b, dav.a.a(true));
   public static final dav.e<dav.a> d = a("keepInventory", dav.b.a, dav.a.a(false));
   public static final dav.e<dav.a> e = a("doMobSpawning", dav.b.c, dav.a.a(true));
   public static final dav.e<dav.a> f = a("doMobLoot", dav.b.d, dav.a.a(true));
   public static final dav.e<dav.a> g = a("projectilesCanBreakBlocks", dav.b.d, dav.a.a(true));
   public static final dav.e<dav.a> h = a("doTileDrops", dav.b.d, dav.a.a(true));
   public static final dav.e<dav.a> i = a("doEntityDrops", dav.b.d, dav.a.a(true));
   public static final dav.e<dav.a> j = a("commandBlockOutput", dav.b.f, dav.a.a(true));
   public static final dav.e<dav.a> k = a("naturalRegeneration", dav.b.a, dav.a.a(true));
   public static final dav.e<dav.a> l = a("doDaylightCycle", dav.b.e, dav.a.a(true));
   public static final dav.e<dav.a> m = a("logAdminCommands", dav.b.f, dav.a.a(true));
   public static final dav.e<dav.a> n = a("showDeathMessages", dav.b.f, dav.a.a(true));
   public static final dav.e<dav.d> o = a("randomTickSpeed", dav.b.e, dav.d.a(3));
   public static final dav.e<dav.a> p = a("sendCommandFeedback", dav.b.f, dav.a.a(true));
   public static final dav.e<dav.a> q = a("reducedDebugInfo", dav.b.g, dav.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aqo $$3 : $$0.ah().t()) {
         $$3.c.b(new acu($$3, $$2));
      }
   }));
   public static final dav.e<dav.a> r = a("spectatorsGenerateChunks", dav.b.a, dav.a.a(true));
   public static final dav.e<dav.d> s = a("spawnRadius", dav.b.a, dav.d.a(10));
   public static final dav.e<dav.a> t = a("disableElytraMovementCheck", dav.b.a, dav.a.a(false));
   public static final dav.e<dav.d> u = a("maxEntityCramming", dav.b.b, dav.d.a(24));
   public static final dav.e<dav.a> v = a("doWeatherCycle", dav.b.e, dav.a.a(true));
   public static final dav.e<dav.a> w = a("doLimitedCrafting", dav.b.a, dav.a.a(false, ($$0, $$1) -> {
      for (aqo $$2 : $$0.ah().t()) {
         $$2.c.b(new acx(acx.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dav.e<dav.d> x = a("maxCommandChainLength", dav.b.g, dav.d.a(65536));
   public static final dav.e<dav.d> y = a("maxCommandForkCount", dav.b.g, dav.d.a(65536));
   public static final dav.e<dav.d> z = a("commandModificationBlockLimit", dav.b.g, dav.d.a(32768));
   public static final dav.e<dav.a> A = a("announceAdvancements", dav.b.f, dav.a.a(true));
   public static final dav.e<dav.a> B = a("disableRaids", dav.b.b, dav.a.a(false));
   public static final dav.e<dav.a> C = a("doInsomnia", dav.b.c, dav.a.a(true));
   public static final dav.e<dav.a> D = a("doImmediateRespawn", dav.b.a, dav.a.a(false, ($$0, $$1) -> {
      for (aqo $$2 : $$0.ah().t()) {
         $$2.c.b(new acx(acx.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dav.e<dav.d> E = a("playersNetherPortalDefaultDelay", dav.b.a, dav.d.a(80));
   public static final dav.e<dav.d> F = a("playersNetherPortalCreativeDelay", dav.b.a, dav.d.a(1));
   public static final dav.e<dav.a> G = a("drowningDamage", dav.b.a, dav.a.a(true));
   public static final dav.e<dav.a> H = a("fallDamage", dav.b.a, dav.a.a(true));
   public static final dav.e<dav.a> I = a("fireDamage", dav.b.a, dav.a.a(true));
   public static final dav.e<dav.a> J = a("freezeDamage", dav.b.a, dav.a.a(true));
   public static final dav.e<dav.a> K = a("doPatrolSpawning", dav.b.c, dav.a.a(true));
   public static final dav.e<dav.a> L = a("doTraderSpawning", dav.b.c, dav.a.a(true));
   public static final dav.e<dav.a> M = a("doWardenSpawning", dav.b.c, dav.a.a(true));
   public static final dav.e<dav.a> N = a("forgiveDeadPlayers", dav.b.b, dav.a.a(true));
   public static final dav.e<dav.a> O = a("universalAnger", dav.b.b, dav.a.a(false));
   public static final dav.e<dav.d> P = a("playersSleepingPercentage", dav.b.a, dav.d.a(100));
   public static final dav.e<dav.a> Q = a("blockExplosionDropDecay", dav.b.d, dav.a.a(true));
   public static final dav.e<dav.a> R = a("mobExplosionDropDecay", dav.b.d, dav.a.a(true));
   public static final dav.e<dav.a> S = a("tntExplosionDropDecay", dav.b.d, dav.a.a(false));
   public static final dav.e<dav.d> T = a("snowAccumulationHeight", dav.b.e, dav.d.a(1));
   public static final dav.e<dav.a> U = a("waterSourceConversion", dav.b.e, dav.a.a(true));
   public static final dav.e<dav.a> V = a("lavaSourceConversion", dav.b.e, dav.a.a(false));
   public static final dav.e<dav.a> W = a("globalSoundEvents", dav.b.g, dav.a.a(true));
   public static final dav.e<dav.a> X = a("doVinesSpread", dav.b.e, dav.a.a(true));
   public static final dav.e<dav.a> Y = a("enderPearlsVanishOnDeath", dav.b.a, dav.a.a(true));
   public static final dav.e<dav.d> Z = a("spawnChunkRadius", dav.b.g, dav.d.a(2, 0, 32, ($$0, $$1) -> {
      aqn $$2 = $$0.I();
      $$2.a($$2.U(), $$2.V());
   }));
   private final Map<dav.e<?>, dav.g<?>> ac;

   private static <T extends dav.g<T>> dav.e<T> a(String $$0, dav.b $$1, dav.f<T> $$2) {
      dav.e<T> $$3 = new dav.e<>($$0, $$1);
      dav.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dav(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public dav() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dav.f)$$0.getValue()).a()));
   }

   private dav(Map<dav.e<?>, dav.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends dav.g<T>> T a(dav.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public ud a() {
      ud $$0 = new ud();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dav b() {
      return new dav(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dav.g)$$0.getValue()).f())));
   }

   public static void a(dav.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (dav.e<?>)$$1, (dav.f<?>)$$2));
   }

   private static <T extends dav.g<T>> void a(dav.c $$0, dav.e<?> $$1, dav.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(dav $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((dav.e<?>)$$2, $$0, $$1));
   }

   private <T extends dav.g<T>> void a(dav.e<T> $$0, dav $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dav.e<dav.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dav.e<dav.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dav.g<dav.a> {
      private boolean b;

      static dav.f<dav.a> a(boolean $$0, BiConsumer<MinecraftServer, dav.a> $$1) {
         return new dav.f<>(BoolArgumentType::bool, $$1x -> new dav.a($$1x, $$0), $$1, dav.c::b);
      }

      static dav.f<dav.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dav.f<dav.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ee> $$0, String $$1) {
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

      protected dav.a d() {
         return this;
      }

      protected dav.a e() {
         return new dav.a(this.a, this.b);
      }

      public void a(dav.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dav.g<T>> void a(dav.e<T> $$0, dav.f<T> $$1) {
      }

      default void b(dav.e<dav.a> $$0, dav.f<dav.a> $$1) {
      }

      default void c(dav.e<dav.d> $$0, dav.f<dav.d> $$1) {
      }
   }

   public static class d extends dav.g<dav.d> {
      private int b;

      private static dav.f<dav.d> a(int $$0, BiConsumer<MinecraftServer, dav.d> $$1) {
         return new dav.f<>(IntegerArgumentType::integer, $$1x -> new dav.d($$1x, $$0), $$1, dav.c::c);
      }

      static dav.f<dav.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, dav.d> $$3) {
         return new dav.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dav.d($$1x, $$0), $$3, dav.c::c);
      }

      static dav.f<dav.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dav.f<dav.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ee> $$0, String $$1) {
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
               dav.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dav.d d() {
         return this;
      }

      protected dav.d e() {
         return new dav.d(this.a, this.b);
      }

      public void a(dav.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dav.g<T>> {
      final String a;
      private final dav.b b;

      public e(String $$0, dav.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dav.e && ((dav.e)$$0).a.equals(this.a);
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

      public dav.b c() {
         return this.b;
      }
   }

   public static class f<T extends dav.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dav.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dav.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<dav.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dav.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<ee, ?> a(String $$0) {
         return ef.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dav.c $$0, dav.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends dav.g<T>> {
      protected final dav.f<T> a;

      public g(dav.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ee> var1, String var2);

      public void b(CommandContext<ee> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ee)$$0.getSource()).l());
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

   interface h<T extends dav.g<T>> {
      void call(dav.c var1, dav.e<T> var2, dav.f<T> var3);
   }
}
