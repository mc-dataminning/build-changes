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

public class arb implements dds {
   private static final Logger a = LogUtils.getLogger();
   private final azi<aqn> b;
   private final duy c;
   private final aqu d;
   private final long e;
   private final erb f;
   private final ayw g;
   private final dwy h;
   private final eyy<dfy> i = new eyy<>($$0x -> this.y($$0x).o());
   private final eyy<epd> j = new eyy<>($$0x -> this.y($$0x).p());
   private final ddy k;
   private final dwc l;
   @Nullable
   private Supplier<String> m;
   private final AtomicLong n = new AtomicLong();
   private static final akr o = akr.b("worldgen_region_random");

   public arb(aqu $$0, azi<aqn> $$1, dwc $$2, duy $$3) {
      this.l = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.C();
      this.f = $$0.A_();
      this.g = $$0.l().i().a(o).a(this.c.f().l());
      this.h = $$0.D_();
      this.k = new ddy(this, ddy.a(this.e));
   }

   public boolean a(dcd $$0, int $$1) {
      return this.d.l().a.b($$0, $$1);
   }

   public dcd a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.m = $$0;
   }

   @Override
   public duy a(int $$0, int $$1) {
      return this.a($$0, $$1, dvz.c);
   }

   @Nullable
   @Override
   public duy a(int $$0, int $$1, dvz $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      dvz $$5 = $$4 >= this.l.b().b() ? null : this.l.b().a($$4);
      aqn $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            duy $$7 = $$6.a($$5);
            if ($$7 != null) {
               return $$7;
            }
         }
      } else {
         $$6 = null;
      }

      o $$9 = o.a(new IllegalStateException("Requested chunk unavailable during world generation"), "Exception generating new chunk");
      p $$10 = $$9.a("Chunk request details");
      $$10.a("Requested chunk", String.format(Locale.ROOT, "%d, %d", $$0, $$1));
      $$10.a("Generating status", () -> this.l.a().f());
      $$10.a("Requested status", $$2::f);
      $$10.a("Actual status", () -> $$6 == null ? "[out of cache bounds]" : $$6.q().f());
      $$10.a("Maximum allowed status", () -> $$5 == null ? "null" : $$5.f());
      $$10.a("Dependencies", this.l.b()::toString);
      $$10.a("Requested distance", $$4);
      $$10.a("Generating chunk", this.c.f()::toString);
      throw new z($$9);
   }

   @Override
   public boolean b(int $$0, int $$1) {
      int $$2 = this.c.f().e($$0, $$1);
      return $$2 < this.l.b().b();
   }

   @Override
   public dtc a_(jd $$0) {
      return this.a(kf.a($$0.u()), kf.a($$0.w())).a_($$0);
   }

   @Override
   public epe b_(jd $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cmx a(double $$0, double $$1, double $$2, double $$3, Predicate<bsr> $$4) {
      return null;
   }

   @Override
   public int B_() {
      return 0;
   }

   @Override
   public ddy F_() {
      return this.k;
   }

   @Override
   public jm<ddw> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(ji $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eot y_() {
      return this.d.y_();
   }

   @Override
   public boolean a(jd $$0, boolean $$1, @Nullable bsr $$2, int $$3) {
      dtc $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dqh $$5 = $$4.t() ? this.c_($$0) : null;
            dfy.a($$4, (dcw)this.d, $$0, $$5, $$2, cuq.l);
         }

         return this.a($$0, dga.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dqh c_(jd $$0) {
      duy $$1 = this.y($$0);
      dqh $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ub $$3 = $$1.f($$0);
         dtc $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((diq)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dqh.a($$0, $$4, $$3, this.d.H_());
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
   public boolean f_(jd $$0) {
      int $$1 = kf.a($$0.u());
      int $$2 = kf.a($$0.w());
      dcd $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.l.d() && $$5 <= this.l.d()) {
         if (this.c.y()) {
            dcy $$6 = this.c.z();
            if ($$0.v() < $$6.I_() || $$0.v() >= $$6.am()) {
               return false;
            }
         }

         return true;
      } else {
         ad.b(
            "Detected setBlock in a far chunk ["
               + $$1
               + ", "
               + $$2
               + "], pos: "
               + $$0
               + ", status: "
               + this.l.a()
               + (this.m == null ? "" : ", currently generating: " + this.m.get())
         );
         return false;
      }
   }

   @Override
   public boolean a(jd $$0, dtc $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         duy $$4 = this.y($$0);
         dtc $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().d() == dwd.b) {
               dqh $$6 = ((diq)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               ub $$7 = new ub();
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

   private void f(jd $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(bsr $$0) {
      int $$1 = kf.a($$0.ds());
      int $$2 = kf.a($$0.dy());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(jd $$0, boolean $$1) {
      return this.a($$0, dga.a.o(), 3);
   }

   @Override
   public dut C_() {
      return this.d.C_();
   }

   @Override
   public boolean x_() {
      return false;
   }

   @Deprecated
   @Override
   public aqu E() {
      return this.d;
   }

   @Override
   public ka H_() {
      return this.d.H_();
   }

   @Override
   public cpl J() {
      return this.d.J();
   }

   @Override
   public erb A_() {
      return this.f;
   }

   @Override
   public bqp d_(jd $$0) {
      if (!this.b(kf.a($$0.u()), kf.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bqp(this.d.al(), this.d.aa(), 0L, this.d.aq());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.d.o();
   }

   @Override
   public dvc N() {
      return this.d.l();
   }

   @Override
   public long C() {
      return this.e;
   }

   @Override
   public eyp<dfy> P() {
      return this.i;
   }

   @Override
   public eyp<epd> O() {
      return this.j;
   }

   @Override
   public int z_() {
      return this.d.z_();
   }

   @Override
   public ayw E_() {
      return this.g;
   }

   @Override
   public int a(dyy.a $$0, int $$1, int $$2) {
      return this.a(kf.a($$1), kf.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cmx $$0, jd $$1, avo $$2, avq $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cmx $$0, int $$1, jd $$2, int $$3) {
   }

   @Override
   public void a(jm<dxz> $$0, exc $$1, dxz.a $$2) {
   }

   @Override
   public dwy D_() {
      return this.h;
   }

   @Override
   public boolean a(jd $$0, Predicate<dtc> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jd $$0, Predicate<epe> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bsr> List<T> a(dxn<bsr, T> $$0, ewx $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bsr> a(@Nullable bsr $$0, ewx $$1, @Nullable Predicate<? super bsr> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cmx> x() {
      return Collections.emptyList();
   }

   @Override
   public int I_() {
      return this.d.I_();
   }

   @Override
   public int J_() {
      return this.d.J_();
   }

   @Override
   public long G_() {
      return this.n.getAndIncrement();
   }
}
