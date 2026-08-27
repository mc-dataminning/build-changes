import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFixer;
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

public class ebz implements eca, ecb {
   private static final Logger e = LogUtils.getLogger();
   protected static final String a = "Player";
   protected static final String b = "WorldGenSettings";
   private cpo f;
   private final dlf g;
   private final ebz.a h;
   private final Lifecycle i;
   private int j;
   private int k;
   private int l;
   private float m;
   private long n;
   private long o;
   @Nullable
   private final DataFixer p;
   private final int q;
   private boolean r;
   @Nullable
   private qs s;
   private final int t;
   private int u;
   private boolean v;
   private int w;
   private boolean x;
   private int y;
   private boolean z;
   private boolean A;
   private dgp.c B;
   private dik.a C;
   @Nullable
   private qs D;
   private int E;
   private int F;
   @Nullable
   private UUID G;
   private final Set<String> H;
   private boolean I;
   private final Set<String> J;
   private final egs<MinecraftServer> K;

   private ebz(
      @Nullable DataFixer $$0,
      int $$1,
      @Nullable qs $$2,
      boolean $$3,
      int $$4,
      int $$5,
      int $$6,
      float $$7,
      long $$8,
      long $$9,
      int $$10,
      int $$11,
      int $$12,
      boolean $$13,
      int $$14,
      boolean $$15,
      boolean $$16,
      boolean $$17,
      dgp.c $$18,
      int $$19,
      int $$20,
      @Nullable UUID $$21,
      Set<String> $$22,
      Set<String> $$23,
      egs<MinecraftServer> $$24,
      @Nullable qs $$25,
      dik.a $$26,
      cpo $$27,
      dlf $$28,
      ebz.a $$29,
      Lifecycle $$30
   ) {
      this.p = $$0;
      this.I = $$3;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.m = $$7;
      this.n = $$8;
      this.o = $$9;
      this.t = $$10;
      this.u = $$11;
      this.w = $$12;
      this.v = $$13;
      this.y = $$14;
      this.x = $$15;
      this.z = $$16;
      this.A = $$17;
      this.B = $$18;
      this.E = $$19;
      this.F = $$20;
      this.G = $$21;
      this.H = $$22;
      this.J = $$23;
      this.s = $$2;
      this.q = $$1;
      this.K = $$24;
      this.D = $$25;
      this.C = $$26;
      this.f = $$27;
      this.g = $$28;
      this.h = $$29;
      this.i = $$30;
   }

   public ebz(cpo $$0, dlf $$1, ebz.a $$2, Lifecycle $$3) {
      this(
         null,
         aa.b().d().c(),
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
         dgp.e,
         0,
         0,
         null,
         Sets.newLinkedHashSet(),
         new HashSet<>(),
         new egs<>(egr.a),
         null,
         dik.a.b,
         $$0.h(),
         $$1,
         $$2,
         $$3
      );
   }

   public static <T> ebz a(Dynamic<T> $$0, DataFixer $$1, int $$2, @Nullable qs $$3, cpo $$4, ebx $$5, ebz.a $$6, dlf $$7, Lifecycle $$8) {
      long $$9 = $$0.get("Time").asLong(0L);
      return new ebz(
         $$1,
         $$2,
         $$3,
         $$0.get("WasModded").asBoolean(false),
         $$0.get("SpawnX").asInt(0),
         $$0.get("SpawnY").asInt(0),
         $$0.get("SpawnZ").asInt(0),
         $$0.get("SpawnAngle").asFloat(0.0F),
         $$9,
         $$0.get("DayTime").asLong($$9),
         $$5.a(),
         $$0.get("clearWeatherTime").asInt(0),
         $$0.get("rainTime").asInt(0),
         $$0.get("raining").asBoolean(false),
         $$0.get("thunderTime").asInt(0),
         $$0.get("thundering").asBoolean(false),
         $$0.get("initialized").asBoolean(true),
         $$0.get("DifficultyLocked").asBoolean(false),
         dgp.c.a($$0, dgp.e),
         $$0.get("WanderingTraderSpawnDelay").asInt(0),
         $$0.get("WanderingTraderSpawnChance").asInt(0),
         (UUID)$$0.get("WanderingTraderId").read(hz.a).result().orElse(null),
         $$0.get("ServerBrands").asStream().flatMap($$0x -> $$0x.asString().result().stream()).collect(Collectors.toCollection(Sets::newLinkedHashSet)),
         $$0.get("removed_features").asStream().flatMap($$0x -> $$0x.asString().result().stream()).collect(Collectors.toSet()),
         new egs<>(egr.a, $$0.get("ScheduledEvents").asStream()),
         (qs)$$0.get("CustomBossEvents").orElseEmptyMap().getValue(),
         $$0.get("DragonFight").read(dik.a.a).resultOrPartial(e::error).orElse(dik.a.b),
         $$4,
         $$7,
         $$6,
         $$8
      );
   }

   @Override
   public qs a(ht $$0, @Nullable qs $$1) {
      this.N();
      if ($$1 == null) {
         $$1 = this.s;
      }

      qs $$2 = new qs();
      this.a($$0, $$2, $$1);
      return $$2;
   }

   private void a(ht $$0, qs $$1, @Nullable qs $$2) {
      $$1.a("ServerBrands", a(this.H));
      $$1.a("WasModded", this.I);
      if (!this.J.isEmpty()) {
         $$1.a("removed_features", a(this.J));
      }

      qs $$3 = new qs();
      $$3.a("Name", aa.b().c());
      $$3.a("Id", aa.b().d().c());
      $$3.a("Snapshot", !aa.b().g());
      $$3.a("Series", aa.b().d().b());
      $$1.a("Version", $$3);
      re.g($$1);
      DynamicOps<rl> $$4 = aen.a(rd.a, $$0);
      dld.a($$4, this.g, $$0).resultOrPartial(ac.a("WorldGenSettings: ", e::error)).ifPresent($$1x -> $$1.a("WorldGenSettings", $$1x));
      $$1.a("GameType", this.f.b().a());
      $$1.a("SpawnX", this.j);
      $$1.a("SpawnY", this.k);
      $$1.a("SpawnZ", this.l);
      $$1.a("SpawnAngle", this.m);
      $$1.a("Time", this.n);
      $$1.a("DayTime", this.o);
      $$1.a("LastPlayed", ac.d());
      $$1.a("LevelName", this.f.a());
      $$1.a("version", 19133);
      $$1.a("clearWeatherTime", this.u);
      $$1.a("rainTime", this.w);
      $$1.a("raining", this.v);
      $$1.a("thunderTime", this.y);
      $$1.a("thundering", this.x);
      $$1.a("hardcore", this.f.c());
      $$1.a("allowCommands", this.f.e());
      $$1.a("initialized", this.z);
      this.B.a($$1);
      $$1.a("Difficulty", (byte)this.f.d().a());
      $$1.a("DifficultyLocked", this.A);
      $$1.a("GameRules", this.f.f().a());
      $$1.a("DragonFight", ac.a(dik.a.a.encodeStart(rd.a, this.C), IllegalStateException::new));
      if ($$2 != null) {
         $$1.a("Player", $$2);
      }

      DataResult<rl> $$5 = cqd.b.encodeStart(rd.a, this.f.g());
      $$5.get().ifLeft($$1x -> $$1.a((qs)$$1x)).ifRight($$0x -> e.warn("Failed to encode configuration {}", $$0x.message()));
      if (this.D != null) {
         $$1.a("CustomBossEvents", this.D);
      }

      $$1.a("ScheduledEvents", this.K.b());
      $$1.a("WanderingTraderSpawnDelay", this.E);
      $$1.a("WanderingTraderSpawnChance", this.F);
      if (this.G != null) {
         $$1.a("WanderingTraderId", this.G);
      }
   }

   private static qy a(Set<String> $$0) {
      qy $$1 = new qy();
      $$0.stream().map(rj::a).forEach($$1::add);
      return $$1;
   }

   @Override
   public int a() {
      return this.j;
   }

   @Override
   public int b() {
      return this.k;
   }

   @Override
   public int c() {
      return this.l;
   }

   @Override
   public float d() {
      return this.m;
   }

   @Override
   public long e() {
      return this.n;
   }

   @Override
   public long f() {
      return this.o;
   }

   private void N() {
      if (!this.r && this.s != null) {
         if (this.q < aa.b().d().c()) {
            if (this.p == null) {
               throw (NullPointerException)ac.b(new NullPointerException("Fixer Upper not set inside LevelData, and the player tag is not upgraded."));
            }

            this.s = asq.b.a(this.p, this.s, this.q);
         }

         this.r = true;
      }
   }

   @Override
   public qs y() {
      this.N();
      return this.s;
   }

   @Override
   public void b(int $$0) {
      this.j = $$0;
   }

   @Override
   public void c(int $$0) {
      this.k = $$0;
   }

   @Override
   public void d(int $$0) {
      this.l = $$0;
   }

   @Override
   public void a(float $$0) {
      this.m = $$0;
   }

   @Override
   public void a(long $$0) {
      this.n = $$0;
   }

   @Override
   public void b(long $$0) {
      this.o = $$0;
   }

   @Override
   public void a(gv $$0, float $$1) {
      this.j = $$0.u();
      this.k = $$0.v();
      this.l = $$0.w();
      this.m = $$1;
   }

   @Override
   public String g() {
      return this.f.a();
   }

   @Override
   public int z() {
      return this.t;
   }

   @Override
   public int h() {
      return this.u;
   }

   @Override
   public void a(int $$0) {
      this.u = $$0;
   }

   @Override
   public boolean i() {
      return this.x;
   }

   @Override
   public void a(boolean $$0) {
      this.x = $$0;
   }

   @Override
   public int j() {
      return this.y;
   }

   @Override
   public void e(int $$0) {
      this.y = $$0;
   }

   @Override
   public boolean k() {
      return this.v;
   }

   @Override
   public void b(boolean $$0) {
      this.v = $$0;
   }

   @Override
   public int l() {
      return this.w;
   }

   @Override
   public void f(int $$0) {
      this.w = $$0;
   }

   @Override
   public cph m() {
      return this.f.b();
   }

   @Override
   public void a(cph $$0) {
      this.f = this.f.a($$0);
   }

   @Override
   public boolean n() {
      return this.f.c();
   }

   @Override
   public boolean o() {
      return this.f.e();
   }

   @Override
   public boolean p() {
      return this.z;
   }

   @Override
   public void c(boolean $$0) {
      this.z = $$0;
   }

   @Override
   public cpg q() {
      return this.f.f();
   }

   @Override
   public dgp.c r() {
      return this.B;
   }

   @Override
   public void a(dgp.c $$0) {
      this.B = $$0;
   }

   @Override
   public bgl s() {
      return this.f.d();
   }

   @Override
   public void a(bgl $$0) {
      this.f = this.f.a($$0);
   }

   @Override
   public boolean t() {
      return this.A;
   }

   @Override
   public void d(boolean $$0) {
      this.A = $$0;
   }

   @Override
   public egs<MinecraftServer> u() {
      return this.K;
   }

   @Override
   public void a(p $$0, cpm $$1) {
      eca.super.a($$0, $$1);
      ecb.super.a($$0);
   }

   @Override
   public dlf A() {
      return this.g;
   }

   @Override
   public boolean B() {
      return this.h == ebz.a.b;
   }

   @Override
   public boolean C() {
      return this.h == ebz.a.c;
   }

   @Override
   public Lifecycle D() {
      return this.i;
   }

   @Override
   public dik.a E() {
      return this.C;
   }

   @Override
   public void a(dik.a $$0) {
      this.C = $$0;
   }

   @Override
   public cqd F() {
      return this.f.g();
   }

   @Override
   public void a(cqd $$0) {
      this.f = this.f.a($$0);
   }

   @Nullable
   @Override
   public qs G() {
      return this.D;
   }

   @Override
   public void a(@Nullable qs $$0) {
      this.D = $$0;
   }

   @Override
   public int v() {
      return this.E;
   }

   @Override
   public void g(int $$0) {
      this.E = $$0;
   }

   @Override
   public int w() {
      return this.F;
   }

   @Override
   public void h(int $$0) {
      this.F = $$0;
   }

   @Nullable
   @Override
   public UUID x() {
      return this.G;
   }

   @Override
   public void a(UUID $$0) {
      this.G = $$0;
   }

   @Override
   public void a(String $$0, boolean $$1) {
      this.H.add($$0);
      this.I |= $$1;
   }

   @Override
   public boolean H() {
      return this.I;
   }

   @Override
   public Set<String> I() {
      return ImmutableSet.copyOf(this.H);
   }

   @Override
   public Set<String> J() {
      return Set.copyOf(this.J);
   }

   @Override
   public eca K() {
      return this;
   }

   @Override
   public cpo L() {
      return this.f.h();
   }

   @Deprecated
   public static enum a {
      a,
      b,
      c;
   }
}
