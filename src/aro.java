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

public class aro implements dfd {
   private static final Logger a = LogUtils.getLogger();
   private final azx<aqz> b;
   private final dwk c;
   private final arh d;
   private final long e;
   private final esr f;
   private final azl g;
   private final dyk h;
   private final fap<dhj> i = new fap<>($$0x -> this.y($$0x).o());
   private final fap<eqo> j = new fap<>($$0x -> this.y($$0x).p());
   private final dfj k;
   private final dxo l;
   @Nullable
   private Supplier<String> m;
   private final AtomicLong n = new AtomicLong();
   private static final alc o = alc.b("worldgen_region_random");

   public aro(arh $$0, azx<aqz> $$1, dxo $$2, dwk $$3) {
      this.l = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.C();
      this.f = $$0.y_();
      this.g = $$0.l().i().a(o).a(this.c.f().l());
      this.h = $$0.B_();
      this.k = new dfj(this, dfj.a(this.e));
   }

   public boolean a(ddm $$0, int $$1) {
      return this.d.l().a.b($$0, $$1);
   }

   public ddm a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.m = $$0;
   }

   @Override
   public dwk a(int $$0, int $$1) {
      return this.a($$0, $$1, dxl.c);
   }

   @Nullable
   @Override
   public dwk a(int $$0, int $$1, dxl $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      dxl $$5 = $$4 >= this.l.b().b() ? null : this.l.b().a($$4);
      aqz $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            dwk $$7 = $$6.a($$5);
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
      throw new z($$9);
   }

   @Override
   public boolean b(int $$0, int $$1) {
      int $$2 = this.c.f().e($$0, $$1);
      return $$2 < this.l.b().b();
   }

   @Override
   public duo a_(je $$0) {
      return this.a(kg.a($$0.u()), kg.a($$0.w())).a_($$0);
   }

   @Override
   public eqp b_(je $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cnu a(double $$0, double $$1, double $$2, double $$3, Predicate<bto> $$4) {
      return null;
   }

   @Override
   public int z_() {
      return 0;
   }

   @Override
   public dfj D_() {
      return this.k;
   }

   @Override
   public jn<dfh> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jj $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eqe x_() {
      return this.d.x_();
   }

   @Override
   public boolean a(je $$0, boolean $$1, @Nullable bto $$2, int $$3) {
      duo $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            drs $$5 = $$4.x() ? this.c_($$0) : null;
            dhj.a($$4, (deg)this.d, $$0, $$5, $$2, cvp.k);
         }

         return this.a($$0, dhl.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public drs c_(je $$0) {
      dwk $$1 = this.y($$0);
      drs $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         uf $$3 = $$1.f($$0);
         duo $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dkb)$$4.b()).a($$0, $$4);
            } else {
               $$2 = drs.a($$0, $$4, $$3, this.d.F_());
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
   public boolean f_(je $$0) {
      int $$1 = kg.a($$0.u());
      int $$2 = kg.a($$0.w());
      ddm $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.l.d() && $$5 <= this.l.d()) {
         if (this.c.x()) {
            dei $$6 = this.c.y();
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
               + this.l.a()
               + (this.m == null ? "" : ", currently generating: " + this.m.get())
         );
         return false;
      }
   }

   @Override
   public boolean a(je $$0, duo $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dwk $$4 = this.y($$0);
         duo $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.j().d() == dxp.b) {
               drs $$6 = ((dkb)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               uf $$7 = new uf();
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

   private void f(je $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(bto $$0) {
      int $$1 = kg.a($$0.dw());
      int $$2 = kg.a($$0.dC());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(je $$0, boolean $$1) {
      return this.a($$0, dhl.a.o(), 3);
   }

   @Override
   public dwf A_() {
      return this.d.A_();
   }

   @Override
   public boolean w_() {
      return false;
   }

   @Deprecated
   @Override
   public arh E() {
      return this.d;
   }

   @Override
   public kb F_() {
      return this.d.F_();
   }

   @Override
   public cqn J() {
      return this.d.J();
   }

   @Override
   public esr y_() {
      return this.f;
   }

   @Override
   public brn d_(je $$0) {
      if (!this.b(kg.a($$0.u()), kg.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new brn(this.d.am(), this.d.ab(), 0L, this.d.ar());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.d.o();
   }

   @Override
   public dwo P() {
      return this.d.l();
   }

   @Override
   public long C() {
      return this.e;
   }

   @Override
   public fag<dhj> R() {
      return this.i;
   }

   @Override
   public fag<eqo> Q() {
      return this.j;
   }

   @Override
   public int N() {
      return this.d.N();
   }

   @Override
   public azl C_() {
      return this.g;
   }

   @Override
   public int a(eak.a $$0, int $$1, int $$2) {
      return this.a(kg.a($$1), kg.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cnu $$0, je $$1, awd $$2, awf $$3, float $$4, float $$5) {
   }

   @Override
   public void a(ll $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cnu $$0, int $$1, je $$2, int $$3) {
   }

   @Override
   public void a(jn<dzl> $$0, eys $$1, dzl.a $$2) {
   }

   @Override
   public dyk B_() {
      return this.h;
   }

   @Override
   public boolean a(je $$0, Predicate<duo> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(je $$0, Predicate<eqp> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bto> List<T> a(dyz<bto, T> $$0, eyn $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bto> a(@Nullable bto $$0, eyn $$1, @Nullable Predicate<? super bto> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cnu> x() {
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
      return this.n.getAndIncrement();
   }
}
