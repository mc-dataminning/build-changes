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

public class cpr {
   public static final int a = 3;
   static final Logger V = LogUtils.getLogger();
   private static final Map<cpr.e<?>, cpr.f<?>> W = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cpr.e<cpr.a> b = a("doFireTick", cpr.b.e, cpr.a.a(true));
   public static final cpr.e<cpr.a> c = a("mobGriefing", cpr.b.b, cpr.a.a(true));
   public static final cpr.e<cpr.a> d = a("keepInventory", cpr.b.a, cpr.a.a(false));
   public static final cpr.e<cpr.a> e = a("doMobSpawning", cpr.b.c, cpr.a.a(true));
   public static final cpr.e<cpr.a> f = a("doMobLoot", cpr.b.d, cpr.a.a(true));
   public static final cpr.e<cpr.a> g = a("doTileDrops", cpr.b.d, cpr.a.a(true));
   public static final cpr.e<cpr.a> h = a("doEntityDrops", cpr.b.d, cpr.a.a(true));
   public static final cpr.e<cpr.a> i = a("commandBlockOutput", cpr.b.f, cpr.a.a(true));
   public static final cpr.e<cpr.a> j = a("naturalRegeneration", cpr.b.a, cpr.a.a(true));
   public static final cpr.e<cpr.a> k = a("doDaylightCycle", cpr.b.e, cpr.a.a(true));
   public static final cpr.e<cpr.a> l = a("logAdminCommands", cpr.b.f, cpr.a.a(true));
   public static final cpr.e<cpr.a> m = a("showDeathMessages", cpr.b.f, cpr.a.a(true));
   public static final cpr.e<cpr.d> n = a("randomTickSpeed", cpr.b.e, cpr.d.a(3));
   public static final cpr.e<cpr.a> o = a("sendCommandFeedback", cpr.b.f, cpr.a.a(true));
   public static final cpr.e<cpr.a> p = a("reducedDebugInfo", cpr.b.g, cpr.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (akr $$3 : $$0.ac().t()) {
         $$3.c.b(new xy($$3, $$2));
      }
   }));
   public static final cpr.e<cpr.a> q = a("spectatorsGenerateChunks", cpr.b.a, cpr.a.a(true));
   public static final cpr.e<cpr.d> r = a("spawnRadius", cpr.b.a, cpr.d.a(10));
   public static final cpr.e<cpr.a> s = a("disableElytraMovementCheck", cpr.b.a, cpr.a.a(false));
   public static final cpr.e<cpr.d> t = a("maxEntityCramming", cpr.b.b, cpr.d.a(24));
   public static final cpr.e<cpr.a> u = a("doWeatherCycle", cpr.b.e, cpr.a.a(true));
   public static final cpr.e<cpr.a> v = a("doLimitedCrafting", cpr.b.a, cpr.a.a(false, ($$0, $$1) -> {
      for (akr $$2 : $$0.ac().t()) {
         $$2.c.b(new yb(yb.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cpr.e<cpr.d> w = a("maxCommandChainLength", cpr.b.g, cpr.d.a(65536));
   public static final cpr.e<cpr.d> x = a("commandModificationBlockLimit", cpr.b.g, cpr.d.a(32768));
   public static final cpr.e<cpr.a> y = a("announceAdvancements", cpr.b.f, cpr.a.a(true));
   public static final cpr.e<cpr.a> z = a("disableRaids", cpr.b.b, cpr.a.a(false));
   public static final cpr.e<cpr.a> A = a("doInsomnia", cpr.b.c, cpr.a.a(true));
   public static final cpr.e<cpr.a> B = a("doImmediateRespawn", cpr.b.a, cpr.a.a(false, ($$0, $$1) -> {
      for (akr $$2 : $$0.ac().t()) {
         $$2.c.b(new yb(yb.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cpr.e<cpr.a> C = a("drowningDamage", cpr.b.a, cpr.a.a(true));
   public static final cpr.e<cpr.a> D = a("fallDamage", cpr.b.a, cpr.a.a(true));
   public static final cpr.e<cpr.a> E = a("fireDamage", cpr.b.a, cpr.a.a(true));
   public static final cpr.e<cpr.a> F = a("freezeDamage", cpr.b.a, cpr.a.a(true));
   public static final cpr.e<cpr.a> G = a("doPatrolSpawning", cpr.b.c, cpr.a.a(true));
   public static final cpr.e<cpr.a> H = a("doTraderSpawning", cpr.b.c, cpr.a.a(true));
   public static final cpr.e<cpr.a> I = a("doWardenSpawning", cpr.b.c, cpr.a.a(true));
   public static final cpr.e<cpr.a> J = a("forgiveDeadPlayers", cpr.b.b, cpr.a.a(true));
   public static final cpr.e<cpr.a> K = a("universalAnger", cpr.b.b, cpr.a.a(false));
   public static final cpr.e<cpr.d> L = a("playersSleepingPercentage", cpr.b.a, cpr.d.a(100));
   public static final cpr.e<cpr.a> M = a("blockExplosionDropDecay", cpr.b.d, cpr.a.a(true));
   public static final cpr.e<cpr.a> N = a("mobExplosionDropDecay", cpr.b.d, cpr.a.a(true));
   public static final cpr.e<cpr.a> O = a("tntExplosionDropDecay", cpr.b.d, cpr.a.a(false));
   public static final cpr.e<cpr.d> P = a("snowAccumulationHeight", cpr.b.e, cpr.d.a(1));
   public static final cpr.e<cpr.a> Q = a("waterSourceConversion", cpr.b.e, cpr.a.a(true));
   public static final cpr.e<cpr.a> R = a("lavaSourceConversion", cpr.b.e, cpr.a.a(false));
   public static final cpr.e<cpr.a> S = a("globalSoundEvents", cpr.b.g, cpr.a.a(true));
   public static final cpr.e<cpr.a> T = a("doVinesSpread", cpr.b.e, cpr.a.a(true));
   public static final cpr.e<cpr.a> U = a("enderPearlsVanishOnDeath", cpr.b.a, cpr.a.a(true));
   private final Map<cpr.e<?>, cpr.g<?>> X;

   private static <T extends cpr.g<T>> cpr.e<T> a(String $$0, cpr.b $$1, cpr.f<T> $$2) {
      cpr.e<T> $$3 = new cpr.e<>($$0, $$1);
      cpr.f<?> $$4 = W.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cpr(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cpr() {
      this.X = W.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cpr.f)$$0.getValue()).a()));
   }

   private cpr(Map<cpr.e<?>, cpr.g<?>> $$0) {
      this.X = $$0;
   }

   public <T extends cpr.g<T>> T a(cpr.e<T> $$0) {
      return (T)this.X.get($$0);
   }

   public qw a() {
      qw $$0 = new qw();
      this.X.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.X.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public cpr b() {
      return new cpr(this.X.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cpr.g)$$0.getValue()).f())));
   }

   public static void a(cpr.c $$0) {
      W.forEach(($$1, $$2) -> a($$0, (cpr.e<?>)$$1, (cpr.f<?>)$$2));
   }

   private static <T extends cpr.g<T>> void a(cpr.c $$0, cpr.e<?> $$1, cpr.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cpr $$0, @Nullable MinecraftServer $$1) {
      $$0.X.keySet().forEach($$2 -> this.a((cpr.e<?>)$$2, $$0, $$1));
   }

   private <T extends cpr.g<T>> void a(cpr.e<T> $$0, cpr $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cpr.e<cpr.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cpr.e<cpr.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cpr.g<cpr.a> {
      private boolean b;

      static cpr.f<cpr.a> a(boolean $$0, BiConsumer<MinecraftServer, cpr.a> $$1) {
         return new cpr.f<>(BoolArgumentType::bool, $$1x -> new cpr.a($$1x, $$0), $$1, cpr.c::b);
      }

      static cpr.f<cpr.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cpr.f<cpr.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<dt> $$0, String $$1) {
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

      protected cpr.a d() {
         return this;
      }

      protected cpr.a e() {
         return new cpr.a(this.a, this.b);
      }

      public void a(cpr.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cpr.g<T>> void a(cpr.e<T> $$0, cpr.f<T> $$1) {
      }

      default void b(cpr.e<cpr.a> $$0, cpr.f<cpr.a> $$1) {
      }

      default void c(cpr.e<cpr.d> $$0, cpr.f<cpr.d> $$1) {
      }
   }

   public static class d extends cpr.g<cpr.d> {
      private int b;

      private static cpr.f<cpr.d> a(int $$0, BiConsumer<MinecraftServer, cpr.d> $$1) {
         return new cpr.f<>(IntegerArgumentType::integer, $$1x -> new cpr.d($$1x, $$0), $$1, cpr.c::c);
      }

      static cpr.f<cpr.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cpr.f<cpr.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<dt> $$0, String $$1) {
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
               cpr.V.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cpr.d d() {
         return this;
      }

      protected cpr.d e() {
         return new cpr.d(this.a, this.b);
      }

      public void a(cpr.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cpr.g<T>> {
      final String a;
      private final cpr.b b;

      public e(String $$0, cpr.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cpr.e && ((cpr.e)$$0).a.equals(this.a);
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

      public cpr.b c() {
         return this.b;
      }
   }

   public static class f<T extends cpr.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<cpr.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cpr.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cpr.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cpr.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<dt, ?> a(String $$0) {
         return du.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(cpr.c $$0, cpr.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cpr.g<T>> {
      protected final cpr.f<T> a;

      public g(cpr.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<dt> var1, String var2);

      public void b(CommandContext<dt> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((dt)$$0.getSource()).l());
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

   interface h<T extends cpr.g<T>> {
      void call(cpr.c var1, cpr.e<T> var2, cpr.f<T> var3);
   }
}
