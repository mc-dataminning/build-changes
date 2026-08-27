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

public class aqb implements dab {
   private static final Logger a = LogUtils.getLogger();
   private final List<dre> b;
   private final dre c;
   private final int d;
   private final apu e;
   private final long f;
   private final emw g;
   private final axt h;
   private final dta i;
   private final euf<dch> j = new euf<>($$0x -> this.y($$0x).o());
   private final euf<ela> k = new euf<>($$0x -> this.y($$0x).p());
   private final dah l;
   private final cyn m;
   private final cyn n;
   private final dsd o;
   private final int p;
   @Nullable
   private Supplier<String> q;
   private final AtomicLong r = new AtomicLong();
   private static final ajv s = new ajv("worldgen_region_random");

   public aqb(apu $$0, List<dre> $$1, dsd $$2, int $$3) {
      this.o = $$2;
      this.p = $$3;
      int $$4 = axm.a(Math.sqrt((double)$$1.size()));
      if ($$4 * $$4 != $$1.size()) {
         throw (IllegalStateException)ac.b(new IllegalStateException("Cache size is not a square."));
      } else {
         this.b = $$1;
         this.c = $$1.get($$1.size() / 2);
         this.d = $$4;
         this.e = $$0;
         this.f = $$0.C();
         this.g = $$0.A_();
         this.h = $$0.l().i().a(s).a(this.c.f().l());
         this.i = $$0.D_();
         this.l = new dah(this, dah.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
      }
   }

   public boolean a(cyn $$0, int $$1) {
      return this.e.l().a.b($$0, $$1);
   }

   public cyn a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.q = $$0;
   }

   @Override
   public dre a(int $$0, int $$1) {
      return this.a($$0, $$1, dsd.c);
   }

   @Nullable
   @Override
   public dre a(int $$0, int $$1, dsd $$2, boolean $$3) {
      dre $$6;
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

      o $$8 = o.a(new IllegalStateException("Requested chunk unavailable during world generation"), "Exception generating new chunk");
      p $$9 = $$8.a("Chunk request details");
      $$9.a("Requested chunk", String.format(Locale.ROOT, "%d, %d", $$0, $$1));
      $$9.a("Requested status", () -> kt.n.b($$2).toString());
      $$9.a("Actual status", () -> $$6 == null ? "[out of region bounds]" : kt.n.b($$6.j()).toString());
      $$9.a("loadOrGenerate", $$3);
      $$9.a("Generating chunk", () -> this.c.f().toString());
      $$9.a("Region start", this.m);
      $$9.a("Region end", this.n);
      throw new y($$8);
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return $$0 >= this.m.e && $$0 <= this.n.e && $$1 >= this.m.f && $$1 <= this.n.f;
   }

   @Override
   public dpi a_(id $$0) {
      return this.a(jg.a($$0.u()), jg.a($$0.w())).a_($$0);
   }

   @Override
   public elb b_(id $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cka a(double $$0, double $$1, double $$2, double $$3, Predicate<bqa> $$4) {
      return null;
   }

   @Override
   public int B_() {
      return 0;
   }

   @Override
   public dah F_() {
      return this.l;
   }

   @Override
   public in<daf> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(ij $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public ekq y_() {
      return this.e.y_();
   }

   @Override
   public boolean a(id $$0, boolean $$1, @Nullable bqa $$2, int $$3) {
      dpi $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dmo $$5 = $$4.t() ? this.c_($$0) : null;
            dch.a($$4, (czg)this.e, $$0, $$5, $$2, crs.i);
         }

         return this.a($$0, dcj.a.n(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dmo c_(id $$0) {
      dre $$1 = this.y($$0);
      dmo $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         to $$3 = $$1.f($$0);
         dpi $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((dez)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dmo.a($$0, $$4, $$3, this.e.H_());
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
   public boolean f_(id $$0) {
      int $$1 = jg.a($$0.u());
      int $$2 = jg.a($$0.w());
      cyn $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.p && $$5 <= this.p) {
         if (this.c.y()) {
            czi $$6 = this.c.z();
            if ($$0.v() < $$6.I_() || $$0.v() >= $$6.al()) {
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
               + this.o
               + (this.q == null ? "" : ", currently generating: " + this.q.get())
         );
         return false;
      }
   }

   @Override
   public boolean a(id $$0, dpi $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dre $$4 = this.y($$0);
         dpi $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dsf.b) {
               dmo $$6 = ((dez)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               to $$7 = new to();
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

   private void f(id $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(bqa $$0) {
      int $$1 = jg.a($$0.dq());
      int $$2 = jg.a($$0.dw());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(id $$0, boolean $$1) {
      return this.a($$0, dcj.a.n(), 3);
   }

   @Override
   public dqz C_() {
      return this.e.C_();
   }

   @Override
   public boolean x_() {
      return false;
   }

   @Deprecated
   @Override
   public apu E() {
      return this.e;
   }

   @Override
   public jb H_() {
      return this.e.H_();
   }

   @Override
   public cmn J() {
      return this.e.J();
   }

   @Override
   public emw A_() {
      return this.g;
   }

   @Override
   public bod d_(id $$0) {
      if (!this.b(jg.a($$0.u()), jg.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bod(this.e.ak(), this.e.Z(), 0L, this.e.ap());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.e.o();
   }

   @Override
   public dri M() {
      return this.e.l();
   }

   @Override
   public long C() {
      return this.f;
   }

   @Override
   public etw<dch> O() {
      return this.j;
   }

   @Override
   public etw<ela> N() {
      return this.k;
   }

   @Override
   public int z_() {
      return this.e.z_();
   }

   @Override
   public axt E_() {
      return this.h;
   }

   @Override
   public int a(dva.a $$0, int $$1, int $$2) {
      return this.a(jg.a($$1), jg.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cka $$0, id $$1, aun $$2, aup $$3, float $$4, float $$5) {
   }

   @Override
   public void a(kl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cka $$0, int $$1, id $$2, int $$3) {
   }

   @Override
   public void a(in<dub> $$0, esj $$1, dub.a $$2) {
   }

   @Override
   public dta D_() {
      return this.i;
   }

   @Override
   public boolean a(id $$0, Predicate<dpi> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(id $$0, Predicate<elb> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bqa> List<T> a(dtp<bqa, T> $$0, ese $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bqa> a(@Nullable bqa $$0, ese $$1, @Nullable Predicate<? super bqa> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cka> x() {
      return Collections.emptyList();
   }

   @Override
   public int I_() {
      return this.e.I_();
   }

   @Override
   public int J_() {
      return this.e.J_();
   }

   @Override
   public long G_() {
      return this.r.getAndIncrement();
   }
}
