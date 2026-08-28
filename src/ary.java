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

public class ary implements dkl {
   private static final Logger a = LogUtils.getLogger();
   private final bai<arg> b;
   private final ecq c;
   private final arq d;
   private final long e;
   private final ezd f;
   private final azv h;
   private final eeq i;
   private final fgz<dmr> j = new fgz<>($$0x -> this.z($$0x).q());
   private final fgz<ewz> k = new fgz<>($$0x -> this.z($$0x).r());
   private final dkr l;
   private final edu m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final alg p = alg.b("worldgen_region_random");

   public ary(arq $$0, bai<arg> $$1, edu $$2, ecq $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.E();
      this.f = $$0.y_();
      this.h = $$0.m().i().a(p).a(this.c.f().l());
      this.i = $$0.B_();
      this.l = new dkr(this, dkr.a(this.e));
   }

   public boolean a(dir $$0, int $$1) {
      return this.d.m().a.b($$0, $$1);
   }

   public dir b() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public ecq a(int $$0, int $$1) {
      return this.a($$0, $$1, edr.c);
   }

   @Nullable
   @Override
   public ecq a(int $$0, int $$1, edr $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      edr $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      arg $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            ecq $$7 = $$6.a($$5);
            if ($$7 != null) {
               return $$7;
            }
         }
      } else {
         $$6 = null;
      }

      p $$9 = p.a(new IllegalStateException("Requested chunk unavailable during world generation"), "Exception generating new chunk");
      q $$10 = $$9.a("Chunk request details");
      $$10.a("Requested chunk", String.format(Locale.ROOT, "%d, %d", $$0, $$1));
      $$10.a("Generating status", () -> this.m.a().f());
      $$10.a("Requested status", $$2::f);
      $$10.a("Actual status", () -> $$6 == null ? "[out of cache bounds]" : $$6.q().f());
      $$10.a("Maximum allowed status", () -> $$5 == null ? "null" : $$5.f());
      $$10.a("Dependencies", this.m.b()::toString);
      $$10.a("Requested distance", $$4);
      $$10.a("Generating chunk", this.c.f()::toString);
      throw new aa($$9);
   }

   @Override
   public boolean b(int $$0, int $$1) {
      int $$2 = this.c.f().e($$0, $$1);
      return $$2 < this.m.b().b();
   }

   @Override
   public eat a_(iv $$0) {
      return this.a(jy.a($$0.u()), jy.a($$0.w())).a_($$0);
   }

   @Override
   public exa b_(iv $$0) {
      return this.z($$0).b_($$0);
   }

   @Nullable
   @Override
   public crm a(double $$0, double $$1, double $$2, double $$3, Predicate<bwi> $$4) {
      return null;
   }

   @Override
   public int z_() {
      return 0;
   }

   @Override
   public dkr D_() {
      return this.l;
   }

   @Override
   public jf<dkp> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jb $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public ewp x_() {
      return this.d.x_();
   }

   @Override
   public boolean a(iv $$0, boolean $$1, @Nullable bwi $$2, int $$3) {
      eat $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            dxr $$5 = $$4.x() ? this.c_($$0) : null;
            dmr.a($$4, (djm)this.d, $$0, $$5, $$2, czn.k);
         }

         return this.a($$0, dmt.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dxr c_(iv $$0) {
      ecq $$1 = this.z($$0);
      dxr $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         tz $$3 = $$1.f($$0);
         eat $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.j("id"))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dpl)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dxr.a($$0, $$4, $$3, this.d.F_());
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
   public boolean f_(iv $$0) {
      int $$1 = jy.a($$0.u());
      int $$2 = jy.a($$0.w());
      dir $$3 = this.b();
      int $$4 = Math.abs($$3.h - $$1);
      int $$5 = Math.abs($$3.i - $$2);
      if ($$4 <= this.m.d() && $$5 <= this.m.d()) {
         if (this.c.A()) {
            djo $$6 = this.c.B();
            if ($$6.e($$0.v())) {
               return false;
            }
         }

         return true;
      } else {
         ag.b(
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
   public boolean a(iv $$0, eat $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         ecq $$4 = this.z($$0);
         eat $$5 = $$4.a($$0, $$1, $$2);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.n().d() == edv.b) {
               dxr $$6 = ((dpl)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               tz $$7 = new tz();
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

   private void f(iv $$0) {
      this.z($$0).e($$0);
   }

   @Override
   public boolean b(bwi $$0) {
      int $$1 = jy.a($$0.dy());
      int $$2 = jy.a($$0.dE());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(iv $$0, boolean $$1) {
      return this.a($$0, dmt.a.m(), 3);
   }

   @Override
   public ecl A_() {
      return this.d.A_();
   }

   @Override
   public boolean w_() {
      return false;
   }

   @Deprecated
   @Override
   public arq a() {
      return this.d;
   }

   @Override
   public jt F_() {
      return this.d.F_();
   }

   @Override
   public cuw K() {
      return this.d.K();
   }

   @Override
   public ezd y_() {
      return this.f;
   }

   @Override
   public bue d_(iv $$0) {
      if (!this.b(jy.a($$0.u()), jy.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bue(this.d.an(), this.d.af(), 0L, this.d.as());
      }
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return this.d.p();
   }

   @Override
   public ecu S() {
      return this.d.m();
   }

   @Override
   public long E() {
      return this.e;
   }

   @Override
   public fgq<dmr> U() {
      return this.j;
   }

   @Override
   public fgq<ewz> T() {
      return this.k;
   }

   @Override
   public int P() {
      return this.d.P();
   }

   @Override
   public azv C_() {
      return this.h;
   }

   @Override
   public int a(egs.a $$0, int $$1, int $$2) {
      return this.a(jy.a($$1), jy.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable bwi $$0, iv $$1, awm $$2, awo $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable bwi $$0, int $$1, iv $$2, int $$3) {
   }

   @Override
   public void a(jf<eft> $$0, ffc $$1, eft.a $$2) {
   }

   @Override
   public eeq B_() {
      return this.i;
   }

   @Override
   public boolean a(iv $$0, Predicate<eat> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(iv $$0, Predicate<exa> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bwi> List<T> a(eff<bwi, T> $$0, fex $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bwi> a(@Nullable bwi $$0, fex $$1, @Nullable Predicate<? super bwi> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<crm> z() {
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
