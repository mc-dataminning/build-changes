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

public class aqt implements dbs {
   private static final Logger a = LogUtils.getLogger();
   private final List<dsx> b;
   private final dsx c;
   private final int d;
   private final aqm e;
   private final long f;
   private final eor g;
   private final ayk h;
   private final dut i;
   private final ewg<ddy> j = new ewg<>($$0x -> this.y($$0x).o());
   private final ewg<emt> k = new ewg<>($$0x -> this.y($$0x).p());
   private final dby l;
   private final dae m;
   private final dae n;
   private final dtw o;
   private final int p;
   @Nullable
   private Supplier<String> q;
   private final AtomicLong r = new AtomicLong();
   private static final akm s = new akm("worldgen_region_random");

   public aqt(aqm $$0, List<dsx> $$1, dtw $$2, int $$3) {
      this.o = $$2;
      this.p = $$3;
      int $$4 = ayd.a(Math.sqrt((double)$$1.size()));
      if ($$4 * $$4 != $$1.size()) {
         throw (IllegalStateException)ac.b(new IllegalStateException("Cache size is not a square."));
      } else {
         this.b = $$1;
         this.c = $$1.get($$1.size() / 2);
         this.d = $$4;
         this.e = $$0;
         this.f = $$0.C();
         this.g = $$0.A_();
         this.h = $$0.l().i().a(s).a(this.c.f().l());
         this.i = $$0.D_();
         this.l = new dby(this, dby.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
      }
   }

   public boolean a(dae $$0, int $$1) {
      return this.e.l().a.b($$0, $$1);
   }

   public dae a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.q = $$0;
   }

   @Override
   public dsx a(int $$0, int $$1) {
      return this.a($$0, $$1, dtw.c);
   }

   @Nullable
   @Override
   public dsx a(int $$0, int $$1, dtw $$2, boolean $$3) {
      dsx $$6;
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

      o $$8 = o.a(new IllegalStateException("Requested chunk unavailable during world generation"), "Exception generating new chunk");
      p $$9 = $$8.a("Chunk request details");
      $$9.a("Requested chunk", String.format(Locale.ROOT, "%d, %d", $$0, $$1));
      $$9.a("Requested status", () -> le.n.b($$2).toString());
      $$9.a("Actual status", () -> $$6 == null ? "[out of region bounds]" : le.n.b($$6.j()).toString());
      $$9.a("loadOrGenerate", $$3);
      $$9.a("Generating chunk", () -> this.c.f().toString());
      $$9.a("Region start", this.m);
      $$9.a("Region end", this.n);
      throw new y($$8);
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return $$0 >= this.m.e && $$0 <= this.n.e && $$1 >= this.m.f && $$1 <= this.n.f;
   }

   @Override
   public drb a_(io $$0) {
      return this.a(jq.a($$0.u()), jq.a($$0.w())).a_($$0);
   }

   @Override
   public emu b_(io $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public clw a(double $$0, double $$1, double $$2, double $$3, Predicate<bru> $$4) {
      return null;
   }

   @Override
   public int B_() {
      return 0;
   }

   @Override
   public dby F_() {
      return this.l;
   }

   @Override
   public ix<dbw> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(it $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public emj y_() {
      return this.e.y_();
   }

   @Override
   public boolean a(io $$0, boolean $$1, @Nullable bru $$2, int $$3) {
      drb $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dog $$5 = $$4.t() ? this.c_($$0) : null;
            ddy.a($$4, (dax)this.e, $$0, $$5, $$2, cto.i);
         }

         return this.a($$0, dea.a.n(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dog c_(io $$0) {
      dsx $$1 = this.y($$0);
      dog $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ud $$3 = $$1.f($$0);
         drb $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((dgq)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dog.a($$0, $$4, $$3, this.e.H_());
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
   public boolean f_(io $$0) {
      int $$1 = jq.a($$0.u());
      int $$2 = jq.a($$0.w());
      dae $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.p && $$5 <= this.p) {
         if (this.c.y()) {
            daz $$6 = this.c.z();
            if ($$0.v() < $$6.I_() || $$0.v() >= $$6.al()) {
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
               + this.o
               + (this.q == null ? "" : ", currently generating: " + this.q.get())
         );
         return false;
      }
   }

   @Override
   public boolean a(io $$0, drb $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dsx $$4 = this.y($$0);
         drb $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dty.b) {
               dog $$6 = ((dgq)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               ud $$7 = new ud();
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

   private void f(io $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(bru $$0) {
      int $$1 = jq.a($$0.dt());
      int $$2 = jq.a($$0.dz());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(io $$0, boolean $$1) {
      return this.a($$0, dea.a.n(), 3);
   }

   @Override
   public dss C_() {
      return this.e.C_();
   }

   @Override
   public boolean x_() {
      return false;
   }

   @Deprecated
   @Override
   public aqm E() {
      return this.e;
   }

   @Override
   public jl H_() {
      return this.e.H_();
   }

   @Override
   public coj J() {
      return this.e.J();
   }

   @Override
   public eor A_() {
      return this.g;
   }

   @Override
   public bps d_(io $$0) {
      if (!this.b(jq.a($$0.u()), jq.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bps(this.e.ak(), this.e.Z(), 0L, this.e.ap());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.e.o();
   }

   @Override
   public dtb M() {
      return this.e.l();
   }

   @Override
   public long C() {
      return this.f;
   }

   @Override
   public evx<ddy> O() {
      return this.j;
   }

   @Override
   public evx<emt> N() {
      return this.k;
   }

   @Override
   public int z_() {
      return this.e.z_();
   }

   @Override
   public ayk E_() {
      return this.h;
   }

   @Override
   public int a(dwt.a $$0, int $$1, int $$2) {
      return this.a(jq.a($$1), jq.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable clw $$0, io $$1, avg $$2, avi $$3, float $$4, float $$5) {
   }

   @Override
   public void a(kw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable clw $$0, int $$1, io $$2, int $$3) {
   }

   @Override
   public void a(ix<dvu> $$0, euk $$1, dvu.a $$2) {
   }

   @Override
   public dut D_() {
      return this.i;
   }

   @Override
   public boolean a(io $$0, Predicate<drb> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(io $$0, Predicate<emu> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bru> List<T> a(dvi<bru, T> $$0, euf $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bru> a(@Nullable bru $$0, euf $$1, @Nullable Predicate<? super bru> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<clw> x() {
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
      return this.r.getAndIncrement();
   }
}
