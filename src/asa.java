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

public class asa implements dkw {
   private static final Logger a = LogUtils.getLogger();
   private final bak<ari> b;
   private final edb c;
   private final ars d;
   private final long e;
   private final ezr f;
   private final azx h;
   private final efb i;
   private final fhn<dnc> j = new fhn<>($$0x -> this.z($$0x).q());
   private final fhn<exn> k = new fhn<>($$0x -> this.z($$0x).r());
   private final dlc l;
   private final eef m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final ali p = ali.b("worldgen_region_random");

   public asa(ars $$0, bak<ari> $$1, eef $$2, edb $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.E();
      this.f = $$0.C_();
      this.h = $$0.m().i().a(p).a(this.c.f().l());
      this.i = $$0.F_();
      this.l = new dlc(this, dlc.a(this.e));
   }

   public boolean a(djc $$0, int $$1) {
      return this.d.m().a.b($$0, $$1);
   }

   public djc b() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public edb a(int $$0, int $$1) {
      return this.a($$0, $$1, eec.c);
   }

   @Nullable
   @Override
   public edb a(int $$0, int $$1, eec $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      eec $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      ari $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            edb $$7 = $$6.a($$5);
            if ($$7 != null) {
               return $$7;
            }
         }
      } else {
         $$6 = null;
      }

      p $$9 = p.a(new IllegalStateException("Requested chunk unavailable during world generation"), "Exception generating new chunk");
      q $$10 = $$9.a("Chunk request details");
      $$10.a("Requested chunk", String.format(Locale.ROOT, "%d, %d", $$0, $$1));
      $$10.a("Generating status", () -> this.m.a().f());
      $$10.a("Requested status", $$2::f);
      $$10.a("Actual status", () -> $$6 == null ? "[out of cache bounds]" : $$6.q().f());
      $$10.a("Maximum allowed status", () -> $$5 == null ? "null" : $$5.f());
      $$10.a("Dependencies", this.m.b()::toString);
      $$10.a("Requested distance", $$4);
      $$10.a("Generating chunk", this.c.f()::toString);
      throw new aa($$9);
   }

   @Override
   public boolean b(int $$0, int $$1) {
      int $$2 = this.c.f().e($$0, $$1);
      return $$2 < this.m.b().b();
   }

   @Override
   public ebe a_(iv $$0) {
      return this.a(jy.a($$0.u()), jy.a($$0.w())).a_($$0);
   }

   @Override
   public exo b_(iv $$0) {
      return this.z($$0).b_($$0);
   }

   @Nullable
   @Override
   public crx a(double $$0, double $$1, double $$2, double $$3, Predicate<bwt> $$4) {
      return null;
   }

   @Override
   public int D_() {
      return 0;
   }

   @Override
   public dlc H_() {
      return this.l;
   }

   @Override
   public jf<dla> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jb $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public exd B_() {
      return this.d.B_();
   }

   @Override
   public boolean a(iv $$0, boolean $$1, @Nullable bwt $$2, int $$3) {
      ebe $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            dyc $$5 = $$4.x() ? this.c_($$0) : null;
            dnc.a($$4, (djx)this.d, $$0, $$5, $$2, czy.k);
         }

         return this.a($$0, dne.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dyc c_(iv $$0) {
      edb $$1 = this.z($$0);
      dyc $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         tz $$3 = $$1.f($$0);
         ebe $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.b("id", ""))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dpw)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dyc.a($$0, $$4, $$3, this.d.J_());
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
   public boolean f_(iv $$0) {
      int $$1 = jy.a($$0.u());
      int $$2 = jy.a($$0.w());
      djc $$3 = this.b();
      int $$4 = Math.abs($$3.h - $$1);
      int $$5 = Math.abs($$3.i - $$2);
      if ($$4 <= this.m.d() && $$5 <= this.m.d()) {
         if (this.c.A()) {
            djz $$6 = this.c.B();
            if ($$6.e($$0.v())) {
               return false;
            }
         }

         return true;
      } else {
         ag.b(
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
   public boolean a(iv $$0, ebe $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         edb $$4 = this.z($$0);
         ebe $$5 = $$4.a($$0, $$1, $$2);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.n().d() == eeg.b) {
               dyc $$6 = ((dpw)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               tz $$7 = new tz();
               $$7.a("x", $$0.u());
               $$7.a("y", $$0.v());
               $$7.a("z", $$0.w());
               $$7.a("id", "DUMMY");
               $$4.a($$7);
            }
         } else if ($$5 != null && $$5.x()) {
            $$4.d($$0);
         }

         if ($$1.l(this, $$0) && ($$2 & 16) == 0) {
            this.f($$0);
         }

         return true;
      }
   }

   private void f(iv $$0) {
      this.z($$0).e($$0);
   }

   @Override
   public boolean b(bwt $$0) {
      int $$1 = jy.a($$0.dz());
      int $$2 = jy.a($$0.dF());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(iv $$0, boolean $$1) {
      return this.a($$0, dne.a.m(), 3);
   }

   @Override
   public ecw E_() {
      return this.d.E_();
   }

   @Override
   public boolean A_() {
      return false;
   }

   @Deprecated
   @Override
   public ars a() {
      return this.d;
   }

   @Override
   public jt J_() {
      return this.d.J_();
   }

   @Override
   public cvh K() {
      return this.d.K();
   }

   @Override
   public ezr C_() {
      return this.f;
   }

   @Override
   public bup d_(iv $$0) {
      if (!this.b(jy.a($$0.u()), jy.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bup(this.d.an(), this.d.af(), 0L, this.d.as());
      }
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return this.d.p();
   }

   @Override
   public edf S() {
      return this.d.m();
   }

   @Override
   public long E() {
      return this.e;
   }

   @Override
   public fhe<dnc> U() {
      return this.j;
   }

   @Override
   public fhe<exn> T() {
      return this.k;
   }

   @Override
   public int P() {
      return this.d.P();
   }

   @Override
   public azx G_() {
      return this.h;
   }

   @Override
   public int a(ehd.a $$0, int $$1, int $$2) {
      return this.a(jy.a($$1), jy.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable bwt $$0, iv $$1, awo $$2, awq $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable bwt $$0, int $$1, iv $$2, int $$3) {
   }

   @Override
   public void a(jf<ege> $$0, ffq $$1, ege.a $$2) {
   }

   @Override
   public efb F_() {
      return this.i;
   }

   @Override
   public boolean a(iv $$0, Predicate<ebe> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(iv $$0, Predicate<exo> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bwt> List<T> a(efq<bwt, T> $$0, ffl $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bwt> a(@Nullable bwt $$0, ffl $$1, @Nullable Predicate<? super bwt> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<crx> z() {
      return Collections.emptyList();
   }

   @Override
   public int K_() {
      return this.d.K_();
   }

   @Override
   public int L_() {
      return this.d.L_();
   }

   @Override
   public long I_() {
      return this.o.getAndIncrement();
   }
}
