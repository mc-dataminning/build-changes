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

public class dbt {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<dbt.e<?>, dbt.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dbt.e<dbt.a> b = a("doFireTick", dbt.b.e, dbt.a.a(true));
   public static final dbt.e<dbt.a> c = a("mobGriefing", dbt.b.b, dbt.a.a(true));
   public static final dbt.e<dbt.a> d = a("keepInventory", dbt.b.a, dbt.a.a(false));
   public static final dbt.e<dbt.a> e = a("doMobSpawning", dbt.b.c, dbt.a.a(true));
   public static final dbt.e<dbt.a> f = a("doMobLoot", dbt.b.d, dbt.a.a(true));
   public static final dbt.e<dbt.a> g = a("projectilesCanBreakBlocks", dbt.b.d, dbt.a.a(true));
   public static final dbt.e<dbt.a> h = a("doTileDrops", dbt.b.d, dbt.a.a(true));
   public static final dbt.e<dbt.a> i = a("doEntityDrops", dbt.b.d, dbt.a.a(true));
   public static final dbt.e<dbt.a> j = a("commandBlockOutput", dbt.b.f, dbt.a.a(true));
   public static final dbt.e<dbt.a> k = a("naturalRegeneration", dbt.b.a, dbt.a.a(true));
   public static final dbt.e<dbt.a> l = a("doDaylightCycle", dbt.b.e, dbt.a.a(true));
   public static final dbt.e<dbt.a> m = a("logAdminCommands", dbt.b.f, dbt.a.a(true));
   public static final dbt.e<dbt.a> n = a("showDeathMessages", dbt.b.f, dbt.a.a(true));
   public static final dbt.e<dbt.d> o = a("randomTickSpeed", dbt.b.e, dbt.d.a(3));
   public static final dbt.e<dbt.a> p = a("sendCommandFeedback", dbt.b.f, dbt.a.a(true));
   public static final dbt.e<dbt.a> q = a("reducedDebugInfo", dbt.b.g, dbt.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arf $$3 : $$0.ah().t()) {
         $$3.c.b(new adl($$3, $$2));
      }
   }));
   public static final dbt.e<dbt.a> r = a("spectatorsGenerateChunks", dbt.b.a, dbt.a.a(true));
   public static final dbt.e<dbt.d> s = a("spawnRadius", dbt.b.a, dbt.d.a(10));
   public static final dbt.e<dbt.a> t = a("disableElytraMovementCheck", dbt.b.a, dbt.a.a(false));
   public static final dbt.e<dbt.d> u = a("maxEntityCramming", dbt.b.b, dbt.d.a(24));
   public static final dbt.e<dbt.a> v = a("doWeatherCycle", dbt.b.e, dbt.a.a(true));
   public static final dbt.e<dbt.a> w = a("doLimitedCrafting", dbt.b.a, dbt.a.a(false, ($$0, $$1) -> {
      for (arf $$2 : $$0.ah().t()) {
         $$2.c.b(new ado(ado.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbt.e<dbt.d> x = a("maxCommandChainLength", dbt.b.g, dbt.d.a(65536));
   public static final dbt.e<dbt.d> y = a("maxCommandForkCount", dbt.b.g, dbt.d.a(65536));
   public static final dbt.e<dbt.d> z = a("commandModificationBlockLimit", dbt.b.g, dbt.d.a(32768));
   public static final dbt.e<dbt.a> A = a("announceAdvancements", dbt.b.f, dbt.a.a(true));
   public static final dbt.e<dbt.a> B = a("disableRaids", dbt.b.b, dbt.a.a(false));
   public static final dbt.e<dbt.a> C = a("doInsomnia", dbt.b.c, dbt.a.a(true));
   public static final dbt.e<dbt.a> D = a("doImmediateRespawn", dbt.b.a, dbt.a.a(false, ($$0, $$1) -> {
      for (arf $$2 : $$0.ah().t()) {
         $$2.c.b(new ado(ado.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbt.e<dbt.d> E = a("playersNetherPortalDefaultDelay", dbt.b.a, dbt.d.a(80));
   public static final dbt.e<dbt.d> F = a("playersNetherPortalCreativeDelay", dbt.b.a, dbt.d.a(1));
   public static final dbt.e<dbt.a> G = a("drowningDamage", dbt.b.a, dbt.a.a(true));
   public static final dbt.e<dbt.a> H = a("fallDamage", dbt.b.a, dbt.a.a(true));
   public static final dbt.e<dbt.a> I = a("fireDamage", dbt.b.a, dbt.a.a(true));
   public static final dbt.e<dbt.a> J = a("freezeDamage", dbt.b.a, dbt.a.a(true));
   public static final dbt.e<dbt.a> K = a("doPatrolSpawning", dbt.b.c, dbt.a.a(true));
   public static final dbt.e<dbt.a> L = a("doTraderSpawning", dbt.b.c, dbt.a.a(true));
   public static final dbt.e<dbt.a> M = a("doWardenSpawning", dbt.b.c, dbt.a.a(true));
   public static final dbt.e<dbt.a> N = a("forgiveDeadPlayers", dbt.b.b, dbt.a.a(true));
   public static final dbt.e<dbt.a> O = a("universalAnger", dbt.b.b, dbt.a.a(false));
   public static final dbt.e<dbt.d> P = a("playersSleepingPercentage", dbt.b.a, dbt.d.a(100));
   public static final dbt.e<dbt.a> Q = a("blockExplosionDropDecay", dbt.b.d, dbt.a.a(true));
   public static final dbt.e<dbt.a> R = a("mobExplosionDropDecay", dbt.b.d, dbt.a.a(true));
   public static final dbt.e<dbt.a> S = a("tntExplosionDropDecay", dbt.b.d, dbt.a.a(false));
   public static final dbt.e<dbt.d> T = a("snowAccumulationHeight", dbt.b.e, dbt.d.a(1));
   public static final dbt.e<dbt.a> U = a("waterSourceConversion", dbt.b.e, dbt.a.a(true));
   public static final dbt.e<dbt.a> V = a("lavaSourceConversion", dbt.b.e, dbt.a.a(false));
   public static final dbt.e<dbt.a> W = a("globalSoundEvents", dbt.b.g, dbt.a.a(true));
   public static final dbt.e<dbt.a> X = a("doVinesSpread", dbt.b.e, dbt.a.a(true));
   public static final dbt.e<dbt.a> Y = a("enderPearlsVanishOnDeath", dbt.b.a, dbt.a.a(true));
   public static final dbt.e<dbt.d> Z = a("spawnChunkRadius", dbt.b.g, dbt.d.a(2, 0, 32, ($$0, $$1) -> {
      are $$2 = $$0.I();
      $$2.a($$2.V(), $$2.W());
   }));
   private final Map<dbt.e<?>, dbt.g<?>> ac;

   private static <T extends dbt.g<T>> dbt.e<T> a(String $$0, dbt.b $$1, dbt.f<T> $$2) {
      dbt.e<T> $$3 = new dbt.e<>($$0, $$1);
      dbt.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dbt(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public dbt() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbt.f)$$0.getValue()).a()));
   }

   private dbt(Map<dbt.e<?>, dbt.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends dbt.g<T>> T a(dbt.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public ur a() {
      ur $$0 = new ur();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dbt b() {
      return new dbt(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbt.g)$$0.getValue()).f())));
   }

   public static void a(dbt.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (dbt.e<?>)$$1, (dbt.f<?>)$$2));
   }

   private static <T extends dbt.g<T>> void a(dbt.c $$0, dbt.e<?> $$1, dbt.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(dbt $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((dbt.e<?>)$$2, $$0, $$1));
   }

   private <T extends dbt.g<T>> void a(dbt.e<T> $$0, dbt $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dbt.e<dbt.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dbt.e<dbt.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dbt.g<dbt.a> {
      private boolean b;

      static dbt.f<dbt.a> a(boolean $$0, BiConsumer<MinecraftServer, dbt.a> $$1) {
         return new dbt.f<>(BoolArgumentType::bool, $$1x -> new dbt.a($$1x, $$0), $$1, dbt.c::b);
      }

      static dbt.f<dbt.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dbt.f<dbt.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ep> $$0, String $$1) {
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

      protected dbt.a d() {
         return this;
      }

      protected dbt.a e() {
         return new dbt.a(this.a, this.b);
      }

      public void a(dbt.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dbt.g<T>> void a(dbt.e<T> $$0, dbt.f<T> $$1) {
      }

      default void b(dbt.e<dbt.a> $$0, dbt.f<dbt.a> $$1) {
      }

      default void c(dbt.e<dbt.d> $$0, dbt.f<dbt.d> $$1) {
      }
   }

   public static class d extends dbt.g<dbt.d> {
      private int b;

      private static dbt.f<dbt.d> a(int $$0, BiConsumer<MinecraftServer, dbt.d> $$1) {
         return new dbt.f<>(IntegerArgumentType::integer, $$1x -> new dbt.d($$1x, $$0), $$1, dbt.c::c);
      }

      static dbt.f<dbt.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, dbt.d> $$3) {
         return new dbt.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dbt.d($$1x, $$0), $$3, dbt.c::c);
      }

      static dbt.f<dbt.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dbt.f<dbt.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ep> $$0, String $$1) {
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
               dbt.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dbt.d d() {
         return this;
      }

      protected dbt.d e() {
         return new dbt.d(this.a, this.b);
      }

      public void a(dbt.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dbt.g<T>> {
      final String a;
      private final dbt.b b;

      public e(String $$0, dbt.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dbt.e && ((dbt.e)$$0).a.equals(this.a);
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

      public dbt.b c() {
         return this.b;
      }
   }

   public static class f<T extends dbt.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dbt.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dbt.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<dbt.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dbt.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<ep, ?> a(String $$0) {
         return eq.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dbt.c $$0, dbt.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends dbt.g<T>> {
      protected final dbt.f<T> a;

      public g(dbt.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ep> var1, String var2);

      public void b(CommandContext<ep> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ep)$$0.getSource()).l());
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

   interface h<T extends dbt.g<T>> {
      void call(dbt.c var1, dbt.e<T> var2, dbt.f<T> var3);
   }
}
