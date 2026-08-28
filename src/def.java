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
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class def {
   public static final int a = 3;
   static final Logger ab = LogUtils.getLogger();
   private static final Map<def.e<?>, def.f<?>> ac = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final def.e<def.a> b = a("doFireTick", def.b.e, def.a.a(true));
   public static final def.e<def.a> c = a("mobGriefing", def.b.b, def.a.a(true));
   public static final def.e<def.a> d = a("keepInventory", def.b.a, def.a.a(false));
   public static final def.e<def.a> e = a("doMobSpawning", def.b.c, def.a.a(true));
   public static final def.e<def.a> f = a("doMobLoot", def.b.d, def.a.a(true));
   public static final def.e<def.a> g = a("projectilesCanBreakBlocks", def.b.d, def.a.a(true));
   public static final def.e<def.a> h = a("doTileDrops", def.b.d, def.a.a(true));
   public static final def.e<def.a> i = a("doEntityDrops", def.b.d, def.a.a(true));
   public static final def.e<def.a> j = a("commandBlockOutput", def.b.f, def.a.a(true));
   public static final def.e<def.a> k = a("naturalRegeneration", def.b.a, def.a.a(true));
   public static final def.e<def.a> l = a("doDaylightCycle", def.b.e, def.a.a(true));
   public static final def.e<def.a> m = a("logAdminCommands", def.b.f, def.a.a(true));
   public static final def.e<def.a> n = a("showDeathMessages", def.b.f, def.a.a(true));
   public static final def.e<def.d> o = a("randomTickSpeed", def.b.e, def.d.a(3));
   public static final def.e<def.a> p = a("sendCommandFeedback", def.b.f, def.a.a(true));
   public static final def.e<def.a> q = a("reducedDebugInfo", def.b.g, def.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (ark $$3 : $$0.ag().t()) {
         $$3.c.b(new ade($$3, $$2));
      }
   }));
   public static final def.e<def.a> r = a("spectatorsGenerateChunks", def.b.a, def.a.a(true));
   public static final def.e<def.d> s = a("spawnRadius", def.b.a, def.d.a(10));
   public static final def.e<def.a> t = a("disableElytraMovementCheck", def.b.a, def.a.a(false));
   public static final def.e<def.d> u = a("maxEntityCramming", def.b.b, def.d.a(24));
   public static final def.e<def.a> v = a("doWeatherCycle", def.b.e, def.a.a(true));
   public static final def.e<def.a> w = a("doLimitedCrafting", def.b.a, def.a.a(false, ($$0, $$1) -> {
      for (ark $$2 : $$0.ag().t()) {
         $$2.c.b(new adh(adh.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final def.e<def.d> x = a("maxCommandChainLength", def.b.g, def.d.a(65536));
   public static final def.e<def.d> y = a("maxCommandForkCount", def.b.g, def.d.a(65536));
   public static final def.e<def.d> z = a("commandModificationBlockLimit", def.b.g, def.d.a(32768));
   public static final def.e<def.a> A = a("announceAdvancements", def.b.f, def.a.a(true));
   public static final def.e<def.a> B = a("disableRaids", def.b.b, def.a.a(false));
   public static final def.e<def.a> C = a("doInsomnia", def.b.c, def.a.a(true));
   public static final def.e<def.a> D = a("doImmediateRespawn", def.b.a, def.a.a(false, ($$0, $$1) -> {
      for (ark $$2 : $$0.ag().t()) {
         $$2.c.b(new adh(adh.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final def.e<def.d> E = a("playersNetherPortalDefaultDelay", def.b.a, def.d.a(80));
   public static final def.e<def.d> F = a("playersNetherPortalCreativeDelay", def.b.a, def.d.a(0));
   public static final def.e<def.a> G = a("drowningDamage", def.b.a, def.a.a(true));
   public static final def.e<def.a> H = a("fallDamage", def.b.a, def.a.a(true));
   public static final def.e<def.a> I = a("fireDamage", def.b.a, def.a.a(true));
   public static final def.e<def.a> J = a("freezeDamage", def.b.a, def.a.a(true));
   public static final def.e<def.a> K = a("doPatrolSpawning", def.b.c, def.a.a(true));
   public static final def.e<def.a> L = a("doTraderSpawning", def.b.c, def.a.a(true));
   public static final def.e<def.a> M = a("doWardenSpawning", def.b.c, def.a.a(true));
   public static final def.e<def.a> N = a("forgiveDeadPlayers", def.b.b, def.a.a(true));
   public static final def.e<def.a> O = a("universalAnger", def.b.b, def.a.a(false));
   public static final def.e<def.d> P = a("playersSleepingPercentage", def.b.a, def.d.a(100));
   public static final def.e<def.a> Q = a("blockExplosionDropDecay", def.b.d, def.a.a(true));
   public static final def.e<def.a> R = a("mobExplosionDropDecay", def.b.d, def.a.a(true));
   public static final def.e<def.a> S = a("tntExplosionDropDecay", def.b.d, def.a.a(false));
   public static final def.e<def.d> T = a("snowAccumulationHeight", def.b.e, def.d.a(1));
   public static final def.e<def.a> U = a("waterSourceConversion", def.b.e, def.a.a(true));
   public static final def.e<def.a> V = a("lavaSourceConversion", def.b.e, def.a.a(false));
   public static final def.e<def.a> W = a("globalSoundEvents", def.b.g, def.a.a(true));
   public static final def.e<def.a> X = a("doVinesSpread", def.b.e, def.a.a(true));
   public static final def.e<def.a> Y = a("enderPearlsVanishOnDeath", def.b.a, def.a.a(true));
   public static final def.e<def.d> Z = a("minecartMaxSpeed", def.b.g, def.d.a(8, 1, 1000, cqq.a(cqs.e), ($$0, $$1) -> {
   }));
   public static final def.e<def.d> aa = a("spawnChunkRadius", def.b.g, def.d.a(2, 0, 32, cqq.a(), ($$0, $$1) -> {
      arj $$2 = $$0.J();
      $$2.a($$2.W(), $$2.X());
   }));
   private final Map<def.e<?>, def.g<?>> ad;
   private final cqq ae;

   private static <T extends def.g<T>> def.e<T> a(String $$0, def.b $$1, def.f<T> $$2) {
      def.e<T> $$3 = new def.e<>($$0, $$1);
      def.f<?> $$4 = ac.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public def(cqq $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public def(cqq $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((def.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<def.e<?>, def.f<?>>> b(cqq $$0) {
      return ac.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private def(Map<def.e<?>, def.g<?>> $$0, cqq $$1) {
      this.ad = $$0;
      this.ae = $$1;
   }

   public <T extends def.g<T>> T a(def.e<T> $$0) {
      T $$1 = (T)this.ad.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public ug a() {
      ug $$0 = new ug();
      this.ad.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ad.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public def a(cqq $$0) {
      return new def(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ad.containsKey($$0x.getKey()) ? this.ad.get($$0x.getKey()) : ((def.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(def.c $$0) {
      ac.forEach(($$1, $$2) -> this.a($$0, (def.e<?>)$$1, (def.f<?>)$$2));
   }

   private <T extends def.g<T>> void a(def.c $$0, def.e<?> $$1, def.f<?> $$2) {
      if ($$2.e.a(this.ae)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(def $$0, @Nullable MinecraftServer $$1) {
      $$0.ad.keySet().forEach($$2 -> this.a((def.e<?>)$$2, $$0, $$1));
   }

   private <T extends def.g<T>> void a(def.e<T> $$0, def $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(def.e<def.a> $$0) {
      return this.a($$0).a();
   }

   public int c(def.e<def.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends def.g<def.a> {
      private boolean b;

      static def.f<def.a> a(boolean $$0, BiConsumer<MinecraftServer, def.a> $$1) {
         return new def.f<>(BoolArgumentType::bool, $$1x -> new def.a($$1x, $$0), $$1, def.c::b, cqq.a());
      }

      static def.f<def.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(def.f<def.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<eu> $$0, String $$1) {
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

      protected def.a d() {
         return this;
      }

      protected def.a e() {
         return new def.a(this.a, this.b);
      }

      public void a(def.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends def.g<T>> void a(def.e<T> $$0, def.f<T> $$1) {
      }

      default void b(def.e<def.a> $$0, def.f<def.a> $$1) {
      }

      default void c(def.e<def.d> $$0, def.f<def.d> $$1) {
      }
   }

   public static class d extends def.g<def.d> {
      private int b;

      private static def.f<def.d> a(int $$0, BiConsumer<MinecraftServer, def.d> $$1) {
         return new def.f<>(IntegerArgumentType::integer, $$1x -> new def.d($$1x, $$0), $$1, def.c::c, cqq.a());
      }

      static def.f<def.d> a(int $$0, int $$1, int $$2, cqq $$3, BiConsumer<MinecraftServer, def.d> $$4) {
         return new def.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new def.d($$1x, $$0), $$4, def.c::c, $$3);
      }

      static def.f<def.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(def.f<def.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<eu> $$0, String $$1) {
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
               def.ab.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected def.d d() {
         return this;
      }

      protected def.d e() {
         return new def.d(this.a, this.b);
      }

      public void a(def.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends def.g<T>> {
      final String a;
      private final def.b b;

      public e(String $$0, def.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof def.e && ((def.e)$$0).a.equals(this.a);
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

      public def.b c() {
         return this.b;
      }
   }

   public static class f<T extends def.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<def.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final def.h<T> d;
      final cqq e;

      f(Supplier<ArgumentType<?>> $$0, Function<def.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, def.h<T> $$3, cqq $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public RequiredArgumentBuilder<eu, ?> a(String $$0) {
         return ev.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(def.c $$0, def.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cqq b() {
         return this.e;
      }
   }

   public abstract static class g<T extends def.g<T>> {
      protected final def.f<T> a;

      public g(def.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<eu> var1, String var2);

      public void b(CommandContext<eu> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((eu)$$0.getSource()).l());
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

   interface h<T extends def.g<T>> {
      void call(def.c var1, def.e<T> var2, def.f<T> var3);
   }
}
