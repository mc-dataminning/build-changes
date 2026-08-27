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

public class aph implements cwz {
   private static final Logger a = LogUtils.getLogger();
   private final List<doa> b;
   private final doa c;
   private final int d;
   private final apa e;
   private final long f;
   private final ejk g;
   private final awt h;
   private final dpq i;
   private final eqr<czf> j = new eqr<>($$0x -> this.y($$0x).o());
   private final eqr<ehq> k = new eqr<>($$0x -> this.y($$0x).p());
   private final cxf l;
   private final cvl m;
   private final cvl n;
   private final cwx o;
   private final dof p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final ajc t = new ajc("worldgen_region_random");

   public aph(apa $$0, List<doa> $$1, dof $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = awm.a(Math.sqrt((double)$$1.size()));
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
         this.l = new cxf(this, cxf.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(cvl $$0, int $$1) {
      return this.e.l().a.b($$0, $$1);
   }

   public cvl a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public doa a(int $$0, int $$1) {
      return this.a($$0, $$1, dof.c);
   }

   @Nullable
   @Override
   public doa a(int $$0, int $$1, dof $$2, boolean $$3) {
      doa $$6;
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
   public dme a_(ib $$0) {
      return this.a(jd.a($$0.u()), jd.a($$0.w())).a_($$0);
   }

   @Override
   public ehr b_(ib $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cia a(double $$0, double $$1, double $$2, double $$3, Predicate<bof> $$4) {
      return null;
   }

   @Override
   public int C_() {
      return 0;
   }

   @Override
   public cxf G_() {
      return this.l;
   }

   @Override
   public il<cxd> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(ih $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public ehg z_() {
      return this.e.z_();
   }

   @Override
   public boolean a(ib $$0, boolean $$1, @Nullable bof $$2, int $$3) {
      dme $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            djl $$5 = $$4.t() ? this.c_($$0) : null;
            czf.a($$4, (cwe)this.e, $$0, $$5, $$2, cpq.h);
         }

         return this.a($$0, czh.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public djl c_(ib $$0) {
      doa $$1 = this.y($$0);
      djl $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         sy $$3 = $$1.f($$0);
         dme $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((dbx)$$4.b()).a($$0, $$4);
            } else {
               $$2 = djl.a($$0, $$4, $$3, this.e.I_());
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
   public boolean f_(ib $$0) {
      int $$1 = jd.a($$0.u());
      int $$2 = jd.a($$0.w());
      cvl $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            cwg $$6 = this.c.z();
            if ($$0.v() < $$6.J_() || $$0.v() >= $$6.ak()) {
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
   public boolean a(ib $$0, dme $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         doa $$4 = this.y($$0);
         dme $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dof.a.b) {
               djl $$6 = ((dbx)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               sy $$7 = new sy();
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

   private void f(ib $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(bof $$0) {
      int $$1 = jd.a($$0.dn());
      int $$2 = jd.a($$0.dt());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(ib $$0, boolean $$1) {
      return this.a($$0, czh.a.o(), 3);
   }

   @Override
   public dnv D_() {
      return this.e.D_();
   }

   @Override
   public boolean y_() {
      return false;
   }

   @Deprecated
   @Override
   public apa E() {
      return this.e;
   }

   @Override
   public iy I_() {
      return this.e.I_();
   }

   @Override
   public ckl I() {
      return this.e.I();
   }

   @Override
   public ejk B_() {
      return this.g;
   }

   @Override
   public bmj d_(ib $$0) {
      if (!this.b(jd.a($$0.u()), jd.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bmj(this.e.aj(), this.e.Y(), 0L, this.e.ao());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.e.o();
   }

   @Override
   public doe L() {
      return this.e.l();
   }

   @Override
   public long C() {
      return this.f;
   }

   @Override
   public eqi<czf> N() {
      return this.j;
   }

   @Override
   public eqi<ehq> M() {
      return this.k;
   }

   @Override
   public int A_() {
      return this.e.A_();
   }

   @Override
   public awt F_() {
      return this.h;
   }

   @Override
   public int a(drq.a $$0, int $$1, int $$2) {
      return this.a(jd.a($$1), jd.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cia $$0, ib $$1, ato $$2, atq $$3, float $$4, float $$5) {
   }

   @Override
   public void a(jz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cia $$0, int $$1, ib $$2, int $$3) {
   }

   @Override
   public void a(il<dqr> $$0, eov $$1, dqr.a $$2) {
   }

   @Override
   public dpq E_() {
      return this.i;
   }

   @Override
   public boolean a(ib $$0, Predicate<dme> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ib $$0, Predicate<ehr> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bof> List<T> a(dqf<bof, T> $$0, eoq $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bof> a(@Nullable bof $$0, eoq $$1, @Nullable Predicate<? super bof> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cia> x() {
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
