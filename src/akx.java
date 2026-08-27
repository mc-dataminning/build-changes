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

public class akx implements cqp {
   private static final Logger a = LogUtils.getLogger();
   private final List<dhf> b;
   private final dhf c;
   private final int d;
   private final akq e;
   private final long f;
   private final ecd g;
   private final asc h;
   private final dis i;
   private final eje<csv> j = new eje<>($$0x -> this.x($$0x).o());
   private final eje<eal> k = new eje<>($$0x -> this.x($$0x).p());
   private final cqv l;
   private final cpc m;
   private final cpc n;
   private final cqn o;
   private final dhk p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final aew t = new aew("worldgen_region_random");

   public akx(akq $$0, List<dhf> $$1, dhk $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = arw.a(Math.sqrt((double)$$1.size()));
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
         this.l = new cqv(this, cqv.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(cpc $$0, int $$1) {
      return this.e.k().a.b($$0, $$1);
   }

   public cpc a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public dhf a(int $$0, int $$1) {
      return this.a($$0, $$1, dhk.c);
   }

   @Nullable
   @Override
   public dhf a(int $$0, int $$1, dhk $$2, boolean $$3) {
      dhf $$6;
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
   public dfj a_(gw $$0) {
      return this.a(hw.a($$0.u()), hw.a($$0.w())).a_($$0);
   }

   @Override
   public eam b_(gw $$0) {
      return this.x($$0).b_($$0);
   }

   @Nullable
   @Override
   public cbu a(double $$0, double $$1, double $$2, double $$3, Predicate<biq> $$4) {
      return null;
   }

   @Override
   public int A_() {
      return 0;
   }

   @Override
   public cqv E_() {
      return this.l;
   }

   @Override
   public he<cqt> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(ha $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eab x_() {
      return this.e.x_();
   }

   @Override
   public boolean a(gw $$0, boolean $$1, @Nullable biq $$2, int $$3) {
      dfj $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dcv $$5 = $$4.t() ? this.c_($$0) : null;
            csv.a($$4, (cpv)this.e, $$0, $$5, $$2, cjf.b);
         }

         return this.a($$0, csw.a.n(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dcv c_(gw $$0) {
      dhf $$1 = this.x($$0);
      dcv $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         qw $$3 = $$1.f($$0);
         dfj $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((cvj)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dcv.a($$0, $$4, $$3);
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
      int $$1 = hw.a($$0.u());
      int $$2 = hw.a($$0.w());
      cpc $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            cpx $$6 = this.c.z();
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
   public boolean a(gw $$0, dfj $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dhf $$4 = this.x($$0);
         dfj $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dhk.a.b) {
               dcv $$6 = ((cvj)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               qw $$7 = new qw();
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
   public boolean b(biq $$0) {
      int $$1 = hw.a($$0.dp());
      int $$2 = hw.a($$0.dv());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(gw $$0, boolean $$1) {
      return this.a($$0, csw.a.n(), 3);
   }

   @Override
   public dha B_() {
      return this.e.B_();
   }

   @Override
   public boolean w_() {
      return false;
   }

   @Deprecated
   @Override
   public akq C() {
      return this.e;
   }

   @Override
   public hr G_() {
      return this.e.G_();
   }

   @Override
   public cec G() {
      return this.e.G();
   }

   @Override
   public ecd z_() {
      return this.g;
   }

   @Override
   public bgw d_(gw $$0) {
      if (!this.b(hw.a($$0.u()), hw.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bgw(this.e.ai(), this.e.W(), 0L, this.e.an());
      }
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return this.e.n();
   }

   @Override
   public dhj J() {
      return this.e.k();
   }

   @Override
   public long A() {
      return this.f;
   }

   @Override
   public eiv<csv> L() {
      return this.j;
   }

   @Override
   public eiv<eal> K() {
      return this.k;
   }

   @Override
   public int y_() {
      return this.e.y_();
   }

   @Override
   public asc D_() {
      return this.h;
   }

   @Override
   public int a(dks.a $$0, int $$1, int $$2) {
      return this.a(hw.a($$1), hw.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cbu $$0, gw $$1, apc $$2, ape $$3, float $$4, float $$5) {
   }

   @Override
   public void a(it $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cbu $$0, int $$1, gw $$2, int $$3) {
   }

   @Override
   public void a(djt $$0, ehn $$1, djt.a $$2) {
   }

   @Override
   public dis C_() {
      return this.i;
   }

   @Override
   public boolean a(gw $$0, Predicate<dfj> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(gw $$0, Predicate<eam> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends biq> List<T> a(djh<biq, T> $$0, ehi $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<biq> a(@Nullable biq $$0, ehi $$1, @Nullable Predicate<? super biq> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cbu> v() {
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
