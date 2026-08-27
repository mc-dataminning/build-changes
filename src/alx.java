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

public class alx implements crt {
   private static final Logger a = LogUtils.getLogger();
   private final List<dhx> b;
   private final dhx c;
   private final int d;
   private final alq e;
   private final long f;
   private final ecv g;
   private final ate h;
   private final djk i;
   private final ejw<cua> j = new ejw<>($$0x -> this.x($$0x).o());
   private final ejw<ebd> k = new ejw<>($$0x -> this.x($$0x).p());
   private final crz l;
   private final cqg m;
   private final cqg n;
   private final crr o;
   private final dic p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final afw t = new afw("worldgen_region_random");

   public alx(alq $$0, List<dhx> $$1, dic $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = asy.a(Math.sqrt((double)$$1.size()));
      if ($$4 * $$4 != $$1.size()) {
         throw (IllegalStateException)ac.b(new IllegalStateException("Cache size is not a square."));
      } else {
         this.b = $$1;
         this.c = $$1.get($$1.size() / 2);
         this.d = $$4;
         this.e = $$0;
         this.f = $$0.A();
         this.g = $$0.A_();
         this.h = $$0.k().i().a(t).a(this.c.f().l());
         this.i = $$0.D_();
         this.l = new crz(this, crz.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(cqg $$0, int $$1) {
      return this.e.k().a.b($$0, $$1);
   }

   public cqg a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public dhx a(int $$0, int $$1) {
      return this.a($$0, $$1, dic.c);
   }

   @Nullable
   @Override
   public dhx a(int $$0, int $$1, dic $$2, boolean $$3) {
      dhx $$6;
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
   public dgb a_(ht $$0) {
      return this.a(iu.a($$0.u()), iu.a($$0.w())).a_($$0);
   }

   @Override
   public ebe b_(ht $$0) {
      return this.x($$0).b_($$0);
   }

   @Nullable
   @Override
   public ccx a(double $$0, double $$1, double $$2, double $$3, Predicate<bjt> $$4) {
      return null;
   }

   @Override
   public int B_() {
      return 0;
   }

   @Override
   public crz F_() {
      return this.l;
   }

   @Override
   public ib<crx> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(hx $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eat y_() {
      return this.e.y_();
   }

   @Override
   public boolean a(ht $$0, boolean $$1, @Nullable bjt $$2, int $$3) {
      dgb $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            ddx $$5 = $$4.t() ? this.c_($$0) : null;
            cua.a($$4, (cqz)this.e, $$0, $$5, $$2, ckj.b);
         }

         return this.a($$0, cuc.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public ddx c_(ht $$0) {
      dhx $$1 = this.x($$0);
      ddx $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         rt $$3 = $$1.f($$0);
         dgb $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((cwq)$$4.b()).a($$0, $$4);
            } else {
               $$2 = ddx.a($$0, $$4, $$3);
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
   public boolean f_(ht $$0) {
      int $$1 = iu.a($$0.u());
      int $$2 = iu.a($$0.w());
      cqg $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            crb $$6 = this.c.z();
            if ($$0.v() < $$6.I_() || $$0.v() >= $$6.aj()) {
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
   public boolean a(ht $$0, dgb $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dhx $$4 = this.x($$0);
         dgb $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dic.a.b) {
               ddx $$6 = ((cwq)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               rt $$7 = new rt();
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

   private void f(ht $$0) {
      this.x($$0).e($$0);
   }

   @Override
   public boolean b(bjt $$0) {
      int $$1 = iu.a($$0.dp());
      int $$2 = iu.a($$0.dv());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(ht $$0, boolean $$1) {
      return this.a($$0, cuc.a.o(), 3);
   }

   @Override
   public dhs C_() {
      return this.e.C_();
   }

   @Override
   public boolean x_() {
      return false;
   }

   @Deprecated
   @Override
   public alq C() {
      return this.e;
   }

   @Override
   public ip H_() {
      return this.e.H_();
   }

   @Override
   public cfg G() {
      return this.e.G();
   }

   @Override
   public ecv A_() {
      return this.g;
   }

   @Override
   public bhz d_(ht $$0) {
      if (!this.b(iu.a($$0.u()), iu.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bhz(this.e.ai(), this.e.W(), 0L, this.e.an());
      }
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return this.e.n();
   }

   @Override
   public dib J() {
      return this.e.k();
   }

   @Override
   public long A() {
      return this.f;
   }

   @Override
   public ejn<cua> L() {
      return this.j;
   }

   @Override
   public ejn<ebd> K() {
      return this.k;
   }

   @Override
   public int z_() {
      return this.e.z_();
   }

   @Override
   public ate E_() {
      return this.h;
   }

   @Override
   public int a(dlk.a $$0, int $$1, int $$2) {
      return this.a(iu.a($$1), iu.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable ccx $$0, ht $$1, aqc $$2, aqe $$3, float $$4, float $$5) {
   }

   @Override
   public void a(jq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable ccx $$0, int $$1, ht $$2, int $$3) {
   }

   @Override
   public void a(dkl $$0, eif $$1, dkl.a $$2) {
   }

   @Override
   public djk D_() {
      return this.i;
   }

   @Override
   public boolean a(ht $$0, Predicate<dgb> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ht $$0, Predicate<ebe> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bjt> List<T> a(djz<bjt, T> $$0, eia $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bjt> a(@Nullable bjt $$0, eia $$1, @Nullable Predicate<? super bjt> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<ccx> v() {
      return Collections.emptyList();
   }

   @Override
   public int I_() {
      return this.e.I_();
   }

   @Override
   public int J_() {
      return this.e.J_();
   }

   @Override
   public long G_() {
      return this.s.getAndIncrement();
   }
}
