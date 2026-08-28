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

public class arl implements dhf {
   private static final Logger a = LogUtils.getLogger();
   private final azt<aqu> b;
   private final dyr c;
   private final ard d;
   private final long e;
   private final eva f;
   private final azh h;
   private final ear i;
   private final fcw<djl> j = new fcw<>($$0x -> this.y($$0x).q());
   private final fcw<esx> k = new fcw<>($$0x -> this.y($$0x).r());
   private final dhl l;
   private final dzv m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final akv p = akv.b("worldgen_region_random");

   public arl(ard $$0, azt<aqu> $$1, dzv $$2, dyr $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.E();
      this.f = $$0.D_();
      this.h = $$0.m().i().a(p).a(this.c.f().l());
      this.i = $$0.G_();
      this.l = new dhl(this, dhl.a(this.e));
   }

   public boolean a(dfn $$0, int $$1) {
      return this.d.m().a.b($$0, $$1);
   }

   public dfn b() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public dyr a(int $$0, int $$1) {
      return this.a($$0, $$1, dzs.c);
   }

   @Nullable
   @Override
   public dyr a(int $$0, int $$1, dzs $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      dzs $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      aqu $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            dyr $$7 = $$6.a($$5);
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
      $$10.a("Actual status", () -> $$6 == null ? "[out of cache bounds]" : $$6.q().f());
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
   public dww a_(ji $$0) {
      return this.a(kk.a($$0.u()), kk.a($$0.w())).a_($$0);
   }

   @Override
   public esy b_(ji $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cow a(double $$0, double $$1, double $$2, double $$3, Predicate<buk> $$4) {
      return null;
   }

   @Override
   public int E_() {
      return 0;
   }

   @Override
   public dhl I_() {
      return this.l;
   }

   @Override
   public jr<dhj> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jn $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public esn C_() {
      return this.d.C_();
   }

   @Override
   public boolean a(ji $$0, boolean $$1, @Nullable buk $$2, int $$3) {
      dww $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            dty $$5 = $$4.x() ? this.c_($$0) : null;
            djl.a($$4, (dgh)this.d, $$0, $$5, $$2, cwo.j);
         }

         return this.a($$0, djn.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dty c_(ji $$0) {
      dyr $$1 = this.y($$0);
      dty $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         tq $$3 = $$1.f($$0);
         dww $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dme)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dty.a($$0, $$4, $$3, this.d.K_());
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
   public boolean f_(ji $$0) {
      int $$1 = kk.a($$0.u());
      int $$2 = kk.a($$0.w());
      dfn $$3 = this.b();
      int $$4 = Math.abs($$3.h - $$1);
      int $$5 = Math.abs($$3.i - $$2);
      if ($$4 <= this.m.d() && $$5 <= this.m.d()) {
         if (this.c.A()) {
            dgj $$6 = this.c.B();
            if ($$6.e($$0.v())) {
               return false;
            }
         }

         return true;
      } else {
         af.b(
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
   public boolean a(ji $$0, dww $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dyr $$4 = this.y($$0);
         dww $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.n().d() == dzw.b) {
               dty $$6 = ((dme)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               tq $$7 = new tq();
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

   private void f(ji $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(buk $$0) {
      int $$1 = kk.a($$0.dz());
      int $$2 = kk.a($$0.dF());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(ji $$0, boolean $$1) {
      return this.a($$0, djn.a.m(), 3);
   }

   @Override
   public dym F_() {
      return this.d.F_();
   }

   @Override
   public boolean B_() {
      return false;
   }

   @Deprecated
   @Override
   public ard a() {
      return this.d;
   }

   @Override
   public kf K_() {
      return this.d.K_();
   }

   @Override
   public crs K() {
      return this.d.K();
   }

   @Override
   public eva D_() {
      return this.f;
   }

   @Override
   public bsh d_(ji $$0) {
      if (!this.b(kk.a($$0.u()), kk.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bsh(this.d.am(), this.d.ae(), 0L, this.d.ar());
      }
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return this.d.p();
   }

   @Override
   public dyv S() {
      return this.d.m();
   }

   @Override
   public long E() {
      return this.e;
   }

   @Override
   public fcn<djl> U() {
      return this.j;
   }

   @Override
   public fcn<esx> T() {
      return this.k;
   }

   @Override
   public int P() {
      return this.d.P();
   }

   @Override
   public azh H_() {
      return this.h;
   }

   @Override
   public int a(ecr.a $$0, int $$1, int $$2) {
      return this.a(kk.a($$1), kk.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cow $$0, ji $$1, avz $$2, awb $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cow $$0, int $$1, ji $$2, int $$3) {
   }

   @Override
   public void a(jr<ebs> $$0, faz $$1, ebs.a $$2) {
   }

   @Override
   public ear G_() {
      return this.i;
   }

   @Override
   public boolean a(ji $$0, Predicate<dww> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ji $$0, Predicate<esy> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends buk> List<T> a(ebg<buk, T> $$0, fau $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<buk> a(@Nullable buk $$0, fau $$1, @Nullable Predicate<? super buk> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cow> z() {
      return Collections.emptyList();
   }

   @Override
   public int L_() {
      return this.d.L_();
   }

   @Override
   public int M_() {
      return this.d.M_();
   }

   @Override
   public long J_() {
      return this.o.getAndIncrement();
   }
}
