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

public class cmi {
   public static final int a = 3;
   static final Logger U = LogUtils.getLogger();
   private static final Map<cmi.e<?>, cmi.f<?>> V = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cmi.e<cmi.a> b = a("doFireTick", cmi.b.e, cmi.a.a(true));
   public static final cmi.e<cmi.a> c = a("mobGriefing", cmi.b.b, cmi.a.a(true));
   public static final cmi.e<cmi.a> d = a("keepInventory", cmi.b.a, cmi.a.a(false));
   public static final cmi.e<cmi.a> e = a("doMobSpawning", cmi.b.c, cmi.a.a(true));
   public static final cmi.e<cmi.a> f = a("doMobLoot", cmi.b.d, cmi.a.a(true));
   public static final cmi.e<cmi.a> g = a("doTileDrops", cmi.b.d, cmi.a.a(true));
   public static final cmi.e<cmi.a> h = a("doEntityDrops", cmi.b.d, cmi.a.a(true));
   public static final cmi.e<cmi.a> i = a("commandBlockOutput", cmi.b.f, cmi.a.a(true));
   public static final cmi.e<cmi.a> j = a("naturalRegeneration", cmi.b.a, cmi.a.a(true));
   public static final cmi.e<cmi.a> k = a("doDaylightCycle", cmi.b.e, cmi.a.a(true));
   public static final cmi.e<cmi.a> l = a("logAdminCommands", cmi.b.f, cmi.a.a(true));
   public static final cmi.e<cmi.a> m = a("showDeathMessages", cmi.b.f, cmi.a.a(true));
   public static final cmi.e<cmi.d> n = a("randomTickSpeed", cmi.b.e, cmi.d.a(3));
   public static final cmi.e<cmi.a> o = a("sendCommandFeedback", cmi.b.f, cmi.a.a(true));
   public static final cmi.e<cmi.a> p = a("reducedDebugInfo", cmi.b.g, cmi.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aig $$3 : $$0.ac().t()) {
         $$3.c.a(new vu($$3, $$2));
      }
   }));
   public static final cmi.e<cmi.a> q = a("spectatorsGenerateChunks", cmi.b.a, cmi.a.a(true));
   public static final cmi.e<cmi.d> r = a("spawnRadius", cmi.b.a, cmi.d.a(10));
   public static final cmi.e<cmi.a> s = a("disableElytraMovementCheck", cmi.b.a, cmi.a.a(false));
   public static final cmi.e<cmi.d> t = a("maxEntityCramming", cmi.b.b, cmi.d.a(24));
   public static final cmi.e<cmi.a> u = a("doWeatherCycle", cmi.b.e, cmi.a.a(true));
   public static final cmi.e<cmi.a> v = a("doLimitedCrafting", cmi.b.a, cmi.a.a(false));
   public static final cmi.e<cmi.d> w = a("maxCommandChainLength", cmi.b.g, cmi.d.a(65536));
   public static final cmi.e<cmi.d> x = a("commandModificationBlockLimit", cmi.b.g, cmi.d.a(32768));
   public static final cmi.e<cmi.a> y = a("announceAdvancements", cmi.b.f, cmi.a.a(true));
   public static final cmi.e<cmi.a> z = a("disableRaids", cmi.b.b, cmi.a.a(false));
   public static final cmi.e<cmi.a> A = a("doInsomnia", cmi.b.c, cmi.a.a(true));
   public static final cmi.e<cmi.a> B = a("doImmediateRespawn", cmi.b.a, cmi.a.a(false, ($$0, $$1) -> {
      for (aig $$2 : $$0.ac().t()) {
         $$2.c.a(new vx(vx.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final cmi.e<cmi.a> C = a("drowningDamage", cmi.b.a, cmi.a.a(true));
   public static final cmi.e<cmi.a> D = a("fallDamage", cmi.b.a, cmi.a.a(true));
   public static final cmi.e<cmi.a> E = a("fireDamage", cmi.b.a, cmi.a.a(true));
   public static final cmi.e<cmi.a> F = a("freezeDamage", cmi.b.a, cmi.a.a(true));
   public static final cmi.e<cmi.a> G = a("doPatrolSpawning", cmi.b.c, cmi.a.a(true));
   public static final cmi.e<cmi.a> H = a("doTraderSpawning", cmi.b.c, cmi.a.a(true));
   public static final cmi.e<cmi.a> I = a("doWardenSpawning", cmi.b.c, cmi.a.a(true));
   public static final cmi.e<cmi.a> J = a("forgiveDeadPlayers", cmi.b.b, cmi.a.a(true));
   public static final cmi.e<cmi.a> K = a("universalAnger", cmi.b.b, cmi.a.a(false));
   public static final cmi.e<cmi.d> L = a("playersSleepingPercentage", cmi.b.a, cmi.d.a(100));
   public static final cmi.e<cmi.a> M = a("blockExplosionDropDecay", cmi.b.d, cmi.a.a(true));
   public static final cmi.e<cmi.a> N = a("mobExplosionDropDecay", cmi.b.d, cmi.a.a(true));
   public static final cmi.e<cmi.a> O = a("tntExplosionDropDecay", cmi.b.d, cmi.a.a(false));
   public static final cmi.e<cmi.d> P = a("snowAccumulationHeight", cmi.b.e, cmi.d.a(1));
   public static final cmi.e<cmi.a> Q = a("waterSourceConversion", cmi.b.e, cmi.a.a(true));
   public static final cmi.e<cmi.a> R = a("lavaSourceConversion", cmi.b.e, cmi.a.a(false));
   public static final cmi.e<cmi.a> S = a("globalSoundEvents", cmi.b.g, cmi.a.a(true));
   public static final cmi.e<cmi.a> T = a("doVinesSpread", cmi.b.e, cmi.a.a(true));
   private final Map<cmi.e<?>, cmi.g<?>> W;

   private static <T extends cmi.g<T>> cmi.e<T> a(String $$0, cmi.b $$1, cmi.f<T> $$2) {
      cmi.e<T> $$3 = new cmi.e<>($$0, $$1);
      cmi.f<?> $$4 = V.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cmi(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cmi() {
      this.W = V.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cmi.f)$$0.getValue()).a()));
   }

   private cmi(Map<cmi.e<?>, cmi.g<?>> $$0) {
      this.W = $$0;
   }

   public <T extends cmi.g<T>> T a(cmi.e<T> $$0) {
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

   public cmi b() {
      return new cmi(this.W.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cmi.g)$$0.getValue()).f())));
   }

   public static void a(cmi.c $$0) {
      V.forEach(($$1, $$2) -> a($$0, (cmi.e<?>)$$1, (cmi.f<?>)$$2));
   }

   private static <T extends cmi.g<T>> void a(cmi.c $$0, cmi.e<?> $$1, cmi.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cmi $$0, @Nullable MinecraftServer $$1) {
      $$0.W.keySet().forEach($$2 -> this.a((cmi.e<?>)$$2, $$0, $$1));
   }

   private <T extends cmi.g<T>> void a(cmi.e<T> $$0, cmi $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cmi.e<cmi.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cmi.e<cmi.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cmi.g<cmi.a> {
      private boolean b;

      static cmi.f<cmi.a> a(boolean $$0, BiConsumer<MinecraftServer, cmi.a> $$1) {
         return new cmi.f<>(BoolArgumentType::bool, $$1x -> new cmi.a($$1x, $$0), $$1, cmi.c::b);
      }

      static cmi.f<cmi.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cmi.f<cmi.a> $$0, boolean $$1) {
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

      protected cmi.a d() {
         return this;
      }

      protected cmi.a e() {
         return new cmi.a(this.a, this.b);
      }

      public void a(cmi.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends cmi.g<T>> void a(cmi.e<T> $$0, cmi.f<T> $$1) {
      }

      default void b(cmi.e<cmi.a> $$0, cmi.f<cmi.a> $$1) {
      }

      default void c(cmi.e<cmi.d> $$0, cmi.f<cmi.d> $$1) {
      }
   }

   public static class d extends cmi.g<cmi.d> {
      private int b;

      private static cmi.f<cmi.d> a(int $$0, BiConsumer<MinecraftServer, cmi.d> $$1) {
         return new cmi.f<>(IntegerArgumentType::integer, $$1x -> new cmi.d($$1x, $$0), $$1, cmi.c::c);
      }

      static cmi.f<cmi.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cmi.f<cmi.d> $$0, int $$1) {
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
               cmi.U.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cmi.d d() {
         return this;
      }

      protected cmi.d e() {
         return new cmi.d(this.a, this.b);
      }

      public void a(cmi.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cmi.g<T>> {
      final String a;
      private final cmi.b b;

      public e(String $$0, cmi.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof cmi.e && ((cmi.e)$$0).a.equals(this.a);
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

      public cmi.b c() {
         return this.b;
      }
   }

   public static class f<T extends cmi.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<cmi.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cmi.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cmi.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cmi.h<T> $$3) {
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

      public void a(cmi.c $$0, cmi.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cmi.g<T>> {
      protected final cmi.f<T> a;

      public g(cmi.f<T> $$0) {
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

   interface h<T extends cmi.g<T>> {
      void call(cmi.c var1, cmi.e<T> var2, cmi.f<T> var3);
   }
}
