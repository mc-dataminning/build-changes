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

public class arl implements dcr {
   private static final Logger a = LogUtils.getLogger();
   private final List<dtw> b;
   private final dtw c;
   private final int d;
   private final are e;
   private final long f;
   private final epq g;
   private final azf h;
   private final dvs i;
   private final exl<dex> j = new exl<>($$0x -> this.y($$0x).o());
   private final exl<ens> k = new exl<>($$0x -> this.y($$0x).p());
   private final dcx l;
   private final dbd m;
   private final dbd n;
   private final duv o;
   private final int p;
   @Nullable
   private Supplier<String> q;
   private final AtomicLong r = new AtomicLong();
   private static final ale s = new ale("worldgen_region_random");

   public arl(are $$0, List<dtw> $$1, duv $$2, int $$3) {
      this.o = $$2;
      this.p = $$3;
      int $$4 = ayx.a(Math.sqrt((double)$$1.size()));
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
         this.l = new dcx(this, dcx.a(this.f));
         this.m = $$1.get(0).f();
         this.n = $$1.get($$1.size() - 1).f();
      }
   }

   public boolean a(dbd $$0, int $$1) {
      return this.e.l().a.b($$0, $$1);
   }

   public dbd a() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.q = $$0;
   }

   @Override
   public dtw a(int $$0, int $$1) {
      return this.a($$0, $$1, duv.c);
   }

   @Nullable
   @Override
   public dtw a(int $$0, int $$1, duv $$2, boolean $$3) {
      dtw $$6;
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
      $$9.a("Requested status", () -> lp.n.b($$2).toString());
      $$9.a("Actual status", () -> $$6 == null ? "[out of region bounds]" : lp.n.b($$6.j()).toString());
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
   public dsa a_(iz $$0) {
      return this.a(kb.a($$0.u()), kb.a($$0.w())).a_($$0);
   }

   @Override
   public ent b_(iz $$0) {
      return this.y($$0).b_($$0);
   }

   @Nullable
   @Override
   public cmv a(double $$0, double $$1, double $$2, double $$3, Predicate<bss> $$4) {
      return null;
   }

   @Override
   public int B_() {
      return 0;
   }

   @Override
   public dcx F_() {
      return this.l;
   }

   @Override
   public ji<dcv> a(int $$0, int $$1, int $$2) {
      return this.e.a($$0, $$1, $$2);
   }

   @Override
   public float a(je $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public eni y_() {
      return this.e.y_();
   }

   @Override
   public boolean a(iz $$0, boolean $$1, @Nullable bss $$2, int $$3) {
      dsa $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         if ($$1) {
            dpf $$5 = $$4.t() ? this.c_($$0) : null;
            dex.a($$4, (dbw)this.e, $$0, $$5, $$2, cun.l);
         }

         return this.a($$0, dez.a.o(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public dpf c_(iz $$0) {
      dtw $$1 = this.y($$0);
      dpf $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ur $$3 = $$1.f($$0);
         dsa $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.l("id"))) {
               if (!$$4.t()) {
                  return null;
               }

               $$2 = ((dhp)$$4.b()).a($$0, $$4);
            } else {
               $$2 = dpf.a($$0, $$4, $$3, this.e.H_());
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
   public boolean f_(iz $$0) {
      int $$1 = kb.a($$0.u());
      int $$2 = kb.a($$0.w());
      dbd $$3 = this.a();
      int $$4 = Math.abs($$3.e - $$1);
      int $$5 = Math.abs($$3.f - $$2);
      if ($$4 <= this.p && $$5 <= this.p) {
         if (this.c.y()) {
            dby $$6 = this.c.z();
            if ($$0.v() < $$6.I_() || $$0.v() >= $$6.am()) {
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
   public boolean a(iz $$0, dsa $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         dtw $$4 = this.y($$0);
         dsa $$5 = $$4.a($$0, $$1, false);
         if ($$5 != null) {
            this.e.a($$0, $$5, $$1);
         }

         if ($$1.t()) {
            if ($$4.j().g() == dux.b) {
               dpf $$6 = ((dhp)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               ur $$7 = new ur();
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

   private void f(iz $$0) {
      this.y($$0).e($$0);
   }

   @Override
   public boolean b(bss $$0) {
      int $$1 = kb.a($$0.dt());
      int $$2 = kb.a($$0.dz());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(iz $$0, boolean $$1) {
      return this.a($$0, dez.a.o(), 3);
   }

   @Override
   public dtr C_() {
      return this.e.C_();
   }

   @Override
   public boolean x_() {
      return false;
   }

   @Deprecated
   @Override
   public are E() {
      return this.e;
   }

   @Override
   public jw H_() {
      return this.e.H_();
   }

   @Override
   public cpj J() {
      return this.e.J();
   }

   @Override
   public epq A_() {
      return this.g;
   }

   @Override
   public bqq d_(iz $$0) {
      if (!this.b(kb.a($$0.u()), kb.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bqq(this.e.al(), this.e.aa(), 0L, this.e.aq());
      }
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return this.e.o();
   }

   @Override
   public dua N() {
      return this.e.l();
   }

   @Override
   public long C() {
      return this.f;
   }

   @Override
   public exc<dex> P() {
      return this.j;
   }

   @Override
   public exc<ens> O() {
      return this.k;
   }

   @Override
   public int z_() {
      return this.e.z_();
   }

   @Override
   public azf E_() {
      return this.h;
   }

   @Override
   public int a(dxs.a $$0, int $$1, int $$2) {
      return this.a(kb.a($$1), kb.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable cmv $$0, iz $$1, avy $$2, awa $$3, float $$4, float $$5) {
   }

   @Override
   public void a(lg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable cmv $$0, int $$1, iz $$2, int $$3) {
   }

   @Override
   public void a(ji<dwt> $$0, evp $$1, dwt.a $$2) {
   }

   @Override
   public dvs D_() {
      return this.i;
   }

   @Override
   public boolean a(iz $$0, Predicate<dsa> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(iz $$0, Predicate<ent> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bss> List<T> a(dwh<bss, T> $$0, evk $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bss> a(@Nullable bss $$0, evk $$1, @Nullable Predicate<? super bss> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cmv> x() {
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
