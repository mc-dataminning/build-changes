import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bit extends biw implements bkj {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final aef<Float> f = aei.a(bit.class, aeh.d);
   private static final aef<Integer> g = aei.a(bit.class, aeh.b);
   private static final aef<Boolean> h = aei.a(bit.class, aeh.k);
   private static final aef<it> i = aei.a(bit.class, aeh.l);
   private static final float j = 32.0F;
   private static final float k = 0.5F;
   private static final float l = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private static final String m = "effects";
   private cli n = cll.b;
   private final List<bij> o = Lists.newArrayList();
   private final Map<biw, Integer> p = Maps.newHashMap();
   private int q = 600;
   private int r = 20;
   private int s = 20;
   private boolean t;
   private int u;
   private float v;
   private float aE;
   @Nullable
   private bjm aF;
   @Nullable
   private UUID aG;

   public bit(bja<? extends bit> $$0, cqb $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public bit(cqb $$0, double $$1, double $$2, double $$3) {
      this(bja.c, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   protected void a_() {
      this.al().a(g, 0);
      this.al().a(f, 3.0F);
      this.al().a(h, false);
      this.al().a(i, iv.v);
   }

   public void a(float $$0) {
      if (!this.dL().B) {
         this.al().b(f, asb.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void i_() {
      double $$0 = this.dq();
      double $$1 = this.ds();
      double $$2 = this.dw();
      super.i_();
      this.e($$0, $$1, $$2);
   }

   public float h() {
      return this.al().b(f);
   }

   public void a(cli $$0) {
      this.n = $$0;
      if (!this.t) {
         this.w();
      }
   }

   private void w() {
      if (this.n == cll.b && this.o.isEmpty()) {
         this.al().b(g, 0);
      } else {
         this.al().b(g, clk.a(clk.a(this.n, this.o)));
      }
   }

   public void a(bij $$0) {
      this.o.add($$0);
      if (!this.t) {
         this.w();
      }
   }

   public int i() {
      return this.al().b(g);
   }

   public void a(int $$0) {
      this.t = true;
      this.al().b(g, $$0);
   }

   public it j() {
      return this.al().b(i);
   }

   public void a(it $$0) {
      this.al().b(i, $$0);
   }

   protected void a(boolean $$0) {
      this.al().b(h, $$0);
   }

   public boolean k() {
      return this.al().b(h);
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

         it $$2 = this.j();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = asb.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ag.i() * (float) (Math.PI * 2);
            float $$9 = asb.c(this.ag.i()) * $$4;
            double $$10 = this.dq() + (double)(asb.b($$8) * $$9);
            double $$11 = this.ds();
            double $$12 = this.dw() + (double)(asb.a($$8) * $$9);
            double $$14;
            double $$15;
            double $$16;
            if ($$2.b() == iv.v) {
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
            this.ak();
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
               this.ak();
               return;
            }

            this.a($$1);
         }

         if (this.ah % 5 == 0) {
            this.p.entrySet().removeIf($$0x -> this.ah >= (Integer)$$0x.getValue());
            List<bij> $$24 = Lists.newArrayList();

            for (bij $$25 : this.n.a()) {
               $$24.add(new bij($$25.c(), $$25.a($$0x -> $$0x / 4), $$25.e(), $$25.f(), $$25.g()));
            }

            $$24.addAll(this.o);
            if ($$24.isEmpty()) {
               this.p.clear();
            } else {
               List<bjm> $$26 = this.dL().a(bjm.class, this.cG());
               if (!$$26.isEmpty()) {
                  for (bjm $$27 : $$26) {
                     if (!this.p.containsKey($$27) && $$27.fy()) {
                        double $$28 = $$27.dq() - this.dq();
                        double $$29 = $$27.dw() - this.dw();
                        double $$30 = $$28 * $$28 + $$29 * $$29;
                        if ($$30 <= (double)($$1 * $$1)) {
                           this.p.put($$27, this.ah + this.s);

                           for (bij $$31 : $$24) {
                              if ($$31.c().a()) {
                                 $$31.c().a(this, this.s(), $$27, $$31.e(), 0.5);
                              } else {
                                 $$27.b(new bij($$31), this);
                              }
                           }

                           if (this.v != 0.0F) {
                              $$1 += this.v;
                              if ($$1 < 0.5F) {
                                 this.ak();
                                 return;
                              }

                              this.a($$1);
                           }

                           if (this.u != 0) {
                              this.q = this.q + this.u;
                              if (this.q <= 0) {
                                 this.ak();
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

   public void a(@Nullable bjm $$0) {
      this.aF = $$0;
      this.aG = $$0 == null ? null : $$0.cv();
   }

   @Nullable
   public bjm s() {
      if (this.aF == null && this.aG != null && this.dL() instanceof akt) {
         biw $$0 = ((akt)this.dL()).a(this.aG);
         if ($$0 instanceof bjm) {
            this.aF = (bjm)$$0;
         }
      }

      return this.aF;
   }

   @Override
   protected void a(qw $$0) {
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
            this.a(eo.a(new StringReader($$0.l("Particle")), jb.k.p()));
         } catch (CommandSyntaxException var5) {
            d.warn("Couldn't load custom particle {}", $$0.l("Particle"), var5);
         }
      }

      if ($$0.b("Color", 99)) {
         this.a($$0.h("Color"));
      }

      if ($$0.b("Potion", 8)) {
         this.a(clk.c($$0));
      }

      if ($$0.b("effects", 9)) {
         rc $$2 = $$0.c("effects", 10);
         this.o.clear();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            bij $$4 = bij.b($$2.a($$3));
            if ($$4 != null) {
               this.a($$4);
            }
         }
      }
   }

   @Override
   protected void b(qw $$0) {
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

      if (this.n != cll.b) {
         $$0.a("Potion", jb.j.b(this.n).toString());
      }

      if (!this.o.isEmpty()) {
         rc $$1 = new rc();

         for (bij $$2 : this.o) {
            $$1.add($$2.a(new qw()));
         }

         $$0.a("effects", $$1);
      }
   }

   @Override
   public void a(aef<?> $$0) {
      if (f.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   public cli t() {
      return this.n;
   }

   @Override
   public eal q_() {
      return eal.d;
   }

   @Override
   public bix a(bjy $$0) {
      return bix.b(this.h() * 2.0F, 0.5F);
   }
}
