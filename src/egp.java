import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class egp implements egq, egr {
   private static final Logger f = LogUtils.getLogger();
   public static final String a = "LevelName";
   protected static final String b = "Player";
   protected static final String c = "WorldGenSettings";
   private cts g;
   private final dpn h;
   private final egp.a i;
   private final Lifecycle j;
   private int k;
   private int l;
   private int m;
   private float n;
   private long o;
   private long p;
   @Nullable
   private final sn q;
   private final int r;
   private int s;
   private boolean t;
   private int u;
   private boolean v;
   private int w;
   private boolean x;
   private boolean y;
   private dkx.c z;
   private dms.a A;
   @Nullable
   private sn B;
   private int C;
   private int D;
   @Nullable
   private UUID E;
   private final Set<String> F;
   private boolean G;
   private final Set<String> H;
   private final elf<MinecraftServer> I;

   private egp(
      @Nullable sn $$0,
      boolean $$1,
      int $$2,
      int $$3,
      int $$4,
      float $$5,
      long $$6,
      long $$7,
      int $$8,
      int $$9,
      int $$10,
      boolean $$11,
      int $$12,
      boolean $$13,
      boolean $$14,
      boolean $$15,
      dkx.c $$16,
      int $$17,
      int $$18,
      @Nullable UUID $$19,
      Set<String> $$20,
      Set<String> $$21,
      elf<MinecraftServer> $$22,
      @Nullable sn $$23,
      dms.a $$24,
      cts $$25,
      dpn $$26,
      egp.a $$27,
      Lifecycle $$28
   ) {
      this.G = $$1;
      this.k = $$2;
      this.l = $$3;
      this.m = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
      this.r = $$8;
      this.s = $$9;
      this.u = $$10;
      this.t = $$11;
      this.w = $$12;
      this.v = $$13;
      this.x = $$14;
      this.y = $$15;
      this.z = $$16;
      this.C = $$17;
      this.D = $$18;
      this.E = $$19;
      this.F = $$20;
      this.H = $$21;
      this.q = $$0;
      this.I = $$22;
      this.B = $$23;
      this.A = $$24;
      this.g = $$25;
      this.h = $$26;
      this.i = $$27;
      this.j = $$28;
   }

   public egp(cts $$0, dpn $$1, egp.a $$2, Lifecycle $$3) {
      this(
         null,
         false,
         0,
         0,
         0,
         0.0F,
         0L,
         0L,
         19133,
         0,
         0,
         false,
         0,
         false,
         false,
         false,
         dkx.e,
         0,
         0,
         null,
         Sets.newLinkedHashSet(),
         new HashSet<>(),
         new elf<>(ele.a),
         null,
         dms.a.b,
         $$0.h(),
         $$1,
         $$2,
         $$3
      );
   }

   public static <T> egp a(Dynamic<T> $$0, cts $$1, egp.a $$2, dpn $$3, Lifecycle $$4) {
      long $$5 = $$0.get("Time").asLong(0L);
      return new egp(
         (sn)sn.a.parse($$0.get("Player").orElseEmptyMap()).result().orElse(null),
         $$0.get("WasModded").asBoolean(false),
         $$0.get("SpawnX").asInt(0),
         $$0.get("SpawnY").asInt(0),
         $$0.get("SpawnZ").asInt(0),
         $$0.get("SpawnAngle").asFloat(0.0F),
         $$5,
         $$0.get("DayTime").asLong($$5),
         egn.a($$0).a(),
         $$0.get("clearWeatherTime").asInt(0),
         $$0.get("rainTime").asInt(0),
         $$0.get("raining").asBoolean(false),
         $$0.get("thunderTime").asInt(0),
         $$0.get("thundering").asBoolean(false),
         $$0.get("initialized").asBoolean(true),
         $$0.get("DifficultyLocked").asBoolean(false),
         dkx.c.a($$0, dkx.e),
         $$0.get("WanderingTraderSpawnDelay").asInt(0),
         $$0.get("WanderingTraderSpawnChance").asInt(0),
         (UUID)$$0.get("WanderingTraderId").read(ja.a).result().orElse(null),
         $$0.get("ServerBrands").asStream().flatMap($$0x -> $$0x.asString().result().stream()).collect(Collectors.toCollection(Sets::newLinkedHashSet)),
         $$0.get("removed_features").asStream().flatMap($$0x -> $$0x.asString().result().stream()).collect(Collectors.toSet()),
         new elf<>(ele.a, $$0.get("ScheduledEvents").asStream()),
         (sn)$$0.get("CustomBossEvents").orElseEmptyMap().getValue(),
         $$0.get("DragonFight").read(dms.a.a).resultOrPartial(f::error).orElse(dms.a.b),
         $$1,
         $$3,
         $$2,
         $$4
      );
   }

   @Override
   public sn a(iu $$0, @Nullable sn $$1) {
      if ($$1 == null) {
         $$1 = this.q;
      }

      sn $$2 = new sn();
      this.a($$0, $$2, $$1);
      return $$2;
   }

   private void a(iu $$0, sn $$1, @Nullable sn $$2) {
      $$1.a("ServerBrands", a(this.F));
      $$1.a("WasModded", this.G);
      if (!this.H.isEmpty()) {
         $$1.a("removed_features", a(this.H));
      }

      sn $$3 = new sn();
      $$3.a("Name", aa.b().c());
      $$3.a("Id", aa.b().d().c());
      $$3.a("Snapshot", !aa.b().g());
      $$3.a("Series", aa.b().d().b());
      $$1.a("Version", $$3);
      tc.g($$1);
      DynamicOps<tk> $$4 = ahe.a(tb.a, $$0);
      dpl.a($$4, this.h, $$0).resultOrPartial(ac.a("WorldGenSettings: ", f::error)).ifPresent($$1x -> $$1.a("WorldGenSettings", $$1x));
      $$1.a("GameType", this.g.b().a());
      $$1.a("SpawnX", this.k);
      $$1.a("SpawnY", this.l);
      $$1.a("SpawnZ", this.m);
      $$1.a("SpawnAngle", this.n);
      $$1.a("Time", this.o);
      $$1.a("DayTime", this.p);
      $$1.a("LastPlayed", ac.d());
      $$1.a("LevelName", this.g.a());
      $$1.a("version", 19133);
      $$1.a("clearWeatherTime", this.s);
      $$1.a("rainTime", this.u);
      $$1.a("raining", this.t);
      $$1.a("thunderTime", this.w);
      $$1.a("thundering", this.v);
      $$1.a("hardcore", this.g.c());
      $$1.a("allowCommands", this.g.e());
      $$1.a("initialized", this.x);
      this.z.a($$1);
      $$1.a("Difficulty", (byte)this.g.d().a());
      $$1.a("DifficultyLocked", this.y);
      $$1.a("GameRules", this.g.f().a());
      $$1.a("DragonFight", ac.a(dms.a.a.encodeStart(tb.a, this.A), IllegalStateException::new));
      if ($$2 != null) {
         $$1.a("Player", $$2);
      }

      DataResult<tk> $$5 = cui.b.encodeStart(tb.a, this.g.g());
      $$5.get().ifLeft($$1x -> $$1.a((sn)$$1x)).ifRight($$0x -> f.warn("Failed to encode configuration {}", $$0x.message()));
      if (this.B != null) {
         $$1.a("CustomBossEvents", this.B);
      }

      $$1.a("ScheduledEvents", this.I.b());
      $$1.a("WanderingTraderSpawnDelay", this.C);
      $$1.a("WanderingTraderSpawnChance", this.D);
      if (this.E != null) {
         $$1.a("WanderingTraderId", this.E);
      }
   }

   private static st a(Set<String> $$0) {
      st $$1 = new st();
      $$0.stream().map(ti::a).forEach($$1::add);
      return $$1;
   }

   @Override
   public int a() {
      return this.k;
   }

   @Override
   public int b() {
      return this.l;
   }

   @Override
   public int c() {
      return this.m;
   }

   @Override
   public float d() {
      return this.n;
   }

   @Override
   public long e() {
      return this.o;
   }

   @Override
   public long f() {
      return this.p;
   }

   @Nullable
   @Override
   public sn y() {
      return this.q;
   }

   @Override
   public void b(int $$0) {
      this.k = $$0;
   }

   @Override
   public void c(int $$0) {
      this.l = $$0;
   }

   @Override
   public void d(int $$0) {
      this.m = $$0;
   }

   @Override
   public void a(float $$0) {
      this.n = $$0;
   }

   @Override
   public void a(long $$0) {
      this.o = $$0;
   }

   @Override
   public void b(long $$0) {
      this.p = $$0;
   }

   @Override
   public void a(hx $$0, float $$1) {
      this.k = $$0.u();
      this.l = $$0.v();
      this.m = $$0.w();
      this.n = $$1;
   }

   @Override
   public String g() {
      return this.g.a();
   }

   @Override
   public int z() {
      return this.r;
   }

   @Override
   public int h() {
      return this.s;
   }

   @Override
   public void a(int $$0) {
      this.s = $$0;
   }

   @Override
   public boolean i() {
      return this.v;
   }

   @Override
   public void a(boolean $$0) {
      this.v = $$0;
   }

   @Override
   public int j() {
      return this.w;
   }

   @Override
   public void e(int $$0) {
      this.w = $$0;
   }

   @Override
   public boolean k() {
      return this.t;
   }

   @Override
   public void b(boolean $$0) {
      this.t = $$0;
   }

   @Override
   public int l() {
      return this.u;
   }

   @Override
   public void f(int $$0) {
      this.u = $$0;
   }

   @Override
   public ctl m() {
      return this.g.b();
   }

   @Override
   public void a(ctl $$0) {
      this.g = this.g.a($$0);
   }

   @Override
   public boolean n() {
      return this.g.c();
   }

   @Override
   public boolean o() {
      return this.g.e();
   }

   @Override
   public boolean p() {
      return this.x;
   }

   @Override
   public void c(boolean $$0) {
      this.x = $$0;
   }

   @Override
   public ctk q() {
      return this.g.f();
   }

   @Override
   public dkx.c r() {
      return this.z;
   }

   @Override
   public void a(dkx.c $$0) {
      this.z = $$0;
   }

   @Override
   public bjx s() {
      return this.g.d();
   }

   @Override
   public void a(bjx $$0) {
      this.g = this.g.a($$0);
   }

   @Override
   public boolean t() {
      return this.y;
   }

   @Override
   public void d(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public elf<MinecraftServer> u() {
      return this.I;
   }

   @Override
   public void a(p $$0, ctq $$1) {
      egq.super.a($$0, $$1);
      egr.super.a($$0);
   }

   @Override
   public dpn A() {
      return this.h;
   }

   @Override
   public boolean B() {
      return this.i == egp.a.b;
   }

   @Override
   public boolean C() {
      return this.i == egp.a.c;
   }

   @Override
   public Lifecycle D() {
      return this.j;
   }

   @Override
   public dms.a E() {
      return this.A;
   }

   @Override
   public void a(dms.a $$0) {
      this.A = $$0;
   }

   @Override
   public cui F() {
      return this.g.g();
   }

   @Override
   public void a(cui $$0) {
      this.g = this.g.a($$0);
   }

   @Nullable
   @Override
   public sn G() {
      return this.B;
   }

   @Override
   public void a(@Nullable sn $$0) {
      this.B = $$0;
   }

   @Override
   public int v() {
      return this.C;
   }

   @Override
   public void g(int $$0) {
      this.C = $$0;
   }

   @Override
   public int w() {
      return this.D;
   }

   @Override
   public void h(int $$0) {
      this.D = $$0;
   }

   @Nullable
   @Override
   public UUID x() {
      return this.E;
   }

   @Override
   public void a(UUID $$0) {
      this.E = $$0;
   }

   @Override
   public void a(String $$0, boolean $$1) {
      this.F.add($$0);
      this.G |= $$1;
   }

   @Override
   public boolean H() {
      return this.G;
   }

   @Override
   public Set<String> I() {
      return ImmutableSet.copyOf(this.F);
   }

   @Override
   public Set<String> J() {
      return Set.copyOf(this.H);
   }

   @Override
   public egq K() {
      return this;
   }

   @Override
   public cts L() {
      return this.g.h();
   }

   @Deprecated
   public static enum a {
      a,
      b,
      c;
   }
}
