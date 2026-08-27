import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
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

public class ctl {
   public static final int a = 3;
   static final Logger Z = LogUtils.getLogger();
   private static final Map<ctl.e<?>, ctl.f<?>> aa = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final ctl.e<ctl.a> b = a("doFireTick", ctl.b.e, ctl.a.a(true));
   public static final ctl.e<ctl.a> c = a("mobGriefing", ctl.b.b, ctl.a.a(true));
   public static final ctl.e<ctl.a> d = a("keepInventory", ctl.b.a, ctl.a.a(false));
   public static final ctl.e<ctl.a> e = a("doMobSpawning", ctl.b.c, ctl.a.a(true));
   public static final ctl.e<ctl.a> f = a("doMobLoot", ctl.b.d, ctl.a.a(true));
   public static final ctl.e<ctl.a> g = a("projectilesCanBreakBlocks", ctl.b.d, ctl.a.a(true));
   public static final ctl.e<ctl.a> h = a("doTileDrops", ctl.b.d, ctl.a.a(true));
   public static final ctl.e<ctl.a> i = a("doEntityDrops", ctl.b.d, ctl.a.a(true));
   public static final ctl.e<ctl.a> j = a("commandBlockOutput", ctl.b.f, ctl.a.a(true));
   public static final ctl.e<ctl.a> k = a("naturalRegeneration", ctl.b.a, ctl.a.a(true));
   public static final ctl.e<ctl.a> l = a("doDaylightCycle", ctl.b.e, ctl.a.a(true));
   public static final ctl.e<ctl.a> m = a("logAdminCommands", ctl.b.f, ctl.a.a(true));
   public static final ctl.e<ctl.a> n = a("showDeathMessages", ctl.b.f, ctl.a.a(true));
   public static final ctl.e<ctl.d> o = a("randomTickSpeed", ctl.b.e, ctl.d.a(3));
   public static final ctl.e<ctl.a> p = a("sendCommandFeedback", ctl.b.f, ctl.a.a(true));
   public static final ctl.e<ctl.a> q = a("reducedDebugInfo", ctl.b.g, ctl.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (ane $$3 : $$0.ae().t()) {
         $$3.c.b(new aac($$3, $$2));
      }
   }));
   public static final ctl.e<ctl.a> r = a("spectatorsGenerateChunks", ctl.b.a, ctl.a.a(true));
   public static final ctl.e<ctl.d> s = a("spawnRadius", ctl.b.a, ctl.d.a(10));
   public static final ctl.e<ctl.a> t = a("disableElytraMovementCheck", ctl.b.a, ctl.a.a(false));
   public static final ctl.e<ctl.d> u = a("maxEntityCramming", ctl.b.b, ctl.d.a(24));
   public static final ctl.e<ctl.a> v = a("doWeatherCycle", ctl.b.e, ctl.a.a(true));
   public static final ctl.e<ctl.a> w = a("doLimitedCrafting", ctl.b.a, ctl.a.a(false, ($$0, $$1) -> {
      for (ane $$2 : $$0.ae().t()) {
         $$2.c.b(new aaf(aaf.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final ctl.e<ctl.d> x = a("maxCommandChainLength", ctl.b.g, ctl.d.a(65536));
   public static final ctl.e<ctl.d> y = a("maxCommandForkCount", ctl.b.g, ctl.d.a(65536));
   public static final ctl.e<ctl.d> z = a("commandModificationBlockLimit", ctl.b.g, ctl.d.a(32768));
   public static final ctl.e<ctl.a> A = a("announceAdvancements", ctl.b.f, ctl.a.a(true));
   public static final ctl.e<ctl.a> B = a("disableRaids", ctl.b.b, ctl.a.a(false));
   public static final ctl.e<ctl.a> C = a("doInsomnia", ctl.b.c, ctl.a.a(true));
   public static final ctl.e<ctl.a> D = a("doImmediateRespawn", ctl.b.a, ctl.a.a(false, ($$0, $$1) -> {
      for (ane $$2 : $$0.ae().t()) {
         $$2.c.b(new aaf(aaf.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final ctl.e<ctl.d> E = a("playersNetherPortalDefaultDelay", ctl.b.a, ctl.d.a(80));
   public static final ctl.e<ctl.d> F = a("playersNetherPortalCreativeDelay", ctl.b.a, ctl.d.a(1));
   public static final ctl.e<ctl.a> G = a("drowningDamage", ctl.b.a, ctl.a.a(true));
   public static final ctl.e<ctl.a> H = a("fallDamage", ctl.b.a, ctl.a.a(true));
   public static final ctl.e<ctl.a> I = a("fireDamage", ctl.b.a, ctl.a.a(true));
   public static final ctl.e<ctl.a> J = a("freezeDamage", ctl.b.a, ctl.a.a(true));
   public static final ctl.e<ctl.a> K = a("doPatrolSpawning", ctl.b.c, ctl.a.a(true));
   public static final ctl.e<ctl.a> L = a("doTraderSpawning", ctl.b.c, ctl.a.a(true));
   public static final ctl.e<ctl.a> M = a("doWardenSpawning", ctl.b.c, ctl.a.a(true));
   public static final ctl.e<ctl.a> N = a("forgiveDeadPlayers", ctl.b.b, ctl.a.a(true));
   public static final ctl.e<ctl.a> O = a("universalAnger", ctl.b.b, ctl.a.a(false));
   public static final ctl.e<ctl.d> P = a("playersSleepingPercentage", ctl.b.a, ctl.d.a(100));
   public static final ctl.e<ctl.a> Q = a("blockExplosionDropDecay", ctl.b.d, ctl.a.a(true));
   public static final ctl.e<ctl.a> R = a("mobExplosionDropDecay", ctl.b.d, ctl.a.a(true));
   public static final ctl.e<ctl.a> S = a("tntExplosionDropDecay", ctl.b.d, ctl.a.a(false));
   public static final ctl.e<ctl.d> T = a("snowAccumulationHeight", ctl.b.e, ctl.d.a(1));
   public static final ctl.e<ctl.a> U = a("waterSourceConversion", ctl.b.e, ctl.a.a(true));
   public static final ctl.e<ctl.a> V = a("lavaSourceConversion", ctl.b.e, ctl.a.a(false));
   public static final ctl.e<ctl.a> W = a("globalSoundEvents", ctl.b.g, ctl.a.a(true));
   public static final ctl.e<ctl.a> X = a("doVinesSpread", ctl.b.e, ctl.a.a(true));
   public static final ctl.e<ctl.a> Y = a("enderPearlsVanishOnDeath", ctl.b.a, ctl.a.a(true));
   private final Map<ctl.e<?>, ctl.g<?>> ab;

   private static <T extends ctl.g<T>> ctl.e<T> a(String $$0, ctl.b $$1, ctl.f<T> $$2) {
      ctl.e<T> $$3 = new ctl.e<>($$0, $$1);
      ctl.f<?> $$4 = aa.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public ctl(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public ctl() {
      this.ab = aa.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((ctl.f)$$0.getValue()).a()));
   }

   private ctl(Map<ctl.e<?>, ctl.g<?>> $$0) {
      this.ab = $$0;
   }

   public <T extends ctl.g<T>> T a(ctl.e<T> $$0) {
      return (T)this.ab.get($$0);
   }

   public sn a() {
      sn $$0 = new sn();
      this.ab.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ab.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public ctl b() {
      return new ctl(this.ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((ctl.g)$$0.getValue()).f())));
   }

   public static void a(ctl.c $$0) {
      aa.forEach(($$1, $$2) -> a($$0, (ctl.e<?>)$$1, (ctl.f<?>)$$2));
   }

   private static <T extends ctl.g<T>> void a(ctl.c $$0, ctl.e<?> $$1, ctl.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(ctl $$0, @Nullable MinecraftServer $$1) {
      $$0.ab.keySet().forEach($$2 -> this.a((ctl.e<?>)$$2, $$0, $$1));
   }

   private <T extends ctl.g<T>> void a(ctl.e<T> $$0, ctl $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(ctl.e<ctl.a> $$0) {
      return this.a($$0).a();
   }

   public int c(ctl.e<ctl.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends ctl.g<ctl.a> {
      private boolean b;

      static ctl.f<ctl.a> a(boolean $$0, BiConsumer<MinecraftServer, ctl.a> $$1) {
         return new ctl.f<>(BoolArgumentType::bool, $$1x -> new ctl.a($$1x, $$0), $$1, ctl.c::b);
      }

      static ctl.f<ctl.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(ctl.f<ctl.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ds> $$0, String $$1) {
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

      protected ctl.a d() {
         return this;
      }

      protected ctl.a e() {
         return new ctl.a(this.a, this.b);
      }

      public void a(ctl.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends ctl.g<T>> void a(ctl.e<T> $$0, ctl.f<T> $$1) {
      }

      default void b(ctl.e<ctl.a> $$0, ctl.f<ctl.a> $$1) {
      }

      default void c(ctl.e<ctl.d> $$0, ctl.f<ctl.d> $$1) {
      }
   }

   public static class d extends ctl.g<ctl.d> {
      private int b;

      private static ctl.f<ctl.d> a(int $$0, BiConsumer<MinecraftServer, ctl.d> $$1) {
         return new ctl.f<>(IntegerArgumentType::integer, $$1x -> new ctl.d($$1x, $$0), $$1, ctl.c::c);
      }

      static ctl.f<ctl.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(ctl.f<ctl.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ds> $$0, String $$1) {
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
            this.b = Integer.parseInt($$0);
            return true;
         } catch (NumberFormatException var3) {
            return false;
         }
      }

      private static int c(String $$0) {
         if (!$$0.isEmpty()) {
            try {
               return Integer.parseInt($$0);
            } catch (NumberFormatException var2) {
               ctl.Z.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected ctl.d d() {
         return this;
      }

      protected ctl.d e() {
         return new ctl.d(this.a, this.b);
      }

      public void a(ctl.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends ctl.g<T>> {
      final String a;
      private final ctl.b b;

      public e(String $$0, ctl.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof ctl.e && ((ctl.e)$$0).a.equals(this.a);
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

      public ctl.b c() {
         return this.b;
      }
   }

   public static class f<T extends ctl.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<ctl.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final ctl.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<ctl.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, ctl.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<ds, ?> a(String $$0) {
         return dt.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(ctl.c $$0, ctl.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends ctl.g<T>> {
      protected final ctl.f<T> a;

      public g(ctl.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ds> var1, String var2);

      public void b(CommandContext<ds> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ds)$$0.getSource()).l());
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

   interface h<T extends ctl.g<T>> {
      void call(ctl.c var1, ctl.e<T> var2, ctl.f<T> var3);
   }
}
