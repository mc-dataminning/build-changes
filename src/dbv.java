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

public class dbv {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<dbv.e<?>, dbv.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dbv.e<dbv.a> b = a("doFireTick", dbv.b.e, dbv.a.a(true));
   public static final dbv.e<dbv.a> c = a("mobGriefing", dbv.b.b, dbv.a.a(true));
   public static final dbv.e<dbv.a> d = a("keepInventory", dbv.b.a, dbv.a.a(false));
   public static final dbv.e<dbv.a> e = a("doMobSpawning", dbv.b.c, dbv.a.a(true));
   public static final dbv.e<dbv.a> f = a("doMobLoot", dbv.b.d, dbv.a.a(true));
   public static final dbv.e<dbv.a> g = a("projectilesCanBreakBlocks", dbv.b.d, dbv.a.a(true));
   public static final dbv.e<dbv.a> h = a("doTileDrops", dbv.b.d, dbv.a.a(true));
   public static final dbv.e<dbv.a> i = a("doEntityDrops", dbv.b.d, dbv.a.a(true));
   public static final dbv.e<dbv.a> j = a("commandBlockOutput", dbv.b.f, dbv.a.a(true));
   public static final dbv.e<dbv.a> k = a("naturalRegeneration", dbv.b.a, dbv.a.a(true));
   public static final dbv.e<dbv.a> l = a("doDaylightCycle", dbv.b.e, dbv.a.a(true));
   public static final dbv.e<dbv.a> m = a("logAdminCommands", dbv.b.f, dbv.a.a(true));
   public static final dbv.e<dbv.a> n = a("showDeathMessages", dbv.b.f, dbv.a.a(true));
   public static final dbv.e<dbv.d> o = a("randomTickSpeed", dbv.b.e, dbv.d.a(3));
   public static final dbv.e<dbv.a> p = a("sendCommandFeedback", dbv.b.f, dbv.a.a(true));
   public static final dbv.e<dbv.a> q = a("reducedDebugInfo", dbv.b.g, dbv.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arg $$3 : $$0.ah().t()) {
         $$3.c.b(new adm($$3, $$2));
      }
   }));
   public static final dbv.e<dbv.a> r = a("spectatorsGenerateChunks", dbv.b.a, dbv.a.a(true));
   public static final dbv.e<dbv.d> s = a("spawnRadius", dbv.b.a, dbv.d.a(10));
   public static final dbv.e<dbv.a> t = a("disableElytraMovementCheck", dbv.b.a, dbv.a.a(false));
   public static final dbv.e<dbv.d> u = a("maxEntityCramming", dbv.b.b, dbv.d.a(24));
   public static final dbv.e<dbv.a> v = a("doWeatherCycle", dbv.b.e, dbv.a.a(true));
   public static final dbv.e<dbv.a> w = a("doLimitedCrafting", dbv.b.a, dbv.a.a(false, ($$0, $$1) -> {
      for (arg $$2 : $$0.ah().t()) {
         $$2.c.b(new adp(adp.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbv.e<dbv.d> x = a("maxCommandChainLength", dbv.b.g, dbv.d.a(65536));
   public static final dbv.e<dbv.d> y = a("maxCommandForkCount", dbv.b.g, dbv.d.a(65536));
   public static final dbv.e<dbv.d> z = a("commandModificationBlockLimit", dbv.b.g, dbv.d.a(32768));
   public static final dbv.e<dbv.a> A = a("announceAdvancements", dbv.b.f, dbv.a.a(true));
   public static final dbv.e<dbv.a> B = a("disableRaids", dbv.b.b, dbv.a.a(false));
   public static final dbv.e<dbv.a> C = a("doInsomnia", dbv.b.c, dbv.a.a(true));
   public static final dbv.e<dbv.a> D = a("doImmediateRespawn", dbv.b.a, dbv.a.a(false, ($$0, $$1) -> {
      for (arg $$2 : $$0.ah().t()) {
         $$2.c.b(new adp(adp.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbv.e<dbv.d> E = a("playersNetherPortalDefaultDelay", dbv.b.a, dbv.d.a(80));
   public static final dbv.e<dbv.d> F = a("playersNetherPortalCreativeDelay", dbv.b.a, dbv.d.a(1));
   public static final dbv.e<dbv.a> G = a("drowningDamage", dbv.b.a, dbv.a.a(true));
   public static final dbv.e<dbv.a> H = a("fallDamage", dbv.b.a, dbv.a.a(true));
   public static final dbv.e<dbv.a> I = a("fireDamage", dbv.b.a, dbv.a.a(true));
   public static final dbv.e<dbv.a> J = a("freezeDamage", dbv.b.a, dbv.a.a(true));
   public static final dbv.e<dbv.a> K = a("doPatrolSpawning", dbv.b.c, dbv.a.a(true));
   public static final dbv.e<dbv.a> L = a("doTraderSpawning", dbv.b.c, dbv.a.a(true));
   public static final dbv.e<dbv.a> M = a("doWardenSpawning", dbv.b.c, dbv.a.a(true));
   public static final dbv.e<dbv.a> N = a("forgiveDeadPlayers", dbv.b.b, dbv.a.a(true));
   public static final dbv.e<dbv.a> O = a("universalAnger", dbv.b.b, dbv.a.a(false));
   public static final dbv.e<dbv.d> P = a("playersSleepingPercentage", dbv.b.a, dbv.d.a(100));
   public static final dbv.e<dbv.a> Q = a("blockExplosionDropDecay", dbv.b.d, dbv.a.a(true));
   public static final dbv.e<dbv.a> R = a("mobExplosionDropDecay", dbv.b.d, dbv.a.a(true));
   public static final dbv.e<dbv.a> S = a("tntExplosionDropDecay", dbv.b.d, dbv.a.a(false));
   public static final dbv.e<dbv.d> T = a("snowAccumulationHeight", dbv.b.e, dbv.d.a(1));
   public static final dbv.e<dbv.a> U = a("waterSourceConversion", dbv.b.e, dbv.a.a(true));
   public static final dbv.e<dbv.a> V = a("lavaSourceConversion", dbv.b.e, dbv.a.a(false));
   public static final dbv.e<dbv.a> W = a("globalSoundEvents", dbv.b.g, dbv.a.a(true));
   public static final dbv.e<dbv.a> X = a("doVinesSpread", dbv.b.e, dbv.a.a(true));
   public static final dbv.e<dbv.a> Y = a("enderPearlsVanishOnDeath", dbv.b.a, dbv.a.a(true));
   public static final dbv.e<dbv.d> Z = a("spawnChunkRadius", dbv.b.g, dbv.d.a(2, 0, 32, ($$0, $$1) -> {
      arf $$2 = $$0.I();
      $$2.a($$2.V(), $$2.W());
   }));
   private final Map<dbv.e<?>, dbv.g<?>> ac;

   private static <T extends dbv.g<T>> dbv.e<T> a(String $$0, dbv.b $$1, dbv.f<T> $$2) {
      dbv.e<T> $$3 = new dbv.e<>($$0, $$1);
      dbv.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dbv(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public dbv() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbv.f)$$0.getValue()).a()));
   }

   private dbv(Map<dbv.e<?>, dbv.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends dbv.g<T>> T a(dbv.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public us a() {
      us $$0 = new us();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dbv b() {
      return new dbv(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbv.g)$$0.getValue()).f())));
   }

   public static void a(dbv.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (dbv.e<?>)$$1, (dbv.f<?>)$$2));
   }

   private static <T extends dbv.g<T>> void a(dbv.c $$0, dbv.e<?> $$1, dbv.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(dbv $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((dbv.e<?>)$$2, $$0, $$1));
   }

   private <T extends dbv.g<T>> void a(dbv.e<T> $$0, dbv $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dbv.e<dbv.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dbv.e<dbv.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dbv.g<dbv.a> {
      private boolean b;

      static dbv.f<dbv.a> a(boolean $$0, BiConsumer<MinecraftServer, dbv.a> $$1) {
         return new dbv.f<>(BoolArgumentType::bool, $$1x -> new dbv.a($$1x, $$0), $$1, dbv.c::b);
      }

      static dbv.f<dbv.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dbv.f<dbv.a> $$0, boolean $$1) {
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

      protected dbv.a d() {
         return this;
      }

      protected dbv.a e() {
         return new dbv.a(this.a, this.b);
      }

      public void a(dbv.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dbv.g<T>> void a(dbv.e<T> $$0, dbv.f<T> $$1) {
      }

      default void b(dbv.e<dbv.a> $$0, dbv.f<dbv.a> $$1) {
      }

      default void c(dbv.e<dbv.d> $$0, dbv.f<dbv.d> $$1) {
      }
   }

   public static class d extends dbv.g<dbv.d> {
      private int b;

      private static dbv.f<dbv.d> a(int $$0, BiConsumer<MinecraftServer, dbv.d> $$1) {
         return new dbv.f<>(IntegerArgumentType::integer, $$1x -> new dbv.d($$1x, $$0), $$1, dbv.c::c);
      }

      static dbv.f<dbv.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, dbv.d> $$3) {
         return new dbv.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dbv.d($$1x, $$0), $$3, dbv.c::c);
      }

      static dbv.f<dbv.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dbv.f<dbv.d> $$0, int $$1) {
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
               dbv.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dbv.d d() {
         return this;
      }

      protected dbv.d e() {
         return new dbv.d(this.a, this.b);
      }

      public void a(dbv.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dbv.g<T>> {
      final String a;
      private final dbv.b b;

      public e(String $$0, dbv.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dbv.e && ((dbv.e)$$0).a.equals(this.a);
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

      public dbv.b c() {
         return this.b;
      }
   }

   public static class f<T extends dbv.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dbv.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dbv.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<dbv.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dbv.h<T> $$3) {
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

      public void a(dbv.c $$0, dbv.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends dbv.g<T>> {
      protected final dbv.f<T> a;

      public g(dbv.f<T> $$0) {
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

   interface h<T extends dbv.g<T>> {
      void call(dbv.c var1, dbv.e<T> var2, dbv.f<T> var3);
   }
}
