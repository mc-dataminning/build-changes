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

public class asp implements dif {
   private static final Logger a = LogUtils.getLogger();
   private final bay<ary> b;
   private final dzp c;
   private final ash d;
   private final long e;
   private final evy f;
   private final bam h;
   private final ebp i;
   private final fdu<dkl> j = new fdu<>($$0x -> this.y($$0x).q());
   private final fdu<etv> k = new fdu<>($$0x -> this.y($$0x).r());
   private final dil l;
   private final eat m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final alz p = alz.b("worldgen_region_random");

   public asp(ash $$0, bay<ary> $$1, eat $$2, dzp $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.D();
      this.f = $$0.D_();
      this.h = $$0.m().i().a(p).a(this.c.f().l());
      this.i = $$0.G_();
      this.l = new dil(this, dil.a(this.e));
   }

   public boolean a(dgn $$0, int $$1) {
      return this.d.m().a.b($$0, $$1);
   }

   public dgn b() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public dzp a(int $$0, int $$1) {
      return this.a($$0, $$1, eaq.c);
   }

   @Nullable
   @Override
   public dzp a(int $$0, int $$1, eaq $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      eaq $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      ary $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            dzp $$7 = $$6.a($$5);
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
      $$10.a("Actual status", () -> $$6 == null ? "[out of cache bounds]" : $$6.p().f());
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
   public dxu a_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).a_($$0);
   }

   @Override
   public etw b_(jh $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cpw a(double $$0, double $$1, double $$2, double $$3, Predicate<bvj> $$4) {
      return null;
   }

   @Override
   public int E_() {
      return 0;
   }

   @Override
   public dil I_() {
      return this.l;
   }

   @Override
   public jq<dij> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public etl C_() {
      return this.d.C_();
   }

   @Override
   public boolean a(jh $$0, boolean $$1, @Nullable bvj $$2, int $$3) {
      dxu $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            duw $$5 = $$4.x() ? this.c_($$0) : null;
            dkl.a($$4, (dhh)this.d, $$0, $$5, $$2, cxo.j);
         }

         return this.a($$0, dkn.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public duw c_(jh $$0) {
      dzp $$1 = this.y($$0);
      duw $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ux $$3 = $$1.f($$0);
         dxu $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dnf)$$4.b()).a($$0, $$4);
            } else {
               $$2 = duw.a($$0, $$4, $$3, this.d.K_());
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
   public boolean f_(jh $$0) {
      int $$1 = kj.a($$0.u());
      int $$2 = kj.a($$0.w());
      dgn $$3 = this.b();
      int $$4 = Math.abs($$3.g - $$1);
      int $$5 = Math.abs($$3.h - $$2);
      if ($$4 <= this.m.d() && $$5 <= this.m.d()) {
         if (this.c.z()) {
            dhj $$6 = this.c.A();
            if ($$6.e($$0.v())) {
               return false;
            }
         }

         return true;
      } else {
         ae.b(
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
   public boolean a(jh $$0, dxu $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dzp $$4 = this.y($$0);
         dxu $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.n().d() == eau.b) {
               duw $$6 = ((dnf)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               ux $$7 = new ux();
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

   private void f(jh $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(bvj $$0) {
      int $$1 = kj.a($$0.dA());
      int $$2 = kj.a($$0.dG());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(jh $$0, boolean $$1) {
      return this.a($$0, dkn.a.m(), 3);
   }

   @Override
   public dzk F_() {
      return this.d.F_();
   }

   @Override
   public boolean B_() {
      return false;
   }

   @Deprecated
   @Override
   public ash a() {
      return this.d;
   }

   @Override
   public ke K_() {
      return this.d.K_();
   }

   @Override
   public css J() {
      return this.d.J();
   }

   @Override
   public evy D_() {
      return this.f;
   }

   @Override
   public btg d_(jh $$0) {
      if (!this.b(kj.a($$0.u()), kj.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new btg(this.d.al(), this.d.ad(), 0L, this.d.aq());
      }
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return this.d.p();
   }

   @Override
   public dzt R() {
      return this.d.m();
   }

   @Override
   public long D() {
      return this.e;
   }

   @Override
   public fdl<dkl> T() {
      return this.j;
   }

   @Override
   public fdl<etv> S() {
      return this.k;
   }

   @Override
   public int O() {
      return this.d.O();
   }

   @Override
   public bam H_() {
      return this.h;
   }

   @Override
   public int a(edp.a $$0, int $$1, int $$2) {
      return this.a(kj.a($$1), kj.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cpw $$0, jh $$1, axe $$2, axg $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cpw $$0, int $$1, jh $$2, int $$3) {
   }

   @Override
   public void a(jq<ecq> $$0, fbx $$1, ecq.a $$2) {
   }

   @Override
   public ebp G_() {
      return this.i;
   }

   @Override
   public boolean a(jh $$0, Predicate<dxu> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jh $$0, Predicate<etw> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bvj> List<T> a(ece<bvj, T> $$0, fbs $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bvj> a(@Nullable bvj $$0, fbs $$1, @Nullable Predicate<? super bvj> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cpw> y() {
      return Collections.emptyList();
   }

   @Override
   public int L_() {
      return this.d.L_();
   }

   @Override
   public int M_() {
      return this.d.M_();
   }

   @Override
   public long J_() {
      return this.o.getAndIncrement();
   }
}
