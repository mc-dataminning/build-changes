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

public class ank implements cuj {
   private static final Logger a = LogUtils.getLogger();
   private final List<dlc> b;
   private final dlc c;
   private final int d;
   private final and e;
   private final long f;
   private final egh g;
   private final auu h;
   private final dmp i;
   private final eno<cwp> j = new eno<>($$0x -> this.y($$0x).o());
   private final eno<eep> k = new eno<>($$0x -> this.y($$0x).p());
   private final cup l;
   private final csv m;
   private final csv n;
   private final cuh o;
   private final dlh p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final ahg t = new ahg("worldgen_region_random");

   public ank(and $$0, List<dlc> $$1, dlh $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = aun.a(Math.sqrt((double)$$1.size()));
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
         this.l = new cup(this, cup.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(csv $$0, int $$1) {
      return this.e.l().a.b($$0, $$1);
   }

   public csv a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public dlc a(int $$0, int $$1) {
      return this.a($$0, $$1, dlh.c);
   }

   @Nullable
   @Override
   public dlc a(int $$0, int $$1, dlh $$2, boolean $$3) {
      dlc $$6;
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
   public djg a_(hx $$0) {
      return this.a(iz.a($$0.u()), iz.a($$0.w())).a_($$0);
   }

   @Override
   public eeq b_(hx $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cfh a(double $$0, double $$1, double $$2, double $$3, Predicate<blu> $$4) {
      return null;
   }

   @Override
   public int C_() {
      return 0;
   }

   @Override
   public cup G_() {
      return this.l;
   }

   @Override
   public ih<cun> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(ic $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eef z_() {
      return this.e.z_();
   }

   @Override
   public boolean a(hx $$0, boolean $$1, @Nullable blu $$2, int $$3) {
      djg $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dgu $$5 = $$4.t() ? this.c_($$0) : null;
            cwp.a($$4, (cto)this.e, $$0, $$5, $$2, cmx.f);
         }

         return this.a($$0, cwr.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dgu c_(hx $$0) {
      dlc $$1 = this.y($$0);
      dgu $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         sn $$3 = $$1.f($$0);
         djg $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((czh)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dgu.a($$0, $$4, $$3);
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
      csv $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            ctq $$6 = this.c.z();
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
   public boolean a(hx $$0, djg $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dlc $$4 = this.y($$0);
         djg $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dlh.a.b) {
               dgu $$6 = ((czh)$$1.b()).a($$0, $$1);
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
   public boolean b(blu $$0) {
      int $$1 = iz.a($$0.dq());
      int $$2 = iz.a($$0.dw());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(hx $$0, boolean $$1) {
      return this.a($$0, cwr.a.o(), 3);
   }

   @Override
   public dkx D_() {
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
   public chr I() {
      return this.e.I();
   }

   @Override
   public egh B_() {
      return this.g;
   }

   @Override
   public bjy d_(hx $$0) {
      if (!this.b(iz.a($$0.u()), iz.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bjy(this.e.ak(), this.e.Y(), 0L, this.e.ap());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.e.o();
   }

   @Override
   public dlg L() {
      return this.e.l();
   }

   @Override
   public long C() {
      return this.f;
   }

   @Override
   public enf<cwp> N() {
      return this.j;
   }

   @Override
   public enf<eep> M() {
      return this.k;
   }

   @Override
   public int A_() {
      return this.e.A_();
   }

   @Override
   public auu F_() {
      return this.h;
   }

   @Override
   public int a(dop.a $$0, int $$1, int $$2) {
      return this.a(iz.a($$1), iz.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cfh $$0, hx $$1, arq $$2, ars $$3, float $$4, float $$5) {
   }

   @Override
   public void a(jv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cfh $$0, int $$1, hx $$2, int $$3) {
   }

   @Override
   public void a(dnq $$0, els $$1, dnq.a $$2) {
   }

   @Override
   public dmp E_() {
      return this.i;
   }

   @Override
   public boolean a(hx $$0, Predicate<djg> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(hx $$0, Predicate<eeq> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends blu> List<T> a(dne<blu, T> $$0, eln $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<blu> a(@Nullable blu $$0, eln $$1, @Nullable Predicate<? super blu> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cfh> x() {
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
