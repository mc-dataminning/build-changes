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

public class dbz {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<dbz.e<?>, dbz.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dbz.e<dbz.a> b = a("doFireTick", dbz.b.e, dbz.a.a(true));
   public static final dbz.e<dbz.a> c = a("mobGriefing", dbz.b.b, dbz.a.a(true));
   public static final dbz.e<dbz.a> d = a("keepInventory", dbz.b.a, dbz.a.a(false));
   public static final dbz.e<dbz.a> e = a("doMobSpawning", dbz.b.c, dbz.a.a(true));
   public static final dbz.e<dbz.a> f = a("doMobLoot", dbz.b.d, dbz.a.a(true));
   public static final dbz.e<dbz.a> g = a("projectilesCanBreakBlocks", dbz.b.d, dbz.a.a(true));
   public static final dbz.e<dbz.a> h = a("doTileDrops", dbz.b.d, dbz.a.a(true));
   public static final dbz.e<dbz.a> i = a("doEntityDrops", dbz.b.d, dbz.a.a(true));
   public static final dbz.e<dbz.a> j = a("commandBlockOutput", dbz.b.f, dbz.a.a(true));
   public static final dbz.e<dbz.a> k = a("naturalRegeneration", dbz.b.a, dbz.a.a(true));
   public static final dbz.e<dbz.a> l = a("doDaylightCycle", dbz.b.e, dbz.a.a(true));
   public static final dbz.e<dbz.a> m = a("logAdminCommands", dbz.b.f, dbz.a.a(true));
   public static final dbz.e<dbz.a> n = a("showDeathMessages", dbz.b.f, dbz.a.a(true));
   public static final dbz.e<dbz.d> o = a("randomTickSpeed", dbz.b.e, dbz.d.a(3));
   public static final dbz.e<dbz.a> p = a("sendCommandFeedback", dbz.b.f, dbz.a.a(true));
   public static final dbz.e<dbz.a> q = a("reducedDebugInfo", dbz.b.g, dbz.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aql $$3 : $$0.ah().t()) {
         $$3.c.b(new acr($$3, $$2));
      }
   }));
   public static final dbz.e<dbz.a> r = a("spectatorsGenerateChunks", dbz.b.a, dbz.a.a(true));
   public static final dbz.e<dbz.d> s = a("spawnRadius", dbz.b.a, dbz.d.a(10));
   public static final dbz.e<dbz.a> t = a("disableElytraMovementCheck", dbz.b.a, dbz.a.a(false));
   public static final dbz.e<dbz.d> u = a("maxEntityCramming", dbz.b.b, dbz.d.a(24));
   public static final dbz.e<dbz.a> v = a("doWeatherCycle", dbz.b.e, dbz.a.a(true));
   public static final dbz.e<dbz.a> w = a("doLimitedCrafting", dbz.b.a, dbz.a.a(false, ($$0, $$1) -> {
      for (aql $$2 : $$0.ah().t()) {
         $$2.c.b(new acu(acu.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbz.e<dbz.d> x = a("maxCommandChainLength", dbz.b.g, dbz.d.a(65536));
   public static final dbz.e<dbz.d> y = a("maxCommandForkCount", dbz.b.g, dbz.d.a(65536));
   public static final dbz.e<dbz.d> z = a("commandModificationBlockLimit", dbz.b.g, dbz.d.a(32768));
   public static final dbz.e<dbz.a> A = a("announceAdvancements", dbz.b.f, dbz.a.a(true));
   public static final dbz.e<dbz.a> B = a("disableRaids", dbz.b.b, dbz.a.a(false));
   public static final dbz.e<dbz.a> C = a("doInsomnia", dbz.b.c, dbz.a.a(true));
   public static final dbz.e<dbz.a> D = a("doImmediateRespawn", dbz.b.a, dbz.a.a(false, ($$0, $$1) -> {
      for (aql $$2 : $$0.ah().t()) {
         $$2.c.b(new acu(acu.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbz.e<dbz.d> E = a("playersNetherPortalDefaultDelay", dbz.b.a, dbz.d.a(80));
   public static final dbz.e<dbz.d> F = a("playersNetherPortalCreativeDelay", dbz.b.a, dbz.d.a(1));
   public static final dbz.e<dbz.a> G = a("drowningDamage", dbz.b.a, dbz.a.a(true));
   public static final dbz.e<dbz.a> H = a("fallDamage", dbz.b.a, dbz.a.a(true));
   public static final dbz.e<dbz.a> I = a("fireDamage", dbz.b.a, dbz.a.a(true));
   public static final dbz.e<dbz.a> J = a("freezeDamage", dbz.b.a, dbz.a.a(true));
   public static final dbz.e<dbz.a> K = a("doPatrolSpawning", dbz.b.c, dbz.a.a(true));
   public static final dbz.e<dbz.a> L = a("doTraderSpawning", dbz.b.c, dbz.a.a(true));
   public static final dbz.e<dbz.a> M = a("doWardenSpawning", dbz.b.c, dbz.a.a(true));
   public static final dbz.e<dbz.a> N = a("forgiveDeadPlayers", dbz.b.b, dbz.a.a(true));
   public static final dbz.e<dbz.a> O = a("universalAnger", dbz.b.b, dbz.a.a(false));
   public static final dbz.e<dbz.d> P = a("playersSleepingPercentage", dbz.b.a, dbz.d.a(100));
   public static final dbz.e<dbz.a> Q = a("blockExplosionDropDecay", dbz.b.d, dbz.a.a(true));
   public static final dbz.e<dbz.a> R = a("mobExplosionDropDecay", dbz.b.d, dbz.a.a(true));
   public static final dbz.e<dbz.a> S = a("tntExplosionDropDecay", dbz.b.d, dbz.a.a(false));
   public static final dbz.e<dbz.d> T = a("snowAccumulationHeight", dbz.b.e, dbz.d.a(1));
   public static final dbz.e<dbz.a> U = a("waterSourceConversion", dbz.b.e, dbz.a.a(true));
   public static final dbz.e<dbz.a> V = a("lavaSourceConversion", dbz.b.e, dbz.a.a(false));
   public static final dbz.e<dbz.a> W = a("globalSoundEvents", dbz.b.g, dbz.a.a(true));
   public static final dbz.e<dbz.a> X = a("doVinesSpread", dbz.b.e, dbz.a.a(true));
   public static final dbz.e<dbz.a> Y = a("enderPearlsVanishOnDeath", dbz.b.a, dbz.a.a(true));
   public static final dbz.e<dbz.d> Z = a("spawnChunkRadius", dbz.b.g, dbz.d.a(2, 0, 32, ($$0, $$1) -> {
      aqk $$2 = $$0.I();
      $$2.a($$2.V(), $$2.W());
   }));
   private final Map<dbz.e<?>, dbz.g<?>> ac;

   private static <T extends dbz.g<T>> dbz.e<T> a(String $$0, dbz.b $$1, dbz.f<T> $$2) {
      dbz.e<T> $$3 = new dbz.e<>($$0, $$1);
      dbz.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dbz(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public dbz() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbz.f)$$0.getValue()).a()));
   }

   private dbz(Map<dbz.e<?>, dbz.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends dbz.g<T>> T a(dbz.e<T> $$0) {
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

   public dbz b() {
      return new dbz(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbz.g)$$0.getValue()).f())));
   }

   public static void a(dbz.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (dbz.e<?>)$$1, (dbz.f<?>)$$2));
   }

   private static <T extends dbz.g<T>> void a(dbz.c $$0, dbz.e<?> $$1, dbz.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(dbz $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((dbz.e<?>)$$2, $$0, $$1));
   }

   private <T extends dbz.g<T>> void a(dbz.e<T> $$0, dbz $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dbz.e<dbz.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dbz.e<dbz.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dbz.g<dbz.a> {
      private boolean b;

      static dbz.f<dbz.a> a(boolean $$0, BiConsumer<MinecraftServer, dbz.a> $$1) {
         return new dbz.f<>(BoolArgumentType::bool, $$1x -> new dbz.a($$1x, $$0), $$1, dbz.c::b);
      }

      static dbz.f<dbz.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dbz.f<dbz.a> $$0, boolean $$1) {
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

      protected dbz.a d() {
         return this;
      }

      protected dbz.a e() {
         return new dbz.a(this.a, this.b);
      }

      public void a(dbz.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dbz.g<T>> void a(dbz.e<T> $$0, dbz.f<T> $$1) {
      }

      default void b(dbz.e<dbz.a> $$0, dbz.f<dbz.a> $$1) {
      }

      default void c(dbz.e<dbz.d> $$0, dbz.f<dbz.d> $$1) {
      }
   }

   public static class d extends dbz.g<dbz.d> {
      private int b;

      private static dbz.f<dbz.d> a(int $$0, BiConsumer<MinecraftServer, dbz.d> $$1) {
         return new dbz.f<>(IntegerArgumentType::integer, $$1x -> new dbz.d($$1x, $$0), $$1, dbz.c::c);
      }

      static dbz.f<dbz.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, dbz.d> $$3) {
         return new dbz.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dbz.d($$1x, $$0), $$3, dbz.c::c);
      }

      static dbz.f<dbz.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dbz.f<dbz.d> $$0, int $$1) {
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
               dbz.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dbz.d d() {
         return this;
      }

      protected dbz.d e() {
         return new dbz.d(this.a, this.b);
      }

      public void a(dbz.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dbz.g<T>> {
      final String a;
      private final dbz.b b;

      public e(String $$0, dbz.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dbz.e && ((dbz.e)$$0).a.equals(this.a);
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

      public dbz.b c() {
         return this.b;
      }
   }

   public static class f<T extends dbz.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dbz.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dbz.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<dbz.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dbz.h<T> $$3) {
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

      public void a(dbz.c $$0, dbz.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends dbz.g<T>> {
      protected final dbz.f<T> a;

      public g(dbz.f<T> $$0) {
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

   interface h<T extends dbz.g<T>> {
      void call(dbz.c var1, dbz.e<T> var2, dbz.f<T> var3);
   }
}
