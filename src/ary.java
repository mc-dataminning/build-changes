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

public class ary implements djz {
   private static final Logger a = LogUtils.getLogger();
   private final bai<arg> b;
   private final ece c;
   private final arq d;
   private final long e;
   private final eyr f;
   private final azv h;
   private final eee i;
   private final fgn<dmf> j = new fgn<>($$0x -> this.z($$0x).q());
   private final fgn<ewn> k = new fgn<>($$0x -> this.z($$0x).r());
   private final dkf l;
   private final edi m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final alg p = alg.b("worldgen_region_random");

   public ary(arq $$0, bai<arg> $$1, edi $$2, ece $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.E();
      this.f = $$0.y_();
      this.h = $$0.m().i().a(p).a(this.c.f().l());
      this.i = $$0.B_();
      this.l = new dkf(this, dkf.a(this.e));
   }

   public boolean a(dih $$0, int $$1) {
      return this.d.m().a.b($$0, $$1);
   }

   public dih b() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public ece a(int $$0, int $$1) {
      return this.a($$0, $$1, edf.c);
   }

   @Nullable
   @Override
   public ece a(int $$0, int $$1, edf $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      edf $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      arg $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            ece $$7 = $$6.a($$5);
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
   public eah a_(iu $$0) {
      return this.a(jx.a($$0.u()), jx.a($$0.w())).a_($$0);
   }

   @Override
   public ewo b_(iu $$0) {
      return this.z($$0).b_($$0);
   }

   @Nullable
   @Override
   public crc a(double $$0, double $$1, double $$2, double $$3, Predicate<bwf> $$4) {
      return null;
   }

   @Override
   public int z_() {
      return 0;
   }

   @Override
   public dkf D_() {
      return this.l;
   }

   @Override
   public je<dkd> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(ja $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public ewd x_() {
      return this.d.x_();
   }

   @Override
   public boolean a(iu $$0, boolean $$1, @Nullable bwf $$2, int $$3) {
      eah $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            dxf $$5 = $$4.x() ? this.c_($$0) : null;
            dmf.a($$4, (dja)this.d, $$0, $$5, $$2, czd.k);
         }

         return this.a($$0, dmh.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dxf c_(iu $$0) {
      ece $$1 = this.z($$0);
      dxf $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         tz $$3 = $$1.f($$0);
         eah $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((doz)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dxf.a($$0, $$4, $$3, this.d.F_());
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
      dih $$3 = this.b();
      int $$4 = Math.abs($$3.h - $$1);
      int $$5 = Math.abs($$3.i - $$2);
      if ($$4 <= this.m.d() && $$5 <= this.m.d()) {
         if (this.c.A()) {
            djc $$6 = this.c.B();
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
   public boolean a(iu $$0, eah $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         ece $$4 = this.z($$0);
         eah $$5 = $$4.a($$0, $$1, $$2);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.n().d() == edj.b) {
               dxf $$6 = ((doz)$$1.b()).a($$0, $$1);
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
   public boolean b(bwf $$0) {
      int $$1 = jx.a($$0.dz());
      int $$2 = jx.a($$0.dF());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(iu $$0, boolean $$1) {
      return this.a($$0, dmh.a.m(), 3);
   }

   @Override
   public ebz A_() {
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
   public cum K() {
      return this.d.K();
   }

   @Override
   public eyr y_() {
      return this.f;
   }

   @Override
   public bub d_(iu $$0) {
      if (!this.b(jx.a($$0.u()), jx.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bub(this.d.an(), this.d.af(), 0L, this.d.as());
      }
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return this.d.p();
   }

   @Override
   public eci S() {
      return this.d.m();
   }

   @Override
   public long E() {
      return this.e;
   }

   @Override
   public fge<dmf> U() {
      return this.j;
   }

   @Override
   public fge<ewn> T() {
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
   public int a(egg.a $$0, int $$1, int $$2) {
      return this.a(jx.a($$1), jx.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable bwf $$0, iu $$1, awm $$2, awo $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable bwf $$0, int $$1, iu $$2, int $$3) {
   }

   @Override
   public void a(je<efh> $$0, feq $$1, efh.a $$2) {
   }

   @Override
   public eee B_() {
      return this.i;
   }

   @Override
   public boolean a(iu $$0, Predicate<eah> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(iu $$0, Predicate<ewo> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bwf> List<T> a(eet<bwf, T> $$0, fel $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bwf> a(@Nullable bwf $$0, fel $$1, @Nullable Predicate<? super bwf> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<crc> z() {
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
