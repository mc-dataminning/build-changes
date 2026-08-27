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

public class dbw {
   public static final int a = 3;
   static final Logger ac = LogUtils.getLogger();
   private static final Map<dbw.e<?>, dbw.f<?>> ad = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dbw.e<dbw.a> b = a("doFireTick", dbw.b.e, dbw.a.a(true));
   public static final dbw.e<dbw.a> c = a("mobGriefing", dbw.b.b, dbw.a.a(true));
   public static final dbw.e<dbw.a> d = a("keepInventory", dbw.b.a, dbw.a.a(false));
   public static final dbw.e<dbw.a> e = a("doMobSpawning", dbw.b.c, dbw.a.a(true));
   public static final dbw.e<dbw.a> f = a("doMobLoot", dbw.b.d, dbw.a.a(true));
   public static final dbw.e<dbw.a> g = a("projectilesCanBreakBlocks", dbw.b.d, dbw.a.a(true));
   public static final dbw.e<dbw.a> h = a("doTileDrops", dbw.b.d, dbw.a.a(true));
   public static final dbw.e<dbw.a> i = a("doEntityDrops", dbw.b.d, dbw.a.a(true));
   public static final dbw.e<dbw.a> j = a("commandBlockOutput", dbw.b.f, dbw.a.a(true));
   public static final dbw.e<dbw.a> k = a("naturalRegeneration", dbw.b.a, dbw.a.a(true));
   public static final dbw.e<dbw.a> l = a("doDaylightCycle", dbw.b.e, dbw.a.a(true));
   public static final dbw.e<dbw.a> m = a("logAdminCommands", dbw.b.f, dbw.a.a(true));
   public static final dbw.e<dbw.a> n = a("showDeathMessages", dbw.b.f, dbw.a.a(true));
   public static final dbw.e<dbw.d> o = a("randomTickSpeed", dbw.b.e, dbw.d.a(3));
   public static final dbw.e<dbw.a> p = a("sendCommandFeedback", dbw.b.f, dbw.a.a(true));
   public static final dbw.e<dbw.a> q = a("reducedDebugInfo", dbw.b.g, dbw.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (aqu $$3 : $$0.ah().t()) {
         $$3.d.b(new adb($$3, $$2));
      }
   }));
   public static final dbw.e<dbw.a> r = a("spectatorsGenerateChunks", dbw.b.a, dbw.a.a(true));
   public static final dbw.e<dbw.d> s = a("spawnRadius", dbw.b.a, dbw.d.a(10));
   public static final dbw.e<dbw.a> t = a("disableElytraMovementCheck", dbw.b.a, dbw.a.a(false));
   public static final dbw.e<dbw.d> u = a("maxEntityCramming", dbw.b.b, dbw.d.a(24));
   public static final dbw.e<dbw.a> v = a("doWeatherCycle", dbw.b.e, dbw.a.a(true));
   public static final dbw.e<dbw.a> w = a("doLimitedCrafting", dbw.b.a, dbw.a.a(false, ($$0, $$1) -> {
      for (aqu $$2 : $$0.ah().t()) {
         $$2.d.b(new ade(ade.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbw.e<dbw.d> x = a("maxCommandChainLength", dbw.b.g, dbw.d.a(65536));
   public static final dbw.e<dbw.d> y = a("maxCommandForkCount", dbw.b.g, dbw.d.a(65536));
   public static final dbw.e<dbw.d> z = a("commandModificationBlockLimit", dbw.b.g, dbw.d.a(32768));
   public static final dbw.e<dbw.d> A = a("floataterSizeLimit", dbw.b.g, dbw.d.a(32));
   public static final dbw.e<dbw.a> B = a("announceAdvancements", dbw.b.f, dbw.a.a(true));
   public static final dbw.e<dbw.a> C = a("disableRaids", dbw.b.b, dbw.a.a(false));
   public static final dbw.e<dbw.a> D = a("doInsomnia", dbw.b.c, dbw.a.a(true));
   public static final dbw.e<dbw.a> E = a("doImmediateRespawn", dbw.b.a, dbw.a.a(false, ($$0, $$1) -> {
      for (aqu $$2 : $$0.ah().t()) {
         $$2.d.b(new ade(ade.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dbw.e<dbw.d> F = a("playersNetherPortalDefaultDelay", dbw.b.a, dbw.d.a(80));
   public static final dbw.e<dbw.d> G = a("playersNetherPortalCreativeDelay", dbw.b.a, dbw.d.a(1));
   public static final dbw.e<dbw.a> H = a("drowningDamage", dbw.b.a, dbw.a.a(true));
   public static final dbw.e<dbw.a> I = a("fallDamage", dbw.b.a, dbw.a.a(true));
   public static final dbw.e<dbw.a> J = a("fireDamage", dbw.b.a, dbw.a.a(true));
   public static final dbw.e<dbw.a> K = a("freezeDamage", dbw.b.a, dbw.a.a(true));
   public static final dbw.e<dbw.a> L = a("doPatrolSpawning", dbw.b.c, dbw.a.a(true));
   public static final dbw.e<dbw.a> M = a("doTraderSpawning", dbw.b.c, dbw.a.a(true));
   public static final dbw.e<dbw.a> N = a("doWardenSpawning", dbw.b.c, dbw.a.a(true));
   public static final dbw.e<dbw.a> O = a("forgiveDeadPlayers", dbw.b.b, dbw.a.a(true));
   public static final dbw.e<dbw.a> P = a("universalAnger", dbw.b.b, dbw.a.a(false));
   public static final dbw.e<dbw.d> Q = a("playersSleepingPercentage", dbw.b.a, dbw.d.a(100));
   public static final dbw.e<dbw.a> R = a("blockExplosionDropDecay", dbw.b.d, dbw.a.a(true));
   public static final dbw.e<dbw.a> S = a("mobExplosionDropDecay", dbw.b.d, dbw.a.a(true));
   public static final dbw.e<dbw.a> T = a("tntExplosionDropDecay", dbw.b.d, dbw.a.a(false));
   public static final dbw.e<dbw.d> U = a("snowAccumulationHeight", dbw.b.e, dbw.d.a(1));
   public static final dbw.e<dbw.a> V = a("waterSourceConversion", dbw.b.e, dbw.a.a(true));
   public static final dbw.e<dbw.a> W = a("lavaSourceConversion", dbw.b.e, dbw.a.a(false));
   public static final dbw.e<dbw.a> X = a("globalSoundEvents", dbw.b.g, dbw.a.a(true));
   public static final dbw.e<dbw.a> Y = a("doVinesSpread", dbw.b.e, dbw.a.a(true));
   public static final dbw.e<dbw.a> Z = a("enderPearlsVanishOnDeath", dbw.b.a, dbw.a.a(true));
   public static final dbw.e<dbw.d> aa = a("spawnChunkRadius", dbw.b.g, dbw.d.a(2, 0, 32, ($$0, $$1) -> {
      aqt $$2 = $$0.I();
      $$2.a($$2.V(), $$2.W());
   }));
   public static final dbw.e<dbw.a> ab = a("neverEatArmor", dbw.b.a, dbw.a.a(false));
   private final Map<dbw.e<?>, dbw.g<?>> ae;

   private static <T extends dbw.g<T>> dbw.e<T> a(String $$0, dbw.b $$1, dbw.f<T> $$2) {
      dbw.e<T> $$3 = new dbw.e<>($$0, $$1);
      dbw.f<?> $$4 = ad.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dbw(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public dbw() {
      this.ae = ad.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbw.f)$$0.getValue()).a()));
   }

   private dbw(Map<dbw.e<?>, dbw.g<?>> $$0) {
      this.ae = $$0;
   }

   public <T extends dbw.g<T>> T a(dbw.e<T> $$0) {
      return (T)this.ae.get($$0);
   }

   public uk a() {
      uk $$0 = new uk();
      this.ae.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ae.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public dbw b() {
      return new dbw(this.ae.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((dbw.g)$$0.getValue()).f())));
   }

   public static void a(dbw.c $$0) {
      ad.forEach(($$1, $$2) -> a($$0, (dbw.e<?>)$$1, (dbw.f<?>)$$2));
   }

   private static <T extends dbw.g<T>> void a(dbw.c $$0, dbw.e<?> $$1, dbw.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(dbw $$0, @Nullable MinecraftServer $$1) {
      $$0.ae.keySet().forEach($$2 -> this.a((dbw.e<?>)$$2, $$0, $$1));
   }

   private <T extends dbw.g<T>> void a(dbw.e<T> $$0, dbw $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dbw.e<dbw.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dbw.e<dbw.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dbw.g<dbw.a> {
      private boolean b;

      static dbw.f<dbw.a> a(boolean $$0, BiConsumer<MinecraftServer, dbw.a> $$1) {
         return new dbw.f<>(BoolArgumentType::bool, $$1x -> new dbw.a($$1x, $$0), $$1, dbw.c::b);
      }

      static dbw.f<dbw.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dbw.f<dbw.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<eh> $$0, String $$1) {
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

      protected dbw.a d() {
         return this;
      }

      protected dbw.a e() {
         return new dbw.a(this.a, this.b);
      }

      public void a(dbw.a $$0, @Nullable MinecraftServer $$1) {
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

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }
   }

   public interface c {
      default <T extends dbw.g<T>> void a(dbw.e<T> $$0, dbw.f<T> $$1) {
      }

      default void b(dbw.e<dbw.a> $$0, dbw.f<dbw.a> $$1) {
      }

      default void c(dbw.e<dbw.d> $$0, dbw.f<dbw.d> $$1) {
      }
   }

   public static class d extends dbw.g<dbw.d> {
      private int b;

      private static dbw.f<dbw.d> a(int $$0, BiConsumer<MinecraftServer, dbw.d> $$1) {
         return new dbw.f<>(IntegerArgumentType::integer, $$1x -> new dbw.d($$1x, $$0), $$1, dbw.c::c);
      }

      static dbw.f<dbw.d> a(int $$0, int $$1, int $$2, BiConsumer<MinecraftServer, dbw.d> $$3) {
         return new dbw.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dbw.d($$1x, $$0), $$3, dbw.c::c);
      }

      static dbw.f<dbw.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dbw.f<dbw.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<eh> $$0, String $$1) {
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
               dbw.ac.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dbw.d d() {
         return this;
      }

      protected dbw.d e() {
         return new dbw.d(this.a, this.b);
      }

      public void a(dbw.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dbw.g<T>> {
      final String a;
      private final dbw.b b;

      public e(String $$0, dbw.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dbw.e && ((dbw.e)$$0).a.equals(this.a);
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

      public dbw.b c() {
         return this.b;
      }
   }

   public static class f<T extends dbw.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dbw.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dbw.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<dbw.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dbw.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<eh, ?> a(String $$0) {
         return ei.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return this.b.apply(this);
      }

      public void a(dbw.c $$0, dbw.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends dbw.g<T>> {
      protected final dbw.f<T> a;

      public g(dbw.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<eh> var1, String var2);

      public void b(CommandContext<eh> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((eh)$$0.getSource()).l());
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

   interface h<T extends dbw.g<T>> {
      void call(dbw.c var1, dbw.e<T> var2, dbw.f<T> var3);
   }
}
