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

public class amh implements csm {
   private static final Logger a = LogUtils.getLogger();
   private final List<dis> b;
   private final dis c;
   private final int d;
   private final ama e;
   private final long f;
   private final edx g;
   private final ato h;
   private final dkf i;
   private final ekz<cut> j = new ekz<>($$0x -> this.x($$0x).o());
   private final ekz<ecf> k = new ekz<>($$0x -> this.x($$0x).p());
   private final css l;
   private final cqz m;
   private final cqz n;
   private final csk o;
   private final dix p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final agg t = new agg("worldgen_region_random");

   public amh(ama $$0, List<dis> $$1, dix $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = ati.a(Math.sqrt((double)$$1.size()));
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
         this.l = new css(this, css.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(cqz $$0, int $$1) {
      return this.e.k().a.b($$0, $$1);
   }

   public cqz a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public dis a(int $$0, int $$1) {
      return this.a($$0, $$1, dix.c);
   }

   @Nullable
   @Override
   public dis a(int $$0, int $$1, dix $$2, boolean $$3) {
      dis $$6;
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
   public dgw a_(ht $$0) {
      return this.a(iu.a($$0.u()), iu.a($$0.w())).a_($$0);
   }

   @Override
   public ecg b_(ht $$0) {
      return this.x($$0).b_($$0);
   }

   @Nullable
   @Override
   public cdm a(double $$0, double $$1, double $$2, double $$3, Predicate<bki> $$4) {
      return null;
   }

   @Override
   public int B_() {
      return 0;
   }

   @Override
   public css F_() {
      return this.l;
   }

   @Override
   public ib<csq> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(hx $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public ebv y_() {
      return this.e.y_();
   }

   @Override
   public boolean a(ht $$0, boolean $$1, @Nullable bki $$2, int $$3) {
      dgw $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            der $$5 = $$4.t() ? this.c_($$0) : null;
            cut.a($$4, (crs)this.e, $$0, $$5, $$2, clb.b);
         }

         return this.a($$0, cuv.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public der c_(ht $$0) {
      dis $$1 = this.x($$0);
      der $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         rz $$3 = $$1.f($$0);
         dgw $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((cxk)$$4.b()).a($$0, $$4);
            } else {
               $$2 = der.a($$0, $$4, $$3);
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
      cqz $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            cru $$6 = this.c.z();
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
   public boolean a(ht $$0, dgw $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dis $$4 = this.x($$0);
         dgw $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dix.a.b) {
               der $$6 = ((cxk)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               rz $$7 = new rz();
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
   public boolean b(bki $$0) {
      int $$1 = iu.a($$0.dp());
      int $$2 = iu.a($$0.dv());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(ht $$0, boolean $$1) {
      return this.a($$0, cuv.a.o(), 3);
   }

   @Override
   public din C_() {
      return this.e.C_();
   }

   @Override
   public boolean x_() {
      return false;
   }

   @Deprecated
   @Override
   public ama C() {
      return this.e;
   }

   @Override
   public ip H_() {
      return this.e.H_();
   }

   @Override
   public cfv G() {
      return this.e.G();
   }

   @Override
   public edx A_() {
      return this.g;
   }

   @Override
   public bio d_(ht $$0) {
      if (!this.b(iu.a($$0.u()), iu.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bio(this.e.ai(), this.e.W(), 0L, this.e.an());
      }
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return this.e.n();
   }

   @Override
   public diw J() {
      return this.e.k();
   }

   @Override
   public long A() {
      return this.f;
   }

   @Override
   public ekq<cut> L() {
      return this.j;
   }

   @Override
   public ekq<ecf> K() {
      return this.k;
   }

   @Override
   public int z_() {
      return this.e.z_();
   }

   @Override
   public ato E_() {
      return this.h;
   }

   @Override
   public int a(dmf.a $$0, int $$1, int $$2) {
      return this.a(iu.a($$1), iu.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cdm $$0, ht $$1, aqm $$2, aqo $$3, float $$4, float $$5) {
   }

   @Override
   public void a(jq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cdm $$0, int $$1, ht $$2, int $$3) {
   }

   @Override
   public void a(dlg $$0, eji $$1, dlg.a $$2) {
   }

   @Override
   public dkf D_() {
      return this.i;
   }

   @Override
   public boolean a(ht $$0, Predicate<dgw> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ht $$0, Predicate<ecg> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bki> List<T> a(dku<bki, T> $$0, ejd $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bki> a(@Nullable bki $$0, ejd $$1, @Nullable Predicate<? super bki> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cdm> v() {
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
