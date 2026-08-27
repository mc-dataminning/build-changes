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

public class apm implements cxu {
   private static final Logger a = LogUtils.getLogger();
   private final List<dov> b;
   private final dov c;
   private final int d;
   private final apf e;
   private final long f;
   private final ekg g;
   private final axd h;
   private final dqm i;
   private final ern<daa> j = new ern<>($$0x -> this.y($$0x).o());
   private final ern<eim> k = new ern<>($$0x -> this.y($$0x).p());
   private final cya l;
   private final cwg m;
   private final cwg n;
   private final cxs o;
   private final dpa p;
   private final int q;
   @Nullable
   private Supplier<String> r;
   private final AtomicLong s = new AtomicLong();
   private static final ajh t = new ajh("worldgen_region_random");

   public apm(apf $$0, List<dov> $$1, dpa $$2, int $$3) {
      this.p = $$2;
      this.q = $$3;
      int $$4 = aww.a(Math.sqrt((double)$$1.size()));
      if ($$4 * $$4 != $$1.size()) {
         throw (IllegalStateException)ac.b(new IllegalStateException("Cache size is not a square."));
      } else {
         this.b = $$1;
         this.c = $$1.get($$1.size() / 2);
         this.d = $$4;
         this.e = $$0;
         this.f = $$0.C();
         this.g = $$0.A_();
         this.h = $$0.l().i().a(t).a(this.c.f().l());
         this.i = $$0.D_();
         this.l = new cya(this, cya.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
         this.o = $$0.a().a(this);
      }
   }

   public boolean a(cwg $$0, int $$1) {
      return this.e.l().a.b($$0, $$1);
   }

   public cwg a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.r = $$0;
   }

   @Override
   public dov a(int $$0, int $$1) {
      return this.a($$0, $$1, dpa.c);
   }

   @Nullable
   @Override
   public dov a(int $$0, int $$1, dpa $$2, boolean $$3) {
      dov $$6;
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
      $$9.a("Requested status", () -> ki.n.b($$2).toString());
      $$9.a("Actual status", () -> $$6 == null ? "[out of region bounds]" : ki.n.b($$6.j()).toString());
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
   public dmz a_(ib $$0) {
      return this.a(je.a($$0.u()), je.a($$0.w())).a_($$0);
   }

   @Override
   public ein b_(ib $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cis a(double $$0, double $$1, double $$2, double $$3, Predicate<bow> $$4) {
      return null;
   }

   @Override
   public int B_() {
      return 0;
   }

   @Override
   public cya F_() {
      return this.l;
   }

   @Override
   public il<cxy> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(ih $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eic y_() {
      return this.e.y_();
   }

   @Override
   public boolean a(ib $$0, boolean $$1, @Nullable bow $$2, int $$3) {
      dmz $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dkg $$5 = $$4.t() ? this.c_($$0) : null;
            daa.a($$4, (cwz)this.e, $$0, $$5, $$2, cqk.h);
         }

         return this.a($$0, dac.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dkg c_(ib $$0) {
      dov $$1 = this.y($$0);
      dkg $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ta $$3 = $$1.f($$0);
         dmz $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((dcs)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dkg.a($$0, $$4, $$3, this.e.H_());
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
   public boolean f_(ib $$0) {
      int $$1 = je.a($$0.u());
      int $$2 = je.a($$0.w());
      cwg $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.q && $$5 <= this.q) {
         if (this.c.y()) {
            cxb $$6 = this.c.z();
            if ($$0.v() < $$6.I_() || $$0.v() >= $$6.ak()) {
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
   public boolean a(ib $$0, dmz $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dov $$4 = this.y($$0);
         dmz $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dpa.a.b) {
               dkg $$6 = ((dcs)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               ta $$7 = new ta();
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

   private void f(ib $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(bow $$0) {
      int $$1 = je.a($$0.dq());
      int $$2 = je.a($$0.dw());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(ib $$0, boolean $$1) {
      return this.a($$0, dac.a.o(), 3);
   }

   @Override
   public doq C_() {
      return this.e.C_();
   }

   @Override
   public boolean x_() {
      return false;
   }

   @Deprecated
   @Override
   public apf E() {
      return this.e;
   }

   @Override
   public iz H_() {
      return this.e.H_();
   }

   @Override
   public clf I() {
      return this.e.I();
   }

   @Override
   public ekg A_() {
      return this.g;
   }

   @Override
   public bna d_(ib $$0) {
      if (!this.b(je.a($$0.u()), je.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bna(this.e.aj(), this.e.Y(), 0L, this.e.ao());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.e.o();
   }

   @Override
   public doz L() {
      return this.e.l();
   }

   @Override
   public long C() {
      return this.f;
   }

   @Override
   public ere<daa> N() {
      return this.j;
   }

   @Override
   public ere<eim> M() {
      return this.k;
   }

   @Override
   public int z_() {
      return this.e.z_();
   }

   @Override
   public axd E_() {
      return this.h;
   }

   @Override
   public int a(dsm.a $$0, int $$1, int $$2) {
      return this.a(je.a($$1), je.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cis $$0, ib $$1, atx $$2, atz $$3, float $$4, float $$5) {
   }

   @Override
   public void a(ka $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cis $$0, int $$1, ib $$2, int $$3) {
   }

   @Override
   public void a(il<drn> $$0, epr $$1, drn.a $$2) {
   }

   @Override
   public dqm D_() {
      return this.i;
   }

   @Override
   public boolean a(ib $$0, Predicate<dmz> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ib $$0, Predicate<ein> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bow> List<T> a(drb<bow, T> $$0, epm $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bow> a(@Nullable bow $$0, epm $$1, @Nullable Predicate<? super bow> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cis> x() {
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
      return this.s.getAndIncrement();
   }
}
