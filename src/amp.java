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

public class amp implements csz {
   private static final Logger a = LogUtils.getLogger();
   private final List<djj> b;
   private final djj c;
   private final int d;
   private final ami e;
   private final long f;
   private final eeo g;
   private final atw h;
   private final dkw i;
   private final elq<cvf> j = new elq<>($$0x -> this.x($$0x).o());
   private final elq<ecw> k = new elq<>($$0x -> this.x($$0x).p());
   private final ctf l;
   private final crm m;
   private final crm n;
   private final csx o;
   private final djo p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final agm t = new agm("worldgen_region_random");

   public amp(ami $$0, List<djj> $$1, djo $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = atq.a(Math.sqrt((double)$$1.size()));
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
         this.l = new ctf(this, ctf.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(crm $$0, int $$1) {
      return this.e.k().a.b($$0, $$1);
   }

   public crm a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public djj a(int $$0, int $$1) {
      return this.a($$0, $$1, djo.c);
   }

   @Nullable
   @Override
   public djj a(int $$0, int $$1, djo $$2, boolean $$3) {
      djj $$6;
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
   public dhn a_(hx $$0) {
      return this.a(iy.a($$0.u()), iy.a($$0.w())).a_($$0);
   }

   @Override
   public ecx b_(hx $$0) {
      return this.x($$0).b_($$0);
   }

   @Nullable
   @Override
   public cdz a(double $$0, double $$1, double $$2, double $$3, Predicate<bkv> $$4) {
      return null;
   }

   @Override
   public int C_() {
      return 0;
   }

   @Override
   public ctf G_() {
      return this.l;
   }

   @Override
   public ig<ctd> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(ib $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public ecm z_() {
      return this.e.z_();
   }

   @Override
   public boolean a(hx $$0, boolean $$1, @Nullable bkv $$2, int $$3) {
      dhn $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dfi $$5 = $$4.t() ? this.c_($$0) : null;
            cvf.a($$4, (csf)this.e, $$0, $$5, $$2, clo.b);
         }

         return this.a($$0, cvh.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dfi c_(hx $$0) {
      djj $$1 = this.x($$0);
      dfi $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         sd $$3 = $$1.f($$0);
         dhn $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((cxx)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dfi.a($$0, $$4, $$3);
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
      int $$1 = iy.a($$0.u());
      int $$2 = iy.a($$0.w());
      crm $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            csh $$6 = this.c.z();
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
   public boolean a(hx $$0, dhn $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         djj $$4 = this.x($$0);
         dhn $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == djo.a.b) {
               dfi $$6 = ((cxx)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               sd $$7 = new sd();
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
      this.x($$0).e($$0);
   }

   @Override
   public boolean b(bkv $$0) {
      int $$1 = iy.a($$0.dr());
      int $$2 = iy.a($$0.dx());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(hx $$0, boolean $$1) {
      return this.a($$0, cvh.a.o(), 3);
   }

   @Override
   public dje D_() {
      return this.e.D_();
   }

   @Override
   public boolean y_() {
      return false;
   }

   @Deprecated
   @Override
   public ami D() {
      return this.e;
   }

   @Override
   public it I_() {
      return this.e.I_();
   }

   @Override
   public cgi H() {
      return this.e.H();
   }

   @Override
   public eeo B_() {
      return this.g;
   }

   @Override
   public biz d_(hx $$0) {
      if (!this.b(iy.a($$0.u()), iy.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new biz(this.e.aj(), this.e.X(), 0L, this.e.ao());
      }
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return this.e.n();
   }

   @Override
   public djn K() {
      return this.e.k();
   }

   @Override
   public long B() {
      return this.f;
   }

   @Override
   public elh<cvf> M() {
      return this.j;
   }

   @Override
   public elh<ecw> L() {
      return this.k;
   }

   @Override
   public int A_() {
      return this.e.A_();
   }

   @Override
   public atw F_() {
      return this.h;
   }

   @Override
   public int a(dmw.a $$0, int $$1, int $$2) {
      return this.a(iy.a($$1), iy.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cdz $$0, hx $$1, aqu $$2, aqw $$3, float $$4, float $$5) {
   }

   @Override
   public void a(ju $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cdz $$0, int $$1, hx $$2, int $$3) {
   }

   @Override
   public void a(dlx $$0, ejz $$1, dlx.a $$2) {
   }

   @Override
   public dkw E_() {
      return this.i;
   }

   @Override
   public boolean a(hx $$0, Predicate<dhn> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(hx $$0, Predicate<ecx> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bkv> List<T> a(dll<bkv, T> $$0, eju $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bkv> a(@Nullable bkv $$0, eju $$1, @Nullable Predicate<? super bkv> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cdz> w() {
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
