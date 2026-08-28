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

public class arv implements dio {
   private static final Logger a = LogUtils.getLogger();
   private final bae<ard> b;
   private final eaj c;
   private final arn d;
   private final long e;
   private final ewv f;
   private final azs h;
   private final ecj i;
   private final fer<dku> j = new fer<>($$0x -> this.y($$0x).q());
   private final fer<eus> k = new fer<>($$0x -> this.y($$0x).r());
   private final diu l;
   private final ebn m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final ald p = ald.b("worldgen_region_random");

   public arv(arn $$0, bae<ard> $$1, ebn $$2, eaj $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.E();
      this.f = $$0.y_();
      this.h = $$0.m().i().a(p).a(this.c.f().l());
      this.i = $$0.B_();
      this.l = new diu(this, diu.a(this.e));
   }

   public boolean a(dgw $$0, int $$1) {
      return this.d.m().a.b($$0, $$1);
   }

   public dgw b() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public eaj a(int $$0, int $$1) {
      return this.a($$0, $$1, ebk.c);
   }

   @Nullable
   @Override
   public eaj a(int $$0, int $$1, ebk $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      ebk $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      ard $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            eaj $$7 = $$6.a($$5);
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
   public dym a_(jj $$0) {
      return this.a(kl.a($$0.u()), kl.a($$0.w())).a_($$0);
   }

   @Override
   public eut b_(jj $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cqi a(double $$0, double $$1, double $$2, double $$3, Predicate<bvs> $$4) {
      return null;
   }

   @Override
   public int z_() {
      return 0;
   }

   @Override
   public diu D_() {
      return this.l;
   }

   @Override
   public js<dis> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jo $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eui x_() {
      return this.d.x_();
   }

   @Override
   public boolean a(jj $$0, boolean $$1, @Nullable bvs $$2, int $$3) {
      dym $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            dvl $$5 = $$4.x() ? this.c_($$0) : null;
            dku.a($$4, (dhp)this.d, $$0, $$5, $$2, cxy.k);
         }

         return this.a($$0, dkw.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dvl c_(jj $$0) {
      eaj $$1 = this.y($$0);
      dvl $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         tw $$3 = $$1.f($$0);
         dym $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dnn)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dvl.a($$0, $$4, $$3, this.d.F_());
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
   public boolean f_(jj $$0) {
      int $$1 = kl.a($$0.u());
      int $$2 = kl.a($$0.w());
      dgw $$3 = this.b();
      int $$4 = Math.abs($$3.h - $$1);
      int $$5 = Math.abs($$3.i - $$2);
      if ($$4 <= this.m.d() && $$5 <= this.m.d()) {
         if (this.c.A()) {
            dhr $$6 = this.c.B();
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
   public boolean a(jj $$0, dym $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         eaj $$4 = this.y($$0);
         dym $$5 = $$4.a($$0, $$1, $$2);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.n().d() == ebo.b) {
               dvl $$6 = ((dnn)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               tw $$7 = new tw();
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

   private void f(jj $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(bvs $$0) {
      int $$1 = kl.a($$0.dz());
      int $$2 = kl.a($$0.dF());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(jj $$0, boolean $$1) {
      return this.a($$0, dkw.a.m(), 3);
   }

   @Override
   public eae A_() {
      return this.d.A_();
   }

   @Override
   public boolean w_() {
      return false;
   }

   @Deprecated
   @Override
   public arn a() {
      return this.d;
   }

   @Override
   public kg F_() {
      return this.d.F_();
   }

   @Override
   public cte K() {
      return this.d.K();
   }

   @Override
   public ewv y_() {
      return this.f;
   }

   @Override
   public bto d_(jj $$0) {
      if (!this.b(kl.a($$0.u()), kl.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bto(this.d.an(), this.d.af(), 0L, this.d.as());
      }
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return this.d.p();
   }

   @Override
   public ean S() {
      return this.d.m();
   }

   @Override
   public long E() {
      return this.e;
   }

   @Override
   public fei<dku> U() {
      return this.j;
   }

   @Override
   public fei<eus> T() {
      return this.k;
   }

   @Override
   public int P() {
      return this.d.P();
   }

   @Override
   public azs C_() {
      return this.h;
   }

   @Override
   public int a(eel.a $$0, int $$1, int $$2) {
      return this.a(kl.a($$1), kl.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable bvs $$0, jj $$1, awj $$2, awl $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable bvs $$0, int $$1, jj $$2, int $$3) {
   }

   @Override
   public void a(js<edm> $$0, fcu $$1, edm.a $$2) {
   }

   @Override
   public ecj B_() {
      return this.i;
   }

   @Override
   public boolean a(jj $$0, Predicate<dym> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jj $$0, Predicate<eut> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bvs> List<T> a(ecy<bvs, T> $$0, fcp $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bvs> a(@Nullable bvs $$0, fcp $$1, @Nullable Predicate<? super bvs> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cqi> z() {
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
