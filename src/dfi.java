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

public class dfi {
   public static final int a = 3;
   static final Logger ab = LogUtils.getLogger();
   private static final Map<dfi.e<?>, dfi.f<?>> ac = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dfi.e<dfi.a> b = a("doFireTick", dfi.b.e, dfi.a.a(true));
   public static final dfi.e<dfi.a> c = a("mobGriefing", dfi.b.b, dfi.a.a(true));
   public static final dfi.e<dfi.a> d = a("keepInventory", dfi.b.a, dfi.a.a(false));
   public static final dfi.e<dfi.a> e = a("doMobSpawning", dfi.b.c, dfi.a.a(true));
   public static final dfi.e<dfi.a> f = a("doMobLoot", dfi.b.d, dfi.a.a(true));
   public static final dfi.e<dfi.a> g = a("projectilesCanBreakBlocks", dfi.b.d, dfi.a.a(true));
   public static final dfi.e<dfi.a> h = a("doTileDrops", dfi.b.d, dfi.a.a(true));
   public static final dfi.e<dfi.a> i = a("doEntityDrops", dfi.b.d, dfi.a.a(true));
   public static final dfi.e<dfi.a> j = a("commandBlockOutput", dfi.b.f, dfi.a.a(true));
   public static final dfi.e<dfi.a> k = a("naturalRegeneration", dfi.b.a, dfi.a.a(true));
   public static final dfi.e<dfi.a> l = a("doDaylightCycle", dfi.b.e, dfi.a.a(true));
   public static final dfi.e<dfi.a> m = a("logAdminCommands", dfi.b.f, dfi.a.a(true));
   public static final dfi.e<dfi.a> n = a("showDeathMessages", dfi.b.f, dfi.a.a(true));
   public static final dfi.e<dfi.d> o = a("randomTickSpeed", dfi.b.e, dfi.d.a(3));
   public static final dfi.e<dfi.a> p = a("sendCommandFeedback", dfi.b.f, dfi.a.a(true));
   public static final dfi.e<dfi.a> q = a("reducedDebugInfo", dfi.b.g, dfi.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arq $$3 : $$0.ag().t()) {
         $$3.f.b(new adj($$3, $$2));
      }
   }));
   public static final dfi.e<dfi.a> r = a("spectatorsGenerateChunks", dfi.b.a, dfi.a.a(true));
   public static final dfi.e<dfi.d> s = a("spawnRadius", dfi.b.a, dfi.d.a(10));
   public static final dfi.e<dfi.a> t = a("disableElytraMovementCheck", dfi.b.a, dfi.a.a(false));
   public static final dfi.e<dfi.d> u = a("maxEntityCramming", dfi.b.b, dfi.d.a(24));
   public static final dfi.e<dfi.a> v = a("doWeatherCycle", dfi.b.e, dfi.a.a(true));
   public static final dfi.e<dfi.a> w = a("doLimitedCrafting", dfi.b.a, dfi.a.a(false, ($$0, $$1) -> {
      for (arq $$2 : $$0.ag().t()) {
         $$2.f.b(new adm(adm.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dfi.e<dfi.d> x = a("maxCommandChainLength", dfi.b.g, dfi.d.a(65536));
   public static final dfi.e<dfi.d> y = a("maxCommandForkCount", dfi.b.g, dfi.d.a(65536));
   public static final dfi.e<dfi.d> z = a("commandModificationBlockLimit", dfi.b.g, dfi.d.a(32768));
   public static final dfi.e<dfi.a> A = a("announceAdvancements", dfi.b.f, dfi.a.a(true));
   public static final dfi.e<dfi.a> B = a("disableRaids", dfi.b.b, dfi.a.a(false));
   public static final dfi.e<dfi.a> C = a("doInsomnia", dfi.b.c, dfi.a.a(true));
   public static final dfi.e<dfi.a> D = a("doImmediateRespawn", dfi.b.a, dfi.a.a(false, ($$0, $$1) -> {
      for (arq $$2 : $$0.ag().t()) {
         $$2.f.b(new adm(adm.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dfi.e<dfi.d> E = a("playersNetherPortalDefaultDelay", dfi.b.a, dfi.d.a(80));
   public static final dfi.e<dfi.d> F = a("playersNetherPortalCreativeDelay", dfi.b.a, dfi.d.a(0));
   public static final dfi.e<dfi.a> G = a("drowningDamage", dfi.b.a, dfi.a.a(true));
   public static final dfi.e<dfi.a> H = a("fallDamage", dfi.b.a, dfi.a.a(true));
   public static final dfi.e<dfi.a> I = a("fireDamage", dfi.b.a, dfi.a.a(true));
   public static final dfi.e<dfi.a> J = a("freezeDamage", dfi.b.a, dfi.a.a(true));
   public static final dfi.e<dfi.a> K = a("doPatrolSpawning", dfi.b.c, dfi.a.a(true));
   public static final dfi.e<dfi.a> L = a("doTraderSpawning", dfi.b.c, dfi.a.a(true));
   public static final dfi.e<dfi.a> M = a("doWardenSpawning", dfi.b.c, dfi.a.a(true));
   public static final dfi.e<dfi.a> N = a("forgiveDeadPlayers", dfi.b.b, dfi.a.a(true));
   public static final dfi.e<dfi.a> O = a("universalAnger", dfi.b.b, dfi.a.a(false));
   public static final dfi.e<dfi.d> P = a("playersSleepingPercentage", dfi.b.a, dfi.d.a(100));
   public static final dfi.e<dfi.a> Q = a("blockExplosionDropDecay", dfi.b.d, dfi.a.a(true));
   public static final dfi.e<dfi.a> R = a("mobExplosionDropDecay", dfi.b.d, dfi.a.a(true));
   public static final dfi.e<dfi.a> S = a("tntExplosionDropDecay", dfi.b.d, dfi.a.a(false));
   public static final dfi.e<dfi.d> T = a("snowAccumulationHeight", dfi.b.e, dfi.d.a(1));
   public static final dfi.e<dfi.a> U = a("waterSourceConversion", dfi.b.e, dfi.a.a(true));
   public static final dfi.e<dfi.a> V = a("lavaSourceConversion", dfi.b.e, dfi.a.a(false));
   public static final dfi.e<dfi.a> W = a("globalSoundEvents", dfi.b.g, dfi.a.a(true));
   public static final dfi.e<dfi.a> X = a("doVinesSpread", dfi.b.e, dfi.a.a(true));
   public static final dfi.e<dfi.a> Y = a("enderPearlsVanishOnDeath", dfi.b.a, dfi.a.a(true));
   public static final dfi.e<dfi.d> Z = a("minecartMaxSpeed", dfi.b.g, dfi.d.a(8, 1, 1000, crq.a(crs.d), ($$0, $$1) -> {
   }));
   public static final dfi.e<dfi.d> aa = a("spawnChunkRadius", dfi.b.g, dfi.d.a(2, 0, 32, crq.a(), ($$0, $$1) -> {
      arp $$2 = $$0.J();
      $$2.a($$2.X(), $$2.Y());
   }));
   private final Map<dfi.e<?>, dfi.g<?>> ad;
   private final crq ae;

   private static <T extends dfi.g<T>> dfi.e<T> a(String $$0, dfi.b $$1, dfi.f<T> $$2) {
      dfi.e<T> $$3 = new dfi.e<>($$0, $$1);
      dfi.f<?> $$4 = ac.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dfi(crq $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dfi(crq $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dfi.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dfi.e<?>, dfi.f<?>>> b(crq $$0) {
      return ac.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private dfi(Map<dfi.e<?>, dfi.g<?>> $$0, crq $$1) {
      this.ad = $$0;
      this.ae = $$1;
   }

   public <T extends dfi.g<T>> T a(dfi.e<T> $$0) {
      T $$1 = (T)this.ad.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public ul a() {
      ul $$0 = new ul();
      this.ad.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ad.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dfi a(crq $$0) {
      return new dfi(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ad.containsKey($$0x.getKey()) ? this.ad.get($$0x.getKey()) : ((dfi.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dfi.c $$0) {
      ac.forEach(($$1, $$2) -> this.a($$0, (dfi.e<?>)$$1, (dfi.f<?>)$$2));
   }

   private <T extends dfi.g<T>> void a(dfi.c $$0, dfi.e<?> $$1, dfi.f<?> $$2) {
      if ($$2.e.a(this.ae)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dfi $$0, @Nullable MinecraftServer $$1) {
      $$0.ad.keySet().forEach($$2 -> this.a((dfi.e<?>)$$2, $$0, $$1));
   }

   private <T extends dfi.g<T>> void a(dfi.e<T> $$0, dfi $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dfi.e<dfi.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dfi.e<dfi.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dfi.g<dfi.a> {
      private boolean b;

      static dfi.f<dfi.a> a(boolean $$0, BiConsumer<MinecraftServer, dfi.a> $$1) {
         return new dfi.f<>(BoolArgumentType::bool, $$1x -> new dfi.a($$1x, $$0), $$1, dfi.c::b, crq.a());
      }

      static dfi.f<dfi.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dfi.f<dfi.a> $$0, boolean $$1) {
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

      protected dfi.a d() {
         return this;
      }

      protected dfi.a e() {
         return new dfi.a(this.a, this.b);
      }

      public void a(dfi.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dfi.g<T>> void a(dfi.e<T> $$0, dfi.f<T> $$1) {
      }

      default void b(dfi.e<dfi.a> $$0, dfi.f<dfi.a> $$1) {
      }

      default void c(dfi.e<dfi.d> $$0, dfi.f<dfi.d> $$1) {
      }
   }

   public static class d extends dfi.g<dfi.d> {
      private int b;

      private static dfi.f<dfi.d> a(int $$0, BiConsumer<MinecraftServer, dfi.d> $$1) {
         return new dfi.f<>(IntegerArgumentType::integer, $$1x -> new dfi.d($$1x, $$0), $$1, dfi.c::c, crq.a());
      }

      static dfi.f<dfi.d> a(int $$0, int $$1, int $$2, crq $$3, BiConsumer<MinecraftServer, dfi.d> $$4) {
         return new dfi.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dfi.d($$1x, $$0), $$4, dfi.c::c, $$3);
      }

      static dfi.f<dfi.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dfi.f<dfi.d> $$0, int $$1) {
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
               dfi.ab.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dfi.d d() {
         return this;
      }

      protected dfi.d e() {
         return new dfi.d(this.a, this.b);
      }

      public void a(dfi.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dfi.g<T>> {
      final String a;
      private final dfi.b b;

      public e(String $$0, dfi.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dfi.e && ((dfi.e)$$0).a.equals(this.a);
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

      public dfi.b c() {
         return this.b;
      }
   }

   public static class f<T extends dfi.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dfi.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dfi.h<T> d;
      final crq e;

      f(Supplier<ArgumentType<?>> $$0, Function<dfi.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dfi.h<T> $$3, crq $$4) {
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

      public void a(dfi.c $$0, dfi.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public crq b() {
         return this.e;
      }
   }

   public abstract static class g<T extends dfi.g<T>> {
      protected final dfi.f<T> a;

      public g(dfi.f<T> $$0) {
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

   interface h<T extends dfi.g<T>> {
      void call(dfi.c var1, dfi.e<T> var2, dfi.f<T> var3);
   }
}
