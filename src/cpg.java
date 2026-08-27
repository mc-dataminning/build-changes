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

public class cpg {
   public static final int a = 3;
   static final Logger U = LogUtils.getLogger();
   private static final Map<cpg.e<?>, cpg.f<?>> V = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cpg.e<cpg.a> b = a("doFireTick", cpg.b.e, cpg.a.a(true));
   public static final cpg.e<cpg.a> c = a("mobGriefing", cpg.b.b, cpg.a.a(true));
   public static final cpg.e<cpg.a> d = a("keepInventory", cpg.b.a, cpg.a.a(false));
   public static final cpg.e<cpg.a> e = a("doMobSpawning", cpg.b.c, cpg.a.a(true));
   public static final cpg.e<cpg.a> f = a("doMobLoot", cpg.b.d, cpg.a.a(true));
   public static final cpg.e<cpg.a> g = a("doTileDrops", cpg.b.d, cpg.a.a(true));
   public static final cpg.e<cpg.a> h = a("doEntityDrops", cpg.b.d, cpg.a.a(true));
   public static final cpg.e<cpg.a> i = a("commandBlockOutput", cpg.b.f, cpg.a.a(true));
   public static final cpg.e<cpg.a> j = a("naturalRegeneration", cpg.b.a, cpg.a.a(true));
   public static final cpg.e<cpg.a> k = a("doDaylightCycle", cpg.b.e, cpg.a.a(true));
   public static final cpg.e<cpg.a> l = a("logAdminCommands", cpg.b.f, cpg.a.a(true));
   public static final cpg.e<cpg.a> m = a("showDeathMessages", cpg.b.f, cpg.a.a(true));
   public static final cpg.e<cpg.d> n = a("randomTickSpeed", cpg.b.e, cpg.d.a(3));
   public static final cpg.e<cpg.a> o = a("sendCommandFeedback", cpg.b.f, cpg.a.a(true));
   public static final cpg.e<cpg.a> p = a("reducedDebugInfo", cpg.b.g, cpg.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (akj $$3 : $$0.ac().t()) {
         $$3.c.b(new xr($$3, $$2));
      }
   }));
   public static final cpg.e<cpg.a> q = a("spectatorsGenerateChunks", cpg.b.a, cpg.a.a(true));
   public static final cpg.e<cpg.d> r = a("spawnRadius", cpg.b.a, cpg.d.a(10));
   public static final cpg.e<cpg.a> s = a("disableElytraMovementCheck", cpg.b.a, cpg.a.a(false));
   public static final cpg.e<cpg.d> t = a("maxEntityCramming", cpg.b.b, cpg.d.a(24));
   public static final cpg.e<cpg.a> u = a("doWeatherCycle", cpg.b.e, cpg.a.a(true));
   public static final cpg.e<cpg.a> v = a("doLimitedCrafting", cpg.b.a, cpg.a.a(false));
   public static final cpg.e<cpg.d> w = a("maxCommandChainLength", cpg.b.g, cpg.d.a(65536));
   public static final cpg.e<cpg.d> x = a("commandModificationBlockLimit", cpg.b.g, cpg.d.a(32768));
   public static final cpg.e<cpg.a> y = a("announceAdvancements", cpg.b.f, cpg.a.a(true));
   public static final cpg.e<cpg.a> z = a("disableRaids", cpg.b.b, cpg.a.a(false));
   public static final cpg.e<cpg.a> A = a("doInsomnia", cpg.b.c, cpg.a.a(true));
   public static final cpg.e<cpg.a> B = a("doImmediateRespawn", cpg.b.a, cpg.a.a(false, ($$0, $$1) -> {
      for (akj $$2 : $$0.ac().t()) {
         $$2.c.b(new xu(xu.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cpg.e<cpg.a> C = a("drowningDamage", cpg.b.a, cpg.a.a(true));
   public static final cpg.e<cpg.a> D = a("fallDamage", cpg.b.a, cpg.a.a(true));
   public static final cpg.e<cpg.a> E = a("fireDamage", cpg.b.a, cpg.a.a(true));
   public static final cpg.e<cpg.a> F = a("freezeDamage", cpg.b.a, cpg.a.a(true));
   public static final cpg.e<cpg.a> G = a("doPatrolSpawning", cpg.b.c, cpg.a.a(true));
   public static final cpg.e<cpg.a> H = a("doTraderSpawning", cpg.b.c, cpg.a.a(true));
   public static final cpg.e<cpg.a> I = a("doWardenSpawning", cpg.b.c, cpg.a.a(true));
   public static final cpg.e<cpg.a> J = a("forgiveDeadPlayers", cpg.b.b, cpg.a.a(true));
   public static final cpg.e<cpg.a> K = a("universalAnger", cpg.b.b, cpg.a.a(false));
   public static final cpg.e<cpg.d> L = a("playersSleepingPercentage", cpg.b.a, cpg.d.a(100));
   public static final cpg.e<cpg.a> M = a("blockExplosionDropDecay", cpg.b.d, cpg.a.a(true));
   public static final cpg.e<cpg.a> N = a("mobExplosionDropDecay", cpg.b.d, cpg.a.a(true));
   public static final cpg.e<cpg.a> O = a("tntExplosionDropDecay", cpg.b.d, cpg.a.a(false));
   public static final cpg.e<cpg.d> P = a("snowAccumulationHeight", cpg.b.e, cpg.d.a(1));
   public static final cpg.e<cpg.a> Q = a("waterSourceConversion", cpg.b.e, cpg.a.a(true));
   public static final cpg.e<cpg.a> R = a("lavaSourceConversion", cpg.b.e, cpg.a.a(false));
   public static final cpg.e<cpg.a> S = a("globalSoundEvents", cpg.b.g, cpg.a.a(true));
   public static final cpg.e<cpg.a> T = a("doVinesSpread", cpg.b.e, cpg.a.a(true));
   private final Map<cpg.e<?>, cpg.g<?>> W;

   private static <T extends cpg.g<T>> cpg.e<T> a(String $$0, cpg.b $$1, cpg.f<T> $$2) {
      cpg.e<T> $$3 = new cpg.e<>($$0, $$1);
      cpg.f<?> $$4 = V.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cpg(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cpg() {
      this.W = V.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cpg.f)$$0.getValue()).a()));
   }

   private cpg(Map<cpg.e<?>, cpg.g<?>> $$0) {
      this.W = $$0;
   }

   public <T extends cpg.g<T>> T a(cpg.e<T> $$0) {
      return (T)this.W.get($$0);
   }

   public qs a() {
      qs $$0 = new qs();
      this.W.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.W.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public cpg b() {
      return new cpg(this.W.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cpg.g)$$0.getValue()).f())));
   }

   public static void a(cpg.c $$0) {
      V.forEach(($$1, $$2) -> a($$0, (cpg.e<?>)$$1, (cpg.f<?>)$$2));
   }

   private static <T extends cpg.g<T>> void a(cpg.c $$0, cpg.e<?> $$1, cpg.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cpg $$0, @Nullable MinecraftServer $$1) {
      $$0.W.keySet().forEach($$2 -> this.a((cpg.e<?>)$$2, $$0, $$1));
   }

   private <T extends cpg.g<T>> void a(cpg.e<T> $$0, cpg $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cpg.e<cpg.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cpg.e<cpg.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cpg.g<cpg.a> {
      private boolean b;

      static cpg.f<cpg.a> a(boolean $$0, BiConsumer<MinecraftServer, cpg.a> $$1) {
         return new cpg.f<>(BoolArgumentType::bool, $$1x -> new cpg.a($$1x, $$0), $$1, cpg.c::b);
      }

      static cpg.f<cpg.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cpg.f<cpg.a> $$0, boolean $$1) {
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

      protected cpg.a d() {
         return this;
      }

      protected cpg.a e() {
         return new cpg.a(this.a, this.b);
      }

      public void a(cpg.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cpg.g<T>> void a(cpg.e<T> $$0, cpg.f<T> $$1) {
      }

      default void b(cpg.e<cpg.a> $$0, cpg.f<cpg.a> $$1) {
      }

      default void c(cpg.e<cpg.d> $$0, cpg.f<cpg.d> $$1) {
      }
   }

   public static class d extends cpg.g<cpg.d> {
      private int b;

      private static cpg.f<cpg.d> a(int $$0, BiConsumer<MinecraftServer, cpg.d> $$1) {
         return new cpg.f<>(IntegerArgumentType::integer, $$1x -> new cpg.d($$1x, $$0), $$1, cpg.c::c);
      }

      static cpg.f<cpg.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cpg.f<cpg.d> $$0, int $$1) {
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
               cpg.U.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cpg.d d() {
         return this;
      }

      protected cpg.d e() {
         return new cpg.d(this.a, this.b);
      }

      public void a(cpg.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cpg.g<T>> {
      final String a;
      private final cpg.b b;

      public e(String $$0, cpg.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cpg.e && ((cpg.e)$$0).a.equals(this.a);
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

      public cpg.b c() {
         return this.b;
      }
   }

   public static class f<T extends cpg.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<cpg.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cpg.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cpg.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cpg.h<T> $$3) {
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

      public void a(cpg.c $$0, cpg.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cpg.g<T>> {
      protected final cpg.f<T> a;

      public g(cpg.f<T> $$0) {
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

   interface h<T extends cpg.g<T>> {
      void call(cpg.c var1, cpg.e<T> var2, cpg.f<T> var3);
   }
}
