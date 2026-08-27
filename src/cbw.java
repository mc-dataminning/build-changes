import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbw extends cam implements bov, bpw<cbw.d>, cao {
   public static final int bV = 200;
   protected static final ImmutableList<? extends bzh<? extends bzg<? super cbw>>> bW = ImmutableList.of(bzh.c, bzh.o, bzh.f, bzh.p, bzh.q);
   protected static final ImmutableList<? extends bya<?>> bY = ImmutableList.of(
      bya.r, bya.g, bya.h, bya.k, bya.l, bya.n, bya.m, bya.E, bya.t, bya.o, bya.p, bya.K, new bya[]{bya.y, bya.N, bya.B, bya.O, bya.P, bya.R, bya.U, bya.Z}
   );
   private static final aii<Integer> cc = ail.a(cbw.class, aik.b);
   private static final aii<Boolean> cd = ail.a(cbw.class, aik.k);
   private static final aii<Boolean> ce = ail.a(cbw.class, aik.k);
   public static final double bZ = 20.0;
   public static final int ca = 1200;
   private static final int cf = 6000;
   public static final String cb = "Variant";
   private static final int cg = 1800;
   private static final int ch = 2400;
   private final Map<String, Vector3f> ci = Maps.newHashMap();
   private static final int cj = 100;

   public cbw(bol<? extends cbw> $$0, cwe $$1) {
      super($$0, $$1);
      this.a(eic.j, 0.0F);
      this.bM = new cbw.c(this);
      this.bL = new cbw.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.ci;
   }

   @Override
   public float a(ib $$0, cwh $$1) {
      return 0.0F;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cc, 0);
      this.am.a(cd, false);
      this.am.a(ce, false);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Variant", this.gl().a());
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.a(cbw.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gr()) {
         super.R();
      }
   }

   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      boolean $$4 = false;
      if ($$2 == bpb.l) {
         return $$3;
      } else {
         awt $$5 = $$0.F_();
         if ($$3 instanceof cbw.a) {
            if (((cbw.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cbw.a(cbw.d.a($$5), cbw.d.a($$5));
         }

         this.a(((cbw.a)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void as() {
      int $$0 = this.cf();
      super.as();
      if (!this.gb()) {
         this.u($$0);
      }
   }

   protected void u(int $$0) {
      if (this.bx() && !this.bb()) {
         this.k($$0 - 1);
         if (this.cf() == -20) {
            this.k(0);
            this.a(this.dK().r(), 2.0F);
         }
      } else {
         this.k(this.ce());
      }
   }

   @Override
   public void u() {
      int $$0 = this.cf() + 1800;
      this.k(Math.min($$0, this.ce()));
   }

   @Override
   public int ce() {
      return 6000;
   }

   public cbw.d gl() {
      return cbw.d.a(this.am.b(cc));
   }

   public void a(cbw.d $$0) {
      this.am.b(cc, $$0.a());
   }

   private static boolean a(awt $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cwh $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cw() {
      return false;
   }

   public void x(boolean $$0) {
      this.am.b(cd, $$0);
   }

   public boolean gr() {
      return this.am.b(cd);
   }

   @Override
   public boolean w() {
      return this.am.b(ce);
   }

   @Override
   public void w(boolean $$0) {
      this.am.b(ce, $$0);
   }

   @Nullable
   @Override
   public boa a(apa $$0, boa $$1) {
      cbw $$2 = bol.g.a((cwe)$$0);
      if ($$2 != null) {
         cbw.d $$3;
         if (a(this.af)) {
            $$3 = cbw.d.b(this.af);
         } else {
            $$3 = this.af.h() ? this.gl() : ((cbw)$$1).gl();
         }

         $$2.a($$3);
         $$2.fQ();
      }

      return $$2;
   }

   @Override
   public boolean o(cpq $$0) {
      return $$0.a(aum.aA);
   }

   @Override
   public boolean a(cia $$0) {
      return true;
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("axolotlBrain");
      this.dM().a((apa)this.dJ(), this);
      this.dJ().ae().c();
      this.dJ().ae().a("axolotlActivityUpdate");
      cbx.a(this);
      this.dJ().ae().c();
      if (!this.gb()) {
         Optional<Integer> $$0 = this.dM().c(bya.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bqd.a gs() {
      return boz.C().a(bqe.n, 14.0).a(bqe.o, 1.0).a(bqe.c, 2.0).a(bqe.r, 1.0);
   }

   @Override
   protected byi b(cwe $$0) {
      return new byf(this, $$0);
   }

   @Override
   public boolean B(bof $$0) {
      boolean $$1 = $$0.a(this.dK().b((box)this), (float)((int)this.g(bqe.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(atp.aI, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      float $$2 = this.eu();
      if (!this.dJ().B
         && !this.gb()
         && this.dJ().z.a(3) == 0
         && ((float)this.dJ().z.a(3) < $$1 || $$2 / this.eL() < 0.5F)
         && $$1 < $$2
         && this.aZ()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gr()) {
         this.bA.a(bya.N, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   public int ab() {
      return 1;
   }

   @Override
   public int fJ() {
      return 1;
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      return cao.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cpq $$0) {
      cao.a(this, $$0);
      sy $$1 = $$0.x();
      $$1.a("Variant", this.gl().a());
      $$1.a("Age", this.h());
      bpy<?> $$2 = this.dM();
      if ($$2.a(bya.U)) {
         $$1.a("HuntingCooldown", $$2.e(bya.U));
      }
   }

   @Override
   public void c(sy $$0) {
      cao.a(this, $$0);
      this.a(cbw.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dM().a(bya.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cpq b() {
      return new cpq(cpt.qI);
   }

   @Override
   public ato A() {
      return atp.db;
   }

   @Override
   public boolean en() {
      return !this.gr() && super.en();
   }

   public static void a(cbw $$0, box $$1) {
      cwe $$2 = $$0.dJ();
      if ($$1.ev()) {
         bne $$3 = $$1.ew();
         if ($$3 != null) {
            bof $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == bol.bw) {
               cia $$5 = (cia)$$4;
               List<cia> $$6 = $$2.a(cia.class, $$0.cE().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cia $$0) {
      bns $$1 = $$0.c(bnu.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.c() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bns(bnu.j, $$3, 0), this);
      }

      $$0.e(bnu.d);
   }

   @Override
   public boolean X() {
      return super.X() || this.w();
   }

   @Override
   protected ato d(bne $$0) {
      return atp.aK;
   }

   @Nullable
   @Override
   protected ato n_() {
      return atp.aJ;
   }

   @Nullable
   @Override
   protected ato y() {
      return this.aZ() ? atp.aM : atp.aL;
   }

   @Override
   protected ato aO() {
      return atp.aN;
   }

   @Override
   protected ato aN() {
      return atp.aO;
   }

   @Override
   protected bpy.b<cbw> dN() {
      return bpy.a(bY, bW);
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      return cbx.a(this.dN().a($$0));
   }

   @Override
   public bpy<cbw> dM() {
      return (bpy<cbw>)super.dM();
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }

   @Override
   public void a(eov $$0) {
      if (this.cU() && this.aZ()) {
         this.a(this.fh(), $$0);
         this.a(bpc.a, this.dm());
         this.g(this.dm().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cia $$0, bmk $$1, cpq $$2) {
      if ($$2.a(cpt.qH)) {
         $$0.a($$1, new cpq(cpt.qy));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   public static boolean a(bol<? extends box> $$0, cwt $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.a_($$3.d()).a(aue.bR);
   }

   public static class a extends boa.a {
      public final cbw.d[] a;

      public a(cbw.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cbw.d a(awt $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends buy {
      public b(cbw $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cbw.this.gr()) {
            super.a();
         }
      }
   }

   static class c extends buz {
      private final cbw l;

      public c(cbw $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gr()) {
            super.a();
         }
      }
   }

   public static enum d implements axg {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cbw.d> g = ave.a(cbw.d::a, values(), ave.a.a);
      public static final Codec<cbw.d> f = axg.a(cbw.d::values);
      private final int h;
      private final String i;
      private final boolean j;

      private d(int $$0, String $$1, boolean $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      public int a() {
         return this.h;
      }

      public String b() {
         return this.i;
      }

      @Override
      public String c() {
         return this.i;
      }

      public static cbw.d a(int $$0) {
         return g.apply($$0);
      }

      public static cbw.d a(awt $$0) {
         return a($$0, true);
      }

      public static cbw.d b(awt $$0) {
         return a($$0, false);
      }

      private static cbw.d a(awt $$0, boolean $$1) {
         cbw.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cbw.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
