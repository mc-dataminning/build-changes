import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
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

public class dcq {
   public static final int a = 3;
   static final Logger ab = LogUtils.getLogger();
   private static final Map<dcq.e<?>, dcq.f<?>> ac = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dcq.e<dcq.a> b = a("doFireTick", dcq.b.e, dcq.a.a(true));
   public static final dcq.e<dcq.a> c = a("mobGriefing", dcq.b.b, dcq.a.a(true));
   public static final dcq.e<dcq.a> d = a("keepInventory", dcq.b.a, dcq.a.a(false));
   public static final dcq.e<dcq.a> e = a("doMobSpawning", dcq.b.c, dcq.a.a(true));
   public static final dcq.e<dcq.a> f = a("doMobLoot", dcq.b.d, dcq.a.a(true));
   public static final dcq.e<dcq.a> g = a("projectilesCanBreakBlocks", dcq.b.d, dcq.a.a(true));
   public static final dcq.e<dcq.a> h = a("doTileDrops", dcq.b.d, dcq.a.a(true));
   public static final dcq.e<dcq.a> i = a("doEntityDrops", dcq.b.d, dcq.a.a(true));
   public static final dcq.e<dcq.a> j = a("commandBlockOutput", dcq.b.f, dcq.a.a(true));
   public static final dcq.e<dcq.a> k = a("naturalRegeneration", dcq.b.a, dcq.a.a(true));
   public static final dcq.e<dcq.a> l = a("doDaylightCycle", dcq.b.e, dcq.a.a(true));
   public static final dcq.e<dcq.a> m = a("logAdminCommands", dcq.b.f, dcq.a.a(true));
   public static final dcq.e<dcq.a> n = a("showDeathMessages", dcq.b.f, dcq.a.a(true));
   public static final dcq.e<dcq.d> o = a("randomTickSpeed", dcq.b.e, dcq.d.a(3));
   public static final dcq.e<dcq.a> p = a("sendCommandFeedback", dcq.b.f, dcq.a.a(true));
   public static final dcq.e<dcq.a> q = a("reducedDebugInfo", dcq.b.g, dcq.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aqu $$3 : $$0.ah().t()) {
         $$3.c.b(new acx($$3, $$2));
      }
   }));
   public static final dcq.e<dcq.a> r = a("spectatorsGenerateChunks", dcq.b.a, dcq.a.a(true));
   public static final dcq.e<dcq.d> s = a("spawnRadius", dcq.b.a, dcq.d.a(10));
   public static final dcq.e<dcq.a> t = a("disableElytraMovementCheck", dcq.b.a, dcq.a.a(false));
   public static final dcq.e<dcq.d> u = a("maxEntityCramming", dcq.b.b, dcq.d.a(24));
   public static final dcq.e<dcq.a> v = a("doWeatherCycle", dcq.b.e, dcq.a.a(true));
   public static final dcq.e<dcq.a> w = a("doLimitedCrafting", dcq.b.a, dcq.a.a(false, ($$0, $$1) -> {
      for (aqu $$2 : $$0.ah().t()) {
         $$2.c.b(new ada(ada.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dcq.e<dcq.d> x = a("maxCommandChainLength", dcq.b.g, dcq.d.a(65536));
   public static final dcq.e<dcq.d> y = a("maxCommandForkCount", dcq.b.g, dcq.d.a(65536));
   public static final dcq.e<dcq.d> z = a("commandModificationBlockLimit", dcq.b.g, dcq.d.a(32768));
   public static final dcq.e<dcq.a> A = a("announceAdvancements", dcq.b.f, dcq.a.a(true));
   public static final dcq.e<dcq.a> B = a("disableRaids", dcq.b.b, dcq.a.a(false));
   public static final dcq.e<dcq.a> C = a("doInsomnia", dcq.b.c, dcq.a.a(true));
   public static final dcq.e<dcq.a> D = a("doImmediateRespawn", dcq.b.a, dcq.a.a(false, ($$0, $$1) -> {
      for (aqu $$2 : $$0.ah().t()) {
         $$2.c.b(new ada(ada.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dcq.e<dcq.d> E = a("playersNetherPortalDefaultDelay", dcq.b.a, dcq.d.a(80));
   public static final dcq.e<dcq.d> F = a("playersNetherPortalCreativeDelay", dcq.b.a, dcq.d.a(1));
   public static final dcq.e<dcq.a> G = a("drowningDamage", dcq.b.a, dcq.a.a(true));
   public static final dcq.e<dcq.a> H = a("fallDamage", dcq.b.a, dcq.a.a(true));
   public static final dcq.e<dcq.a> I = a("fireDamage", dcq.b.a, dcq.a.a(true));
   public static final dcq.e<dcq.a> J = a("freezeDamage", dcq.b.a, dcq.a.a(true));
   public static final dcq.e<dcq.a> K = a("doPatrolSpawning", dcq.b.c, dcq.a.a(true));
   public static final dcq.e<dcq.a> L = a("doTraderSpawning", dcq.b.c, dcq.a.a(true));
   public static final dcq.e<dcq.a> M = a("doWardenSpawning", dcq.b.c, dcq.a.a(true));
   public static final dcq.e<dcq.a> N = a("forgiveDeadPlayers", dcq.b.b, dcq.a.a(true));
   public static final dcq.e<dcq.a> O = a("universalAnger", dcq.b.b, dcq.a.a(false));
   public static final dcq.e<dcq.d> P = a("playersSleepingPercentage", dcq.b.a, dcq.d.a(100));
   public static final dcq.e<dcq.a> Q = a("blockExplosionDropDecay", dcq.b.d, dcq.a.a(true));
   public static final dcq.e<dcq.a> R = a("mobExplosionDropDecay", dcq.b.d, dcq.a.a(true));
   public static final dcq.e<dcq.a> S = a("tntExplosionDropDecay", dcq.b.d, dcq.a.a(false));
   public static final dcq.e<dcq.d> T = a("snowAccumulationHeight", dcq.b.e, dcq.d.a(1));
   public static final dcq.e<dcq.a> U = a("waterSourceConversion", dcq.b.e, dcq.a.a(true));
   public static final dcq.e<dcq.a> V = a("lavaSourceConversion", dcq.b.e, dcq.a.a(false));
   public static final dcq.e<dcq.a> W = a("globalSoundEvents", dcq.b.g, dcq.a.a(true));
   public static final dcq.e<dcq.a> X = a("doVinesSpread", dcq.b.e, dcq.a.a(true));
   public static final dcq.e<dcq.a> Y = a("enderPearlsVanishOnDeath", dcq.b.a, dcq.a.a(true));
   public static final dcq.e<dcq.d> Z = a("spawnChunkRadius", dcq.b.g, dcq.d.a(2, 0, 32, ($$0, $$1) -> {
      aqt $$2 = $$0.I();
      $$2.a($$2.V(), $$2.W());
   }));
   public static final dcq.e<dcq.a> aa = a("entitiesWithPassengersCanUsePortals", dcq.b.b, dcq.a.a(false));
   private final Map<dcq.e<?>, dcq.g<?>> ad;

   private static <T extends dcq.g<T>> dcq.e<T> a(String $$0, dcq.b $$1, dcq.f<T> $$2) {
      dcq.e<T> $$3 = new dcq.e<>($$0, $$1);
      dcq.f<?> $$4 = ac.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dcq(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public dcq() {
      this.ad = ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dcq.f)$$0.getValue()).a()));
   }

   private dcq(Map<dcq.e<?>, dcq.g<?>> $$0) {
      this.ad = $$0;
   }

   public <T extends dcq.g<T>> T a(dcq.e<T> $$0) {
      return (T)this.ad.get($$0);
   }

   public ua a() {
      ua $$0 = new ua();
      this.ad.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ad.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dcq b() {
      return new dcq(this.ad.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dcq.g)$$0.getValue()).f())));
   }

   public static void a(dcq.c $$0) {
      ac.forEach(($$1, $$2) -> a($$0, (dcq.e<?>)$$1, (dcq.f<?>)$$2));
   }

   private static <T extends dcq.g<T>> void a(dcq.c $$0, dcq.e<?> $$1, dcq.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(dcq $$0, @Nullable MinecraftServer $$1) {
      $$0.ad.keySet().forEach($$2 -> this.a((dcq.e<?>)$$2, $$0, $$1));
   }

   private <T extends dcq.g<T>> void a(dcq.e<T> $$0, dcq $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dcq.e<dcq.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dcq.e<dcq.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dcq.g<dcq.a> {
      private boolean b;

      static dcq.f<dcq.a> a(boolean $$0, BiConsumer<MinecraftServer, dcq.a> $$1) {
         return new dcq.f<>(BoolArgumentType::bool, $$1x -> new dcq.a($$1x, $$0), $$1, dcq.c::b);
      }

      static dcq.f<dcq.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dcq.f<dcq.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<et> $$0, String $$1) {
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

      protected dcq.a d() {
         return this;
      }

      protected dcq.a e() {
         return new dcq.a(this.a, this.b);
      }

      public void a(dcq.a $$0, @Nullable MinecraftServer $$1) {
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

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }
   }

   public interface c {
      default <T extends dcq.g<T>> void a(dcq.e<T> $$0, dcq.f<T> $$1) {
      }

      default void b(dcq.e<dcq.a> $$0, dcq.f<dcq.a> $$1) {
      }

      default void c(dcq.e<dcq.d> $$0, dcq.f<dcq.d> $$1) {
      }
   }

   public static class d extends dcq.g<dcq.d> {
      private int b;

      private static dcq.f<dcq.d> a(int $$0, BiConsumer<MinecraftServer, dcq.d> $$1) {
         return new dcq.f<>(IntegerArgumentType::integer, $$1x -> new dcq.d($$1x, $$0), $$1, dcq.c::c);
      }

      static dcq.f<dcq.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, dcq.d> $$3) {
         return new dcq.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dcq.d($$1x, $$0), $$3, dcq.c::c);
      }

      static dcq.f<dcq.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dcq.f<dcq.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<et> $$0, String $$1) {
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
            StringReader $$1 = new StringReader($$0);
            this.b = (Integer)this.a.a.get().parse($$1);
            return !$$1.canRead();
         } catch (CommandSyntaxException var3) {
            return false;
         }
      }

      private static int c(String $$0) {
         if (!$$0.isEmpty()) {
            try {
               return Integer.parseInt($$0);
            } catch (NumberFormatException var2) {
               dcq.ab.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dcq.d d() {
         return this;
      }

      protected dcq.d e() {
         return new dcq.d(this.a, this.b);
      }

      public void a(dcq.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dcq.g<T>> {
      final String a;
      private final dcq.b b;

      public e(String $$0, dcq.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dcq.e && ((dcq.e)$$0).a.equals(this.a);
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

      public dcq.b c() {
         return this.b;
      }
   }

   public static class f<T extends dcq.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dcq.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dcq.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<dcq.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dcq.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<et, ?> a(String $$0) {
         return eu.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dcq.c $$0, dcq.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends dcq.g<T>> {
      protected final dcq.f<T> a;

      public g(dcq.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<et> var1, String var2);

      public void b(CommandContext<et> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((et)$$0.getSource()).l());
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

   interface h<T extends dcq.g<T>> {
      void call(dcq.c var1, dcq.e<T> var2, dcq.f<T> var3);
   }
}
