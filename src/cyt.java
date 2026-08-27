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

public class cyt {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<cyt.e<?>, cyt.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cyt.e<cyt.a> b = a("doFireTick", cyt.b.e, cyt.a.a(true));
   public static final cyt.e<cyt.a> c = a("mobGriefing", cyt.b.b, cyt.a.a(true));
   public static final cyt.e<cyt.a> d = a("keepInventory", cyt.b.a, cyt.a.a(false));
   public static final cyt.e<cyt.a> e = a("doMobSpawning", cyt.b.c, cyt.a.a(true));
   public static final cyt.e<cyt.a> f = a("doMobLoot", cyt.b.d, cyt.a.a(true));
   public static final cyt.e<cyt.a> g = a("projectilesCanBreakBlocks", cyt.b.d, cyt.a.a(true));
   public static final cyt.e<cyt.a> h = a("doTileDrops", cyt.b.d, cyt.a.a(true));
   public static final cyt.e<cyt.a> i = a("doEntityDrops", cyt.b.d, cyt.a.a(true));
   public static final cyt.e<cyt.a> j = a("commandBlockOutput", cyt.b.f, cyt.a.a(true));
   public static final cyt.e<cyt.a> k = a("naturalRegeneration", cyt.b.a, cyt.a.a(true));
   public static final cyt.e<cyt.a> l = a("doDaylightCycle", cyt.b.e, cyt.a.a(true));
   public static final cyt.e<cyt.a> m = a("logAdminCommands", cyt.b.f, cyt.a.a(true));
   public static final cyt.e<cyt.a> n = a("showDeathMessages", cyt.b.f, cyt.a.a(true));
   public static final cyt.e<cyt.d> o = a("randomTickSpeed", cyt.b.e, cyt.d.a(3));
   public static final cyt.e<cyt.a> p = a("sendCommandFeedback", cyt.b.f, cyt.a.a(true));
   public static final cyt.e<cyt.a> q = a("reducedDebugInfo", cyt.b.g, cyt.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (apt $$3 : $$0.ah().t()) {
         $$3.d.b(new acc($$3, $$2));
      }
   }));
   public static final cyt.e<cyt.a> r = a("spectatorsGenerateChunks", cyt.b.a, cyt.a.a(true));
   public static final cyt.e<cyt.d> s = a("spawnRadius", cyt.b.a, cyt.d.a(10));
   public static final cyt.e<cyt.a> t = a("disableElytraMovementCheck", cyt.b.a, cyt.a.a(false));
   public static final cyt.e<cyt.d> u = a("maxEntityCramming", cyt.b.b, cyt.d.a(24));
   public static final cyt.e<cyt.a> v = a("doWeatherCycle", cyt.b.e, cyt.a.a(true));
   public static final cyt.e<cyt.a> w = a("doLimitedCrafting", cyt.b.a, cyt.a.a(false, ($$0, $$1) -> {
      for (apt $$2 : $$0.ah().t()) {
         $$2.d.b(new acf(acf.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cyt.e<cyt.d> x = a("maxCommandChainLength", cyt.b.g, cyt.d.a(65536));
   public static final cyt.e<cyt.d> y = a("maxCommandForkCount", cyt.b.g, cyt.d.a(65536));
   public static final cyt.e<cyt.d> z = a("commandModificationBlockLimit", cyt.b.g, cyt.d.a(32768));
   public static final cyt.e<cyt.a> A = a("announceAdvancements", cyt.b.f, cyt.a.a(true));
   public static final cyt.e<cyt.a> B = a("disableRaids", cyt.b.b, cyt.a.a(false));
   public static final cyt.e<cyt.a> C = a("doInsomnia", cyt.b.c, cyt.a.a(true));
   public static final cyt.e<cyt.a> D = a("doImmediateRespawn", cyt.b.a, cyt.a.a(false, ($$0, $$1) -> {
      for (apt $$2 : $$0.ah().t()) {
         $$2.d.b(new acf(acf.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cyt.e<cyt.d> E = a("playersNetherPortalDefaultDelay", cyt.b.a, cyt.d.a(80));
   public static final cyt.e<cyt.d> F = a("playersNetherPortalCreativeDelay", cyt.b.a, cyt.d.a(1));
   public static final cyt.e<cyt.a> G = a("drowningDamage", cyt.b.a, cyt.a.a(true));
   public static final cyt.e<cyt.a> H = a("fallDamage", cyt.b.a, cyt.a.a(true));
   public static final cyt.e<cyt.a> I = a("fireDamage", cyt.b.a, cyt.a.a(true));
   public static final cyt.e<cyt.a> J = a("freezeDamage", cyt.b.a, cyt.a.a(true));
   public static final cyt.e<cyt.a> K = a("doPatrolSpawning", cyt.b.c, cyt.a.a(true));
   public static final cyt.e<cyt.a> L = a("doTraderSpawning", cyt.b.c, cyt.a.a(true));
   public static final cyt.e<cyt.a> M = a("doWardenSpawning", cyt.b.c, cyt.a.a(true));
   public static final cyt.e<cyt.a> N = a("forgiveDeadPlayers", cyt.b.b, cyt.a.a(true));
   public static final cyt.e<cyt.a> O = a("universalAnger", cyt.b.b, cyt.a.a(false));
   public static final cyt.e<cyt.d> P = a("playersSleepingPercentage", cyt.b.a, cyt.d.a(100));
   public static final cyt.e<cyt.a> Q = a("blockExplosionDropDecay", cyt.b.d, cyt.a.a(true));
   public static final cyt.e<cyt.a> R = a("mobExplosionDropDecay", cyt.b.d, cyt.a.a(true));
   public static final cyt.e<cyt.a> S = a("tntExplosionDropDecay", cyt.b.d, cyt.a.a(false));
   public static final cyt.e<cyt.d> T = a("snowAccumulationHeight", cyt.b.e, cyt.d.a(1));
   public static final cyt.e<cyt.a> U = a("waterSourceConversion", cyt.b.e, cyt.a.a(true));
   public static final cyt.e<cyt.a> V = a("lavaSourceConversion", cyt.b.e, cyt.a.a(false));
   public static final cyt.e<cyt.a> W = a("globalSoundEvents", cyt.b.g, cyt.a.a(true));
   public static final cyt.e<cyt.a> X = a("doVinesSpread", cyt.b.e, cyt.a.a(true));
   public static final cyt.e<cyt.a> Y = a("enderPearlsVanishOnDeath", cyt.b.a, cyt.a.a(true));
   public static final cyt.e<cyt.d> Z = a("spawnChunkRadius", cyt.b.g, cyt.d.a(2, 0, 32, ($$0, $$1) -> {
      aps $$2 = $$0.I();
      $$2.a($$2.U(), $$2.V());
   }));
   private final Map<cyt.e<?>, cyt.g<?>> ac;

   private static <T extends cyt.g<T>> cyt.e<T> a(String $$0, cyt.b $$1, cyt.f<T> $$2) {
      cyt.e<T> $$3 = new cyt.e<>($$0, $$1);
      cyt.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cyt(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cyt() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cyt.f)$$0.getValue()).a()));
   }

   private cyt(Map<cyt.e<?>, cyt.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends cyt.g<T>> T a(cyt.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public tm a() {
      tm $$0 = new tm();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public cyt b() {
      return new cyt(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cyt.g)$$0.getValue()).f())));
   }

   public static void a(cyt.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (cyt.e<?>)$$1, (cyt.f<?>)$$2));
   }

   private static <T extends cyt.g<T>> void a(cyt.c $$0, cyt.e<?> $$1, cyt.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cyt $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((cyt.e<?>)$$2, $$0, $$1));
   }

   private <T extends cyt.g<T>> void a(cyt.e<T> $$0, cyt $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cyt.e<cyt.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cyt.e<cyt.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cyt.g<cyt.a> {
      private boolean b;

      static cyt.f<cyt.a> a(boolean $$0, BiConsumer<MinecraftServer, cyt.a> $$1) {
         return new cyt.f<>(BoolArgumentType::bool, $$1x -> new cyt.a($$1x, $$0), $$1, cyt.c::b);
      }

      static cyt.f<cyt.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cyt.f<cyt.a> $$0, boolean $$1) {
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

      protected cyt.a d() {
         return this;
      }

      protected cyt.a e() {
         return new cyt.a(this.a, this.b);
      }

      public void a(cyt.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cyt.g<T>> void a(cyt.e<T> $$0, cyt.f<T> $$1) {
      }

      default void b(cyt.e<cyt.a> $$0, cyt.f<cyt.a> $$1) {
      }

      default void c(cyt.e<cyt.d> $$0, cyt.f<cyt.d> $$1) {
      }
   }

   public static class d extends cyt.g<cyt.d> {
      private int b;

      private static cyt.f<cyt.d> a(int $$0, BiConsumer<MinecraftServer, cyt.d> $$1) {
         return new cyt.f<>(IntegerArgumentType::integer, $$1x -> new cyt.d($$1x, $$0), $$1, cyt.c::c);
      }

      static cyt.f<cyt.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, cyt.d> $$3) {
         return new cyt.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new cyt.d($$1x, $$0), $$3, cyt.c::c);
      }

      static cyt.f<cyt.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cyt.f<cyt.d> $$0, int $$1) {
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
               cyt.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cyt.d d() {
         return this;
      }

      protected cyt.d e() {
         return new cyt.d(this.a, this.b);
      }

      public void a(cyt.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cyt.g<T>> {
      final String a;
      private final cyt.b b;

      public e(String $$0, cyt.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cyt.e && ((cyt.e)$$0).a.equals(this.a);
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

      public cyt.b c() {
         return this.b;
      }
   }

   public static class f<T extends cyt.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<cyt.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cyt.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cyt.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cyt.h<T> $$3) {
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

      public void a(cyt.c $$0, cyt.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cyt.g<T>> {
      protected final cyt.f<T> a;

      public g(cyt.f<T> $$0) {
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

   interface h<T extends cyt.g<T>> {
      void call(cyt.c var1, cyt.e<T> var2, cyt.f<T> var3);
   }
}
