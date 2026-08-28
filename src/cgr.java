import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cgr extends cfv implements buv {
   private static final int bZ = 40;
   private static final akg<Byte> ca = akk.a(cgr.class, aki.a);
   private static final Map<cue, Integer> cb = Maps.newEnumMap(Arrays.stream(cue.values()).collect(Collectors.toMap($$0 -> (cue)$$0, cgr::c)));
   private int cd;
   private cau ce;

   private static int c(cue $$0) {
      if ($$0 == cue.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axn.a(255, azc.d((float)axn.b($$1) * 0.75F), azc.d((float)axn.c($$1) * 0.75F), azc.d((float)axn.d($$1) * 0.75F));
      }
   }

   public static int a(cue $$0) {
      return cb.get($$0);
   }

   public cgr(btq<? extends cgr> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.ce = new cau(this);
      this.bT.a(0, new caw(this));
      this.bT.a(1, new cbv(this, 1.25));
      this.bT.a(2, new cao(this, 1.0));
      this.bT.a(3, new cck(this, 1.1, $$0 -> $$0.a(axb.ac), false));
      this.bT.a(4, new cbb(this, 1.1));
      this.bT.a(5, this.ce);
      this.bT.a(6, new ccp(this, 1.0));
      this.bT.a(7, new cbk(this, cnp.class, 6.0F));
      this.bT.a(8, new cbx(this));
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.ac);
   }

   @Override
   protected void ad() {
      this.cd = this.ce.h();
      super.ad();
   }

   @Override
   public void m_() {
      if (this.dS().B) {
         this.cd = Math.max(0, this.cd - 1);
      }

      super.m_();
   }

   public static bvl.a q() {
      return cfv.gt().a(bvm.s, 8.0).a(bvm.v, 0.23F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ca, (byte)0);
   }

   @Override
   public ala<esy> X() {
      return this.y() ? this.ao().k() : esp.am.get(this.t());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.cd = 40;
      } else {
         super.b($$0);
      }
   }

   public float J(float $$0) {
      if (this.cd <= 0) {
         return 0.0F;
      } else if (this.cd >= 4 && this.cd <= 36) {
         return 1.0F;
      } else {
         return this.cd < 4 ? ((float)this.cd - $$0) / 4.0F : -((float)(this.cd - 40) - $$0) / 4.0F;
      }
   }

   public float K(float $$0) {
      if (this.cd > 4 && this.cd <= 36) {
         float $$1 = ((float)(this.cd - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * azc.a($$1 * 28.7F);
      } else {
         return this.cd > 0 ? (float) (Math.PI / 5) : this.dK() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if ($$2.a(cvo.rW)) {
         if (!this.dS().B && this.a()) {
            this.a(awe.h);
            this.a(dyx.M, $$0);
            $$2.a(1, $$0, d($$1));
            return brk.b;
         } else {
            return brk.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awe $$0) {
      this.dS().a(null, this, awd.wC, $$0, 1.0F, 1.0F);
      this.x(true);
      this.a(esp.an.get(this.t()), $$0x -> {
         for (int $$1 = 0; $$1 < $$0x.J(); $$1++) {
            cjz $$2 = this.a($$0x.c(1), 1.0F);
            if ($$2 != null) {
               $$2.h($$2.dv().b((double)((this.af.i() - this.af.i()) * 0.1F), (double)(this.af.i() * 0.05F), (double)((this.af.i() - this.af.i()) * 0.1F)));
            }
         }
      });
   }

   @Override
   public boolean a() {
      return this.bI() && !this.y() && !this.o_();
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("Sheared"));
      this.b(cue.a($$0.f("Color")));
   }

   @Override
   protected awc w() {
      return awd.wz;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.wB;
   }

   @Override
   protected awc n_() {
      return awd.wA;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.wD, 0.15F, 1.0F);
   }

   public cue t() {
      return cue.a(this.am.a(ca) & 15);
   }

   public void b(cue $$0) {
      byte $$1 = this.am.a(ca);
      this.am.a(ca, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean y() {
      return (this.am.a(ca) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.a(ca);
      if ($$0) {
         this.am.a(ca, (byte)($$1 | 16));
      } else {
         this.am.a(ca, (byte)($$1 & -17));
      }
   }

   public static cue a(azk $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cue.p;
      } else if ($$1 < 10) {
         return cue.h;
      } else if ($$1 < 15) {
         return cue.i;
      } else if ($$1 < 18) {
         return cue.m;
      } else {
         return $$0.a(500) == 0 ? cue.g : cue.a;
      }
   }

   @Nullable
   public cgr b(arg $$0, btc $$1) {
      cgr $$2 = btq.aJ.a($$0, btp.e);
      if ($$2 != null) {
         $$2.b(this.a(this, (cgr)$$1));
      }

      return $$2;
   }

   @Override
   public void S() {
      super.S();
      this.x(false);
      if (this.o_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      this.b(a($$0.C_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cue a(cfv $$0, cfv $$1) {
      cue $$2 = ((cgr)$$0).t();
      cue $$3 = ((cgr)$$1).t();
      czi $$4 = a($$2, $$3);
      return this.dS()
         .r()
         .a(czz.a, $$4, this.dS())
         .map($$1x -> ((czj)$$1x.b()).a($$4, this.dS().F_()))
         .map(cvl::h)
         .filter(cuf.class::isInstance)
         .map(cuf.class::cast)
         .map(cuf::c)
         .orElseGet(() -> this.dS().z.h() ? $$2 : $$3);
   }

   private static czi a(cue $$0, cue $$1) {
      return czi.a(2, 1, List.of(new cvl(cuf.a($$0)), new cvl(cuf.a($$1))));
   }
}
