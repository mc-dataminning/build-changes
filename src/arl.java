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

public class arl implements dhy {
   private static final Logger a = LogUtils.getLogger();
   private final azt<aqt> b;
   private final dzm c;
   private final ard d;
   private final long e;
   private final evy f;
   private final azh h;
   private final ebm i;
   private final fdu<dke> j = new fdu<>($$0x -> this.y($$0x).q());
   private final fdu<etv> k = new fdu<>($$0x -> this.y($$0x).r());
   private final die l;
   private final eaq m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final aku p = aku.b("worldgen_region_random");

   public arl(ard $$0, azt<aqt> $$1, eaq $$2, dzm $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.E();
      this.f = $$0.y_();
      this.h = $$0.m().i().a(p).a(this.c.f().l());
      this.i = $$0.B_();
      this.l = new die(this, die.a(this.e));
   }

   public boolean a(dgg $$0, int $$1) {
      return this.d.m().a.b($$0, $$1);
   }

   public dgg b() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public dzm a(int $$0, int $$1) {
      return this.a($$0, $$1, ean.c);
   }

   @Nullable
   @Override
   public dzm a(int $$0, int $$1, ean $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      ean $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      aqt $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            dzm $$7 = $$6.a($$5);
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
      $$10.a("Generating status", () -> this.m.a().f());
      $$10.a("Requested status", $$2::f);
      $$10.a("Actual status", () -> $$6 == null ? "[out of cache bounds]" : $$6.q().f());
      $$10.a("Maximum allowed status", () -> $$5 == null ? "null" : $$5.f());
      $$10.a("Dependencies", this.m.b()::toString);
      $$10.a("Requested distance", $$4);
      $$10.a("Generating chunk", this.c.f()::toString);
      throw new z($$9);
   }

   @Override
   public boolean b(int $$0, int $$1) {
      int $$2 = this.c.f().e($$0, $$1);
      return $$2 < this.m.b().b();
   }

   @Override
   public dxq a_(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w())).a_($$0);
   }

   @Override
   public etw b_(ji $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cpr a(double $$0, double $$1, double $$2, double $$3, Predicate<bva> $$4) {
      return null;
   }

   @Override
   public int z_() {
      return 0;
   }

   @Override
   public die D_() {
      return this.l;
   }

   @Override
   public jr<dic> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jn $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public etl x_() {
      return this.d.x_();
   }

   @Override
   public boolean a(ji $$0, boolean $$1, @Nullable bva $$2, int $$3) {
      dxq $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            dus $$5 = $$4.x() ? this.c_($$0) : null;
            dke.a($$4, (dgz)this.d, $$0, $$5, $$2, cxh.k);
         }

         return this.a($$0, dkg.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dus c_(ji $$0) {
      dzm $$1 = this.y($$0);
      dus $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         tq $$3 = $$1.f($$0);
         dxq $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dmx)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dus.a($$0, $$4, $$3, this.d.F_());
            }

            if ($$2 != null) {
               $$1.a($$2);
               return $$2;
            }
         }

         if ($$4.x()) {
            a.warn("Tried to access a block entity before it was created. {}", $$0);
         }

         return null;
      }
   }

   @Override
   public boolean f_(ji $$0) {
      int $$1 = kk.a($$0.u());
      int $$2 = kk.a($$0.w());
      dgg $$3 = this.b();
      int $$4 = Math.abs($$3.h - $$1);
      int $$5 = Math.abs($$3.i - $$2);
      if ($$4 <= this.m.d() && $$5 <= this.m.d()) {
         if (this.c.A()) {
            dhb $$6 = this.c.B();
            if ($$6.e($$0.v())) {
               return false;
            }
         }

         return true;
      } else {
         af.b(
            "Detected setBlock in a far chunk ["
               + $$1
               + ", "
               + $$2
               + "], pos: "
               + $$0
               + ", status: "
               + this.m.a()
               + (this.n == null ? "" : ", currently generating: " + this.n.get())
         );
         return false;
      }
   }

   @Override
   public boolean a(ji $$0, dxq $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dzm $$4 = this.y($$0);
         dxq $$5 = $$4.a($$0, $$1, $$2);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.n().d() == ear.b) {
               dus $$6 = ((dmx)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               tq $$7 = new tq();
               $$7.a("x", $$0.u());
               $$7.a("y", $$0.v());
               $$7.a("z", $$0.w());
               $$7.a("id", "DUMMY");
               $$4.a($$7);
            }
         } else if ($$5 != null && $$5.x()) {
            $$4.d($$0);
         }

         if ($$1.l(this, $$0) && ($$2 & 16) == 0) {
            this.f($$0);
         }

         return true;
      }
   }

   private void f(ji $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(bva $$0) {
      int $$1 = kk.a($$0.dy());
      int $$2 = kk.a($$0.dE());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(ji $$0, boolean $$1) {
      return this.a($$0, dkg.a.m(), 3);
   }

   @Override
   public dzh A_() {
      return this.d.A_();
   }

   @Override
   public boolean w_() {
      return false;
   }

   @Deprecated
   @Override
   public ard a() {
      return this.d;
   }

   @Override
   public kf F_() {
      return this.d.F_();
   }

   @Override
   public csn K() {
      return this.d.K();
   }

   @Override
   public evy y_() {
      return this.f;
   }

   @Override
   public bsw d_(ji $$0) {
      if (!this.b(kk.a($$0.u()), kk.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bsw(this.d.an(), this.d.af(), 0L, this.d.as());
      }
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return this.d.p();
   }

   @Override
   public dzq S() {
      return this.d.m();
   }

   @Override
   public long E() {
      return this.e;
   }

   @Override
   public fdl<dke> U() {
      return this.j;
   }

   @Override
   public fdl<etv> T() {
      return this.k;
   }

   @Override
   public int P() {
      return this.d.P();
   }

   @Override
   public azh C_() {
      return this.h;
   }

   @Override
   public int a(edo.a $$0, int $$1, int $$2) {
      return this.a(kk.a($$1), kk.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable bva $$0, ji $$1, avz $$2, awb $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable bva $$0, int $$1, ji $$2, int $$3) {
   }

   @Override
   public void a(jr<ecp> $$0, fbx $$1, ecp.a $$2) {
   }

   @Override
   public ebm B_() {
      return this.i;
   }

   @Override
   public boolean a(ji $$0, Predicate<dxq> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ji $$0, Predicate<etw> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bva> List<T> a(ecb<bva, T> $$0, fbs $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bva> a(@Nullable bva $$0, fbs $$1, @Nullable Predicate<? super bva> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cpr> z() {
      return Collections.emptyList();
   }

   @Override
   public int G_() {
      return this.d.G_();
   }

   @Override
   public int H_() {
      return this.d.H_();
   }

   @Override
   public long E_() {
      return this.o.getAndIncrement();
   }
}
