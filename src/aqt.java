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

public class aqt implements ddc {
   private static final Logger a = LogUtils.getLogger();
   private final aza<aqf> b;
   private final duh c;
   private final aqm d;
   private final long e;
   private final eqg f;
   private final ayo g;
   private final dwg h;
   private final eyd<dfi> i = new eyd<>($$0x -> this.y($$0x).o());
   private final eyd<eoi> j = new eyd<>($$0x -> this.y($$0x).p());
   private final ddi k;
   private final dvl l;
   @Nullable
   private Supplier<String> m;
   private final AtomicLong n = new AtomicLong();
   private static final akk o = new akk("worldgen_region_random");

   public aqt(aqm $$0, aza<aqf> $$1, dvl $$2, duh $$3) {
      this.l = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.C();
      this.f = $$0.A_();
      this.g = $$0.l().i().a(o).a(this.c.f().l());
      this.h = $$0.D_();
      this.k = new ddi(this, ddi.a(this.e));
   }

   public boolean a(dbn $$0, int $$1) {
      return this.d.l().a.b($$0, $$1);
   }

   public dbn a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.m = $$0;
   }

   @Override
   public duh a(int $$0, int $$1) {
      return this.a($$0, $$1, dvi.c);
   }

   @Nullable
   @Override
   public duh a(int $$0, int $$1, dvi $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      dvi $$5 = $$4 >= this.l.b().b() ? null : this.l.b().a($$4);
      aqf $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            duh $$7 = $$6.a($$5);
            if ($$7 != null) {
               return $$7;
            }
         }
      } else {
         $$6 = null;
      }

      o $$9 = o.a(new IllegalStateException("Requested chunk unavailable during world generation"), "Exception generating new chunk");
      p $$10 = $$9.a("Chunk request details");
      $$10.a("Requested chunk", String.format(Locale.ROOT, "%d, %d", $$0, $$1));
      $$10.a("Generating status", () -> this.l.a().f());
      $$10.a("Requested status", $$2::f);
      $$10.a("Actual status", () -> $$6 == null ? "[out of cache bounds]" : $$6.q().f());
      $$10.a("Maximum allowed status", () -> $$5 == null ? "null" : $$5.f());
      $$10.a("Dependencies", this.l.b()::toString);
      $$10.a("Requested distance", $$4);
      $$10.a("Generating chunk", this.c.f()::toString);
      throw new y($$9);
   }

   @Override
   public boolean b(int $$0, int $$1) {
      int $$2 = this.c.f().e($$0, $$1);
      return $$2 < this.l.b().b();
   }

   @Override
   public dsl a_(ja $$0) {
      return this.a(kc.a($$0.u()), kc.a($$0.w())).a_($$0);
   }

   @Override
   public eoj b_(ja $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cml a(double $$0, double $$1, double $$2, double $$3, Predicate<bsh> $$4) {
      return null;
   }

   @Override
   public int B_() {
      return 0;
   }

   @Override
   public ddi F_() {
      return this.k;
   }

   @Override
   public jj<ddg> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jf $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eny y_() {
      return this.d.y_();
   }

   @Override
   public boolean a(ja $$0, boolean $$1, @Nullable bsh $$2, int $$3) {
      dsl $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dpq $$5 = $$4.t() ? this.c_($$0) : null;
            dfi.a($$4, (dcg)this.d, $$0, $$5, $$2, cud.l);
         }

         return this.a($$0, dfk.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dpq c_(ja $$0) {
      duh $$1 = this.y($$0);
      dpq $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         tx $$3 = $$1.f($$0);
         dsl $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((dia)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dpq.a($$0, $$4, $$3, this.d.H_());
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
   public boolean f_(ja $$0) {
      int $$1 = kc.a($$0.u());
      int $$2 = kc.a($$0.w());
      dbn $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.l.d() && $$5 <= this.l.d()) {
         if (this.c.y()) {
            dci $$6 = this.c.z();
            if ($$0.v() < $$6.I_() || $$0.v() >= $$6.am()) {
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
               + this.l.a()
               + (this.m == null ? "" : ", currently generating: " + this.m.get())
         );
         return false;
      }
   }

   @Override
   public boolean a(ja $$0, dsl $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         duh $$4 = this.y($$0);
         dsl $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().d() == dvm.b) {
               dpq $$6 = ((dia)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               tx $$7 = new tx();
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

   private void f(ja $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(bsh $$0) {
      int $$1 = kc.a($$0.dv());
      int $$2 = kc.a($$0.dB());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(ja $$0, boolean $$1) {
      return this.a($$0, dfk.a.o(), 3);
   }

   @Override
   public duc C_() {
      return this.d.C_();
   }

   @Override
   public boolean x_() {
      return false;
   }

   @Deprecated
   @Override
   public aqm E() {
      return this.d;
   }

   @Override
   public jx H_() {
      return this.d.H_();
   }

   @Override
   public coz J() {
      return this.d.J();
   }

   @Override
   public eqg A_() {
      return this.f;
   }

   @Override
   public bqf d_(ja $$0) {
      if (!this.b(kc.a($$0.u()), kc.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bqf(this.d.al(), this.d.aa(), 0L, this.d.aq());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.d.o();
   }

   @Override
   public dul N() {
      return this.d.l();
   }

   @Override
   public long C() {
      return this.e;
   }

   @Override
   public exu<dfi> P() {
      return this.i;
   }

   @Override
   public exu<eoi> O() {
      return this.j;
   }

   @Override
   public int z_() {
      return this.d.z_();
   }

   @Override
   public ayo E_() {
      return this.g;
   }

   @Override
   public int a(dyg.a $$0, int $$1, int $$2) {
      return this.a(kc.a($$1), kc.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cml $$0, ja $$1, avg $$2, avi $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cml $$0, int $$1, ja $$2, int $$3) {
   }

   @Override
   public void a(jj<dxh> $$0, ewh $$1, dxh.a $$2) {
   }

   @Override
   public dwg D_() {
      return this.h;
   }

   @Override
   public boolean a(ja $$0, Predicate<dsl> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ja $$0, Predicate<eoj> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bsh> List<T> a(dwv<bsh, T> $$0, ewc $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bsh> a(@Nullable bsh $$0, ewc $$1, @Nullable Predicate<? super bsh> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cml> x() {
      return Collections.emptyList();
   }

   @Override
   public int I_() {
      return this.d.I_();
   }

   @Override
   public int J_() {
      return this.d.J_();
   }

   @Override
   public long G_() {
      return this.n.getAndIncrement();
   }
}
