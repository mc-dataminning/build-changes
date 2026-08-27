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

public class brq extends bru implements btn {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 5;
   private static final ajr<Float> f = ajv.a(brq.class, ajt.d);
   private static final ajr<Boolean> g = ajv.a(brq.class, ajt.k);
   private static final ajr<kw> h = ajv.a(brq.class, ajt.l);
   private static final float i = 32.0F;
   private static final float j = 0.5F;
   private static final float k = 3.0F;
   public static final float b = 6.0F;
   public static final float c = 0.5F;
   private cvp l = cvp.a;
   private final Map<bru, Integer> m = Maps.newHashMap();
   private int n = 600;
   private int o = 20;
   private int p = 20;
   private int q;
   private float r;
   private float s;
   @Nullable
   private bso t;
   @Nullable
   private UUID u;

   public brq(bsa<? extends brq> $$0, dax $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public brq(dax $$0, double $$1, double $$2, double $$3) {
      this(bsa.b, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(ajv.a $$0) {
      $$0.a(f, 3.0F);
      $$0.a(g, false);
      $$0.a(h, kq.a(ky.u, -1));
   }

   public void a(float $$0) {
      if (!this.dP().B) {
         this.ap().a(f, ayd.a($$0, 0.0F, 32.0F));
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

   public void a(cvp $$0) {
      this.l = $$0;
      this.u();
   }

   private void u() {
      int $$0 = this.l.equals(cvp.a) ? 0 : this.l.b();
      this.ao.a(h, kq.a(ky.u, $$0));
   }

   public void a(brc $$0) {
      this.a(this.l.a($$0));
   }

   public kw h() {
      return this.ap().a(h);
   }

   public void a(kw $$0) {
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

         kw $$2 = this.h();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = ayd.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ah.i() * (float) (Math.PI * 2);
            float $$9 = ayd.c(this.ah.i()) * $$4;
            double $$10 = this.du() + (double)(ayd.b($$8) * $$9);
            double $$11 = this.dw();
            double $$12 = this.dA() + (double)(ayd.a($$8) * $$9);
            if ($$0 && this.ah.h()) {
               this.dP().b(kq.a(ky.u, -1), $$10, $$11, $$12, 0.0, 0.0, 0.0);
            } else {
               this.dP().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
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
            if (!this.l.d()) {
               this.m.clear();
            } else {
               List<brc> $$14 = Lists.newArrayList();
               if (this.l.f().isPresent()) {
                  for (brc $$15 : this.l.f().get().a().a()) {
                     $$14.add(new brc($$15.c(), $$15.a($$0x -> $$0x / 4), $$15.e(), $$15.f(), $$15.g()));
                  }
               }

               $$14.addAll(this.l.e());
               List<bso> $$16 = this.dP().a(bso.class, this.cK());
               if (!$$16.isEmpty()) {
                  for (bso $$17 : $$16) {
                     if (!this.m.containsKey($$17) && $$17.fG()) {
                        double $$18 = $$17.du() - this.du();
                        double $$19 = $$17.dA() - this.dA();
                        double $$20 = $$18 * $$18 + $$19 * $$19;
                        if ($$20 <= (double)($$1 * $$1)) {
                           this.m.put($$17, this.ai + this.p);

                           for (brc $$21 : $$14) {
                              if ($$21.c().a().a()) {
                                 $$21.c().a().a(this, this.q(), $$17, $$21.e(), 0.5);
                              } else {
                                 $$17.b(new brc($$21), this);
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

   public void a(@Nullable bso $$0) {
      this.t = $$0;
      this.u = $$0 == null ? null : $$0.cz();
   }

   @Nullable
   public bso q() {
      if (this.t == null && this.u != null && this.dP() instanceof aqm) {
         bru $$0 = ((aqm)this.dP()).a(this.u);
         if ($$0 instanceof bso) {
            this.t = (bso)$$0;
         }
      }

      return this.t;
   }

   @Override
   protected void a(ud $$0) {
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

      if ($$0.b("Particle", 8)) {
         try {
            this.a(fb.a(new StringReader($$0.l("Particle")), this.dR()));
         } catch (CommandSyntaxException var3) {
            d.warn("Couldn't load custom particle {}", $$0.l("Particle"), var3);
         }
      }

      if ($$0.e("potion_contents")) {
         cvp.b
            .parse(ur.a, $$0.c("potion_contents"))
            .resultOrPartial($$0x -> d.warn("Failed to parse area effect cloud potions: '{}'", $$0x))
            .ifPresent(this::a);
      }
   }

   @Override
   protected void b(ud $$0) {
      $$0.a("Age", this.ai);
      $$0.a("Duration", this.n);
      $$0.a("WaitTime", this.o);
      $$0.a("ReapplicationDelay", this.p);
      $$0.a("DurationOnUse", this.q);
      $$0.a("RadiusOnUse", this.r);
      $$0.a("RadiusPerTick", this.s);
      $$0.a("Radius", this.g());
      $$0.a("Particle", this.h().a(this.dR()));
      if (this.u != null) {
         $$0.a("Owner", this.u);
      }

      if (!this.l.equals(cvp.a)) {
         va $$1 = (va)cvp.b.encodeStart(ur.a, this.l).getOrThrow();
         $$0.a("potion_contents", $$1);
      }
   }

   @Override
   public void a(ajr<?> $$0) {
      if (f.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public emz k_() {
      return emz.d;
   }

   @Override
   public brx a(bta $$0) {
      return brx.b(this.g() * 2.0F, 0.5F);
   }
}
