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

public class dex {
   public static final int a = 3;
   static final Logger ab = LogUtils.getLogger();
   private static final Map<dex.e<?>, dex.f<?>> ac = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dex.e<dex.a> b = a("doFireTick", dex.b.e, dex.a.a(true));
   public static final dex.e<dex.a> c = a("mobGriefing", dex.b.b, dex.a.a(true));
   public static final dex.e<dex.a> d = a("keepInventory", dex.b.a, dex.a.a(false));
   public static final dex.e<dex.a> e = a("doMobSpawning", dex.b.c, dex.a.a(true));
   public static final dex.e<dex.a> f = a("doMobLoot", dex.b.d, dex.a.a(true));
   public static final dex.e<dex.a> g = a("projectilesCanBreakBlocks", dex.b.d, dex.a.a(true));
   public static final dex.e<dex.a> h = a("doTileDrops", dex.b.d, dex.a.a(true));
   public static final dex.e<dex.a> i = a("doEntityDrops", dex.b.d, dex.a.a(true));
   public static final dex.e<dex.a> j = a("commandBlockOutput", dex.b.f, dex.a.a(true));
   public static final dex.e<dex.a> k = a("naturalRegeneration", dex.b.a, dex.a.a(true));
   public static final dex.e<dex.a> l = a("doDaylightCycle", dex.b.e, dex.a.a(true));
   public static final dex.e<dex.a> m = a("logAdminCommands", dex.b.f, dex.a.a(true));
   public static final dex.e<dex.a> n = a("showDeathMessages", dex.b.f, dex.a.a(true));
   public static final dex.e<dex.d> o = a("randomTickSpeed", dex.b.e, dex.d.a(3));
   public static final dex.e<dex.a> p = a("sendCommandFeedback", dex.b.f, dex.a.a(true));
   public static final dex.e<dex.a> q = a("reducedDebugInfo", dex.b.g, dex.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aro $$3 : $$0.ag().t()) {
         $$3.g.b(new adi($$3, $$2));
      }
   }));
   public static final dex.e<dex.a> r = a("spectatorsGenerateChunks", dex.b.a, dex.a.a(true));
   public static final dex.e<dex.d> s = a("spawnRadius", dex.b.a, dex.d.a(10));
   public static final dex.e<dex.a> t = a("disableElytraMovementCheck", dex.b.a, dex.a.a(false));
   public static final dex.e<dex.d> u = a("maxEntityCramming", dex.b.b, dex.d.a(24));
   public static final dex.e<dex.a> v = a("doWeatherCycle", dex.b.e, dex.a.a(true));
   public static final dex.e<dex.a> w = a("doLimitedCrafting", dex.b.a, dex.a.a(false, ($$0, $$1) -> {
      for (aro $$2 : $$0.ag().t()) {
         $$2.g.b(new adl(adl.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dex.e<dex.d> x = a("maxCommandChainLength", dex.b.g, dex.d.a(65536));
   public static final dex.e<dex.d> y = a("maxCommandForkCount", dex.b.g, dex.d.a(65536));
   public static final dex.e<dex.d> z = a("commandModificationBlockLimit", dex.b.g, dex.d.a(32768));
   public static final dex.e<dex.a> A = a("announceAdvancements", dex.b.f, dex.a.a(true));
   public static final dex.e<dex.a> B = a("disableRaids", dex.b.b, dex.a.a(false));
   public static final dex.e<dex.a> C = a("doInsomnia", dex.b.c, dex.a.a(true));
   public static final dex.e<dex.a> D = a("doImmediateRespawn", dex.b.a, dex.a.a(false, ($$0, $$1) -> {
      for (aro $$2 : $$0.ag().t()) {
         $$2.g.b(new adl(adl.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dex.e<dex.d> E = a("playersNetherPortalDefaultDelay", dex.b.a, dex.d.a(80));
   public static final dex.e<dex.d> F = a("playersNetherPortalCreativeDelay", dex.b.a, dex.d.a(0));
   public static final dex.e<dex.a> G = a("drowningDamage", dex.b.a, dex.a.a(true));
   public static final dex.e<dex.a> H = a("fallDamage", dex.b.a, dex.a.a(true));
   public static final dex.e<dex.a> I = a("fireDamage", dex.b.a, dex.a.a(true));
   public static final dex.e<dex.a> J = a("freezeDamage", dex.b.a, dex.a.a(true));
   public static final dex.e<dex.a> K = a("doPatrolSpawning", dex.b.c, dex.a.a(true));
   public static final dex.e<dex.a> L = a("doTraderSpawning", dex.b.c, dex.a.a(true));
   public static final dex.e<dex.a> M = a("doWardenSpawning", dex.b.c, dex.a.a(true));
   public static final dex.e<dex.a> N = a("forgiveDeadPlayers", dex.b.b, dex.a.a(true));
   public static final dex.e<dex.a> O = a("universalAnger", dex.b.b, dex.a.a(false));
   public static final dex.e<dex.d> P = a("playersSleepingPercentage", dex.b.a, dex.d.a(100));
   public static final dex.e<dex.a> Q = a("blockExplosionDropDecay", dex.b.d, dex.a.a(true));
   public static final dex.e<dex.a> R = a("mobExplosionDropDecay", dex.b.d, dex.a.a(true));
   public static final dex.e<dex.a> S = a("tntExplosionDropDecay", dex.b.d, dex.a.a(false));
   public static final dex.e<dex.d> T = a("snowAccumulationHeight", dex.b.e, dex.d.a(1));
   public static final dex.e<dex.a> U = a("waterSourceConversion", dex.b.e, dex.a.a(true));
   public static final dex.e<dex.a> V = a("lavaSourceConversion", dex.b.e, dex.a.a(false));
   public static final dex.e<dex.a> W = a("globalSoundEvents", dex.b.g, dex.a.a(true));
   public static final dex.e<dex.a> X = a("doVinesSpread", dex.b.e, dex.a.a(true));
   public static final dex.e<dex.a> Y = a("enderPearlsVanishOnDeath", dex.b.a, dex.a.a(true));
   public static final dex.e<dex.d> Z = a("minecartMaxSpeed", dex.b.g, dex.d.a(8, 1, 1000, crf.a(crh.e), ($$0, $$1) -> {
   }));
   public static final dex.e<dex.d> aa = a("spawnChunkRadius", dex.b.g, dex.d.a(2, 0, 32, crf.a(), ($$0, $$1) -> {
      arn $$2 = $$0.J();
      $$2.a($$2.W(), $$2.X());
   }));
   private final Map<dex.e<?>, dex.g<?>> ad;
   private final crf ae;

   private static <T extends dex.g<T>> dex.e<T> a(String $$0, dex.b $$1, dex.f<T> $$2) {
      dex.e<T> $$3 = new dex.e<>($$0, $$1);
      dex.f<?> $$4 = ac.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dex(crf $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dex(crf $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dex.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dex.e<?>, dex.f<?>>> b(crf $$0) {
      return ac.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private dex(Map<dex.e<?>, dex.g<?>> $$0, crf $$1) {
      this.ad = $$0;
      this.ae = $$1;
   }

   public <T extends dex.g<T>> T a(dex.e<T> $$0) {
      T $$1 = (T)this.ad.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public uk a() {
      uk $$0 = new uk();
      this.ad.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ad.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dex a(crf $$0) {
      return new dex(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ad.containsKey($$0x.getKey()) ? this.ad.get($$0x.getKey()) : ((dex.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dex.c $$0) {
      ac.forEach(($$1, $$2) -> this.a($$0, (dex.e<?>)$$1, (dex.f<?>)$$2));
   }

   private <T extends dex.g<T>> void a(dex.c $$0, dex.e<?> $$1, dex.f<?> $$2) {
      if ($$2.e.a(this.ae)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dex $$0, @Nullable MinecraftServer $$1) {
      $$0.ad.keySet().forEach($$2 -> this.a((dex.e<?>)$$2, $$0, $$1));
   }

   private <T extends dex.g<T>> void a(dex.e<T> $$0, dex $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dex.e<dex.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dex.e<dex.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dex.g<dex.a> {
      private boolean b;

      static dex.f<dex.a> a(boolean $$0, BiConsumer<MinecraftServer, dex.a> $$1) {
         return new dex.f<>(BoolArgumentType::bool, $$1x -> new dex.a($$1x, $$0), $$1, dex.c::b, crf.a());
      }

      static dex.f<dex.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dex.f<dex.a> $$0, boolean $$1) {
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

      protected dex.a d() {
         return this;
      }

      protected dex.a e() {
         return new dex.a(this.a, this.b);
      }

      public void a(dex.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dex.g<T>> void a(dex.e<T> $$0, dex.f<T> $$1) {
      }

      default void b(dex.e<dex.a> $$0, dex.f<dex.a> $$1) {
      }

      default void c(dex.e<dex.d> $$0, dex.f<dex.d> $$1) {
      }
   }

   public static class d extends dex.g<dex.d> {
      private int b;

      private static dex.f<dex.d> a(int $$0, BiConsumer<MinecraftServer, dex.d> $$1) {
         return new dex.f<>(IntegerArgumentType::integer, $$1x -> new dex.d($$1x, $$0), $$1, dex.c::c, crf.a());
      }

      static dex.f<dex.d> a(int $$0, int $$1, int $$2, crf $$3, BiConsumer<MinecraftServer, dex.d> $$4) {
         return new dex.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dex.d($$1x, $$0), $$4, dex.c::c, $$3);
      }

      static dex.f<dex.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dex.f<dex.d> $$0, int $$1) {
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
               dex.ab.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dex.d d() {
         return this;
      }

      protected dex.d e() {
         return new dex.d(this.a, this.b);
      }

      public void a(dex.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dex.g<T>> {
      final String a;
      private final dex.b b;

      public e(String $$0, dex.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dex.e && ((dex.e)$$0).a.equals(this.a);
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

      public dex.b c() {
         return this.b;
      }
   }

   public static class f<T extends dex.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dex.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dex.h<T> d;
      final crf e;

      f(Supplier<ArgumentType<?>> $$0, Function<dex.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dex.h<T> $$3, crf $$4) {
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

      public void a(dex.c $$0, dex.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public crf b() {
         return this.e;
      }
   }

   public abstract static class g<T extends dex.g<T>> {
      protected final dex.f<T> a;

      public g(dex.f<T> $$0) {
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

   interface h<T extends dex.g<T>> {
      void call(dex.c var1, dex.e<T> var2, dex.f<T> var3);
   }
}
