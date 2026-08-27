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

public class cph {
   public static final int a = 3;
   static final Logger U = LogUtils.getLogger();
   private static final Map<cph.e<?>, cph.f<?>> V = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cph.e<cph.a> b = a("doFireTick", cph.b.e, cph.a.a(true));
   public static final cph.e<cph.a> c = a("mobGriefing", cph.b.b, cph.a.a(true));
   public static final cph.e<cph.a> d = a("keepInventory", cph.b.a, cph.a.a(false));
   public static final cph.e<cph.a> e = a("doMobSpawning", cph.b.c, cph.a.a(true));
   public static final cph.e<cph.a> f = a("doMobLoot", cph.b.d, cph.a.a(true));
   public static final cph.e<cph.a> g = a("doTileDrops", cph.b.d, cph.a.a(true));
   public static final cph.e<cph.a> h = a("doEntityDrops", cph.b.d, cph.a.a(true));
   public static final cph.e<cph.a> i = a("commandBlockOutput", cph.b.f, cph.a.a(true));
   public static final cph.e<cph.a> j = a("naturalRegeneration", cph.b.a, cph.a.a(true));
   public static final cph.e<cph.a> k = a("doDaylightCycle", cph.b.e, cph.a.a(true));
   public static final cph.e<cph.a> l = a("logAdminCommands", cph.b.f, cph.a.a(true));
   public static final cph.e<cph.a> m = a("showDeathMessages", cph.b.f, cph.a.a(true));
   public static final cph.e<cph.d> n = a("randomTickSpeed", cph.b.e, cph.d.a(3));
   public static final cph.e<cph.a> o = a("sendCommandFeedback", cph.b.f, cph.a.a(true));
   public static final cph.e<cph.a> p = a("reducedDebugInfo", cph.b.g, cph.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (akl $$3 : $$0.ac().t()) {
         $$3.c.b(new xs($$3, $$2));
      }
   }));
   public static final cph.e<cph.a> q = a("spectatorsGenerateChunks", cph.b.a, cph.a.a(true));
   public static final cph.e<cph.d> r = a("spawnRadius", cph.b.a, cph.d.a(10));
   public static final cph.e<cph.a> s = a("disableElytraMovementCheck", cph.b.a, cph.a.a(false));
   public static final cph.e<cph.d> t = a("maxEntityCramming", cph.b.b, cph.d.a(24));
   public static final cph.e<cph.a> u = a("doWeatherCycle", cph.b.e, cph.a.a(true));
   public static final cph.e<cph.a> v = a("doLimitedCrafting", cph.b.a, cph.a.a(false));
   public static final cph.e<cph.d> w = a("maxCommandChainLength", cph.b.g, cph.d.a(65536));
   public static final cph.e<cph.d> x = a("commandModificationBlockLimit", cph.b.g, cph.d.a(32768));
   public static final cph.e<cph.a> y = a("announceAdvancements", cph.b.f, cph.a.a(true));
   public static final cph.e<cph.a> z = a("disableRaids", cph.b.b, cph.a.a(false));
   public static final cph.e<cph.a> A = a("doInsomnia", cph.b.c, cph.a.a(true));
   public static final cph.e<cph.a> B = a("doImmediateRespawn", cph.b.a, cph.a.a(false, ($$0, $$1) -> {
      for (akl $$2 : $$0.ac().t()) {
         $$2.c.b(new xv(xv.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cph.e<cph.a> C = a("drowningDamage", cph.b.a, cph.a.a(true));
   public static final cph.e<cph.a> D = a("fallDamage", cph.b.a, cph.a.a(true));
   public static final cph.e<cph.a> E = a("fireDamage", cph.b.a, cph.a.a(true));
   public static final cph.e<cph.a> F = a("freezeDamage", cph.b.a, cph.a.a(true));
   public static final cph.e<cph.a> G = a("doPatrolSpawning", cph.b.c, cph.a.a(true));
   public static final cph.e<cph.a> H = a("doTraderSpawning", cph.b.c, cph.a.a(true));
   public static final cph.e<cph.a> I = a("doWardenSpawning", cph.b.c, cph.a.a(true));
   public static final cph.e<cph.a> J = a("forgiveDeadPlayers", cph.b.b, cph.a.a(true));
   public static final cph.e<cph.a> K = a("universalAnger", cph.b.b, cph.a.a(false));
   public static final cph.e<cph.d> L = a("playersSleepingPercentage", cph.b.a, cph.d.a(100));
   public static final cph.e<cph.a> M = a("blockExplosionDropDecay", cph.b.d, cph.a.a(true));
   public static final cph.e<cph.a> N = a("mobExplosionDropDecay", cph.b.d, cph.a.a(true));
   public static final cph.e<cph.a> O = a("tntExplosionDropDecay", cph.b.d, cph.a.a(false));
   public static final cph.e<cph.d> P = a("snowAccumulationHeight", cph.b.e, cph.d.a(1));
   public static final cph.e<cph.a> Q = a("waterSourceConversion", cph.b.e, cph.a.a(true));
   public static final cph.e<cph.a> R = a("lavaSourceConversion", cph.b.e, cph.a.a(false));
   public static final cph.e<cph.a> S = a("globalSoundEvents", cph.b.g, cph.a.a(true));
   public static final cph.e<cph.a> T = a("doVinesSpread", cph.b.e, cph.a.a(true));
   private final Map<cph.e<?>, cph.g<?>> W;

   private static <T extends cph.g<T>> cph.e<T> a(String $$0, cph.b $$1, cph.f<T> $$2) {
      cph.e<T> $$3 = new cph.e<>($$0, $$1);
      cph.f<?> $$4 = V.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cph(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cph() {
      this.W = V.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cph.f)$$0.getValue()).a()));
   }

   private cph(Map<cph.e<?>, cph.g<?>> $$0) {
      this.W = $$0;
   }

   public <T extends cph.g<T>> T a(cph.e<T> $$0) {
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

   public cph b() {
      return new cph(this.W.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cph.g)$$0.getValue()).f())));
   }

   public static void a(cph.c $$0) {
      V.forEach(($$1, $$2) -> a($$0, (cph.e<?>)$$1, (cph.f<?>)$$2));
   }

   private static <T extends cph.g<T>> void a(cph.c $$0, cph.e<?> $$1, cph.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cph $$0, @Nullable MinecraftServer $$1) {
      $$0.W.keySet().forEach($$2 -> this.a((cph.e<?>)$$2, $$0, $$1));
   }

   private <T extends cph.g<T>> void a(cph.e<T> $$0, cph $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cph.e<cph.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cph.e<cph.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cph.g<cph.a> {
      private boolean b;

      static cph.f<cph.a> a(boolean $$0, BiConsumer<MinecraftServer, cph.a> $$1) {
         return new cph.f<>(BoolArgumentType::bool, $$1x -> new cph.a($$1x, $$0), $$1, cph.c::b);
      }

      static cph.f<cph.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cph.f<cph.a> $$0, boolean $$1) {
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

      protected cph.a d() {
         return this;
      }

      protected cph.a e() {
         return new cph.a(this.a, this.b);
      }

      public void a(cph.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cph.g<T>> void a(cph.e<T> $$0, cph.f<T> $$1) {
      }

      default void b(cph.e<cph.a> $$0, cph.f<cph.a> $$1) {
      }

      default void c(cph.e<cph.d> $$0, cph.f<cph.d> $$1) {
      }
   }

   public static class d extends cph.g<cph.d> {
      private int b;

      private static cph.f<cph.d> a(int $$0, BiConsumer<MinecraftServer, cph.d> $$1) {
         return new cph.f<>(IntegerArgumentType::integer, $$1x -> new cph.d($$1x, $$0), $$1, cph.c::c);
      }

      static cph.f<cph.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cph.f<cph.d> $$0, int $$1) {
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
               cph.U.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cph.d d() {
         return this;
      }

      protected cph.d e() {
         return new cph.d(this.a, this.b);
      }

      public void a(cph.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cph.g<T>> {
      final String a;
      private final cph.b b;

      public e(String $$0, cph.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cph.e && ((cph.e)$$0).a.equals(this.a);
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

      public cph.b c() {
         return this.b;
      }
   }

   public static class f<T extends cph.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<cph.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cph.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cph.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cph.h<T> $$3) {
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

      public void a(cph.c $$0, cph.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cph.g<T>> {
      protected final cph.f<T> a;

      public g(cph.f<T> $$0) {
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

   interface h<T extends cph.g<T>> {
      void call(cph.c var1, cph.e<T> var2, cph.f<T> var3);
   }
}
