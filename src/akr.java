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

public class akr implements cqf {
   private static final Logger a = LogUtils.getLogger();
   private final List<dgv> b;
   private final dgv c;
   private final int d;
   private final akk e;
   private final long f;
   private final ebt g;
   private final aru h;
   private final dii i;
   private final eiu<csl> j = new eiu<>($$0x -> this.x($$0x).o());
   private final eiu<eab> k = new eiu<>($$0x -> this.x($$0x).p());
   private final cql l;
   private final cos m;
   private final cos n;
   private final cqd o;
   private final dha p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final aer t = new aer("worldgen_region_random");

   public akr(akk $$0, List<dgv> $$1, dha $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = arp.a(Math.sqrt((double)$$1.size()));
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
         this.l = new cql(this, cql.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(cos $$0, int $$1) {
      return this.e.k().a.a($$0, $$1);
   }

   public cos a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public dgv a(int $$0, int $$1) {
      return this.a($$0, $$1, dha.c);
   }

   @Nullable
   @Override
   public dgv a(int $$0, int $$1, dha $$2, boolean $$3) {
      dgv $$6;
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
   public dez a_(gu $$0) {
      return this.a(hx.a($$0.u()), hx.a($$0.w())).a_($$0);
   }

   @Override
   public eac b_(gu $$0) {
      return this.x($$0).b_($$0);
   }

   @Nullable
   @Override
   public cbm a(double $$0, double $$1, double $$2, double $$3, Predicate<bii> $$4) {
      return null;
   }

   @Override
   public int v_() {
      return 0;
   }

   @Override
   public cql z_() {
      return this.l;
   }

   @Override
   public he<cqj> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(ha $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public dzr s_() {
      return this.e.s_();
   }

   @Override
   public boolean a(gu $$0, boolean $$1, @Nullable bii $$2, int $$3) {
      dez $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dcl $$5 = $$4.t() ? this.c_($$0) : null;
            csl.a($$4, (cpl)this.e, $$0, $$5, $$2, cix.b);
         }

         return this.a($$0, csm.a.n(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dcl c_(gu $$0) {
      dgv $$1 = this.x($$0);
      dcl $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         qr $$3 = $$1.f($$0);
         dez $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((cuz)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dcl.a($$0, $$4, $$3);
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
   public boolean f_(gu $$0) {
      int $$1 = hx.a($$0.u());
      int $$2 = hx.a($$0.w());
      cos $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            cpn $$6 = this.c.z();
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
   public boolean a(gu $$0, dez $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dgv $$4 = this.x($$0);
         dez $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dha.a.b) {
               dcl $$6 = ((cuz)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               qr $$7 = new qr();
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

   private void f(gu $$0) {
      this.x($$0).e($$0);
   }

   @Override
   public boolean b(bii $$0) {
      int $$1 = hx.a($$0.do());
      int $$2 = hx.a($$0.du());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(gu $$0, boolean $$1) {
      return this.a($$0, csm.a.n(), 3);
   }

   @Override
   public dgq w_() {
      return this.e.w_();
   }

   @Override
   public boolean r_() {
      return false;
   }

   @Deprecated
   @Override
   public akk C() {
      return this.e;
   }

   @Override
   public hs B_() {
      return this.e.B_();
   }

   @Override
   public cdu G() {
      return this.e.G();
   }

   @Override
   public ebt u_() {
      return this.g;
   }

   @Override
   public bgo d_(gu $$0) {
      if (!this.b(hx.a($$0.u()), hx.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bgo(this.e.ai(), this.e.W(), 0L, this.e.an());
      }
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return this.e.n();
   }

   @Override
   public dgz J() {
      return this.e.k();
   }

   @Override
   public long A() {
      return this.f;
   }

   @Override
   public eil<csl> L() {
      return this.j;
   }

   @Override
   public eil<eab> K() {
      return this.k;
   }

   @Override
   public int t_() {
      return this.e.t_();
   }

   @Override
   public aru y_() {
      return this.h;
   }

   @Override
   public int a(dki.a $$0, int $$1, int $$2) {
      return this.a(hx.a($$1), hx.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cbm $$0, gu $$1, aov $$2, aox $$3, float $$4, float $$5) {
   }

   @Override
   public void a(it $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cbm $$0, int $$1, gu $$2, int $$3) {
   }

   @Override
   public void a(djj $$0, ehd $$1, djj.a $$2) {
   }

   @Override
   public dii x_() {
      return this.i;
   }

   @Override
   public boolean a(gu $$0, Predicate<dez> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(gu $$0, Predicate<eac> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bii> List<T> a(dix<bii, T> $$0, egy $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bii> a(@Nullable bii $$0, egy $$1, @Nullable Predicate<? super bii> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cbm> v() {
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
