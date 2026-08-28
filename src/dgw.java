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

public class dgw {
   public static final int a = 3;
   static final Logger ab = LogUtils.getLogger();
   private static final Map<dgw.e<?>, dgw.f<?>> ac = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final dgw.e<dgw.a> b = a("doFireTick", dgw.b.e, dgw.a.a(true));
   public static final dgw.e<dgw.a> c = a("mobGriefing", dgw.b.b, dgw.a.a(true));
   public static final dgw.e<dgw.a> d = a("keepInventory", dgw.b.a, dgw.a.a(false));
   public static final dgw.e<dgw.a> e = a("doMobSpawning", dgw.b.c, dgw.a.a(true));
   public static final dgw.e<dgw.a> f = a("doMobLoot", dgw.b.d, dgw.a.a(true));
   public static final dgw.e<dgw.a> g = a("projectilesCanBreakBlocks", dgw.b.d, dgw.a.a(true));
   public static final dgw.e<dgw.a> h = a("doTileDrops", dgw.b.d, dgw.a.a(true));
   public static final dgw.e<dgw.a> i = a("doEntityDrops", dgw.b.d, dgw.a.a(true));
   public static final dgw.e<dgw.a> j = a("commandBlockOutput", dgw.b.f, dgw.a.a(true));
   public static final dgw.e<dgw.a> k = a("naturalRegeneration", dgw.b.a, dgw.a.a(true));
   public static final dgw.e<dgw.a> l = a("doDaylightCycle", dgw.b.e, dgw.a.a(true));
   public static final dgw.e<dgw.a> m = a("logAdminCommands", dgw.b.f, dgw.a.a(true));
   public static final dgw.e<dgw.a> n = a("showDeathMessages", dgw.b.f, dgw.a.a(true));
   public static final dgw.e<dgw.d> o = a("randomTickSpeed", dgw.b.e, dgw.d.a(3));
   public static final dgw.e<dgw.a> p = a("sendCommandFeedback", dgw.b.f, dgw.a.a(true));
   public static final dgw.e<dgw.a> q = a("reducedDebugInfo", dgw.b.g, dgw.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for (asi $$3 : $$0.ag().t()) {
         $$3.f.b(new adv($$3, $$2));
      }
   }));
   public static final dgw.e<dgw.a> r = a("spectatorsGenerateChunks", dgw.b.a, dgw.a.a(true));
   public static final dgw.e<dgw.d> s = a("spawnRadius", dgw.b.a, dgw.d.a(10));
   public static final dgw.e<dgw.a> t = a("disableElytraMovementCheck", dgw.b.a, dgw.a.a(false));
   public static final dgw.e<dgw.d> u = a("maxEntityCramming", dgw.b.b, dgw.d.a(24));
   public static final dgw.e<dgw.a> v = a("doWeatherCycle", dgw.b.e, dgw.a.a(true));
   public static final dgw.e<dgw.a> w = a("doLimitedCrafting", dgw.b.a, dgw.a.a(false, ($$0, $$1) -> {
      for (asi $$2 : $$0.ag().t()) {
         $$2.f.b(new adz(adz.n, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dgw.e<dgw.d> x = a("maxCommandChainLength", dgw.b.g, dgw.d.a(65536));
   public static final dgw.e<dgw.d> y = a("maxCommandForkCount", dgw.b.g, dgw.d.a(65536));
   public static final dgw.e<dgw.d> z = a("commandModificationBlockLimit", dgw.b.g, dgw.d.a(32768));
   public static final dgw.e<dgw.a> A = a("announceAdvancements", dgw.b.f, dgw.a.a(true));
   public static final dgw.e<dgw.a> B = a("disableRaids", dgw.b.b, dgw.a.a(false));
   public static final dgw.e<dgw.a> C = a("doInsomnia", dgw.b.c, dgw.a.a(true));
   public static final dgw.e<dgw.a> D = a("doImmediateRespawn", dgw.b.a, dgw.a.a(false, ($$0, $$1) -> {
      for (asi $$2 : $$0.ag().t()) {
         $$2.f.b(new adz(adz.m, $$1.a() ? 1.0F : 0.0F));
      }
   }));
   public static final dgw.e<dgw.d> E = a("playersNetherPortalDefaultDelay", dgw.b.a, dgw.d.a(80));
   public static final dgw.e<dgw.d> F = a("playersNetherPortalCreativeDelay", dgw.b.a, dgw.d.a(0));
   public static final dgw.e<dgw.a> G = a("drowningDamage", dgw.b.a, dgw.a.a(true));
   public static final dgw.e<dgw.a> H = a("fallDamage", dgw.b.a, dgw.a.a(true));
   public static final dgw.e<dgw.a> I = a("fireDamage", dgw.b.a, dgw.a.a(true));
   public static final dgw.e<dgw.a> J = a("freezeDamage", dgw.b.a, dgw.a.a(true));
   public static final dgw.e<dgw.a> K = a("doPatrolSpawning", dgw.b.c, dgw.a.a(true));
   public static final dgw.e<dgw.a> L = a("doTraderSpawning", dgw.b.c, dgw.a.a(true));
   public static final dgw.e<dgw.a> M = a("doWardenSpawning", dgw.b.c, dgw.a.a(true));
   public static final dgw.e<dgw.a> N = a("forgiveDeadPlayers", dgw.b.b, dgw.a.a(true));
   public static final dgw.e<dgw.a> O = a("universalAnger", dgw.b.b, dgw.a.a(false));
   public static final dgw.e<dgw.d> P = a("playersSleepingPercentage", dgw.b.a, dgw.d.a(100));
   public static final dgw.e<dgw.a> Q = a("blockExplosionDropDecay", dgw.b.d, dgw.a.a(true));
   public static final dgw.e<dgw.a> R = a("mobExplosionDropDecay", dgw.b.d, dgw.a.a(true));
   public static final dgw.e<dgw.a> S = a("tntExplosionDropDecay", dgw.b.d, dgw.a.a(false));
   public static final dgw.e<dgw.d> T = a("snowAccumulationHeight", dgw.b.e, dgw.d.a(1));
   public static final dgw.e<dgw.a> U = a("waterSourceConversion", dgw.b.e, dgw.a.a(true));
   public static final dgw.e<dgw.a> V = a("lavaSourceConversion", dgw.b.e, dgw.a.a(false));
   public static final dgw.e<dgw.a> W = a("globalSoundEvents", dgw.b.g, dgw.a.a(true));
   public static final dgw.e<dgw.a> X = a("doVinesSpread", dgw.b.e, dgw.a.a(true));
   public static final dgw.e<dgw.a> Y = a("enderPearlsVanishOnDeath", dgw.b.a, dgw.a.a(true));
   public static final dgw.e<dgw.d> Z = a("minecartMaxSpeed", dgw.b.g, dgw.d.a(8, 1, 1000, cso.a(csq.e), ($$0, $$1) -> {
   }));
   public static final dgw.e<dgw.d> aa = a("spawnChunkRadius", dgw.b.g, dgw.d.a(2, 0, 32, cso.a(), ($$0, $$1) -> {
      ash $$2 = $$0.J();
      $$2.a($$2.Y(), $$2.Z());
   }));
   private final Map<dgw.e<?>, dgw.g<?>> ad;
   private final cso ae;

   private static <T extends dgw.g<T>> dgw.e<T> a(String $$0, dgw.b $$1, dgw.f<T> $$2) {
      dgw.e<T> $$3 = new dgw.e<>($$0, $$1);
      dgw.f<?> $$4 = ac.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public dgw(cso $$0, DynamicLike<?> $$1) {
      this($$0);
      this.a($$1);
   }

   public dgw(cso $$0) {
      this(b($$0).collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((dgw.f)$$0x.getValue()).a())), $$0);
   }

   private static Stream<Entry<dgw.e<?>, dgw.f<?>>> b(cso $$0) {
      return ac.entrySet().stream().filter($$1 -> $$1.getValue().e.a($$0));
   }

   private dgw(Map<dgw.e<?>, dgw.g<?>> $$0, cso $$1) {
      this.ad = $$0;
      this.ae = $$1;
   }

   public <T extends dgw.g<T>> T a(dgw.e<T> $$0) {
      T $$1 = (T)this.ad.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return $$1;
      }
   }

   public ux a() {
      ux $$0 = new ux();
      this.ad.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.ad.forEach(($$1, $$2) -> $$0.get($$1.a).asString().ifSuccess($$2::a));
   }

   public dgw a(cso $$0) {
      return new dgw(
         b($$0)
            .collect(
               ImmutableMap.toImmutableMap(
                  Entry::getKey, $$0x -> this.ad.containsKey($$0x.getKey()) ? this.ad.get($$0x.getKey()) : ((dgw.f)$$0x.getValue()).a()
               )
            ),
         $$0
      );
   }

   public void a(dgw.c $$0) {
      ac.forEach(($$1, $$2) -> this.a($$0, (dgw.e<?>)$$1, (dgw.f<?>)$$2));
   }

   private <T extends dgw.g<T>> void a(dgw.c $$0, dgw.e<?> $$1, dgw.f<?> $$2) {
      if ($$2.e.a(this.ae)) {
         $$0.a($$1, $$2);
         $$2.a($$0, $$1);
      }
   }

   public void a(dgw $$0, @Nullable MinecraftServer $$1) {
      $$0.ad.keySet().forEach($$2 -> this.a((dgw.e<?>)$$2, $$0, $$1));
   }

   private <T extends dgw.g<T>> void a(dgw.e<T> $$0, dgw $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(dgw.e<dgw.a> $$0) {
      return this.a($$0).a();
   }

   public int c(dgw.e<dgw.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends dgw.g<dgw.a> {
      private boolean b;

      static dgw.f<dgw.a> a(boolean $$0, BiConsumer<MinecraftServer, dgw.a> $$1) {
         return new dgw.f<>(BoolArgumentType::bool, $$1x -> new dgw.a($$1x, $$0), $$1, dgw.c::b, cso.a());
      }

      static dgw.f<dgw.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(dgw.f<dgw.a> $$0, boolean $$1) {
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

      protected dgw.a d() {
         return this;
      }

      protected dgw.a e() {
         return new dgw.a(this.a, this.b);
      }

      public void a(dgw.a $$0, @Nullable MinecraftServer $$1) {
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
      default <T extends dgw.g<T>> void a(dgw.e<T> $$0, dgw.f<T> $$1) {
      }

      default void b(dgw.e<dgw.a> $$0, dgw.f<dgw.a> $$1) {
      }

      default void c(dgw.e<dgw.d> $$0, dgw.f<dgw.d> $$1) {
      }
   }

   public static class d extends dgw.g<dgw.d> {
      private int b;

      private static dgw.f<dgw.d> a(int $$0, BiConsumer<MinecraftServer, dgw.d> $$1) {
         return new dgw.f<>(IntegerArgumentType::integer, $$1x -> new dgw.d($$1x, $$0), $$1, dgw.c::c, cso.a());
      }

      static dgw.f<dgw.d> a(int $$0, int $$1, int $$2, cso $$3, BiConsumer<MinecraftServer, dgw.d> $$4) {
         return new dgw.f<>(() -> IntegerArgumentType.integer($$1, $$2), $$1x -> new dgw.d($$1x, $$0), $$4, dgw.c::c, $$3);
      }

      static dgw.f<dgw.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(dgw.f<dgw.d> $$0, int $$1) {
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
               dgw.ab.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected dgw.d d() {
         return this;
      }

      protected dgw.d e() {
         return new dgw.d(this.a, this.b);
      }

      public void a(dgw.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends dgw.g<T>> {
      final String a;
      private final dgw.b b;

      public e(String $$0, dgw.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public String toString() {
         return this.a;
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof dgw.e && ((dgw.e)$$0).a.equals(this.a);
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

      public dgw.b c() {
         return this.b;
      }
   }

   public static class f<T extends dgw.g<T>> {
      final Supplier<ArgumentType<?>> a;
      private final Function<dgw.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final dgw.h<T> d;
      final cso e;

      f(Supplier<ArgumentType<?>> $$0, Function<dgw.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, dgw.h<T> $$3, cso $$4) {
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

      public void a(dgw.c $$0, dgw.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }

      public cso b() {
         return this.e;
      }
   }

   public abstract static class g<T extends dgw.g<T>> {
      protected final dgw.f<T> a;

      public g(dgw.f<T> $$0) {
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

   interface h<T extends dgw.g<T>> {
      void call(dgw.c var1, dgw.e<T> var2, dgw.f<T> var3);
   }
}
