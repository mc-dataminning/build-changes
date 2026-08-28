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

public class ara implements ddq {
   private static final Logger a = LogUtils.getLogger();
   private final azh<aqm> b;
   private final duw c;
   private final aqt d;
   private final long e;
   private final eqv f;
   private final ayv g;
   private final dwv h;
   private final eys<dfw> i = new eys<>($$0x -> this.y($$0x).o());
   private final eys<eox> j = new eys<>($$0x -> this.y($$0x).p());
   private final ddw k;
   private final dwa l;
   @Nullable
   private Supplier<String> m;
   private final AtomicLong n = new AtomicLong();
   private static final akq o = akq.b("worldgen_region_random");

   public ara(aqt $$0, azh<aqm> $$1, dwa $$2, duw $$3) {
      this.l = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.C();
      this.f = $$0.A_();
      this.g = $$0.l().i().a(o).a(this.c.f().l());
      this.h = $$0.D_();
      this.k = new ddw(this, ddw.a(this.e));
   }

   public boolean a(dcb $$0, int $$1) {
      return this.d.l().a.b($$0, $$1);
   }

   public dcb a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.m = $$0;
   }

   @Override
   public duw a(int $$0, int $$1) {
      return this.a($$0, $$1, dvx.c);
   }

   @Nullable
   @Override
   public duw a(int $$0, int $$1, dvx $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      dvx $$5 = $$4 >= this.l.b().b() ? null : this.l.b().a($$4);
      aqm $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            duw $$7 = $$6.a($$5);
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
   public dta a_(jd $$0) {
      return this.a(kf.a($$0.u()), kf.a($$0.w())).a_($$0);
   }

   @Override
   public eoy b_(jd $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cmv a(double $$0, double $$1, double $$2, double $$3, Predicate<bsq> $$4) {
      return null;
   }

   @Override
   public int B_() {
      return 0;
   }

   @Override
   public ddw F_() {
      return this.k;
   }

   @Override
   public jm<ddu> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(ji $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eon y_() {
      return this.d.y_();
   }

   @Override
   public boolean a(jd $$0, boolean $$1, @Nullable bsq $$2, int $$3) {
      dta $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dqf $$5 = $$4.t() ? this.c_($$0) : null;
            dfw.a($$4, (dcu)this.d, $$0, $$5, $$2, cuo.l);
         }

         return this.a($$0, dfy.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dqf c_(jd $$0) {
      duw $$1 = this.y($$0);
      dqf $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ua $$3 = $$1.f($$0);
         dta $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((dio)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dqf.a($$0, $$4, $$3, this.d.H_());
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
      dcb $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.l.d() && $$5 <= this.l.d()) {
         if (this.c.y()) {
            dcw $$6 = this.c.z();
            if ($$0.v() < $$6.I_() || $$0.v() >= $$6.am()) {
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
               + this.l.a()
               + (this.m == null ? "" : ", currently generating: " + this.m.get())
         );
         return false;
      }
   }

   @Override
   public boolean a(jd $$0, dta $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         duw $$4 = this.y($$0);
         dta $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().d() == dwb.b) {
               dqf $$6 = ((dio)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               ua $$7 = new ua();
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
   public boolean b(bsq $$0) {
      int $$1 = kf.a($$0.du());
      int $$2 = kf.a($$0.dA());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(jd $$0, boolean $$1) {
      return this.a($$0, dfy.a.o(), 3);
   }

   @Override
   public dur C_() {
      return this.d.C_();
   }

   @Override
   public boolean x_() {
      return false;
   }

   @Deprecated
   @Override
   public aqt E() {
      return this.d;
   }

   @Override
   public ka H_() {
      return this.d.H_();
   }

   @Override
   public cpj J() {
      return this.d.J();
   }

   @Override
   public eqv A_() {
      return this.f;
   }

   @Override
   public bqo d_(jd $$0) {
      if (!this.b(kf.a($$0.u()), kf.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bqo(this.d.al(), this.d.aa(), 0L, this.d.aq());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.d.o();
   }

   @Override
   public dva N() {
      return this.d.l();
   }

   @Override
   public long C() {
      return this.e;
   }

   @Override
   public eyj<dfw> P() {
      return this.i;
   }

   @Override
   public eyj<eox> O() {
      return this.j;
   }

   @Override
   public int z_() {
      return this.d.z_();
   }

   @Override
   public ayv E_() {
      return this.g;
   }

   @Override
   public int a(dyv.a $$0, int $$1, int $$2) {
      return this.a(kf.a($$1), kf.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cmv $$0, jd $$1, avn $$2, avp $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cmv $$0, int $$1, jd $$2, int $$3) {
   }

   @Override
   public void a(jm<dxw> $$0, eww $$1, dxw.a $$2) {
   }

   @Override
   public dwv D_() {
      return this.h;
   }

   @Override
   public boolean a(jd $$0, Predicate<dta> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jd $$0, Predicate<eoy> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bsq> List<T> a(dxk<bsq, T> $$0, ewr $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bsq> a(@Nullable bsq $$0, ewr $$1, @Nullable Predicate<? super bsq> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cmv> x() {
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
