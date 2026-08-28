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

public class dhe {
   public static final int a = 3;
   static final Logger ac = LogUtils.getLogger();
   private static final Map<dhe.e<?>, dhe.f<?>> ad = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dhe.e<dhe.a> b = a("doFireTick", dhe.b.e, dhe.a.a(true));
   public static final dhe.e<dhe.a> c = a("mobGriefing", dhe.b.b, dhe.a.a(true));
   public static final dhe.e<dhe.a> d = a("keepInventory", dhe.b.a, dhe.a.a(false));
   public static final dhe.e<dhe.a> e = a("doMobSpawning", dhe.b.c, dhe.a.a(true));
   public static final dhe.e<dhe.a> f = a("doMobLoot", dhe.b.d, dhe.a.a(true));
   public static final dhe.e<dhe.a> g = a("projectilesCanBreakBlocks", dhe.b.d, dhe.a.a(true));
   public static final dhe.e<dhe.a> h = a("doTileDrops", dhe.b.d, dhe.a.a(true));
   public static final dhe.e<dhe.a> i = a("doEntityDrops", dhe.b.d, dhe.a.a(true));
   public static final dhe.e<dhe.a> j = a("commandBlockOutput", dhe.b.f, dhe.a.a(true));
   public static final dhe.e<dhe.a> k = a("naturalRegeneration", dhe.b.a, dhe.a.a(true));
   public static final dhe.e<dhe.a> l = a("doDaylightCycle", dhe.b.e, dhe.a.a(true));
   public static final dhe.e<dhe.a> m = a("logAdminCommands", dhe.b.f, dhe.a.a(true));
   public static final dhe.e<dhe.a> n = a("showDeathMessages", dhe.b.f, dhe.a.a(true));
   public static final dhe.e<dhe.d> o = a("randomTickSpeed", dhe.b.e, dhe.d.a(3));
   public static final dhe.e<dhe.a> p = a("sendCommandFeedback", dhe.b.f, dhe.a.a(true));
   public static final dhe.e<dhe.a> q = a("reducedDebugInfo", dhe.b.g, dhe.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (asi $$3 : $$0.ag().t()) {
         $$3.f.b(new adv($$3, $$2));
      }
   }));
   public static final dhe.e<dhe.a> r = a("spectatorsGenerateChunks", dhe.b.a, dhe.a.a(true));
   public static final dhe.e<dhe.d> s = a("spawnRadius", dhe.b.a, dhe.d.a(10));
   public static final dhe.e<dhe.a> t = a("disablePlayerMovementCheck", dhe.b.a, dhe.a.a(false));
   public static final dhe.e<dhe.a> u = a("disableElytraMovementCheck", dhe.b.a, dhe.a.a(false));
   public static final dhe.e<dhe.d> v = a("maxEntityCramming", dhe.b.b, dhe.d.a(24));
   public static final dhe.e<dhe.a> w = a("doWeatherCycle", dhe.b.e, dhe.a.a(true));
   public static final dhe.e<dhe.a> x = a("doLimitedCrafting", dhe.b.a, dhe.a.a(false, ($$0, $$1) -> {
      for (asi $$2 : $$0.ag().t()) {
         $$2.f.b(new adz(adz.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dhe.e<dhe.d> y = a("maxCommandChainLength", dhe.b.g, dhe.d.a(65536));
   public static final dhe.e<dhe.d> z = a("maxCommandForkCount", dhe.b.g, dhe.d.a(65536));
   public static final dhe.e<dhe.d> A = a("commandModificationBlockLimit", dhe.b.g, dhe.d.a(32768));
   public static final dhe.e<dhe.a> B = a("announceAdvancements", dhe.b.f, dhe.a.a(true));
   public static final dhe.e<dhe.a> C = a("disableRaids", dhe.b.b, dhe.a.a(false));
   public static final dhe.e<dhe.a> D = a("doInsomnia", dhe.b.c, dhe.a.a(true));
   public static final dhe.e<dhe.a> E = a("doImmediateRespawn", dhe.b.a, dhe.a.a(false, ($$0, $$1) -> {
      for (asi $$2 : $$0.ag().t()) {
         $$2.f.b(new adz(adz.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dhe.e<dhe.d> F = a("playersNetherPortalDefaultDelay", dhe.b.a, dhe.d.a(80));
   public static final dhe.e<dhe.d> G = a("playersNetherPortalCreativeDelay", dhe.b.a, dhe.d.a(0));
   public static final dhe.e<dhe.a> H = a("drowningDamage", dhe.b.a, dhe.a.a(true));
   public static final dhe.e<dhe.a> I = a("fallDamage", dhe.b.a, dhe.a.a(true));
   public static final dhe.e<dhe.a> J = a("fireDamage", dhe.b.a, dhe.a.a(true));
   public static final dhe.e<dhe.a> K = a("freezeDamage", dhe.b.a, dhe.a.a(true));
   public static final dhe.e<dhe.a> L = a("doPatrolSpawning", dhe.b.c, dhe.a.a(true));
   public static final dhe.e<dhe.a> M = a("doTraderSpawning", dhe.b.c, dhe.a.a(true));
   public static final dhe.e<dhe.a> N = a("doWardenSpawning", dhe.b.c, dhe.a.a(true));
   public static final dhe.e<dhe.a> O = a("forgiveDeadPlayers", dhe.b.b, dhe.a.a(true));
   public static final dhe.e<dhe.a> P = a("universalAnger", dhe.b.b, dhe.a.a(false));
   public static final dhe.e<dhe.d> Q = a("playersSleepingPercentage", dhe.b.a, dhe.d.a(100));
   public static final dhe.e<dhe.a> R = a("blockExplosionDropDecay", dhe.b.d, dhe.a.a(true));
   public static final dhe.e<dhe.a> S = a("mobExplosionDropDecay", dhe.b.d, dhe.a.a(true));
   public static final dhe.e<dhe.a> T = a("tntExplosionDropDecay", dhe.b.d, dhe.a.a(false));
   public static final dhe.e<dhe.d> U = a("snowAccumulationHeight", dhe.b.e, dhe.d.a(1));
   public static final dhe.e<dhe.a> V = a("waterSourceConversion", dhe.b.e, dhe.a.a(true));
   public static final dhe.e<dhe.a> W = a("lavaSourceConversion", dhe.b.e, dhe.a.a(false));
   public static final dhe.e<dhe.a> X = a("globalSoundEvents", dhe.b.g, dhe.a.a(true));
   public static final dhe.e<dhe.a> Y = a("doVinesSpread", dhe.b.e, dhe.a.a(true));
   public static final dhe.e<dhe.a> Z = a("enderPearlsVanishOnDeath", dhe.b.a, dhe.a.a(true));
   public static final dhe.e<dhe.d> aa = a("minecartMaxSpeed", dhe.b.g, dhe.d.a(8, 1, 1000, cst.a(csv.e), ($$0, $$1) -> {
   }));
   public static final dhe.e<dhe.d> ab = a("spawnChunkRadius", dhe.b.g, dhe.d.a(2, 0, 32, cst.a(), ($$0, $$1) -> {
      ash $$2 = $$0.J();
      $$2.a($$2.Y(), $$2.Z());
   }));
   private final Map<dhe.e<?>, dhe.g<?>> ae;
   private final cst af;

   private static <T extends dhe.g<T>> dhe.e<T> a(String $$0, dhe.b $$1, dhe.f<T> $$2) {
      dhe.e<T> $$3 = new dhe.e<>($$0, $$1);
      dhe.f<?> $$4 = ad.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dhe(cst $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dhe(cst $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dhe.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dhe.e<?>, dhe.f<?>>> b(cst $$0) {
      return ad.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private dhe(Map<dhe.e<?>, dhe.g<?>> $$0, cst $$1) {
      this.ae = $$0;
      this.af = $$1;
   }

   public <T extends dhe.g<T>> T a(dhe.e<T> $$0) {
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

   public dhe a(cst $$0) {
      return new dhe(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ae.containsKey($$0x.getKey()) ? this.ae.get($$0x.getKey()) : ((dhe.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dhe.c $$0) {
      ad.forEach(($$1, $$2) -> this.a($$0, (dhe.e<?>)$$1, (dhe.f<?>)$$2));
   }

   private <T extends dhe.g<T>> void a(dhe.c $$0, dhe.e<?> $$1, dhe.f<?> $$2) {
      if ($$2.e.a(this.af)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dhe $$0, @Nullable MinecraftServer $$1) {
      $$0.ae.keySet().forEach($$2 -> this.a((dhe.e<?>)$$2, $$0, $$1));
   }

   private <T extends dhe.g<T>> void a(dhe.e<T> $$0, dhe $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dhe.e<dhe.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dhe.e<dhe.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dhe.g<dhe.a> {
      private boolean b;

      static dhe.f<dhe.a> a(boolean $$0, BiConsumer<MinecraftServer, dhe.a> $$1) {
         return new dhe.f<>(BoolArgumentType::bool, $$1x -> new dhe.a($$1x, $$0), $$1, dhe.c::b, cst.a());
      }

      static dhe.f<dhe.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dhe.f<dhe.a> $$0, boolean $$1) {
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

      protected dhe.a d() {
         return this;
      }

      protected dhe.a e() {
         return new dhe.a(this.a, this.b);
      }

      public void a(dhe.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dhe.g<T>> void a(dhe.e<T> $$0, dhe.f<T> $$1) {
      }

      default void b(dhe.e<dhe.a> $$0, dhe.f<dhe.a> $$1) {
      }

      default void c(dhe.e<dhe.d> $$0, dhe.f<dhe.d> $$1) {
      }
   }

   public static class d extends dhe.g<dhe.d> {
      private int b;

      private static dhe.f<dhe.d> a(int $$0, BiConsumer<MinecraftServer, dhe.d> $$1) {
         return new dhe.f<>(IntegerArgumentType::integer, $$1x -> new dhe.d($$1x, $$0), $$1, dhe.c::c, cst.a());
      }

      static dhe.f<dhe.d> a(int $$0, int $$1, int $$2, cst $$3, BiConsumer<MinecraftServer, dhe.d> $$4) {
         return new dhe.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dhe.d($$1x, $$0), $$4, dhe.c::c, $$3);
      }

      static dhe.f<dhe.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dhe.f<dhe.d> $$0, int $$1) {
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
               dhe.ac.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dhe.d d() {
         return this;
      }

      protected dhe.d e() {
         return new dhe.d(this.a, this.b);
      }

      public void a(dhe.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dhe.g<T>> {
      final String a;
      private final dhe.b b;

      public e(String $$0, dhe.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dhe.e && ((dhe.e)$$0).a.equals(this.a);
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

      public dhe.b c() {
         return this.b;
      }
   }

   public static class f<T extends dhe.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dhe.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dhe.h<T> d;
      final cst e;

      f(Supplier<ArgumentType<?>> $$0, Function<dhe.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dhe.h<T> $$3, cst $$4) {
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

      public void a(dhe.c $$0, dhe.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cst b() {
         return this.e;
      }
   }

   public abstract static class g<T extends dhe.g<T>> {
      protected final dhe.f<T> a;

      public g(dhe.f<T> $$0) {
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

   interface h<T extends dhe.g<T>> {
      void call(dhe.c var1, dhe.e<T> var2, dhe.f<T> var3);
   }
}
