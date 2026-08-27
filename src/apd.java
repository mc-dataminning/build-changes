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

public class apd implements cwm {
   private static final Logger a = LogUtils.getLogger();
   private final List<dnf> b;
   private final dnf c;
   private final int d;
   private final aow e;
   private final long f;
   private final eio g;
   private final awp h;
   private final dov i;
   private final epv<cys> j = new epv<>($$0x -> this.y($$0x).o());
   private final epv<egv> k = new epv<>($$0x -> this.y($$0x).p());
   private final cws l;
   private final cuy m;
   private final cuy n;
   private final cwk o;
   private final dnk p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final aiy t = new aiy("worldgen_region_random");

   public apd(aow $$0, List<dnf> $$1, dnk $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = awi.a(Math.sqrt((double)$$1.size()));
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
         this.l = new cws(this, cws.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(cuy $$0, int $$1) {
      return this.e.l().a.b($$0, $$1);
   }

   public cuy a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public dnf a(int $$0, int $$1) {
      return this.a($$0, $$1, dnk.c);
   }

   @Nullable
   @Override
   public dnf a(int $$0, int $$1, dnk $$2, boolean $$3) {
      dnf $$6;
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
   public dlj a_(hz $$0) {
      return this.a(jb.a($$0.u()), jb.a($$0.w())).a_($$0);
   }

   @Override
   public egw b_(hz $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public chl a(double $$0, double $$1, double $$2, double $$3, Predicate<bnq> $$4) {
      return null;
   }

   @Override
   public int C_() {
      return 0;
   }

   @Override
   public cws G_() {
      return this.l;
   }

   @Override
   public ij<cwq> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(ie $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public egl z_() {
      return this.e.z_();
   }

   @Override
   public boolean a(hz $$0, boolean $$1, @Nullable bnq $$2, int $$3) {
      dlj $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dix $$5 = $$4.t() ? this.c_($$0) : null;
            cys.a($$4, (cvr)this.e, $$0, $$5, $$2, cpd.h);
         }

         return this.a($$0, cyu.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dix c_(hz $$0) {
      dnf $$1 = this.y($$0);
      dix $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         sw $$3 = $$1.f($$0);
         dlj $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((dbk)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dix.a($$0, $$4, $$3);
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
   public boolean f_(hz $$0) {
      int $$1 = jb.a($$0.u());
      int $$2 = jb.a($$0.w());
      cuy $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            cvt $$6 = this.c.z();
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
   public boolean a(hz $$0, dlj $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dnf $$4 = this.y($$0);
         dlj $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dnk.a.b) {
               dix $$6 = ((dbk)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               sw $$7 = new sw();
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

   private void f(hz $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(bnq $$0) {
      int $$1 = jb.a($$0.dq());
      int $$2 = jb.a($$0.dw());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(hz $$0, boolean $$1) {
      return this.a($$0, cyu.a.o(), 3);
   }

   @Override
   public dna D_() {
      return this.e.D_();
   }

   @Override
   public boolean y_() {
      return false;
   }

   @Deprecated
   @Override
   public aow E() {
      return this.e;
   }

   @Override
   public iw I_() {
      return this.e.I_();
   }

   @Override
   public cjw I() {
      return this.e.I();
   }

   @Override
   public eio B_() {
      return this.g;
   }

   @Override
   public blu d_(hz $$0) {
      if (!this.b(jb.a($$0.u()), jb.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new blu(this.e.aj(), this.e.Y(), 0L, this.e.ao());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.e.o();
   }

   @Override
   public dnj L() {
      return this.e.l();
   }

   @Override
   public long C() {
      return this.f;
   }

   @Override
   public epm<cys> N() {
      return this.j;
   }

   @Override
   public epm<egv> M() {
      return this.k;
   }

   @Override
   public int A_() {
      return this.e.A_();
   }

   @Override
   public awp F_() {
      return this.h;
   }

   @Override
   public int a(dqv.a $$0, int $$1, int $$2) {
      return this.a(jb.a($$1), jb.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable chl $$0, hz $$1, atk $$2, atm $$3, float $$4, float $$5) {
   }

   @Override
   public void a(jx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable chl $$0, int $$1, hz $$2, int $$3) {
   }

   @Override
   public void a(ij<dpw> $$0, enz $$1, dpw.a $$2) {
   }

   @Override
   public dov E_() {
      return this.i;
   }

   @Override
   public boolean a(hz $$0, Predicate<dlj> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(hz $$0, Predicate<egw> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bnq> List<T> a(dpk<bnq, T> $$0, enu $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bnq> a(@Nullable bnq $$0, enu $$1, @Nullable Predicate<? super bnq> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<chl> x() {
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
