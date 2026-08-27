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

public class akz implements cqr {
   private static final Logger a = LogUtils.getLogger();
   private final List<dhh> b;
   private final dhh c;
   private final int d;
   private final aks e;
   private final long f;
   private final ecf g;
   private final ase h;
   private final diu i;
   private final ejg<csx> j = new ejg<>($$0x -> this.x($$0x).o());
   private final ejg<ean> k = new ejg<>($$0x -> this.x($$0x).p());
   private final cqx l;
   private final cpe m;
   private final cpe n;
   private final cqp o;
   private final dhm p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final aey t = new aey("worldgen_region_random");

   public akz(aks $$0, List<dhh> $$1, dhm $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = ary.a(Math.sqrt((double)$$1.size()));
      if ($$4 * $$4 != $$1.size()) {
         throw (IllegalStateException)ac.b(new IllegalStateException("Cache size is not a square."));
      } else {
         this.b = $$1;
         this.c = $$1.get($$1.size() / 2);
         this.d = $$4;
         this.e = $$0;
         this.f = $$0.A();
         this.g = $$0.z_();
         this.h = $$0.k().i().a(t).a(this.c.f().l());
         this.i = $$0.C_();
         this.l = new cqx(this, cqx.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(cpe $$0, int $$1) {
      return this.e.k().a.b($$0, $$1);
   }

   public cpe a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public dhh a(int $$0, int $$1) {
      return this.a($$0, $$1, dhm.c);
   }

   @Nullable
   @Override
   public dhh a(int $$0, int $$1, dhm $$2, boolean $$3) {
      dhh $$6;
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
   public dfl a_(gw $$0) {
      return this.a(hz.a($$0.u()), hz.a($$0.w())).a_($$0);
   }

   @Override
   public eao b_(gw $$0) {
      return this.x($$0).b_($$0);
   }

   @Nullable
   @Override
   public cbw a(double $$0, double $$1, double $$2, double $$3, Predicate<bis> $$4) {
      return null;
   }

   @Override
   public int A_() {
      return 0;
   }

   @Override
   public cqx E_() {
      return this.l;
   }

   @Override
   public hg<cqv> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(hc $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public ead x_() {
      return this.e.x_();
   }

   @Override
   public boolean a(gw $$0, boolean $$1, @Nullable bis $$2, int $$3) {
      dfl $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dcx $$5 = $$4.t() ? this.c_($$0) : null;
            csx.a($$4, (cpx)this.e, $$0, $$5, $$2, cjh.b);
         }

         return this.a($$0, csy.a.n(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dcx c_(gw $$0) {
      dhh $$1 = this.x($$0);
      dcx $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         qy $$3 = $$1.f($$0);
         dfl $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((cvl)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dcx.a($$0, $$4, $$3);
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
   public boolean f_(gw $$0) {
      int $$1 = hz.a($$0.u());
      int $$2 = hz.a($$0.w());
      cpe $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            cpz $$6 = this.c.z();
            if ($$0.v() < $$6.H_() || $$0.v() >= $$6.aj()) {
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
   public boolean a(gw $$0, dfl $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dhh $$4 = this.x($$0);
         dfl $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dhm.a.b) {
               dcx $$6 = ((cvl)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               qy $$7 = new qy();
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

   private void f(gw $$0) {
      this.x($$0).e($$0);
   }

   @Override
   public boolean b(bis $$0) {
      int $$1 = hz.a($$0.dp());
      int $$2 = hz.a($$0.dv());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(gw $$0, boolean $$1) {
      return this.a($$0, csy.a.n(), 3);
   }

   @Override
   public dhc B_() {
      return this.e.B_();
   }

   @Override
   public boolean w_() {
      return false;
   }

   @Deprecated
   @Override
   public aks C() {
      return this.e;
   }

   @Override
   public hu G_() {
      return this.e.G_();
   }

   @Override
   public cee G() {
      return this.e.G();
   }

   @Override
   public ecf z_() {
      return this.g;
   }

   @Override
   public bgy d_(gw $$0) {
      if (!this.b(hz.a($$0.u()), hz.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bgy(this.e.ai(), this.e.W(), 0L, this.e.an());
      }
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return this.e.n();
   }

   @Override
   public dhl J() {
      return this.e.k();
   }

   @Override
   public long A() {
      return this.f;
   }

   @Override
   public eix<csx> L() {
      return this.j;
   }

   @Override
   public eix<ean> K() {
      return this.k;
   }

   @Override
   public int y_() {
      return this.e.y_();
   }

   @Override
   public ase D_() {
      return this.h;
   }

   @Override
   public int a(dku.a $$0, int $$1, int $$2) {
      return this.a(hz.a($$1), hz.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cbw $$0, gw $$1, ape $$2, apg $$3, float $$4, float $$5) {
   }

   @Override
   public void a(iv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cbw $$0, int $$1, gw $$2, int $$3) {
   }

   @Override
   public void a(djv $$0, ehp $$1, djv.a $$2) {
   }

   @Override
   public diu C_() {
      return this.i;
   }

   @Override
   public boolean a(gw $$0, Predicate<dfl> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(gw $$0, Predicate<eao> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bis> List<T> a(djj<bis, T> $$0, ehk $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bis> a(@Nullable bis $$0, ehk $$1, @Nullable Predicate<? super bis> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cbw> v() {
      return Collections.emptyList();
   }

   @Override
   public int H_() {
      return this.e.H_();
   }

   @Override
   public int I_() {
      return this.e.I_();
   }

   @Override
   public long F_() {
      return this.s.getAndIncrement();
   }
}
