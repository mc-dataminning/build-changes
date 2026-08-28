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

public class dgc {
   public static final int a = 3;
   static final Logger ac = LogUtils.getLogger();
   private static final Map<dgc.e<?>, dgc.f<?>> ad = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dgc.e<dgc.a> b = a("doFireTick", dgc.b.e, dgc.a.a(true));
   public static final dgc.e<dgc.a> c = a("mobGriefing", dgc.b.b, dgc.a.a(true));
   public static final dgc.e<dgc.a> d = a("keepInventory", dgc.b.a, dgc.a.a(false));
   public static final dgc.e<dgc.a> e = a("doMobSpawning", dgc.b.c, dgc.a.a(true));
   public static final dgc.e<dgc.a> f = a("doMobLoot", dgc.b.d, dgc.a.a(true));
   public static final dgc.e<dgc.a> g = a("projectilesCanBreakBlocks", dgc.b.d, dgc.a.a(true));
   public static final dgc.e<dgc.a> h = a("doTileDrops", dgc.b.d, dgc.a.a(true));
   public static final dgc.e<dgc.a> i = a("doEntityDrops", dgc.b.d, dgc.a.a(true));
   public static final dgc.e<dgc.a> j = a("commandBlockOutput", dgc.b.f, dgc.a.a(true));
   public static final dgc.e<dgc.a> k = a("naturalRegeneration", dgc.b.a, dgc.a.a(true));
   public static final dgc.e<dgc.a> l = a("doDaylightCycle", dgc.b.e, dgc.a.a(true));
   public static final dgc.e<dgc.a> m = a("logAdminCommands", dgc.b.f, dgc.a.a(true));
   public static final dgc.e<dgc.a> n = a("showDeathMessages", dgc.b.f, dgc.a.a(true));
   public static final dgc.e<dgc.d> o = a("randomTickSpeed", dgc.b.e, dgc.d.a(3));
   public static final dgc.e<dgc.a> p = a("sendCommandFeedback", dgc.b.f, dgc.a.a(true));
   public static final dgc.e<dgc.a> q = a("reducedDebugInfo", dgc.b.g, dgc.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (ard $$3 : $$0.ag().t()) {
         $$3.f.b(new aco($$3, $$2));
      }
   }));
   public static final dgc.e<dgc.a> r = a("spectatorsGenerateChunks", dgc.b.a, dgc.a.a(true));
   public static final dgc.e<dgc.d> s = a("spawnRadius", dgc.b.a, dgc.d.a(10));
   public static final dgc.e<dgc.a> t = a("disablePlayerMovementCheck", dgc.b.a, dgc.a.a(false));
   public static final dgc.e<dgc.a> u = a("disableElytraMovementCheck", dgc.b.a, dgc.a.a(false));
   public static final dgc.e<dgc.d> v = a("maxEntityCramming", dgc.b.b, dgc.d.a(24));
   public static final dgc.e<dgc.a> w = a("doWeatherCycle", dgc.b.e, dgc.a.a(true));
   public static final dgc.e<dgc.a> x = a("doLimitedCrafting", dgc.b.a, dgc.a.a(false, ($$0, $$1) -> {
      for (ard $$2 : $$0.ag().t()) {
         $$2.f.b(new acs(acs.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dgc.e<dgc.d> y = a("maxCommandChainLength", dgc.b.g, dgc.d.a(65536));
   public static final dgc.e<dgc.d> z = a("maxCommandForkCount", dgc.b.g, dgc.d.a(65536));
   public static final dgc.e<dgc.d> A = a("commandModificationBlockLimit", dgc.b.g, dgc.d.a(32768));
   public static final dgc.e<dgc.a> B = a("announceAdvancements", dgc.b.f, dgc.a.a(true));
   public static final dgc.e<dgc.a> C = a("disableRaids", dgc.b.b, dgc.a.a(false));
   public static final dgc.e<dgc.a> D = a("doInsomnia", dgc.b.c, dgc.a.a(true));
   public static final dgc.e<dgc.a> E = a("doImmediateRespawn", dgc.b.a, dgc.a.a(false, ($$0, $$1) -> {
      for (ard $$2 : $$0.ag().t()) {
         $$2.f.b(new acs(acs.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dgc.e<dgc.d> F = a("playersNetherPortalDefaultDelay", dgc.b.a, dgc.d.a(80));
   public static final dgc.e<dgc.d> G = a("playersNetherPortalCreativeDelay", dgc.b.a, dgc.d.a(0));
   public static final dgc.e<dgc.a> H = a("drowningDamage", dgc.b.a, dgc.a.a(true));
   public static final dgc.e<dgc.a> I = a("fallDamage", dgc.b.a, dgc.a.a(true));
   public static final dgc.e<dgc.a> J = a("fireDamage", dgc.b.a, dgc.a.a(true));
   public static final dgc.e<dgc.a> K = a("freezeDamage", dgc.b.a, dgc.a.a(true));
   public static final dgc.e<dgc.a> L = a("doPatrolSpawning", dgc.b.c, dgc.a.a(true));
   public static final dgc.e<dgc.a> M = a("doTraderSpawning", dgc.b.c, dgc.a.a(true));
   public static final dgc.e<dgc.a> N = a("doWardenSpawning", dgc.b.c, dgc.a.a(true));
   public static final dgc.e<dgc.a> O = a("forgiveDeadPlayers", dgc.b.b, dgc.a.a(true));
   public static final dgc.e<dgc.a> P = a("universalAnger", dgc.b.b, dgc.a.a(false));
   public static final dgc.e<dgc.d> Q = a("playersSleepingPercentage", dgc.b.a, dgc.d.a(100));
   public static final dgc.e<dgc.a> R = a("blockExplosionDropDecay", dgc.b.d, dgc.a.a(true));
   public static final dgc.e<dgc.a> S = a("mobExplosionDropDecay", dgc.b.d, dgc.a.a(true));
   public static final dgc.e<dgc.a> T = a("tntExplosionDropDecay", dgc.b.d, dgc.a.a(false));
   public static final dgc.e<dgc.d> U = a("snowAccumulationHeight", dgc.b.e, dgc.d.a(1));
   public static final dgc.e<dgc.a> V = a("waterSourceConversion", dgc.b.e, dgc.a.a(true));
   public static final dgc.e<dgc.a> W = a("lavaSourceConversion", dgc.b.e, dgc.a.a(false));
   public static final dgc.e<dgc.a> X = a("globalSoundEvents", dgc.b.g, dgc.a.a(true));
   public static final dgc.e<dgc.a> Y = a("doVinesSpread", dgc.b.e, dgc.a.a(true));
   public static final dgc.e<dgc.a> Z = a("enderPearlsVanishOnDeath", dgc.b.a, dgc.a.a(true));
   public static final dgc.e<dgc.d> aa = a("minecartMaxSpeed", dgc.b.g, dgc.d.a(8, 1, 1000, crr.a(crt.d), ($$0, $$1) -> {
   }));
   public static final dgc.e<dgc.d> ab = a("spawnChunkRadius", dgc.b.g, dgc.d.a(2, 0, 32, crr.a(), ($$0, $$1) -> {
      arc $$2 = $$0.J();
      $$2.a($$2.Z(), $$2.aa());
   }));
   private final Map<dgc.e<?>, dgc.g<?>> ae;
   private final crr af;

   private static <T extends dgc.g<T>> dgc.e<T> a(String $$0, dgc.b $$1, dgc.f<T> $$2) {
      dgc.e<T> $$3 = new dgc.e<>($$0, $$1);
      dgc.f<?> $$4 = ad.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dgc(crr $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dgc(crr $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dgc.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dgc.e<?>, dgc.f<?>>> b(crr $$0) {
      return ad.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private dgc(Map<dgc.e<?>, dgc.g<?>> $$0, crr $$1) {
      this.ae = $$0;
      this.af = $$1;
   }

   public <T extends dgc.g<T>> T a(dgc.e<T> $$0) {
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

   public dgc a(crr $$0) {
      return new dgc(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ae.containsKey($$0x.getKey()) ? this.ae.get($$0x.getKey()) : ((dgc.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dgc.c $$0) {
      ad.forEach(($$1, $$2) -> this.a($$0, (dgc.e<?>)$$1, (dgc.f<?>)$$2));
   }

   private <T extends dgc.g<T>> void a(dgc.c $$0, dgc.e<?> $$1, dgc.f<?> $$2) {
      if ($$2.e.a(this.af)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dgc $$0, @Nullable MinecraftServer $$1) {
      $$0.ae.keySet().forEach($$2 -> this.a((dgc.e<?>)$$2, $$0, $$1));
   }

   private <T extends dgc.g<T>> void a(dgc.e<T> $$0, dgc $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dgc.e<dgc.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dgc.e<dgc.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dgc.g<dgc.a> {
      private boolean b;

      static dgc.f<dgc.a> a(boolean $$0, BiConsumer<MinecraftServer, dgc.a> $$1) {
         return new dgc.f<>(BoolArgumentType::bool, $$1x -> new dgc.a($$1x, $$0), $$1, dgc.c::b, crr.a());
      }

      static dgc.f<dgc.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dgc.f<dgc.a> $$0, boolean $$1) {
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

      protected dgc.a d() {
         return this;
      }

      protected dgc.a e() {
         return new dgc.a(this.a, this.b);
      }

      public void a(dgc.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dgc.g<T>> void a(dgc.e<T> $$0, dgc.f<T> $$1) {
      }

      default void b(dgc.e<dgc.a> $$0, dgc.f<dgc.a> $$1) {
      }

      default void c(dgc.e<dgc.d> $$0, dgc.f<dgc.d> $$1) {
      }
   }

   public static class d extends dgc.g<dgc.d> {
      private int b;

      private static dgc.f<dgc.d> a(int $$0, BiConsumer<MinecraftServer, dgc.d> $$1) {
         return new dgc.f<>(IntegerArgumentType::integer, $$1x -> new dgc.d($$1x, $$0), $$1, dgc.c::c, crr.a());
      }

      static dgc.f<dgc.d> a(int $$0, int $$1, int $$2, crr $$3, BiConsumer<MinecraftServer, dgc.d> $$4) {
         return new dgc.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dgc.d($$1x, $$0), $$4, dgc.c::c, $$3);
      }

      static dgc.f<dgc.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dgc.f<dgc.d> $$0, int $$1) {
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
               dgc.ac.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dgc.d d() {
         return this;
      }

      protected dgc.d e() {
         return new dgc.d(this.a, this.b);
      }

      public void a(dgc.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dgc.g<T>> {
      final String a;
      private final dgc.b b;

      public e(String $$0, dgc.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dgc.e && ((dgc.e)$$0).a.equals(this.a);
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

      public dgc.b c() {
         return this.b;
      }
   }

   public static class f<T extends dgc.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dgc.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dgc.h<T> d;
      final crr e;

      f(Supplier<ArgumentType<?>> $$0, Function<dgc.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dgc.h<T> $$3, crr $$4) {
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

      public void a(dgc.c $$0, dgc.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public crr b() {
         return this.e;
      }
   }

   public abstract static class g<T extends dgc.g<T>> {
      protected final dgc.f<T> a;

      public g(dgc.f<T> $$0) {
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

   interface h<T extends dgc.g<T>> {
      void call(dgc.c var1, dgc.e<T> var2, dgc.f<T> var3);
   }
}
