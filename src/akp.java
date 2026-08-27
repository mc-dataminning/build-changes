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

public class akp implements cqe {
   private static final Logger a = LogUtils.getLogger();
   private final List<dgu> b;
   private final dgu c;
   private final int d;
   private final aki e;
   private final long f;
   private final ebs g;
   private final art h;
   private final dih i;
   private final eiw<csk> j = new eiw<>($$0x -> this.x($$0x).o());
   private final eiw<eaa> k = new eiw<>($$0x -> this.x($$0x).p());
   private final cqk l;
   private final cor m;
   private final cor n;
   private final cqc o;
   private final dgz p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final aep t = new aep("worldgen_region_random");

   public akp(aki $$0, List<dgu> $$1, dgz $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = aro.a(Math.sqrt((double)$$1.size()));
      if ($$4 * $$4 != $$1.size()) {
         throw (IllegalStateException)ac.b(new IllegalStateException("Cache size is not a square."));
      } else {
         this.b = $$1;
         this.c = $$1.get($$1.size() / 2);
         this.d = $$4;
         this.e = $$0;
         this.f = $$0.A();
         this.g = $$0.u_();
         this.h = $$0.k().i().a(t).a(this.c.f().l());
         this.i = $$0.x_();
         this.l = new cqk(this, cqk.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(cor $$0, int $$1) {
      return this.e.k().a.a($$0, $$1);
   }

   public cor a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public dgu a(int $$0, int $$1) {
      return this.a($$0, $$1, dgz.c);
   }

   @Nullable
   @Override
   public dgu a(int $$0, int $$1, dgz $$2, boolean $$3) {
      dgu $$6;
      if (this.b($$0, $$1)) {
         int $$4 = $$0 - this.m.e;
         int $$5 = $$1 - this.m.f;
         $$6 = this.b.get($$4 + $$5 * this.d);
         if ($$6.j().b($$2)) {
            return $$6;
         }
      } else {
         $$6 = null;
      }

      if (!$$3) {
         return null;
      } else {
         a.error("Requested chunk : {} {}", $$0, $$1);
         a.error("Region bounds : {} {} | {} {}", new Object[]{this.m.e, this.m.f, this.n.e, this.n.f});
         if ($$6 != null) {
            throw (RuntimeException)ac.b(
               new RuntimeException(String.format(Locale.ROOT, "Chunk is not of correct status. Expecting %s, got %s | %s %s", $$2, $$6.j(), $$0, $$1))
            );
         } else {
            throw (RuntimeException)ac.b(new RuntimeException(String.format(Locale.ROOT, "We are asking a region for a chunk out of bound | %s %s", $$0, $$1)));
         }
      }
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return $$0 >= this.m.e && $$0 <= this.n.e && $$1 >= this.m.f && $$1 <= this.n.f;
   }

   @Override
   public dey a_(gv $$0) {
      return this.a(hy.a($$0.u()), hy.a($$0.w())).a_($$0);
   }

   @Override
   public eab b_(gv $$0) {
      return this.x($$0).b_($$0);
   }

   @Nullable
   @Override
   public cbl a(double $$0, double $$1, double $$2, double $$3, Predicate<big> $$4) {
      return null;
   }

   @Override
   public int v_() {
      return 0;
   }

   @Override
   public cqk z_() {
      return this.l;
   }

   @Override
   public hf<cqi> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(hb $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public dzq s_() {
      return this.e.s_();
   }

   @Override
   public boolean a(gv $$0, boolean $$1, @Nullable big $$2, int $$3) {
      dey $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dck $$5 = $$4.t() ? this.c_($$0) : null;
            csk.a($$4, (cpk)this.e, $$0, $$5, $$2, ciw.b);
         }

         return this.a($$0, csl.a.n(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dck c_(gv $$0) {
      dgu $$1 = this.x($$0);
      dck $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         qs $$3 = $$1.f($$0);
         dey $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((cuy)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dck.a($$0, $$4, $$3);
            }

            if ($$2 != null) {
               $$1.a($$2);
               return $$2;
            }
         }

         if ($$4.t()) {
            a.warn("Tried to access a block entity before it was created. {}", $$0);
         }

         return null;
      }
   }

   @Override
   public boolean f_(gv $$0) {
      int $$1 = hy.a($$0.u());
      int $$2 = hy.a($$0.w());
      cor $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            cpm $$6 = this.c.z();
            if ($$0.v() < $$6.C_() || $$0.v() >= $$6.aj()) {
               return false;
            }
         }

         return true;
      } else {
         ac.a(
            "Detected setBlock in a far chunk ["
               + $$1
               + ", "
               + $$2
               + "], pos: "
               + $$0
               + ", status: "
               + this.p
               + (this.r == null ? "" : ", currently generating: " + this.r.get())
         );
         return false;
      }
   }

   @Override
   public boolean a(gv $$0, dey $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dgu $$4 = this.x($$0);
         dey $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dgz.a.b) {
               dck $$6 = ((cuy)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               qs $$7 = new qs();
               $$7.a("x", $$0.u());
               $$7.a("y", $$0.v());
               $$7.a("z", $$0.w());
               $$7.a("id", "DUMMY");
               $$4.a($$7);
            }
         } else if ($$5 != null && $$5.t()) {
            $$4.d($$0);
         }

         if ($$1.q(this, $$0)) {
            this.f($$0);
         }

         return true;
      }
   }

   private void f(gv $$0) {
      this.x($$0).e($$0);
   }

   @Override
   public boolean b(big $$0) {
      int $$1 = hy.a($$0.do());
      int $$2 = hy.a($$0.du());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(gv $$0, boolean $$1) {
      return this.a($$0, csl.a.n(), 3);
   }

   @Override
   public dgp w_() {
      return this.e.w_();
   }

   @Override
   public boolean r_() {
      return false;
   }

   @Deprecated
   @Override
   public aki C() {
      return this.e;
   }

   @Override
   public ht B_() {
      return this.e.B_();
   }

   @Override
   public cdt G() {
      return this.e.G();
   }

   @Override
   public ebs u_() {
      return this.g;
   }

   @Override
   public bgm d_(gv $$0) {
      if (!this.b(hy.a($$0.u()), hy.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bgm(this.e.ai(), this.e.W(), 0L, this.e.an());
      }
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return this.e.n();
   }

   @Override
   public dgy J() {
      return this.e.k();
   }

   @Override
   public long A() {
      return this.f;
   }

   @Override
   public ein<csk> L() {
      return this.j;
   }

   @Override
   public ein<eaa> K() {
      return this.k;
   }

   @Override
   public int t_() {
      return this.e.t_();
   }

   @Override
   public art y_() {
      return this.h;
   }

   @Override
   public int a(dkh.a $$0, int $$1, int $$2) {
      return this.a(hy.a($$1), hy.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cbl $$0, gv $$1, aot $$2, aov $$3, float $$4, float $$5) {
   }

   @Override
   public void a(iu $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cbl $$0, int $$1, gv $$2, int $$3) {
   }

   @Override
   public void a(dji $$0, ehf $$1, dji.a $$2) {
   }

   @Override
   public dih x_() {
      return this.i;
   }

   @Override
   public boolean a(gv $$0, Predicate<dey> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(gv $$0, Predicate<eab> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends big> List<T> a(diw<big, T> $$0, eha $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<big> a(@Nullable big $$0, eha $$1, @Nullable Predicate<? super big> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cbl> v() {
      return Collections.emptyList();
   }

   @Override
   public int C_() {
      return this.e.C_();
   }

   @Override
   public int D_() {
      return this.e.D_();
   }

   @Override
   public long A_() {
      return this.s.getAndIncrement();
   }
}
