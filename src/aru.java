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

public class aru implements dfs {
   private static final Logger a = LogUtils.getLogger();
   private final bad<are> b;
   private final dwz c;
   private final arm d;
   private final long e;
   private final etg f;
   private final azr h;
   private final dyz i;
   private final fbe<dhy> j = new fbe<>($$0x -> this.y($$0x).o());
   private final fbe<erd> k = new fbe<>($$0x -> this.y($$0x).p());
   private final dfy l;
   private final dyd m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final alh p = alh.b("worldgen_region_random");

   public aru(arm $$0, bad<are> $$1, dyd $$2, dwz $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.C();
      this.f = $$0.A_();
      this.h = $$0.l().i().a(p).a(this.c.f().l());
      this.i = $$0.D_();
      this.l = new dfy(this, dfy.a(this.e));
   }

   public boolean a(deb $$0, int $$1) {
      return this.d.l().a.b($$0, $$1);
   }

   public deb a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public dwz a(int $$0, int $$1) {
      return this.a($$0, $$1, dya.c);
   }

   @Nullable
   @Override
   public dwz a(int $$0, int $$1, dya $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      dya $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      are $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            dwz $$7 = $$6.a($$5);
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
      $$10.a("Generating status", () -> this.m.a().f());
      $$10.a("Requested status", $$2::f);
      $$10.a("Actual status", () -> $$6 == null ? "[out of cache bounds]" : $$6.p().f());
      $$10.a("Maximum allowed status", () -> $$5 == null ? "null" : $$5.f());
      $$10.a("Dependencies", this.m.b()::toString);
      $$10.a("Requested distance", $$4);
      $$10.a("Generating chunk", this.c.f()::toString);
      throw new z($$9);
   }

   @Override
   public boolean b(int $$0, int $$1) {
      int $$2 = this.c.f().e($$0, $$1);
      return $$2 < this.m.b().b();
   }

   @Override
   public dvd a_(jg $$0) {
      return this.a(ki.a($$0.u()), ki.a($$0.w())).a_($$0);
   }

   @Override
   public ere b_(jg $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public coh a(double $$0, double $$1, double $$2, double $$3, Predicate<btz> $$4) {
      return null;
   }

   @Override
   public int B_() {
      return 0;
   }

   @Override
   public dfy F_() {
      return this.l;
   }

   @Override
   public jp<dfw> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jl $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eqt z_() {
      return this.d.z_();
   }

   @Override
   public boolean a(jg $$0, boolean $$1, @Nullable btz $$2, int $$3) {
      dvd $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            dsg $$5 = $$4.x() ? this.c_($$0) : null;
            dhy.a($$4, (dev)this.d, $$0, $$5, $$2, cvx.k);
         }

         return this.a($$0, dia.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dsg c_(jg $$0) {
      dwz $$1 = this.y($$0);
      dsg $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         uj $$3 = $$1.f($$0);
         dvd $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dkq)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dsg.a($$0, $$4, $$3, this.d.H_());
            }

            if ($$2 != null) {
               $$1.a($$2);
               return $$2;
            }
         }

         if ($$4.x()) {
            a.warn("Tried to access a block entity before it was created. {}", $$0);
         }

         return null;
      }
   }

   @Override
   public boolean f_(jg $$0) {
      int $$1 = ki.a($$0.u());
      int $$2 = ki.a($$0.w());
      deb $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.m.d() && $$5 <= this.m.d()) {
         if (this.c.x()) {
            dex $$6 = this.c.y();
            if ($$6.e($$0.v())) {
               return false;
            }
         }

         return true;
      } else {
         ad.b(
            "Detected setBlock in a far chunk ["
               + $$1
               + ", "
               + $$2
               + "], pos: "
               + $$0
               + ", status: "
               + this.m.a()
               + (this.n == null ? "" : ", currently generating: " + this.n.get())
         );
         return false;
      }
   }

   @Override
   public boolean a(jg $$0, dvd $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dwz $$4 = this.y($$0);
         dvd $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.j().d() == dye.b) {
               dsg $$6 = ((dkq)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               uj $$7 = new uj();
               $$7.a("x", $$0.u());
               $$7.a("y", $$0.v());
               $$7.a("z", $$0.w());
               $$7.a("id", "DUMMY");
               $$4.a($$7);
            }
         } else if ($$5 != null && $$5.x()) {
            $$4.d($$0);
         }

         if ($$1.l(this, $$0)) {
            this.f($$0);
         }

         return true;
      }
   }

   private void f(jg $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(btz $$0) {
      int $$1 = ki.a($$0.dB());
      int $$2 = ki.a($$0.dH());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(jg $$0, boolean $$1) {
      return this.a($$0, dia.a.m(), 3);
   }

   @Override
   public dwu C_() {
      return this.d.C_();
   }

   @Override
   public boolean y_() {
      return false;
   }

   @Deprecated
   @Override
   public arm E() {
      return this.d;
   }

   @Override
   public kd H_() {
      return this.d.H_();
   }

   @Override
   public cra J() {
      return this.d.J();
   }

   @Override
   public etg A_() {
      return this.f;
   }

   @Override
   public brw d_(jg $$0) {
      if (!this.b(ki.a($$0.u()), ki.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new brw(this.d.am(), this.d.ab(), 0L, this.d.ar());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.d.o();
   }

   @Override
   public dxd P() {
      return this.d.l();
   }

   @Override
   public long C() {
      return this.e;
   }

   @Override
   public fav<dhy> R() {
      return this.j;
   }

   @Override
   public fav<erd> Q() {
      return this.k;
   }

   @Override
   public int N() {
      return this.d.N();
   }

   @Override
   public azr E_() {
      return this.h;
   }

   @Override
   public int a(eaz.a $$0, int $$1, int $$2) {
      return this.a(ki.a($$1), ki.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable coh $$0, jg $$1, awj $$2, awl $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable coh $$0, int $$1, jg $$2, int $$3) {
   }

   @Override
   public void a(jp<eaa> $$0, ezh $$1, eaa.a $$2) {
   }

   @Override
   public dyz D_() {
      return this.i;
   }

   @Override
   public boolean a(jg $$0, Predicate<dvd> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jg $$0, Predicate<ere> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends btz> List<T> a(dzo<btz, T> $$0, ezc $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<btz> a(@Nullable btz $$0, ezc $$1, @Nullable Predicate<? super btz> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<coh> x() {
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
      return this.o.getAndIncrement();
   }
}
