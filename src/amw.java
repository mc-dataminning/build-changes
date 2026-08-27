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

public class amw implements ctt {
   private static final Logger a = LogUtils.getLogger();
   private final List<dkl> b;
   private final dkl c;
   private final int d;
   private final amp e;
   private final long f;
   private final efq g;
   private final auf h;
   private final dly i;
   private final ems<cvz> j = new ems<>($$0x -> this.x($$0x).o());
   private final ems<edy> k = new ems<>($$0x -> this.x($$0x).p());
   private final ctz l;
   private final csf m;
   private final csf n;
   private final ctr o;
   private final dkq p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final agt t = new agt("worldgen_region_random");

   public amw(amp $$0, List<dkl> $$1, dkq $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = aty.a(Math.sqrt((double)$$1.size()));
      if ($$4 * $$4 != $$1.size()) {
         throw (IllegalStateException)ac.b(new IllegalStateException("Cache size is not a square."));
      } else {
         this.b = $$1;
         this.c = $$1.get($$1.size() / 2);
         this.d = $$4;
         this.e = $$0;
         this.f = $$0.B();
         this.g = $$0.B_();
         this.h = $$0.k().i().a(t).a(this.c.f().l());
         this.i = $$0.E_();
         this.l = new ctz(this, ctz.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(csf $$0, int $$1) {
      return this.e.k().a.b($$0, $$1);
   }

   public csf a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public dkl a(int $$0, int $$1) {
      return this.a($$0, $$1, dkq.c);
   }

   @Nullable
   @Override
   public dkl a(int $$0, int $$1, dkq $$2, boolean $$3) {
      dkl $$6;
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
   public dip a_(hv $$0) {
      return this.a(ix.a($$0.u()), ix.a($$0.w())).a_($$0);
   }

   @Override
   public edz b_(hv $$0) {
      return this.x($$0).b_($$0);
   }

   @Nullable
   @Override
   public cer a(double $$0, double $$1, double $$2, double $$3, Predicate<blf> $$4) {
      return null;
   }

   @Override
   public int C_() {
      return 0;
   }

   @Override
   public ctz G_() {
      return this.l;
   }

   @Override
   public ie<ctx> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(ia $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public edo z_() {
      return this.e.z_();
   }

   @Override
   public boolean a(hv $$0, boolean $$1, @Nullable blf $$2, int $$3) {
      dip $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dgd $$5 = $$4.t() ? this.c_($$0) : null;
            cvz.a($$4, (csy)this.e, $$0, $$5, $$2, cmh.f);
         }

         return this.a($$0, cwb.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dgd c_(hv $$0) {
      dkl $$1 = this.x($$0);
      dgd $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         sj $$3 = $$1.f($$0);
         dip $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((cyr)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dgd.a($$0, $$4, $$3);
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
   public boolean f_(hv $$0) {
      int $$1 = ix.a($$0.u());
      int $$2 = ix.a($$0.w());
      csf $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            cta $$6 = this.c.z();
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
   public boolean a(hv $$0, dip $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dkl $$4 = this.x($$0);
         dip $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dkq.a.b) {
               dgd $$6 = ((cyr)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               sj $$7 = new sj();
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

   private void f(hv $$0) {
      this.x($$0).e($$0);
   }

   @Override
   public boolean b(blf $$0) {
      int $$1 = ix.a($$0.dq());
      int $$2 = ix.a($$0.dw());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(hv $$0, boolean $$1) {
      return this.a($$0, cwb.a.o(), 3);
   }

   @Override
   public dkg D_() {
      return this.e.D_();
   }

   @Override
   public boolean y_() {
      return false;
   }

   @Deprecated
   @Override
   public amp D() {
      return this.e;
   }

   @Override
   public is I_() {
      return this.e.I_();
   }

   @Override
   public chb H() {
      return this.e.H();
   }

   @Override
   public efq B_() {
      return this.g;
   }

   @Override
   public bjj d_(hv $$0) {
      if (!this.b(ix.a($$0.u()), ix.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bjj(this.e.aj(), this.e.X(), 0L, this.e.ao());
      }
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return this.e.n();
   }

   @Override
   public dkp K() {
      return this.e.k();
   }

   @Override
   public long B() {
      return this.f;
   }

   @Override
   public emj<cvz> M() {
      return this.j;
   }

   @Override
   public emj<edy> L() {
      return this.k;
   }

   @Override
   public int A_() {
      return this.e.A_();
   }

   @Override
   public auf F_() {
      return this.h;
   }

   @Override
   public int a(dny.a $$0, int $$1, int $$2) {
      return this.a(ix.a($$1), ix.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cer $$0, hv $$1, arb $$2, ard $$3, float $$4, float $$5) {
   }

   @Override
   public void a(jt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cer $$0, int $$1, hv $$2, int $$3) {
   }

   @Override
   public void a(dmz $$0, elb $$1, dmz.a $$2) {
   }

   @Override
   public dly E_() {
      return this.i;
   }

   @Override
   public boolean a(hv $$0, Predicate<dip> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(hv $$0, Predicate<edz> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends blf> List<T> a(dmn<blf, T> $$0, ekw $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<blf> a(@Nullable blf $$0, ekw $$1, @Nullable Predicate<? super blf> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cer> w() {
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
