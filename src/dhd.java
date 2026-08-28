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
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class dhd {
   public static final int a = 3;
   static final Logger ac = LogUtils.getLogger();
   private static final Map<dhd.e<?>, dhd.f<?>> ad = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dhd.e<dhd.a> b = a("doFireTick", dhd.b.e, dhd.a.a(true));
   public static final dhd.e<dhd.a> c = a("mobGriefing", dhd.b.b, dhd.a.a(true));
   public static final dhd.e<dhd.a> d = a("keepInventory", dhd.b.a, dhd.a.a(false));
   public static final dhd.e<dhd.a> e = a("doMobSpawning", dhd.b.c, dhd.a.a(true));
   public static final dhd.e<dhd.a> f = a("doMobLoot", dhd.b.d, dhd.a.a(true));
   public static final dhd.e<dhd.a> g = a("projectilesCanBreakBlocks", dhd.b.d, dhd.a.a(true));
   public static final dhd.e<dhd.a> h = a("doTileDrops", dhd.b.d, dhd.a.a(true));
   public static final dhd.e<dhd.a> i = a("doEntityDrops", dhd.b.d, dhd.a.a(true));
   public static final dhd.e<dhd.a> j = a("commandBlockOutput", dhd.b.f, dhd.a.a(true));
   public static final dhd.e<dhd.a> k = a("naturalRegeneration", dhd.b.a, dhd.a.a(true));
   public static final dhd.e<dhd.a> l = a("doDaylightCycle", dhd.b.e, dhd.a.a(true));
   public static final dhd.e<dhd.a> m = a("logAdminCommands", dhd.b.f, dhd.a.a(true));
   public static final dhd.e<dhd.a> n = a("showDeathMessages", dhd.b.f, dhd.a.a(true));
   public static final dhd.e<dhd.d> o = a("randomTickSpeed", dhd.b.e, dhd.d.a(3));
   public static final dhd.e<dhd.a> p = a("sendCommandFeedback", dhd.b.f, dhd.a.a(true));
   public static final dhd.e<dhd.a> q = a("reducedDebugInfo", dhd.b.g, dhd.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (asi $$3 : $$0.ag().t()) {
         $$3.f.b(new adv($$3, $$2));
      }
   }));
   public static final dhd.e<dhd.a> r = a("spectatorsGenerateChunks", dhd.b.a, dhd.a.a(true));
   public static final dhd.e<dhd.d> s = a("spawnRadius", dhd.b.a, dhd.d.a(10));
   public static final dhd.e<dhd.a> t = a("disablePlayerMovementCheck", dhd.b.a, dhd.a.a(false));
   public static final dhd.e<dhd.a> u = a("disableElytraMovementCheck", dhd.b.a, dhd.a.a(false));
   public static final dhd.e<dhd.d> v = a("maxEntityCramming", dhd.b.b, dhd.d.a(24));
   public static final dhd.e<dhd.a> w = a("doWeatherCycle", dhd.b.e, dhd.a.a(true));
   public static final dhd.e<dhd.a> x = a("doLimitedCrafting", dhd.b.a, dhd.a.a(false, ($$0, $$1) -> {
      for (asi $$2 : $$0.ag().t()) {
         $$2.f.b(new adz(adz.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dhd.e<dhd.d> y = a("maxCommandChainLength", dhd.b.g, dhd.d.a(65536));
   public static final dhd.e<dhd.d> z = a("maxCommandForkCount", dhd.b.g, dhd.d.a(65536));
   public static final dhd.e<dhd.d> A = a("commandModificationBlockLimit", dhd.b.g, dhd.d.a(32768));
   public static final dhd.e<dhd.a> B = a("announceAdvancements", dhd.b.f, dhd.a.a(true));
   public static final dhd.e<dhd.a> C = a("disableRaids", dhd.b.b, dhd.a.a(false));
   public static final dhd.e<dhd.a> D = a("doInsomnia", dhd.b.c, dhd.a.a(true));
   public static final dhd.e<dhd.a> E = a("doImmediateRespawn", dhd.b.a, dhd.a.a(false, ($$0, $$1) -> {
      for (asi $$2 : $$0.ag().t()) {
         $$2.f.b(new adz(adz.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dhd.e<dhd.d> F = a("playersNetherPortalDefaultDelay", dhd.b.a, dhd.d.a(80));
   public static final dhd.e<dhd.d> G = a("playersNetherPortalCreativeDelay", dhd.b.a, dhd.d.a(0));
   public static final dhd.e<dhd.a> H = a("drowningDamage", dhd.b.a, dhd.a.a(true));
   public static final dhd.e<dhd.a> I = a("fallDamage", dhd.b.a, dhd.a.a(true));
   public static final dhd.e<dhd.a> J = a("fireDamage", dhd.b.a, dhd.a.a(true));
   public static final dhd.e<dhd.a> K = a("freezeDamage", dhd.b.a, dhd.a.a(true));
   public static final dhd.e<dhd.a> L = a("doPatrolSpawning", dhd.b.c, dhd.a.a(true));
   public static final dhd.e<dhd.a> M = a("doTraderSpawning", dhd.b.c, dhd.a.a(true));
   public static final dhd.e<dhd.a> N = a("doWardenSpawning", dhd.b.c, dhd.a.a(true));
   public static final dhd.e<dhd.a> O = a("forgiveDeadPlayers", dhd.b.b, dhd.a.a(true));
   public static final dhd.e<dhd.a> P = a("universalAnger", dhd.b.b, dhd.a.a(false));
   public static final dhd.e<dhd.d> Q = a("playersSleepingPercentage", dhd.b.a, dhd.d.a(100));
   public static final dhd.e<dhd.a> R = a("blockExplosionDropDecay", dhd.b.d, dhd.a.a(true));
   public static final dhd.e<dhd.a> S = a("mobExplosionDropDecay", dhd.b.d, dhd.a.a(true));
   public static final dhd.e<dhd.a> T = a("tntExplosionDropDecay", dhd.b.d, dhd.a.a(false));
   public static final dhd.e<dhd.d> U = a("snowAccumulationHeight", dhd.b.e, dhd.d.a(1));
   public static final dhd.e<dhd.a> V = a("waterSourceConversion", dhd.b.e, dhd.a.a(true));
   public static final dhd.e<dhd.a> W = a("lavaSourceConversion", dhd.b.e, dhd.a.a(false));
   public static final dhd.e<dhd.a> X = a("globalSoundEvents", dhd.b.g, dhd.a.a(true));
   public static final dhd.e<dhd.a> Y = a("doVinesSpread", dhd.b.e, dhd.a.a(true));
   public static final dhd.e<dhd.a> Z = a("enderPearlsVanishOnDeath", dhd.b.a, dhd.a.a(true));
   public static final dhd.e<dhd.d> aa = a("minecartMaxSpeed", dhd.b.g, dhd.d.a(8, 1, 1000, css.a(csu.e), ($$0, $$1) -> {
   }));
   public static final dhd.e<dhd.d> ab = a("spawnChunkRadius", dhd.b.g, dhd.d.a(2, 0, 32, css.a(), ($$0, $$1) -> {
      ash $$2 = $$0.J();
      $$2.a($$2.Y(), $$2.Z());
   }));
   private final Map<dhd.e<?>, dhd.g<?>> ae;
   private final css af;

   private static <T extends dhd.g<T>> dhd.e<T> a(String $$0, dhd.b $$1, dhd.f<T> $$2) {
      dhd.e<T> $$3 = new dhd.e<>($$0, $$1);
      dhd.f<?> $$4 = ad.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dhd(css $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dhd(css $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dhd.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dhd.e<?>, dhd.f<?>>> b(css $$0) {
      return ad.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private dhd(Map<dhd.e<?>, dhd.g<?>> $$0, css $$1) {
      this.ae = $$0;
      this.af = $$1;
   }

   public <T extends dhd.g<T>> T a(dhd.e<T> $$0) {
      T $$1 = (T)this.ae.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public ux a() {
      ux $$0 = new ux();
      this.ae.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ae.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dhd a(css $$0) {
      return new dhd(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ae.containsKey($$0x.getKey()) ? this.ae.get($$0x.getKey()) : ((dhd.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dhd.c $$0) {
      ad.forEach(($$1, $$2) -> this.a($$0, (dhd.e<?>)$$1, (dhd.f<?>)$$2));
   }

   private <T extends dhd.g<T>> void a(dhd.c $$0, dhd.e<?> $$1, dhd.f<?> $$2) {
      if ($$2.e.a(this.af)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dhd $$0, @Nullable MinecraftServer $$1) {
      $$0.ae.keySet().forEach($$2 -> this.a((dhd.e<?>)$$2, $$0, $$1));
   }

   private <T extends dhd.g<T>> void a(dhd.e<T> $$0, dhd $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dhd.e<dhd.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dhd.e<dhd.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dhd.g<dhd.a> {
      private boolean b;

      static dhd.f<dhd.a> a(boolean $$0, BiConsumer<MinecraftServer, dhd.a> $$1) {
         return new dhd.f<>(BoolArgumentType::bool, $$1x -> new dhd.a($$1x, $$0), $$1, dhd.c::b, css.a());
      }

      static dhd.f<dhd.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dhd.f<dhd.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ew> $$0, String $$1) {
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

      protected dhd.a d() {
         return this;
      }

      protected dhd.a e() {
         return new dhd.a(this.a, this.b);
      }

      public void a(dhd.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dhd.g<T>> void a(dhd.e<T> $$0, dhd.f<T> $$1) {
      }

      default void b(dhd.e<dhd.a> $$0, dhd.f<dhd.a> $$1) {
      }

      default void c(dhd.e<dhd.d> $$0, dhd.f<dhd.d> $$1) {
      }
   }

   public static class d extends dhd.g<dhd.d> {
      private int b;

      private static dhd.f<dhd.d> a(int $$0, BiConsumer<MinecraftServer, dhd.d> $$1) {
         return new dhd.f<>(IntegerArgumentType::integer, $$1x -> new dhd.d($$1x, $$0), $$1, dhd.c::c, css.a());
      }

      static dhd.f<dhd.d> a(int $$0, int $$1, int $$2, css $$3, BiConsumer<MinecraftServer, dhd.d> $$4) {
         return new dhd.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dhd.d($$1x, $$0), $$4, dhd.c::c, $$3);
      }

      static dhd.f<dhd.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dhd.f<dhd.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ew> $$0, String $$1) {
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
               dhd.ac.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dhd.d d() {
         return this;
      }

      protected dhd.d e() {
         return new dhd.d(this.a, this.b);
      }

      public void a(dhd.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dhd.g<T>> {
      final String a;
      private final dhd.b b;

      public e(String $$0, dhd.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dhd.e && ((dhd.e)$$0).a.equals(this.a);
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

      public dhd.b c() {
         return this.b;
      }
   }

   public static class f<T extends dhd.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dhd.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dhd.h<T> d;
      final css e;

      f(Supplier<ArgumentType<?>> $$0, Function<dhd.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dhd.h<T> $$3, css $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public RequiredArgumentBuilder<ew, ?> a(String $$0) {
         return ex.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dhd.c $$0, dhd.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public css b() {
         return this.e;
      }
   }

   public abstract static class g<T extends dhd.g<T>> {
      protected final dhd.f<T> a;

      public g(dhd.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ew> var1, String var2);

      public void b(CommandContext<ew> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ew)$$0.getSource()).l());
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

   interface h<T extends dhd.g<T>> {
      void call(dhd.c var1, dhd.e<T> var2, dhd.f<T> var3);
   }
}
