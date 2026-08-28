import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bvs extends bwa implements bxx {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 5;
   private static final akh<Float> e = akl.a(bvs.class, akj.d);
   private static final akh<Boolean> f = akl.a(bvs.class, akj.k);
   private static final akh<lv> g = akl.a(bvs.class, akj.l);
   private static final float h = 32.0F;
   private static final float i = 0.5F;
   private static final float j = 3.0F;
   public static final float a = 6.0F;
   public static final float b = 0.5F;
   private dao k = dao.a;
   private float l = 1.0F;
   private final Map<bwa, Integer> m = Maps.newHashMap();
   private int n = 600;
   private int o = 20;
   private int p = 20;
   private int q;
   private float r;
   private float s;
   @Nullable
   private bwz t;
   @Nullable
   private UUID u;

   public bvs(bwj<? extends bvs> $$0, dip $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public bvs(dip $$0, double $$1, double $$2, double $$3) {
      this(bwj.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(e, 3.0F);
      $$0.a(f, false);
      $$0.a(g, lq.a(lx.u, -1));
   }

   public void a(float $$0) {
      if (!this.dV().C) {
         this.au().a(e, azk.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void i_() {
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   public float e() {
      return this.au().a(e);
   }

   public void a(dao $$0) {
      this.k = $$0;
      this.s();
   }

   public void b(float $$0) {
      this.l = $$0;
   }

   private void s() {
      lv $$0 = this.al.a(g);
      if ($$0 instanceof lq $$1) {
         int $$2 = this.k.equals(dao.a) ? 0 : this.k.b();
         this.al.a(g, lq.a($$1.a(), axu.f($$2)));
      }
   }

   public void a(bve $$0) {
      this.a(this.k.a($$0));
   }

   public lv f() {
      return this.au().a(g);
   }

   public void a(lv $$0) {
      this.au().a(g, $$0);
   }

   protected void a(boolean $$0) {
      this.au().a(f, $$0);
   }

   public boolean g() {
      return this.au().a(f);
   }

   public int i() {
      return this.n;
   }

   public void a(int $$0) {
      this.n = $$0;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV() instanceof aro $$0) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   private void t() {
      boolean $$0 = this.g();
      float $$1 = this.e();
      if (!$$0 || !this.ae.h()) {
         lv $$2 = this.f();
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
            float $$8 = this.ae.i() * (float) (Math.PI * 2);
            float $$9 = azk.c(this.ae.i()) * $$4;
            double $$10 = this.dA() + (double)(azk.b($$8) * $$9);
            double $$11 = this.dC();
            double $$12 = this.dG() + (double)(azk.a($$8) * $$9);
            if ($$2.a() == lx.u) {
               if ($$0 && this.ae.h()) {
                  this.dV().b(lq.a(lx.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
               } else {
                  this.dV().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
               }
            } else if ($$0) {
               this.dV().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
            } else {
               this.dV().b($$2, $$10, $$11, $$12, (0.5 - this.ae.j()) * 0.15, 0.01F, (0.5 - this.ae.j()) * 0.15);
            }
         }
      }
   }

   private void a(aro $$0) {
      if (this.af >= this.o + this.n) {
         this.at();
      } else {
         boolean $$1 = this.g();
         boolean $$2 = this.af < this.o;
         if ($$1 != $$2) {
            this.a($$2);
         }

         if (!$$2) {
            float $$3 = this.e();
            if (this.s != 0.0F) {
               $$3 += this.s;
               if ($$3 < 0.5F) {
                  this.at();
                  return;
               }

               this.a($$3);
            }

            if (this.af % 5 == 0) {
               this.m.entrySet().removeIf($$0x -> this.af >= (Integer)$$0x.getValue());
               if (!this.k.c()) {
                  this.m.clear();
               } else {
                  List<bve> $$4 = new ArrayList<>();
                  this.k.a($$4::add, this.l);
                  List<bwz> $$5 = this.dV().a(bwz.class, this.cR());
                  if (!$$5.isEmpty()) {
                     for (bwz $$6 : $$5) {
                        if (!this.m.containsKey($$6) && $$6.fK() && !$$4.stream().noneMatch($$6::b)) {
                           double $$7 = $$6.dA() - this.dA();
                           double $$8 = $$6.dG() - this.dG();
                           double $$9 = $$7 * $$7 + $$8 * $$8;
                           if ($$9 <= (double)($$3 * $$3)) {
                              this.m.put($$6, this.af + this.p);

                              for (bve $$10 : $$4) {
                                 if ($$10.c().a().a()) {
                                    $$10.c().a().a($$0, this, this.o(), $$6, $$10.e(), 0.5);
                                 } else {
                                    $$6.b(new bve($$10), this);
                                 }
                              }

                              if (this.r != 0.0F) {
                                 $$3 += this.r;
                                 if ($$3 < 0.5F) {
                                    this.at();
                                    return;
                                 }

                                 this.a($$3);
                              }

                              if (this.q != 0) {
                                 this.n = this.n + this.q;
                                 if (this.n <= 0) {
                                    this.at();
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
   }

   public float j() {
      return this.r;
   }

   public void c(float $$0) {
      this.r = $$0;
   }

   public float l() {
      return this.s;
   }

   public void d(float $$0) {
      this.s = $$0;
   }

   public int m() {
      return this.q;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   public int n() {
      return this.o;
   }

   public void c(int $$0) {
      this.o = $$0;
   }

   public void a(@Nullable bwz $$0) {
      this.t = $$0;
      this.u = $$0 == null ? null : $$0.cG();
   }

   @Nullable
   public bwz o() {
      if (this.t != null && !this.t.dQ()) {
         return this.t;
      } else {
         if (this.u != null && this.dV() instanceof aro $$0) {
            this.t = $$0.b(this.u) instanceof bwz $$1 ? $$1 : null;
         }

         return this.t;
      }
   }

   @Override
   protected void a(tx $$0) {
      this.af = $$0.h("Age");
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

      alc<uu> $$1 = this.dX().a(ul.a);
      if ($$0.b("Particle", 10)) {
         lx.bj
            .parse($$1, $$0.c("Particle"))
            .resultOrPartial($$0x -> c.warn("Failed to parse area effect cloud particle options: '{}'", $$0x))
            .ifPresent(this::a);
      }

      if ($$0.e("potion_contents")) {
         dao.c.parse($$1, $$0.c("potion_contents")).resultOrPartial($$0x -> c.warn("Failed to parse area effect cloud potions: '{}'", $$0x)).ifPresent(this::a);
      }

      this.l = $$0.b("potion_duration_scale", 1.0F);
   }

   @Override
   protected void b(tx $$0) {
      $$0.a("Age", this.af);
      $$0.a("Duration", this.n);
      $$0.a("WaitTime", this.o);
      $$0.a("ReapplicationDelay", this.p);
      $$0.a("DurationOnUse", this.q);
      $$0.a("RadiusOnUse", this.r);
      $$0.a("RadiusPerTick", this.s);
      $$0.a("Radius", this.e());
      alc<uu> $$1 = this.dX().a(ul.a);
      $$0.a("Particle", (uu)lx.bj.encodeStart($$1, this.f()).getOrThrow());
      if (this.u != null) {
         $$0.a("Owner", this.u);
      }

      if (!this.k.equals(dao.a)) {
         uu $$2 = (uu)dao.c.encodeStart($$1, this.k).getOrThrow();
         $$0.a("potion_contents", $$2);
      }

      if (this.l != 1.0F) {
         $$0.a("potion_duration_scale", this.l);
      }
   }

   @Override
   public void a(akh<?> $$0) {
      if (e.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public ewa j_() {
      return ewa.d;
   }

   @Override
   public bwd a(bxl $$0) {
      return bwd.b(this.e() * 2.0F, 0.5F);
   }

   @Override
   public final boolean a(aro $$0, bup $$1, float $$2) {
      return false;
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      if ($$0 == kj.R) {
         return c((ki<T>)$$0, this.k);
      } else {
         return $$0 == kj.S ? c((ki<T>)$$0, Float.valueOf(this.l)) : super.a($$0);
      }
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.R);
      this.a($$0, kj.S);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.R) {
         this.a(c(kj.R, $$1));
         return true;
      } else if ($$0 == kj.S) {
         this.b(c(kj.S, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
