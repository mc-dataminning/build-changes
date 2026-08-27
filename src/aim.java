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

public class aim implements cng {
   private static final Logger a = LogUtils.getLogger();
   private final List<ddx> b;
   private final ddx c;
   private final int d;
   private final aif e;
   private final long f;
   private final dyv g;
   private final apf h;
   private final dfk i;
   private final efy<cpn> j = new efy<>($$0x -> this.x($$0x).o());
   private final efy<dxd> k = new efy<>($$0x -> this.x($$0x).p());
   private final cnm l;
   private final clt m;
   private final clt n;
   private final cne o;
   private final dec p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final acq t = new acq("worldgen_region_random");

   public aim(aif $$0, List<ddx> $$1, dec $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = apa.a(Math.sqrt((double)$$1.size()));
      if ($$4 * $$4 != $$1.size()) {
         throw (IllegalStateException)ac.b(new IllegalStateException("Cache size is not a square."));
      } else {
         this.b = $$1;
         this.c = $$1.get($$1.size() / 2);
         this.d = $$4;
         this.e = $$0;
         this.f = $$0.A();
         this.g = $$0.u_();
         this.h = $$0.k().i().a(t).a(this.c.f().l());
         this.i = $$0.x_();
         this.l = new cnm(this, cnm.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(clt $$0, int $$1) {
      return this.e.k().a.a($$0, $$1);
   }

   public clt a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public ddx a(int $$0, int $$1) {
      return this.a($$0, $$1, dec.c);
   }

   @Nullable
   @Override
   public ddx a(int $$0, int $$1, dec $$2, boolean $$3) {
      ddx $$6;
      if (this.b($$0, $$1)) {
         int $$4 = $$0 - this.m.e;
         int $$5 = $$1 - this.m.f;
         $$6 = this.b.get($$4 + $$5 * this.d);
         if ($$6.j().b($$2)) {
            return $$6;
         }
      } else {
         $$6 = null;
      }

      if (!$$3) {
         return null;
      } else {
         a.error("Requested chunk : {} {}", $$0, $$1);
         a.error("Region bounds : {} {} | {} {}", new Object[]{this.m.e, this.m.f, this.n.e, this.n.f});
         if ($$6 != null) {
            throw (RuntimeException)ac.b(
               new RuntimeException(String.format(Locale.ROOT, "Chunk is not of correct status. Expecting %s, got %s | %s %s", $$2, $$6.j(), $$0, $$1))
            );
         } else {
            throw (RuntimeException)ac.b(new RuntimeException(String.format(Locale.ROOT, "We are asking a region for a chunk out of bound | %s %s", $$0, $$1)));
         }
      }
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return $$0 >= this.m.e && $$0 <= this.n.e && $$1 >= this.m.f && $$1 <= this.n.f;
   }

   @Override
   public dcb a_(gu $$0) {
      return this.a(hx.a($$0.u()), hx.a($$0.w())).a_($$0);
   }

   @Override
   public dxe b_(gu $$0) {
      return this.x($$0).b_($$0);
   }

   @Nullable
   @Override
   public byo a(double $$0, double $$1, double $$2, double $$3, Predicate<bfj> $$4) {
      return null;
   }

   @Override
   public int v_() {
      return 0;
   }

   @Override
   public cnm z_() {
      return this.l;
   }

   @Override
   public he<cnk> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(ha $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public dwt s_() {
      return this.e.s_();
   }

   @Override
   public boolean a(gu $$0, boolean $$1, @Nullable bfj $$2, int $$3) {
      dcb $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            czn $$5 = $$4.t() ? this.c_($$0) : null;
            cpn.a($$4, (cmm)this.e, $$0, $$5, $$2, cfz.b);
         }

         return this.a($$0, cpo.a.n(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public czn c_(gu $$0) {
      ddx $$1 = this.x($$0);
      czn $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         qr $$3 = $$1.f($$0);
         dcb $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((csb)$$4.b()).a($$0, $$4);
            } else {
               $$2 = czn.a($$0, $$4, $$3);
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
   public boolean f_(gu $$0) {
      int $$1 = hx.a($$0.u());
      int $$2 = hx.a($$0.w());
      clt $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            cmo $$6 = this.c.z();
            if ($$0.v() < $$6.C_() || $$0.v() >= $$6.aj()) {
               return false;
            }
         }

         return true;
      } else {
         ac.a(
            "Detected setBlock in a far chunk ["
               + $$1
               + ", "
               + $$2
               + "], pos: "
               + $$0
               + ", status: "
               + this.p
               + (this.r == null ? "" : ", currently generating: " + this.r.get())
         );
         return false;
      }
   }

   @Override
   public boolean a(gu $$0, dcb $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         ddx $$4 = this.x($$0);
         dcb $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dec.a.b) {
               czn $$6 = ((csb)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               qr $$7 = new qr();
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

   private void f(gu $$0) {
      this.x($$0).e($$0);
   }

   @Override
   public boolean b(bfj $$0) {
      int $$1 = hx.a($$0.dm());
      int $$2 = hx.a($$0.ds());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(gu $$0, boolean $$1) {
      return this.a($$0, cpo.a.n(), 3);
   }

   @Override
   public dds w_() {
      return this.e.w_();
   }

   @Override
   public boolean r_() {
      return false;
   }

   @Deprecated
   @Override
   public aif C() {
      return this.e;
   }

   @Override
   public hs B_() {
      return this.e.B_();
   }

   @Override
   public caw G() {
      return this.e.G();
   }

   @Override
   public dyv u_() {
      return this.g;
   }

   @Override
   public bdv d_(gu $$0) {
      if (!this.b(hx.a($$0.u()), hx.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bdv(this.e.ai(), this.e.W(), 0L, this.e.an());
      }
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return this.e.n();
   }

   @Override
   public deb J() {
      return this.e.k();
   }

   @Override
   public long A() {
      return this.f;
   }

   @Override
   public efp<cpn> L() {
      return this.j;
   }

   @Override
   public efp<dxd> K() {
      return this.k;
   }

   @Override
   public int t_() {
      return this.e.t_();
   }

   @Override
   public apf y_() {
      return this.h;
   }

   @Override
   public int a(dhk.a $$0, int $$1, int $$2) {
      return this.a(hx.a($$1), hx.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable byo $$0, gu $$1, amg $$2, ami $$3, float $$4, float $$5) {
   }

   @Override
   public void a(it $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable byo $$0, int $$1, gu $$2, int $$3) {
   }

   @Override
   public void a(dgl $$0, eei $$1, dgl.a $$2) {
   }

   @Override
   public dfk x_() {
      return this.i;
   }

   @Override
   public boolean a(gu $$0, Predicate<dcb> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(gu $$0, Predicate<dxe> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bfj> List<T> a(dfz<bfj, T> $$0, eed $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bfj> a(@Nullable bfj $$0, eed $$1, @Nullable Predicate<? super bfj> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<byo> v() {
      return Collections.emptyList();
   }

   @Override
   public int C_() {
      return this.e.C_();
   }

   @Override
   public int D_() {
      return this.e.D_();
   }

   @Override
   public long A_() {
      return this.s.getAndIncrement();
   }
}
