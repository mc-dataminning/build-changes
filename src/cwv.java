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

public class cwv {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<cwv.e<?>, cwv.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cwv.e<cwv.a> b = a("doFireTick", cwv.b.e, cwv.a.a(true));
   public static final cwv.e<cwv.a> c = a("mobGriefing", cwv.b.b, cwv.a.a(true));
   public static final cwv.e<cwv.a> d = a("keepInventory", cwv.b.a, cwv.a.a(false));
   public static final cwv.e<cwv.a> e = a("doMobSpawning", cwv.b.c, cwv.a.a(true));
   public static final cwv.e<cwv.a> f = a("doMobLoot", cwv.b.d, cwv.a.a(true));
   public static final cwv.e<cwv.a> g = a("projectilesCanBreakBlocks", cwv.b.d, cwv.a.a(true));
   public static final cwv.e<cwv.a> h = a("doTileDrops", cwv.b.d, cwv.a.a(true));
   public static final cwv.e<cwv.a> i = a("doEntityDrops", cwv.b.d, cwv.a.a(true));
   public static final cwv.e<cwv.a> j = a("commandBlockOutput", cwv.b.f, cwv.a.a(true));
   public static final cwv.e<cwv.a> k = a("naturalRegeneration", cwv.b.a, cwv.a.a(true));
   public static final cwv.e<cwv.a> l = a("doDaylightCycle", cwv.b.e, cwv.a.a(true));
   public static final cwv.e<cwv.a> m = a("logAdminCommands", cwv.b.f, cwv.a.a(true));
   public static final cwv.e<cwv.a> n = a("showDeathMessages", cwv.b.f, cwv.a.a(true));
   public static final cwv.e<cwv.d> o = a("randomTickSpeed", cwv.b.e, cwv.d.a(3));
   public static final cwv.e<cwv.a> p = a("sendCommandFeedback", cwv.b.f, cwv.a.a(true));
   public static final cwv.e<cwv.a> q = a("reducedDebugInfo", cwv.b.g, cwv.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (apg $$3 : $$0.ah().t()) {
         $$3.d.b(new abq($$3, $$2));
      }
   }));
   public static final cwv.e<cwv.a> r = a("spectatorsGenerateChunks", cwv.b.a, cwv.a.a(true));
   public static final cwv.e<cwv.d> s = a("spawnRadius", cwv.b.a, cwv.d.a(10));
   public static final cwv.e<cwv.a> t = a("disableElytraMovementCheck", cwv.b.a, cwv.a.a(false));
   public static final cwv.e<cwv.d> u = a("maxEntityCramming", cwv.b.b, cwv.d.a(24));
   public static final cwv.e<cwv.a> v = a("doWeatherCycle", cwv.b.e, cwv.a.a(true));
   public static final cwv.e<cwv.a> w = a("doLimitedCrafting", cwv.b.a, cwv.a.a(false, ($$0, $$1) -> {
      for (apg $$2 : $$0.ah().t()) {
         $$2.d.b(new abt(abt.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cwv.e<cwv.d> x = a("maxCommandChainLength", cwv.b.g, cwv.d.a(65536));
   public static final cwv.e<cwv.d> y = a("maxCommandForkCount", cwv.b.g, cwv.d.a(65536));
   public static final cwv.e<cwv.d> z = a("commandModificationBlockLimit", cwv.b.g, cwv.d.a(32768));
   public static final cwv.e<cwv.a> A = a("announceAdvancements", cwv.b.f, cwv.a.a(true));
   public static final cwv.e<cwv.a> B = a("disableRaids", cwv.b.b, cwv.a.a(false));
   public static final cwv.e<cwv.a> C = a("doInsomnia", cwv.b.c, cwv.a.a(true));
   public static final cwv.e<cwv.a> D = a("doImmediateRespawn", cwv.b.a, cwv.a.a(false, ($$0, $$1) -> {
      for (apg $$2 : $$0.ah().t()) {
         $$2.d.b(new abt(abt.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cwv.e<cwv.d> E = a("playersNetherPortalDefaultDelay", cwv.b.a, cwv.d.a(80));
   public static final cwv.e<cwv.d> F = a("playersNetherPortalCreativeDelay", cwv.b.a, cwv.d.a(1));
   public static final cwv.e<cwv.a> G = a("drowningDamage", cwv.b.a, cwv.a.a(true));
   public static final cwv.e<cwv.a> H = a("fallDamage", cwv.b.a, cwv.a.a(true));
   public static final cwv.e<cwv.a> I = a("fireDamage", cwv.b.a, cwv.a.a(true));
   public static final cwv.e<cwv.a> J = a("freezeDamage", cwv.b.a, cwv.a.a(true));
   public static final cwv.e<cwv.a> K = a("doPatrolSpawning", cwv.b.c, cwv.a.a(true));
   public static final cwv.e<cwv.a> L = a("doTraderSpawning", cwv.b.c, cwv.a.a(true));
   public static final cwv.e<cwv.a> M = a("doWardenSpawning", cwv.b.c, cwv.a.a(true));
   public static final cwv.e<cwv.a> N = a("forgiveDeadPlayers", cwv.b.b, cwv.a.a(true));
   public static final cwv.e<cwv.a> O = a("universalAnger", cwv.b.b, cwv.a.a(false));
   public static final cwv.e<cwv.d> P = a("playersSleepingPercentage", cwv.b.a, cwv.d.a(100));
   public static final cwv.e<cwv.a> Q = a("blockExplosionDropDecay", cwv.b.d, cwv.a.a(true));
   public static final cwv.e<cwv.a> R = a("mobExplosionDropDecay", cwv.b.d, cwv.a.a(true));
   public static final cwv.e<cwv.a> S = a("tntExplosionDropDecay", cwv.b.d, cwv.a.a(false));
   public static final cwv.e<cwv.d> T = a("snowAccumulationHeight", cwv.b.e, cwv.d.a(1));
   public static final cwv.e<cwv.a> U = a("waterSourceConversion", cwv.b.e, cwv.a.a(true));
   public static final cwv.e<cwv.a> V = a("lavaSourceConversion", cwv.b.e, cwv.a.a(false));
   public static final cwv.e<cwv.a> W = a("globalSoundEvents", cwv.b.g, cwv.a.a(true));
   public static final cwv.e<cwv.a> X = a("doVinesSpread", cwv.b.e, cwv.a.a(true));
   public static final cwv.e<cwv.a> Y = a("enderPearlsVanishOnDeath", cwv.b.a, cwv.a.a(true));
   public static final cwv.e<cwv.d> Z = a("spawnChunkRadius", cwv.b.g, cwv.d.a(2, 0, 32, ($$0, $$1) -> {
      apf $$2 = $$0.I();
      $$2.a($$2.T(), $$2.U());
   }));
   private final Map<cwv.e<?>, cwv.g<?>> ac;

   private static <T extends cwv.g<T>> cwv.e<T> a(String $$0, cwv.b $$1, cwv.f<T> $$2) {
      cwv.e<T> $$3 = new cwv.e<>($$0, $$1);
      cwv.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cwv(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cwv() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cwv.f)$$0.getValue()).a()));
   }

   private cwv(Map<cwv.e<?>, cwv.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends cwv.g<T>> T a(cwv.e<T> $$0) {
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

   public cwv b() {
      return new cwv(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cwv.g)$$0.getValue()).f())));
   }

   public static void a(cwv.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (cwv.e<?>)$$1, (cwv.f<?>)$$2));
   }

   private static <T extends cwv.g<T>> void a(cwv.c $$0, cwv.e<?> $$1, cwv.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cwv $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((cwv.e<?>)$$2, $$0, $$1));
   }

   private <T extends cwv.g<T>> void a(cwv.e<T> $$0, cwv $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cwv.e<cwv.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cwv.e<cwv.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cwv.g<cwv.a> {
      private boolean b;

      static cwv.f<cwv.a> a(boolean $$0, BiConsumer<MinecraftServer, cwv.a> $$1) {
         return new cwv.f<>(BoolArgumentType::bool, $$1x -> new cwv.a($$1x, $$0), $$1, cwv.c::b);
      }

      static cwv.f<cwv.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cwv.f<cwv.a> $$0, boolean $$1) {
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

      protected cwv.a d() {
         return this;
      }

      protected cwv.a e() {
         return new cwv.a(this.a, this.b);
      }

      public void a(cwv.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cwv.g<T>> void a(cwv.e<T> $$0, cwv.f<T> $$1) {
      }

      default void b(cwv.e<cwv.a> $$0, cwv.f<cwv.a> $$1) {
      }

      default void c(cwv.e<cwv.d> $$0, cwv.f<cwv.d> $$1) {
      }
   }

   public static class d extends cwv.g<cwv.d> {
      private int b;

      private static cwv.f<cwv.d> a(int $$0, BiConsumer<MinecraftServer, cwv.d> $$1) {
         return new cwv.f<>(IntegerArgumentType::integer, $$1x -> new cwv.d($$1x, $$0), $$1, cwv.c::c);
      }

      static cwv.f<cwv.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, cwv.d> $$3) {
         return new cwv.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new cwv.d($$1x, $$0), $$3, cwv.c::c);
      }

      static cwv.f<cwv.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cwv.f<cwv.d> $$0, int $$1) {
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
               cwv.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cwv.d d() {
         return this;
      }

      protected cwv.d e() {
         return new cwv.d(this.a, this.b);
      }

      public void a(cwv.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cwv.g<T>> {
      final String a;
      private final cwv.b b;

      public e(String $$0, cwv.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cwv.e && ((cwv.e)$$0).a.equals(this.a);
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

      public cwv.b c() {
         return this.b;
      }
   }

   public static class f<T extends cwv.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<cwv.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cwv.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cwv.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cwv.h<T> $$3) {
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

      public void a(cwv.c $$0, cwv.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cwv.g<T>> {
      protected final cwv.f<T> a;

      public g(cwv.f<T> $$0) {
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

   interface h<T extends cwv.g<T>> {
      void call(cwv.c var1, cwv.e<T> var2, cwv.f<T> var3);
   }
}
