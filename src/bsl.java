import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bsl extends bsp implements buj {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final akg<Float> f = akk.a(bsl.class, aki.d);
   private static final akg<Boolean> g = akk.a(bsl.class, aki.k);
   private static final akg<lh> h = akk.a(bsl.class, aki.l);
   private static final float i = 32.0F;
   private static final float j = 0.5F;
   private static final float k = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private cwl l = cwl.a;
   private final Map<bsp, Integer> m = Maps.newHashMap();
   private int n = 600;
   private int o = 20;
   private int p = 20;
   private int q;
   private float r;
   private float s;
   @Nullable
   private btk t;
   @Nullable
   private UUID u;

   public bsl(bsv<? extends bsl> $$0, dbt $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public bsl(dbt $$0, double $$1, double $$2, double $$3) {
      this(bsv.b, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(f, 3.0F);
      $$0.a(g, false);
      $$0.a(h, lb.a(lj.u, -1));
   }

   public void a(float $$0) {
      if (!this.dP().B) {
         this.ap().a(f, ayu.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void j_() {
      double $$0 = this.du();
      double $$1 = this.dw();
      double $$2 = this.dA();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   public float g() {
      return this.ap().a(f);
   }

   public void a(cwl $$0) {
      this.l = $$0;
      this.u();
   }

   private void u() {
      lh $$0 = this.ao.a(h);
      if ($$0 instanceof lb $$1) {
         int $$2 = this.l.equals(cwl.a) ? 0 : this.l.b();
         this.ao.a(h, lb.a($$1.a(), aye.b.e($$2)));
      }
   }

   public void a(brx $$0) {
      this.a(this.l.a($$0));
   }

   public lh h() {
      return this.ap().a(h);
   }

   public void a(lh $$0) {
      this.ap().a(h, $$0);
   }

   protected void a(boolean $$0) {
      this.ap().a(g, $$0);
   }

   public boolean i() {
      return this.ap().a(g);
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
      if (this.dP().B) {
         if ($$0 && this.ah.h()) {
            return;
         }

         lh $$2 = this.h();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = ayu.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ah.i() * (float) (Math.PI * 2);
            float $$9 = ayu.c(this.ah.i()) * $$4;
            double $$10 = this.du() + (double)(ayu.b($$8) * $$9);
            double $$11 = this.dw();
            double $$12 = this.dA() + (double)(ayu.a($$8) * $$9);
            if ($$2.a() == lj.u) {
               if ($$0 && this.ah.h()) {
                  this.dP().b(lb.a(lj.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
               } else {
                  this.dP().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
               }
            } else if ($$0) {
               this.dP().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
            } else {
               this.dP().b($$2, $$10, $$11, $$12, (0.5 - this.ah.j()) * 0.15, 0.01F, (0.5 - this.ah.j()) * 0.15);
            }
         }
      } else {
         if (this.ai >= this.o + this.n) {
            this.ao();
            return;
         }

         boolean $$13 = this.ai < this.o;
         if ($$0 != $$13) {
            this.a($$13);
         }

         if ($$13) {
            return;
         }

         if (this.s != 0.0F) {
            $$1 += this.s;
            if ($$1 < 0.5F) {
               this.ao();
               return;
            }

            this.a($$1);
         }

         if (this.ai % 5 == 0) {
            this.m.entrySet().removeIf($$0x -> this.ai >= (Integer)$$0x.getValue());
            if (!this.l.c()) {
               this.m.clear();
            } else {
               List<brx> $$14 = Lists.newArrayList();
               if (this.l.e().isPresent()) {
                  for (brx $$15 : this.l.e().get().a().a()) {
                     $$14.add(new brx($$15.c(), $$15.a($$0x -> $$0x / 4), $$15.e(), $$15.f(), $$15.g()));
                  }
               }

               $$14.addAll(this.l.d());
               List<btk> $$16 = this.dP().a(btk.class, this.cK());
               if (!$$16.isEmpty()) {
                  for (btk $$17 : $$16) {
                     if (!this.m.containsKey($$17) && $$17.fG()) {
                        double $$18 = $$17.du() - this.du();
                        double $$19 = $$17.dA() - this.dA();
                        double $$20 = $$18 * $$18 + $$19 * $$19;
                        if ($$20 <= (double)($$1 * $$1)) {
                           this.m.put($$17, this.ai + this.p);

                           for (brx $$21 : $$14) {
                              if ($$21.c().a().a()) {
                                 $$21.c().a().a(this, this.q(), $$17, $$21.e(), 0.5);
                              } else {
                                 $$17.b(new brx($$21), this);
                              }
                           }

                           if (this.r != 0.0F) {
                              $$1 += this.r;
                              if ($$1 < 0.5F) {
                                 this.ao();
                                 return;
                              }

                              this.a($$1);
                           }

                           if (this.q != 0) {
                              this.n = this.n + this.q;
                              if (this.n <= 0) {
                                 this.ao();
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

   public void a(@Nullable btk $$0) {
      this.t = $$0;
      this.u = $$0 == null ? null : $$0.cz();
   }

   @Nullable
   public btk q() {
      if (this.t == null && this.u != null && this.dP() instanceof arb) {
         bsp $$0 = ((arb)this.dP()).a(this.u);
         if ($$0 instanceof btk) {
            this.t = (btk)$$0;
         }
      }

      return this.t;
   }

   @Override
   protected void a(ur $$0) {
      this.ai = $$0.h("Age");
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

      akz<vo> $$1 = this.dR().a(vf.a);
      if ($$0.b("Particle", 10)) {
         lj.bf
            .parse($$1, $$0.c("Particle"))
            .resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud particle options: '{}'", $$0x))
            .ifPresent(this::a);
      }

      if ($$0.e("potion_contents")) {
         cwl.b.parse($$1, $$0.c("potion_contents")).resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud potions: '{}'", $$0x)).ifPresent(this::a);
      }
   }

   @Override
   protected void b(ur $$0) {
      $$0.a("Age", this.ai);
      $$0.a("Duration", this.n);
      $$0.a("WaitTime", this.o);
      $$0.a("ReapplicationDelay", this.p);
      $$0.a("DurationOnUse", this.q);
      $$0.a("RadiusOnUse", this.r);
      $$0.a("RadiusPerTick", this.s);
      $$0.a("Radius", this.g());
      akz<vo> $$1 = this.dR().a(vf.a);
      $$0.a("Particle", (vo)lj.bf.encodeStart($$1, this.h()).getOrThrow());
      if (this.u != null) {
         $$0.a("Owner", this.u);
      }

      if (!this.l.equals(cwl.a)) {
         vo $$2 = (vo)cwl.b.encodeStart($$1, this.l).getOrThrow();
         $$0.a("potion_contents", $$2);
      }
   }

   @Override
   public void a(akg<?> $$0) {
      if (f.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public env k_() {
      return env.d;
   }

   @Override
   public bss a(btw $$0) {
      return bss.b(this.g() * 2.0F, 0.5F);
   }
}
