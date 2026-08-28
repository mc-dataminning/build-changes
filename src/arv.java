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

public class arv implements dfy {
   private static final Logger a = LogUtils.getLogger();
   private final bae<arf> b;
   private final dxf c;
   private final arn d;
   private final long e;
   private final etm f;
   private final azs h;
   private final dzf i;
   private final fbk<die> j = new fbk<>($$0x -> this.y($$0x).o());
   private final fbk<erj> k = new fbk<>($$0x -> this.y($$0x).p());
   private final dge l;
   private final dyj m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final ali p = ali.b("worldgen_region_random");

   public arv(arn $$0, bae<arf> $$1, dyj $$2, dxf $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.C();
      this.f = $$0.A_();
      this.h = $$0.l().i().a(p).a(this.c.f().l());
      this.i = $$0.D_();
      this.l = new dge(this, dge.a(this.e));
   }

   public boolean a(deh $$0, int $$1) {
      return this.d.l().a.b($$0, $$1);
   }

   public deh a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public dxf a(int $$0, int $$1) {
      return this.a($$0, $$1, dyg.c);
   }

   @Nullable
   @Override
   public dxf a(int $$0, int $$1, dyg $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      dyg $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      arf $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            dxf $$7 = $$6.a($$5);
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
   public dvj a_(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w())).a_($$0);
   }

   @Override
   public erk b_(jh $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public com a(double $$0, double $$1, double $$2, double $$3, Predicate<bue> $$4) {
      return null;
   }

   @Override
   public int B_() {
      return 0;
   }

   @Override
   public dge F_() {
      return this.l;
   }

   @Override
   public jq<dgc> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eqz z_() {
      return this.d.z_();
   }

   @Override
   public boolean a(jh $$0, boolean $$1, @Nullable bue $$2, int $$3) {
      dvj $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            dsm $$5 = $$4.x() ? this.c_($$0) : null;
            die.a($$4, (dfb)this.d, $$0, $$5, $$2, cwb.k);
         }

         return this.a($$0, dig.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dsm c_(jh $$0) {
      dxf $$1 = this.y($$0);
      dsm $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         uk $$3 = $$1.f($$0);
         dvj $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dkw)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dsm.a($$0, $$4, $$3, this.d.H_());
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
      deh $$3 = this.a();
      int $$4 = Math.abs($$3.g - $$1);
      int $$5 = Math.abs($$3.h - $$2);
      if ($$4 <= this.m.d() && $$5 <= this.m.d()) {
         if (this.c.x()) {
            dfd $$6 = this.c.y();
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
   public boolean a(jh $$0, dvj $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dxf $$4 = this.y($$0);
         dvj $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.j().d() == dyk.b) {
               dsm $$6 = ((dkw)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               uk $$7 = new uk();
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
   public boolean b(bue $$0) {
      int $$1 = kj.a($$0.dB());
      int $$2 = kj.a($$0.dH());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(jh $$0, boolean $$1) {
      return this.a($$0, dig.a.m(), 3);
   }

   @Override
   public dxa C_() {
      return this.d.C_();
   }

   @Override
   public boolean y_() {
      return false;
   }

   @Deprecated
   @Override
   public arn E() {
      return this.d;
   }

   @Override
   public ke H_() {
      return this.d.H_();
   }

   @Override
   public crf J() {
      return this.d.J();
   }

   @Override
   public etm A_() {
      return this.f;
   }

   @Override
   public bsb d_(jh $$0) {
      if (!this.b(kj.a($$0.u()), kj.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bsb(this.d.ak(), this.d.ab(), 0L, this.d.ap());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.d.o();
   }

   @Override
   public dxj P() {
      return this.d.l();
   }

   @Override
   public long C() {
      return this.e;
   }

   @Override
   public fbb<die> R() {
      return this.j;
   }

   @Override
   public fbb<erj> Q() {
      return this.k;
   }

   @Override
   public int N() {
      return this.d.N();
   }

   @Override
   public azs E_() {
      return this.h;
   }

   @Override
   public int a(ebf.a $$0, int $$1, int $$2) {
      return this.a(kj.a($$1), kj.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable com $$0, jh $$1, awk $$2, awm $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lp $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable com $$0, int $$1, jh $$2, int $$3) {
   }

   @Override
   public void a(jq<eag> $$0, ezn $$1, eag.a $$2) {
   }

   @Override
   public dzf D_() {
      return this.i;
   }

   @Override
   public boolean a(jh $$0, Predicate<dvj> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jh $$0, Predicate<erk> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bue> List<T> a(dzu<bue, T> $$0, ezi $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bue> a(@Nullable bue $$0, ezi $$1, @Nullable Predicate<? super bue> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<com> x() {
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
