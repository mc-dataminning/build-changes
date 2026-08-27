import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ara implements dcv {
   private static final Logger a = LogUtils.getLogger();
   private final List<duy> b;
   private final duy c;
   private final int d;
   private final aqt e;
   private final long f;
   private final erb g;
   private final ayt h;
   private final dwu i;
   private final eyq<dfc> j = new eyq<>($$0x -> this.y($$0x).p());
   private final eyq<epd> k = new eyq<>($$0x -> this.y($$0x).q());
   private final ddb l;
   private final dbh m;
   private final dbh n;
   private final dvx o;
   private final int p;
   @Nullable
   private Supplier<String> q;
   private final AtomicLong r = new AtomicLong();
   private static final akt s = new akt("worldgen_region_random");

   public ara(aqt $$0, List<duy> $$1, dvx $$2, int $$3) {
      this.o = $$2;
      this.p = $$3;
      int $$4 = aym.a(Math.sqrt((double)$$1.size()));
      if ($$4 * $$4 != $$1.size()) {
         throw (IllegalStateException)ad.b(new IllegalStateException("Cache size is not a square."));
      } else {
         this.b = $$1;
         this.c = $$1.get($$1.size() / 2);
         this.d = $$4;
         this.e = $$0;
         this.f = $$0.C();
         this.g = $$0.B_();
         this.h = $$0.l().i().a(s).a(this.c.g().l());
         this.i = $$0.E_();
         this.l = new ddb(this, ddb.a(this.f));
         this.m = $$1.get(0).g();
         this.n = $$1.get($$1.size() - 1).g();
      }
   }

   public boolean a(dbh $$0, int $$1) {
      return this.e.l().a.b($$0, $$1);
   }

   public dbh a() {
      return this.c.g();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.q = $$0;
   }

   @Override
   public duy a_(int $$0, int $$1) {
      return this.a($$0, $$1, dvx.c);
   }

   @Override
   public boolean z_() {
      return this.e.z_();
   }

   @Nullable
   @Override
   public duy a(int $$0, int $$1, dvx $$2, boolean $$3) {
      duy $$6;
      if (this.b($$0, $$1)) {
         int $$4 = $$0 - this.m.e;
         int $$5 = $$1 - this.m.f;
         $$6 = this.b.get($$4 + $$5 * this.d);
         if ($$6.k().b($$2)) {
            return $$6;
         }
      } else {
         $$6 = null;
      }

      o $$8 = o.a(new IllegalStateException("Requested chunk unavailable during world generation"), "Exception generating new chunk");
      p $$9 = $$8.a("Chunk request details");
      $$9.a("Requested chunk", String.format(Locale.ROOT, "%d, %d", $$0, $$1));
      $$9.a("Requested status", () -> lh.n.b($$2).toString());
      $$9.a("Actual status", () -> $$6 == null ? "[out of region bounds]" : lh.n.b($$6.k()).toString());
      $$9.a("loadOrGenerate", $$3);
      $$9.a("Generating chunk", () -> this.c.g().toString());
      $$9.a("Region start", this.m);
      $$9.a("Region end", this.n);
      throw new z($$8);
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return $$0 >= this.m.e && $$0 <= this.n.e && $$1 >= this.m.f && $$1 <= this.n.f;
   }

   @Override
   public dtc a_(ir $$0) {
      return this.a_(jt.a($$0.u()), jt.a($$0.w())).a_($$0);
   }

   @Override
   public epe b_(ir $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cly a(double $$0, double $$1, double $$2, double $$3, Predicate<brv> $$4) {
      return null;
   }

   @Override
   public int C_() {
      return 0;
   }

   @Override
   public ddb G_() {
      return this.l;
   }

   @Override
   public ja<dcz> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(iw $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eot y_() {
      return this.e.y_();
   }

   @Override
   public boolean a(ir $$0, boolean $$1, @Nullable brv $$2, int $$3) {
      dtc $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dqc $$5 = $$4.t() ? this.c_($$0) : null;
            dfc.a($$4, (dca)this.e, $$0, $$5, $$2, cuh.i);
         }

         return this.a($$0, dfe.a.n(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dqc c_(ir $$0) {
      duy $$1 = this.y($$0);
      dqc $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         uk $$3 = $$1.f($$0);
         dtc $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((dhw)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dqc.a($$0, $$4, $$3, this.e.I_());
            }

            if ($$2 != null) {
               $$1.a($$2);
               return $$2;
            }
         }

         if ($$4.t()) {
            a.warn("Tried to access a block entity before it was created. {}", $$0);
         }

         return null;
      }
   }

   @Override
   public boolean f_(ir $$0) {
      int $$1 = jt.a($$0.u());
      int $$2 = jt.a($$0.w());
      dbh $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.p && $$5 <= this.p) {
         if (this.c.z()) {
            dcc $$6 = this.c.A();
            if ($$0.v() < $$6.J_() || $$0.v() >= $$6.am()) {
               return false;
            }
         }

         return true;
      } else {
         ad.a(
            "Detected setBlock in a far chunk ["
               + $$1
               + ", "
               + $$2
               + "], pos: "
               + $$0
               + ", status: "
               + this.o
               + (this.q == null ? "" : ", currently generating: " + this.q.get())
         );
         return false;
      }
   }

   @Override
   public boolean a(ir $$0, dtc $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         duy $$4 = this.y($$0);
         dtc $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.k().g() == dvz.b) {
               dqc $$6 = ((dhw)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               uk $$7 = new uk();
               $$7.a("x", $$0.u());
               $$7.a("y", $$0.v());
               $$7.a("z", $$0.w());
               $$7.a("id", "DUMMY");
               $$4.a($$7);
            }
         } else if ($$5 != null && $$5.t()) {
            $$4.d($$0);
         }

         if ($$1.q(this, $$0)) {
            this.f($$0);
         }

         return true;
      }
   }

   private void f(ir $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(brv $$0) {
      int $$1 = jt.a($$0.dy());
      int $$2 = jt.a($$0.dE());
      this.a_($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(ir $$0, boolean $$1) {
      return this.a($$0, dfe.a.n(), 3);
   }

   @Override
   public dut D_() {
      return this.e.D_();
   }

   @Override
   public boolean x_() {
      return false;
   }

   @Deprecated
   @Override
   public aqt E() {
      return this.e;
   }

   @Override
   public jo I_() {
      return this.e.I_();
   }

   @Override
   public cop K() {
      return this.e.K();
   }

   @Override
   public erb B_() {
      return this.g;
   }

   @Override
   public bpy d_(ir $$0) {
      if (!this.b(jt.a($$0.u()), jt.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bpy(this.e.al(), this.e.aa(), 0L, this.e.aq());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.e.o();
   }

   @Override
   public dvc N() {
      return this.e.l();
   }

   @Override
   public long C() {
      return this.f;
   }

   @Override
   public eyh<dfc> P() {
      return this.j;
   }

   @Override
   public eyh<epd> O() {
      return this.k;
   }

   @Override
   public int A_() {
      return this.e.A_();
   }

   @Override
   public ayt F_() {
      return this.h;
   }

   @Override
   public int a(dyu.a $$0, int $$1, int $$2) {
      return this.a_(jt.a($$1), jt.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cly $$0, ir $$1, avn $$2, avq $$3, float $$4, float $$5) {
   }

   @Override
   public void a(kz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cly $$0, int $$1, ir $$2, int $$3) {
   }

   @Override
   public void a(ja<dxv> $$0, ewu $$1, dxv.a $$2) {
   }

   @Override
   public dwu E_() {
      return this.i;
   }

   @Override
   public boolean a(ir $$0, Predicate<dtc> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ir $$0, Predicate<epe> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends brv> List<T> a(dxj<brv, T> $$0, ewp $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<brv> a(@Nullable brv $$0, ewp $$1, @Nullable Predicate<? super brv> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cly> x() {
      return Collections.emptyList();
   }

   @Override
   public int J_() {
      return this.e.J_();
   }

   @Override
   public int K_() {
      return this.e.K_();
   }

   @Override
   public long H_() {
      return this.r.getAndIncrement();
   }
}
