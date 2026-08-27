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

public class bot extends bow implements bqm {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final aim<Float> f = aiq.a(bot.class, aio.d);
   private static final aim<Integer> g = aiq.a(bot.class, aio.b);
   private static final aim<Boolean> h = aiq.a(bot.class, aio.k);
   private static final aim<ka> i = aiq.a(bot.class, aio.l);
   private static final float j = 32.0F;
   private static final float k = 0.5F;
   private static final float l = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private static final String m = "effects";
   private il<csh> n = csk.b;
   private final List<boj> o = Lists.newArrayList();
   private final Map<bow, Integer> p = Maps.newHashMap();
   private int q = 600;
   private int r = 20;
   private int s = 20;
   private boolean t;
   private int u;
   private float v;
   private float aE;
   @Nullable
   private bpo aF;
   @Nullable
   private UUID aG;

   public bot(bpc<? extends bot> $$0, cwz $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public bot(cwz $$0, double $$1, double $$2, double $$3) {
      this(bpc.c, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(g, 0);
      $$0.a(f, 3.0F);
      $$0.a(h, false);
      $$0.a(i, kc.v);
   }

   public void a(float $$0) {
      if (!this.dM().B) {
         this.an().a(f, aww.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void j_() {
      double $$0 = this.dr();
      double $$1 = this.dt();
      double $$2 = this.dx();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   public float g() {
      return this.an().a(f);
   }

   public void a(il<csh> $$0) {
      this.n = $$0;
      if (!this.t) {
         this.w();
      }
   }

   private void w() {
      if (this.n.a(csk.b) && this.o.isEmpty()) {
         this.an().a(g, 0);
      } else {
         this.an().a(g, csj.a(csj.a(this.n, this.o)));
      }
   }

   public void a(boj $$0) {
      this.o.add($$0);
      if (!this.t) {
         this.w();
      }
   }

   public int h() {
      return this.an().a(g);
   }

   public void a(int $$0) {
      this.t = true;
      this.an().a(g, $$0);
   }

   public ka i() {
      return this.an().a(i);
   }

   public void a(ka $$0) {
      this.an().a(i, $$0);
   }

   protected void a(boolean $$0) {
      this.an().a(h, $$0);
   }

   public boolean j() {
      return this.an().a(h);
   }

   public int k() {
      return this.q;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   @Override
   public void l() {
      super.l();
      boolean $$0 = this.j();
      float $$1 = this.g();
      if (this.dM().B) {
         if ($$0 && this.ag.h()) {
            return;
         }

         ka $$2 = this.i();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = aww.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ag.i() * (float) (Math.PI * 2);
            float $$9 = aww.c(this.ag.i()) * $$4;
            double $$10 = this.dr() + (double)(aww.b($$8) * $$9);
            double $$11 = this.dt();
            double $$12 = this.dx() + (double)(aww.a($$8) * $$9);
            double $$14;
            double $$15;
            double $$16;
            if ($$2.a() == kc.v) {
               int $$13 = $$0 && this.ag.h() ? 16777215 : this.h();
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
            List<boj> $$24 = Lists.newArrayList();

            for (boj $$25 : this.n.a().a()) {
               $$24.add(new boj($$25.b(), $$25.a($$0x -> $$0x / 4), $$25.d(), $$25.e(), $$25.f()));
            }

            $$24.addAll(this.o);
            if ($$24.isEmpty()) {
               this.p.clear();
            } else {
               List<bpo> $$26 = this.dM().a(bpo.class, this.cH());
               if (!$$26.isEmpty()) {
                  for (bpo $$27 : $$26) {
                     if (!this.p.containsKey($$27) && $$27.fD()) {
                        double $$28 = $$27.dr() - this.dr();
                        double $$29 = $$27.dx() - this.dx();
                        double $$30 = $$28 * $$28 + $$29 * $$29;
                        if ($$30 <= (double)($$1 * $$1)) {
                           this.p.put($$27, this.ah + this.s);

                           for (boj $$31 : $$24) {
                              if ($$31.b().a().a()) {
                                 $$31.b().a().a(this, this.r(), $$27, $$31.d(), 0.5);
                              } else {
                                 $$27.b(new boj($$31), this);
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

   public float m() {
      return this.v;
   }

   public void b(float $$0) {
      this.v = $$0;
   }

   public float o() {
      return this.aE;
   }

   public void c(float $$0) {
      this.aE = $$0;
   }

   public int p() {
      return this.u;
   }

   public void c(int $$0) {
      this.u = $$0;
   }

   public int q() {
      return this.r;
   }

   public void d(int $$0) {
      this.r = $$0;
   }

   public void a(@Nullable bpo $$0) {
      this.aF = $$0;
      this.aG = $$0 == null ? null : $$0.cw();
   }

   @Nullable
   public bpo r() {
      if (this.aF == null && this.aG != null && this.dM() instanceof apf) {
         bow $$0 = ((apf)this.dM()).a(this.aG);
         if ($$0 instanceof bpo) {
            this.aF = (bpo)$$0;
         }
      }

      return this.aF;
   }

   @Override
   protected void a(ta $$0) {
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
            this.a(er.a(new StringReader($$0.l("Particle")), this.dO()));
         } catch (CommandSyntaxException var5) {
            d.warn("Couldn't load custom particle {}", $$0.l("Particle"), var5);
         }
      }

      if ($$0.b("Color", 99)) {
         this.a($$0.h("Color"));
      }

      if ($$0.b("Potion", 8)) {
         this.a(csj.c($$0));
      }

      if ($$0.b("effects", 9)) {
         tg $$2 = $$0.c("effects", 10);
         this.o.clear();

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            boj $$4 = boj.a($$2.a($$3));
            if ($$4 != null) {
               this.a($$4);
            }
         }
      }
   }

   @Override
   protected void b(ta $$0) {
      $$0.a("Age", this.ah);
      $$0.a("Duration", this.q);
      $$0.a("WaitTime", this.r);
      $$0.a("ReapplicationDelay", this.s);
      $$0.a("DurationOnUse", this.u);
      $$0.a("RadiusOnUse", this.v);
      $$0.a("RadiusPerTick", this.aE);
      $$0.a("Radius", this.g());
      $$0.a("Particle", this.i().a(this.dO()));
      if (this.aG != null) {
         $$0.a("Owner", this.aG);
      }

      if (this.t) {
         $$0.a("Color", this.h());
      }

      Optional<ajg<csh>> $$1 = this.n.e();
      if ($$1.isPresent() && !this.n.a(csk.b)) {
         $$0.a("Potion", $$1.get().a().toString());
      }

      if (!this.o.isEmpty()) {
         tg $$2 = new tg();

         for (boj $$3 : this.o) {
            $$2.add($$3.i());
         }

         $$0.a("effects", $$2);
      }
   }

   @Override
   public void a(aim<?> $$0) {
      if (f.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   public il<csh> s() {
      return this.n;
   }

   @Override
   public eis r_() {
      return eis.d;
   }

   @Override
   public boz a(bpz $$0) {
      return boz.b(this.g() * 2.0F, 0.5F);
   }
}
