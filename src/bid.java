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

public class bid extends big implements bju {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final adx<Float> f = aea.a(bid.class, adz.d);
   private static final adx<Integer> g = aea.a(bid.class, adz.b);
   private static final adx<Boolean> h = aea.a(bid.class, adz.k);
   private static final adx<iu> i = aea.a(bid.class, adz.l);
   private static final float j = 32.0F;
   private static final float k = 0.5F;
   private static final float l = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private ckt m = ckw.b;
   private final List<bht> n = Lists.newArrayList();
   private final Map<big, Integer> o = Maps.newHashMap();
   private int p = 600;
   private int q = 20;
   private int r = 20;
   private boolean s;
   private int t;
   private float u;
   private float v;
   @Nullable
   private biw aE;
   @Nullable
   private UUID aF;

   public bid(bik<? extends bid> $$0, cpk $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public bid(cpk $$0, double $$1, double $$2, double $$3) {
      this(bik.c, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   protected void a_() {
      this.al().a(g, 0);
      this.al().a(f, 3.0F);
      this.al().a(h, false);
      this.al().a(i, iw.v);
   }

   public void a(float $$0) {
      if (!this.dK().B) {
         this.al().b(f, aro.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void e_() {
      double $$0 = this.dp();
      double $$1 = this.dr();
      double $$2 = this.dv();
      super.e_();
      this.e($$0, $$1, $$2);
   }

   public float h() {
      return this.al().b(f);
   }

   public void a(ckt $$0) {
      this.m = $$0;
      if (!this.s) {
         this.w();
      }
   }

   private void w() {
      if (this.m == ckw.b && this.n.isEmpty()) {
         this.al().b(g, 0);
      } else {
         this.al().b(g, ckv.a(ckv.a(this.m, this.n)));
      }
   }

   public void a(bht $$0) {
      this.n.add($$0);
      if (!this.s) {
         this.w();
      }
   }

   public int i() {
      return this.al().b(g);
   }

   public void a(int $$0) {
      this.s = true;
      this.al().b(g, $$0);
   }

   public iu j() {
      return this.al().b(i);
   }

   public void a(iu $$0) {
      this.al().b(i, $$0);
   }

   protected void a(boolean $$0) {
      this.al().b(h, $$0);
   }

   public boolean k() {
      return this.al().b(h);
   }

   public int m() {
      return this.p;
   }

   public void b(int $$0) {
      this.p = $$0;
   }

   @Override
   public void l() {
      super.l();
      boolean $$0 = this.k();
      float $$1 = this.h();
      if (this.dK().B) {
         if ($$0 && this.ag.h()) {
            return;
         }

         iu $$2 = this.j();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = aro.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ag.i() * (float) (Math.PI * 2);
            float $$9 = aro.c(this.ag.i()) * $$4;
            double $$10 = this.dp() + (double)(aro.b($$8) * $$9);
            double $$11 = this.dr();
            double $$12 = this.dv() + (double)(aro.a($$8) * $$9);
            double $$14;
            double $$15;
            double $$16;
            if ($$2.b() == iw.v) {
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

            this.dK().b($$2, $$10, $$11, $$12, $$14, $$15, $$16);
         }
      } else {
         if (this.ah >= this.q + this.p) {
            this.ak();
            return;
         }

         boolean $$23 = this.ah < this.q;
         if ($$0 != $$23) {
            this.a($$23);
         }

         if ($$23) {
            return;
         }

         if (this.v != 0.0F) {
            $$1 += this.v;
            if ($$1 < 0.5F) {
               this.ak();
               return;
            }

            this.a($$1);
         }

         if (this.ah % 5 == 0) {
            this.o.entrySet().removeIf($$0x -> this.ah >= (Integer)$$0x.getValue());
            List<bht> $$24 = Lists.newArrayList();

            for (bht $$25 : this.m.a()) {
               $$24.add(new bht($$25.c(), $$25.a($$0x -> $$0x / 4), $$25.e(), $$25.f(), $$25.g()));
            }

            $$24.addAll(this.n);
            if ($$24.isEmpty()) {
               this.o.clear();
            } else {
               List<biw> $$26 = this.dK().a(biw.class, this.cG());
               if (!$$26.isEmpty()) {
                  for (biw $$27 : $$26) {
                     if (!this.o.containsKey($$27) && $$27.fw()) {
                        double $$28 = $$27.dp() - this.dp();
                        double $$29 = $$27.dv() - this.dv();
                        double $$30 = $$28 * $$28 + $$29 * $$29;
                        if ($$30 <= (double)($$1 * $$1)) {
                           this.o.put($$27, this.ah + this.r);

                           for (bht $$31 : $$24) {
                              if ($$31.c().a()) {
                                 $$31.c().a(this, this.s(), $$27, $$31.e(), 0.5);
                              } else {
                                 $$27.b(new bht($$31), this);
                              }
                           }

                           if (this.u != 0.0F) {
                              $$1 += this.u;
                              if ($$1 < 0.5F) {
                                 this.ak();
                                 return;
                              }

                              this.a($$1);
                           }

                           if (this.t != 0) {
                              this.p = this.p + this.t;
                              if (this.p <= 0) {
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
      return this.u;
   }

   public void b(float $$0) {
      this.u = $$0;
   }

   public float p() {
      return this.v;
   }

   public void c(float $$0) {
      this.v = $$0;
   }

   public int q() {
      return this.t;
   }

   public void c(int $$0) {
      this.t = $$0;
   }

   public int r() {
      return this.q;
   }

   public void d(int $$0) {
      this.q = $$0;
   }

   public void a(@Nullable biw $$0) {
      this.aE = $$0;
      this.aF = $$0 == null ? null : $$0.cv();
   }

   @Nullable
   public biw s() {
      if (this.aE == null && this.aF != null && this.dK() instanceof aki) {
         big $$0 = ((aki)this.dK()).a(this.aF);
         if ($$0 instanceof biw) {
            this.aE = (biw)$$0;
         }
      }

      return this.aE;
   }

   @Override
   protected void a(qs $$0) {
      this.ah = $$0.h("Age");
      this.p = $$0.h("Duration");
      this.q = $$0.h("WaitTime");
      this.r = $$0.h("ReapplicationDelay");
      this.t = $$0.h("DurationOnUse");
      this.u = $$0.j("RadiusOnUse");
      this.v = $$0.j("RadiusPerTick");
      this.a($$0.j("Radius"));
      if ($$0.b("Owner")) {
         this.aF = $$0.a("Owner");
      }

      if ($$0.b("Particle", 8)) {
         try {
            this.a(en.a(new StringReader($$0.l("Particle")), jc.k.p()));
         } catch (CommandSyntaxException var5) {
            d.warn("Couldn't load custom particle {}", $$0.l("Particle"), var5);
         }
      }

      if ($$0.b("Color", 99)) {
         this.a($$0.h("Color"));
      }

      if ($$0.b("Potion", 8)) {
         this.a(ckv.c($$0));
      }

      if ($$0.b("Effects", 9)) {
         qy $$2 = $$0.c("Effects", 10);
         this.n.clear();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            bht $$4 = bht.b($$2.a($$3));
            if ($$4 != null) {
               this.a($$4);
            }
         }
      }
   }

   @Override
   protected void b(qs $$0) {
      $$0.a("Age", this.ah);
      $$0.a("Duration", this.p);
      $$0.a("WaitTime", this.q);
      $$0.a("ReapplicationDelay", this.r);
      $$0.a("DurationOnUse", this.t);
      $$0.a("RadiusOnUse", this.u);
      $$0.a("RadiusPerTick", this.v);
      $$0.a("Radius", this.h());
      $$0.a("Particle", this.j().a());
      if (this.aF != null) {
         $$0.a("Owner", this.aF);
      }

      if (this.s) {
         $$0.a("Color", this.i());
      }

      if (this.m != ckw.b) {
         $$0.a("Potion", jc.j.b(this.m).toString());
      }

      if (!this.n.isEmpty()) {
         qy $$1 = new qy();

         for (bht $$2 : this.n) {
            $$1.add($$2.a(new qs()));
         }

         $$0.a("Effects", $$1);
      }
   }

   @Override
   public void a(adx<?> $$0) {
      if (f.equals($$0)) {
         this.e_();
      }

      super.a($$0);
   }

   public ckt t() {
      return this.m;
   }

   @Override
   public eag l_() {
      return eag.d;
   }

   @Override
   public bih a(bji $$0) {
      return bih.b(this.h() * 2.0F, 0.5F);
   }
}
