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

public class cwa {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<cwa.e<?>, cwa.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cwa.e<cwa.a> b = a("doFireTick", cwa.b.e, cwa.a.a(true));
   public static final cwa.e<cwa.a> c = a("mobGriefing", cwa.b.b, cwa.a.a(true));
   public static final cwa.e<cwa.a> d = a("keepInventory", cwa.b.a, cwa.a.a(false));
   public static final cwa.e<cwa.a> e = a("doMobSpawning", cwa.b.c, cwa.a.a(true));
   public static final cwa.e<cwa.a> f = a("doMobLoot", cwa.b.d, cwa.a.a(true));
   public static final cwa.e<cwa.a> g = a("projectilesCanBreakBlocks", cwa.b.d, cwa.a.a(true));
   public static final cwa.e<cwa.a> h = a("doTileDrops", cwa.b.d, cwa.a.a(true));
   public static final cwa.e<cwa.a> i = a("doEntityDrops", cwa.b.d, cwa.a.a(true));
   public static final cwa.e<cwa.a> j = a("commandBlockOutput", cwa.b.f, cwa.a.a(true));
   public static final cwa.e<cwa.a> k = a("naturalRegeneration", cwa.b.a, cwa.a.a(true));
   public static final cwa.e<cwa.a> l = a("doDaylightCycle", cwa.b.e, cwa.a.a(true));
   public static final cwa.e<cwa.a> m = a("logAdminCommands", cwa.b.f, cwa.a.a(true));
   public static final cwa.e<cwa.a> n = a("showDeathMessages", cwa.b.f, cwa.a.a(true));
   public static final cwa.e<cwa.d> o = a("randomTickSpeed", cwa.b.e, cwa.d.a(3));
   public static final cwa.e<cwa.a> p = a("sendCommandFeedback", cwa.b.f, cwa.a.a(true));
   public static final cwa.e<cwa.a> q = a("reducedDebugInfo", cwa.b.g, cwa.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (apb $$3 : $$0.ah().t()) {
         $$3.d.b(new abm($$3, $$2));
      }
   }));
   public static final cwa.e<cwa.a> r = a("spectatorsGenerateChunks", cwa.b.a, cwa.a.a(true));
   public static final cwa.e<cwa.d> s = a("spawnRadius", cwa.b.a, cwa.d.a(10));
   public static final cwa.e<cwa.a> t = a("disableElytraMovementCheck", cwa.b.a, cwa.a.a(false));
   public static final cwa.e<cwa.d> u = a("maxEntityCramming", cwa.b.b, cwa.d.a(24));
   public static final cwa.e<cwa.a> v = a("doWeatherCycle", cwa.b.e, cwa.a.a(true));
   public static final cwa.e<cwa.a> w = a("doLimitedCrafting", cwa.b.a, cwa.a.a(false, ($$0, $$1) -> {
      for (apb $$2 : $$0.ah().t()) {
         $$2.d.b(new abp(abp.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cwa.e<cwa.d> x = a("maxCommandChainLength", cwa.b.g, cwa.d.a(65536));
   public static final cwa.e<cwa.d> y = a("maxCommandForkCount", cwa.b.g, cwa.d.a(65536));
   public static final cwa.e<cwa.d> z = a("commandModificationBlockLimit", cwa.b.g, cwa.d.a(32768));
   public static final cwa.e<cwa.a> A = a("announceAdvancements", cwa.b.f, cwa.a.a(true));
   public static final cwa.e<cwa.a> B = a("disableRaids", cwa.b.b, cwa.a.a(false));
   public static final cwa.e<cwa.a> C = a("doInsomnia", cwa.b.c, cwa.a.a(true));
   public static final cwa.e<cwa.a> D = a("doImmediateRespawn", cwa.b.a, cwa.a.a(false, ($$0, $$1) -> {
      for (apb $$2 : $$0.ah().t()) {
         $$2.d.b(new abp(abp.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cwa.e<cwa.d> E = a("playersNetherPortalDefaultDelay", cwa.b.a, cwa.d.a(80));
   public static final cwa.e<cwa.d> F = a("playersNetherPortalCreativeDelay", cwa.b.a, cwa.d.a(1));
   public static final cwa.e<cwa.a> G = a("drowningDamage", cwa.b.a, cwa.a.a(true));
   public static final cwa.e<cwa.a> H = a("fallDamage", cwa.b.a, cwa.a.a(true));
   public static final cwa.e<cwa.a> I = a("fireDamage", cwa.b.a, cwa.a.a(true));
   public static final cwa.e<cwa.a> J = a("freezeDamage", cwa.b.a, cwa.a.a(true));
   public static final cwa.e<cwa.a> K = a("doPatrolSpawning", cwa.b.c, cwa.a.a(true));
   public static final cwa.e<cwa.a> L = a("doTraderSpawning", cwa.b.c, cwa.a.a(true));
   public static final cwa.e<cwa.a> M = a("doWardenSpawning", cwa.b.c, cwa.a.a(true));
   public static final cwa.e<cwa.a> N = a("forgiveDeadPlayers", cwa.b.b, cwa.a.a(true));
   public static final cwa.e<cwa.a> O = a("universalAnger", cwa.b.b, cwa.a.a(false));
   public static final cwa.e<cwa.d> P = a("playersSleepingPercentage", cwa.b.a, cwa.d.a(100));
   public static final cwa.e<cwa.a> Q = a("blockExplosionDropDecay", cwa.b.d, cwa.a.a(true));
   public static final cwa.e<cwa.a> R = a("mobExplosionDropDecay", cwa.b.d, cwa.a.a(true));
   public static final cwa.e<cwa.a> S = a("tntExplosionDropDecay", cwa.b.d, cwa.a.a(false));
   public static final cwa.e<cwa.d> T = a("snowAccumulationHeight", cwa.b.e, cwa.d.a(1));
   public static final cwa.e<cwa.a> U = a("waterSourceConversion", cwa.b.e, cwa.a.a(true));
   public static final cwa.e<cwa.a> V = a("lavaSourceConversion", cwa.b.e, cwa.a.a(false));
   public static final cwa.e<cwa.a> W = a("globalSoundEvents", cwa.b.g, cwa.a.a(true));
   public static final cwa.e<cwa.a> X = a("doVinesSpread", cwa.b.e, cwa.a.a(true));
   public static final cwa.e<cwa.a> Y = a("enderPearlsVanishOnDeath", cwa.b.a, cwa.a.a(true));
   public static final cwa.e<cwa.d> Z = a("spawnChunkRadius", cwa.b.g, cwa.d.a(2, 0, 32, ($$0, $$1) -> {
      apa $$2 = $$0.I();
      $$2.a($$2.T(), $$2.U());
   }));
   private final Map<cwa.e<?>, cwa.g<?>> ac;

   private static <T extends cwa.g<T>> cwa.e<T> a(String $$0, cwa.b $$1, cwa.f<T> $$2) {
      cwa.e<T> $$3 = new cwa.e<>($$0, $$1);
      cwa.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cwa(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cwa() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cwa.f)$$0.getValue()).a()));
   }

   private cwa(Map<cwa.e<?>, cwa.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends cwa.g<T>> T a(cwa.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public sy a() {
      sy $$0 = new sy();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public cwa b() {
      return new cwa(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cwa.g)$$0.getValue()).f())));
   }

   public static void a(cwa.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (cwa.e<?>)$$1, (cwa.f<?>)$$2));
   }

   private static <T extends cwa.g<T>> void a(cwa.c $$0, cwa.e<?> $$1, cwa.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cwa $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((cwa.e<?>)$$2, $$0, $$1));
   }

   private <T extends cwa.g<T>> void a(cwa.e<T> $$0, cwa $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cwa.e<cwa.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cwa.e<cwa.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cwa.g<cwa.a> {
      private boolean b;

      static cwa.f<cwa.a> a(boolean $$0, BiConsumer<MinecraftServer, cwa.a> $$1) {
         return new cwa.f<>(BoolArgumentType::bool, $$1x -> new cwa.a($$1x, $$0), $$1, cwa.c::b);
      }

      static cwa.f<cwa.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cwa.f<cwa.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<du> $$0, String $$1) {
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

      protected cwa.a d() {
         return this;
      }

      protected cwa.a e() {
         return new cwa.a(this.a, this.b);
      }

      public void a(cwa.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cwa.g<T>> void a(cwa.e<T> $$0, cwa.f<T> $$1) {
      }

      default void b(cwa.e<cwa.a> $$0, cwa.f<cwa.a> $$1) {
      }

      default void c(cwa.e<cwa.d> $$0, cwa.f<cwa.d> $$1) {
      }
   }

   public static class d extends cwa.g<cwa.d> {
      private int b;

      private static cwa.f<cwa.d> a(int $$0, BiConsumer<MinecraftServer, cwa.d> $$1) {
         return new cwa.f<>(IntegerArgumentType::integer, $$1x -> new cwa.d($$1x, $$0), $$1, cwa.c::c);
      }

      static cwa.f<cwa.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, cwa.d> $$3) {
         return new cwa.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new cwa.d($$1x, $$0), $$3, cwa.c::c);
      }

      static cwa.f<cwa.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cwa.f<cwa.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<du> $$0, String $$1) {
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
               cwa.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cwa.d d() {
         return this;
      }

      protected cwa.d e() {
         return new cwa.d(this.a, this.b);
      }

      public void a(cwa.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cwa.g<T>> {
      final String a;
      private final cwa.b b;

      public e(String $$0, cwa.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cwa.e && ((cwa.e)$$0).a.equals(this.a);
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

      public cwa.b c() {
         return this.b;
      }
   }

   public static class f<T extends cwa.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<cwa.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cwa.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cwa.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cwa.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<du, ?> a(String $$0) {
         return dv.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(cwa.c $$0, cwa.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cwa.g<T>> {
      protected final cwa.f<T> a;

      public g(cwa.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<du> var1, String var2);

      public void b(CommandContext<du> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((du)$$0.getSource()).l());
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

   interface h<T extends cwa.g<T>> {
      void call(cwa.c var1, cwa.e<T> var2, cwa.f<T> var3);
   }
}
