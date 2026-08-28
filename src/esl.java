import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
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

public class esl implements esm, esn {
   private static final Logger f = LogUtils.getLogger();
   public static final String a = "LevelName";
   protected static final String b = "Player";
   protected static final String c = "WorldGenSettings";
   private ddw g;
   private final eau h;
   private final esl.a i;
   private final Lifecycle j;
   private je k;
   private float l;
   private long m;
   private long n;
   @Nullable
   private final uf o;
   private final int p;
   private int q;
   private boolean r;
   private int s;
   private boolean t;
   private int u;
   private boolean v;
   private boolean w;
   private dvr.c x;
   private dxz.a y;
   @Nullable
   private uf z;
   private int A;
   private int B;
   @Nullable
   private UUID C;
   private final Set<String> D;
   private boolean E;
   private final Set<String> F;
   private final exr<MinecraftServer> G;

   private esl(
      @Nullable uf $$0,
      boolean $$1,
      je $$2,
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
      dvr.c $$14,
      int $$15,
      int $$16,
      @Nullable UUID $$17,
      Set<String> $$18,
      Set<String> $$19,
      exr<MinecraftServer> $$20,
      @Nullable uf $$21,
      dxz.a $$22,
      ddw $$23,
      eau $$24,
      esl.a $$25,
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

   public esl(ddw $$0, eau $$1, esl.a $$2, Lifecycle $$3) {
      this(
         null,
         false,
         je.c,
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
         dvr.d,
         0,
         0,
         null,
         Sets.newLinkedHashSet(),
         new HashSet<>(),
         new exr<>(exq.a),
         null,
         dxz.a.b,
         $$0.h(),
         $$1,
         $$2,
         $$3
      );
   }

   public static <T> esl a(Dynamic<T> $$0, ddw $$1, esl.a $$2, eau $$3, Lifecycle $$4) {
      long $$5 = $$0.get("Time").asLong(0L);
      return new esl(
         (uf)$$0.get("Player").flatMap(uf.a::parse).result().orElse(null),
         $$0.get("WasModded").asBoolean(false),
         new je($$0.get("SpawnX").asInt(0), $$0.get("SpawnY").asInt(0), $$0.get("SpawnZ").asInt(0)),
         $$0.get("SpawnAngle").asFloat(0.0F),
         $$5,
         $$0.get("DayTime").asLong($$5),
         esj.a($$0).a(),
         $$0.get("clearWeatherTime").asInt(0),
         $$0.get("rainTime").asInt(0),
         $$0.get("raining").asBoolean(false),
         $$0.get("thunderTime").asInt(0),
         $$0.get("thundering").asBoolean(false),
         $$0.get("initialized").asBoolean(true),
         $$0.get("DifficultyLocked").asBoolean(false),
         dvr.c.a($$0, dvr.d),
         $$0.get("WanderingTraderSpawnDelay").asInt(0),
         $$0.get("WanderingTraderSpawnChance").asInt(0),
         (UUID)$$0.get("WanderingTraderId").read(kh.a).result().orElse(null),
         $$0.get("ServerBrands").asStream().flatMap($$0x -> $$0x.asString().result().stream()).collect(Collectors.toCollection(Sets::newLinkedHashSet)),
         $$0.get("removed_features").asStream().flatMap($$0x -> $$0x.asString().result().stream()).collect(Collectors.toSet()),
         new exr<>(exq.a, $$0.get("ScheduledEvents").asStream()),
         (uf)$$0.get("CustomBossEvents").orElseEmptyMap().getValue(),
         $$0.get("DragonFight").read(dxz.a.a).resultOrPartial(f::error).orElse(dxz.a.b),
         $$1,
         $$3,
         $$2,
         $$4
      );
   }

   @Override
   public uf a(kb $$0, @Nullable uf $$1) {
      if ($$1 == null) {
         $$1 = this.o;
      }

      uf $$2 = new uf();
      this.a($$0, $$2, $$1);
      return $$2;
   }

   private void a(kb $$0, uf $$1, @Nullable uf $$2) {
      $$1.a("ServerBrands", a(this.D));
      $$1.a("WasModded", this.E);
      if (!this.F.isEmpty()) {
         $$1.a("removed_features", a(this.F));
      }

      uf $$3 = new uf();
      $$3.a("Name", ab.b().c());
      $$3.a("Id", ab.b().d().c());
      $$3.a("Snapshot", !ab.b().g());
      $$3.a("Series", ab.b().d().b());
      $$1.a("Version", $$3);
      uu.e($$1);
      DynamicOps<vc> $$4 = $$0.a(ut.a);
      eas.a($$4, this.h, $$0).resultOrPartial(ad.a("WorldGenSettings: ", f::error)).ifPresent($$1x -> $$1.a("WorldGenSettings", $$1x));
      $$1.a("GameType", this.g.b().a());
      $$1.a("SpawnX", this.k.u());
      $$1.a("SpawnY", this.k.v());
      $$1.a("SpawnZ", this.k.w());
      $$1.a("SpawnAngle", this.l);
      $$1.a("Time", this.m);
      $$1.a("DayTime", this.n);
      $$1.a("LastPlayed", ad.e());
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
      $$1.a("DragonFight", (vc)dxz.a.a.encodeStart(ut.a, this.y).getOrThrow());
      if ($$2 != null) {
         $$1.a("Player", $$2);
      }

      deo.b.encodeStart(ut.a, this.g.g()).ifSuccess($$1x -> $$1.a((uf)$$1x)).ifError($$0x -> f.warn("Failed to encode configuration {}", $$0x.message()));
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

   private static ul a(Set<String> $$0) {
      ul $$1 = new ul();
      $$0.stream().map(va::a).forEach($$1::add);
      return $$1;
   }

   @Override
   public je a() {
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
   public uf w() {
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
   public void a(je $$0, float $$1) {
      this.k = $$0.j();
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
   public ddp k() {
      return this.g.b();
   }

   @Override
   public void a(ddp $$0) {
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
   public ddo o() {
      return this.g.f();
   }

   @Override
   public dvr.c p() {
      return this.x;
   }

   @Override
   public void a(dvr.c $$0) {
      this.x = $$0;
   }

   @Override
   public brh q() {
      return this.g.d();
   }

   @Override
   public void a(brh $$0) {
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
   public exr<MinecraftServer> s() {
      return this.G;
   }

   @Override
   public void a(p $$0, ddu $$1) {
      esm.super.a($$0, $$1);
      esn.super.a($$0);
   }

   @Override
   public eau y() {
      return this.h;
   }

   @Override
   public boolean z() {
      return this.i == esl.a.b;
   }

   @Override
   public boolean A() {
      return this.i == esl.a.c;
   }

   @Override
   public Lifecycle B() {
      return this.j;
   }

   @Override
   public dxz.a C() {
      return this.y;
   }

   @Override
   public void a(dxz.a $$0) {
      this.y = $$0;
   }

   @Override
   public deo D() {
      return this.g.g();
   }

   @Override
   public void a(deo $$0) {
      this.g = this.g.a($$0);
   }

   @Nullable
   @Override
   public uf E() {
      return this.z;
   }

   @Override
   public void a(@Nullable uf $$0) {
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
   public esm I() {
      return this;
   }

   @Override
   public ddw J() {
      return this.g.h();
   }

   @Deprecated
   public static enum a {
      a,
      b,
      c;
   }
}
