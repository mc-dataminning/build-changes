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

public class dec {
   public static final int a = 3;
   static final Logger ab = LogUtils.getLogger();
   private static final Map<dec.e<?>, dec.f<?>> ac = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dec.e<dec.a> b = a("doFireTick", dec.b.e, dec.a.a(true));
   public static final dec.e<dec.a> c = a("mobGriefing", dec.b.b, dec.a.a(true));
   public static final dec.e<dec.a> d = a("keepInventory", dec.b.a, dec.a.a(false));
   public static final dec.e<dec.a> e = a("doMobSpawning", dec.b.c, dec.a.a(true));
   public static final dec.e<dec.a> f = a("doMobLoot", dec.b.d, dec.a.a(true));
   public static final dec.e<dec.a> g = a("projectilesCanBreakBlocks", dec.b.d, dec.a.a(true));
   public static final dec.e<dec.a> h = a("doTileDrops", dec.b.d, dec.a.a(true));
   public static final dec.e<dec.a> i = a("doEntityDrops", dec.b.d, dec.a.a(true));
   public static final dec.e<dec.a> j = a("commandBlockOutput", dec.b.f, dec.a.a(true));
   public static final dec.e<dec.a> k = a("naturalRegeneration", dec.b.a, dec.a.a(true));
   public static final dec.e<dec.a> l = a("doDaylightCycle", dec.b.e, dec.a.a(true));
   public static final dec.e<dec.a> m = a("logAdminCommands", dec.b.f, dec.a.a(true));
   public static final dec.e<dec.a> n = a("showDeathMessages", dec.b.f, dec.a.a(true));
   public static final dec.e<dec.d> o = a("randomTickSpeed", dec.b.e, dec.d.a(3));
   public static final dec.e<dec.a> p = a("sendCommandFeedback", dec.b.f, dec.a.a(true));
   public static final dec.e<dec.a> q = a("reducedDebugInfo", dec.b.g, dec.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (ari $$3 : $$0.ag().t()) {
         $$3.c.b(new add($$3, $$2));
      }
   }));
   public static final dec.e<dec.a> r = a("spectatorsGenerateChunks", dec.b.a, dec.a.a(true));
   public static final dec.e<dec.d> s = a("spawnRadius", dec.b.a, dec.d.a(10));
   public static final dec.e<dec.a> t = a("disableElytraMovementCheck", dec.b.a, dec.a.a(false));
   public static final dec.e<dec.d> u = a("maxEntityCramming", dec.b.b, dec.d.a(24));
   public static final dec.e<dec.a> v = a("doWeatherCycle", dec.b.e, dec.a.a(true));
   public static final dec.e<dec.a> w = a("doLimitedCrafting", dec.b.a, dec.a.a(false, ($$0, $$1) -> {
      for (ari $$2 : $$0.ag().t()) {
         $$2.c.b(new adg(adg.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dec.e<dec.d> x = a("maxCommandChainLength", dec.b.g, dec.d.a(65536));
   public static final dec.e<dec.d> y = a("maxCommandForkCount", dec.b.g, dec.d.a(65536));
   public static final dec.e<dec.d> z = a("commandModificationBlockLimit", dec.b.g, dec.d.a(32768));
   public static final dec.e<dec.a> A = a("announceAdvancements", dec.b.f, dec.a.a(true));
   public static final dec.e<dec.a> B = a("disableRaids", dec.b.b, dec.a.a(false));
   public static final dec.e<dec.a> C = a("doInsomnia", dec.b.c, dec.a.a(true));
   public static final dec.e<dec.a> D = a("doImmediateRespawn", dec.b.a, dec.a.a(false, ($$0, $$1) -> {
      for (ari $$2 : $$0.ag().t()) {
         $$2.c.b(new adg(adg.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dec.e<dec.d> E = a("playersNetherPortalDefaultDelay", dec.b.a, dec.d.a(80));
   public static final dec.e<dec.d> F = a("playersNetherPortalCreativeDelay", dec.b.a, dec.d.a(0));
   public static final dec.e<dec.a> G = a("drowningDamage", dec.b.a, dec.a.a(true));
   public static final dec.e<dec.a> H = a("fallDamage", dec.b.a, dec.a.a(true));
   public static final dec.e<dec.a> I = a("fireDamage", dec.b.a, dec.a.a(true));
   public static final dec.e<dec.a> J = a("freezeDamage", dec.b.a, dec.a.a(true));
   public static final dec.e<dec.a> K = a("doPatrolSpawning", dec.b.c, dec.a.a(true));
   public static final dec.e<dec.a> L = a("doTraderSpawning", dec.b.c, dec.a.a(true));
   public static final dec.e<dec.a> M = a("doWardenSpawning", dec.b.c, dec.a.a(true));
   public static final dec.e<dec.a> N = a("forgiveDeadPlayers", dec.b.b, dec.a.a(true));
   public static final dec.e<dec.a> O = a("universalAnger", dec.b.b, dec.a.a(false));
   public static final dec.e<dec.d> P = a("playersSleepingPercentage", dec.b.a, dec.d.a(100));
   public static final dec.e<dec.a> Q = a("blockExplosionDropDecay", dec.b.d, dec.a.a(true));
   public static final dec.e<dec.a> R = a("mobExplosionDropDecay", dec.b.d, dec.a.a(true));
   public static final dec.e<dec.a> S = a("tntExplosionDropDecay", dec.b.d, dec.a.a(false));
   public static final dec.e<dec.d> T = a("snowAccumulationHeight", dec.b.e, dec.d.a(1));
   public static final dec.e<dec.a> U = a("waterSourceConversion", dec.b.e, dec.a.a(true));
   public static final dec.e<dec.a> V = a("lavaSourceConversion", dec.b.e, dec.a.a(false));
   public static final dec.e<dec.a> W = a("globalSoundEvents", dec.b.g, dec.a.a(true));
   public static final dec.e<dec.a> X = a("doVinesSpread", dec.b.e, dec.a.a(true));
   public static final dec.e<dec.a> Y = a("enderPearlsVanishOnDeath", dec.b.a, dec.a.a(true));
   public static final dec.e<dec.d> Z = a("minecartMaxSpeed", dec.b.g, dec.d.a(8, 1, 1000, cqn.a(cqp.e), ($$0, $$1) -> {
   }));
   public static final dec.e<dec.d> aa = a("spawnChunkRadius", dec.b.g, dec.d.a(2, 0, 32, cqn.a(), ($$0, $$1) -> {
      arh $$2 = $$0.J();
      $$2.a($$2.W(), $$2.X());
   }));
   private final Map<dec.e<?>, dec.g<?>> ad;
   private final cqn ae;

   private static <T extends dec.g<T>> dec.e<T> a(String $$0, dec.b $$1, dec.f<T> $$2) {
      dec.e<T> $$3 = new dec.e<>($$0, $$1);
      dec.f<?> $$4 = ac.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dec(cqn $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dec(cqn $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dec.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dec.e<?>, dec.f<?>>> b(cqn $$0) {
      return ac.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private dec(Map<dec.e<?>, dec.g<?>> $$0, cqn $$1) {
      this.ad = $$0;
      this.ae = $$1;
   }

   public <T extends dec.g<T>> T a(dec.e<T> $$0) {
      T $$1 = (T)this.ad.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public uf a() {
      uf $$0 = new uf();
      this.ad.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ad.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dec a(cqn $$0) {
      return new dec(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ad.containsKey($$0x.getKey()) ? this.ad.get($$0x.getKey()) : ((dec.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dec.c $$0) {
      ac.forEach(($$1, $$2) -> this.a($$0, (dec.e<?>)$$1, (dec.f<?>)$$2));
   }

   private <T extends dec.g<T>> void a(dec.c $$0, dec.e<?> $$1, dec.f<?> $$2) {
      if ($$2.e.a(this.ae)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dec $$0, @Nullable MinecraftServer $$1) {
      $$0.ad.keySet().forEach($$2 -> this.a((dec.e<?>)$$2, $$0, $$1));
   }

   private <T extends dec.g<T>> void a(dec.e<T> $$0, dec $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dec.e<dec.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dec.e<dec.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dec.g<dec.a> {
      private boolean b;

      static dec.f<dec.a> a(boolean $$0, BiConsumer<MinecraftServer, dec.a> $$1) {
         return new dec.f<>(BoolArgumentType::bool, $$1x -> new dec.a($$1x, $$0), $$1, dec.c::b, cqn.a());
      }

      static dec.f<dec.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dec.f<dec.a> $$0, boolean $$1) {
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

      protected dec.a d() {
         return this;
      }

      protected dec.a e() {
         return new dec.a(this.a, this.b);
      }

      public void a(dec.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dec.g<T>> void a(dec.e<T> $$0, dec.f<T> $$1) {
      }

      default void b(dec.e<dec.a> $$0, dec.f<dec.a> $$1) {
      }

      default void c(dec.e<dec.d> $$0, dec.f<dec.d> $$1) {
      }
   }

   public static class d extends dec.g<dec.d> {
      private int b;

      private static dec.f<dec.d> a(int $$0, BiConsumer<MinecraftServer, dec.d> $$1) {
         return new dec.f<>(IntegerArgumentType::integer, $$1x -> new dec.d($$1x, $$0), $$1, dec.c::c, cqn.a());
      }

      static dec.f<dec.d> a(int $$0, int $$1, int $$2, cqn $$3, BiConsumer<MinecraftServer, dec.d> $$4) {
         return new dec.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dec.d($$1x, $$0), $$4, dec.c::c, $$3);
      }

      static dec.f<dec.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dec.f<dec.d> $$0, int $$1) {
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
               dec.ab.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dec.d d() {
         return this;
      }

      protected dec.d e() {
         return new dec.d(this.a, this.b);
      }

      public void a(dec.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dec.g<T>> {
      final String a;
      private final dec.b b;

      public e(String $$0, dec.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dec.e && ((dec.e)$$0).a.equals(this.a);
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

      public dec.b c() {
         return this.b;
      }
   }

   public static class f<T extends dec.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dec.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dec.h<T> d;
      final cqn e;

      f(Supplier<ArgumentType<?>> $$0, Function<dec.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dec.h<T> $$3, cqn $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public RequiredArgumentBuilder<et, ?> a(String $$0) {
         return eu.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dec.c $$0, dec.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cqn b() {
         return this.e;
      }
   }

   public abstract static class g<T extends dec.g<T>> {
      protected final dec.f<T> a;

      public g(dec.f<T> $$0) {
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

   interface h<T extends dec.g<T>> {
      void call(dec.c var1, dec.e<T> var2, dec.f<T> var3);
   }
}
