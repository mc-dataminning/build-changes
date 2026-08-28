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

public class der {
   public static final int a = 3;
   static final Logger ab = LogUtils.getLogger();
   private static final Map<der.e<?>, der.f<?>> ac = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final der.e<der.a> b = a("doFireTick", der.b.e, der.a.a(true));
   public static final der.e<der.a> c = a("mobGriefing", der.b.b, der.a.a(true));
   public static final der.e<der.a> d = a("keepInventory", der.b.a, der.a.a(false));
   public static final der.e<der.a> e = a("doMobSpawning", der.b.c, der.a.a(true));
   public static final der.e<der.a> f = a("doMobLoot", der.b.d, der.a.a(true));
   public static final der.e<der.a> g = a("projectilesCanBreakBlocks", der.b.d, der.a.a(true));
   public static final der.e<der.a> h = a("doTileDrops", der.b.d, der.a.a(true));
   public static final der.e<der.a> i = a("doEntityDrops", der.b.d, der.a.a(true));
   public static final der.e<der.a> j = a("commandBlockOutput", der.b.f, der.a.a(true));
   public static final der.e<der.a> k = a("naturalRegeneration", der.b.a, der.a.a(true));
   public static final der.e<der.a> l = a("doDaylightCycle", der.b.e, der.a.a(true));
   public static final der.e<der.a> m = a("logAdminCommands", der.b.f, der.a.a(true));
   public static final der.e<der.a> n = a("showDeathMessages", der.b.f, der.a.a(true));
   public static final der.e<der.d> o = a("randomTickSpeed", der.b.e, der.d.a(3));
   public static final der.e<der.a> p = a("sendCommandFeedback", der.b.f, der.a.a(true));
   public static final der.e<der.a> q = a("reducedDebugInfo", der.b.g, der.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arn $$3 : $$0.ag().t()) {
         $$3.d.b(new adh($$3, $$2));
      }
   }));
   public static final der.e<der.a> r = a("spectatorsGenerateChunks", der.b.a, der.a.a(true));
   public static final der.e<der.d> s = a("spawnRadius", der.b.a, der.d.a(10));
   public static final der.e<der.a> t = a("disableElytraMovementCheck", der.b.a, der.a.a(false));
   public static final der.e<der.d> u = a("maxEntityCramming", der.b.b, der.d.a(24));
   public static final der.e<der.a> v = a("doWeatherCycle", der.b.e, der.a.a(true));
   public static final der.e<der.a> w = a("doLimitedCrafting", der.b.a, der.a.a(false, ($$0, $$1) -> {
      for (arn $$2 : $$0.ag().t()) {
         $$2.d.b(new adk(adk.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final der.e<der.d> x = a("maxCommandChainLength", der.b.g, der.d.a(65536));
   public static final der.e<der.d> y = a("maxCommandForkCount", der.b.g, der.d.a(65536));
   public static final der.e<der.d> z = a("commandModificationBlockLimit", der.b.g, der.d.a(32768));
   public static final der.e<der.a> A = a("announceAdvancements", der.b.f, der.a.a(true));
   public static final der.e<der.a> B = a("disableRaids", der.b.b, der.a.a(false));
   public static final der.e<der.a> C = a("doInsomnia", der.b.c, der.a.a(true));
   public static final der.e<der.a> D = a("doImmediateRespawn", der.b.a, der.a.a(false, ($$0, $$1) -> {
      for (arn $$2 : $$0.ag().t()) {
         $$2.d.b(new adk(adk.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final der.e<der.d> E = a("playersNetherPortalDefaultDelay", der.b.a, der.d.a(80));
   public static final der.e<der.d> F = a("playersNetherPortalCreativeDelay", der.b.a, der.d.a(0));
   public static final der.e<der.a> G = a("drowningDamage", der.b.a, der.a.a(true));
   public static final der.e<der.a> H = a("fallDamage", der.b.a, der.a.a(true));
   public static final der.e<der.a> I = a("fireDamage", der.b.a, der.a.a(true));
   public static final der.e<der.a> J = a("freezeDamage", der.b.a, der.a.a(true));
   public static final der.e<der.a> K = a("doPatrolSpawning", der.b.c, der.a.a(true));
   public static final der.e<der.a> L = a("doTraderSpawning", der.b.c, der.a.a(true));
   public static final der.e<der.a> M = a("doWardenSpawning", der.b.c, der.a.a(true));
   public static final der.e<der.a> N = a("forgiveDeadPlayers", der.b.b, der.a.a(true));
   public static final der.e<der.a> O = a("universalAnger", der.b.b, der.a.a(false));
   public static final der.e<der.d> P = a("playersSleepingPercentage", der.b.a, der.d.a(100));
   public static final der.e<der.a> Q = a("blockExplosionDropDecay", der.b.d, der.a.a(true));
   public static final der.e<der.a> R = a("mobExplosionDropDecay", der.b.d, der.a.a(true));
   public static final der.e<der.a> S = a("tntExplosionDropDecay", der.b.d, der.a.a(false));
   public static final der.e<der.d> T = a("snowAccumulationHeight", der.b.e, der.d.a(1));
   public static final der.e<der.a> U = a("waterSourceConversion", der.b.e, der.a.a(true));
   public static final der.e<der.a> V = a("lavaSourceConversion", der.b.e, der.a.a(false));
   public static final der.e<der.a> W = a("globalSoundEvents", der.b.g, der.a.a(true));
   public static final der.e<der.a> X = a("doVinesSpread", der.b.e, der.a.a(true));
   public static final der.e<der.a> Y = a("enderPearlsVanishOnDeath", der.b.a, der.a.a(true));
   public static final der.e<der.d> Z = a("minecartMaxSpeed", der.b.g, der.d.a(8, 1, 1000, cra.a(crc.e), ($$0, $$1) -> {
   }));
   public static final der.e<der.d> aa = a("spawnChunkRadius", der.b.g, der.d.a(2, 0, 32, cra.a(), ($$0, $$1) -> {
      arm $$2 = $$0.J();
      $$2.a($$2.W(), $$2.X());
   }));
   private final Map<der.e<?>, der.g<?>> ad;
   private final cra ae;

   private static <T extends der.g<T>> der.e<T> a(String $$0, der.b $$1, der.f<T> $$2) {
      der.e<T> $$3 = new der.e<>($$0, $$1);
      der.f<?> $$4 = ac.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public der(cra $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public der(cra $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((der.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<der.e<?>, der.f<?>>> b(cra $$0) {
      return ac.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private der(Map<der.e<?>, der.g<?>> $$0, cra $$1) {
      this.ad = $$0;
      this.ae = $$1;
   }

   public <T extends der.g<T>> T a(der.e<T> $$0) {
      T $$1 = (T)this.ad.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public uj a() {
      uj $$0 = new uj();
      this.ad.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ad.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public der a(cra $$0) {
      return new der(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ad.containsKey($$0x.getKey()) ? this.ad.get($$0x.getKey()) : ((der.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(der.c $$0) {
      ac.forEach(($$1, $$2) -> this.a($$0, (der.e<?>)$$1, (der.f<?>)$$2));
   }

   private <T extends der.g<T>> void a(der.c $$0, der.e<?> $$1, der.f<?> $$2) {
      if ($$2.e.a(this.ae)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(der $$0, @Nullable MinecraftServer $$1) {
      $$0.ad.keySet().forEach($$2 -> this.a((der.e<?>)$$2, $$0, $$1));
   }

   private <T extends der.g<T>> void a(der.e<T> $$0, der $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(der.e<der.a> $$0) {
      return this.a($$0).a();
   }

   public int c(der.e<der.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends der.g<der.a> {
      private boolean b;

      static der.f<der.a> a(boolean $$0, BiConsumer<MinecraftServer, der.a> $$1) {
         return new der.f<>(BoolArgumentType::bool, $$1x -> new der.a($$1x, $$0), $$1, der.c::b, cra.a());
      }

      static der.f<der.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(der.f<der.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ev> $$0, String $$1) {
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

      protected der.a d() {
         return this;
      }

      protected der.a e() {
         return new der.a(this.a, this.b);
      }

      public void a(der.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends der.g<T>> void a(der.e<T> $$0, der.f<T> $$1) {
      }

      default void b(der.e<der.a> $$0, der.f<der.a> $$1) {
      }

      default void c(der.e<der.d> $$0, der.f<der.d> $$1) {
      }
   }

   public static class d extends der.g<der.d> {
      private int b;

      private static der.f<der.d> a(int $$0, BiConsumer<MinecraftServer, der.d> $$1) {
         return new der.f<>(IntegerArgumentType::integer, $$1x -> new der.d($$1x, $$0), $$1, der.c::c, cra.a());
      }

      static der.f<der.d> a(int $$0, int $$1, int $$2, cra $$3, BiConsumer<MinecraftServer, der.d> $$4) {
         return new der.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new der.d($$1x, $$0), $$4, der.c::c, $$3);
      }

      static der.f<der.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(der.f<der.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ev> $$0, String $$1) {
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
               der.ab.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected der.d d() {
         return this;
      }

      protected der.d e() {
         return new der.d(this.a, this.b);
      }

      public void a(der.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends der.g<T>> {
      final String a;
      private final der.b b;

      public e(String $$0, der.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof der.e && ((der.e)$$0).a.equals(this.a);
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

      public der.b c() {
         return this.b;
      }
   }

   public static class f<T extends der.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<der.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final der.h<T> d;
      final cra e;

      f(Supplier<ArgumentType<?>> $$0, Function<der.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, der.h<T> $$3, cra $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public RequiredArgumentBuilder<ev, ?> a(String $$0) {
         return ew.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(der.c $$0, der.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cra b() {
         return this.e;
      }
   }

   public abstract static class g<T extends der.g<T>> {
      protected final der.f<T> a;

      public g(der.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ev> var1, String var2);

      public void b(CommandContext<ev> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ev)$$0.getSource()).l());
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

   interface h<T extends der.g<T>> {
      void call(der.c var1, der.e<T> var2, der.f<T> var3);
   }
}
