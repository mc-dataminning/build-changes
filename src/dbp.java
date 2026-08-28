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

public class dbp {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<dbp.e<?>, dbp.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dbp.e<dbp.a> b = a("doFireTick", dbp.b.e, dbp.a.a(true));
   public static final dbp.e<dbp.a> c = a("mobGriefing", dbp.b.b, dbp.a.a(true));
   public static final dbp.e<dbp.a> d = a("keepInventory", dbp.b.a, dbp.a.a(false));
   public static final dbp.e<dbp.a> e = a("doMobSpawning", dbp.b.c, dbp.a.a(true));
   public static final dbp.e<dbp.a> f = a("doMobLoot", dbp.b.d, dbp.a.a(true));
   public static final dbp.e<dbp.a> g = a("projectilesCanBreakBlocks", dbp.b.d, dbp.a.a(true));
   public static final dbp.e<dbp.a> h = a("doTileDrops", dbp.b.d, dbp.a.a(true));
   public static final dbp.e<dbp.a> i = a("doEntityDrops", dbp.b.d, dbp.a.a(true));
   public static final dbp.e<dbp.a> j = a("commandBlockOutput", dbp.b.f, dbp.a.a(true));
   public static final dbp.e<dbp.a> k = a("naturalRegeneration", dbp.b.a, dbp.a.a(true));
   public static final dbp.e<dbp.a> l = a("doDaylightCycle", dbp.b.e, dbp.a.a(true));
   public static final dbp.e<dbp.a> m = a("logAdminCommands", dbp.b.f, dbp.a.a(true));
   public static final dbp.e<dbp.a> n = a("showDeathMessages", dbp.b.f, dbp.a.a(true));
   public static final dbp.e<dbp.d> o = a("randomTickSpeed", dbp.b.e, dbp.d.a(3));
   public static final dbp.e<dbp.a> p = a("sendCommandFeedback", dbp.b.f, dbp.a.a(true));
   public static final dbp.e<dbp.a> q = a("reducedDebugInfo", dbp.b.g, dbp.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arc $$3 : $$0.ah().t()) {
         $$3.c.b(new adi($$3, $$2));
      }
   }));
   public static final dbp.e<dbp.a> r = a("spectatorsGenerateChunks", dbp.b.a, dbp.a.a(true));
   public static final dbp.e<dbp.d> s = a("spawnRadius", dbp.b.a, dbp.d.a(10));
   public static final dbp.e<dbp.a> t = a("disableElytraMovementCheck", dbp.b.a, dbp.a.a(false));
   public static final dbp.e<dbp.d> u = a("maxEntityCramming", dbp.b.b, dbp.d.a(24));
   public static final dbp.e<dbp.a> v = a("doWeatherCycle", dbp.b.e, dbp.a.a(true));
   public static final dbp.e<dbp.a> w = a("doLimitedCrafting", dbp.b.a, dbp.a.a(false, ($$0, $$1) -> {
      for (arc $$2 : $$0.ah().t()) {
         $$2.c.b(new adl(adl.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbp.e<dbp.d> x = a("maxCommandChainLength", dbp.b.g, dbp.d.a(65536));
   public static final dbp.e<dbp.d> y = a("maxCommandForkCount", dbp.b.g, dbp.d.a(65536));
   public static final dbp.e<dbp.d> z = a("commandModificationBlockLimit", dbp.b.g, dbp.d.a(32768));
   public static final dbp.e<dbp.a> A = a("announceAdvancements", dbp.b.f, dbp.a.a(true));
   public static final dbp.e<dbp.a> B = a("disableRaids", dbp.b.b, dbp.a.a(false));
   public static final dbp.e<dbp.a> C = a("doInsomnia", dbp.b.c, dbp.a.a(true));
   public static final dbp.e<dbp.a> D = a("doImmediateRespawn", dbp.b.a, dbp.a.a(false, ($$0, $$1) -> {
      for (arc $$2 : $$0.ah().t()) {
         $$2.c.b(new adl(adl.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbp.e<dbp.d> E = a("playersNetherPortalDefaultDelay", dbp.b.a, dbp.d.a(80));
   public static final dbp.e<dbp.d> F = a("playersNetherPortalCreativeDelay", dbp.b.a, dbp.d.a(1));
   public static final dbp.e<dbp.a> G = a("drowningDamage", dbp.b.a, dbp.a.a(true));
   public static final dbp.e<dbp.a> H = a("fallDamage", dbp.b.a, dbp.a.a(true));
   public static final dbp.e<dbp.a> I = a("fireDamage", dbp.b.a, dbp.a.a(true));
   public static final dbp.e<dbp.a> J = a("freezeDamage", dbp.b.a, dbp.a.a(true));
   public static final dbp.e<dbp.a> K = a("doPatrolSpawning", dbp.b.c, dbp.a.a(true));
   public static final dbp.e<dbp.a> L = a("doTraderSpawning", dbp.b.c, dbp.a.a(true));
   public static final dbp.e<dbp.a> M = a("doWardenSpawning", dbp.b.c, dbp.a.a(true));
   public static final dbp.e<dbp.a> N = a("forgiveDeadPlayers", dbp.b.b, dbp.a.a(true));
   public static final dbp.e<dbp.a> O = a("universalAnger", dbp.b.b, dbp.a.a(false));
   public static final dbp.e<dbp.d> P = a("playersSleepingPercentage", dbp.b.a, dbp.d.a(100));
   public static final dbp.e<dbp.a> Q = a("blockExplosionDropDecay", dbp.b.d, dbp.a.a(true));
   public static final dbp.e<dbp.a> R = a("mobExplosionDropDecay", dbp.b.d, dbp.a.a(true));
   public static final dbp.e<dbp.a> S = a("tntExplosionDropDecay", dbp.b.d, dbp.a.a(false));
   public static final dbp.e<dbp.d> T = a("snowAccumulationHeight", dbp.b.e, dbp.d.a(1));
   public static final dbp.e<dbp.a> U = a("waterSourceConversion", dbp.b.e, dbp.a.a(true));
   public static final dbp.e<dbp.a> V = a("lavaSourceConversion", dbp.b.e, dbp.a.a(false));
   public static final dbp.e<dbp.a> W = a("globalSoundEvents", dbp.b.g, dbp.a.a(true));
   public static final dbp.e<dbp.a> X = a("doVinesSpread", dbp.b.e, dbp.a.a(true));
   public static final dbp.e<dbp.a> Y = a("enderPearlsVanishOnDeath", dbp.b.a, dbp.a.a(true));
   public static final dbp.e<dbp.d> Z = a("spawnChunkRadius", dbp.b.g, dbp.d.a(2, 0, 32, ($$0, $$1) -> {
      arb $$2 = $$0.I();
      $$2.a($$2.V(), $$2.W());
   }));
   private final Map<dbp.e<?>, dbp.g<?>> ac;

   private static <T extends dbp.g<T>> dbp.e<T> a(String $$0, dbp.b $$1, dbp.f<T> $$2) {
      dbp.e<T> $$3 = new dbp.e<>($$0, $$1);
      dbp.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dbp(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public dbp() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbp.f)$$0.getValue()).a()));
   }

   private dbp(Map<dbp.e<?>, dbp.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends dbp.g<T>> T a(dbp.e<T> $$0) {
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

   public dbp b() {
      return new dbp(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbp.g)$$0.getValue()).f())));
   }

   public static void a(dbp.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (dbp.e<?>)$$1, (dbp.f<?>)$$2));
   }

   private static <T extends dbp.g<T>> void a(dbp.c $$0, dbp.e<?> $$1, dbp.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(dbp $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((dbp.e<?>)$$2, $$0, $$1));
   }

   private <T extends dbp.g<T>> void a(dbp.e<T> $$0, dbp $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dbp.e<dbp.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dbp.e<dbp.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dbp.g<dbp.a> {
      private boolean b;

      static dbp.f<dbp.a> a(boolean $$0, BiConsumer<MinecraftServer, dbp.a> $$1) {
         return new dbp.f<>(BoolArgumentType::bool, $$1x -> new dbp.a($$1x, $$0), $$1, dbp.c::b);
      }

      static dbp.f<dbp.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dbp.f<dbp.a> $$0, boolean $$1) {
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

      protected dbp.a d() {
         return this;
      }

      protected dbp.a e() {
         return new dbp.a(this.a, this.b);
      }

      public void a(dbp.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dbp.g<T>> void a(dbp.e<T> $$0, dbp.f<T> $$1) {
      }

      default void b(dbp.e<dbp.a> $$0, dbp.f<dbp.a> $$1) {
      }

      default void c(dbp.e<dbp.d> $$0, dbp.f<dbp.d> $$1) {
      }
   }

   public static class d extends dbp.g<dbp.d> {
      private int b;

      private static dbp.f<dbp.d> a(int $$0, BiConsumer<MinecraftServer, dbp.d> $$1) {
         return new dbp.f<>(IntegerArgumentType::integer, $$1x -> new dbp.d($$1x, $$0), $$1, dbp.c::c);
      }

      static dbp.f<dbp.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, dbp.d> $$3) {
         return new dbp.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dbp.d($$1x, $$0), $$3, dbp.c::c);
      }

      static dbp.f<dbp.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dbp.f<dbp.d> $$0, int $$1) {
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
               dbp.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dbp.d d() {
         return this;
      }

      protected dbp.d e() {
         return new dbp.d(this.a, this.b);
      }

      public void a(dbp.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dbp.g<T>> {
      final String a;
      private final dbp.b b;

      public e(String $$0, dbp.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dbp.e && ((dbp.e)$$0).a.equals(this.a);
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

      public dbp.b c() {
         return this.b;
      }
   }

   public static class f<T extends dbp.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dbp.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dbp.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<dbp.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dbp.h<T> $$3) {
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

      public void a(dbp.c $$0, dbp.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends dbp.g<T>> {
      protected final dbp.f<T> a;

      public g(dbp.f<T> $$0) {
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

   interface h<T extends dbp.g<T>> {
      void call(dbp.c var1, dbp.e<T> var2, dbp.f<T> var3);
   }
}
