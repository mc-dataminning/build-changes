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

public class asf implements dhx {
   private static final Logger a = LogUtils.getLogger();
   private final bao<aro> b;
   private final dzj c;
   private final arx d;
   private final long e;
   private final evs f;
   private final bac h;
   private final ebj i;
   private final fdo<dkd> j = new fdo<>($$0x -> this.y($$0x).q());
   private final fdo<etp> k = new fdo<>($$0x -> this.y($$0x).r());
   private final did l;
   private final ean m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final alp p = alp.b("worldgen_region_random");

   public asf(arx $$0, bao<aro> $$1, ean $$2, dzj $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.E();
      this.f = $$0.D_();
      this.h = $$0.m().i().a(p).a(this.c.f().l());
      this.i = $$0.G_();
      this.l = new did(this, did.a(this.e));
   }

   public boolean a(dgf $$0, int $$1) {
      return this.d.m().a.b($$0, $$1);
   }

   public dgf b() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public dzj a(int $$0, int $$1) {
      return this.a($$0, $$1, eak.c);
   }

   @Nullable
   @Override
   public dzj a(int $$0, int $$1, eak $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      eak $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      aro $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            dzj $$7 = $$6.a($$5);
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
   public dxo a_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).a_($$0);
   }

   @Override
   public etq b_(jh $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cpo a(double $$0, double $$1, double $$2, double $$3, Predicate<bvb> $$4) {
      return null;
   }

   @Override
   public int E_() {
      return 0;
   }

   @Override
   public did I_() {
      return this.l;
   }

   @Override
   public jq<dib> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public etf C_() {
      return this.d.C_();
   }

   @Override
   public boolean a(jh $$0, boolean $$1, @Nullable bvb $$2, int $$3) {
      dxo $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            duq $$5 = $$4.x() ? this.c_($$0) : null;
            dkd.a($$4, (dgz)this.d, $$0, $$5, $$2, cxg.j);
         }

         return this.a($$0, dkf.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public duq c_(jh $$0) {
      dzj $$1 = this.y($$0);
      duq $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         um $$3 = $$1.f($$0);
         dxo $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dmw)$$4.b()).a($$0, $$4);
            } else {
               $$2 = duq.a($$0, $$4, $$3, this.d.K_());
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
      dgf $$3 = this.b();
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
   public boolean a(jh $$0, dxo $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dzj $$4 = this.y($$0);
         dxo $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.n().d() == eao.b) {
               duq $$6 = ((dmw)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               um $$7 = new um();
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
   public boolean b(bvb $$0) {
      int $$1 = kj.a($$0.dA());
      int $$2 = kj.a($$0.dG());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(jh $$0, boolean $$1) {
      return this.a($$0, dkf.a.m(), 3);
   }

   @Override
   public dze F_() {
      return this.d.F_();
   }

   @Override
   public boolean B_() {
      return false;
   }

   @Deprecated
   @Override
   public arx a() {
      return this.d;
   }

   @Override
   public ke K_() {
      return this.d.K_();
   }

   @Override
   public csk K() {
      return this.d.K();
   }

   @Override
   public evs D_() {
      return this.f;
   }

   @Override
   public bsy d_(jh $$0) {
      if (!this.b(kj.a($$0.u()), kj.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bsy(this.d.am(), this.d.ae(), 0L, this.d.ar());
      }
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return this.d.p();
   }

   @Override
   public dzn S() {
      return this.d.m();
   }

   @Override
   public long E() {
      return this.e;
   }

   @Override
   public fdf<dkd> U() {
      return this.j;
   }

   @Override
   public fdf<etp> T() {
      return this.k;
   }

   @Override
   public int P() {
      return this.d.P();
   }

   @Override
   public bac H_() {
      return this.h;
   }

   @Override
   public int a(edj.a $$0, int $$1, int $$2) {
      return this.a(kj.a($$1), kj.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cpo $$0, jh $$1, awu $$2, aww $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cpo $$0, int $$1, jh $$2, int $$3) {
   }

   @Override
   public void a(jq<eck> $$0, fbr $$1, eck.a $$2) {
   }

   @Override
   public ebj G_() {
      return this.i;
   }

   @Override
   public boolean a(jh $$0, Predicate<dxo> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jh $$0, Predicate<etq> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bvb> List<T> a(eby<bvb, T> $$0, fbm $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bvb> a(@Nullable bvb $$0, fbm $$1, @Nullable Predicate<? super bvb> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cpo> z() {
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
