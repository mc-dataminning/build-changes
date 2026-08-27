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

public class cpm {
   public static final int a = 3;
   static final Logger U = LogUtils.getLogger();
   private static final Map<cpm.e<?>, cpm.f<?>> V = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cpm.e<cpm.a> b = a("doFireTick", cpm.b.e, cpm.a.a(true));
   public static final cpm.e<cpm.a> c = a("mobGriefing", cpm.b.b, cpm.a.a(true));
   public static final cpm.e<cpm.a> d = a("keepInventory", cpm.b.a, cpm.a.a(false));
   public static final cpm.e<cpm.a> e = a("doMobSpawning", cpm.b.c, cpm.a.a(true));
   public static final cpm.e<cpm.a> f = a("doMobLoot", cpm.b.d, cpm.a.a(true));
   public static final cpm.e<cpm.a> g = a("doTileDrops", cpm.b.d, cpm.a.a(true));
   public static final cpm.e<cpm.a> h = a("doEntityDrops", cpm.b.d, cpm.a.a(true));
   public static final cpm.e<cpm.a> i = a("commandBlockOutput", cpm.b.f, cpm.a.a(true));
   public static final cpm.e<cpm.a> j = a("naturalRegeneration", cpm.b.a, cpm.a.a(true));
   public static final cpm.e<cpm.a> k = a("doDaylightCycle", cpm.b.e, cpm.a.a(true));
   public static final cpm.e<cpm.a> l = a("logAdminCommands", cpm.b.f, cpm.a.a(true));
   public static final cpm.e<cpm.a> m = a("showDeathMessages", cpm.b.f, cpm.a.a(true));
   public static final cpm.e<cpm.d> n = a("randomTickSpeed", cpm.b.e, cpm.d.a(3));
   public static final cpm.e<cpm.a> o = a("sendCommandFeedback", cpm.b.f, cpm.a.a(true));
   public static final cpm.e<cpm.a> p = a("reducedDebugInfo", cpm.b.g, cpm.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (ako $$3 : $$0.ac().t()) {
         $$3.c.b(new xv($$3, $$2));
      }
   }));
   public static final cpm.e<cpm.a> q = a("spectatorsGenerateChunks", cpm.b.a, cpm.a.a(true));
   public static final cpm.e<cpm.d> r = a("spawnRadius", cpm.b.a, cpm.d.a(10));
   public static final cpm.e<cpm.a> s = a("disableElytraMovementCheck", cpm.b.a, cpm.a.a(false));
   public static final cpm.e<cpm.d> t = a("maxEntityCramming", cpm.b.b, cpm.d.a(24));
   public static final cpm.e<cpm.a> u = a("doWeatherCycle", cpm.b.e, cpm.a.a(true));
   public static final cpm.e<cpm.a> v = a("doLimitedCrafting", cpm.b.a, cpm.a.a(false));
   public static final cpm.e<cpm.d> w = a("maxCommandChainLength", cpm.b.g, cpm.d.a(65536));
   public static final cpm.e<cpm.d> x = a("commandModificationBlockLimit", cpm.b.g, cpm.d.a(32768));
   public static final cpm.e<cpm.a> y = a("announceAdvancements", cpm.b.f, cpm.a.a(true));
   public static final cpm.e<cpm.a> z = a("disableRaids", cpm.b.b, cpm.a.a(false));
   public static final cpm.e<cpm.a> A = a("doInsomnia", cpm.b.c, cpm.a.a(true));
   public static final cpm.e<cpm.a> B = a("doImmediateRespawn", cpm.b.a, cpm.a.a(false, ($$0, $$1) -> {
      for (ako $$2 : $$0.ac().t()) {
         $$2.c.b(new xy(xy.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cpm.e<cpm.a> C = a("drowningDamage", cpm.b.a, cpm.a.a(true));
   public static final cpm.e<cpm.a> D = a("fallDamage", cpm.b.a, cpm.a.a(true));
   public static final cpm.e<cpm.a> E = a("fireDamage", cpm.b.a, cpm.a.a(true));
   public static final cpm.e<cpm.a> F = a("freezeDamage", cpm.b.a, cpm.a.a(true));
   public static final cpm.e<cpm.a> G = a("doPatrolSpawning", cpm.b.c, cpm.a.a(true));
   public static final cpm.e<cpm.a> H = a("doTraderSpawning", cpm.b.c, cpm.a.a(true));
   public static final cpm.e<cpm.a> I = a("doWardenSpawning", cpm.b.c, cpm.a.a(true));
   public static final cpm.e<cpm.a> J = a("forgiveDeadPlayers", cpm.b.b, cpm.a.a(true));
   public static final cpm.e<cpm.a> K = a("universalAnger", cpm.b.b, cpm.a.a(false));
   public static final cpm.e<cpm.d> L = a("playersSleepingPercentage", cpm.b.a, cpm.d.a(100));
   public static final cpm.e<cpm.a> M = a("blockExplosionDropDecay", cpm.b.d, cpm.a.a(true));
   public static final cpm.e<cpm.a> N = a("mobExplosionDropDecay", cpm.b.d, cpm.a.a(true));
   public static final cpm.e<cpm.a> O = a("tntExplosionDropDecay", cpm.b.d, cpm.a.a(false));
   public static final cpm.e<cpm.d> P = a("snowAccumulationHeight", cpm.b.e, cpm.d.a(1));
   public static final cpm.e<cpm.a> Q = a("waterSourceConversion", cpm.b.e, cpm.a.a(true));
   public static final cpm.e<cpm.a> R = a("lavaSourceConversion", cpm.b.e, cpm.a.a(false));
   public static final cpm.e<cpm.a> S = a("globalSoundEvents", cpm.b.g, cpm.a.a(true));
   public static final cpm.e<cpm.a> T = a("doVinesSpread", cpm.b.e, cpm.a.a(true));
   private final Map<cpm.e<?>, cpm.g<?>> W;

   private static <T extends cpm.g<T>> cpm.e<T> a(String $$0, cpm.b $$1, cpm.f<T> $$2) {
      cpm.e<T> $$3 = new cpm.e<>($$0, $$1);
      cpm.f<?> $$4 = V.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cpm(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cpm() {
      this.W = V.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cpm.f)$$0.getValue()).a()));
   }

   private cpm(Map<cpm.e<?>, cpm.g<?>> $$0) {
      this.W = $$0;
   }

   public <T extends cpm.g<T>> T a(cpm.e<T> $$0) {
      return (T)this.W.get($$0);
   }

   public qu a() {
      qu $$0 = new qu();
      this.W.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.W.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public cpm b() {
      return new cpm(this.W.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cpm.g)$$0.getValue()).f())));
   }

   public static void a(cpm.c $$0) {
      V.forEach(($$1, $$2) -> a($$0, (cpm.e<?>)$$1, (cpm.f<?>)$$2));
   }

   private static <T extends cpm.g<T>> void a(cpm.c $$0, cpm.e<?> $$1, cpm.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cpm $$0, @Nullable MinecraftServer $$1) {
      $$0.W.keySet().forEach($$2 -> this.a((cpm.e<?>)$$2, $$0, $$1));
   }

   private <T extends cpm.g<T>> void a(cpm.e<T> $$0, cpm $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cpm.e<cpm.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cpm.e<cpm.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cpm.g<cpm.a> {
      private boolean b;

      static cpm.f<cpm.a> a(boolean $$0, BiConsumer<MinecraftServer, cpm.a> $$1) {
         return new cpm.f<>(BoolArgumentType::bool, $$1x -> new cpm.a($$1x, $$0), $$1, cpm.c::b);
      }

      static cpm.f<cpm.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cpm.f<cpm.a> $$0, boolean $$1) {
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

      protected cpm.a d() {
         return this;
      }

      protected cpm.a e() {
         return new cpm.a(this.a, this.b);
      }

      public void a(cpm.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cpm.g<T>> void a(cpm.e<T> $$0, cpm.f<T> $$1) {
      }

      default void b(cpm.e<cpm.a> $$0, cpm.f<cpm.a> $$1) {
      }

      default void c(cpm.e<cpm.d> $$0, cpm.f<cpm.d> $$1) {
      }
   }

   public static class d extends cpm.g<cpm.d> {
      private int b;

      private static cpm.f<cpm.d> a(int $$0, BiConsumer<MinecraftServer, cpm.d> $$1) {
         return new cpm.f<>(IntegerArgumentType::integer, $$1x -> new cpm.d($$1x, $$0), $$1, cpm.c::c);
      }

      static cpm.f<cpm.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cpm.f<cpm.d> $$0, int $$1) {
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
               cpm.U.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cpm.d d() {
         return this;
      }

      protected cpm.d e() {
         return new cpm.d(this.a, this.b);
      }

      public void a(cpm.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cpm.g<T>> {
      final String a;
      private final cpm.b b;

      public e(String $$0, cpm.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cpm.e && ((cpm.e)$$0).a.equals(this.a);
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

      public cpm.b c() {
         return this.b;
      }
   }

   public static class f<T extends cpm.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<cpm.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cpm.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cpm.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cpm.h<T> $$3) {
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

      public void a(cpm.c $$0, cpm.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cpm.g<T>> {
      protected final cpm.f<T> a;

      public g(cpm.f<T> $$0) {
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

   interface h<T extends cpm.g<T>> {
      void call(cpm.c var1, cpm.e<T> var2, cpm.f<T> var3);
   }
}
