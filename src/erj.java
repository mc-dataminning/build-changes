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

public class erj implements erk, erl {
   private static final Logger f = LogUtils.getLogger();
   public static final String a = "LevelName";
   protected static final String b = "Player";
   protected static final String c = "WorldGenSettings";
   private dce g;
   private final dzs h;
   private final erj.a i;
   private final Lifecycle j;
   private ir k;
   private float l;
   private long m;
   private long n;
   @Nullable
   private final uk o;
   private final int p;
   private int q;
   private boolean r;
   private int s;
   private boolean t;
   private int u;
   private boolean v;
   private boolean w;
   private dut.c x;
   private dwx.a y;
   @Nullable
   private uk z;
   private int A;
   private int B;
   @Nullable
   private UUID C;
   private final Set<String> D;
   private boolean E;
   private final Set<String> F;
   private final ewh<MinecraftServer> G;

   private erj(
      @Nullable uk $$0,
      boolean $$1,
      ir $$2,
      float $$3,
      long $$4,
      long $$5,
      int $$6,
      int $$7,
      int $$8,
      boolean $$9,
      int $$10,
      boolean $$11,
      boolean $$12,
      boolean $$13,
      dut.c $$14,
      int $$15,
      int $$16,
      @Nullable UUID $$17,
      Set<String> $$18,
      Set<String> $$19,
      ewh<MinecraftServer> $$20,
      @Nullable uk $$21,
      dwx.a $$22,
      dce $$23,
      dzs $$24,
      erj.a $$25,
      Lifecycle $$26
   ) {
      this.E = $$1;
      this.k = $$2;
      this.l = $$3;
      this.m = $$4;
      this.n = $$5;
      this.p = $$6;
      this.q = $$7;
      this.s = $$8;
      this.r = $$9;
      this.u = $$10;
      this.t = $$11;
      this.v = $$12;
      this.w = $$13;
      this.x = $$14;
      this.A = $$15;
      this.B = $$16;
      this.C = $$17;
      this.D = $$18;
      this.F = $$19;
      this.o = $$0;
      this.G = $$20;
      this.z = $$21;
      this.y = $$22;
      this.g = $$23;
      this.h = $$24;
      this.i = $$25;
      this.j = $$26;
   }

   public erj(dce $$0, dzs $$1, erj.a $$2, Lifecycle $$3) {
      this(
         null,
         false,
         ir.c,
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
         dut.e,
         0,
         0,
         null,
         Sets.newLinkedHashSet(),
         new HashSet<>(),
         new ewh<>(ewg.a),
         null,
         dwx.a.b,
         $$0.h(),
         $$1,
         $$2,
         $$3
      );
   }

   public static <T> erj a(Dynamic<T> $$0, dce $$1, erj.a $$2, dzs $$3, Lifecycle $$4) {
      long $$5 = $$0.get("Time").asLong(0L);
      return new erj(
         (uk)uk.a.parse($$0.get("Player").orElseEmptyMap()).result().orElse(null),
         $$0.get("WasModded").asBoolean(false),
         new ir($$0.get("SpawnX").asInt(0), $$0.get("SpawnY").asInt(0), $$0.get("SpawnZ").asInt(0)),
         $$0.get("SpawnAngle").asFloat(0.0F),
         $$5,
         $$0.get("DayTime").asLong($$5),
         erh.a($$0).a(),
         $$0.get("clearWeatherTime").asInt(0),
         $$0.get("rainTime").asInt(0),
         $$0.get("raining").asBoolean(false),
         $$0.get("thunderTime").asInt(0),
         $$0.get("thundering").asBoolean(false),
         $$0.get("initialized").asBoolean(true),
         $$0.get("DifficultyLocked").asBoolean(false),
         dut.c.a($$0, dut.e),
         $$0.get("WanderingTraderSpawnDelay").asInt(0),
         $$0.get("WanderingTraderSpawnChance").asInt(0),
         (UUID)$$0.get("WanderingTraderId").read(ju.a).result().orElse(null),
         $$0.get("ServerBrands").asStream().flatMap($$0x -> $$0x.asString().result().stream()).collect(Collectors.toCollection(Sets::newLinkedHashSet)),
         $$0.get("removed_features").asStream().flatMap($$0x -> $$0x.asString().result().stream()).collect(Collectors.toSet()),
         new ewh<>(ewg.a, $$0.get("ScheduledEvents").asStream()),
         (uk)$$0.get("CustomBossEvents").orElseEmptyMap().getValue(),
         $$0.get("DragonFight").read(dwx.a.a).resultOrPartial(f::error).orElse(dwx.a.b),
         $$1,
         $$3,
         $$2,
         $$4
      );
   }

   @Override
   public uk a(jo $$0, @Nullable uk $$1) {
      if ($$1 == null) {
         $$1 = this.o;
      }

      uk $$2 = new uk();
      this.a($$0, $$2, $$1);
      return $$2;
   }

   private void a(jo $$0, uk $$1, @Nullable uk $$2) {
      $$1.a("ServerBrands", a(this.D));
      $$1.a("WasModded", this.E);
      if (!this.F.isEmpty()) {
         $$1.a("removed_features", a(this.F));
      }

      uk $$3 = new uk();
      $$3.a("Name", ab.b().c());
      $$3.a("Id", ab.b().d().c());
      $$3.a("Snapshot", !ab.b().g());
      $$3.a("Series", ab.b().d().b());
      $$1.a("Version", $$3);
      uz.e($$1);
      DynamicOps<vh> $$4 = $$0.a(uy.a);
      dzq.a($$4, this.h, $$0).resultOrPartial(ad.a("WorldGenSettings: ", f::error)).ifPresent($$1x -> $$1.a("WorldGenSettings", $$1x));
      $$1.a("GameType", this.g.b().a());
      $$1.a("SpawnX", this.k.u());
      $$1.a("SpawnY", this.k.v());
      $$1.a("SpawnZ", this.k.w());
      $$1.a("SpawnAngle", this.l);
      $$1.a("Time", this.m);
      $$1.a("DayTime", this.n);
      $$1.a("LastPlayed", ad.d());
      $$1.a("LevelName", this.g.a());
      $$1.a("version", 19133);
      $$1.a("clearWeatherTime", this.q);
      $$1.a("rainTime", this.s);
      $$1.a("raining", this.r);
      $$1.a("thunderTime", this.u);
      $$1.a("thundering", this.t);
      $$1.a("hardcore", this.g.c());
      $$1.a("allowCommands", this.g.e());
      $$1.a("initialized", this.v);
      this.x.a($$1);
      $$1.a("Difficulty", (byte)this.g.d().a());
      $$1.a("DifficultyLocked", this.w);
      $$1.a("GameRules", this.g.f().a());
      $$1.a("DragonFight", ad.a(dwx.a.a.encodeStart(uy.a, this.y), IllegalStateException::new));
      if ($$2 != null) {
         $$1.a("Player", $$2);
      }

      DataResult<vh> $$5 = dcu.b.encodeStart(uy.a, this.g.g());
      $$5.get().ifLeft($$1x -> $$1.a((uk)$$1x)).ifRight($$0x -> f.warn("Failed to encode configuration {}", $$0x.message()));
      if (this.z != null) {
         $$1.a("CustomBossEvents", this.z);
      }

      $$1.a("ScheduledEvents", this.G.b());
      $$1.a("WanderingTraderSpawnDelay", this.A);
      $$1.a("WanderingTraderSpawnChance", this.B);
      if (this.C != null) {
         $$1.a("WanderingTraderId", this.C);
      }
   }

   private static uq a(Set<String> $$0) {
      uq $$1 = new uq();
      $$0.stream().map(vf::a).forEach($$1::add);
      return $$1;
   }

   @Override
   public ir a() {
      return this.k;
   }

   @Override
   public float b() {
      return this.l;
   }

   @Override
   public long c() {
      return this.m;
   }

   @Override
   public long d() {
      return this.n;
   }

   @Nullable
   @Override
   public uk w() {
      return this.o;
   }

   @Override
   public void a(long $$0) {
      this.m = $$0;
   }

   @Override
   public void b(long $$0) {
      this.n = $$0;
   }

   @Override
   public void a(ir $$0, float $$1) {
      this.k = $$0.i();
      this.l = $$1;
   }

   @Override
   public String e() {
      return this.g.a();
   }

   @Override
   public int x() {
      return this.p;
   }

   @Override
   public int f() {
      return this.q;
   }

   @Override
   public void a(int $$0) {
      this.q = $$0;
   }

   @Override
   public boolean g() {
      return this.t;
   }

   @Override
   public void a(boolean $$0) {
      this.t = $$0;
   }

   @Override
   public int h() {
      return this.u;
   }

   @Override
   public void b(int $$0) {
      this.u = $$0;
   }

   @Override
   public boolean i() {
      return this.r;
   }

   @Override
   public void b(boolean $$0) {
      this.r = $$0;
   }

   @Override
   public int j() {
      return this.s;
   }

   @Override
   public void c(int $$0) {
      this.s = $$0;
   }

   @Override
   public dbx k() {
      return this.g.b();
   }

   @Override
   public void a(dbx $$0) {
      this.g = this.g.a($$0);
   }

   @Override
   public boolean l() {
      return this.g.c();
   }

   @Override
   public boolean m() {
      return this.g.e();
   }

   @Override
   public boolean n() {
      return this.v;
   }

   @Override
   public void c(boolean $$0) {
      this.v = $$0;
   }

   @Override
   public dbw o() {
      return this.g.f();
   }

   @Override
   public dut.c p() {
      return this.x;
   }

   @Override
   public void a(dut.c $$0) {
      this.x = $$0;
   }

   @Override
   public bpx q() {
      return this.g.d();
   }

   @Override
   public void a(bpx $$0) {
      this.g = this.g.a($$0);
   }

   @Override
   public boolean r() {
      return this.w;
   }

   @Override
   public void d(boolean $$0) {
      this.w = $$0;
   }

   @Override
   public ewh<MinecraftServer> s() {
      return this.G;
   }

   @Override
   public void a(p $$0, dcc $$1) {
      erk.super.a($$0, $$1);
      erl.super.a($$0);
   }

   @Override
   public dzs y() {
      return this.h;
   }

   @Override
   public boolean z() {
      return this.i == erj.a.b;
   }

   @Override
   public boolean A() {
      return this.i == erj.a.c;
   }

   @Override
   public Lifecycle B() {
      return this.j;
   }

   @Override
   public dwx.a C() {
      return this.y;
   }

   @Override
   public void a(dwx.a $$0) {
      this.y = $$0;
   }

   @Override
   public dcu D() {
      return this.g.g();
   }

   @Override
   public void a(dcu $$0) {
      this.g = this.g.a($$0);
   }

   @Nullable
   @Override
   public uk E() {
      return this.z;
   }

   @Override
   public void a(@Nullable uk $$0) {
      this.z = $$0;
   }

   @Override
   public int t() {
      return this.A;
   }

   @Override
   public void d(int $$0) {
      this.A = $$0;
   }

   @Override
   public int u() {
      return this.B;
   }

   @Override
   public void e(int $$0) {
      this.B = $$0;
   }

   @Nullable
   @Override
   public UUID v() {
      return this.C;
   }

   @Override
   public void a(UUID $$0) {
      this.C = $$0;
   }

   @Override
   public void a(String $$0, boolean $$1) {
      this.D.add($$0);
      this.E |= $$1;
   }

   @Override
   public boolean F() {
      return this.E;
   }

   @Override
   public Set<String> G() {
      return ImmutableSet.copyOf(this.D);
   }

   @Override
   public Set<String> H() {
      return Set.copyOf(this.F);
   }

   @Override
   public erk I() {
      return this;
   }

   @Override
   public dce J() {
      return this.g.h();
   }

   @Deprecated
   public static enum a {
      a,
      b,
      c;
   }
}
