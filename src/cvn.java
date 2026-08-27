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

public class cvn {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<cvn.e<?>, cvn.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cvn.e<cvn.a> b = a("doFireTick", cvn.b.e, cvn.a.a(true));
   public static final cvn.e<cvn.a> c = a("mobGriefing", cvn.b.b, cvn.a.a(true));
   public static final cvn.e<cvn.a> d = a("keepInventory", cvn.b.a, cvn.a.a(false));
   public static final cvn.e<cvn.a> e = a("doMobSpawning", cvn.b.c, cvn.a.a(true));
   public static final cvn.e<cvn.a> f = a("doMobLoot", cvn.b.d, cvn.a.a(true));
   public static final cvn.e<cvn.a> g = a("projectilesCanBreakBlocks", cvn.b.d, cvn.a.a(true));
   public static final cvn.e<cvn.a> h = a("doTileDrops", cvn.b.d, cvn.a.a(true));
   public static final cvn.e<cvn.a> i = a("doEntityDrops", cvn.b.d, cvn.a.a(true));
   public static final cvn.e<cvn.a> j = a("commandBlockOutput", cvn.b.f, cvn.a.a(true));
   public static final cvn.e<cvn.a> k = a("naturalRegeneration", cvn.b.a, cvn.a.a(true));
   public static final cvn.e<cvn.a> l = a("doDaylightCycle", cvn.b.e, cvn.a.a(true));
   public static final cvn.e<cvn.a> m = a("logAdminCommands", cvn.b.f, cvn.a.a(true));
   public static final cvn.e<cvn.a> n = a("showDeathMessages", cvn.b.f, cvn.a.a(true));
   public static final cvn.e<cvn.d> o = a("randomTickSpeed", cvn.b.e, cvn.d.a(3));
   public static final cvn.e<cvn.a> p = a("sendCommandFeedback", cvn.b.f, cvn.a.a(true));
   public static final cvn.e<cvn.a> q = a("reducedDebugInfo", cvn.b.g, cvn.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aox $$3 : $$0.ag().t()) {
         $$3.d.b(new abj($$3, $$2));
      }
   }));
   public static final cvn.e<cvn.a> r = a("spectatorsGenerateChunks", cvn.b.a, cvn.a.a(true));
   public static final cvn.e<cvn.d> s = a("spawnRadius", cvn.b.a, cvn.d.a(10));
   public static final cvn.e<cvn.a> t = a("disableElytraMovementCheck", cvn.b.a, cvn.a.a(false));
   public static final cvn.e<cvn.d> u = a("maxEntityCramming", cvn.b.b, cvn.d.a(24));
   public static final cvn.e<cvn.a> v = a("doWeatherCycle", cvn.b.e, cvn.a.a(true));
   public static final cvn.e<cvn.a> w = a("doLimitedCrafting", cvn.b.a, cvn.a.a(false, ($$0, $$1) -> {
      for (aox $$2 : $$0.ag().t()) {
         $$2.d.b(new abm(abm.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cvn.e<cvn.d> x = a("maxCommandChainLength", cvn.b.g, cvn.d.a(65536));
   public static final cvn.e<cvn.d> y = a("maxCommandForkCount", cvn.b.g, cvn.d.a(65536));
   public static final cvn.e<cvn.d> z = a("commandModificationBlockLimit", cvn.b.g, cvn.d.a(32768));
   public static final cvn.e<cvn.a> A = a("announceAdvancements", cvn.b.f, cvn.a.a(true));
   public static final cvn.e<cvn.a> B = a("disableRaids", cvn.b.b, cvn.a.a(false));
   public static final cvn.e<cvn.a> C = a("doInsomnia", cvn.b.c, cvn.a.a(true));
   public static final cvn.e<cvn.a> D = a("doImmediateRespawn", cvn.b.a, cvn.a.a(false, ($$0, $$1) -> {
      for (aox $$2 : $$0.ag().t()) {
         $$2.d.b(new abm(abm.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cvn.e<cvn.d> E = a("playersNetherPortalDefaultDelay", cvn.b.a, cvn.d.a(80));
   public static final cvn.e<cvn.d> F = a("playersNetherPortalCreativeDelay", cvn.b.a, cvn.d.a(1));
   public static final cvn.e<cvn.a> G = a("drowningDamage", cvn.b.a, cvn.a.a(true));
   public static final cvn.e<cvn.a> H = a("fallDamage", cvn.b.a, cvn.a.a(true));
   public static final cvn.e<cvn.a> I = a("fireDamage", cvn.b.a, cvn.a.a(true));
   public static final cvn.e<cvn.a> J = a("freezeDamage", cvn.b.a, cvn.a.a(true));
   public static final cvn.e<cvn.a> K = a("doPatrolSpawning", cvn.b.c, cvn.a.a(true));
   public static final cvn.e<cvn.a> L = a("doTraderSpawning", cvn.b.c, cvn.a.a(true));
   public static final cvn.e<cvn.a> M = a("doWardenSpawning", cvn.b.c, cvn.a.a(true));
   public static final cvn.e<cvn.a> N = a("forgiveDeadPlayers", cvn.b.b, cvn.a.a(true));
   public static final cvn.e<cvn.a> O = a("universalAnger", cvn.b.b, cvn.a.a(false));
   public static final cvn.e<cvn.d> P = a("playersSleepingPercentage", cvn.b.a, cvn.d.a(100));
   public static final cvn.e<cvn.a> Q = a("blockExplosionDropDecay", cvn.b.d, cvn.a.a(true));
   public static final cvn.e<cvn.a> R = a("mobExplosionDropDecay", cvn.b.d, cvn.a.a(true));
   public static final cvn.e<cvn.a> S = a("tntExplosionDropDecay", cvn.b.d, cvn.a.a(false));
   public static final cvn.e<cvn.d> T = a("snowAccumulationHeight", cvn.b.e, cvn.d.a(1));
   public static final cvn.e<cvn.a> U = a("waterSourceConversion", cvn.b.e, cvn.a.a(true));
   public static final cvn.e<cvn.a> V = a("lavaSourceConversion", cvn.b.e, cvn.a.a(false));
   public static final cvn.e<cvn.a> W = a("globalSoundEvents", cvn.b.g, cvn.a.a(true));
   public static final cvn.e<cvn.a> X = a("doVinesSpread", cvn.b.e, cvn.a.a(true));
   public static final cvn.e<cvn.a> Y = a("enderPearlsVanishOnDeath", cvn.b.a, cvn.a.a(true));
   public static final cvn.e<cvn.d> Z = a("spawnChunkRadius", cvn.b.g, cvn.d.a(2, 0, 32, ($$0, $$1) -> {
      aow $$2 = $$0.H();
      $$2.a($$2.T(), $$2.U());
   }));
   private final Map<cvn.e<?>, cvn.g<?>> ac;

   private static <T extends cvn.g<T>> cvn.e<T> a(String $$0, cvn.b $$1, cvn.f<T> $$2) {
      cvn.e<T> $$3 = new cvn.e<>($$0, $$1);
      cvn.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cvn(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cvn() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cvn.f)$$0.getValue()).a()));
   }

   private cvn(Map<cvn.e<?>, cvn.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends cvn.g<T>> T a(cvn.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public sw a() {
      sw $$0 = new sw();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public cvn b() {
      return new cvn(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cvn.g)$$0.getValue()).f())));
   }

   public static void a(cvn.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (cvn.e<?>)$$1, (cvn.f<?>)$$2));
   }

   private static <T extends cvn.g<T>> void a(cvn.c $$0, cvn.e<?> $$1, cvn.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cvn $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((cvn.e<?>)$$2, $$0, $$1));
   }

   private <T extends cvn.g<T>> void a(cvn.e<T> $$0, cvn $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cvn.e<cvn.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cvn.e<cvn.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cvn.g<cvn.a> {
      private boolean b;

      static cvn.f<cvn.a> a(boolean $$0, BiConsumer<MinecraftServer, cvn.a> $$1) {
         return new cvn.f<>(BoolArgumentType::bool, $$1x -> new cvn.a($$1x, $$0), $$1, cvn.c::b);
      }

      static cvn.f<cvn.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cvn.f<cvn.a> $$0, boolean $$1) {
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

      protected cvn.a d() {
         return this;
      }

      protected cvn.a e() {
         return new cvn.a(this.a, this.b);
      }

      public void a(cvn.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cvn.g<T>> void a(cvn.e<T> $$0, cvn.f<T> $$1) {
      }

      default void b(cvn.e<cvn.a> $$0, cvn.f<cvn.a> $$1) {
      }

      default void c(cvn.e<cvn.d> $$0, cvn.f<cvn.d> $$1) {
      }
   }

   public static class d extends cvn.g<cvn.d> {
      private int b;

      private static cvn.f<cvn.d> a(int $$0, BiConsumer<MinecraftServer, cvn.d> $$1) {
         return new cvn.f<>(IntegerArgumentType::integer, $$1x -> new cvn.d($$1x, $$0), $$1, cvn.c::c);
      }

      static cvn.f<cvn.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, cvn.d> $$3) {
         return new cvn.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new cvn.d($$1x, $$0), $$3, cvn.c::c);
      }

      static cvn.f<cvn.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cvn.f<cvn.d> $$0, int $$1) {
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
               cvn.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cvn.d d() {
         return this;
      }

      protected cvn.d e() {
         return new cvn.d(this.a, this.b);
      }

      public void a(cvn.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cvn.g<T>> {
      final String a;
      private final cvn.b b;

      public e(String $$0, cvn.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cvn.e && ((cvn.e)$$0).a.equals(this.a);
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

      public cvn.b c() {
         return this.b;
      }
   }

   public static class f<T extends cvn.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<cvn.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cvn.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cvn.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cvn.h<T> $$3) {
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

      public void a(cvn.c $$0, cvn.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cvn.g<T>> {
      protected final cvn.f<T> a;

      public g(cvn.f<T> $$0) {
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

   interface h<T extends cvn.g<T>> {
      void call(cvn.c var1, cvn.e<T> var2, cvn.f<T> var3);
   }
}
