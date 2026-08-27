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

public class cpx {
   public static final int a = 3;
   static final Logger V = LogUtils.getLogger();
   private static final Map<cpx.e<?>, cpx.f<?>> W = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cpx.e<cpx.a> b = a("doFireTick", cpx.b.e, cpx.a.a(true));
   public static final cpx.e<cpx.a> c = a("mobGriefing", cpx.b.b, cpx.a.a(true));
   public static final cpx.e<cpx.a> d = a("keepInventory", cpx.b.a, cpx.a.a(false));
   public static final cpx.e<cpx.a> e = a("doMobSpawning", cpx.b.c, cpx.a.a(true));
   public static final cpx.e<cpx.a> f = a("doMobLoot", cpx.b.d, cpx.a.a(true));
   public static final cpx.e<cpx.a> g = a("doTileDrops", cpx.b.d, cpx.a.a(true));
   public static final cpx.e<cpx.a> h = a("doEntityDrops", cpx.b.d, cpx.a.a(true));
   public static final cpx.e<cpx.a> i = a("commandBlockOutput", cpx.b.f, cpx.a.a(true));
   public static final cpx.e<cpx.a> j = a("naturalRegeneration", cpx.b.a, cpx.a.a(true));
   public static final cpx.e<cpx.a> k = a("doDaylightCycle", cpx.b.e, cpx.a.a(true));
   public static final cpx.e<cpx.a> l = a("logAdminCommands", cpx.b.f, cpx.a.a(true));
   public static final cpx.e<cpx.a> m = a("showDeathMessages", cpx.b.f, cpx.a.a(true));
   public static final cpx.e<cpx.d> n = a("randomTickSpeed", cpx.b.e, cpx.d.a(3));
   public static final cpx.e<cpx.a> o = a("sendCommandFeedback", cpx.b.f, cpx.a.a(true));
   public static final cpx.e<cpx.a> p = a("reducedDebugInfo", cpx.b.g, cpx.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aku $$3 : $$0.ac().t()) {
         $$3.c.b(new xz($$3, $$2));
      }
   }));
   public static final cpx.e<cpx.a> q = a("spectatorsGenerateChunks", cpx.b.a, cpx.a.a(true));
   public static final cpx.e<cpx.d> r = a("spawnRadius", cpx.b.a, cpx.d.a(10));
   public static final cpx.e<cpx.a> s = a("disableElytraMovementCheck", cpx.b.a, cpx.a.a(false));
   public static final cpx.e<cpx.d> t = a("maxEntityCramming", cpx.b.b, cpx.d.a(24));
   public static final cpx.e<cpx.a> u = a("doWeatherCycle", cpx.b.e, cpx.a.a(true));
   public static final cpx.e<cpx.a> v = a("doLimitedCrafting", cpx.b.a, cpx.a.a(false, ($$0, $$1) -> {
      for (aku $$2 : $$0.ac().t()) {
         $$2.c.b(new yc(yc.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cpx.e<cpx.d> w = a("maxCommandChainLength", cpx.b.g, cpx.d.a(65536));
   public static final cpx.e<cpx.d> x = a("commandModificationBlockLimit", cpx.b.g, cpx.d.a(32768));
   public static final cpx.e<cpx.a> y = a("announceAdvancements", cpx.b.f, cpx.a.a(true));
   public static final cpx.e<cpx.a> z = a("disableRaids", cpx.b.b, cpx.a.a(false));
   public static final cpx.e<cpx.a> A = a("doInsomnia", cpx.b.c, cpx.a.a(true));
   public static final cpx.e<cpx.a> B = a("doImmediateRespawn", cpx.b.a, cpx.a.a(false, ($$0, $$1) -> {
      for (aku $$2 : $$0.ac().t()) {
         $$2.c.b(new yc(yc.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cpx.e<cpx.a> C = a("drowningDamage", cpx.b.a, cpx.a.a(true));
   public static final cpx.e<cpx.a> D = a("fallDamage", cpx.b.a, cpx.a.a(true));
   public static final cpx.e<cpx.a> E = a("fireDamage", cpx.b.a, cpx.a.a(true));
   public static final cpx.e<cpx.a> F = a("freezeDamage", cpx.b.a, cpx.a.a(true));
   public static final cpx.e<cpx.a> G = a("doPatrolSpawning", cpx.b.c, cpx.a.a(true));
   public static final cpx.e<cpx.a> H = a("doTraderSpawning", cpx.b.c, cpx.a.a(true));
   public static final cpx.e<cpx.a> I = a("doWardenSpawning", cpx.b.c, cpx.a.a(true));
   public static final cpx.e<cpx.a> J = a("forgiveDeadPlayers", cpx.b.b, cpx.a.a(true));
   public static final cpx.e<cpx.a> K = a("universalAnger", cpx.b.b, cpx.a.a(false));
   public static final cpx.e<cpx.d> L = a("playersSleepingPercentage", cpx.b.a, cpx.d.a(100));
   public static final cpx.e<cpx.a> M = a("blockExplosionDropDecay", cpx.b.d, cpx.a.a(true));
   public static final cpx.e<cpx.a> N = a("mobExplosionDropDecay", cpx.b.d, cpx.a.a(true));
   public static final cpx.e<cpx.a> O = a("tntExplosionDropDecay", cpx.b.d, cpx.a.a(false));
   public static final cpx.e<cpx.d> P = a("snowAccumulationHeight", cpx.b.e, cpx.d.a(1));
   public static final cpx.e<cpx.a> Q = a("waterSourceConversion", cpx.b.e, cpx.a.a(true));
   public static final cpx.e<cpx.a> R = a("lavaSourceConversion", cpx.b.e, cpx.a.a(false));
   public static final cpx.e<cpx.a> S = a("globalSoundEvents", cpx.b.g, cpx.a.a(true));
   public static final cpx.e<cpx.a> T = a("doVinesSpread", cpx.b.e, cpx.a.a(true));
   public static final cpx.e<cpx.a> U = a("enderPearlsVanishOnDeath", cpx.b.a, cpx.a.a(true));
   private final Map<cpx.e<?>, cpx.g<?>> X;

   private static <T extends cpx.g<T>> cpx.e<T> a(String $$0, cpx.b $$1, cpx.f<T> $$2) {
      cpx.e<T> $$3 = new cpx.e<>($$0, $$1);
      cpx.f<?> $$4 = W.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cpx(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cpx() {
      this.X = W.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cpx.f)$$0.getValue()).a()));
   }

   private cpx(Map<cpx.e<?>, cpx.g<?>> $$0) {
      this.X = $$0;
   }

   public <T extends cpx.g<T>> T a(cpx.e<T> $$0) {
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

   public cpx b() {
      return new cpx(this.X.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cpx.g)$$0.getValue()).f())));
   }

   public static void a(cpx.c $$0) {
      W.forEach(($$1, $$2) -> a($$0, (cpx.e<?>)$$1, (cpx.f<?>)$$2));
   }

   private static <T extends cpx.g<T>> void a(cpx.c $$0, cpx.e<?> $$1, cpx.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cpx $$0, @Nullable MinecraftServer $$1) {
      $$0.X.keySet().forEach($$2 -> this.a((cpx.e<?>)$$2, $$0, $$1));
   }

   private <T extends cpx.g<T>> void a(cpx.e<T> $$0, cpx $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cpx.e<cpx.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cpx.e<cpx.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cpx.g<cpx.a> {
      private boolean b;

      static cpx.f<cpx.a> a(boolean $$0, BiConsumer<MinecraftServer, cpx.a> $$1) {
         return new cpx.f<>(BoolArgumentType::bool, $$1x -> new cpx.a($$1x, $$0), $$1, cpx.c::b);
      }

      static cpx.f<cpx.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cpx.f<cpx.a> $$0, boolean $$1) {
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

      protected cpx.a d() {
         return this;
      }

      protected cpx.a e() {
         return new cpx.a(this.a, this.b);
      }

      public void a(cpx.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cpx.g<T>> void a(cpx.e<T> $$0, cpx.f<T> $$1) {
      }

      default void b(cpx.e<cpx.a> $$0, cpx.f<cpx.a> $$1) {
      }

      default void c(cpx.e<cpx.d> $$0, cpx.f<cpx.d> $$1) {
      }
   }

   public static class d extends cpx.g<cpx.d> {
      private int b;

      private static cpx.f<cpx.d> a(int $$0, BiConsumer<MinecraftServer, cpx.d> $$1) {
         return new cpx.f<>(IntegerArgumentType::integer, $$1x -> new cpx.d($$1x, $$0), $$1, cpx.c::c);
      }

      static cpx.f<cpx.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cpx.f<cpx.d> $$0, int $$1) {
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
               cpx.V.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cpx.d d() {
         return this;
      }

      protected cpx.d e() {
         return new cpx.d(this.a, this.b);
      }

      public void a(cpx.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cpx.g<T>> {
      final String a;
      private final cpx.b b;

      public e(String $$0, cpx.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cpx.e && ((cpx.e)$$0).a.equals(this.a);
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

      public cpx.b c() {
         return this.b;
      }
   }

   public static class f<T extends cpx.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<cpx.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cpx.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cpx.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cpx.h<T> $$3) {
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

      public void a(cpx.c $$0, cpx.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cpx.g<T>> {
      protected final cpx.f<T> a;

      public g(cpx.f<T> $$0) {
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

   interface h<T extends cpx.g<T>> {
      void call(cpx.c var1, cpx.e<T> var2, cpx.f<T> var3);
   }
}
