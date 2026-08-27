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

public class dat {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<dat.e<?>, dat.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dat.e<dat.a> b = a("doFireTick", dat.b.e, dat.a.a(true));
   public static final dat.e<dat.a> c = a("mobGriefing", dat.b.b, dat.a.a(true));
   public static final dat.e<dat.a> d = a("keepInventory", dat.b.a, dat.a.a(false));
   public static final dat.e<dat.a> e = a("doMobSpawning", dat.b.c, dat.a.a(true));
   public static final dat.e<dat.a> f = a("doMobLoot", dat.b.d, dat.a.a(true));
   public static final dat.e<dat.a> g = a("projectilesCanBreakBlocks", dat.b.d, dat.a.a(true));
   public static final dat.e<dat.a> h = a("doTileDrops", dat.b.d, dat.a.a(true));
   public static final dat.e<dat.a> i = a("doEntityDrops", dat.b.d, dat.a.a(true));
   public static final dat.e<dat.a> j = a("commandBlockOutput", dat.b.f, dat.a.a(true));
   public static final dat.e<dat.a> k = a("naturalRegeneration", dat.b.a, dat.a.a(true));
   public static final dat.e<dat.a> l = a("doDaylightCycle", dat.b.e, dat.a.a(true));
   public static final dat.e<dat.a> m = a("logAdminCommands", dat.b.f, dat.a.a(true));
   public static final dat.e<dat.a> n = a("showDeathMessages", dat.b.f, dat.a.a(true));
   public static final dat.e<dat.d> o = a("randomTickSpeed", dat.b.e, dat.d.a(3));
   public static final dat.e<dat.a> p = a("sendCommandFeedback", dat.b.f, dat.a.a(true));
   public static final dat.e<dat.a> q = a("reducedDebugInfo", dat.b.g, dat.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aqn $$3 : $$0.ah().t()) {
         $$3.d.b(new acu($$3, $$2));
      }
   }));
   public static final dat.e<dat.a> r = a("spectatorsGenerateChunks", dat.b.a, dat.a.a(true));
   public static final dat.e<dat.d> s = a("spawnRadius", dat.b.a, dat.d.a(10));
   public static final dat.e<dat.a> t = a("disableElytraMovementCheck", dat.b.a, dat.a.a(false));
   public static final dat.e<dat.d> u = a("maxEntityCramming", dat.b.b, dat.d.a(24));
   public static final dat.e<dat.a> v = a("doWeatherCycle", dat.b.e, dat.a.a(true));
   public static final dat.e<dat.a> w = a("doLimitedCrafting", dat.b.a, dat.a.a(false, ($$0, $$1) -> {
      for (aqn $$2 : $$0.ah().t()) {
         $$2.d.b(new acx(acx.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dat.e<dat.d> x = a("maxCommandChainLength", dat.b.g, dat.d.a(65536));
   public static final dat.e<dat.d> y = a("maxCommandForkCount", dat.b.g, dat.d.a(65536));
   public static final dat.e<dat.d> z = a("commandModificationBlockLimit", dat.b.g, dat.d.a(32768));
   public static final dat.e<dat.a> A = a("announceAdvancements", dat.b.f, dat.a.a(true));
   public static final dat.e<dat.a> B = a("disableRaids", dat.b.b, dat.a.a(false));
   public static final dat.e<dat.a> C = a("doInsomnia", dat.b.c, dat.a.a(true));
   public static final dat.e<dat.a> D = a("doImmediateRespawn", dat.b.a, dat.a.a(false, ($$0, $$1) -> {
      for (aqn $$2 : $$0.ah().t()) {
         $$2.d.b(new acx(acx.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dat.e<dat.d> E = a("playersNetherPortalDefaultDelay", dat.b.a, dat.d.a(80));
   public static final dat.e<dat.d> F = a("playersNetherPortalCreativeDelay", dat.b.a, dat.d.a(1));
   public static final dat.e<dat.a> G = a("drowningDamage", dat.b.a, dat.a.a(true));
   public static final dat.e<dat.a> H = a("fallDamage", dat.b.a, dat.a.a(true));
   public static final dat.e<dat.a> I = a("fireDamage", dat.b.a, dat.a.a(true));
   public static final dat.e<dat.a> J = a("freezeDamage", dat.b.a, dat.a.a(true));
   public static final dat.e<dat.a> K = a("doPatrolSpawning", dat.b.c, dat.a.a(true));
   public static final dat.e<dat.a> L = a("doTraderSpawning", dat.b.c, dat.a.a(true));
   public static final dat.e<dat.a> M = a("doWardenSpawning", dat.b.c, dat.a.a(true));
   public static final dat.e<dat.a> N = a("forgiveDeadPlayers", dat.b.b, dat.a.a(true));
   public static final dat.e<dat.a> O = a("universalAnger", dat.b.b, dat.a.a(false));
   public static final dat.e<dat.d> P = a("playersSleepingPercentage", dat.b.a, dat.d.a(100));
   public static final dat.e<dat.a> Q = a("blockExplosionDropDecay", dat.b.d, dat.a.a(true));
   public static final dat.e<dat.a> R = a("mobExplosionDropDecay", dat.b.d, dat.a.a(true));
   public static final dat.e<dat.a> S = a("tntExplosionDropDecay", dat.b.d, dat.a.a(false));
   public static final dat.e<dat.d> T = a("snowAccumulationHeight", dat.b.e, dat.d.a(1));
   public static final dat.e<dat.a> U = a("waterSourceConversion", dat.b.e, dat.a.a(true));
   public static final dat.e<dat.a> V = a("lavaSourceConversion", dat.b.e, dat.a.a(false));
   public static final dat.e<dat.a> W = a("globalSoundEvents", dat.b.g, dat.a.a(true));
   public static final dat.e<dat.a> X = a("doVinesSpread", dat.b.e, dat.a.a(true));
   public static final dat.e<dat.a> Y = a("enderPearlsVanishOnDeath", dat.b.a, dat.a.a(true));
   public static final dat.e<dat.d> Z = a("spawnChunkRadius", dat.b.g, dat.d.a(2, 0, 32, ($$0, $$1) -> {
      aqm $$2 = $$0.I();
      $$2.a($$2.U(), $$2.V());
   }));
   private final Map<dat.e<?>, dat.g<?>> ac;

   private static <T extends dat.g<T>> dat.e<T> a(String $$0, dat.b $$1, dat.f<T> $$2) {
      dat.e<T> $$3 = new dat.e<>($$0, $$1);
      dat.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dat(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public dat() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dat.f)$$0.getValue()).a()));
   }

   private dat(Map<dat.e<?>, dat.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends dat.g<T>> T a(dat.e<T> $$0) {
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

   public dat b() {
      return new dat(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dat.g)$$0.getValue()).f())));
   }

   public static void a(dat.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (dat.e<?>)$$1, (dat.f<?>)$$2));
   }

   private static <T extends dat.g<T>> void a(dat.c $$0, dat.e<?> $$1, dat.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(dat $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((dat.e<?>)$$2, $$0, $$1));
   }

   private <T extends dat.g<T>> void a(dat.e<T> $$0, dat $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dat.e<dat.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dat.e<dat.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dat.g<dat.a> {
      private boolean b;

      static dat.f<dat.a> a(boolean $$0, BiConsumer<MinecraftServer, dat.a> $$1) {
         return new dat.f<>(BoolArgumentType::bool, $$1x -> new dat.a($$1x, $$0), $$1, dat.c::b);
      }

      static dat.f<dat.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dat.f<dat.a> $$0, boolean $$1) {
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

      protected dat.a d() {
         return this;
      }

      protected dat.a e() {
         return new dat.a(this.a, this.b);
      }

      public void a(dat.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dat.g<T>> void a(dat.e<T> $$0, dat.f<T> $$1) {
      }

      default void b(dat.e<dat.a> $$0, dat.f<dat.a> $$1) {
      }

      default void c(dat.e<dat.d> $$0, dat.f<dat.d> $$1) {
      }
   }

   public static class d extends dat.g<dat.d> {
      private int b;

      private static dat.f<dat.d> a(int $$0, BiConsumer<MinecraftServer, dat.d> $$1) {
         return new dat.f<>(IntegerArgumentType::integer, $$1x -> new dat.d($$1x, $$0), $$1, dat.c::c);
      }

      static dat.f<dat.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, dat.d> $$3) {
         return new dat.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dat.d($$1x, $$0), $$3, dat.c::c);
      }

      static dat.f<dat.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dat.f<dat.d> $$0, int $$1) {
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
               dat.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dat.d d() {
         return this;
      }

      protected dat.d e() {
         return new dat.d(this.a, this.b);
      }

      public void a(dat.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dat.g<T>> {
      final String a;
      private final dat.b b;

      public e(String $$0, dat.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dat.e && ((dat.e)$$0).a.equals(this.a);
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

      public dat.b c() {
         return this.b;
      }
   }

   public static class f<T extends dat.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dat.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dat.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<dat.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dat.h<T> $$3) {
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

      public void a(dat.c $$0, dat.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends dat.g<T>> {
      protected final dat.f<T> a;

      public g(dat.f<T> $$0) {
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

   interface h<T extends dat.g<T>> {
      void call(dat.c var1, dat.e<T> var2, dat.f<T> var3);
   }
}
