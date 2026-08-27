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

public class cpt {
   public static final int a = 3;
   static final Logger V = LogUtils.getLogger();
   private static final Map<cpt.e<?>, cpt.f<?>> W = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cpt.e<cpt.a> b = a("doFireTick", cpt.b.e, cpt.a.a(true));
   public static final cpt.e<cpt.a> c = a("mobGriefing", cpt.b.b, cpt.a.a(true));
   public static final cpt.e<cpt.a> d = a("keepInventory", cpt.b.a, cpt.a.a(false));
   public static final cpt.e<cpt.a> e = a("doMobSpawning", cpt.b.c, cpt.a.a(true));
   public static final cpt.e<cpt.a> f = a("doMobLoot", cpt.b.d, cpt.a.a(true));
   public static final cpt.e<cpt.a> g = a("doTileDrops", cpt.b.d, cpt.a.a(true));
   public static final cpt.e<cpt.a> h = a("doEntityDrops", cpt.b.d, cpt.a.a(true));
   public static final cpt.e<cpt.a> i = a("commandBlockOutput", cpt.b.f, cpt.a.a(true));
   public static final cpt.e<cpt.a> j = a("naturalRegeneration", cpt.b.a, cpt.a.a(true));
   public static final cpt.e<cpt.a> k = a("doDaylightCycle", cpt.b.e, cpt.a.a(true));
   public static final cpt.e<cpt.a> l = a("logAdminCommands", cpt.b.f, cpt.a.a(true));
   public static final cpt.e<cpt.a> m = a("showDeathMessages", cpt.b.f, cpt.a.a(true));
   public static final cpt.e<cpt.d> n = a("randomTickSpeed", cpt.b.e, cpt.d.a(3));
   public static final cpt.e<cpt.a> o = a("sendCommandFeedback", cpt.b.f, cpt.a.a(true));
   public static final cpt.e<cpt.a> p = a("reducedDebugInfo", cpt.b.g, cpt.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (akt $$3 : $$0.ac().t()) {
         $$3.c.b(new ya($$3, $$2));
      }
   }));
   public static final cpt.e<cpt.a> q = a("spectatorsGenerateChunks", cpt.b.a, cpt.a.a(true));
   public static final cpt.e<cpt.d> r = a("spawnRadius", cpt.b.a, cpt.d.a(10));
   public static final cpt.e<cpt.a> s = a("disableElytraMovementCheck", cpt.b.a, cpt.a.a(false));
   public static final cpt.e<cpt.d> t = a("maxEntityCramming", cpt.b.b, cpt.d.a(24));
   public static final cpt.e<cpt.a> u = a("doWeatherCycle", cpt.b.e, cpt.a.a(true));
   public static final cpt.e<cpt.a> v = a("doLimitedCrafting", cpt.b.a, cpt.a.a(false, ($$0, $$1) -> {
      for (akt $$2 : $$0.ac().t()) {
         $$2.c.b(new yd(yd.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cpt.e<cpt.d> w = a("maxCommandChainLength", cpt.b.g, cpt.d.a(65536));
   public static final cpt.e<cpt.d> x = a("commandModificationBlockLimit", cpt.b.g, cpt.d.a(32768));
   public static final cpt.e<cpt.a> y = a("announceAdvancements", cpt.b.f, cpt.a.a(true));
   public static final cpt.e<cpt.a> z = a("disableRaids", cpt.b.b, cpt.a.a(false));
   public static final cpt.e<cpt.a> A = a("doInsomnia", cpt.b.c, cpt.a.a(true));
   public static final cpt.e<cpt.a> B = a("doImmediateRespawn", cpt.b.a, cpt.a.a(false, ($$0, $$1) -> {
      for (akt $$2 : $$0.ac().t()) {
         $$2.c.b(new yd(yd.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cpt.e<cpt.a> C = a("drowningDamage", cpt.b.a, cpt.a.a(true));
   public static final cpt.e<cpt.a> D = a("fallDamage", cpt.b.a, cpt.a.a(true));
   public static final cpt.e<cpt.a> E = a("fireDamage", cpt.b.a, cpt.a.a(true));
   public static final cpt.e<cpt.a> F = a("freezeDamage", cpt.b.a, cpt.a.a(true));
   public static final cpt.e<cpt.a> G = a("doPatrolSpawning", cpt.b.c, cpt.a.a(true));
   public static final cpt.e<cpt.a> H = a("doTraderSpawning", cpt.b.c, cpt.a.a(true));
   public static final cpt.e<cpt.a> I = a("doWardenSpawning", cpt.b.c, cpt.a.a(true));
   public static final cpt.e<cpt.a> J = a("forgiveDeadPlayers", cpt.b.b, cpt.a.a(true));
   public static final cpt.e<cpt.a> K = a("universalAnger", cpt.b.b, cpt.a.a(false));
   public static final cpt.e<cpt.d> L = a("playersSleepingPercentage", cpt.b.a, cpt.d.a(100));
   public static final cpt.e<cpt.a> M = a("blockExplosionDropDecay", cpt.b.d, cpt.a.a(true));
   public static final cpt.e<cpt.a> N = a("mobExplosionDropDecay", cpt.b.d, cpt.a.a(true));
   public static final cpt.e<cpt.a> O = a("tntExplosionDropDecay", cpt.b.d, cpt.a.a(false));
   public static final cpt.e<cpt.d> P = a("snowAccumulationHeight", cpt.b.e, cpt.d.a(1));
   public static final cpt.e<cpt.a> Q = a("waterSourceConversion", cpt.b.e, cpt.a.a(true));
   public static final cpt.e<cpt.a> R = a("lavaSourceConversion", cpt.b.e, cpt.a.a(false));
   public static final cpt.e<cpt.a> S = a("globalSoundEvents", cpt.b.g, cpt.a.a(true));
   public static final cpt.e<cpt.a> T = a("doVinesSpread", cpt.b.e, cpt.a.a(true));
   public static final cpt.e<cpt.a> U = a("enderPearlsVanishOnDeath", cpt.b.a, cpt.a.a(true));
   private final Map<cpt.e<?>, cpt.g<?>> X;

   private static <T extends cpt.g<T>> cpt.e<T> a(String $$0, cpt.b $$1, cpt.f<T> $$2) {
      cpt.e<T> $$3 = new cpt.e<>($$0, $$1);
      cpt.f<?> $$4 = W.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cpt(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cpt() {
      this.X = W.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cpt.f)$$0.getValue()).a()));
   }

   private cpt(Map<cpt.e<?>, cpt.g<?>> $$0) {
      this.X = $$0;
   }

   public <T extends cpt.g<T>> T a(cpt.e<T> $$0) {
      return (T)this.X.get($$0);
   }

   public qy a() {
      qy $$0 = new qy();
      this.X.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.X.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public cpt b() {
      return new cpt(this.X.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cpt.g)$$0.getValue()).f())));
   }

   public static void a(cpt.c $$0) {
      W.forEach(($$1, $$2) -> a($$0, (cpt.e<?>)$$1, (cpt.f<?>)$$2));
   }

   private static <T extends cpt.g<T>> void a(cpt.c $$0, cpt.e<?> $$1, cpt.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cpt $$0, @Nullable MinecraftServer $$1) {
      $$0.X.keySet().forEach($$2 -> this.a((cpt.e<?>)$$2, $$0, $$1));
   }

   private <T extends cpt.g<T>> void a(cpt.e<T> $$0, cpt $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cpt.e<cpt.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cpt.e<cpt.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cpt.g<cpt.a> {
      private boolean b;

      static cpt.f<cpt.a> a(boolean $$0, BiConsumer<MinecraftServer, cpt.a> $$1) {
         return new cpt.f<>(BoolArgumentType::bool, $$1x -> new cpt.a($$1x, $$0), $$1, cpt.c::b);
      }

      static cpt.f<cpt.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cpt.f<cpt.a> $$0, boolean $$1) {
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

      protected cpt.a d() {
         return this;
      }

      protected cpt.a e() {
         return new cpt.a(this.a, this.b);
      }

      public void a(cpt.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cpt.g<T>> void a(cpt.e<T> $$0, cpt.f<T> $$1) {
      }

      default void b(cpt.e<cpt.a> $$0, cpt.f<cpt.a> $$1) {
      }

      default void c(cpt.e<cpt.d> $$0, cpt.f<cpt.d> $$1) {
      }
   }

   public static class d extends cpt.g<cpt.d> {
      private int b;

      private static cpt.f<cpt.d> a(int $$0, BiConsumer<MinecraftServer, cpt.d> $$1) {
         return new cpt.f<>(IntegerArgumentType::integer, $$1x -> new cpt.d($$1x, $$0), $$1, cpt.c::c);
      }

      static cpt.f<cpt.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cpt.f<cpt.d> $$0, int $$1) {
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
               cpt.V.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cpt.d d() {
         return this;
      }

      protected cpt.d e() {
         return new cpt.d(this.a, this.b);
      }

      public void a(cpt.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cpt.g<T>> {
      final String a;
      private final cpt.b b;

      public e(String $$0, cpt.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cpt.e && ((cpt.e)$$0).a.equals(this.a);
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

      public cpt.b c() {
         return this.b;
      }
   }

   public static class f<T extends cpt.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<cpt.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cpt.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cpt.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cpt.h<T> $$3) {
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

      public void a(cpt.c $$0, cpt.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cpt.g<T>> {
      protected final cpt.f<T> a;

      public g(cpt.f<T> $$0) {
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

   interface h<T extends cpt.g<T>> {
      void call(cpt.c var1, cpt.e<T> var2, cpt.f<T> var3);
   }
}
