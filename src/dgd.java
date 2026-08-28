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

public class dgd {
   public static final int a = 3;
   static final Logger ac = LogUtils.getLogger();
   private static final Map<dgd.e<?>, dgd.f<?>> ad = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dgd.e<dgd.a> b = a("doFireTick", dgd.b.e, dgd.a.a(true));
   public static final dgd.e<dgd.a> c = a("mobGriefing", dgd.b.b, dgd.a.a(true));
   public static final dgd.e<dgd.a> d = a("keepInventory", dgd.b.a, dgd.a.a(false));
   public static final dgd.e<dgd.a> e = a("doMobSpawning", dgd.b.c, dgd.a.a(true));
   public static final dgd.e<dgd.a> f = a("doMobLoot", dgd.b.d, dgd.a.a(true));
   public static final dgd.e<dgd.a> g = a("projectilesCanBreakBlocks", dgd.b.d, dgd.a.a(true));
   public static final dgd.e<dgd.a> h = a("doTileDrops", dgd.b.d, dgd.a.a(true));
   public static final dgd.e<dgd.a> i = a("doEntityDrops", dgd.b.d, dgd.a.a(true));
   public static final dgd.e<dgd.a> j = a("commandBlockOutput", dgd.b.f, dgd.a.a(true));
   public static final dgd.e<dgd.a> k = a("naturalRegeneration", dgd.b.a, dgd.a.a(true));
   public static final dgd.e<dgd.a> l = a("doDaylightCycle", dgd.b.e, dgd.a.a(true));
   public static final dgd.e<dgd.a> m = a("logAdminCommands", dgd.b.f, dgd.a.a(true));
   public static final dgd.e<dgd.a> n = a("showDeathMessages", dgd.b.f, dgd.a.a(true));
   public static final dgd.e<dgd.d> o = a("randomTickSpeed", dgd.b.e, dgd.d.a(3));
   public static final dgd.e<dgd.a> p = a("sendCommandFeedback", dgd.b.f, dgd.a.a(true));
   public static final dgd.e<dgd.a> q = a("reducedDebugInfo", dgd.b.g, dgd.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (are $$3 : $$0.ag().t()) {
         $$3.f.b(new acp($$3, $$2));
      }
   }));
   public static final dgd.e<dgd.a> r = a("spectatorsGenerateChunks", dgd.b.a, dgd.a.a(true));
   public static final dgd.e<dgd.d> s = a("spawnRadius", dgd.b.a, dgd.d.a(10));
   public static final dgd.e<dgd.a> t = a("disablePlayerMovementCheck", dgd.b.a, dgd.a.a(false));
   public static final dgd.e<dgd.a> u = a("disableElytraMovementCheck", dgd.b.a, dgd.a.a(false));
   public static final dgd.e<dgd.d> v = a("maxEntityCramming", dgd.b.b, dgd.d.a(24));
   public static final dgd.e<dgd.a> w = a("doWeatherCycle", dgd.b.e, dgd.a.a(true));
   public static final dgd.e<dgd.a> x = a("doLimitedCrafting", dgd.b.a, dgd.a.a(false, ($$0, $$1) -> {
      for (are $$2 : $$0.ag().t()) {
         $$2.f.b(new act(act.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dgd.e<dgd.d> y = a("maxCommandChainLength", dgd.b.g, dgd.d.a(65536));
   public static final dgd.e<dgd.d> z = a("maxCommandForkCount", dgd.b.g, dgd.d.a(65536));
   public static final dgd.e<dgd.d> A = a("commandModificationBlockLimit", dgd.b.g, dgd.d.a(32768));
   public static final dgd.e<dgd.a> B = a("announceAdvancements", dgd.b.f, dgd.a.a(true));
   public static final dgd.e<dgd.a> C = a("disableRaids", dgd.b.b, dgd.a.a(false));
   public static final dgd.e<dgd.a> D = a("doInsomnia", dgd.b.c, dgd.a.a(true));
   public static final dgd.e<dgd.a> E = a("doImmediateRespawn", dgd.b.a, dgd.a.a(false, ($$0, $$1) -> {
      for (are $$2 : $$0.ag().t()) {
         $$2.f.b(new act(act.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dgd.e<dgd.d> F = a("playersNetherPortalDefaultDelay", dgd.b.a, dgd.d.a(80));
   public static final dgd.e<dgd.d> G = a("playersNetherPortalCreativeDelay", dgd.b.a, dgd.d.a(0));
   public static final dgd.e<dgd.a> H = a("drowningDamage", dgd.b.a, dgd.a.a(true));
   public static final dgd.e<dgd.a> I = a("fallDamage", dgd.b.a, dgd.a.a(true));
   public static final dgd.e<dgd.a> J = a("fireDamage", dgd.b.a, dgd.a.a(true));
   public static final dgd.e<dgd.a> K = a("freezeDamage", dgd.b.a, dgd.a.a(true));
   public static final dgd.e<dgd.a> L = a("doPatrolSpawning", dgd.b.c, dgd.a.a(true));
   public static final dgd.e<dgd.a> M = a("doTraderSpawning", dgd.b.c, dgd.a.a(true));
   public static final dgd.e<dgd.a> N = a("doWardenSpawning", dgd.b.c, dgd.a.a(true));
   public static final dgd.e<dgd.a> O = a("forgiveDeadPlayers", dgd.b.b, dgd.a.a(true));
   public static final dgd.e<dgd.a> P = a("universalAnger", dgd.b.b, dgd.a.a(false));
   public static final dgd.e<dgd.d> Q = a("playersSleepingPercentage", dgd.b.a, dgd.d.a(100));
   public static final dgd.e<dgd.a> R = a("blockExplosionDropDecay", dgd.b.d, dgd.a.a(true));
   public static final dgd.e<dgd.a> S = a("mobExplosionDropDecay", dgd.b.d, dgd.a.a(true));
   public static final dgd.e<dgd.a> T = a("tntExplosionDropDecay", dgd.b.d, dgd.a.a(false));
   public static final dgd.e<dgd.d> U = a("snowAccumulationHeight", dgd.b.e, dgd.d.a(1));
   public static final dgd.e<dgd.a> V = a("waterSourceConversion", dgd.b.e, dgd.a.a(true));
   public static final dgd.e<dgd.a> W = a("lavaSourceConversion", dgd.b.e, dgd.a.a(false));
   public static final dgd.e<dgd.a> X = a("globalSoundEvents", dgd.b.g, dgd.a.a(true));
   public static final dgd.e<dgd.a> Y = a("doVinesSpread", dgd.b.e, dgd.a.a(true));
   public static final dgd.e<dgd.a> Z = a("enderPearlsVanishOnDeath", dgd.b.a, dgd.a.a(true));
   public static final dgd.e<dgd.d> aa = a("minecartMaxSpeed", dgd.b.g, dgd.d.a(8, 1, 1000, crs.a(cru.d), ($$0, $$1) -> {
   }));
   public static final dgd.e<dgd.d> ab = a("spawnChunkRadius", dgd.b.g, dgd.d.a(2, 0, 32, crs.a(), ($$0, $$1) -> {
      ard $$2 = $$0.J();
      $$2.a($$2.Z(), $$2.aa());
   }));
   private final Map<dgd.e<?>, dgd.g<?>> ae;
   private final crs af;

   private static <T extends dgd.g<T>> dgd.e<T> a(String $$0, dgd.b $$1, dgd.f<T> $$2) {
      dgd.e<T> $$3 = new dgd.e<>($$0, $$1);
      dgd.f<?> $$4 = ad.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dgd(crs $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dgd(crs $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dgd.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dgd.e<?>, dgd.f<?>>> b(crs $$0) {
      return ad.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private dgd(Map<dgd.e<?>, dgd.g<?>> $$0, crs $$1) {
      this.ae = $$0;
      this.af = $$1;
   }

   public <T extends dgd.g<T>> T a(dgd.e<T> $$0) {
      T $$1 = (T)this.ae.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public tq a() {
      tq $$0 = new tq();
      this.ae.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ae.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dgd a(crs $$0) {
      return new dgd(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ae.containsKey($$0x.getKey()) ? this.ae.get($$0x.getKey()) : ((dgd.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dgd.c $$0) {
      ad.forEach(($$1, $$2) -> this.a($$0, (dgd.e<?>)$$1, (dgd.f<?>)$$2));
   }

   private <T extends dgd.g<T>> void a(dgd.c $$0, dgd.e<?> $$1, dgd.f<?> $$2) {
      if ($$2.e.a(this.af)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dgd $$0, @Nullable MinecraftServer $$1) {
      $$0.ae.keySet().forEach($$2 -> this.a((dgd.e<?>)$$2, $$0, $$1));
   }

   private <T extends dgd.g<T>> void a(dgd.e<T> $$0, dgd $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dgd.e<dgd.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dgd.e<dgd.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dgd.g<dgd.a> {
      private boolean b;

      static dgd.f<dgd.a> a(boolean $$0, BiConsumer<MinecraftServer, dgd.a> $$1) {
         return new dgd.f<>(BoolArgumentType::bool, $$1x -> new dgd.a($$1x, $$0), $$1, dgd.c::b, crs.a());
      }

      static dgd.f<dgd.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dgd.f<dgd.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ex> $$0, String $$1) {
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

      protected dgd.a d() {
         return this;
      }

      protected dgd.a e() {
         return new dgd.a(this.a, this.b);
      }

      public void a(dgd.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dgd.g<T>> void a(dgd.e<T> $$0, dgd.f<T> $$1) {
      }

      default void b(dgd.e<dgd.a> $$0, dgd.f<dgd.a> $$1) {
      }

      default void c(dgd.e<dgd.d> $$0, dgd.f<dgd.d> $$1) {
      }
   }

   public static class d extends dgd.g<dgd.d> {
      private int b;

      private static dgd.f<dgd.d> a(int $$0, BiConsumer<MinecraftServer, dgd.d> $$1) {
         return new dgd.f<>(IntegerArgumentType::integer, $$1x -> new dgd.d($$1x, $$0), $$1, dgd.c::c, crs.a());
      }

      static dgd.f<dgd.d> a(int $$0, int $$1, int $$2, crs $$3, BiConsumer<MinecraftServer, dgd.d> $$4) {
         return new dgd.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dgd.d($$1x, $$0), $$4, dgd.c::c, $$3);
      }

      static dgd.f<dgd.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dgd.f<dgd.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ex> $$0, String $$1) {
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
               dgd.ac.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dgd.d d() {
         return this;
      }

      protected dgd.d e() {
         return new dgd.d(this.a, this.b);
      }

      public void a(dgd.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dgd.g<T>> {
      final String a;
      private final dgd.b b;

      public e(String $$0, dgd.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dgd.e && ((dgd.e)$$0).a.equals(this.a);
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

      public dgd.b c() {
         return this.b;
      }
   }

   public static class f<T extends dgd.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dgd.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dgd.h<T> d;
      final crs e;

      f(Supplier<ArgumentType<?>> $$0, Function<dgd.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dgd.h<T> $$3, crs $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public RequiredArgumentBuilder<ex, ?> a(String $$0) {
         return ey.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dgd.c $$0, dgd.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public crs b() {
         return this.e;
      }
   }

   public abstract static class g<T extends dgd.g<T>> {
      protected final dgd.f<T> a;

      public g(dgd.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ex> var1, String var2);

      public void b(CommandContext<ex> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ex)$$0.getSource()).l());
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

   interface h<T extends dgd.g<T>> {
      void call(dgd.c var1, dgd.e<T> var2, dgd.f<T> var3);
   }
}
