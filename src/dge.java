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

public class dge {
   public static final int a = 3;
   static final Logger ac = LogUtils.getLogger();
   private static final Map<dge.e<?>, dge.f<?>> ad = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dge.e<dge.a> b = a("doFireTick", dge.b.e, dge.a.a(true));
   public static final dge.e<dge.a> c = a("mobGriefing", dge.b.b, dge.a.a(true));
   public static final dge.e<dge.a> d = a("keepInventory", dge.b.a, dge.a.a(false));
   public static final dge.e<dge.a> e = a("doMobSpawning", dge.b.c, dge.a.a(true));
   public static final dge.e<dge.a> f = a("doMobLoot", dge.b.d, dge.a.a(true));
   public static final dge.e<dge.a> g = a("projectilesCanBreakBlocks", dge.b.d, dge.a.a(true));
   public static final dge.e<dge.a> h = a("doTileDrops", dge.b.d, dge.a.a(true));
   public static final dge.e<dge.a> i = a("doEntityDrops", dge.b.d, dge.a.a(true));
   public static final dge.e<dge.a> j = a("commandBlockOutput", dge.b.f, dge.a.a(true));
   public static final dge.e<dge.a> k = a("naturalRegeneration", dge.b.a, dge.a.a(true));
   public static final dge.e<dge.a> l = a("doDaylightCycle", dge.b.e, dge.a.a(true));
   public static final dge.e<dge.a> m = a("logAdminCommands", dge.b.f, dge.a.a(true));
   public static final dge.e<dge.a> n = a("showDeathMessages", dge.b.f, dge.a.a(true));
   public static final dge.e<dge.d> o = a("randomTickSpeed", dge.b.e, dge.d.a(3));
   public static final dge.e<dge.a> p = a("sendCommandFeedback", dge.b.f, dge.a.a(true));
   public static final dge.e<dge.a> q = a("reducedDebugInfo", dge.b.g, dge.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (ard $$3 : $$0.ag().t()) {
         $$3.f.b(new aco($$3, $$2));
      }
   }));
   public static final dge.e<dge.a> r = a("spectatorsGenerateChunks", dge.b.a, dge.a.a(true));
   public static final dge.e<dge.d> s = a("spawnRadius", dge.b.a, dge.d.a(10));
   public static final dge.e<dge.a> t = a("disablePlayerMovementCheck", dge.b.a, dge.a.a(false));
   public static final dge.e<dge.a> u = a("disableElytraMovementCheck", dge.b.a, dge.a.a(false));
   public static final dge.e<dge.d> v = a("maxEntityCramming", dge.b.b, dge.d.a(24));
   public static final dge.e<dge.a> w = a("doWeatherCycle", dge.b.e, dge.a.a(true));
   public static final dge.e<dge.a> x = a("doLimitedCrafting", dge.b.a, dge.a.a(false, ($$0, $$1) -> {
      for (ard $$2 : $$0.ag().t()) {
         $$2.f.b(new acs(acs.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dge.e<dge.d> y = a("maxCommandChainLength", dge.b.g, dge.d.a(65536));
   public static final dge.e<dge.d> z = a("maxCommandForkCount", dge.b.g, dge.d.a(65536));
   public static final dge.e<dge.d> A = a("commandModificationBlockLimit", dge.b.g, dge.d.a(32768));
   public static final dge.e<dge.a> B = a("announceAdvancements", dge.b.f, dge.a.a(true));
   public static final dge.e<dge.a> C = a("disableRaids", dge.b.b, dge.a.a(false));
   public static final dge.e<dge.a> D = a("doInsomnia", dge.b.c, dge.a.a(true));
   public static final dge.e<dge.a> E = a("doImmediateRespawn", dge.b.a, dge.a.a(false, ($$0, $$1) -> {
      for (ard $$2 : $$0.ag().t()) {
         $$2.f.b(new acs(acs.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dge.e<dge.d> F = a("playersNetherPortalDefaultDelay", dge.b.a, dge.d.a(80));
   public static final dge.e<dge.d> G = a("playersNetherPortalCreativeDelay", dge.b.a, dge.d.a(0));
   public static final dge.e<dge.a> H = a("drowningDamage", dge.b.a, dge.a.a(true));
   public static final dge.e<dge.a> I = a("fallDamage", dge.b.a, dge.a.a(true));
   public static final dge.e<dge.a> J = a("fireDamage", dge.b.a, dge.a.a(true));
   public static final dge.e<dge.a> K = a("freezeDamage", dge.b.a, dge.a.a(true));
   public static final dge.e<dge.a> L = a("doPatrolSpawning", dge.b.c, dge.a.a(true));
   public static final dge.e<dge.a> M = a("doTraderSpawning", dge.b.c, dge.a.a(true));
   public static final dge.e<dge.a> N = a("doWardenSpawning", dge.b.c, dge.a.a(true));
   public static final dge.e<dge.a> O = a("forgiveDeadPlayers", dge.b.b, dge.a.a(true));
   public static final dge.e<dge.a> P = a("universalAnger", dge.b.b, dge.a.a(false));
   public static final dge.e<dge.d> Q = a("playersSleepingPercentage", dge.b.a, dge.d.a(100));
   public static final dge.e<dge.a> R = a("blockExplosionDropDecay", dge.b.d, dge.a.a(true));
   public static final dge.e<dge.a> S = a("mobExplosionDropDecay", dge.b.d, dge.a.a(true));
   public static final dge.e<dge.a> T = a("tntExplosionDropDecay", dge.b.d, dge.a.a(false));
   public static final dge.e<dge.d> U = a("snowAccumulationHeight", dge.b.e, dge.d.a(1));
   public static final dge.e<dge.a> V = a("waterSourceConversion", dge.b.e, dge.a.a(true));
   public static final dge.e<dge.a> W = a("lavaSourceConversion", dge.b.e, dge.a.a(false));
   public static final dge.e<dge.a> X = a("globalSoundEvents", dge.b.g, dge.a.a(true));
   public static final dge.e<dge.a> Y = a("doVinesSpread", dge.b.e, dge.a.a(true));
   public static final dge.e<dge.a> Z = a("enderPearlsVanishOnDeath", dge.b.a, dge.a.a(true));
   public static final dge.e<dge.d> aa = a("minecartMaxSpeed", dge.b.g, dge.d.a(8, 1, 1000, crt.a(crv.d), ($$0, $$1) -> {
   }));
   public static final dge.e<dge.d> ab = a("spawnChunkRadius", dge.b.g, dge.d.a(2, 0, 32, crt.a(), ($$0, $$1) -> {
      arc $$2 = $$0.J();
      $$2.a($$2.Z(), $$2.aa());
   }));
   private final Map<dge.e<?>, dge.g<?>> ae;
   private final crt af;

   private static <T extends dge.g<T>> dge.e<T> a(String $$0, dge.b $$1, dge.f<T> $$2) {
      dge.e<T> $$3 = new dge.e<>($$0, $$1);
      dge.f<?> $$4 = ad.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dge(crt $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dge(crt $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dge.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dge.e<?>, dge.f<?>>> b(crt $$0) {
      return ad.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private dge(Map<dge.e<?>, dge.g<?>> $$0, crt $$1) {
      this.ae = $$0;
      this.af = $$1;
   }

   public <T extends dge.g<T>> T a(dge.e<T> $$0) {
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

   public dge a(crt $$0) {
      return new dge(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ae.containsKey($$0x.getKey()) ? this.ae.get($$0x.getKey()) : ((dge.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dge.c $$0) {
      ad.forEach(($$1, $$2) -> this.a($$0, (dge.e<?>)$$1, (dge.f<?>)$$2));
   }

   private <T extends dge.g<T>> void a(dge.c $$0, dge.e<?> $$1, dge.f<?> $$2) {
      if ($$2.e.a(this.af)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dge $$0, @Nullable MinecraftServer $$1) {
      $$0.ae.keySet().forEach($$2 -> this.a((dge.e<?>)$$2, $$0, $$1));
   }

   private <T extends dge.g<T>> void a(dge.e<T> $$0, dge $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dge.e<dge.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dge.e<dge.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dge.g<dge.a> {
      private boolean b;

      static dge.f<dge.a> a(boolean $$0, BiConsumer<MinecraftServer, dge.a> $$1) {
         return new dge.f<>(BoolArgumentType::bool, $$1x -> new dge.a($$1x, $$0), $$1, dge.c::b, crt.a());
      }

      static dge.f<dge.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dge.f<dge.a> $$0, boolean $$1) {
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

      protected dge.a d() {
         return this;
      }

      protected dge.a e() {
         return new dge.a(this.a, this.b);
      }

      public void a(dge.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dge.g<T>> void a(dge.e<T> $$0, dge.f<T> $$1) {
      }

      default void b(dge.e<dge.a> $$0, dge.f<dge.a> $$1) {
      }

      default void c(dge.e<dge.d> $$0, dge.f<dge.d> $$1) {
      }
   }

   public static class d extends dge.g<dge.d> {
      private int b;

      private static dge.f<dge.d> a(int $$0, BiConsumer<MinecraftServer, dge.d> $$1) {
         return new dge.f<>(IntegerArgumentType::integer, $$1x -> new dge.d($$1x, $$0), $$1, dge.c::c, crt.a());
      }

      static dge.f<dge.d> a(int $$0, int $$1, int $$2, crt $$3, BiConsumer<MinecraftServer, dge.d> $$4) {
         return new dge.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dge.d($$1x, $$0), $$4, dge.c::c, $$3);
      }

      static dge.f<dge.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dge.f<dge.d> $$0, int $$1) {
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
               dge.ac.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dge.d d() {
         return this;
      }

      protected dge.d e() {
         return new dge.d(this.a, this.b);
      }

      public void a(dge.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dge.g<T>> {
      final String a;
      private final dge.b b;

      public e(String $$0, dge.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dge.e && ((dge.e)$$0).a.equals(this.a);
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

      public dge.b c() {
         return this.b;
      }
   }

   public static class f<T extends dge.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dge.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dge.h<T> d;
      final crt e;

      f(Supplier<ArgumentType<?>> $$0, Function<dge.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dge.h<T> $$3, crt $$4) {
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

      public void a(dge.c $$0, dge.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public crt b() {
         return this.e;
      }
   }

   public abstract static class g<T extends dge.g<T>> {
      protected final dge.f<T> a;

      public g(dge.f<T> $$0) {
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

   interface h<T extends dge.g<T>> {
      void call(dge.c var1, dge.e<T> var2, dge.f<T> var3);
   }
}
