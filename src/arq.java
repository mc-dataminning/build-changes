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

public class arq implements dfg {
   private static final Logger a = LogUtils.getLogger();
   private final azz<arb> b;
   private final dwo c;
   private final arj d;
   private final long e;
   private final esv f;
   private final azn g;
   private final dyo h;
   private final fat<dhm> i = new fat<>($$0x -> this.y($$0x).o());
   private final fat<eqs> j = new fat<>($$0x -> this.y($$0x).p());
   private final dfm k;
   private final dxs l;
   @Nullable
   private Supplier<String> m;
   private final AtomicLong n = new AtomicLong();
   private static final ale o = ale.b("worldgen_region_random");

   public arq(arj $$0, azz<arb> $$1, dxs $$2, dwo $$3) {
      this.l = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.C();
      this.f = $$0.z_();
      this.g = $$0.l().i().a(o).a(this.c.f().l());
      this.h = $$0.C_();
      this.k = new dfm(this, dfm.a(this.e));
   }

   public boolean a(ddp $$0, int $$1) {
      return this.d.l().a.b($$0, $$1);
   }

   public ddp a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.m = $$0;
   }

   @Override
   public dwo a(int $$0, int $$1) {
      return this.a($$0, $$1, dxp.c);
   }

   @Nullable
   @Override
   public dwo a(int $$0, int $$1, dxp $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      dxp $$5 = $$4 >= this.l.b().b() ? null : this.l.b().a($$4);
      arb $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            dwo $$7 = $$6.a($$5);
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
   public dus a_(jf $$0) {
      return this.a(kh.a($$0.u()), kh.a($$0.w())).a_($$0);
   }

   @Override
   public eqt b_(jf $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cnx a(double $$0, double $$1, double $$2, double $$3, Predicate<btr> $$4) {
      return null;
   }

   @Override
   public int A_() {
      return 0;
   }

   @Override
   public dfm E_() {
      return this.k;
   }

   @Override
   public jo<dfk> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jk $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eqi y_() {
      return this.d.y_();
   }

   @Override
   public boolean a(jf $$0, boolean $$1, @Nullable btr $$2, int $$3) {
      dus $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            drv $$5 = $$4.x() ? this.c_($$0) : null;
            dhm.a($$4, (dej)this.d, $$0, $$5, $$2, cvs.k);
         }

         return this.a($$0, dho.a.n(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public drv c_(jf $$0) {
      dwo $$1 = this.y($$0);
      drv $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ug $$3 = $$1.f($$0);
         dus $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dke)$$4.b()).a($$0, $$4);
            } else {
               $$2 = drv.a($$0, $$4, $$3, this.d.G_());
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
   public boolean f_(jf $$0) {
      int $$1 = kh.a($$0.u());
      int $$2 = kh.a($$0.w());
      ddp $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.l.d() && $$5 <= this.l.d()) {
         if (this.c.x()) {
            del $$6 = this.c.y();
            if ($$6.e($$0.v())) {
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
   public boolean a(jf $$0, dus $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dwo $$4 = this.y($$0);
         dus $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.j().d() == dxt.b) {
               drv $$6 = ((dke)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               ug $$7 = new ug();
               $$7.a("x", $$0.u());
               $$7.a("y", $$0.v());
               $$7.a("z", $$0.w());
               $$7.a("id", "DUMMY");
               $$4.a($$7);
            }
         } else if ($$5 != null && $$5.x()) {
            $$4.d($$0);
         }

         if ($$1.l(this, $$0)) {
            this.f($$0);
         }

         return true;
      }
   }

   private void f(jf $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(btr $$0) {
      int $$1 = kh.a($$0.dw());
      int $$2 = kh.a($$0.dC());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(jf $$0, boolean $$1) {
      return this.a($$0, dho.a.n(), 3);
   }

   @Override
   public dwj B_() {
      return this.d.B_();
   }

   @Override
   public boolean x_() {
      return false;
   }

   @Deprecated
   @Override
   public arj E() {
      return this.d;
   }

   @Override
   public kc G_() {
      return this.d.G_();
   }

   @Override
   public cqq J() {
      return this.d.J();
   }

   @Override
   public esv z_() {
      return this.f;
   }

   @Override
   public brq d_(jf $$0) {
      if (!this.b(kh.a($$0.u()), kh.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new brq(this.d.am(), this.d.ab(), 0L, this.d.ar());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.d.o();
   }

   @Override
   public dws P() {
      return this.d.l();
   }

   @Override
   public long C() {
      return this.e;
   }

   @Override
   public fak<dhm> R() {
      return this.i;
   }

   @Override
   public fak<eqs> Q() {
      return this.j;
   }

   @Override
   public int N() {
      return this.d.N();
   }

   @Override
   public azn D_() {
      return this.g;
   }

   @Override
   public int a(eao.a $$0, int $$1, int $$2) {
      return this.a(kh.a($$1), kh.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cnx $$0, jf $$1, awf $$2, awh $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lm $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cnx $$0, int $$1, jf $$2, int $$3) {
   }

   @Override
   public void a(jo<dzp> $$0, eyw $$1, dzp.a $$2) {
   }

   @Override
   public dyo C_() {
      return this.h;
   }

   @Override
   public boolean a(jf $$0, Predicate<dus> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jf $$0, Predicate<eqt> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends btr> List<T> a(dzd<btr, T> $$0, eyr $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<btr> a(@Nullable btr $$0, eyr $$1, @Nullable Predicate<? super btr> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cnx> x() {
      return Collections.emptyList();
   }

   @Override
   public int H_() {
      return this.d.H_();
   }

   @Override
   public int I_() {
      return this.d.I_();
   }

   @Override
   public long F_() {
      return this.n.getAndIncrement();
   }
}
