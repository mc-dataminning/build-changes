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

public class cwx {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<cwx.e<?>, cwx.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cwx.e<cwx.a> b = a("doFireTick", cwx.b.e, cwx.a.a(true));
   public static final cwx.e<cwx.a> c = a("mobGriefing", cwx.b.b, cwx.a.a(true));
   public static final cwx.e<cwx.a> d = a("keepInventory", cwx.b.a, cwx.a.a(false));
   public static final cwx.e<cwx.a> e = a("doMobSpawning", cwx.b.c, cwx.a.a(true));
   public static final cwx.e<cwx.a> f = a("doMobLoot", cwx.b.d, cwx.a.a(true));
   public static final cwx.e<cwx.a> g = a("projectilesCanBreakBlocks", cwx.b.d, cwx.a.a(true));
   public static final cwx.e<cwx.a> h = a("doTileDrops", cwx.b.d, cwx.a.a(true));
   public static final cwx.e<cwx.a> i = a("doEntityDrops", cwx.b.d, cwx.a.a(true));
   public static final cwx.e<cwx.a> j = a("commandBlockOutput", cwx.b.f, cwx.a.a(true));
   public static final cwx.e<cwx.a> k = a("naturalRegeneration", cwx.b.a, cwx.a.a(true));
   public static final cwx.e<cwx.a> l = a("doDaylightCycle", cwx.b.e, cwx.a.a(true));
   public static final cwx.e<cwx.a> m = a("logAdminCommands", cwx.b.f, cwx.a.a(true));
   public static final cwx.e<cwx.a> n = a("showDeathMessages", cwx.b.f, cwx.a.a(true));
   public static final cwx.e<cwx.d> o = a("randomTickSpeed", cwx.b.e, cwx.d.a(3));
   public static final cwx.e<cwx.a> p = a("sendCommandFeedback", cwx.b.f, cwx.a.a(true));
   public static final cwx.e<cwx.a> q = a("reducedDebugInfo", cwx.b.g, cwx.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (apg $$3 : $$0.ah().t()) {
         $$3.d.b(new abq($$3, $$2));
      }
   }));
   public static final cwx.e<cwx.a> r = a("spectatorsGenerateChunks", cwx.b.a, cwx.a.a(true));
   public static final cwx.e<cwx.d> s = a("spawnRadius", cwx.b.a, cwx.d.a(10));
   public static final cwx.e<cwx.a> t = a("disableElytraMovementCheck", cwx.b.a, cwx.a.a(false));
   public static final cwx.e<cwx.d> u = a("maxEntityCramming", cwx.b.b, cwx.d.a(24));
   public static final cwx.e<cwx.a> v = a("doWeatherCycle", cwx.b.e, cwx.a.a(true));
   public static final cwx.e<cwx.a> w = a("doLimitedCrafting", cwx.b.a, cwx.a.a(false, ($$0, $$1) -> {
      for (apg $$2 : $$0.ah().t()) {
         $$2.d.b(new abt(abt.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cwx.e<cwx.d> x = a("maxCommandChainLength", cwx.b.g, cwx.d.a(65536));
   public static final cwx.e<cwx.d> y = a("maxCommandForkCount", cwx.b.g, cwx.d.a(65536));
   public static final cwx.e<cwx.d> z = a("commandModificationBlockLimit", cwx.b.g, cwx.d.a(32768));
   public static final cwx.e<cwx.a> A = a("announceAdvancements", cwx.b.f, cwx.a.a(true));
   public static final cwx.e<cwx.a> B = a("disableRaids", cwx.b.b, cwx.a.a(false));
   public static final cwx.e<cwx.a> C = a("doInsomnia", cwx.b.c, cwx.a.a(true));
   public static final cwx.e<cwx.a> D = a("doImmediateRespawn", cwx.b.a, cwx.a.a(false, ($$0, $$1) -> {
      for (apg $$2 : $$0.ah().t()) {
         $$2.d.b(new abt(abt.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cwx.e<cwx.d> E = a("playersNetherPortalDefaultDelay", cwx.b.a, cwx.d.a(80));
   public static final cwx.e<cwx.d> F = a("playersNetherPortalCreativeDelay", cwx.b.a, cwx.d.a(1));
   public static final cwx.e<cwx.a> G = a("drowningDamage", cwx.b.a, cwx.a.a(true));
   public static final cwx.e<cwx.a> H = a("fallDamage", cwx.b.a, cwx.a.a(true));
   public static final cwx.e<cwx.a> I = a("fireDamage", cwx.b.a, cwx.a.a(true));
   public static final cwx.e<cwx.a> J = a("freezeDamage", cwx.b.a, cwx.a.a(true));
   public static final cwx.e<cwx.a> K = a("doPatrolSpawning", cwx.b.c, cwx.a.a(true));
   public static final cwx.e<cwx.a> L = a("doTraderSpawning", cwx.b.c, cwx.a.a(true));
   public static final cwx.e<cwx.a> M = a("doWardenSpawning", cwx.b.c, cwx.a.a(true));
   public static final cwx.e<cwx.a> N = a("forgiveDeadPlayers", cwx.b.b, cwx.a.a(true));
   public static final cwx.e<cwx.a> O = a("universalAnger", cwx.b.b, cwx.a.a(false));
   public static final cwx.e<cwx.d> P = a("playersSleepingPercentage", cwx.b.a, cwx.d.a(100));
   public static final cwx.e<cwx.a> Q = a("blockExplosionDropDecay", cwx.b.d, cwx.a.a(true));
   public static final cwx.e<cwx.a> R = a("mobExplosionDropDecay", cwx.b.d, cwx.a.a(true));
   public static final cwx.e<cwx.a> S = a("tntExplosionDropDecay", cwx.b.d, cwx.a.a(false));
   public static final cwx.e<cwx.d> T = a("snowAccumulationHeight", cwx.b.e, cwx.d.a(1));
   public static final cwx.e<cwx.a> U = a("waterSourceConversion", cwx.b.e, cwx.a.a(true));
   public static final cwx.e<cwx.a> V = a("lavaSourceConversion", cwx.b.e, cwx.a.a(false));
   public static final cwx.e<cwx.a> W = a("globalSoundEvents", cwx.b.g, cwx.a.a(true));
   public static final cwx.e<cwx.a> X = a("doVinesSpread", cwx.b.e, cwx.a.a(true));
   public static final cwx.e<cwx.a> Y = a("enderPearlsVanishOnDeath", cwx.b.a, cwx.a.a(true));
   public static final cwx.e<cwx.d> Z = a("spawnChunkRadius", cwx.b.g, cwx.d.a(2, 0, 32, ($$0, $$1) -> {
      apf $$2 = $$0.I();
      $$2.a($$2.T(), $$2.U());
   }));
   private final Map<cwx.e<?>, cwx.g<?>> ac;

   private static <T extends cwx.g<T>> cwx.e<T> a(String $$0, cwx.b $$1, cwx.f<T> $$2) {
      cwx.e<T> $$3 = new cwx.e<>($$0, $$1);
      cwx.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cwx(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cwx() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cwx.f)$$0.getValue()).a()));
   }

   private cwx(Map<cwx.e<?>, cwx.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends cwx.g<T>> T a(cwx.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public ta a() {
      ta $$0 = new ta();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public cwx b() {
      return new cwx(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cwx.g)$$0.getValue()).f())));
   }

   public static void a(cwx.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (cwx.e<?>)$$1, (cwx.f<?>)$$2));
   }

   private static <T extends cwx.g<T>> void a(cwx.c $$0, cwx.e<?> $$1, cwx.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cwx $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((cwx.e<?>)$$2, $$0, $$1));
   }

   private <T extends cwx.g<T>> void a(cwx.e<T> $$0, cwx $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cwx.e<cwx.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cwx.e<cwx.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cwx.g<cwx.a> {
      private boolean b;

      static cwx.f<cwx.a> a(boolean $$0, BiConsumer<MinecraftServer, cwx.a> $$1) {
         return new cwx.f<>(BoolArgumentType::bool, $$1x -> new cwx.a($$1x, $$0), $$1, cwx.c::b);
      }

      static cwx.f<cwx.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cwx.f<cwx.a> $$0, boolean $$1) {
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

      protected cwx.a d() {
         return this;
      }

      protected cwx.a e() {
         return new cwx.a(this.a, this.b);
      }

      public void a(cwx.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cwx.g<T>> void a(cwx.e<T> $$0, cwx.f<T> $$1) {
      }

      default void b(cwx.e<cwx.a> $$0, cwx.f<cwx.a> $$1) {
      }

      default void c(cwx.e<cwx.d> $$0, cwx.f<cwx.d> $$1) {
      }
   }

   public static class d extends cwx.g<cwx.d> {
      private int b;

      private static cwx.f<cwx.d> a(int $$0, BiConsumer<MinecraftServer, cwx.d> $$1) {
         return new cwx.f<>(IntegerArgumentType::integer, $$1x -> new cwx.d($$1x, $$0), $$1, cwx.c::c);
      }

      static cwx.f<cwx.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, cwx.d> $$3) {
         return new cwx.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new cwx.d($$1x, $$0), $$3, cwx.c::c);
      }

      static cwx.f<cwx.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cwx.f<cwx.d> $$0, int $$1) {
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
               cwx.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cwx.d d() {
         return this;
      }

      protected cwx.d e() {
         return new cwx.d(this.a, this.b);
      }

      public void a(cwx.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cwx.g<T>> {
      final String a;
      private final cwx.b b;

      public e(String $$0, cwx.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cwx.e && ((cwx.e)$$0).a.equals(this.a);
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

      public cwx.b c() {
         return this.b;
      }
   }

   public static class f<T extends cwx.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<cwx.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cwx.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cwx.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cwx.h<T> $$3) {
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

      public void a(cwx.c $$0, cwx.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cwx.g<T>> {
      protected final cwx.f<T> a;

      public g(cwx.f<T> $$0) {
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

   interface h<T extends cwx.g<T>> {
      void call(cwx.c var1, cwx.e<T> var2, cwx.f<T> var3);
   }
}
