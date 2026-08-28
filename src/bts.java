import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bts extends btz implements bvu {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final akk<Float> f = ako.a(bts.class, akm.d);
   private static final akk<Boolean> g = ako.a(bts.class, akm.k);
   private static final akk<lo> h = ako.a(bts.class, akm.l);
   private static final float i = 32.0F;
   private static final float j = 0.5F;
   private static final float k = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private cxw l = cxw.a;
   private final Map<btz, Integer> m = Maps.newHashMap();
   private int n = 600;
   private int o = 20;
   private int p = 20;
   private int q;
   private float r;
   private float s;
   @Nullable
   private buv t;
   @Nullable
   private UUID u;

   public bts(bug<? extends bts> $$0, dev $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public bts(dev $$0, double $$1, double $$2, double $$3) {
      this(bug.b, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(f, 3.0F);
      $$0.a(g, false);
      $$0.a(h, lj.a(lq.u, -1));
   }

   public void a(float $$0) {
      if (!this.dX().C) {
         this.av().a(f, azj.a($$0, 0.0F, 32.0F));
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
      return this.av().a(f);
   }

   public void a(cxw $$0) {
      this.l = $$0;
      this.t();
   }

   private void t() {
      lo $$0 = this.am.a(h);
      if ($$0 instanceof lj $$1) {
         int $$2 = this.l.equals(cxw.a) ? 0 : this.l.b();
         this.am.a(h, lj.a($$1.a(), axu.f($$2)));
      }
   }

   public void a(bte $$0) {
      this.a(this.l.a($$0));
   }

   public lo h() {
      return this.av().a(h);
   }

   public void a(lo $$0) {
      this.av().a(h, $$0);
   }

   protected void a(boolean $$0) {
      this.av().a(g, $$0);
   }

   public boolean i() {
      return this.av().a(g);
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

         lo $$2 = this.h();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = azj.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.af.i() * (float) (Math.PI * 2);
            float $$9 = azj.c(this.af.i()) * $$4;
            double $$10 = this.dC() + (double)(azj.b($$8) * $$9);
            double $$11 = this.dE();
            double $$12 = this.dI() + (double)(azj.a($$8) * $$9);
            if ($$2.a() == lq.u) {
               if ($$0 && this.af.h()) {
                  this.dX().b(lj.a(lq.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
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
            this.au();
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
               this.au();
               return;
            }

            this.a($$1);
         }

         if (this.ag % 5 == 0) {
            this.m.entrySet().removeIf($$0x -> this.ag >= (Integer)$$0x.getValue());
            if (!this.l.c()) {
               this.m.clear();
            } else {
               List<bte> $$14 = Lists.newArrayList();
               if (this.l.e().isPresent()) {
                  for (bte $$15 : this.l.e().get().a().a()) {
                     $$14.add(new bte($$15.c(), $$15.a($$0x -> $$0x / 4), $$15.e(), $$15.f(), $$15.g()));
                  }
               }

               $$14.addAll(this.l.d());
               List<buv> $$16 = this.dX().a(buv.class, this.cS());
               if (!$$16.isEmpty()) {
                  for (buv $$17 : $$16) {
                     if (!this.m.containsKey($$17) && $$17.fN() && !$$14.stream().noneMatch($$17::b)) {
                        double $$18 = $$17.dC() - this.dC();
                        double $$19 = $$17.dI() - this.dI();
                        double $$20 = $$18 * $$18 + $$19 * $$19;
                        if ($$20 <= (double)($$1 * $$1)) {
                           this.m.put($$17, this.ag + this.p);

                           for (bte $$21 : $$14) {
                              if ($$21.c().a().a()) {
                                 $$21.c().a().a(this, this.q(), $$17, $$21.e(), 0.5);
                              } else {
                                 $$17.b(new bte($$21), this);
                              }
                           }

                           if (this.r != 0.0F) {
                              $$1 += this.r;
                              if ($$1 < 0.5F) {
                                 this.au();
                                 return;
                              }

                              this.a($$1);
                           }

                           if (this.q != 0) {
                              this.n = this.n + this.q;
                              if (this.n <= 0) {
                                 this.au();
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

   public void a(@Nullable buv $$0) {
      this.t = $$0;
      this.u = $$0 == null ? null : $$0.cH();
   }

   @Nullable
   public buv q() {
      if (this.t == null && this.u != null && this.dX() instanceof arm) {
         btz $$0 = ((arm)this.dX()).a(this.u);
         if ($$0 instanceof buv) {
            this.t = (buv)$$0;
         }
      }

      return this.t;
   }

   @Override
   protected void a(uj $$0) {
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

      alf<vg> $$1 = this.dZ().a(ux.a);
      if ($$0.b("Particle", 10)) {
         lq.bf
            .parse($$1, $$0.c("Particle"))
            .resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud particle options: '{}'", $$0x))
            .ifPresent(this::a);
      }

      if ($$0.e("potion_contents")) {
         cxw.b.parse($$1, $$0.c("potion_contents")).resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud potions: '{}'", $$0x)).ifPresent(this::a);
      }
   }

   @Override
   protected void b(uj $$0) {
      $$0.a("Age", this.ag);
      $$0.a("Duration", this.n);
      $$0.a("WaitTime", this.o);
      $$0.a("ReapplicationDelay", this.p);
      $$0.a("DurationOnUse", this.q);
      $$0.a("RadiusOnUse", this.r);
      $$0.a("RadiusPerTick", this.s);
      $$0.a("Radius", this.g());
      alf<vg> $$1 = this.dZ().a(ux.a);
      $$0.a("Particle", (vg)lq.bf.encodeStart($$1, this.h()).getOrThrow());
      if (this.u != null) {
         $$0.a("Owner", this.u);
      }

      if (!this.l.equals(cxw.a)) {
         vg $$2 = (vg)cxw.b.encodeStart($$1, this.l).getOrThrow();
         $$0.a("potion_contents", $$2);
      }
   }

   @Override
   public void a(akk<?> $$0) {
      if (f.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public erj k_() {
      return erj.d;
   }

   @Override
   public buc a(bvh $$0) {
      return buc.b(this.g() * 2.0F, 0.5F);
   }
}
