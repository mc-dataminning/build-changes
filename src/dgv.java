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

public class dgv {
   public static final int a = 3;
   static final Logger ac = LogUtils.getLogger();
   private static final Map<dgv.e<?>, dgv.f<?>> ad = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dgv.e<dgv.a> b = a("doFireTick", dgv.b.e, dgv.a.a(true));
   public static final dgv.e<dgv.a> c = a("mobGriefing", dgv.b.b, dgv.a.a(true));
   public static final dgv.e<dgv.a> d = a("keepInventory", dgv.b.a, dgv.a.a(false));
   public static final dgv.e<dgv.a> e = a("doMobSpawning", dgv.b.c, dgv.a.a(true));
   public static final dgv.e<dgv.a> f = a("doMobLoot", dgv.b.d, dgv.a.a(true));
   public static final dgv.e<dgv.a> g = a("projectilesCanBreakBlocks", dgv.b.d, dgv.a.a(true));
   public static final dgv.e<dgv.a> h = a("doTileDrops", dgv.b.d, dgv.a.a(true));
   public static final dgv.e<dgv.a> i = a("doEntityDrops", dgv.b.d, dgv.a.a(true));
   public static final dgv.e<dgv.a> j = a("commandBlockOutput", dgv.b.f, dgv.a.a(true));
   public static final dgv.e<dgv.a> k = a("naturalRegeneration", dgv.b.a, dgv.a.a(true));
   public static final dgv.e<dgv.a> l = a("doDaylightCycle", dgv.b.e, dgv.a.a(true));
   public static final dgv.e<dgv.a> m = a("logAdminCommands", dgv.b.f, dgv.a.a(true));
   public static final dgv.e<dgv.a> n = a("showDeathMessages", dgv.b.f, dgv.a.a(true));
   public static final dgv.e<dgv.d> o = a("randomTickSpeed", dgv.b.e, dgv.d.a(3));
   public static final dgv.e<dgv.a> p = a("sendCommandFeedback", dgv.b.f, dgv.a.a(true));
   public static final dgv.e<dgv.a> q = a("reducedDebugInfo", dgv.b.g, dgv.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (are $$3 : $$0.ag().t()) {
         $$3.f.b(new aco($$3, $$2));
      }
   }));
   public static final dgv.e<dgv.a> r = a("spectatorsGenerateChunks", dgv.b.a, dgv.a.a(true));
   public static final dgv.e<dgv.d> s = a("spawnRadius", dgv.b.a, dgv.d.a(10));
   public static final dgv.e<dgv.a> t = a("disablePlayerMovementCheck", dgv.b.a, dgv.a.a(false));
   public static final dgv.e<dgv.a> u = a("disableElytraMovementCheck", dgv.b.a, dgv.a.a(false));
   public static final dgv.e<dgv.d> v = a("maxEntityCramming", dgv.b.b, dgv.d.a(24));
   public static final dgv.e<dgv.a> w = a("doWeatherCycle", dgv.b.e, dgv.a.a(true));
   public static final dgv.e<dgv.a> x = a("doLimitedCrafting", dgv.b.a, dgv.a.a(false, ($$0, $$1) -> {
      for (are $$2 : $$0.ag().t()) {
         $$2.f.b(new acs(acs.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dgv.e<dgv.d> y = a("maxCommandChainLength", dgv.b.g, dgv.d.a(65536));
   public static final dgv.e<dgv.d> z = a("maxCommandForkCount", dgv.b.g, dgv.d.a(65536));
   public static final dgv.e<dgv.d> A = a("commandModificationBlockLimit", dgv.b.g, dgv.d.a(32768));
   public static final dgv.e<dgv.a> B = a("announceAdvancements", dgv.b.f, dgv.a.a(true));
   public static final dgv.e<dgv.a> C = a("disableRaids", dgv.b.b, dgv.a.a(false));
   public static final dgv.e<dgv.a> D = a("doInsomnia", dgv.b.c, dgv.a.a(true));
   public static final dgv.e<dgv.a> E = a("doImmediateRespawn", dgv.b.a, dgv.a.a(false, ($$0, $$1) -> {
      for (are $$2 : $$0.ag().t()) {
         $$2.f.b(new acs(acs.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dgv.e<dgv.d> F = a("playersNetherPortalDefaultDelay", dgv.b.a, dgv.d.a(80));
   public static final dgv.e<dgv.d> G = a("playersNetherPortalCreativeDelay", dgv.b.a, dgv.d.a(0));
   public static final dgv.e<dgv.a> H = a("drowningDamage", dgv.b.a, dgv.a.a(true));
   public static final dgv.e<dgv.a> I = a("fallDamage", dgv.b.a, dgv.a.a(true));
   public static final dgv.e<dgv.a> J = a("fireDamage", dgv.b.a, dgv.a.a(true));
   public static final dgv.e<dgv.a> K = a("freezeDamage", dgv.b.a, dgv.a.a(true));
   public static final dgv.e<dgv.a> L = a("doPatrolSpawning", dgv.b.c, dgv.a.a(true));
   public static final dgv.e<dgv.a> M = a("doTraderSpawning", dgv.b.c, dgv.a.a(true));
   public static final dgv.e<dgv.a> N = a("doWardenSpawning", dgv.b.c, dgv.a.a(true));
   public static final dgv.e<dgv.a> O = a("forgiveDeadPlayers", dgv.b.b, dgv.a.a(true));
   public static final dgv.e<dgv.a> P = a("universalAnger", dgv.b.b, dgv.a.a(false));
   public static final dgv.e<dgv.d> Q = a("playersSleepingPercentage", dgv.b.a, dgv.d.a(100));
   public static final dgv.e<dgv.a> R = a("blockExplosionDropDecay", dgv.b.d, dgv.a.a(true));
   public static final dgv.e<dgv.a> S = a("mobExplosionDropDecay", dgv.b.d, dgv.a.a(true));
   public static final dgv.e<dgv.a> T = a("tntExplosionDropDecay", dgv.b.d, dgv.a.a(false));
   public static final dgv.e<dgv.d> U = a("snowAccumulationHeight", dgv.b.e, dgv.d.a(1));
   public static final dgv.e<dgv.a> V = a("waterSourceConversion", dgv.b.e, dgv.a.a(true));
   public static final dgv.e<dgv.a> W = a("lavaSourceConversion", dgv.b.e, dgv.a.a(false));
   public static final dgv.e<dgv.a> X = a("globalSoundEvents", dgv.b.g, dgv.a.a(true));
   public static final dgv.e<dgv.a> Y = a("doVinesSpread", dgv.b.e, dgv.a.a(true));
   public static final dgv.e<dgv.a> Z = a("enderPearlsVanishOnDeath", dgv.b.a, dgv.a.a(true));
   public static final dgv.e<dgv.d> aa = a("minecartMaxSpeed", dgv.b.g, dgv.d.a(8, 1, 1000, csn.a(csp.d), ($$0, $$1) -> {
   }));
   public static final dgv.e<dgv.d> ab = a("spawnChunkRadius", dgv.b.g, dgv.d.a(2, 0, 32, csn.a(), ($$0, $$1) -> {
      ard $$2 = $$0.J();
      $$2.a($$2.aa(), $$2.ab());
   }));
   private final Map<dgv.e<?>, dgv.g<?>> ae;
   private final csn af;

   private static <T extends dgv.g<T>> dgv.e<T> a(String $$0, dgv.b $$1, dgv.f<T> $$2) {
      dgv.e<T> $$3 = new dgv.e<>($$0, $$1);
      dgv.f<?> $$4 = ad.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dgv(csn $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dgv(csn $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dgv.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dgv.e<?>, dgv.f<?>>> b(csn $$0) {
      return ad.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private dgv(Map<dgv.e<?>, dgv.g<?>> $$0, csn $$1) {
      this.ae = $$0;
      this.af = $$1;
   }

   public <T extends dgv.g<T>> T a(dgv.e<T> $$0) {
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

   public dgv a(csn $$0) {
      return new dgv(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ae.containsKey($$0x.getKey()) ? this.ae.get($$0x.getKey()) : ((dgv.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dgv.c $$0) {
      ad.forEach(($$1, $$2) -> this.a($$0, (dgv.e<?>)$$1, (dgv.f<?>)$$2));
   }

   private <T extends dgv.g<T>> void a(dgv.c $$0, dgv.e<?> $$1, dgv.f<?> $$2) {
      if ($$2.e.a(this.af)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dgv $$0, @Nullable MinecraftServer $$1) {
      $$0.ae.keySet().forEach($$2 -> this.a((dgv.e<?>)$$2, $$0, $$1));
   }

   private <T extends dgv.g<T>> void a(dgv.e<T> $$0, dgv $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dgv.e<dgv.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dgv.e<dgv.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dgv.g<dgv.a> {
      private boolean b;

      static dgv.f<dgv.a> a(boolean $$0, BiConsumer<MinecraftServer, dgv.a> $$1) {
         return new dgv.f<>(BoolArgumentType::bool, $$1x -> new dgv.a($$1x, $$0), $$1, dgv.c::b, csn.a());
      }

      static dgv.f<dgv.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dgv.f<dgv.a> $$0, boolean $$1) {
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

      protected dgv.a d() {
         return this;
      }

      protected dgv.a e() {
         return new dgv.a(this.a, this.b);
      }

      public void a(dgv.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dgv.g<T>> void a(dgv.e<T> $$0, dgv.f<T> $$1) {
      }

      default void b(dgv.e<dgv.a> $$0, dgv.f<dgv.a> $$1) {
      }

      default void c(dgv.e<dgv.d> $$0, dgv.f<dgv.d> $$1) {
      }
   }

   public static class d extends dgv.g<dgv.d> {
      private int b;

      private static dgv.f<dgv.d> a(int $$0, BiConsumer<MinecraftServer, dgv.d> $$1) {
         return new dgv.f<>(IntegerArgumentType::integer, $$1x -> new dgv.d($$1x, $$0), $$1, dgv.c::c, csn.a());
      }

      static dgv.f<dgv.d> a(int $$0, int $$1, int $$2, csn $$3, BiConsumer<MinecraftServer, dgv.d> $$4) {
         return new dgv.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dgv.d($$1x, $$0), $$4, dgv.c::c, $$3);
      }

      static dgv.f<dgv.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dgv.f<dgv.d> $$0, int $$1) {
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
               dgv.ac.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dgv.d d() {
         return this;
      }

      protected dgv.d e() {
         return new dgv.d(this.a, this.b);
      }

      public void a(dgv.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dgv.g<T>> {
      final String a;
      private final dgv.b b;

      public e(String $$0, dgv.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dgv.e && ((dgv.e)$$0).a.equals(this.a);
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

      public dgv.b c() {
         return this.b;
      }
   }

   public static class f<T extends dgv.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dgv.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dgv.h<T> d;
      final csn e;

      f(Supplier<ArgumentType<?>> $$0, Function<dgv.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dgv.h<T> $$3, csn $$4) {
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

      public void a(dgv.c $$0, dgv.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public csn b() {
         return this.e;
      }
   }

   public abstract static class g<T extends dgv.g<T>> {
      protected final dgv.f<T> a;

      public g(dgv.f<T> $$0) {
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

   interface h<T extends dgv.g<T>> {
      void call(dgv.c var1, dgv.e<T> var2, dgv.f<T> var3);
   }
}
