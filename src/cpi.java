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

public class cpi {
   public static final int a = 3;
   static final Logger U = LogUtils.getLogger();
   private static final Map<cpi.e<?>, cpi.f<?>> V = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cpi.e<cpi.a> b = a("doFireTick", cpi.b.e, cpi.a.a(true));
   public static final cpi.e<cpi.a> c = a("mobGriefing", cpi.b.b, cpi.a.a(true));
   public static final cpi.e<cpi.a> d = a("keepInventory", cpi.b.a, cpi.a.a(false));
   public static final cpi.e<cpi.a> e = a("doMobSpawning", cpi.b.c, cpi.a.a(true));
   public static final cpi.e<cpi.a> f = a("doMobLoot", cpi.b.d, cpi.a.a(true));
   public static final cpi.e<cpi.a> g = a("doTileDrops", cpi.b.d, cpi.a.a(true));
   public static final cpi.e<cpi.a> h = a("doEntityDrops", cpi.b.d, cpi.a.a(true));
   public static final cpi.e<cpi.a> i = a("commandBlockOutput", cpi.b.f, cpi.a.a(true));
   public static final cpi.e<cpi.a> j = a("naturalRegeneration", cpi.b.a, cpi.a.a(true));
   public static final cpi.e<cpi.a> k = a("doDaylightCycle", cpi.b.e, cpi.a.a(true));
   public static final cpi.e<cpi.a> l = a("logAdminCommands", cpi.b.f, cpi.a.a(true));
   public static final cpi.e<cpi.a> m = a("showDeathMessages", cpi.b.f, cpi.a.a(true));
   public static final cpi.e<cpi.d> n = a("randomTickSpeed", cpi.b.e, cpi.d.a(3));
   public static final cpi.e<cpi.a> o = a("sendCommandFeedback", cpi.b.f, cpi.a.a(true));
   public static final cpi.e<cpi.a> p = a("reducedDebugInfo", cpi.b.g, cpi.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (akl $$3 : $$0.ac().t()) {
         $$3.c.b(new xs($$3, $$2));
      }
   }));
   public static final cpi.e<cpi.a> q = a("spectatorsGenerateChunks", cpi.b.a, cpi.a.a(true));
   public static final cpi.e<cpi.d> r = a("spawnRadius", cpi.b.a, cpi.d.a(10));
   public static final cpi.e<cpi.a> s = a("disableElytraMovementCheck", cpi.b.a, cpi.a.a(false));
   public static final cpi.e<cpi.d> t = a("maxEntityCramming", cpi.b.b, cpi.d.a(24));
   public static final cpi.e<cpi.a> u = a("doWeatherCycle", cpi.b.e, cpi.a.a(true));
   public static final cpi.e<cpi.a> v = a("doLimitedCrafting", cpi.b.a, cpi.a.a(false));
   public static final cpi.e<cpi.d> w = a("maxCommandChainLength", cpi.b.g, cpi.d.a(65536));
   public static final cpi.e<cpi.d> x = a("commandModificationBlockLimit", cpi.b.g, cpi.d.a(32768));
   public static final cpi.e<cpi.a> y = a("announceAdvancements", cpi.b.f, cpi.a.a(true));
   public static final cpi.e<cpi.a> z = a("disableRaids", cpi.b.b, cpi.a.a(false));
   public static final cpi.e<cpi.a> A = a("doInsomnia", cpi.b.c, cpi.a.a(true));
   public static final cpi.e<cpi.a> B = a("doImmediateRespawn", cpi.b.a, cpi.a.a(false, ($$0, $$1) -> {
      for (akl $$2 : $$0.ac().t()) {
         $$2.c.b(new xv(xv.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cpi.e<cpi.a> C = a("drowningDamage", cpi.b.a, cpi.a.a(true));
   public static final cpi.e<cpi.a> D = a("fallDamage", cpi.b.a, cpi.a.a(true));
   public static final cpi.e<cpi.a> E = a("fireDamage", cpi.b.a, cpi.a.a(true));
   public static final cpi.e<cpi.a> F = a("freezeDamage", cpi.b.a, cpi.a.a(true));
   public static final cpi.e<cpi.a> G = a("doPatrolSpawning", cpi.b.c, cpi.a.a(true));
   public static final cpi.e<cpi.a> H = a("doTraderSpawning", cpi.b.c, cpi.a.a(true));
   public static final cpi.e<cpi.a> I = a("doWardenSpawning", cpi.b.c, cpi.a.a(true));
   public static final cpi.e<cpi.a> J = a("forgiveDeadPlayers", cpi.b.b, cpi.a.a(true));
   public static final cpi.e<cpi.a> K = a("universalAnger", cpi.b.b, cpi.a.a(false));
   public static final cpi.e<cpi.d> L = a("playersSleepingPercentage", cpi.b.a, cpi.d.a(100));
   public static final cpi.e<cpi.a> M = a("blockExplosionDropDecay", cpi.b.d, cpi.a.a(true));
   public static final cpi.e<cpi.a> N = a("mobExplosionDropDecay", cpi.b.d, cpi.a.a(true));
   public static final cpi.e<cpi.a> O = a("tntExplosionDropDecay", cpi.b.d, cpi.a.a(false));
   public static final cpi.e<cpi.d> P = a("snowAccumulationHeight", cpi.b.e, cpi.d.a(1));
   public static final cpi.e<cpi.a> Q = a("waterSourceConversion", cpi.b.e, cpi.a.a(true));
   public static final cpi.e<cpi.a> R = a("lavaSourceConversion", cpi.b.e, cpi.a.a(false));
   public static final cpi.e<cpi.a> S = a("globalSoundEvents", cpi.b.g, cpi.a.a(true));
   public static final cpi.e<cpi.a> T = a("doVinesSpread", cpi.b.e, cpi.a.a(true));
   private final Map<cpi.e<?>, cpi.g<?>> W;

   private static <T extends cpi.g<T>> cpi.e<T> a(String $$0, cpi.b $$1, cpi.f<T> $$2) {
      cpi.e<T> $$3 = new cpi.e<>($$0, $$1);
      cpi.f<?> $$4 = V.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cpi(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cpi() {
      this.W = V.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cpi.f)$$0.getValue()).a()));
   }

   private cpi(Map<cpi.e<?>, cpi.g<?>> $$0) {
      this.W = $$0;
   }

   public <T extends cpi.g<T>> T a(cpi.e<T> $$0) {
      return (T)this.W.get($$0);
   }

   public qr a() {
      qr $$0 = new qr();
      this.W.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.W.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public cpi b() {
      return new cpi(this.W.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cpi.g)$$0.getValue()).f())));
   }

   public static void a(cpi.c $$0) {
      V.forEach(($$1, $$2) -> a($$0, (cpi.e<?>)$$1, (cpi.f<?>)$$2));
   }

   private static <T extends cpi.g<T>> void a(cpi.c $$0, cpi.e<?> $$1, cpi.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cpi $$0, @Nullable MinecraftServer $$1) {
      $$0.W.keySet().forEach($$2 -> this.a((cpi.e<?>)$$2, $$0, $$1));
   }

   private <T extends cpi.g<T>> void a(cpi.e<T> $$0, cpi $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cpi.e<cpi.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cpi.e<cpi.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cpi.g<cpi.a> {
      private boolean b;

      static cpi.f<cpi.a> a(boolean $$0, BiConsumer<MinecraftServer, cpi.a> $$1) {
         return new cpi.f<>(BoolArgumentType::bool, $$1x -> new cpi.a($$1x, $$0), $$1, cpi.c::b);
      }

      static cpi.f<cpi.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cpi.f<cpi.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<dr> $$0, String $$1) {
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

      protected cpi.a d() {
         return this;
      }

      protected cpi.a e() {
         return new cpi.a(this.a, this.b);
      }

      public void a(cpi.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cpi.g<T>> void a(cpi.e<T> $$0, cpi.f<T> $$1) {
      }

      default void b(cpi.e<cpi.a> $$0, cpi.f<cpi.a> $$1) {
      }

      default void c(cpi.e<cpi.d> $$0, cpi.f<cpi.d> $$1) {
      }
   }

   public static class d extends cpi.g<cpi.d> {
      private int b;

      private static cpi.f<cpi.d> a(int $$0, BiConsumer<MinecraftServer, cpi.d> $$1) {
         return new cpi.f<>(IntegerArgumentType::integer, $$1x -> new cpi.d($$1x, $$0), $$1, cpi.c::c);
      }

      static cpi.f<cpi.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cpi.f<cpi.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<dr> $$0, String $$1) {
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
               cpi.U.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cpi.d d() {
         return this;
      }

      protected cpi.d e() {
         return new cpi.d(this.a, this.b);
      }

      public void a(cpi.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cpi.g<T>> {
      final String a;
      private final cpi.b b;

      public e(String $$0, cpi.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cpi.e && ((cpi.e)$$0).a.equals(this.a);
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

      public cpi.b c() {
         return this.b;
      }
   }

   public static class f<T extends cpi.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<cpi.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cpi.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cpi.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cpi.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<dr, ?> a(String $$0) {
         return ds.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(cpi.c $$0, cpi.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cpi.g<T>> {
      protected final cpi.f<T> a;

      public g(cpi.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<dr> var1, String var2);

      public void b(CommandContext<dr> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((dr)$$0.getSource()).l());
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

   interface h<T extends cpi.g<T>> {
      void call(cpi.c var1, cpi.e<T> var2, cpi.f<T> var3);
   }
}
