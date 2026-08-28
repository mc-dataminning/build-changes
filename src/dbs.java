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

public class dbs {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<dbs.e<?>, dbs.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dbs.e<dbs.a> b = a("doFireTick", dbs.b.e, dbs.a.a(true));
   public static final dbs.e<dbs.a> c = a("mobGriefing", dbs.b.b, dbs.a.a(true));
   public static final dbs.e<dbs.a> d = a("keepInventory", dbs.b.a, dbs.a.a(false));
   public static final dbs.e<dbs.a> e = a("doMobSpawning", dbs.b.c, dbs.a.a(true));
   public static final dbs.e<dbs.a> f = a("doMobLoot", dbs.b.d, dbs.a.a(true));
   public static final dbs.e<dbs.a> g = a("projectilesCanBreakBlocks", dbs.b.d, dbs.a.a(true));
   public static final dbs.e<dbs.a> h = a("doTileDrops", dbs.b.d, dbs.a.a(true));
   public static final dbs.e<dbs.a> i = a("doEntityDrops", dbs.b.d, dbs.a.a(true));
   public static final dbs.e<dbs.a> j = a("commandBlockOutput", dbs.b.f, dbs.a.a(true));
   public static final dbs.e<dbs.a> k = a("naturalRegeneration", dbs.b.a, dbs.a.a(true));
   public static final dbs.e<dbs.a> l = a("doDaylightCycle", dbs.b.e, dbs.a.a(true));
   public static final dbs.e<dbs.a> m = a("logAdminCommands", dbs.b.f, dbs.a.a(true));
   public static final dbs.e<dbs.a> n = a("showDeathMessages", dbs.b.f, dbs.a.a(true));
   public static final dbs.e<dbs.d> o = a("randomTickSpeed", dbs.b.e, dbs.d.a(3));
   public static final dbs.e<dbs.a> p = a("sendCommandFeedback", dbs.b.f, dbs.a.a(true));
   public static final dbs.e<dbs.a> q = a("reducedDebugInfo", dbs.b.g, dbs.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arf $$3 : $$0.ah().t()) {
         $$3.c.b(new adl($$3, $$2));
      }
   }));
   public static final dbs.e<dbs.a> r = a("spectatorsGenerateChunks", dbs.b.a, dbs.a.a(true));
   public static final dbs.e<dbs.d> s = a("spawnRadius", dbs.b.a, dbs.d.a(10));
   public static final dbs.e<dbs.a> t = a("disableElytraMovementCheck", dbs.b.a, dbs.a.a(false));
   public static final dbs.e<dbs.d> u = a("maxEntityCramming", dbs.b.b, dbs.d.a(24));
   public static final dbs.e<dbs.a> v = a("doWeatherCycle", dbs.b.e, dbs.a.a(true));
   public static final dbs.e<dbs.a> w = a("doLimitedCrafting", dbs.b.a, dbs.a.a(false, ($$0, $$1) -> {
      for (arf $$2 : $$0.ah().t()) {
         $$2.c.b(new ado(ado.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbs.e<dbs.d> x = a("maxCommandChainLength", dbs.b.g, dbs.d.a(65536));
   public static final dbs.e<dbs.d> y = a("maxCommandForkCount", dbs.b.g, dbs.d.a(65536));
   public static final dbs.e<dbs.d> z = a("commandModificationBlockLimit", dbs.b.g, dbs.d.a(32768));
   public static final dbs.e<dbs.a> A = a("announceAdvancements", dbs.b.f, dbs.a.a(true));
   public static final dbs.e<dbs.a> B = a("disableRaids", dbs.b.b, dbs.a.a(false));
   public static final dbs.e<dbs.a> C = a("doInsomnia", dbs.b.c, dbs.a.a(true));
   public static final dbs.e<dbs.a> D = a("doImmediateRespawn", dbs.b.a, dbs.a.a(false, ($$0, $$1) -> {
      for (arf $$2 : $$0.ah().t()) {
         $$2.c.b(new ado(ado.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbs.e<dbs.d> E = a("playersNetherPortalDefaultDelay", dbs.b.a, dbs.d.a(80));
   public static final dbs.e<dbs.d> F = a("playersNetherPortalCreativeDelay", dbs.b.a, dbs.d.a(1));
   public static final dbs.e<dbs.a> G = a("drowningDamage", dbs.b.a, dbs.a.a(true));
   public static final dbs.e<dbs.a> H = a("fallDamage", dbs.b.a, dbs.a.a(true));
   public static final dbs.e<dbs.a> I = a("fireDamage", dbs.b.a, dbs.a.a(true));
   public static final dbs.e<dbs.a> J = a("freezeDamage", dbs.b.a, dbs.a.a(true));
   public static final dbs.e<dbs.a> K = a("doPatrolSpawning", dbs.b.c, dbs.a.a(true));
   public static final dbs.e<dbs.a> L = a("doTraderSpawning", dbs.b.c, dbs.a.a(true));
   public static final dbs.e<dbs.a> M = a("doWardenSpawning", dbs.b.c, dbs.a.a(true));
   public static final dbs.e<dbs.a> N = a("forgiveDeadPlayers", dbs.b.b, dbs.a.a(true));
   public static final dbs.e<dbs.a> O = a("universalAnger", dbs.b.b, dbs.a.a(false));
   public static final dbs.e<dbs.d> P = a("playersSleepingPercentage", dbs.b.a, dbs.d.a(100));
   public static final dbs.e<dbs.a> Q = a("blockExplosionDropDecay", dbs.b.d, dbs.a.a(true));
   public static final dbs.e<dbs.a> R = a("mobExplosionDropDecay", dbs.b.d, dbs.a.a(true));
   public static final dbs.e<dbs.a> S = a("tntExplosionDropDecay", dbs.b.d, dbs.a.a(false));
   public static final dbs.e<dbs.d> T = a("snowAccumulationHeight", dbs.b.e, dbs.d.a(1));
   public static final dbs.e<dbs.a> U = a("waterSourceConversion", dbs.b.e, dbs.a.a(true));
   public static final dbs.e<dbs.a> V = a("lavaSourceConversion", dbs.b.e, dbs.a.a(false));
   public static final dbs.e<dbs.a> W = a("globalSoundEvents", dbs.b.g, dbs.a.a(true));
   public static final dbs.e<dbs.a> X = a("doVinesSpread", dbs.b.e, dbs.a.a(true));
   public static final dbs.e<dbs.a> Y = a("enderPearlsVanishOnDeath", dbs.b.a, dbs.a.a(true));
   public static final dbs.e<dbs.d> Z = a("spawnChunkRadius", dbs.b.g, dbs.d.a(2, 0, 32, ($$0, $$1) -> {
      are $$2 = $$0.I();
      $$2.a($$2.V(), $$2.W());
   }));
   private final Map<dbs.e<?>, dbs.g<?>> ac;

   private static <T extends dbs.g<T>> dbs.e<T> a(String $$0, dbs.b $$1, dbs.f<T> $$2) {
      dbs.e<T> $$3 = new dbs.e<>($$0, $$1);
      dbs.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dbs(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public dbs() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbs.f)$$0.getValue()).a()));
   }

   private dbs(Map<dbs.e<?>, dbs.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends dbs.g<T>> T a(dbs.e<T> $$0) {
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

   public dbs b() {
      return new dbs(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbs.g)$$0.getValue()).f())));
   }

   public static void a(dbs.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (dbs.e<?>)$$1, (dbs.f<?>)$$2));
   }

   private static <T extends dbs.g<T>> void a(dbs.c $$0, dbs.e<?> $$1, dbs.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(dbs $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((dbs.e<?>)$$2, $$0, $$1));
   }

   private <T extends dbs.g<T>> void a(dbs.e<T> $$0, dbs $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dbs.e<dbs.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dbs.e<dbs.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dbs.g<dbs.a> {
      private boolean b;

      static dbs.f<dbs.a> a(boolean $$0, BiConsumer<MinecraftServer, dbs.a> $$1) {
         return new dbs.f<>(BoolArgumentType::bool, $$1x -> new dbs.a($$1x, $$0), $$1, dbs.c::b);
      }

      static dbs.f<dbs.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dbs.f<dbs.a> $$0, boolean $$1) {
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

      protected dbs.a d() {
         return this;
      }

      protected dbs.a e() {
         return new dbs.a(this.a, this.b);
      }

      public void a(dbs.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dbs.g<T>> void a(dbs.e<T> $$0, dbs.f<T> $$1) {
      }

      default void b(dbs.e<dbs.a> $$0, dbs.f<dbs.a> $$1) {
      }

      default void c(dbs.e<dbs.d> $$0, dbs.f<dbs.d> $$1) {
      }
   }

   public static class d extends dbs.g<dbs.d> {
      private int b;

      private static dbs.f<dbs.d> a(int $$0, BiConsumer<MinecraftServer, dbs.d> $$1) {
         return new dbs.f<>(IntegerArgumentType::integer, $$1x -> new dbs.d($$1x, $$0), $$1, dbs.c::c);
      }

      static dbs.f<dbs.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, dbs.d> $$3) {
         return new dbs.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dbs.d($$1x, $$0), $$3, dbs.c::c);
      }

      static dbs.f<dbs.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dbs.f<dbs.d> $$0, int $$1) {
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
               dbs.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dbs.d d() {
         return this;
      }

      protected dbs.d e() {
         return new dbs.d(this.a, this.b);
      }

      public void a(dbs.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dbs.g<T>> {
      final String a;
      private final dbs.b b;

      public e(String $$0, dbs.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dbs.e && ((dbs.e)$$0).a.equals(this.a);
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

      public dbs.b c() {
         return this.b;
      }
   }

   public static class f<T extends dbs.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dbs.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dbs.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<dbs.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dbs.h<T> $$3) {
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

      public void a(dbs.c $$0, dbs.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends dbs.g<T>> {
      protected final dbs.f<T> a;

      public g(dbs.f<T> $$0) {
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

   interface h<T extends dbs.g<T>> {
      void call(dbs.c var1, dbs.e<T> var2, dbs.f<T> var3);
   }
}
