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

public class blc extends blf implements bms {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final afz<Float> f = agc.a(blc.class, agb.d);
   private static final afz<Integer> g = agc.a(blc.class, agb.b);
   private static final afz<Boolean> h = agc.a(blc.class, agb.k);
   private static final afz<jt> i = agc.a(blc.class, agb.l);
   private static final float j = 32.0F;
   private static final float k = 0.5F;
   private static final float l = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private static final String m = "effects";
   private coe n = coh.b;
   private final List<bks> o = Lists.newArrayList();
   private final Map<blf, Integer> p = Maps.newHashMap();
   private int q = 600;
   private int r = 20;
   private int s = 20;
   private boolean t;
   private int u;
   private float v;
   private float aE;
   @Nullable
   private blv aF;
   @Nullable
   private UUID aG;

   public blc(blj<? extends blc> $$0, csy $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public blc(csy $$0, double $$1, double $$2, double $$3) {
      this(blj.c, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void c_() {
      this.an().a(g, 0);
      this.an().a(f, 3.0F);
      this.an().a(h, false);
      this.an().a(i, jv.v);
   }

   public void a(float $$0) {
      if (!this.dM().B) {
         this.an().b(f, aty.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void k_() {
      double $$0 = this.dr();
      double $$1 = this.dt();
      double $$2 = this.dx();
      super.k_();
      this.a_($$0, $$1, $$2);
   }

   public float h() {
      return this.an().b(f);
   }

   public void a(coe $$0) {
      this.n = $$0;
      if (!this.t) {
         this.x();
      }
   }

   private void x() {
      if (this.n == coh.b && this.o.isEmpty()) {
         this.an().b(g, 0);
      } else {
         this.an().b(g, cog.a(cog.a(this.n, this.o)));
      }
   }

   public void a(bks $$0) {
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

   public jt j() {
      return this.an().b(i);
   }

   public void a(jt $$0) {
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
      if (this.dM().B) {
         if ($$0 && this.ag.h()) {
            return;
         }

         jt $$2 = this.j();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = aty.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ag.i() * (float) (Math.PI * 2);
            float $$9 = aty.c(this.ag.i()) * $$4;
            double $$10 = this.dr() + (double)(aty.b($$8) * $$9);
            double $$11 = this.dt();
            double $$12 = this.dx() + (double)(aty.a($$8) * $$9);
            double $$14;
            double $$15;
            double $$16;
            if ($$2.b() == jv.v) {
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

            this.dM().b($$2, $$10, $$11, $$12, $$14, $$15, $$16);
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
            List<bks> $$24 = Lists.newArrayList();

            for (bks $$25 : this.n.a()) {
               $$24.add(new bks($$25.c(), $$25.a($$0x -> $$0x / 4), $$25.e(), $$25.f(), $$25.g()));
            }

            $$24.addAll(this.o);
            if ($$24.isEmpty()) {
               this.p.clear();
            } else {
               List<blv> $$26 = this.dM().a(blv.class, this.cH());
               if (!$$26.isEmpty()) {
                  for (blv $$27 : $$26) {
                     if (!this.p.containsKey($$27) && $$27.fy()) {
                        double $$28 = $$27.dr() - this.dr();
                        double $$29 = $$27.dx() - this.dx();
                        double $$30 = $$28 * $$28 + $$29 * $$29;
                        if ($$30 <= (double)($$1 * $$1)) {
                           this.p.put($$27, this.ah + this.s);

                           for (bks $$31 : $$24) {
                              if ($$31.c().a()) {
                                 $$31.c().a(this, this.s(), $$27, $$31.e(), 0.5);
                              } else {
                                 $$27.b(new bks($$31), this);
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

   public void a(@Nullable blv $$0) {
      this.aF = $$0;
      this.aG = $$0 == null ? null : $$0.cw();
   }

   @Nullable
   public blv s() {
      if (this.aF == null && this.aG != null && this.dM() instanceof amp) {
         blf $$0 = ((amp)this.dM()).a(this.aG);
         if ($$0 instanceof blv) {
            this.aF = (blv)$$0;
         }
      }

      return this.aF;
   }

   @Override
   protected void a(sj $$0) {
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
            this.a(eo.a(new StringReader($$0.l("Particle")), kb.j.p()));
         } catch (CommandSyntaxException var5) {
            d.warn("Couldn't load custom particle {}", $$0.l("Particle"), var5);
         }
      }

      if ($$0.b("Color", 99)) {
         this.a($$0.h("Color"));
      }

      if ($$0.b("Potion", 8)) {
         this.a(cog.c($$0));
      }

      if ($$0.b("effects", 9)) {
         sp $$2 = $$0.c("effects", 10);
         this.o.clear();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            bks $$4 = bks.b($$2.a($$3));
            if ($$4 != null) {
               this.a($$4);
            }
         }
      }
   }

   @Override
   protected void b(sj $$0) {
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

      if (this.n != coh.b) {
         $$0.a("Potion", kb.i.b(this.n).toString());
      }

      if (!this.o.isEmpty()) {
         sp $$1 = new sp();

         for (bks $$2 : this.o) {
            $$1.add($$2.a(new sj()));
         }

         $$0.a("effects", $$1);
      }
   }

   @Override
   public void a(afz<?> $$0) {
      if (f.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   public coe u() {
      return this.n;
   }

   @Override
   public eee s_() {
      return eee.d;
   }

   @Override
   public blg a(bmh $$0) {
      return blg.b(this.h() * 2.0F, 0.5F);
   }
}
