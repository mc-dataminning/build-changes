import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class blt extends blw implements bnl {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final agn<Float> f = agq.a(blt.class, agp.d);
   private static final agn<Integer> g = agq.a(blt.class, agp.b);
   private static final agn<Boolean> h = agq.a(blt.class, agp.k);
   private static final agn<jv> i = agq.a(blt.class, agp.l);
   private static final float j = 32.0F;
   private static final float k = 0.5F;
   private static final float l = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private static final String m = "effects";
   private ih<cpe> n = cph.b;
   private final List<blj> o = Lists.newArrayList();
   private final Map<blw, Integer> p = Maps.newHashMap();
   private int q = 600;
   private int r = 20;
   private int s = 20;
   private boolean t;
   private int u;
   private float v;
   private float aE;
   @Nullable
   private bmo aF;
   @Nullable
   private UUID aG;

   public blt(bmc<? extends blt> $$0, ctx $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public blt(ctx $$0, double $$1, double $$2, double $$3) {
      this(bmc.c, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void c_() {
      this.an().a(g, 0);
      this.an().a(f, 3.0F);
      this.an().a(h, false);
      this.an().a(i, jx.v);
   }

   public void a(float $$0) {
      if (!this.dL().B) {
         this.an().b(f, aup.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void k_() {
      double $$0 = this.dq();
      double $$1 = this.ds();
      double $$2 = this.dw();
      super.k_();
      this.a_($$0, $$1, $$2);
   }

   public float h() {
      return this.an().b(f);
   }

   public void a(ih<cpe> $$0) {
      this.n = $$0;
      if (!this.t) {
         this.x();
      }
   }

   private void x() {
      if (this.n.a(cph.b) && this.o.isEmpty()) {
         this.an().b(g, 0);
      } else {
         this.an().b(g, cpg.a(cpg.a(this.n, this.o)));
      }
   }

   public void a(blj $$0) {
      this.o.add($$0);
      if (!this.t) {
         this.x();
      }
   }

   public int i() {
      return this.an().b(g);
   }

   public void a(int $$0) {
      this.t = true;
      this.an().b(g, $$0);
   }

   public jv j() {
      return this.an().b(i);
   }

   public void a(jv $$0) {
      this.an().b(i, $$0);
   }

   protected void a(boolean $$0) {
      this.an().b(h, $$0);
   }

   public boolean k() {
      return this.an().b(h);
   }

   public int m() {
      return this.q;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   @Override
   public void l() {
      super.l();
      boolean $$0 = this.k();
      float $$1 = this.h();
      if (this.dL().B) {
         if ($$0 && this.ag.h()) {
            return;
         }

         jv $$2 = this.j();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = aup.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ag.i() * (float) (Math.PI * 2);
            float $$9 = aup.c(this.ag.i()) * $$4;
            double $$10 = this.dq() + (double)(aup.b($$8) * $$9);
            double $$11 = this.ds();
            double $$12 = this.dw() + (double)(aup.a($$8) * $$9);
            double $$14;
            double $$15;
            double $$16;
            if ($$2.b() == jx.v) {
               int $$13 = $$0 && this.ag.h() ? 16777215 : this.i();
               $$14 = (double)((float)($$13 >> 16 & 0xFF) / 255.0F);
               $$15 = (double)((float)($$13 >> 8 & 0xFF) / 255.0F);
               $$16 = (double)((float)($$13 & 0xFF) / 255.0F);
            } else if ($$0) {
               $$14 = 0.0;
               $$15 = 0.0;
               $$16 = 0.0;
            } else {
               $$14 = (0.5 - this.ag.j()) * 0.15;
               $$15 = 0.01F;
               $$16 = (0.5 - this.ag.j()) * 0.15;
            }

            this.dL().b($$2, $$10, $$11, $$12, $$14, $$15, $$16);
         }
      } else {
         if (this.ah >= this.r + this.q) {
            this.am();
            return;
         }

         boolean $$23 = this.ah < this.r;
         if ($$0 != $$23) {
            this.a($$23);
         }

         if ($$23) {
            return;
         }

         if (this.aE != 0.0F) {
            $$1 += this.aE;
            if ($$1 < 0.5F) {
               this.am();
               return;
            }

            this.a($$1);
         }

         if (this.ah % 5 == 0) {
            this.p.entrySet().removeIf($$0x -> this.ah >= (Integer)$$0x.getValue());
            List<blj> $$24 = Lists.newArrayList();

            for (blj $$25 : this.n.a().a()) {
               $$24.add(new blj($$25.b(), $$25.a($$0x -> $$0x / 4), $$25.d(), $$25.e(), $$25.f()));
            }

            $$24.addAll(this.o);
            if ($$24.isEmpty()) {
               this.p.clear();
            } else {
               List<bmo> $$26 = this.dL().a(bmo.class, this.cH());
               if (!$$26.isEmpty()) {
                  for (bmo $$27 : $$26) {
                     if (!this.p.containsKey($$27) && $$27.fy()) {
                        double $$28 = $$27.dq() - this.dq();
                        double $$29 = $$27.dw() - this.dw();
                        double $$30 = $$28 * $$28 + $$29 * $$29;
                        if ($$30 <= (double)($$1 * $$1)) {
                           this.p.put($$27, this.ah + this.s);

                           for (blj $$31 : $$24) {
                              if ($$31.b().a().a()) {
                                 $$31.b().a().a(this, this.s(), $$27, $$31.d(), 0.5);
                              } else {
                                 $$27.b(new blj($$31), this);
                              }
                           }

                           if (this.v != 0.0F) {
                              $$1 += this.v;
                              if ($$1 < 0.5F) {
                                 this.am();
                                 return;
                              }

                              this.a($$1);
                           }

                           if (this.u != 0) {
                              this.q = this.q + this.u;
                              if (this.q <= 0) {
                                 this.am();
                                 return;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public float o() {
      return this.v;
   }

   public void b(float $$0) {
      this.v = $$0;
   }

   public float p() {
      return this.aE;
   }

   public void c(float $$0) {
      this.aE = $$0;
   }

   public int q() {
      return this.u;
   }

   public void c(int $$0) {
      this.u = $$0;
   }

   public int r() {
      return this.r;
   }

   public void d(int $$0) {
      this.r = $$0;
   }

   public void a(@Nullable bmo $$0) {
      this.aF = $$0;
      this.aG = $$0 == null ? null : $$0.cw();
   }

   @Nullable
   public bmo s() {
      if (this.aF == null && this.aG != null && this.dL() instanceof ane) {
         blw $$0 = ((ane)this.dL()).a(this.aG);
         if ($$0 instanceof bmo) {
            this.aF = (bmo)$$0;
         }
      }

      return this.aF;
   }

   @Override
   protected void a(so $$0) {
      this.ah = $$0.h("Age");
      this.q = $$0.h("Duration");
      this.r = $$0.h("WaitTime");
      this.s = $$0.h("ReapplicationDelay");
      this.u = $$0.h("DurationOnUse");
      this.v = $$0.j("RadiusOnUse");
      this.aE = $$0.j("RadiusPerTick");
      this.a($$0.j("Radius"));
      if ($$0.b("Owner")) {
         this.aG = $$0.a("Owner");
      }

      if ($$0.b("Particle", 8)) {
         try {
            this.a(ep.a(new StringReader($$0.l("Particle")), kd.j.p()));
         } catch (CommandSyntaxException var5) {
            d.warn("Couldn't load custom particle {}", $$0.l("Particle"), var5);
         }
      }

      if ($$0.b("Color", 99)) {
         this.a($$0.h("Color"));
      }

      if ($$0.b("Potion", 8)) {
         this.a(cpg.c($$0));
      }

      if ($$0.b("effects", 9)) {
         su $$2 = $$0.c("effects", 10);
         this.o.clear();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            blj $$4 = blj.b($$2.a($$3));
            if ($$4 != null) {
               this.a($$4);
            }
         }
      }
   }

   @Override
   protected void b(so $$0) {
      $$0.a("Age", this.ah);
      $$0.a("Duration", this.q);
      $$0.a("WaitTime", this.r);
      $$0.a("ReapplicationDelay", this.s);
      $$0.a("DurationOnUse", this.u);
      $$0.a("RadiusOnUse", this.v);
      $$0.a("RadiusPerTick", this.aE);
      $$0.a("Radius", this.h());
      $$0.a("Particle", this.j().a());
      if (this.aG != null) {
         $$0.a("Owner", this.aG);
      }

      if (this.t) {
         $$0.a("Color", this.i());
      }

      Optional<ahg<cpe>> $$1 = this.n.e();
      if ($$1.isPresent() && !this.n.a(cph.b)) {
         $$0.a("Potion", $$1.get().a().toString());
      }

      if (!this.o.isEmpty()) {
         su $$2 = new su();

         for (blj $$3 : this.o) {
            $$2.add($$3.a(new so()));
         }

         $$0.a("effects", $$2);
      }
   }

   @Override
   public void a(agn<?> $$0) {
      if (f.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   public ih<cpe> u() {
      return this.n;
   }

   @Override
   public efe s_() {
      return efe.d;
   }

   @Override
   public blz a(bna $$0) {
      return blz.b(this.h() * 2.0F, 0.5F);
   }
}
