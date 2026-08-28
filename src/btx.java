import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class btx extends bue implements bvz {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final akl<Float> f = akp.a(btx.class, akn.d);
   private static final akl<Boolean> g = akp.a(btx.class, akn.k);
   private static final akl<lp> h = akp.a(btx.class, akn.l);
   private static final float i = 32.0F;
   private static final float j = 0.5F;
   private static final float k = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private cya l = cya.a;
   private final Map<bue, Integer> m = Maps.newHashMap();
   private int n = 600;
   private int o = 20;
   private int p = 20;
   private int q;
   private float r;
   private float s;
   @Nullable
   private bva t;
   @Nullable
   private UUID u;

   public btx(bul<? extends btx> $$0, dfb $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public btx(dfb $$0, double $$1, double $$2, double $$3) {
      this(bul.b, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(f, 3.0F);
      $$0.a(g, false);
      $$0.a(h, lk.a(lr.u, -1));
   }

   public void a(float $$0) {
      if (!this.dX().C) {
         this.aw().a(f, azk.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void j_() {
      double $$0 = this.dC();
      double $$1 = this.dE();
      double $$2 = this.dI();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   public float g() {
      return this.aw().a(f);
   }

   public void a(cya $$0) {
      this.l = $$0;
      this.t();
   }

   private void t() {
      lp $$0 = this.am.a(h);
      if ($$0 instanceof lk $$1) {
         int $$2 = this.l.equals(cya.a) ? 0 : this.l.b();
         this.am.a(h, lk.a($$1.a(), axv.f($$2)));
      }
   }

   public void a(btj $$0) {
      this.a(this.l.a($$0));
   }

   public lp h() {
      return this.aw().a(h);
   }

   public void a(lp $$0) {
      this.aw().a(h, $$0);
   }

   protected void a(boolean $$0) {
      this.aw().a(g, $$0);
   }

   public boolean i() {
      return this.aw().a(g);
   }

   public int j() {
      return this.n;
   }

   public void a(int $$0) {
      this.n = $$0;
   }

   @Override
   public void l() {
      super.l();
      boolean $$0 = this.i();
      float $$1 = this.g();
      if (this.dX().C) {
         if ($$0 && this.af.h()) {
            return;
         }

         lp $$2 = this.h();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = azk.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.af.i() * (float) (Math.PI * 2);
            float $$9 = azk.c(this.af.i()) * $$4;
            double $$10 = this.dC() + (double)(azk.b($$8) * $$9);
            double $$11 = this.dE();
            double $$12 = this.dI() + (double)(azk.a($$8) * $$9);
            if ($$2.a() == lr.u) {
               if ($$0 && this.af.h()) {
                  this.dX().b(lk.a(lr.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
               } else {
                  this.dX().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
               }
            } else if ($$0) {
               this.dX().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
            } else {
               this.dX().b($$2, $$10, $$11, $$12, (0.5 - this.af.j()) * 0.15, 0.01F, (0.5 - this.af.j()) * 0.15);
            }
         }
      } else {
         if (this.ag >= this.o + this.n) {
            this.av();
            return;
         }

         boolean $$13 = this.ag < this.o;
         if ($$0 != $$13) {
            this.a($$13);
         }

         if ($$13) {
            return;
         }

         if (this.s != 0.0F) {
            $$1 += this.s;
            if ($$1 < 0.5F) {
               this.av();
               return;
            }

            this.a($$1);
         }

         if (this.ag % 5 == 0) {
            this.m.entrySet().removeIf($$0x -> this.ag >= (Integer)$$0x.getValue());
            if (!this.l.c()) {
               this.m.clear();
            } else {
               List<btj> $$14 = Lists.newArrayList();
               if (this.l.e().isPresent()) {
                  for (btj $$15 : this.l.e().get().a().a()) {
                     $$14.add(new btj($$15.c(), $$15.a($$0x -> $$0x / 4), $$15.e(), $$15.f(), $$15.g()));
                  }
               }

               $$14.addAll(this.l.d());
               List<bva> $$16 = this.dX().a(bva.class, this.cS());
               if (!$$16.isEmpty()) {
                  for (bva $$17 : $$16) {
                     if (!this.m.containsKey($$17) && $$17.fN() && !$$14.stream().noneMatch($$17::b)) {
                        double $$18 = $$17.dC() - this.dC();
                        double $$19 = $$17.dI() - this.dI();
                        double $$20 = $$18 * $$18 + $$19 * $$19;
                        if ($$20 <= (double)($$1 * $$1)) {
                           this.m.put($$17, this.ag + this.p);

                           for (btj $$21 : $$14) {
                              if ($$21.c().a().a()) {
                                 $$21.c().a().a(this, this.q(), $$17, $$21.e(), 0.5);
                              } else {
                                 $$17.b(new btj($$21), this);
                              }
                           }

                           if (this.r != 0.0F) {
                              $$1 += this.r;
                              if ($$1 < 0.5F) {
                                 this.av();
                                 return;
                              }

                              this.a($$1);
                           }

                           if (this.q != 0) {
                              this.n = this.n + this.q;
                              if (this.n <= 0) {
                                 this.av();
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

   public float k() {
      return this.r;
   }

   public void b(float $$0) {
      this.r = $$0;
   }

   public float m() {
      return this.s;
   }

   public void c(float $$0) {
      this.s = $$0;
   }

   public int o() {
      return this.q;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   public int p() {
      return this.o;
   }

   public void c(int $$0) {
      this.o = $$0;
   }

   public void a(@Nullable bva $$0) {
      this.t = $$0;
      this.u = $$0 == null ? null : $$0.cH();
   }

   @Nullable
   public bva q() {
      if (this.t == null && this.u != null && this.dX() instanceof arn) {
         bue $$0 = ((arn)this.dX()).a(this.u);
         if ($$0 instanceof bva) {
            this.t = (bva)$$0;
         }
      }

      return this.t;
   }

   @Override
   protected void a(uk $$0) {
      this.ag = $$0.h("Age");
      this.n = $$0.h("Duration");
      this.o = $$0.h("WaitTime");
      this.p = $$0.h("ReapplicationDelay");
      this.q = $$0.h("DurationOnUse");
      this.r = $$0.j("RadiusOnUse");
      this.s = $$0.j("RadiusPerTick");
      this.a($$0.j("Radius"));
      if ($$0.b("Owner")) {
         this.u = $$0.a("Owner");
      }

      alg<vh> $$1 = this.dZ().a(uy.a);
      if ($$0.b("Particle", 10)) {
         lr.bf
            .parse($$1, $$0.c("Particle"))
            .resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud particle options: '{}'", $$0x))
            .ifPresent(this::a);
      }

      if ($$0.e("potion_contents")) {
         cya.b.parse($$1, $$0.c("potion_contents")).resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud potions: '{}'", $$0x)).ifPresent(this::a);
      }
   }

   @Override
   protected void b(uk $$0) {
      $$0.a("Age", this.ag);
      $$0.a("Duration", this.n);
      $$0.a("WaitTime", this.o);
      $$0.a("ReapplicationDelay", this.p);
      $$0.a("DurationOnUse", this.q);
      $$0.a("RadiusOnUse", this.r);
      $$0.a("RadiusPerTick", this.s);
      $$0.a("Radius", this.g());
      alg<vh> $$1 = this.dZ().a(uy.a);
      $$0.a("Particle", (vh)lr.bf.encodeStart($$1, this.h()).getOrThrow());
      if (this.u != null) {
         $$0.a("Owner", this.u);
      }

      if (!this.l.equals(cya.a)) {
         vh $$2 = (vh)cya.b.encodeStart($$1, this.l).getOrThrow();
         $$0.a("potion_contents", $$2);
      }
   }

   @Override
   public void a(akl<?> $$0) {
      if (f.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public erp k_() {
      return erp.d;
   }

   @Override
   public buh a(bvm $$0) {
      return buh.b(this.g() * 2.0F, 0.5F);
   }
}
