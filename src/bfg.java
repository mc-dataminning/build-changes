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

public class bfg extends bfj implements bgx {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final aby<Float> f = acb.a(bfg.class, aca.d);
   private static final aby<Integer> g = acb.a(bfg.class, aca.b);
   private static final aby<Boolean> h = acb.a(bfg.class, aca.k);
   private static final aby<it> i = acb.a(bfg.class, aca.l);
   private static final float j = 32.0F;
   private static final float k = 0.5F;
   private static final float l = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private chw m = chz.b;
   private final List<bfa> n = Lists.newArrayList();
   private final Map<bfj, Integer> o = Maps.newHashMap();
   private int p = 600;
   private int q = 20;
   private int r = 20;
   private boolean s;
   private int t;
   private float u;
   private float aD;
   @Nullable
   private bfz aE;
   @Nullable
   private UUID aF;

   public bfg(bfn<? extends bfg> $$0, cmm $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public bfg(cmm $$0, double $$1, double $$2, double $$3) {
      this(bfn.c, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   protected void a_() {
      this.aj().a(g, 0);
      this.aj().a(f, 3.0F);
      this.aj().a(h, false);
      this.aj().a(i, iv.v);
   }

   public void a(float $$0) {
      if (!this.dI().B) {
         this.aj().b(f, apa.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void d_() {
      double $$0 = this.dn();
      double $$1 = this.dp();
      double $$2 = this.dt();
      super.d_();
      this.e($$0, $$1, $$2);
   }

   public float h() {
      return this.aj().b(f);
   }

   public void a(chw $$0) {
      this.m = $$0;
      if (!this.s) {
         this.w();
      }
   }

   private void w() {
      if (this.m == chz.b && this.n.isEmpty()) {
         this.aj().b(g, 0);
      } else {
         this.aj().b(g, chy.a(chy.a(this.m, this.n)));
      }
   }

   public void a(bfa $$0) {
      this.n.add($$0);
      if (!this.s) {
         this.w();
      }
   }

   public int i() {
      return this.aj().b(g);
   }

   public void a(int $$0) {
      this.s = true;
      this.aj().b(g, $$0);
   }

   public it j() {
      return this.aj().b(i);
   }

   public void a(it $$0) {
      this.aj().b(i, $$0);
   }

   protected void a(boolean $$0) {
      this.aj().b(h, $$0);
   }

   public boolean k() {
      return this.aj().b(h);
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
      if (this.dI().B) {
         if ($$0 && this.af.h()) {
            return;
         }

         it $$2 = this.j();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = apa.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.af.i() * (float) (Math.PI * 2);
            float $$9 = apa.c(this.af.i()) * $$4;
            double $$10 = this.dn() + (double)(apa.b($$8) * $$9);
            double $$11 = this.dp();
            double $$12 = this.dt() + (double)(apa.a($$8) * $$9);
            double $$14;
            double $$15;
            double $$16;
            if ($$2.b() == iv.v) {
               int $$13 = $$0 && this.af.h() ? 16777215 : this.i();
               $$14 = (double)((float)($$13 >> 16 & 0xFF) / 255.0F);
               $$15 = (double)((float)($$13 >> 8 & 0xFF) / 255.0F);
               $$16 = (double)((float)($$13 & 0xFF) / 255.0F);
            } else if ($$0) {
               $$14 = 0.0;
               $$15 = 0.0;
               $$16 = 0.0;
            } else {
               $$14 = (0.5 - this.af.j()) * 0.15;
               $$15 = 0.01F;
               $$16 = (0.5 - this.af.j()) * 0.15;
            }

            this.dI().b($$2, $$10, $$11, $$12, $$14, $$15, $$16);
         }
      } else {
         if (this.ag >= this.q + this.p) {
            this.ai();
            return;
         }

         boolean $$23 = this.ag < this.q;
         if ($$0 != $$23) {
            this.a($$23);
         }

         if ($$23) {
            return;
         }

         if (this.aD != 0.0F) {
            $$1 += this.aD;
            if ($$1 < 0.5F) {
               this.ai();
               return;
            }

            this.a($$1);
         }

         if (this.ag % 5 == 0) {
            this.o.entrySet().removeIf($$0x -> this.ag >= (Integer)$$0x.getValue());
            List<bfa> $$24 = Lists.newArrayList();

            for (bfa $$25 : this.m.a()) {
               $$24.add(new bfa($$25.c(), $$25.a($$0x -> $$0x / 4), $$25.e(), $$25.f(), $$25.g()));
            }

            $$24.addAll(this.n);
            if ($$24.isEmpty()) {
               this.o.clear();
            } else {
               List<bfz> $$26 = this.dI().a(bfz.class, this.cE());
               if (!$$26.isEmpty()) {
                  for (bfz $$27 : $$26) {
                     if (!this.o.containsKey($$27) && $$27.ft()) {
                        double $$28 = $$27.dn() - this.dn();
                        double $$29 = $$27.dt() - this.dt();
                        double $$30 = $$28 * $$28 + $$29 * $$29;
                        if ($$30 <= (double)($$1 * $$1)) {
                           this.o.put($$27, this.ag + this.r);

                           for (bfa $$31 : $$24) {
                              if ($$31.c().a()) {
                                 $$31.c().a(this, this.s(), $$27, $$31.e(), 0.5);
                              } else {
                                 $$27.b(new bfa($$31), this);
                              }
                           }

                           if (this.u != 0.0F) {
                              $$1 += this.u;
                              if ($$1 < 0.5F) {
                                 this.ai();
                                 return;
                              }

                              this.a($$1);
                           }

                           if (this.t != 0) {
                              this.p = this.p + this.t;
                              if (this.p <= 0) {
                                 this.ai();
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
      return this.aD;
   }

   public void c(float $$0) {
      this.aD = $$0;
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

   public void a(@Nullable bfz $$0) {
      this.aE = $$0;
      this.aF = $$0 == null ? null : $$0.ct();
   }

   @Nullable
   public bfz s() {
      if (this.aE == null && this.aF != null && this.dI() instanceof aif) {
         bfj $$0 = ((aif)this.dI()).a(this.aF);
         if ($$0 instanceof bfz) {
            this.aE = (bfz)$$0;
         }
      }

      return this.aE;
   }

   @Override
   protected void a(qr $$0) {
      this.ag = $$0.h("Age");
      this.p = $$0.h("Duration");
      this.q = $$0.h("WaitTime");
      this.r = $$0.h("ReapplicationDelay");
      this.t = $$0.h("DurationOnUse");
      this.u = $$0.j("RadiusOnUse");
      this.aD = $$0.j("RadiusPerTick");
      this.a($$0.j("Radius"));
      if ($$0.b("Owner")) {
         this.aF = $$0.a("Owner");
      }

      if ($$0.b("Particle", 8)) {
         try {
            this.a(em.a(new StringReader($$0.l("Particle")), jb.k.p()));
         } catch (CommandSyntaxException var5) {
            d.warn("Couldn't load custom particle {}", $$0.l("Particle"), var5);
         }
      }

      if ($$0.b("Color", 99)) {
         this.a($$0.h("Color"));
      }

      if ($$0.b("Potion", 8)) {
         this.a(chy.c($$0));
      }

      if ($$0.b("Effects", 9)) {
         qx $$2 = $$0.c("Effects", 10);
         this.n.clear();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            bfa $$4 = bfa.b($$2.a($$3));
            if ($$4 != null) {
               this.a($$4);
            }
         }
      }
   }

   @Override
   protected void b(qr $$0) {
      $$0.a("Age", this.ag);
      $$0.a("Duration", this.p);
      $$0.a("WaitTime", this.q);
      $$0.a("ReapplicationDelay", this.r);
      $$0.a("DurationOnUse", this.t);
      $$0.a("RadiusOnUse", this.u);
      $$0.a("RadiusPerTick", this.aD);
      $$0.a("Radius", this.h());
      $$0.a("Particle", this.j().a());
      if (this.aF != null) {
         $$0.a("Owner", this.aF);
      }

      if (this.s) {
         $$0.a("Color", this.i());
      }

      if (this.m != chz.b) {
         $$0.a("Potion", jb.j.b(this.m).toString());
      }

      if (!this.n.isEmpty()) {
         qx $$1 = new qx();

         for (bfa $$2 : this.n) {
            $$1.add($$2.a(new qr()));
         }

         $$0.a("Effects", $$1);
      }
   }

   @Override
   public void a(aby<?> $$0) {
      if (f.equals($$0)) {
         this.d_();
      }

      super.a($$0);
   }

   public chw t() {
      return this.m;
   }

   @Override
   public dxj l_() {
      return dxj.d;
   }

   @Override
   public bfk a(bgl $$0) {
      return bfk.b(this.h() * 2.0F, 0.5F);
   }
}
