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

public class ank implements cuk {
   private static final Logger a = LogUtils.getLogger();
   private final List<dld> b;
   private final dld c;
   private final int d;
   private final and e;
   private final long f;
   private final egi g;
   private final auv h;
   private final dmq i;
   private final enp<cwq> j = new enp<>($$0x -> this.y($$0x).o());
   private final enp<eeq> k = new enp<>($$0x -> this.y($$0x).p());
   private final cuq l;
   private final csw m;
   private final csw n;
   private final cui o;
   private final dli p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final ahg t = new ahg("worldgen_region_random");

   public ank(and $$0, List<dld> $$1, dli $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = auo.a(Math.sqrt((double)$$1.size()));
      if ($$4 * $$4 != $$1.size()) {
         throw (IllegalStateException)ac.b(new IllegalStateException("Cache size is not a square."));
      } else {
         this.b = $$1;
         this.c = $$1.get($$1.size() / 2);
         this.d = $$4;
         this.e = $$0;
         this.f = $$0.C();
         this.g = $$0.B_();
         this.h = $$0.l().i().a(t).a(this.c.f().l());
         this.i = $$0.E_();
         this.l = new cuq(this, cuq.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(csw $$0, int $$1) {
      return this.e.l().a.b($$0, $$1);
   }

   public csw a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public dld a(int $$0, int $$1) {
      return this.a($$0, $$1, dli.c);
   }

   @Nullable
   @Override
   public dld a(int $$0, int $$1, dli $$2, boolean $$3) {
      dld $$6;
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
   public djh a_(hx $$0) {
      return this.a(iz.a($$0.u()), iz.a($$0.w())).a_($$0);
   }

   @Override
   public eer b_(hx $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cfi a(double $$0, double $$1, double $$2, double $$3, Predicate<blv> $$4) {
      return null;
   }

   @Override
   public int C_() {
      return 0;
   }

   @Override
   public cuq G_() {
      return this.l;
   }

   @Override
   public ih<cuo> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(ic $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eeg z_() {
      return this.e.z_();
   }

   @Override
   public boolean a(hx $$0, boolean $$1, @Nullable blv $$2, int $$3) {
      djh $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dgv $$5 = $$4.t() ? this.c_($$0) : null;
            cwq.a($$4, (ctp)this.e, $$0, $$5, $$2, cmy.f);
         }

         return this.a($$0, cws.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dgv c_(hx $$0) {
      dld $$1 = this.y($$0);
      dgv $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         sn $$3 = $$1.f($$0);
         djh $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((czi)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dgv.a($$0, $$4, $$3);
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
   public boolean f_(hx $$0) {
      int $$1 = iz.a($$0.u());
      int $$2 = iz.a($$0.w());
      csw $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            ctr $$6 = this.c.z();
            if ($$0.v() < $$6.J_() || $$0.v() >= $$6.al()) {
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
   public boolean a(hx $$0, djh $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dld $$4 = this.y($$0);
         djh $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dli.a.b) {
               dgv $$6 = ((czi)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               sn $$7 = new sn();
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

   private void f(hx $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(blv $$0) {
      int $$1 = iz.a($$0.dq());
      int $$2 = iz.a($$0.dw());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(hx $$0, boolean $$1) {
      return this.a($$0, cws.a.o(), 3);
   }

   @Override
   public dky D_() {
      return this.e.D_();
   }

   @Override
   public boolean y_() {
      return false;
   }

   @Deprecated
   @Override
   public and E() {
      return this.e;
   }

   @Override
   public iu I_() {
      return this.e.I_();
   }

   @Override
   public chs I() {
      return this.e.I();
   }

   @Override
   public egi B_() {
      return this.g;
   }

   @Override
   public bjz d_(hx $$0) {
      if (!this.b(iz.a($$0.u()), iz.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bjz(this.e.ak(), this.e.Y(), 0L, this.e.ap());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.e.o();
   }

   @Override
   public dlh L() {
      return this.e.l();
   }

   @Override
   public long C() {
      return this.f;
   }

   @Override
   public eng<cwq> N() {
      return this.j;
   }

   @Override
   public eng<eeq> M() {
      return this.k;
   }

   @Override
   public int A_() {
      return this.e.A_();
   }

   @Override
   public auv F_() {
      return this.h;
   }

   @Override
   public int a(doq.a $$0, int $$1, int $$2) {
      return this.a(iz.a($$1), iz.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cfi $$0, hx $$1, arr $$2, art $$3, float $$4, float $$5) {
   }

   @Override
   public void a(jv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cfi $$0, int $$1, hx $$2, int $$3) {
   }

   @Override
   public void a(dnr $$0, elt $$1, dnr.a $$2) {
   }

   @Override
   public dmq E_() {
      return this.i;
   }

   @Override
   public boolean a(hx $$0, Predicate<djh> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(hx $$0, Predicate<eer> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends blv> List<T> a(dnf<blv, T> $$0, elo $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<blv> a(@Nullable blv $$0, elo $$1, @Nullable Predicate<? super blv> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cfi> x() {
      return Collections.emptyList();
   }

   @Override
   public int J_() {
      return this.e.J_();
   }

   @Override
   public int K_() {
      return this.e.K_();
   }

   @Override
   public long H_() {
      return this.s.getAndIncrement();
   }
}
