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

public class ary implements dju {
   private static final Logger a = LogUtils.getLogger();
   private final bai<arg> b;
   private final ebw c;
   private final arq d;
   private final long e;
   private final eyj f;
   private final azv h;
   private final edw i;
   private final fgf<dma> j = new fgf<>($$0x -> this.z($$0x).q());
   private final fgf<ewf> k = new fgf<>($$0x -> this.z($$0x).r());
   private final dka l;
   private final eda m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final alg p = alg.b("worldgen_region_random");

   public ary(arq $$0, bai<arg> $$1, eda $$2, ebw $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.E();
      this.f = $$0.y_();
      this.h = $$0.m().i().a(p).a(this.c.f().l());
      this.i = $$0.B_();
      this.l = new dka(this, dka.a(this.e));
   }

   public boolean a(dic $$0, int $$1) {
      return this.d.m().a.b($$0, $$1);
   }

   public dic b() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public ebw a(int $$0, int $$1) {
      return this.a($$0, $$1, ecx.c);
   }

   @Nullable
   @Override
   public ebw a(int $$0, int $$1, ecx $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      ecx $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      arg $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            ebw $$7 = $$6.a($$5);
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
   public dzz a_(iu $$0) {
      return this.a(jx.a($$0.u()), jx.a($$0.w())).a_($$0);
   }

   @Override
   public ewg b_(iu $$0) {
      return this.z($$0).b_($$0);
   }

   @Nullable
   @Override
   public cqy a(double $$0, double $$1, double $$2, double $$3, Predicate<bwd> $$4) {
      return null;
   }

   @Override
   public int z_() {
      return 0;
   }

   @Override
   public dka D_() {
      return this.l;
   }

   @Override
   public je<djy> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(ja $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public evv x_() {
      return this.d.x_();
   }

   @Override
   public boolean a(iu $$0, boolean $$1, @Nullable bwd $$2, int $$3) {
      dzz $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            dwx $$5 = $$4.x() ? this.c_($$0) : null;
            dma.a($$4, (div)this.d, $$0, $$5, $$2, cyy.k);
         }

         return this.a($$0, dmc.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dwx c_(iu $$0) {
      ebw $$1 = this.z($$0);
      dwx $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         tz $$3 = $$1.f($$0);
         dzz $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dot)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dwx.a($$0, $$4, $$3, this.d.F_());
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
   public boolean f_(iu $$0) {
      int $$1 = jx.a($$0.u());
      int $$2 = jx.a($$0.w());
      dic $$3 = this.b();
      int $$4 = Math.abs($$3.h - $$1);
      int $$5 = Math.abs($$3.i - $$2);
      if ($$4 <= this.m.d() && $$5 <= this.m.d()) {
         if (this.c.A()) {
            dix $$6 = this.c.B();
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
   public boolean a(iu $$0, dzz $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         ebw $$4 = this.z($$0);
         dzz $$5 = $$4.a($$0, $$1, $$2);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.n().d() == edb.b) {
               dwx $$6 = ((dot)$$1.b()).a($$0, $$1);
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

   private void f(iu $$0) {
      this.z($$0).e($$0);
   }

   @Override
   public boolean b(bwd $$0) {
      int $$1 = jx.a($$0.dz());
      int $$2 = jx.a($$0.dF());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(iu $$0, boolean $$1) {
      return this.a($$0, dmc.a.m(), 3);
   }

   @Override
   public ebr A_() {
      return this.d.A_();
   }

   @Override
   public boolean w_() {
      return false;
   }

   @Deprecated
   @Override
   public arq a() {
      return this.d;
   }

   @Override
   public js F_() {
      return this.d.F_();
   }

   @Override
   public cuh K() {
      return this.d.K();
   }

   @Override
   public eyj y_() {
      return this.f;
   }

   @Override
   public btz d_(iu $$0) {
      if (!this.b(jx.a($$0.u()), jx.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new btz(this.d.an(), this.d.af(), 0L, this.d.as());
      }
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return this.d.p();
   }

   @Override
   public eca S() {
      return this.d.m();
   }

   @Override
   public long E() {
      return this.e;
   }

   @Override
   public ffw<dma> U() {
      return this.j;
   }

   @Override
   public ffw<ewf> T() {
      return this.k;
   }

   @Override
   public int P() {
      return this.d.P();
   }

   @Override
   public azv C_() {
      return this.h;
   }

   @Override
   public int a(efy.a $$0, int $$1, int $$2) {
      return this.a(jx.a($$1), jx.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable bwd $$0, iu $$1, awm $$2, awo $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable bwd $$0, int $$1, iu $$2, int $$3) {
   }

   @Override
   public void a(je<eez> $$0, fei $$1, eez.a $$2) {
   }

   @Override
   public edw B_() {
      return this.i;
   }

   @Override
   public boolean a(iu $$0, Predicate<dzz> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(iu $$0, Predicate<ewg> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bwd> List<T> a(eel<bwd, T> $$0, fed $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bwd> a(@Nullable bwd $$0, fed $$1, @Nullable Predicate<? super bwd> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cqy> z() {
      return Collections.emptyList();
   }

   @Override
   public int G_() {
      return this.d.G_();
   }

   @Override
   public int H_() {
      return this.d.H_();
   }

   @Override
   public long E_() {
      return this.o.getAndIncrement();
   }
}
