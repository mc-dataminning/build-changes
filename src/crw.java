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

public class crw {
   public static final int a = 3;
   static final Logger Z = LogUtils.getLogger();
   private static final Map<crw.e<?>, crw.f<?>> aa = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final crw.e<crw.a> b = a("doFireTick", crw.b.e, crw.a.a(true));
   public static final crw.e<crw.a> c = a("mobGriefing", crw.b.b, crw.a.a(true));
   public static final crw.e<crw.a> d = a("keepInventory", crw.b.a, crw.a.a(false));
   public static final crw.e<crw.a> e = a("doMobSpawning", crw.b.c, crw.a.a(true));
   public static final crw.e<crw.a> f = a("doMobLoot", crw.b.d, crw.a.a(true));
   public static final crw.e<crw.a> g = a("projectilesCanBreakBlocks", crw.b.d, crw.a.a(true));
   public static final crw.e<crw.a> h = a("doTileDrops", crw.b.d, crw.a.a(true));
   public static final crw.e<crw.a> i = a("doEntityDrops", crw.b.d, crw.a.a(true));
   public static final crw.e<crw.a> j = a("commandBlockOutput", crw.b.f, crw.a.a(true));
   public static final crw.e<crw.a> k = a("naturalRegeneration", crw.b.a, crw.a.a(true));
   public static final crw.e<crw.a> l = a("doDaylightCycle", crw.b.e, crw.a.a(true));
   public static final crw.e<crw.a> m = a("logAdminCommands", crw.b.f, crw.a.a(true));
   public static final crw.e<crw.a> n = a("showDeathMessages", crw.b.f, crw.a.a(true));
   public static final crw.e<crw.d> o = a("randomTickSpeed", crw.b.e, crw.d.a(3));
   public static final crw.e<crw.a> p = a("sendCommandFeedback", crw.b.f, crw.a.a(true));
   public static final crw.e<crw.a> q = a("reducedDebugInfo", crw.b.g, crw.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (amf $$3 : $$0.ae().t()) {
         $$3.c.b(new zf($$3, $$2));
      }
   }));
   public static final crw.e<crw.a> r = a("spectatorsGenerateChunks", crw.b.a, crw.a.a(true));
   public static final crw.e<crw.d> s = a("spawnRadius", crw.b.a, crw.d.a(10));
   public static final crw.e<crw.a> t = a("disableElytraMovementCheck", crw.b.a, crw.a.a(false));
   public static final crw.e<crw.d> u = a("maxEntityCramming", crw.b.b, crw.d.a(24));
   public static final crw.e<crw.a> v = a("doWeatherCycle", crw.b.e, crw.a.a(true));
   public static final crw.e<crw.a> w = a("doLimitedCrafting", crw.b.a, crw.a.a(false, ($$0, $$1) -> {
      for (amf $$2 : $$0.ae().t()) {
         $$2.c.b(new zi(zi.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final crw.e<crw.d> x = a("maxCommandChainLength", crw.b.g, crw.d.a(65536));
   public static final crw.e<crw.d> y = a("maxCommandForkCount", crw.b.g, crw.d.a(65536));
   public static final crw.e<crw.d> z = a("commandModificationBlockLimit", crw.b.g, crw.d.a(32768));
   public static final crw.e<crw.a> A = a("announceAdvancements", crw.b.f, crw.a.a(true));
   public static final crw.e<crw.a> B = a("disableRaids", crw.b.b, crw.a.a(false));
   public static final crw.e<crw.a> C = a("doInsomnia", crw.b.c, crw.a.a(true));
   public static final crw.e<crw.a> D = a("doImmediateRespawn", crw.b.a, crw.a.a(false, ($$0, $$1) -> {
      for (amf $$2 : $$0.ae().t()) {
         $$2.c.b(new zi(zi.l, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final crw.e<crw.d> E = a("playersNetherPortalDefaultDelay", crw.b.a, crw.d.a(80));
   public static final crw.e<crw.d> F = a("playersNetherPortalCreativeDelay", crw.b.a, crw.d.a(1));
   public static final crw.e<crw.a> G = a("drowningDamage", crw.b.a, crw.a.a(true));
   public static final crw.e<crw.a> H = a("fallDamage", crw.b.a, crw.a.a(true));
   public static final crw.e<crw.a> I = a("fireDamage", crw.b.a, crw.a.a(true));
   public static final crw.e<crw.a> J = a("freezeDamage", crw.b.a, crw.a.a(true));
   public static final crw.e<crw.a> K = a("doPatrolSpawning", crw.b.c, crw.a.a(true));
   public static final crw.e<crw.a> L = a("doTraderSpawning", crw.b.c, crw.a.a(true));
   public static final crw.e<crw.a> M = a("doWardenSpawning", crw.b.c, crw.a.a(true));
   public static final crw.e<crw.a> N = a("forgiveDeadPlayers", crw.b.b, crw.a.a(true));
   public static final crw.e<crw.a> O = a("universalAnger", crw.b.b, crw.a.a(false));
   public static final crw.e<crw.d> P = a("playersSleepingPercentage", crw.b.a, crw.d.a(100));
   public static final crw.e<crw.a> Q = a("blockExplosionDropDecay", crw.b.d, crw.a.a(true));
   public static final crw.e<crw.a> R = a("mobExplosionDropDecay", crw.b.d, crw.a.a(true));
   public static final crw.e<crw.a> S = a("tntExplosionDropDecay", crw.b.d, crw.a.a(false));
   public static final crw.e<crw.d> T = a("snowAccumulationHeight", crw.b.e, crw.d.a(1));
   public static final crw.e<crw.a> U = a("waterSourceConversion", crw.b.e, crw.a.a(true));
   public static final crw.e<crw.a> V = a("lavaSourceConversion", crw.b.e, crw.a.a(false));
   public static final crw.e<crw.a> W = a("globalSoundEvents", crw.b.g, crw.a.a(true));
   public static final crw.e<crw.a> X = a("doVinesSpread", crw.b.e, crw.a.a(true));
   public static final crw.e<crw.a> Y = a("enderPearlsVanishOnDeath", crw.b.a, crw.a.a(true));
   private final Map<crw.e<?>, crw.g<?>> ab;

   private static <T extends crw.g<T>> crw.e<T> a(String $$0, crw.b $$1, crw.f<T> $$2) {
      crw.e<T> $$3 = new crw.e<>($$0, $$1);
      crw.f<?> $$4 = aa.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public crw(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public crw() {
      this.ab = aa.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((crw.f)$$0.getValue()).a()));
   }

   private crw(Map<crw.e<?>, crw.g<?>> $$0) {
      this.ab = $$0;
   }

   public <T extends crw.g<T>> T a(crw.e<T> $$0) {
      return (T)this.ab.get($$0);
   }

   public rz a() {
      rz $$0 = new rz();
      this.ab.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ab.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public crw b() {
      return new crw(this.ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((crw.g)$$0.getValue()).f())));
   }

   public static void a(crw.c $$0) {
      aa.forEach(($$1, $$2) -> a($$0, (crw.e<?>)$$1, (crw.f<?>)$$2));
   }

   private static <T extends crw.g<T>> void a(crw.c $$0, crw.e<?> $$1, crw.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(crw $$0, @Nullable MinecraftServer $$1) {
      $$0.ab.keySet().forEach($$2 -> this.a((crw.e<?>)$$2, $$0, $$1));
   }

   private <T extends crw.g<T>> void a(crw.e<T> $$0, crw $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(crw.e<crw.a> $$0) {
      return this.a($$0).a();
   }

   public int c(crw.e<crw.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends crw.g<crw.a> {
      private boolean b;

      static crw.f<crw.a> a(boolean $$0, BiConsumer<MinecraftServer, crw.a> $$1) {
         return new crw.f<>(BoolArgumentType::bool, $$1x -> new crw.a($$1x, $$0), $$1, crw.c::b);
      }

      static crw.f<crw.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(crw.f<crw.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<du> $$0, String $$1) {
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

      protected crw.a d() {
         return this;
      }

      protected crw.a e() {
         return new crw.a(this.a, this.b);
      }

      public void a(crw.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends crw.g<T>> void a(crw.e<T> $$0, crw.f<T> $$1) {
      }

      default void b(crw.e<crw.a> $$0, crw.f<crw.a> $$1) {
      }

      default void c(crw.e<crw.d> $$0, crw.f<crw.d> $$1) {
      }
   }

   public static class d extends crw.g<crw.d> {
      private int b;

      private static crw.f<crw.d> a(int $$0, BiConsumer<MinecraftServer, crw.d> $$1) {
         return new crw.f<>(IntegerArgumentType::integer, $$1x -> new crw.d($$1x, $$0), $$1, crw.c::c);
      }

      static crw.f<crw.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(crw.f<crw.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<du> $$0, String $$1) {
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
               crw.Z.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected crw.d d() {
         return this;
      }

      protected crw.d e() {
         return new crw.d(this.a, this.b);
      }

      public void a(crw.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends crw.g<T>> {
      final String a;
      private final crw.b b;

      public e(String $$0, crw.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof crw.e && ((crw.e)$$0).a.equals(this.a);
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

      public crw.b c() {
         return this.b;
      }
   }

   public static class f<T extends crw.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<crw.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final crw.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<crw.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, crw.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<du, ?> a(String $$0) {
         return dv.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(crw.c $$0, crw.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends crw.g<T>> {
      protected final crw.f<T> a;

      public g(crw.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<du> var1, String var2);

      public void b(CommandContext<du> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((du)$$0.getSource()).m());
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

   interface h<T extends crw.g<T>> {
      void call(crw.c var1, crw.e<T> var2, crw.f<T> var3);
   }
}
