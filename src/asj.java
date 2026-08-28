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

public class asj implements dli {
   private static final Logger a = LogUtils.getLogger();
   private final bav<arr> b;
   private final edn c;
   private final asb d;
   private final long e;
   private final fad f;
   private final bai h;
   private final efn i;
   private final fhz<dno> j = new fhz<>($$0x -> this.z($$0x).q());
   private final fhz<exz> k = new fhz<>($$0x -> this.z($$0x).r());
   private final dlo l;
   private final eer m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final alr p = alr.b("worldgen_region_random");

   public asj(asb $$0, bav<arr> $$1, eer $$2, edn $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.E();
      this.f = $$0.C_();
      this.h = $$0.m().i().a(p).a(this.c.f().l());
      this.i = $$0.F_();
      this.l = new dlo(this, dlo.a(this.e));
   }

   public boolean a(djo $$0, int $$1) {
      return this.d.m().a.b($$0, $$1);
   }

   public djo b() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public edn a(int $$0, int $$1) {
      return this.a($$0, $$1, eeo.c);
   }

   @Nullable
   @Override
   public edn a(int $$0, int $$1, eeo $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      eeo $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      arr $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            edn $$7 = $$6.a($$5);
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
   public ebq a_(iw $$0) {
      return this.a(jz.a($$0.u()), jz.a($$0.w())).a_($$0);
   }

   @Override
   public eya b_(iw $$0) {
      return this.z($$0).b_($$0);
   }

   @Nullable
   @Override
   public csi a(double $$0, double $$1, double $$2, double $$3, Predicate<bxe> $$4) {
      return null;
   }

   @Override
   public int D_() {
      return 0;
   }

   @Override
   public dlo H_() {
      return this.l;
   }

   @Override
   public jg<dlm> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jc $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public exp B_() {
      return this.d.B_();
   }

   @Override
   public boolean a(iw $$0, boolean $$1, @Nullable bxe $$2, int $$3) {
      ebq $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            dyo $$5 = $$4.x() ? this.c_($$0) : null;
            dno.a($$4, (dkj)this.d, $$0, $$5, $$2, dak.l);
         }

         return this.a($$0, dnq.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dyo c_(iw $$0) {
      edn $$1 = this.z($$0);
      dyo $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ua $$3 = $$1.f($$0);
         ebq $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.b("id", ""))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dqi)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dyo.a($$0, $$4, $$3, this.d.J_());
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
   public boolean f_(iw $$0) {
      int $$1 = jz.a($$0.u());
      int $$2 = jz.a($$0.w());
      djo $$3 = this.b();
      int $$4 = Math.abs($$3.h - $$1);
      int $$5 = Math.abs($$3.i - $$2);
      if ($$4 <= this.m.d() && $$5 <= this.m.d()) {
         if (this.c.A()) {
            dkl $$6 = this.c.B();
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
   public boolean a(iw $$0, ebq $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         edn $$4 = this.z($$0);
         ebq $$5 = $$4.a($$0, $$1, $$2);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.n().d() == ees.b) {
               dyo $$6 = ((dqi)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               ua $$7 = new ua();
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

   private void f(iw $$0) {
      this.z($$0).e($$0);
   }

   @Override
   public boolean b(bxe $$0) {
      int $$1 = jz.a($$0.dz());
      int $$2 = jz.a($$0.dF());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(iw $$0, boolean $$1) {
      return this.a($$0, dnq.a.m(), 3);
   }

   @Override
   public edi E_() {
      return this.d.E_();
   }

   @Override
   public boolean A_() {
      return false;
   }

   @Deprecated
   @Override
   public asb a() {
      return this.d;
   }

   @Override
   public ju J_() {
      return this.d.J_();
   }

   @Override
   public cvs K() {
      return this.d.K();
   }

   @Override
   public fad C_() {
      return this.f;
   }

   @Override
   public bva d_(iw $$0) {
      if (!this.b(jz.a($$0.u()), jz.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bva(this.d.an(), this.d.af(), 0L, this.d.as());
      }
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return this.d.p();
   }

   @Override
   public edr S() {
      return this.d.m();
   }

   @Override
   public long E() {
      return this.e;
   }

   @Override
   public fhq<dno> U() {
      return this.j;
   }

   @Override
   public fhq<exz> T() {
      return this.k;
   }

   @Override
   public int P() {
      return this.d.P();
   }

   @Override
   public bai G_() {
      return this.h;
   }

   @Override
   public int a(ehp.a $$0, int $$1, int $$2) {
      return this.a(jz.a($$1), jz.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable bxe $$0, iw $$1, awx $$2, awz $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable bxe $$0, int $$1, iw $$2, int $$3) {
   }

   @Override
   public void a(jg<egq> $$0, fgc $$1, egq.a $$2) {
   }

   @Override
   public efn F_() {
      return this.i;
   }

   @Override
   public boolean a(iw $$0, Predicate<ebq> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(iw $$0, Predicate<eya> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bxe> List<T> a(egc<bxe, T> $$0, ffx $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bxe> a(@Nullable bxe $$0, ffx $$1, @Nullable Predicate<? super bxe> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<csi> z() {
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
