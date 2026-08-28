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

public class ary implements dgd {
   private static final Logger a = LogUtils.getLogger();
   private final bah<ari> b;
   private final dxj c;
   private final arq d;
   private final long e;
   private final etq f;
   private final azv h;
   private final dzj i;
   private final fbo<dij> j = new fbo<>($$0x -> this.y($$0x).o());
   private final fbo<ern> k = new fbo<>($$0x -> this.y($$0x).p());
   private final dgj l;
   private final dyn m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final all p = all.b("worldgen_region_random");

   public ary(arq $$0, bah<ari> $$1, dyn $$2, dxj $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.C();
      this.f = $$0.A_();
      this.h = $$0.l().i().a(p).a(this.c.f().l());
      this.i = $$0.D_();
      this.l = new dgj(this, dgj.a(this.e));
   }

   public boolean a(del $$0, int $$1) {
      return this.d.l().a.b($$0, $$1);
   }

   public del a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public dxj a(int $$0, int $$1) {
      return this.a($$0, $$1, dyk.c);
   }

   @Nullable
   @Override
   public dxj a(int $$0, int $$1, dyk $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      dyk $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      ari $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            dxj $$7 = $$6.a($$5);
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
   public dvo a_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).a_($$0);
   }

   @Override
   public ero b_(jh $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cor a(double $$0, double $$1, double $$2, double $$3, Predicate<bui> $$4) {
      return null;
   }

   @Override
   public int B_() {
      return 0;
   }

   @Override
   public dgj F_() {
      return this.l;
   }

   @Override
   public jq<dgh> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public erd z_() {
      return this.d.z_();
   }

   @Override
   public boolean a(jh $$0, boolean $$1, @Nullable bui $$2, int $$3) {
      dvo $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            dsr $$5 = $$4.x() ? this.c_($$0) : null;
            dij.a($$4, (dff)this.d, $$0, $$5, $$2, cwf.k);
         }

         return this.a($$0, dil.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dsr c_(jh $$0) {
      dxj $$1 = this.y($$0);
      dsr $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         un $$3 = $$1.f($$0);
         dvo $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dlb)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dsr.a($$0, $$4, $$3, this.d.H_());
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
   public boolean f_(jh $$0) {
      int $$1 = kj.a($$0.u());
      int $$2 = kj.a($$0.w());
      del $$3 = this.a();
      int $$4 = Math.abs($$3.g - $$1);
      int $$5 = Math.abs($$3.h - $$2);
      if ($$4 <= this.m.d() && $$5 <= this.m.d()) {
         if (this.c.x()) {
            dfh $$6 = this.c.y();
            if ($$6.e($$0.v())) {
               return false;
            }
         }

         return true;
      } else {
         ae.b(
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
   public boolean a(jh $$0, dvo $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dxj $$4 = this.y($$0);
         dvo $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.j().d() == dyo.b) {
               dsr $$6 = ((dlb)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               un $$7 = new un();
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

   private void f(jh $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(bui $$0) {
      int $$1 = kj.a($$0.dC());
      int $$2 = kj.a($$0.dI());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(jh $$0, boolean $$1) {
      return this.a($$0, dil.a.m(), 3);
   }

   @Override
   public dxe C_() {
      return this.d.C_();
   }

   @Override
   public boolean y_() {
      return false;
   }

   @Deprecated
   @Override
   public arq E() {
      return this.d;
   }

   @Override
   public ke H_() {
      return this.d.H_();
   }

   @Override
   public crj J() {
      return this.d.J();
   }

   @Override
   public etq A_() {
      return this.f;
   }

   @Override
   public bsf d_(jh $$0) {
      if (!this.b(kj.a($$0.u()), kj.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bsf(this.d.ak(), this.d.ab(), 0L, this.d.ap());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.d.o();
   }

   @Override
   public dxn P() {
      return this.d.l();
   }

   @Override
   public long C() {
      return this.e;
   }

   @Override
   public fbf<dij> R() {
      return this.j;
   }

   @Override
   public fbf<ern> Q() {
      return this.k;
   }

   @Override
   public int N() {
      return this.d.N();
   }

   @Override
   public azv E_() {
      return this.h;
   }

   @Override
   public int a(ebj.a $$0, int $$1, int $$2) {
      return this.a(kj.a($$1), kj.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cor $$0, jh $$1, awn $$2, awp $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cor $$0, int $$1, jh $$2, int $$3) {
   }

   @Override
   public void a(jq<eak> $$0, ezr $$1, eak.a $$2) {
   }

   @Override
   public dzj D_() {
      return this.i;
   }

   @Override
   public boolean a(jh $$0, Predicate<dvo> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jh $$0, Predicate<ero> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bui> List<T> a(dzy<bui, T> $$0, ezm $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bui> a(@Nullable bui $$0, ezm $$1, @Nullable Predicate<? super bui> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cor> x() {
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
