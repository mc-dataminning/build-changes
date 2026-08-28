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

public class dfb {
   public static final int a = 3;
   static final Logger ab = LogUtils.getLogger();
   private static final Map<dfb.e<?>, dfb.f<?>> ac = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dfb.e<dfb.a> b = a("doFireTick", dfb.b.e, dfb.a.a(true));
   public static final dfb.e<dfb.a> c = a("mobGriefing", dfb.b.b, dfb.a.a(true));
   public static final dfb.e<dfb.a> d = a("keepInventory", dfb.b.a, dfb.a.a(false));
   public static final dfb.e<dfb.a> e = a("doMobSpawning", dfb.b.c, dfb.a.a(true));
   public static final dfb.e<dfb.a> f = a("doMobLoot", dfb.b.d, dfb.a.a(true));
   public static final dfb.e<dfb.a> g = a("projectilesCanBreakBlocks", dfb.b.d, dfb.a.a(true));
   public static final dfb.e<dfb.a> h = a("doTileDrops", dfb.b.d, dfb.a.a(true));
   public static final dfb.e<dfb.a> i = a("doEntityDrops", dfb.b.d, dfb.a.a(true));
   public static final dfb.e<dfb.a> j = a("commandBlockOutput", dfb.b.f, dfb.a.a(true));
   public static final dfb.e<dfb.a> k = a("naturalRegeneration", dfb.b.a, dfb.a.a(true));
   public static final dfb.e<dfb.a> l = a("doDaylightCycle", dfb.b.e, dfb.a.a(true));
   public static final dfb.e<dfb.a> m = a("logAdminCommands", dfb.b.f, dfb.a.a(true));
   public static final dfb.e<dfb.a> n = a("showDeathMessages", dfb.b.f, dfb.a.a(true));
   public static final dfb.e<dfb.d> o = a("randomTickSpeed", dfb.b.e, dfb.d.a(3));
   public static final dfb.e<dfb.a> p = a("sendCommandFeedback", dfb.b.f, dfb.a.a(true));
   public static final dfb.e<dfb.a> q = a("reducedDebugInfo", dfb.b.g, dfb.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arr $$3 : $$0.ag().t()) {
         $$3.g.b(new adl($$3, $$2));
      }
   }));
   public static final dfb.e<dfb.a> r = a("spectatorsGenerateChunks", dfb.b.a, dfb.a.a(true));
   public static final dfb.e<dfb.d> s = a("spawnRadius", dfb.b.a, dfb.d.a(10));
   public static final dfb.e<dfb.a> t = a("disableElytraMovementCheck", dfb.b.a, dfb.a.a(false));
   public static final dfb.e<dfb.d> u = a("maxEntityCramming", dfb.b.b, dfb.d.a(24));
   public static final dfb.e<dfb.a> v = a("doWeatherCycle", dfb.b.e, dfb.a.a(true));
   public static final dfb.e<dfb.a> w = a("doLimitedCrafting", dfb.b.a, dfb.a.a(false, ($$0, $$1) -> {
      for (arr $$2 : $$0.ag().t()) {
         $$2.g.b(new ado(ado.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dfb.e<dfb.d> x = a("maxCommandChainLength", dfb.b.g, dfb.d.a(65536));
   public static final dfb.e<dfb.d> y = a("maxCommandForkCount", dfb.b.g, dfb.d.a(65536));
   public static final dfb.e<dfb.d> z = a("commandModificationBlockLimit", dfb.b.g, dfb.d.a(32768));
   public static final dfb.e<dfb.a> A = a("announceAdvancements", dfb.b.f, dfb.a.a(true));
   public static final dfb.e<dfb.a> B = a("disableRaids", dfb.b.b, dfb.a.a(false));
   public static final dfb.e<dfb.a> C = a("doInsomnia", dfb.b.c, dfb.a.a(true));
   public static final dfb.e<dfb.a> D = a("doImmediateRespawn", dfb.b.a, dfb.a.a(false, ($$0, $$1) -> {
      for (arr $$2 : $$0.ag().t()) {
         $$2.g.b(new ado(ado.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dfb.e<dfb.d> E = a("playersNetherPortalDefaultDelay", dfb.b.a, dfb.d.a(80));
   public static final dfb.e<dfb.d> F = a("playersNetherPortalCreativeDelay", dfb.b.a, dfb.d.a(0));
   public static final dfb.e<dfb.a> G = a("drowningDamage", dfb.b.a, dfb.a.a(true));
   public static final dfb.e<dfb.a> H = a("fallDamage", dfb.b.a, dfb.a.a(true));
   public static final dfb.e<dfb.a> I = a("fireDamage", dfb.b.a, dfb.a.a(true));
   public static final dfb.e<dfb.a> J = a("freezeDamage", dfb.b.a, dfb.a.a(true));
   public static final dfb.e<dfb.a> K = a("doPatrolSpawning", dfb.b.c, dfb.a.a(true));
   public static final dfb.e<dfb.a> L = a("doTraderSpawning", dfb.b.c, dfb.a.a(true));
   public static final dfb.e<dfb.a> M = a("doWardenSpawning", dfb.b.c, dfb.a.a(true));
   public static final dfb.e<dfb.a> N = a("forgiveDeadPlayers", dfb.b.b, dfb.a.a(true));
   public static final dfb.e<dfb.a> O = a("universalAnger", dfb.b.b, dfb.a.a(false));
   public static final dfb.e<dfb.d> P = a("playersSleepingPercentage", dfb.b.a, dfb.d.a(100));
   public static final dfb.e<dfb.a> Q = a("blockExplosionDropDecay", dfb.b.d, dfb.a.a(true));
   public static final dfb.e<dfb.a> R = a("mobExplosionDropDecay", dfb.b.d, dfb.a.a(true));
   public static final dfb.e<dfb.a> S = a("tntExplosionDropDecay", dfb.b.d, dfb.a.a(false));
   public static final dfb.e<dfb.d> T = a("snowAccumulationHeight", dfb.b.e, dfb.d.a(1));
   public static final dfb.e<dfb.a> U = a("waterSourceConversion", dfb.b.e, dfb.a.a(true));
   public static final dfb.e<dfb.a> V = a("lavaSourceConversion", dfb.b.e, dfb.a.a(false));
   public static final dfb.e<dfb.a> W = a("globalSoundEvents", dfb.b.g, dfb.a.a(true));
   public static final dfb.e<dfb.a> X = a("doVinesSpread", dfb.b.e, dfb.a.a(true));
   public static final dfb.e<dfb.a> Y = a("enderPearlsVanishOnDeath", dfb.b.a, dfb.a.a(true));
   public static final dfb.e<dfb.d> Z = a("minecartMaxSpeed", dfb.b.g, dfb.d.a(8, 1, 1000, crj.a(crl.e), ($$0, $$1) -> {
   }));
   public static final dfb.e<dfb.d> aa = a("spawnChunkRadius", dfb.b.g, dfb.d.a(2, 0, 32, crj.a(), ($$0, $$1) -> {
      arq $$2 = $$0.J();
      $$2.a($$2.W(), $$2.X());
   }));
   private final Map<dfb.e<?>, dfb.g<?>> ad;
   private final crj ae;

   private static <T extends dfb.g<T>> dfb.e<T> a(String $$0, dfb.b $$1, dfb.f<T> $$2) {
      dfb.e<T> $$3 = new dfb.e<>($$0, $$1);
      dfb.f<?> $$4 = ac.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dfb(crj $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dfb(crj $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dfb.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dfb.e<?>, dfb.f<?>>> b(crj $$0) {
      return ac.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private dfb(Map<dfb.e<?>, dfb.g<?>> $$0, crj $$1) {
      this.ad = $$0;
      this.ae = $$1;
   }

   public <T extends dfb.g<T>> T a(dfb.e<T> $$0) {
      T $$1 = (T)this.ad.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public un a() {
      un $$0 = new un();
      this.ad.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ad.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dfb a(crj $$0) {
      return new dfb(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ad.containsKey($$0x.getKey()) ? this.ad.get($$0x.getKey()) : ((dfb.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dfb.c $$0) {
      ac.forEach(($$1, $$2) -> this.a($$0, (dfb.e<?>)$$1, (dfb.f<?>)$$2));
   }

   private <T extends dfb.g<T>> void a(dfb.c $$0, dfb.e<?> $$1, dfb.f<?> $$2) {
      if ($$2.e.a(this.ae)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dfb $$0, @Nullable MinecraftServer $$1) {
      $$0.ad.keySet().forEach($$2 -> this.a((dfb.e<?>)$$2, $$0, $$1));
   }

   private <T extends dfb.g<T>> void a(dfb.e<T> $$0, dfb $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dfb.e<dfb.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dfb.e<dfb.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dfb.g<dfb.a> {
      private boolean b;

      static dfb.f<dfb.a> a(boolean $$0, BiConsumer<MinecraftServer, dfb.a> $$1) {
         return new dfb.f<>(BoolArgumentType::bool, $$1x -> new dfb.a($$1x, $$0), $$1, dfb.c::b, crj.a());
      }

      static dfb.f<dfb.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dfb.f<dfb.a> $$0, boolean $$1) {
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

      protected dfb.a d() {
         return this;
      }

      protected dfb.a e() {
         return new dfb.a(this.a, this.b);
      }

      public void a(dfb.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dfb.g<T>> void a(dfb.e<T> $$0, dfb.f<T> $$1) {
      }

      default void b(dfb.e<dfb.a> $$0, dfb.f<dfb.a> $$1) {
      }

      default void c(dfb.e<dfb.d> $$0, dfb.f<dfb.d> $$1) {
      }
   }

   public static class d extends dfb.g<dfb.d> {
      private int b;

      private static dfb.f<dfb.d> a(int $$0, BiConsumer<MinecraftServer, dfb.d> $$1) {
         return new dfb.f<>(IntegerArgumentType::integer, $$1x -> new dfb.d($$1x, $$0), $$1, dfb.c::c, crj.a());
      }

      static dfb.f<dfb.d> a(int $$0, int $$1, int $$2, crj $$3, BiConsumer<MinecraftServer, dfb.d> $$4) {
         return new dfb.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dfb.d($$1x, $$0), $$4, dfb.c::c, $$3);
      }

      static dfb.f<dfb.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dfb.f<dfb.d> $$0, int $$1) {
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
               dfb.ab.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dfb.d d() {
         return this;
      }

      protected dfb.d e() {
         return new dfb.d(this.a, this.b);
      }

      public void a(dfb.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dfb.g<T>> {
      final String a;
      private final dfb.b b;

      public e(String $$0, dfb.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dfb.e && ((dfb.e)$$0).a.equals(this.a);
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

      public dfb.b c() {
         return this.b;
      }
   }

   public static class f<T extends dfb.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dfb.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dfb.h<T> d;
      final crj e;

      f(Supplier<ArgumentType<?>> $$0, Function<dfb.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dfb.h<T> $$3, crj $$4) {
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

      public void a(dfb.c $$0, dfb.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public crj b() {
         return this.e;
      }
   }

   public abstract static class g<T extends dfb.g<T>> {
      protected final dfb.f<T> a;

      public g(dfb.f<T> $$0) {
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

   interface h<T extends dfb.g<T>> {
      void call(dfb.c var1, dfb.e<T> var2, dfb.f<T> var3);
   }
}
