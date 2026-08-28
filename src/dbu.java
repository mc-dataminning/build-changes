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
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class dbu {
   public static final int a = 3;
   static final Logger aa = LogUtils.getLogger();
   private static final Map<dbu.e<?>, dbu.f<?>> ab = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dbu.e<dbu.a> b = a("doFireTick", dbu.b.e, dbu.a.a(true));
   public static final dbu.e<dbu.a> c = a("mobGriefing", dbu.b.b, dbu.a.a(true));
   public static final dbu.e<dbu.a> d = a("keepInventory", dbu.b.a, dbu.a.a(false));
   public static final dbu.e<dbu.a> e = a("doMobSpawning", dbu.b.c, dbu.a.a(true));
   public static final dbu.e<dbu.a> f = a("doMobLoot", dbu.b.d, dbu.a.a(true));
   public static final dbu.e<dbu.a> g = a("projectilesCanBreakBlocks", dbu.b.d, dbu.a.a(true));
   public static final dbu.e<dbu.a> h = a("doTileDrops", dbu.b.d, dbu.a.a(true));
   public static final dbu.e<dbu.a> i = a("doEntityDrops", dbu.b.d, dbu.a.a(true));
   public static final dbu.e<dbu.a> j = a("commandBlockOutput", dbu.b.f, dbu.a.a(true));
   public static final dbu.e<dbu.a> k = a("naturalRegeneration", dbu.b.a, dbu.a.a(true));
   public static final dbu.e<dbu.a> l = a("doDaylightCycle", dbu.b.e, dbu.a.a(true));
   public static final dbu.e<dbu.a> m = a("logAdminCommands", dbu.b.f, dbu.a.a(true));
   public static final dbu.e<dbu.a> n = a("showDeathMessages", dbu.b.f, dbu.a.a(true));
   public static final dbu.e<dbu.d> o = a("randomTickSpeed", dbu.b.e, dbu.d.a(3));
   public static final dbu.e<dbu.a> p = a("sendCommandFeedback", dbu.b.f, dbu.a.a(true));
   public static final dbu.e<dbu.a> q = a("reducedDebugInfo", dbu.b.g, dbu.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (arg $$3 : $$0.ah().t()) {
         $$3.c.b(new adm($$3, $$2));
      }
   }));
   public static final dbu.e<dbu.a> r = a("spectatorsGenerateChunks", dbu.b.a, dbu.a.a(true));
   public static final dbu.e<dbu.d> s = a("spawnRadius", dbu.b.a, dbu.d.a(10));
   public static final dbu.e<dbu.a> t = a("disableElytraMovementCheck", dbu.b.a, dbu.a.a(false));
   public static final dbu.e<dbu.d> u = a("maxEntityCramming", dbu.b.b, dbu.d.a(24));
   public static final dbu.e<dbu.a> v = a("doWeatherCycle", dbu.b.e, dbu.a.a(true));
   public static final dbu.e<dbu.a> w = a("doLimitedCrafting", dbu.b.a, dbu.a.a(false, ($$0, $$1) -> {
      for (arg $$2 : $$0.ah().t()) {
         $$2.c.b(new adp(adp.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbu.e<dbu.d> x = a("maxCommandChainLength", dbu.b.g, dbu.d.a(65536));
   public static final dbu.e<dbu.d> y = a("maxCommandForkCount", dbu.b.g, dbu.d.a(65536));
   public static final dbu.e<dbu.d> z = a("commandModificationBlockLimit", dbu.b.g, dbu.d.a(32768));
   public static final dbu.e<dbu.a> A = a("announceAdvancements", dbu.b.f, dbu.a.a(true));
   public static final dbu.e<dbu.a> B = a("disableRaids", dbu.b.b, dbu.a.a(false));
   public static final dbu.e<dbu.a> C = a("doInsomnia", dbu.b.c, dbu.a.a(true));
   public static final dbu.e<dbu.a> D = a("doImmediateRespawn", dbu.b.a, dbu.a.a(false, ($$0, $$1) -> {
      for (arg $$2 : $$0.ah().t()) {
         $$2.c.b(new adp(adp.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbu.e<dbu.d> E = a("playersNetherPortalDefaultDelay", dbu.b.a, dbu.d.a(80));
   public static final dbu.e<dbu.d> F = a("playersNetherPortalCreativeDelay", dbu.b.a, dbu.d.a(1));
   public static final dbu.e<dbu.a> G = a("drowningDamage", dbu.b.a, dbu.a.a(true));
   public static final dbu.e<dbu.a> H = a("fallDamage", dbu.b.a, dbu.a.a(true));
   public static final dbu.e<dbu.a> I = a("fireDamage", dbu.b.a, dbu.a.a(true));
   public static final dbu.e<dbu.a> J = a("freezeDamage", dbu.b.a, dbu.a.a(true));
   public static final dbu.e<dbu.a> K = a("doPatrolSpawning", dbu.b.c, dbu.a.a(true));
   public static final dbu.e<dbu.a> L = a("doTraderSpawning", dbu.b.c, dbu.a.a(true));
   public static final dbu.e<dbu.a> M = a("doWardenSpawning", dbu.b.c, dbu.a.a(true));
   public static final dbu.e<dbu.a> N = a("forgiveDeadPlayers", dbu.b.b, dbu.a.a(true));
   public static final dbu.e<dbu.a> O = a("universalAnger", dbu.b.b, dbu.a.a(false));
   public static final dbu.e<dbu.d> P = a("playersSleepingPercentage", dbu.b.a, dbu.d.a(100));
   public static final dbu.e<dbu.a> Q = a("blockExplosionDropDecay", dbu.b.d, dbu.a.a(true));
   public static final dbu.e<dbu.a> R = a("mobExplosionDropDecay", dbu.b.d, dbu.a.a(true));
   public static final dbu.e<dbu.a> S = a("tntExplosionDropDecay", dbu.b.d, dbu.a.a(false));
   public static final dbu.e<dbu.d> T = a("snowAccumulationHeight", dbu.b.e, dbu.d.a(1));
   public static final dbu.e<dbu.a> U = a("waterSourceConversion", dbu.b.e, dbu.a.a(true));
   public static final dbu.e<dbu.a> V = a("lavaSourceConversion", dbu.b.e, dbu.a.a(false));
   public static final dbu.e<dbu.a> W = a("globalSoundEvents", dbu.b.g, dbu.a.a(true));
   public static final dbu.e<dbu.a> X = a("doVinesSpread", dbu.b.e, dbu.a.a(true));
   public static final dbu.e<dbu.a> Y = a("enderPearlsVanishOnDeath", dbu.b.a, dbu.a.a(true));
   public static final dbu.e<dbu.d> Z = a("spawnChunkRadius", dbu.b.g, dbu.d.a(2, 0, 32, ($$0, $$1) -> {
      arf $$2 = $$0.I();
      $$2.a($$2.V(), $$2.W());
   }));
   private final Map<dbu.e<?>, dbu.g<?>> ac;

   private static <T extends dbu.g<T>> dbu.e<T> a(String $$0, dbu.b $$1, dbu.f<T> $$2) {
      dbu.e<T> $$3 = new dbu.e<>($$0, $$1);
      dbu.f<?> $$4 = ab.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dbu(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public dbu() {
      this.ac = ab.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbu.f)$$0.getValue()).a()));
   }

   private dbu(Map<dbu.e<?>, dbu.g<?>> $$0) {
      this.ac = $$0;
   }

   public <T extends dbu.g<T>> T a(dbu.e<T> $$0) {
      return (T)this.ac.get($$0);
   }

   public us a() {
      us $$0 = new us();
      this.ac.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ac.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dbu b() {
      return new dbu(this.ac.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbu.g)$$0.getValue()).f())));
   }

   public static void a(dbu.c $$0) {
      ab.forEach(($$1, $$2) -> a($$0, (dbu.e<?>)$$1, (dbu.f<?>)$$2));
   }

   private static <T extends dbu.g<T>> void a(dbu.c $$0, dbu.e<?> $$1, dbu.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(dbu $$0, @Nullable MinecraftServer $$1) {
      $$0.ac.keySet().forEach($$2 -> this.a((dbu.e<?>)$$2, $$0, $$1));
   }

   private <T extends dbu.g<T>> void a(dbu.e<T> $$0, dbu $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dbu.e<dbu.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dbu.e<dbu.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dbu.g<dbu.a> {
      private boolean b;

      static dbu.f<dbu.a> a(boolean $$0, BiConsumer<MinecraftServer, dbu.a> $$1) {
         return new dbu.f<>(BoolArgumentType::bool, $$1x -> new dbu.a($$1x, $$0), $$1, dbu.c::b);
      }

      static dbu.f<dbu.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dbu.f<dbu.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ep> $$0, String $$1) {
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

      protected dbu.a d() {
         return this;
      }

      protected dbu.a e() {
         return new dbu.a(this.a, this.b);
      }

      public void a(dbu.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dbu.g<T>> void a(dbu.e<T> $$0, dbu.f<T> $$1) {
      }

      default void b(dbu.e<dbu.a> $$0, dbu.f<dbu.a> $$1) {
      }

      default void c(dbu.e<dbu.d> $$0, dbu.f<dbu.d> $$1) {
      }
   }

   public static class d extends dbu.g<dbu.d> {
      private int b;

      private static dbu.f<dbu.d> a(int $$0, BiConsumer<MinecraftServer, dbu.d> $$1) {
         return new dbu.f<>(IntegerArgumentType::integer, $$1x -> new dbu.d($$1x, $$0), $$1, dbu.c::c);
      }

      static dbu.f<dbu.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, dbu.d> $$3) {
         return new dbu.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dbu.d($$1x, $$0), $$3, dbu.c::c);
      }

      static dbu.f<dbu.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dbu.f<dbu.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<ep> $$0, String $$1) {
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
               dbu.aa.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dbu.d d() {
         return this;
      }

      protected dbu.d e() {
         return new dbu.d(this.a, this.b);
      }

      public void a(dbu.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dbu.g<T>> {
      final String a;
      private final dbu.b b;

      public e(String $$0, dbu.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dbu.e && ((dbu.e)$$0).a.equals(this.a);
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

      public dbu.b c() {
         return this.b;
      }
   }

   public static class f<T extends dbu.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dbu.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dbu.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<dbu.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dbu.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<ep, ?> a(String $$0) {
         return eq.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dbu.c $$0, dbu.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends dbu.g<T>> {
      protected final dbu.f<T> a;

      public g(dbu.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<ep> var1, String var2);

      public void b(CommandContext<ep> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((ep)$$0.getSource()).l());
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

   interface h<T extends dbu.g<T>> {
      void call(dbu.c var1, dbu.e<T> var2, dbu.f<T> var3);
   }
}
