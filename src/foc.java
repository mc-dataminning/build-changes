import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3d;
import org.joml.Vector4f;
import org.slf4j.Logger;

public class foc implements anu, AutoCloseable {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 16;
   public static final int b = 8;
   private static final float e = 512.0F;
   private static final int f = 32;
   private static final int g = 10;
   private static final int h = 21;
   private static final int i = 15;
   private static final aew j = new aew("textures/environment/moon_phases.png");
   private static final aew k = new aew("textures/environment/sun.png");
   private static final aew l = new aew("textures/environment/clouds.png");
   private static final aew m = new aew("textures/environment/end_sky.png");
   private static final aew n = new aew("textures/misc/forcefield.png");
   private static final aew o = new aew("textures/environment/rain.png");
   private static final aew p = new aew("textures/environment/snow.png");
   public static final ha[] c = ha.values();
   private final eqv q;
   private final ftf r;
   private final fqd s;
   private final fok t;
   @Nullable
   private fix u;
   private final foq v = new foq();
   private final ObjectArrayList<frc.b> w = new ObjectArrayList(10000);
   private final Set<dcv> x = Sets.newHashSet();
   @Nullable
   private fov y;
   @Nullable
   private els z;
   @Nullable
   private els A;
   @Nullable
   private els B;
   private boolean C = true;
   @Nullable
   private els D;
   private final fon E = new fon(100);
   private int F;
   private final Int2ObjectMap<ajx> G = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<ajx>> H = new Long2ObjectOpenHashMap();
   private final Map<gw, gcm> I = Maps.newHashMap();
   @Nullable
   private ekb J;
   @Nullable
   private foh K;
   @Nullable
   private ekb L;
   @Nullable
   private ekb M;
   @Nullable
   private ekb N;
   @Nullable
   private ekb O;
   @Nullable
   private ekb P;
   @Nullable
   private foh Q;
   private int R = Integer.MIN_VALUE;
   private int S = Integer.MIN_VALUE;
   private int T = Integer.MIN_VALUE;
   private double U = Double.MIN_VALUE;
   private double V = Double.MIN_VALUE;
   private double W = Double.MIN_VALUE;
   private double X = Double.MIN_VALUE;
   private double Y = Double.MIN_VALUE;
   private int Z = Integer.MIN_VALUE;
   private int aa = Integer.MIN_VALUE;
   private int ab = Integer.MIN_VALUE;
   private ehn ac = ehn.b;
   @Nullable
   private eqj ad;
   @Nullable
   private frc ae;
   private int af = -1;
   private int ag;
   private int ah;
   private frg ai;
   private boolean aj;
   @Nullable
   private frg ak;
   private final Vector4f[] al = new Vector4f[8];
   private final Vector3d am = new Vector3d(0.0, 0.0, 0.0);
   private double an;
   private double ao;
   private double ap;
   private int aq;
   private final float[] ar = new float[1024];
   private final float[] as = new float[1024];

   public foc(eqv $$0, ftf $$1, fqd $$2, fok $$3) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      this.t = $$3;

      for (int $$4 = 0; $$4 < 32; $$4++) {
         for (int $$5 = 0; $$5 < 32; $$5++) {
            float $$6 = (float)($$5 - 16);
            float $$7 = (float)($$4 - 16);
            float $$8 = arw.c($$6 * $$6 + $$7 * $$7);
            this.ar[$$4 << 5 | $$5] = -$$7 / $$8;
            this.as[$$4 << 5 | $$5] = $$6 / $$8;
         }
      }

      this.C();
      this.B();
      this.A();
   }

   private void a(fod $$0, float $$1, double $$2, double $$3, double $$4) {
      float $$5 = this.q.r.d($$1);
      if (!($$5 <= 0.0F)) {
         $$0.c();
         cpv $$6 = this.q.r;
         int $$7 = arw.a($$2);
         int $$8 = arw.a($$3);
         int $$9 = arw.a($$4);
         elr $$10 = elr.a();
         elk $$11 = $$10.c();
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         int $$12 = 5;
         if (eqv.L()) {
            $$12 = 10;
         }

         RenderSystem.depthMask(eqv.M());
         int $$13 = -1;
         float $$14 = (float)this.F + $$1;
         RenderSystem.setShader(fnx::u);
         gw.a $$15 = new gw.a();

         for (int $$16 = $$9 - $$12; $$16 <= $$9 + $$12; $$16++) {
            for (int $$17 = $$7 - $$12; $$17 <= $$7 + $$12; $$17++) {
               int $$18 = ($$16 - $$9 + 16) * 32 + $$17 - $$7 + 16;
               double $$19 = (double)this.ar[$$18] * 0.5;
               double $$20 = (double)this.as[$$18] * 0.5;
               $$15.b((double)$$17, $$3, (double)$$16);
               cqt $$21 = $$6.s($$15).a();
               if ($$21.c()) {
                  int $$22 = $$6.a(dks.a.e, $$17, $$16);
                  int $$23 = $$8 - $$12;
                  int $$24 = $$8 + $$12;
                  if ($$23 < $$22) {
                     $$23 = $$22;
                  }

                  if ($$24 < $$22) {
                     $$24 = $$22;
                  }

                  int $$25 = $$22;
                  if ($$22 < $$8) {
                     $$25 = $$8;
                  }

                  if ($$23 != $$24) {
                     asc $$26 = asc.a((long)($$17 * $$17 * 3121 + $$17 * 45238971 ^ $$16 * $$16 * 418711 + $$16 * 13761));
                     $$15.d($$17, $$23, $$16);
                     cqt.c $$27 = $$21.a($$15);
                     if ($$27 == cqt.c.b) {
                        if ($$13 != 0) {
                           if ($$13 >= 0) {
                              $$10.b();
                           }

                           $$13 = 0;
                           RenderSystem.setShaderTexture(0, o);
                           $$11.a(elu.b.h, eln.l);
                        }

                        int $$28 = this.F + $$17 * $$17 * 3121 + $$17 * 45238971 + $$16 * $$16 * 418711 + $$16 * 13761 & 31;
                        float $$29 = -((float)$$28 + $$1) / 32.0F * (3.0F + $$26.i());
                        double $$30 = (double)$$17 + 0.5 - $$2;
                        double $$31 = (double)$$16 + 0.5 - $$4;
                        float $$32 = (float)Math.sqrt($$30 * $$30 + $$31 * $$31) / (float)$$12;
                        float $$33 = ((1.0F - $$32 * $$32) * 0.5F + 0.5F) * $$5;
                        $$15.d($$17, $$25, $$16);
                        int $$34 = a($$6, $$15);
                        $$11.a((double)$$17 - $$2 - $$19 + 0.5, (double)$$24 - $$3, (double)$$16 - $$4 - $$20 + 0.5)
                           .a(0.0F, (float)$$23 * 0.25F + $$29)
                           .a(1.0F, 1.0F, 1.0F, $$33)
                           .b($$34)
                           .e();
                        $$11.a((double)$$17 - $$2 + $$19 + 0.5, (double)$$24 - $$3, (double)$$16 - $$4 + $$20 + 0.5)
                           .a(1.0F, (float)$$23 * 0.25F + $$29)
                           .a(1.0F, 1.0F, 1.0F, $$33)
                           .b($$34)
                           .e();
                        $$11.a((double)$$17 - $$2 + $$19 + 0.5, (double)$$23 - $$3, (double)$$16 - $$4 + $$20 + 0.5)
                           .a(1.0F, (float)$$24 * 0.25F + $$29)
                           .a(1.0F, 1.0F, 1.0F, $$33)
                           .b($$34)
                           .e();
                        $$11.a((double)$$17 - $$2 - $$19 + 0.5, (double)$$23 - $$3, (double)$$16 - $$4 - $$20 + 0.5)
                           .a(0.0F, (float)$$24 * 0.25F + $$29)
                           .a(1.0F, 1.0F, 1.0F, $$33)
                           .b($$34)
                           .e();
                     } else if ($$27 == cqt.c.c) {
                        if ($$13 != 1) {
                           if ($$13 >= 0) {
                              $$10.b();
                           }

                           $$13 = 1;
                           RenderSystem.setShaderTexture(0, p);
                           $$11.a(elu.b.h, eln.l);
                        }

                        float $$35 = -((float)(this.F & 511) + $$1) / 512.0F;
                        float $$36 = (float)($$26.j() + (double)$$14 * 0.01 * (double)((float)$$26.k()));
                        float $$37 = (float)($$26.j() + (double)($$14 * (float)$$26.k()) * 0.001);
                        double $$38 = (double)$$17 + 0.5 - $$2;
                        double $$39 = (double)$$16 + 0.5 - $$4;
                        float $$40 = (float)Math.sqrt($$38 * $$38 + $$39 * $$39) / (float)$$12;
                        float $$41 = ((1.0F - $$40 * $$40) * 0.3F + 0.5F) * $$5;
                        $$15.d($$17, $$25, $$16);
                        int $$42 = a($$6, $$15);
                        int $$43 = $$42 >> 16 & 65535;
                        int $$44 = $$42 & 65535;
                        int $$45 = ($$43 * 3 + 240) / 4;
                        int $$46 = ($$44 * 3 + 240) / 4;
                        $$11.a((double)$$17 - $$2 - $$19 + 0.5, (double)$$24 - $$3, (double)$$16 - $$4 - $$20 + 0.5)
                           .a(0.0F + $$36, (float)$$23 * 0.25F + $$35 + $$37)
                           .a(1.0F, 1.0F, 1.0F, $$41)
                           .b($$46, $$45)
                           .e();
                        $$11.a((double)$$17 - $$2 + $$19 + 0.5, (double)$$24 - $$3, (double)$$16 - $$4 + $$20 + 0.5)
                           .a(1.0F + $$36, (float)$$23 * 0.25F + $$35 + $$37)
                           .a(1.0F, 1.0F, 1.0F, $$41)
                           .b($$46, $$45)
                           .e();
                        $$11.a((double)$$17 - $$2 + $$19 + 0.5, (double)$$23 - $$3, (double)$$16 - $$4 + $$20 + 0.5)
                           .a(1.0F + $$36, (float)$$24 * 0.25F + $$35 + $$37)
                           .a(1.0F, 1.0F, 1.0F, $$41)
                           .b($$46, $$45)
                           .e();
                        $$11.a((double)$$17 - $$2 - $$19 + 0.5, (double)$$23 - $$3, (double)$$16 - $$4 - $$20 + 0.5)
                           .a(0.0F + $$36, (float)$$24 * 0.25F + $$35 + $$37)
                           .a(1.0F, 1.0F, 1.0F, $$41)
                           .b($$46, $$45)
                           .e();
                     }
                  }
               }
            }
         }

         if ($$13 >= 0) {
            $$10.b();
         }

         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         $$0.b();
      }
   }

   public void a(eqg $$0) {
      float $$1 = this.q.r.d(1.0F) / (eqv.L() ? 1.0F : 2.0F);
      if (!($$1 <= 0.0F)) {
         asc $$2 = asc.a((long)this.F * 312987231L);
         cpy $$3 = this.q.r;
         gw $$4 = gw.a($$0.b());
         gw $$5 = null;
         int $$6 = (int)(100.0F * $$1 * $$1) / (this.q.m.an().c() == era.b ? 2 : 1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            int $$8 = $$2.a(21) - 10;
            int $$9 = $$2.a(21) - 10;
            gw $$10 = $$3.a(dks.a.e, $$4.b($$8, 0, $$9));
            if ($$10.v() > $$3.H_() && $$10.v() <= $$4.v() + 10 && $$10.v() >= $$4.v() - 10) {
               cqt $$11 = $$3.s($$10).a();
               if ($$11.a($$10) == cqt.c.b) {
                  $$5 = $$10.d();
                  if (this.q.m.an().c() == era.c) {
                     break;
                  }

                  double $$12 = $$2.j();
                  double $$13 = $$2.j();
                  dfj $$14 = $$3.a_($$5);
                  eam $$15 = $$3.b_($$5);
                  eig $$16 = $$14.k($$3, $$5);
                  double $$17 = $$16.b(ha.a.b, $$12, $$13);
                  double $$18 = (double)$$15.a($$3, $$5);
                  double $$19 = Math.max($$17, $$18);
                  it $$20 = !$$15.a(apx.b) && !$$14.a(csw.kJ) && !cti.g($$14) ? iv.Y : iv.Z;
                  this.q.r.a($$20, (double)$$5.u() + $$12, (double)$$5.v() + $$19, (double)$$5.w() + $$13, 0.0, 0.0, 0.0);
               }
            }
         }

         if ($$5 != null && $$2.a(3) < this.aq++) {
            this.aq = 0;
            if ($$5.v() > $$4.v() + 1 && $$3.a(dks.a.e, $$4).v() > arw.d((float)$$4.v())) {
               this.q.r.a($$5, apd.zS, ape.d, 0.1F, 0.5F, false);
            } else {
               this.q.r.a($$5, apd.zR, ape.d, 0.2F, 1.0F, false);
            }
         }
      }
   }

   @Override
   public void close() {
      if (this.K != null) {
         this.K.close();
      }

      if (this.Q != null) {
         this.Q.close();
      }
   }

   @Override
   public void a(ant $$0) {
      this.a();
      if (eqv.M()) {
         this.y();
      }
   }

   public void a() {
      if (this.K != null) {
         this.K.close();
      }

      aew $$0 = new aew("shaders/post/entity_outline.json");

      try {
         this.K = new foh(this.q.Y(), this.q.Z(), this.q.g(), $$0);
         this.K.a(this.q.aM().k(), this.q.aM().l());
         this.J = this.K.a("final");
      } catch (IOException var3) {
         d.warn("Failed to load shader: {}", $$0, var3);
         this.K = null;
         this.J = null;
      } catch (JsonSyntaxException var4) {
         d.warn("Failed to parse shader: {}", $$0, var4);
         this.K = null;
         this.J = null;
      }
   }

   private void y() {
      this.z();
      aew $$0 = new aew("shaders/post/transparency.json");

      try {
         foh $$1 = new foh(this.q.Y(), this.q.Z(), this.q.g(), $$0);
         $$1.a(this.q.aM().k(), this.q.aM().l());
         ekb $$2 = $$1.a("translucent");
         ekb $$3 = $$1.a("itemEntity");
         ekb $$4 = $$1.a("particles");
         ekb $$5 = $$1.a("weather");
         ekb $$6 = $$1.a("clouds");
         this.Q = $$1;
         this.L = $$2;
         this.M = $$3;
         this.N = $$4;
         this.O = $$5;
         this.P = $$6;
      } catch (Exception var8) {
         String $$8 = var8 instanceof JsonSyntaxException ? "parse" : "load";
         String $$9 = "Failed to " + $$8 + " shader: " + $$0;
         foc.a $$10 = new foc.a($$9, var8);
         if (this.q.aa().d().size() > 1) {
            tl $$11 = this.q.Z().b().findFirst().map($$0x -> tl.b($$0x.a())).orElse(null);
            this.q.m.i().a(eqo.b);
            this.q.a($$10, $$11, null);
         } else {
            o $$12 = this.q.d(new o($$9, $$10));
            this.q.m.i().a(eqo.b);
            this.q.m.ar();
            d.error(LogUtils.FATAL_MARKER, $$9, $$10);
            this.q.p();
            eqv.c($$12);
         }
      }
   }

   private void z() {
      if (this.Q != null) {
         this.Q.close();
         this.L.a();
         this.M.a();
         this.N.a();
         this.O.a();
         this.P.a();
         this.Q = null;
         this.L = null;
         this.M = null;
         this.N = null;
         this.O = null;
         this.P = null;
      }
   }

   public void b() {
      if (this.d()) {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA,
            GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
            GlStateManager.SourceFactor.ZERO,
            GlStateManager.DestFactor.ONE
         );
         this.J.c(this.q.aM().k(), this.q.aM().l(), false);
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   protected boolean d() {
      return !this.q.j.a() && this.J != null && this.K != null && this.q.s != null;
   }

   private void A() {
      elr $$0 = elr.a();
      elk $$1 = $$0.c();
      if (this.B != null) {
         this.B.close();
      }

      this.B = new els(els.a.a);
      elk.b $$2 = a($$1, -16.0F);
      this.B.a();
      this.B.a($$2);
      els.b();
   }

   private void B() {
      elr $$0 = elr.a();
      elk $$1 = $$0.c();
      if (this.A != null) {
         this.A.close();
      }

      this.A = new els(els.a.a);
      elk.b $$2 = a($$1, 16.0F);
      this.A.a();
      this.A.a($$2);
      els.b();
   }

   private static elk.b a(elk $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      float $$3 = 512.0F;
      RenderSystem.setShader(fnx::p);
      $$0.a(elu.b.g, eln.m);
      $$0.a(0.0, (double)$$1, 0.0).e();

      for (int $$4 = -180; $$4 <= 180; $$4 += 45) {
         $$0.a((double)($$2 * arw.b((float)$$4 * (float) (Math.PI / 180.0))), (double)$$1, (double)(512.0F * arw.a((float)$$4 * (float) (Math.PI / 180.0))))
            .e();
      }

      return $$0.d();
   }

   private void C() {
      elr $$0 = elr.a();
      elk $$1 = $$0.c();
      RenderSystem.setShader(fnx::p);
      if (this.z != null) {
         this.z.close();
      }

      this.z = new els(els.a.a);
      elk.b $$2 = this.a($$1);
      this.z.a();
      this.z.a($$2);
      els.b();
   }

   private elk.b a(elk $$0) {
      asc $$1 = asc.a(10842L);
      $$0.a(elu.b.h, eln.m);

      for (int $$2 = 0; $$2 < 1500; $$2++) {
         double $$3 = (double)($$1.i() * 2.0F - 1.0F);
         double $$4 = (double)($$1.i() * 2.0F - 1.0F);
         double $$5 = (double)($$1.i() * 2.0F - 1.0F);
         double $$6 = (double)(0.15F + $$1.i() * 0.1F);
         double $$7 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
         if ($$7 < 1.0 && $$7 > 0.01) {
            $$7 = 1.0 / Math.sqrt($$7);
            $$3 *= $$7;
            $$4 *= $$7;
            $$5 *= $$7;
            double $$8 = $$3 * 100.0;
            double $$9 = $$4 * 100.0;
            double $$10 = $$5 * 100.0;
            double $$11 = Math.atan2($$3, $$5);
            double $$12 = Math.sin($$11);
            double $$13 = Math.cos($$11);
            double $$14 = Math.atan2(Math.sqrt($$3 * $$3 + $$5 * $$5), $$4);
            double $$15 = Math.sin($$14);
            double $$16 = Math.cos($$14);
            double $$17 = $$1.j() * Math.PI * 2.0;
            double $$18 = Math.sin($$17);
            double $$19 = Math.cos($$17);

            for (int $$20 = 0; $$20 < 4; $$20++) {
               double $$21 = 0.0;
               double $$22 = (double)(($$20 & 2) - 1) * $$6;
               double $$23 = (double)(($$20 + 1 & 2) - 1) * $$6;
               double $$24 = 0.0;
               double $$25 = $$22 * $$19 - $$23 * $$18;
               double $$26 = $$23 * $$19 + $$22 * $$18;
               double $$28 = $$25 * $$15 + 0.0 * $$16;
               double $$29 = 0.0 * $$15 - $$25 * $$16;
               double $$30 = $$29 * $$12 - $$26 * $$13;
               double $$32 = $$26 * $$12 + $$29 * $$13;
               $$0.a($$8 + $$30, $$9 + $$28, $$10 + $$32).e();
            }
         }
      }

      return $$0.d();
   }

   public void a(@Nullable fix $$0) {
      this.R = Integer.MIN_VALUE;
      this.S = Integer.MIN_VALUE;
      this.T = Integer.MIN_VALUE;
      this.r.a($$0);
      this.u = $$0;
      if ($$0 != null) {
         this.f();
      } else {
         if (this.y != null) {
            this.y.a();
            this.y = null;
         }

         if (this.ae != null) {
            this.ae.i();
         }

         this.ae = null;
         this.x.clear();
         this.v.a(null);
         this.w.clear();
      }
   }

   public void e() {
      if (eqv.M()) {
         this.y();
      } else {
         this.z();
      }
   }

   public void f() {
      if (this.u != null) {
         this.e();
         this.u.g();
         if (this.ae == null) {
            this.ae = new frc(this.u, this, ac.f(), this.q.af(), this.t.a());
         } else {
            this.ae.a(this.u);
         }

         this.C = true;
         fnz.a(eqv.L());
         this.af = this.q.m.az();
         if (this.y != null) {
            this.y.a();
         }

         this.ae.g();
         synchronized (this.x) {
            this.x.clear();
         }

         this.y = new fov(this.ae, this.u, this.q.m.az(), this);
         this.v.a(this.y);
         this.w.clear();
         biq $$0 = this.q.am();
         if ($$0 != null) {
            this.y.a($$0.dq(), $$0.dw());
         }
      }
   }

   public void a(int $$0, int $$1) {
      this.r();
      if (this.K != null) {
         this.K.a($$0, $$1);
      }

      if (this.Q != null) {
         this.Q.a($$0, $$1);
      }
   }

   public String g() {
      int $$0 = this.y.f.length;
      int $$1 = this.k();
      return String.format(Locale.ROOT, "C: %d/%d %sD: %d, %s", $$1, $$0, this.q.D ? "(s) " : "", this.af, this.ae == null ? "null" : this.ae.a());
   }

   public frc h() {
      return this.ae;
   }

   public double i() {
      return (double)this.y.f.length;
   }

   public double j() {
      return (double)this.af;
   }

   public int k() {
      int $$0 = 0;
      ObjectListIterator var2 = this.w.iterator();

      while (var2.hasNext()) {
         frc.b $$1 = (frc.b)var2.next();
         if (!$$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String l() {
      return "E: " + this.ag + "/" + this.u.h() + ", B: " + this.ah + ", SD: " + this.u.m();
   }

   private void a(eqg $$0, frg $$1, boolean $$2, boolean $$3) {
      ehn $$4 = $$0.b();
      if (this.q.m.az() != this.af) {
         this.f();
      }

      this.u.ad().a("camera");
      double $$5 = this.q.s.dq();
      double $$6 = this.q.s.ds();
      double $$7 = this.q.s.dw();
      int $$8 = hw.a($$5);
      int $$9 = hw.a($$6);
      int $$10 = hw.a($$7);
      if (this.R != $$8 || this.S != $$9 || this.T != $$10) {
         this.R = $$8;
         this.S = $$9;
         this.T = $$10;
         this.y.a($$5, $$7);
      }

      this.ae.a($$4);
      this.u.ad().b("cull");
      this.q.aG().b("culling");
      gw $$11 = $$0.c();
      double $$12 = Math.floor($$4.c / 8.0);
      double $$13 = Math.floor($$4.d / 8.0);
      double $$14 = Math.floor($$4.e / 8.0);
      if ($$12 != this.U || $$13 != this.V || $$14 != this.W) {
         this.v.a();
      }

      this.U = $$12;
      this.V = $$13;
      this.W = $$14;
      this.q.aG().b("update");
      if (!$$2) {
         boolean $$15 = this.q.D;
         if ($$3 && this.u.a_($$11).i(this.u, $$11)) {
            $$15 = false;
         }

         biq.b(arw.a((double)this.q.m.az() / 8.0, 1.0, 2.5) * this.q.m.f().c());
         this.q.aG().a("section_occlusion_graph");
         this.v.a($$15, $$0, $$1, this.w);
         this.q.aG().c();
         double $$16 = Math.floor((double)($$0.d() / 2.0F));
         double $$17 = Math.floor((double)($$0.e() / 2.0F));
         if (this.v.b() || $$16 != this.X || $$17 != this.Y) {
            this.b(a($$1));
            this.X = $$16;
            this.Y = $$17;
         }
      }

      this.q.aG().c();
   }

   public static frg a(frg $$0) {
      return new frg($$0).a(8);
   }

   private void b(frg $$0) {
      if (!eqv.O().bl()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.q.aG().a("apply_frustum");
         this.w.clear();
         this.v.a($$0, this.w);
         this.q.aG().c();
      }
   }

   public void a(frc.b $$0) {
      this.v.a($$0);
   }

   private void a(Matrix4f $$0, Matrix4f $$1, double $$2, double $$3, double $$4, frg $$5) {
      this.ak = $$5;
      Matrix4f $$6 = new Matrix4f($$1);
      $$6.mul($$0);
      $$6.invert();
      this.am.x = $$2;
      this.am.y = $$3;
      this.am.z = $$4;
      this.al[0] = new Vector4f(-1.0F, -1.0F, -1.0F, 1.0F);
      this.al[1] = new Vector4f(1.0F, -1.0F, -1.0F, 1.0F);
      this.al[2] = new Vector4f(1.0F, 1.0F, -1.0F, 1.0F);
      this.al[3] = new Vector4f(-1.0F, 1.0F, -1.0F, 1.0F);
      this.al[4] = new Vector4f(-1.0F, -1.0F, 1.0F, 1.0F);
      this.al[5] = new Vector4f(1.0F, -1.0F, 1.0F, 1.0F);
      this.al[6] = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.al[7] = new Vector4f(-1.0F, 1.0F, 1.0F, 1.0F);

      for (int $$7 = 0; $$7 < 8; $$7++) {
         $$6.transform(this.al[$$7]);
         this.al[$$7].div(this.al[$$7].w());
      }
   }

   public void a(elp $$0, ehn $$1, Matrix4f $$2) {
      Matrix4f $$3 = $$0.c().a();
      double $$4 = $$1.a();
      double $$5 = $$1.b();
      double $$6 = $$1.c();
      this.ai = new frg($$3, $$2);
      this.ai.a($$4, $$5, $$6);
   }

   public void a(elp $$0, float $$1, long $$2, boolean $$3, eqg $$4, fnx $$5, fod $$6, Matrix4f $$7) {
      RenderSystem.setShaderGameTime(this.u.V(), $$1);
      this.s.a(this.u, $$4, this.q.v);
      this.r.a(this.u, $$4, this.q.u);
      bdp $$8 = this.u.ad();
      $$8.b("light_update_queue");
      this.u.b();
      $$8.b("light_updates");
      this.u.i().p().a();
      ehn $$9 = $$4.b();
      double $$10 = $$9.a();
      double $$11 = $$9.b();
      double $$12 = $$9.c();
      Matrix4f $$13 = $$0.c().a();
      $$8.b("culling");
      boolean $$14 = this.ak != null;
      frg $$15;
      if ($$14) {
         $$15 = this.ak;
         $$15.a(this.am.x, this.am.y, this.am.z);
      } else {
         $$15 = this.ai;
      }

      this.q.aG().b("captureFrustum");
      if (this.aj) {
         this.a($$13, $$7, $$9.c, $$9.d, $$9.e, $$14 ? new frg($$13, $$7) : $$15);
         this.aj = false;
      }

      $$8.b("clear");
      fnw.a($$4, $$1, this.q.r, this.q.m.az(), $$5.b($$1));
      fnw.b();
      RenderSystem.clear(16640, eqv.a);
      float $$17 = $$5.l();
      boolean $$18 = this.q.r.d().a(arw.a($$10), arw.a($$11)) || this.q.l.j().d();
      $$8.b("sky");
      RenderSystem.setShader(fnx::p);
      this.a($$0, $$7, $$1, $$4, $$18, () -> fnw.a($$4, fnw.d.a, $$17, $$18, $$1));
      $$8.b("fog");
      fnw.a($$4, fnw.d.b, Math.max($$17, 32.0F), $$18, $$1);
      $$8.b("terrain_setup");
      this.a($$4, $$15, $$14, this.q.s.M_());
      $$8.b("compile_sections");
      this.c($$4);
      $$8.b("terrain");
      this.a(fom.c(), $$0, $$10, $$11, $$12, $$7);
      this.a(fom.d(), $$0, $$10, $$11, $$12, $$7);
      this.a(fom.e(), $$0, $$10, $$11, $$12, $$7);
      if (this.u.d().e()) {
         ekl.a($$0.c().a());
      } else {
         ekl.b($$0.c().a());
      }

      $$8.b("entities");
      this.ag = 0;
      this.ah = 0;
      if (this.M != null) {
         this.M.b(eqv.a);
         this.M.a(this.q.g());
         this.q.g().a(false);
      }

      if (this.O != null) {
         this.O.b(eqv.a);
      }

      if (this.d()) {
         this.J.b(eqv.a);
         this.q.g().a(false);
      }

      boolean $$19 = false;
      foe.a $$20 = this.t.b();

      for (biq $$21 : this.u.e()) {
         if (this.r.a($$21, $$15, $$10, $$11, $$12) || $$21.z(this.q.s)) {
            gw $$22 = $$21.dl();
            if ((this.u.d($$22.v()) || this.a($$22))
               && ($$21 != $$4.g() || $$4.i() || $$4.g() instanceof bjg && ((bjg)$$4.g()).fC())
               && (!($$21 instanceof fng) || $$4.g() == $$21)) {
               this.ag++;
               if ($$21.ah == 0) {
                  $$21.ac = $$21.dq();
                  $$21.ad = $$21.ds();
                  $$21.ae = $$21.dw();
               }

               foe $$24;
               if (this.d() && this.q.b($$21)) {
                  $$19 = true;
                  fof $$23 = this.t.d();
                  $$24 = $$23;
                  int $$25 = $$21.h_();
                  $$23.a(arh.b.b($$25), arh.b.c($$25), arh.b.d($$25), 255);
               } else {
                  $$24 = $$20;
               }

               this.a($$21, $$10, $$11, $$12, $$1, $$0, $$24);
            }
         }
      }

      $$20.a();
      this.a($$0);
      $$20.a(fom.c(fzd.e));
      $$20.a(fom.d(fzd.e));
      $$20.a(fom.e(fzd.e));
      $$20.a(fom.k(fzd.e));
      $$8.b("blockentities");
      ObjectListIterator var39 = this.w.iterator();

      while (var39.hasNext()) {
         frc.b $$27 = (frc.b)var39.next();
         List<dcv> $$28 = $$27.d().b();
         if (!$$28.isEmpty()) {
            for (dcv $$29 : $$28) {
               gw $$30 = $$29.p();
               foe $$31 = $$20;
               $$0.a();
               $$0.a((double)$$30.u() - $$10, (double)$$30.v() - $$11, (double)$$30.w() - $$12);
               SortedSet<ajx> $$32 = (SortedSet<ajx>)this.H.get($$30.a());
               if ($$32 != null && !$$32.isEmpty()) {
                  int $$33 = $$32.last().c();
                  if ($$33 >= 0) {
                     elp.a $$34 = $$0.c();
                     elt $$35 = new elq(this.t.c().getBuffer(gbk.l.get($$33)), $$34.a(), $$34.b(), 1.0F);
                     $$31 = $$2x -> {
                        elt $$3x = $$20.getBuffer($$2x);
                        return $$2x.M() ? elw.a($$35, $$3x) : $$3x;
                     };
                  }
               }

               this.s.a($$29, $$1, $$0, $$31);
               $$0.b();
            }
         }
      }

      synchronized (this.x) {
         for (dcv $$36 : this.x) {
            gw $$37 = $$36.p();
            $$0.a();
            $$0.a((double)$$37.u() - $$10, (double)$$37.v() - $$11, (double)$$37.w() - $$12);
            this.s.a($$36, $$1, $$0, $$20);
            $$0.b();
         }
      }

      this.a($$0);
      $$20.a(fom.c());
      $$20.a(fom.v());
      $$20.a(fom.w());
      $$20.a(fot.h());
      $$20.a(fot.i());
      $$20.a(fot.c());
      $$20.a(fot.d());
      $$20.a(fot.e());
      $$20.a(fot.f());
      $$20.a(fot.g());
      this.t.d().a();
      if ($$19) {
         this.K.a($$1);
         this.q.g().a(false);
      }

      $$8.b("destroyProgress");
      ObjectIterator var41 = this.H.long2ObjectEntrySet().iterator();

      while (var41.hasNext()) {
         Entry<SortedSet<ajx>> $$38 = (Entry<SortedSet<ajx>>)var41.next();
         gw $$39 = gw.d($$38.getLongKey());
         double $$40 = (double)$$39.u() - $$10;
         double $$41 = (double)$$39.v() - $$11;
         double $$42 = (double)$$39.w() - $$12;
         if (!($$40 * $$40 + $$41 * $$41 + $$42 * $$42 > 1024.0)) {
            SortedSet<ajx> $$43 = (SortedSet<ajx>)$$38.getValue();
            if ($$43 != null && !$$43.isEmpty()) {
               int $$44 = $$43.last().c();
               $$0.a();
               $$0.a((double)$$39.u() - $$10, (double)$$39.v() - $$11, (double)$$39.w() - $$12);
               elp.a $$45 = $$0.c();
               elt $$46 = new elq(this.t.c().getBuffer(gbk.l.get($$44)), $$45.a(), $$45.b(), 1.0F);
               this.q.an().a(this.u.a_($$39), $$39, this.u, $$0, $$46);
               $$0.b();
            }
         }
      }

      this.a($$0);
      ehl $$47 = this.q.v;
      if ($$3 && $$47 != null && $$47.c() == ehl.a.b) {
         $$8.b("outline");
         gw $$48 = ((ehj)$$47).a();
         dfj $$49 = this.u.a_($$48);
         if (!$$49.i() && this.u.B_().a($$48)) {
            elt $$50 = $$20.getBuffer(fom.x());
            this.a($$0, $$50, $$4.g(), $$10, $$11, $$12, $$48, $$49);
         }
      }

      this.q.k.a($$0, $$20, $$10, $$11, $$12);
      $$20.a();
      elp $$51 = RenderSystem.getModelViewStack();
      RenderSystem.applyModelViewMatrix();
      $$20.a(fot.k());
      $$20.a(fot.a());
      $$20.a(fot.b());
      $$20.a(fom.k());
      $$20.a(fom.l());
      $$20.a(fom.n());
      $$20.a(fom.o());
      $$20.a(fom.m());
      $$20.a(fom.p());
      $$20.a(fom.q());
      $$20.a(fom.j());
      this.t.c().b();
      if (this.Q != null) {
         $$20.a(fom.x());
         $$20.b();
         this.L.b(eqv.a);
         this.L.a(this.q.g());
         $$8.b("translucent");
         this.a(fom.f(), $$0, $$10, $$11, $$12, $$7);
         $$8.b("string");
         this.a(fom.u(), $$0, $$10, $$11, $$12, $$7);
         this.N.b(eqv.a);
         this.N.a(this.q.g());
         fol.aL.a();
         $$8.b("particles");
         this.q.g.a($$0, $$20, $$6, $$4, $$1);
         fol.aL.b();
      } else {
         $$8.b("translucent");
         if (this.L != null) {
            this.L.b(eqv.a);
         }

         this.a(fom.f(), $$0, $$10, $$11, $$12, $$7);
         $$20.a(fom.x());
         $$20.b();
         $$8.b("string");
         this.a(fom.u(), $$0, $$10, $$11, $$12, $$7);
         $$8.b("particles");
         this.q.g.a($$0, $$20, $$6, $$4, $$1);
      }

      $$51.a();
      $$51.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();
      if (this.q.m.au() != eqj.a) {
         if (this.Q != null) {
            this.P.b(eqv.a);
            fol.aN.a();
            $$8.b("clouds");
            this.a($$0, $$7, $$1, $$10, $$11, $$12);
            fol.aN.b();
         } else {
            $$8.b("clouds");
            RenderSystem.setShader(fnx::x);
            this.a($$0, $$7, $$1, $$10, $$11, $$12);
         }
      }

      if (this.Q != null) {
         fol.aM.a();
         $$8.b("weather");
         this.a($$6, $$1, $$10, $$11, $$12);
         this.d($$4);
         fol.aM.b();
         this.Q.a($$1);
         this.q.g().a(false);
      } else {
         RenderSystem.depthMask(false);
         $$8.b("weather");
         this.a($$6, $$1, $$10, $$11, $$12);
         this.d($$4);
         RenderSystem.depthMask(true);
      }

      $$51.b();
      RenderSystem.applyModelViewMatrix();
      this.a($$0, $$20, $$4);
      $$20.a();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      fnw.a();
   }

   private void a(elp $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(biq $$0, double $$1, double $$2, double $$3, float $$4, elp $$5, foe $$6) {
      double $$7 = arw.d((double)$$4, $$0.ac, $$0.dq());
      double $$8 = arw.d((double)$$4, $$0.ad, $$0.ds());
      double $$9 = arw.d((double)$$4, $$0.ae, $$0.dw());
      float $$10 = arw.i($$4, $$0.N, $$0.dB());
      this.r.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$10, $$4, $$5, $$6, this.r.a($$0, $$4));
   }

   private void a(fom $$0, elp $$1, double $$2, double $$3, double $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      $$0.a();
      if ($$0 == fom.f()) {
         this.q.aG().a("translucent_sort");
         double $$6 = $$2 - this.an;
         double $$7 = $$3 - this.ao;
         double $$8 = $$4 - this.ap;
         if ($$6 * $$6 + $$7 * $$7 + $$8 * $$8 > 1.0) {
            int $$9 = hw.a($$2);
            int $$10 = hw.a($$3);
            int $$11 = hw.a($$4);
            boolean $$12 = $$9 != hw.a(this.an) || $$11 != hw.a(this.ap) || $$10 != hw.a(this.ao);
            this.an = $$2;
            this.ao = $$3;
            this.ap = $$4;
            int $$13 = 0;
            ObjectListIterator var21 = this.w.iterator();

            while (var21.hasNext()) {
               frc.b $$14 = (frc.b)var21.next();
               if ($$13 < 15 && ($$12 || $$14.b($$9, $$10, $$11)) && $$14.a($$0, this.ae)) {
                  $$13++;
               }
            }
         }

         this.q.aG().c();
      }

      this.q.aG().a("filterempty");
      this.q.aG().b(() -> "render_" + $$0);
      boolean $$15 = $$0 != fom.f();
      ObjectListIterator<frc.b> $$16 = this.w.listIterator($$15 ? 0 : this.w.size());
      fos $$17 = RenderSystem.getShader();

      for (int $$18 = 0; $$18 < 12; $$18++) {
         int $$19 = RenderSystem.getShaderTexture($$18);
         $$17.a("Sampler" + $$18, $$19);
      }

      if ($$17.b != null) {
         $$17.b.a($$1.c().a());
      }

      if ($$17.c != null) {
         $$17.c.a($$5);
      }

      if ($$17.g != null) {
         $$17.g.a(RenderSystem.getShaderColor());
      }

      if ($$17.j != null) {
         $$17.j.a(RenderSystem.getShaderGlintAlpha());
      }

      if ($$17.k != null) {
         $$17.k.a(RenderSystem.getShaderFogStart());
      }

      if ($$17.l != null) {
         $$17.l.a(RenderSystem.getShaderFogEnd());
      }

      if ($$17.m != null) {
         $$17.m.a(RenderSystem.getShaderFogColor());
      }

      if ($$17.n != null) {
         $$17.n.a(RenderSystem.getShaderFogShape().a());
      }

      if ($$17.e != null) {
         $$17.e.a(RenderSystem.getTextureMatrix());
      }

      if ($$17.p != null) {
         $$17.p.a(RenderSystem.getShaderGameTime());
      }

      RenderSystem.setupShaderLights($$17);
      $$17.g();
      elg $$20 = $$17.q;

      while ($$15 ? $$16.hasNext() : $$16.hasPrevious()) {
         frc.b $$21 = $$15 ? (frc.b)$$16.next() : (frc.b)$$16.previous();
         if (!$$21.d().a($$0)) {
            els $$22 = $$21.a($$0);
            gw $$23 = $$21.f();
            if ($$20 != null) {
               $$20.a((float)((double)$$23.u() - $$2), (float)((double)$$23.v() - $$3), (float)((double)$$23.w() - $$4));
               $$20.b();
            }

            $$22.a();
            $$22.c();
         }
      }

      if ($$20 != null) {
         $$20.a(0.0F, 0.0F, 0.0F);
      }

      $$17.f();
      els.b();
      this.q.aG().c();
      $$0.b();
   }

   private void a(elp $$0, foe $$1, eqg $$2) {
      if (this.q.B || this.q.C) {
         double $$3 = $$2.b().a();
         double $$4 = $$2.b().b();
         double $$5 = $$2.b().c();
         ObjectListIterator var10 = this.w.iterator();

         while (var10.hasNext()) {
            frc.b $$6 = (frc.b)var10.next();
            foq.d $$7 = this.v.b($$6);
            if ($$7 != null) {
               gw $$8 = $$6.f();
               $$0.a();
               $$0.a((double)$$8.u() - $$3, (double)$$8.v() - $$4, (double)$$8.w() - $$5);
               Matrix4f $$9 = $$0.c().a();
               if (this.q.B) {
                  elt $$10 = $$1.getBuffer(fom.x());
                  int $$11 = $$7.b == 0 ? 0 : arw.h((float)$$7.b / 50.0F, 0.9F, 0.9F);
                  int $$12 = $$11 >> 16 & 0xFF;
                  int $$13 = $$11 >> 8 & 0xFF;
                  int $$14 = $$11 & 0xFF;

                  for (int $$15 = 0; $$15 < c.length; $$15++) {
                     if ($$7.a($$15)) {
                        ha $$16 = c[$$15];
                        $$10.a($$9, 8.0F, 8.0F, 8.0F).a($$12, $$13, $$14, 255).a((float)$$16.j(), (float)$$16.k(), (float)$$16.l()).e();
                        $$10.a($$9, (float)(8 - 16 * $$16.j()), (float)(8 - 16 * $$16.k()), (float)(8 - 16 * $$16.l()))
                           .a($$12, $$13, $$14, 255)
                           .a((float)$$16.j(), (float)$$16.k(), (float)$$16.l())
                           .e();
                     }
                  }
               }

               if (this.q.C && !$$6.d().a()) {
                  elt $$17 = $$1.getBuffer(fom.x());
                  int $$18 = 0;

                  for (ha $$19 : c) {
                     for (ha $$20 : c) {
                        boolean $$21 = $$6.d().a($$19, $$20);
                        if (!$$21) {
                           $$18++;
                           $$17.a($$9, (float)(8 + 8 * $$19.j()), (float)(8 + 8 * $$19.k()), (float)(8 + 8 * $$19.l()))
                              .a(255, 0, 0, 255)
                              .a((float)$$19.j(), (float)$$19.k(), (float)$$19.l())
                              .e();
                           $$17.a($$9, (float)(8 + 8 * $$20.j()), (float)(8 + 8 * $$20.k()), (float)(8 + 8 * $$20.l()))
                              .a(255, 0, 0, 255)
                              .a((float)$$20.j(), (float)$$20.k(), (float)$$20.l())
                              .e();
                        }
                     }
                  }

                  if ($$18 > 0) {
                     elt $$22 = $$1.getBuffer(fom.A());
                     float $$23 = 0.5F;
                     float $$24 = 0.2F;
                     $$22.a($$9, 0.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                  }
               }

               $$0.b();
            }
         }
      }

      if (this.ak != null) {
         $$0.a();
         $$0.a((float)(this.am.x - $$2.b().c), (float)(this.am.y - $$2.b().d), (float)(this.am.z - $$2.b().e));
         Matrix4f $$25 = $$0.c().a();
         elt $$26 = $$1.getBuffer(fom.A());
         this.a($$26, $$25, 0, 1, 2, 3, 0, 1, 1);
         this.a($$26, $$25, 4, 5, 6, 7, 1, 0, 0);
         this.a($$26, $$25, 0, 1, 5, 4, 1, 1, 0);
         this.a($$26, $$25, 2, 3, 7, 6, 0, 0, 1);
         this.a($$26, $$25, 0, 4, 7, 3, 0, 1, 0);
         this.a($$26, $$25, 1, 5, 6, 2, 1, 0, 1);
         elt $$27 = $$1.getBuffer(fom.x());
         this.a($$27, $$25, 0);
         this.a($$27, $$25, 1);
         this.a($$27, $$25, 1);
         this.a($$27, $$25, 2);
         this.a($$27, $$25, 2);
         this.a($$27, $$25, 3);
         this.a($$27, $$25, 3);
         this.a($$27, $$25, 0);
         this.a($$27, $$25, 4);
         this.a($$27, $$25, 5);
         this.a($$27, $$25, 5);
         this.a($$27, $$25, 6);
         this.a($$27, $$25, 6);
         this.a($$27, $$25, 7);
         this.a($$27, $$25, 7);
         this.a($$27, $$25, 4);
         this.a($$27, $$25, 0);
         this.a($$27, $$25, 4);
         this.a($$27, $$25, 1);
         this.a($$27, $$25, 5);
         this.a($$27, $$25, 2);
         this.a($$27, $$25, 6);
         this.a($$27, $$25, 3);
         this.a($$27, $$25, 7);
         $$0.b();
      }
   }

   private void a(elt $$0, Matrix4f $$1, int $$2) {
      $$0.a($$1, this.al[$$2].x(), this.al[$$2].y(), this.al[$$2].z()).a(0, 0, 0, 255).a(0.0F, 0.0F, -1.0F).e();
   }

   private void a(elt $$0, Matrix4f $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      float $$9 = 0.25F;
      $$0.a($$1, this.al[$$2].x(), this.al[$$2].y(), this.al[$$2].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.al[$$3].x(), this.al[$$3].y(), this.al[$$3].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.al[$$4].x(), this.al[$$4].y(), this.al[$$4].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.al[$$5].x(), this.al[$$5].y(), this.al[$$5].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
   }

   public void m() {
      this.aj = true;
   }

   public void n() {
      this.ak = null;
   }

   public void o() {
      this.F++;
      if (this.F % 20 == 0) {
         Iterator<ajx> $$0 = this.G.values().iterator();

         while ($$0.hasNext()) {
            ajx $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.F - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(ajx $$0) {
      long $$1 = $$0.b().a();
      Set<ajx> $$2 = (Set<ajx>)this.H.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.H.remove($$1);
      }
   }

   private void b(elp $$0) {
      RenderSystem.enableBlend();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(fnx::t);
      RenderSystem.setShaderTexture(0, m);
      elr $$1 = elr.a();
      elk $$2 = $$1.c();

      for (int $$3 = 0; $$3 < 6; $$3++) {
         $$0.a();
         if ($$3 == 1) {
            $$0.a(a.b.rotationDegrees(90.0F));
         }

         if ($$3 == 2) {
            $$0.a(a.b.rotationDegrees(-90.0F));
         }

         if ($$3 == 3) {
            $$0.a(a.b.rotationDegrees(180.0F));
         }

         if ($$3 == 4) {
            $$0.a(a.f.rotationDegrees(90.0F));
         }

         if ($$3 == 5) {
            $$0.a(a.f.rotationDegrees(-90.0F));
         }

         Matrix4f $$4 = $$0.c().a();
         $$2.a(elu.b.h, eln.s);
         $$2.a($$4, -100.0F, -100.0F, -100.0F).a(0.0F, 0.0F).a(40, 40, 40, 255).e();
         $$2.a($$4, -100.0F, -100.0F, 100.0F).a(0.0F, 16.0F).a(40, 40, 40, 255).e();
         $$2.a($$4, 100.0F, -100.0F, 100.0F).a(16.0F, 16.0F).a(40, 40, 40, 255).e();
         $$2.a($$4, 100.0F, -100.0F, -100.0F).a(16.0F, 0.0F).a(40, 40, 40, 255).e();
         $$1.b();
         $$0.b();
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
   }

   public void a(elp $$0, Matrix4f $$1, float $$2, eqg $$3, boolean $$4, Runnable $$5) {
      $$5.run();
      if (!$$4) {
         eao $$6 = $$3.k();
         if ($$6 != eao.c && $$6 != eao.a && !this.b($$3)) {
            if (this.q.r.d().c() == fnt.d.c) {
               this.b($$0);
            } else if (this.q.r.d().c() == fnt.d.b) {
               ehn $$7 = this.u.a(this.q.j.m().b(), $$2);
               float $$8 = (float)$$7.c;
               float $$9 = (float)$$7.d;
               float $$10 = (float)$$7.e;
               fnw.b();
               elk $$11 = elr.a().c();
               RenderSystem.depthMask(false);
               RenderSystem.setShaderColor($$8, $$9, $$10, 1.0F);
               fos $$12 = RenderSystem.getShader();
               this.A.a();
               this.A.a($$0.c().a(), $$1, $$12);
               els.b();
               RenderSystem.enableBlend();
               float[] $$13 = this.u.d().a(this.u.f($$2), $$2);
               if ($$13 != null) {
                  RenderSystem.setShader(fnx::q);
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  $$0.a();
                  $$0.a(a.b.rotationDegrees(90.0F));
                  float $$14 = arw.a(this.u.a($$2)) < 0.0F ? 180.0F : 0.0F;
                  $$0.a(a.f.rotationDegrees($$14));
                  $$0.a(a.f.rotationDegrees(90.0F));
                  float $$15 = $$13[0];
                  float $$16 = $$13[1];
                  float $$17 = $$13[2];
                  Matrix4f $$18 = $$0.c().a();
                  $$11.a(elu.b.g, eln.n);
                  $$11.a($$18, 0.0F, 100.0F, 0.0F).a($$15, $$16, $$17, $$13[3]).e();
                  int $$19 = 16;

                  for (int $$20 = 0; $$20 <= 16; $$20++) {
                     float $$21 = (float)$$20 * (float) (Math.PI * 2) / 16.0F;
                     float $$22 = arw.a($$21);
                     float $$23 = arw.b($$21);
                     $$11.a($$18, $$22 * 120.0F, $$23 * 120.0F, -$$23 * 40.0F * $$13[3]).a($$13[0], $$13[1], $$13[2], 0.0F).e();
                  }

                  ell.a($$11.d());
                  $$0.b();
               }

               RenderSystem.blendFuncSeparate(
                  GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
               );
               $$0.a();
               float $$24 = 1.0F - this.u.d($$2);
               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$24);
               $$0.a(a.d.rotationDegrees(-90.0F));
               $$0.a(a.b.rotationDegrees(this.u.f($$2) * 360.0F));
               Matrix4f $$25 = $$0.c().a();
               float $$26 = 30.0F;
               RenderSystem.setShader(fnx::s);
               RenderSystem.setShaderTexture(0, k);
               $$11.a(elu.b.h, eln.q);
               $$11.a($$25, -$$26, 100.0F, -$$26).a(0.0F, 0.0F).e();
               $$11.a($$25, $$26, 100.0F, -$$26).a(1.0F, 0.0F).e();
               $$11.a($$25, $$26, 100.0F, $$26).a(1.0F, 1.0F).e();
               $$11.a($$25, -$$26, 100.0F, $$26).a(0.0F, 1.0F).e();
               ell.a($$11.d());
               $$26 = 20.0F;
               RenderSystem.setShaderTexture(0, j);
               int $$27 = this.u.ao();
               int $$28 = $$27 % 4;
               int $$29 = $$27 / 4 % 2;
               float $$30 = (float)($$28 + 0) / 4.0F;
               float $$31 = (float)($$29 + 0) / 2.0F;
               float $$32 = (float)($$28 + 1) / 4.0F;
               float $$33 = (float)($$29 + 1) / 2.0F;
               $$11.a(elu.b.h, eln.q);
               $$11.a($$25, -$$26, -100.0F, $$26).a($$32, $$33).e();
               $$11.a($$25, $$26, -100.0F, $$26).a($$30, $$33).e();
               $$11.a($$25, $$26, -100.0F, -$$26).a($$30, $$31).e();
               $$11.a($$25, -$$26, -100.0F, -$$26).a($$32, $$31).e();
               ell.a($$11.d());
               float $$34 = this.u.i($$2) * $$24;
               if ($$34 > 0.0F) {
                  RenderSystem.setShaderColor($$34, $$34, $$34, $$34);
                  fnw.a();
                  this.z.a();
                  this.z.a($$0.c().a(), $$1, fnx.p());
                  els.b();
                  $$5.run();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.disableBlend();
               RenderSystem.defaultBlendFunc();
               $$0.b();
               RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
               double $$35 = this.q.s.j($$2).d - this.u.k().a(this.u);
               if ($$35 < 0.0) {
                  $$0.a();
                  $$0.a(0.0F, 12.0F, 0.0F);
                  this.B.a();
                  this.B.a($$0.c().a(), $$1, $$12);
                  els.b();
                  $$0.b();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.depthMask(true);
            }
         }
      }
   }

   private boolean b(eqg $$0) {
      return !($$0.g() instanceof bjg $$1) ? false : $$1.a(bif.o) || $$1.a(bif.G);
   }

   public void a(elp $$0, Matrix4f $$1, float $$2, double $$3, double $$4, double $$5) {
      float $$6 = this.u.d().a();
      if (!Float.isNaN($$6)) {
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA,
            GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
            GlStateManager.SourceFactor.ONE,
            GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA
         );
         RenderSystem.depthMask(true);
         float $$7 = 12.0F;
         float $$8 = 4.0F;
         double $$9 = 2.0E-4;
         double $$10 = (double)(((float)this.F + $$2) * 0.03F);
         double $$11 = ($$3 + $$10) / 12.0;
         double $$12 = (double)($$6 - (float)$$4 + 0.33F);
         double $$13 = $$5 / 12.0 + 0.33F;
         $$11 -= (double)(arw.a($$11 / 2048.0) * 2048);
         $$13 -= (double)(arw.a($$13 / 2048.0) * 2048);
         float $$14 = (float)($$11 - (double)arw.a($$11));
         float $$15 = (float)($$12 / 4.0 - (double)arw.a($$12 / 4.0)) * 4.0F;
         float $$16 = (float)($$13 - (double)arw.a($$13));
         ehn $$17 = this.u.h($$2);
         int $$18 = (int)Math.floor($$11);
         int $$19 = (int)Math.floor($$12 / 4.0);
         int $$20 = (int)Math.floor($$13);
         if ($$18 != this.Z || $$19 != this.aa || $$20 != this.ab || this.q.m.au() != this.ad || this.ac.g($$17) > 2.0E-4) {
            this.Z = $$18;
            this.aa = $$19;
            this.ab = $$20;
            this.ac = $$17;
            this.ad = this.q.m.au();
            this.C = true;
         }

         if (this.C) {
            this.C = false;
            elk $$21 = elr.a().c();
            if (this.D != null) {
               this.D.close();
            }

            this.D = new els(els.a.a);
            elk.b $$22 = this.a($$21, $$11, $$12, $$13, $$17);
            this.D.a();
            this.D.a($$22);
            els.b();
         }

         RenderSystem.setShader(fnx::x);
         RenderSystem.setShaderTexture(0, l);
         fnw.b();
         $$0.a();
         $$0.b(12.0F, 1.0F, 12.0F);
         $$0.a(-$$14, $$15, -$$16);
         if (this.D != null) {
            this.D.a();
            int $$23 = this.ad == eqj.c ? 0 : 1;

            for (int $$24 = $$23; $$24 < 2; $$24++) {
               if ($$24 == 0) {
                  RenderSystem.colorMask(false, false, false, false);
               } else {
                  RenderSystem.colorMask(true, true, true, true);
               }

               fos $$25 = RenderSystem.getShader();
               this.D.a($$0.c().a(), $$1, $$25);
            }

            els.b();
         }

         $$0.b();
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   private elk.b a(elk $$0, double $$1, double $$2, double $$3, ehn $$4) {
      float $$5 = 4.0F;
      float $$6 = 0.00390625F;
      int $$7 = 8;
      int $$8 = 4;
      float $$9 = 9.765625E-4F;
      float $$10 = (float)arw.a($$1) * 0.00390625F;
      float $$11 = (float)arw.a($$3) * 0.00390625F;
      float $$12 = (float)$$4.c;
      float $$13 = (float)$$4.d;
      float $$14 = (float)$$4.e;
      float $$15 = $$12 * 0.9F;
      float $$16 = $$13 * 0.9F;
      float $$17 = $$14 * 0.9F;
      float $$18 = $$12 * 0.7F;
      float $$19 = $$13 * 0.7F;
      float $$20 = $$14 * 0.7F;
      float $$21 = $$12 * 0.8F;
      float $$22 = $$13 * 0.8F;
      float $$23 = $$14 * 0.8F;
      RenderSystem.setShader(fnx::x);
      $$0.a(elu.b.h, eln.v);
      float $$24 = (float)Math.floor($$2 / 4.0) * 4.0F;
      if (this.ad == eqj.c) {
         for (int $$25 = -3; $$25 <= 4; $$25++) {
            for (int $$26 = -3; $$26 <= 4; $$26++) {
               float $$27 = (float)($$25 * 8);
               float $$28 = (float)($$26 * 8);
               if ($$24 > -5.0F) {
                  $$0.a((double)($$27 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + 8.0F))
                     .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .a(0.0F, -1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 8.0F), (double)($$24 + 0.0F), (double)($$28 + 8.0F))
                     .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .a(0.0F, -1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 8.0F), (double)($$24 + 0.0F), (double)($$28 + 0.0F))
                     .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .a(0.0F, -1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + 0.0F))
                     .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .a(0.0F, -1.0F, 0.0F)
                     .e();
               }

               if ($$24 <= 5.0F) {
                  $$0.a((double)($$27 + 0.0F), (double)($$24 + 4.0F - 9.765625E-4F), (double)($$28 + 8.0F))
                     .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .a(0.0F, 1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 8.0F), (double)($$24 + 4.0F - 9.765625E-4F), (double)($$28 + 8.0F))
                     .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .a(0.0F, 1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 8.0F), (double)($$24 + 4.0F - 9.765625E-4F), (double)($$28 + 0.0F))
                     .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .a(0.0F, 1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 0.0F), (double)($$24 + 4.0F - 9.765625E-4F), (double)($$28 + 0.0F))
                     .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .a(0.0F, 1.0F, 0.0F)
                     .e();
               }

               if ($$25 > -1) {
                  for (int $$29 = 0; $$29 < 8; $$29++) {
                     $$0.a((double)($$27 + (float)$$29 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + 8.0F))
                        .a(($$27 + (float)$$29 + 0.5F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(-1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$29 + 0.0F), (double)($$24 + 4.0F), (double)($$28 + 8.0F))
                        .a(($$27 + (float)$$29 + 0.5F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(-1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$29 + 0.0F), (double)($$24 + 4.0F), (double)($$28 + 0.0F))
                        .a(($$27 + (float)$$29 + 0.5F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(-1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$29 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + 0.0F))
                        .a(($$27 + (float)$$29 + 0.5F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(-1.0F, 0.0F, 0.0F)
                        .e();
                  }
               }

               if ($$25 <= 1) {
                  for (int $$30 = 0; $$30 < 8; $$30++) {
                     $$0.a((double)($$27 + (float)$$30 + 1.0F - 9.765625E-4F), (double)($$24 + 0.0F), (double)($$28 + 8.0F))
                        .a(($$27 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$30 + 1.0F - 9.765625E-4F), (double)($$24 + 4.0F), (double)($$28 + 8.0F))
                        .a(($$27 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$30 + 1.0F - 9.765625E-4F), (double)($$24 + 4.0F), (double)($$28 + 0.0F))
                        .a(($$27 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$30 + 1.0F - 9.765625E-4F), (double)($$24 + 0.0F), (double)($$28 + 0.0F))
                        .a(($$27 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(1.0F, 0.0F, 0.0F)
                        .e();
                  }
               }

               if ($$26 > -1) {
                  for (int $$31 = 0; $$31 < 8; $$31++) {
                     $$0.a((double)($$27 + 0.0F), (double)($$24 + 4.0F), (double)($$28 + (float)$$31 + 0.0F))
                        .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, -1.0F)
                        .e();
                     $$0.a((double)($$27 + 8.0F), (double)($$24 + 4.0F), (double)($$28 + (float)$$31 + 0.0F))
                        .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, -1.0F)
                        .e();
                     $$0.a((double)($$27 + 8.0F), (double)($$24 + 0.0F), (double)($$28 + (float)$$31 + 0.0F))
                        .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, -1.0F)
                        .e();
                     $$0.a((double)($$27 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + (float)$$31 + 0.0F))
                        .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, -1.0F)
                        .e();
                  }
               }

               if ($$26 <= 1) {
                  for (int $$32 = 0; $$32 < 8; $$32++) {
                     $$0.a((double)($$27 + 0.0F), (double)($$24 + 4.0F), (double)($$28 + (float)$$32 + 1.0F - 9.765625E-4F))
                        .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, 1.0F)
                        .e();
                     $$0.a((double)($$27 + 8.0F), (double)($$24 + 4.0F), (double)($$28 + (float)$$32 + 1.0F - 9.765625E-4F))
                        .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, 1.0F)
                        .e();
                     $$0.a((double)($$27 + 8.0F), (double)($$24 + 0.0F), (double)($$28 + (float)$$32 + 1.0F - 9.765625E-4F))
                        .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, 1.0F)
                        .e();
                     $$0.a((double)($$27 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + (float)$$32 + 1.0F - 9.765625E-4F))
                        .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, 1.0F)
                        .e();
                  }
               }
            }
         }
      } else {
         int $$33 = 1;
         int $$34 = 32;

         for (int $$35 = -32; $$35 < 32; $$35 += 32) {
            for (int $$36 = -32; $$36 < 32; $$36 += 32) {
               $$0.a((double)($$35 + 0), (double)$$24, (double)($$36 + 32))
                  .a((float)($$35 + 0) * 0.00390625F + $$10, (float)($$36 + 32) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .a(0.0F, -1.0F, 0.0F)
                  .e();
               $$0.a((double)($$35 + 32), (double)$$24, (double)($$36 + 32))
                  .a((float)($$35 + 32) * 0.00390625F + $$10, (float)($$36 + 32) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .a(0.0F, -1.0F, 0.0F)
                  .e();
               $$0.a((double)($$35 + 32), (double)$$24, (double)($$36 + 0))
                  .a((float)($$35 + 32) * 0.00390625F + $$10, (float)($$36 + 0) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .a(0.0F, -1.0F, 0.0F)
                  .e();
               $$0.a((double)($$35 + 0), (double)$$24, (double)($$36 + 0))
                  .a((float)($$35 + 0) * 0.00390625F + $$10, (float)($$36 + 0) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .a(0.0F, -1.0F, 0.0F)
                  .e();
            }
         }
      }

      return $$0.d();
   }

   private void c(eqg $$0) {
      this.q.aG().a("populate_sections_to_compile");
      eab $$1 = this.u.x_();
      frb $$2 = new frb();
      gw $$3 = $$0.c();
      List<frc.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.w.iterator();

      while (var6.hasNext()) {
         frc.b $$5 = (frc.b)var6.next();
         hw $$6 = hw.a($$5.f());
         if ($$5.h() && $$1.a($$6)) {
            boolean $$7 = false;
            if (this.q.m.k().c() == erc.c) {
               gw $$8 = $$5.f().b(8, 8, 8);
               $$7 = $$8.j($$3) < 768.0 || $$5.i();
            } else if (this.q.m.k().c() == erc.b) {
               $$7 = $$5.i();
            }

            if ($$7) {
               this.q.aG().a("build_near_sync");
               this.ae.a($$5, $$2);
               $$5.g();
               this.q.aG().c();
            } else {
               $$4.add($$5);
            }
         }
      }

      this.q.aG().b("upload");
      this.ae.f();
      this.q.aG().b("schedule_async_compile");

      for (frc.b $$9 : $$4) {
         $$9.a(this.ae, $$2);
         $$9.g();
      }

      this.q.aG().c();
   }

   private void d(eqg $$0) {
      elk $$1 = elr.a().c();
      dha $$2 = this.u.B_();
      double $$3 = (double)(this.q.m.az() * 16);
      if (!($$0.b().c < $$2.g() - $$3) || !($$0.b().c > $$2.e() + $$3) || !($$0.b().e < $$2.h() - $$3) || !($$0.b().e > $$2.f() + $$3)) {
         double $$4 = 1.0 - $$2.b($$0.b().c, $$0.b().e) / $$3;
         $$4 = Math.pow($$4, 4.0);
         $$4 = arw.a($$4, 0.0, 1.0);
         double $$5 = $$0.b().c;
         double $$6 = $$0.b().e;
         double $$7 = (double)this.q.j.h();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
         RenderSystem.setShaderTexture(0, n);
         RenderSystem.depthMask(eqv.M());
         elp $$8 = RenderSystem.getModelViewStack();
         $$8.a();
         RenderSystem.applyModelViewMatrix();
         int $$9 = $$2.d().a();
         float $$10 = (float)($$9 >> 16 & 0xFF) / 255.0F;
         float $$11 = (float)($$9 >> 8 & 0xFF) / 255.0F;
         float $$12 = (float)($$9 & 0xFF) / 255.0F;
         RenderSystem.setShaderColor($$10, $$11, $$12, (float)$$4);
         RenderSystem.setShader(fnx::s);
         RenderSystem.polygonOffset(-3.0F, -3.0F);
         RenderSystem.enablePolygonOffset();
         RenderSystem.disableCull();
         float $$13 = (float)(ac.b() % 3000L) / 3000.0F;
         float $$14 = (float)(-arw.e($$0.b().d * 0.5));
         float $$15 = $$14 + (float)$$7;
         $$1.a(elu.b.h, eln.q);
         double $$16 = Math.max((double)arw.a($$6 - $$3), $$2.f());
         double $$17 = Math.min((double)arw.c($$6 + $$3), $$2.h());
         float $$18 = (float)(arw.a($$16) & 1) * 0.5F;
         if ($$5 > $$2.g() - $$3) {
            float $$19 = $$18;

            for (double $$20 = $$16; $$20 < $$17; $$19 += 0.5F) {
               double $$21 = Math.min(1.0, $$17 - $$20);
               float $$22 = (float)$$21 * 0.5F;
               $$1.a($$2.g() - $$5, -$$7, $$20 - $$6).a($$13 - $$19, $$13 + $$15).e();
               $$1.a($$2.g() - $$5, -$$7, $$20 + $$21 - $$6).a($$13 - ($$22 + $$19), $$13 + $$15).e();
               $$1.a($$2.g() - $$5, $$7, $$20 + $$21 - $$6).a($$13 - ($$22 + $$19), $$13 + $$14).e();
               $$1.a($$2.g() - $$5, $$7, $$20 - $$6).a($$13 - $$19, $$13 + $$14).e();
               $$20++;
            }
         }

         if ($$5 < $$2.e() + $$3) {
            float $$23 = $$18;

            for (double $$24 = $$16; $$24 < $$17; $$23 += 0.5F) {
               double $$25 = Math.min(1.0, $$17 - $$24);
               float $$26 = (float)$$25 * 0.5F;
               $$1.a($$2.e() - $$5, -$$7, $$24 - $$6).a($$13 + $$23, $$13 + $$15).e();
               $$1.a($$2.e() - $$5, -$$7, $$24 + $$25 - $$6).a($$13 + $$26 + $$23, $$13 + $$15).e();
               $$1.a($$2.e() - $$5, $$7, $$24 + $$25 - $$6).a($$13 + $$26 + $$23, $$13 + $$14).e();
               $$1.a($$2.e() - $$5, $$7, $$24 - $$6).a($$13 + $$23, $$13 + $$14).e();
               $$24++;
            }
         }

         $$16 = Math.max((double)arw.a($$5 - $$3), $$2.e());
         $$17 = Math.min((double)arw.c($$5 + $$3), $$2.g());
         $$18 = (float)(arw.a($$16) & 1) * 0.5F;
         if ($$6 > $$2.h() - $$3) {
            float $$27 = $$18;

            for (double $$28 = $$16; $$28 < $$17; $$27 += 0.5F) {
               double $$29 = Math.min(1.0, $$17 - $$28);
               float $$30 = (float)$$29 * 0.5F;
               $$1.a($$28 - $$5, -$$7, $$2.h() - $$6).a($$13 + $$27, $$13 + $$15).e();
               $$1.a($$28 + $$29 - $$5, -$$7, $$2.h() - $$6).a($$13 + $$30 + $$27, $$13 + $$15).e();
               $$1.a($$28 + $$29 - $$5, $$7, $$2.h() - $$6).a($$13 + $$30 + $$27, $$13 + $$14).e();
               $$1.a($$28 - $$5, $$7, $$2.h() - $$6).a($$13 + $$27, $$13 + $$14).e();
               $$28++;
            }
         }

         if ($$6 < $$2.f() + $$3) {
            float $$31 = $$18;

            for (double $$32 = $$16; $$32 < $$17; $$31 += 0.5F) {
               double $$33 = Math.min(1.0, $$17 - $$32);
               float $$34 = (float)$$33 * 0.5F;
               $$1.a($$32 - $$5, -$$7, $$2.f() - $$6).a($$13 - $$31, $$13 + $$15).e();
               $$1.a($$32 + $$33 - $$5, -$$7, $$2.f() - $$6).a($$13 - ($$34 + $$31), $$13 + $$15).e();
               $$1.a($$32 + $$33 - $$5, $$7, $$2.f() - $$6).a($$13 - ($$34 + $$31), $$13 + $$14).e();
               $$1.a($$32 - $$5, $$7, $$2.f() - $$6).a($$13 - $$31, $$13 + $$14).e();
               $$32++;
            }
         }

         ell.a($$1.d());
         RenderSystem.enableCull();
         RenderSystem.polygonOffset(0.0F, 0.0F);
         RenderSystem.disablePolygonOffset();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
         $$8.b();
         RenderSystem.applyModelViewMatrix();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.depthMask(true);
      }
   }

   private void a(elp $$0, elt $$1, biq $$2, double $$3, double $$4, double $$5, gw $$6, dfj $$7) {
      a($$0, $$1, $$7.a(this.u, $$6, ehs.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   private static ehn a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(arw.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new ehn(1.0, (double)$$3, 0.0);
         case 1 -> new ehn((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new ehn(0.0, 1.0, (double)$$3);
         case 3 -> new ehn(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new ehn((double)$$3, 0.0, 1.0);
         case 5 -> new ehn(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static ehn a(float $$0, float $$1, float $$2, float $$3) {
      ehn $$4 = a($$3).a((double)$$0);
      ehn $$5 = a(($$3 + 0.33333334F) % 1.0F).a((double)$$1);
      ehn $$6 = a(($$3 + 0.6666667F) % 1.0F).a((double)$$2);
      ehn $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.c), Math.max($$7.d, $$7.e));
      return new ehn($$7.c / $$8, $$7.d / $$8, $$7.e / $$8);
   }

   public static void a(elp $$0, elt $$1, eig $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<ehi> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         a($$0, $$1, eid.a($$11.get(0)), $$3, $$4, $$5, $$6, $$7, $$8, $$9);

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            ehi $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            ehn $$16 = a($$6, $$7, $$8, $$15);
            a($$0, $$1, eid.a($$14), $$3, $$4, $$5, (float)$$16.c, (float)$$16.d, (float)$$16.e, $$9);
         }
      }
   }

   private static void a(elp $$0, elt $$1, eig $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9) {
      elp.a $$10 = $$0.c();
      $$2.a(($$9x, $$10x, $$11, $$12, $$13, $$14) -> {
         float $$15 = (float)($$12 - $$9x);
         float $$16 = (float)($$13 - $$10x);
         float $$17 = (float)($$14 - $$11);
         float $$18 = arw.c($$15 * $$15 + $$16 * $$16 + $$17 * $$17);
         $$15 /= $$18;
         $$16 /= $$18;
         $$17 /= $$18;
         $$1.a($$10.a(), (float)($$9x + $$3), (float)($$10x + $$4), (float)($$11 + $$5)).a($$6, $$7, $$8, $$9).a($$10.b(), $$15, $$16, $$17).e();
         $$1.a($$10.a(), (float)($$12 + $$3), (float)($$13 + $$4), (float)($$14 + $$5)).a($$6, $$7, $$8, $$9).a($$10.b(), $$15, $$16, $$17).e();
      });
   }

   public static void a(elt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, float $$8, float $$9, float $$10) {
      a(new elp(), $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$7, $$8, $$9);
   }

   public static void a(elp $$0, elt $$1, ehi $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6, $$3, $$4, $$5);
   }

   public static void a(elp $$0, elt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$8, $$9, $$10);
   }

   public static void a(
      elp $$0,
      elt $$1,
      double $$2,
      double $$3,
      double $$4,
      double $$5,
      double $$6,
      double $$7,
      float $$8,
      float $$9,
      float $$10,
      float $$11,
      float $$12,
      float $$13,
      float $$14
   ) {
      Matrix4f $$15 = $$0.c().a();
      Matrix3f $$16 = $$0.c().b();
      float $$17 = (float)$$2;
      float $$18 = (float)$$3;
      float $$19 = (float)$$4;
      float $$20 = (float)$$5;
      float $$21 = (float)$$6;
      float $$22 = (float)$$7;
      $$1.a($$15, $$17, $$18, $$19).a($$8, $$13, $$14, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$18, $$19).a($$8, $$13, $$14, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$17, $$18, $$19).a($$12, $$9, $$14, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$17, $$21, $$19).a($$12, $$9, $$14, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$17, $$18, $$19).a($$12, $$13, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$17, $$18, $$22).a($$12, $$13, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$20, $$18, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, -1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$17, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, -1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$17, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$17, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$17, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, -1.0F, 0.0F).e();
      $$1.a($$15, $$17, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, -1.0F, 0.0F).e();
      $$1.a($$15, $$17, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, -1.0F).e();
      $$1.a($$15, $$20, $$18, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, -1.0F).e();
      $$1.a($$15, $$17, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$20, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
   }

   public static void b(elp $$0, elt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, (float)$$2, (float)$$3, (float)$$4, (float)$$5, (float)$$6, (float)$$7, $$8, $$9, $$10, $$11);
   }

   public static void a(elp $$0, elt $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11) {
      Matrix4f $$12 = $$0.c().a();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
   }

   public void a(cpb $$0, gw $$1, dfj $$2, dfj $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(gw $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(hw.a($$3), hw.a($$4), hw.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(hw.a($$7), hw.a($$8), hw.a($$6));
            }
         }
      }
   }

   public void a(gw $$0, dfj $$1, dfj $$2) {
      if (this.q.aC().a($$1, $$2)) {
         this.a($$0.u(), $$0.v(), $$0.w(), $$0.u(), $$0.v(), $$0.w());
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      for (int $$3 = $$2 - 1; $$3 <= $$2 + 1; $$3++) {
         for (int $$4 = $$0 - 1; $$4 <= $$0 + 1; $$4++) {
            for (int $$5 = $$1 - 1; $$5 <= $$1 + 1; $$5++) {
               this.b($$4, $$5, $$3);
            }
         }
      }
   }

   public void b(int $$0, int $$1, int $$2) {
      this.a($$0, $$1, $$2, false);
   }

   private void a(int $$0, int $$1, int $$2, boolean $$3) {
      this.y.a($$0, $$1, $$2, $$3);
   }

   public void a(@Nullable apc $$0, gw $$1) {
      gcm $$2 = this.I.get($$1);
      if ($$2 != null) {
         this.q.ai().b($$2);
         this.I.remove($$1);
      }

      if ($$0 != null) {
         cjx $$3 = cjx.a($$0);
         if ($$3 != null) {
            this.q.l.a($$3.i());
         }

         gcm var5 = gch.a($$0, ehn.b($$1));
         this.I.put($$1, var5);
         this.q.ai().a(var5);
      }

      this.a(this.u, $$1, $$0 != null);
   }

   private void a(cpv $$0, gw $$1, boolean $$2) {
      for (bjg $$4 : $$0.a(bjg.class, new ehi($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }

   public void a(it $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(it $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         o $$10 = o.a(var19, "Exception while adding particle");
         p $$11 = $$10.a("Particle being added");
         $$11.a("ID", jb.k.b($$0.b()));
         $$11.a("Parameters", $$0.a());
         $$11.a("Position", () -> p.a(this.u, $$3, $$4, $$5));
         throw new y($$10);
      }
   }

   private <T extends it> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.b().c(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   private flu b(it $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private flu b(it $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      eqg $$9 = this.q.j.m();
      era $$10 = this.a($$2);
      if ($$1) {
         return this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == era.c ? null : this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private era a(boolean $$0) {
      era $$1 = this.q.m.an().c();
      if ($$0 && $$1 == era.c && this.u.z.a(10) == 0) {
         $$1 = era.b;
      }

      if ($$1 == era.b && this.u.z.a(3) == 0) {
         $$1 = era.c;
      }

      return $$1;
   }

   public void p() {
   }

   public void a(int $$0, gw $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            eqg $$3 = this.q.j.m();
            if ($$3.h()) {
               double $$4 = (double)$$1.u() - $$3.b().c;
               double $$5 = (double)$$1.v() - $$3.b().d;
               double $$6 = (double)$$1.w() - $$3.b().e;
               double $$7 = Math.sqrt($$4 * $$4 + $$5 * $$5 + $$6 * $$6);
               double $$8 = $$3.b().c;
               double $$9 = $$3.b().d;
               double $$10 = $$3.b().e;
               if ($$7 > 0.0) {
                  $$8 += $$4 / $$7 * 2.0;
                  $$9 += $$5 / $$7 * 2.0;
                  $$10 += $$6 / $$7 * 2.0;
               }

               if ($$0 == 1023) {
                  this.u.a($$8, $$9, $$10, apd.As, ape.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.u.a($$8, $$9, $$10, apd.hp, ape.f, 1.0F, 1.0F, false);
               } else {
                  this.u.a($$8, $$9, $$10, apd.gU, ape.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, gw $$1, int $$2) {
      asc $$3 = this.u.z;
      switch ($$0) {
         case 1000:
            this.u.a($$1, apd.fM, ape.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.u.a($$1, apd.fN, ape.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.u.a($$1, apd.fO, ape.e, 1.0F, 1.2F, false);
            break;
         case 1003:
            this.u.a($$1, apd.hb, ape.g, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.u.a($$1, apd.hJ, ape.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.u.a($$1, apd.hN, ape.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.u.a($$1, apd.iY, ape.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            if (cja.b($$2) instanceof cjx $$87) {
               this.a($$87.x(), $$1);
            }
            break;
         case 1011:
            this.a(null, $$1);
            break;
         case 1015:
            this.u.a($$1, apd.ji, ape.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.u.a($$1, apd.jh, ape.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.u.a($$1, apd.gZ, ape.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.u.a($$1, apd.bV, ape.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.u.a($$1, apd.Bb, ape.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.u.a($$1, apd.Bc, ape.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.u.a($$1, apd.Bd, ape.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.u.a($$1, apd.Ak, ape.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.u.a($$1, apd.An, ape.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.u.a($$1, apd.bu, ape.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.u.a($$1, apd.Bl, ape.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.u.a($$1, apd.Bs, ape.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.u.a($$1, apd.V, ape.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.u.a($$1, apd.ab, ape.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.u.a($$1, apd.Y, ape.e, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.q.ai().a(gch.b(apd.sV, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.u.a($$1, apd.ez, ape.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.u.a($$1, apd.ey, ape.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.u.a($$1, apd.ck, ape.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.u.a($$1, apd.rJ, ape.f, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.u.a($$1, apd.Be, ape.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.u.a($$1, apd.ly, ape.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.u.a($$1, apd.kh, ape.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.u.a($$1, apd.ce, ape.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.u.a($$1, apd.ww, ape.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.u.a($$1, apd.gp, ape.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.u.a($$1, apd.gs, ape.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.u.a($$1, apd.gt, ape.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.u.a($$1, apd.vp, ape.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1500:
            cue.a(this.u, $$1, $$2 > 0);
            break;
         case 1501:
            this.u.a($$1, apd.mo, ape.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$70 = 0; $$70 < 8; $$70++) {
               this.u.a(iv.S, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.u.a($$1, apd.tI, ape.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$71 = 0; $$71 < 5; $$71++) {
               double $$72 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$73 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$74 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.u.a(iv.Z, $$72, $$73, $$74, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.u.a($$1, apd.ho, ape.e, 1.0F, 1.0F, false);

            for (int $$75 = 0; $$75 < 16; $$75++) {
               double $$76 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$77 = (double)$$1.v() + 0.8125;
               double $$78 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.u.a(iv.Z, $$76, $$77, $$78, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            cyl.a(this.u, $$1, this.u.a_($$1));
            break;
         case 1505:
            cha.a(this.u, $$1, $$2);
            this.u.a($$1, apd.cd, ape.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            ha $$4 = ha.a($$2);
            int $$5 = $$4.j();
            int $$6 = $$4.k();
            int $$7 = $$4.l();
            double $$8 = (double)$$1.u() + (double)$$5 * 0.6 + 0.5;
            double $$9 = (double)$$1.v() + (double)$$6 * 0.6 + 0.5;
            double $$10 = (double)$$1.w() + (double)$$7 * 0.6 + 0.5;

            for (int $$11 = 0; $$11 < 10; $$11++) {
               double $$12 = $$3.j() * 0.2 + 0.01;
               double $$13 = $$8 + (double)$$5 * 0.01 + ($$3.j() - 0.5) * (double)$$7 * 0.5;
               double $$14 = $$9 + (double)$$6 * 0.01 + ($$3.j() - 0.5) * (double)$$6 * 0.5;
               double $$15 = $$10 + (double)$$7 * 0.01 + ($$3.j() - 0.5) * (double)$$5 * 0.5;
               double $$16 = (double)$$5 * $$12 + $$3.k() * 0.01;
               double $$17 = (double)$$6 * $$12 + $$3.k() * 0.01;
               double $$18 = (double)$$7 * $$12 + $$3.k() * 0.01;
               this.a(iv.Z, $$13, $$14, $$15, $$16, $$17, $$18);
            }
            break;
         case 2001:
            dfj $$38 = csv.a($$2);
            if (!$$38.i()) {
               dai $$39 = $$38.w();
               this.u.a($$1, $$39.c(), ape.e, ($$39.a() + 1.0F) / 2.0F, $$39.b() * 0.8F, false);
            }

            this.u.a($$1, $$38);
            break;
         case 2002:
         case 2007:
            ehn $$24 = ehn.c($$1);

            for (int $$25 = 0; $$25 < 8; $$25++) {
               this.a(new ir(iv.O, new cjf(cji.uu)), $$24.c, $$24.d, $$24.e, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            float $$26 = (float)($$2 >> 16 & 0xFF) / 255.0F;
            float $$27 = (float)($$2 >> 8 & 0xFF) / 255.0F;
            float $$28 = (float)($$2 >> 0 & 0xFF) / 255.0F;
            it $$29 = $$0 == 2007 ? iv.N : iv.q;

            for (int $$30 = 0; $$30 < 100; $$30++) {
               double $$31 = $$3.j() * 4.0;
               double $$32 = $$3.j() * Math.PI * 2.0;
               double $$33 = Math.cos($$32) * $$31;
               double $$34 = 0.01 + $$3.j() * 0.5;
               double $$35 = Math.sin($$32) * $$31;
               flu $$36 = this.b($$29, $$29.b().c(), $$24.c + $$33 * 0.1, $$24.d + 0.3, $$24.e + $$35 * 0.1, $$33, $$34, $$35);
               if ($$36 != null) {
                  float $$37 = 0.75F + $$3.i() * 0.25F;
                  $$36.a($$26 * $$37, $$27 * $$37, $$28 * $$37);
                  $$36.c((float)$$31);
               }
            }

            this.u.a($$1, apd.xc, ape.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$19 = (double)$$1.u() + 0.5;
            double $$20 = (double)$$1.v();
            double $$21 = (double)$$1.w() + 0.5;

            for (int $$22 = 0; $$22 < 8; $$22++) {
               this.a(new ir(iv.O, new cjf(cji.rD)), $$19, $$20, $$21, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$23 = 0.0; $$23 < Math.PI * 2; $$23 += Math.PI / 20) {
               this.a(iv.X, $$19 + Math.cos($$23) * 5.0, $$20 - 0.4, $$21 + Math.sin($$23) * 5.0, Math.cos($$23) * -5.0, 0.0, Math.sin($$23) * -5.0);
               this.a(iv.X, $$19 + Math.cos($$23) * 5.0, $$20 - 0.4, $$21 + Math.sin($$23) * 5.0, Math.cos($$23) * -7.0, 0.0, Math.sin($$23) * -7.0);
            }
            break;
         case 2004:
            for (int $$42 = 0; $$42 < 20; $$42++) {
               double $$43 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$44 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$45 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.u.a(iv.Z, $$43, $$44, $$45, 0.0, 0.0, 0.0);
               this.u.a(iv.C, $$43, $$44, $$45, 0.0, 0.0, 0.0);
            }
            break;
         case 2005:
            cha.a(this.u, $$1, $$2);
            break;
         case 2006:
            for (int $$79 = 0; $$79 < 200; $$79++) {
               float $$80 = $$3.i() * 4.0F;
               float $$81 = $$3.i() * (float) (Math.PI * 2);
               double $$82 = (double)(arw.b($$81) * $$80);
               double $$83 = 0.01 + $$3.j() * 0.5;
               double $$84 = (double)(arw.a($$81) * $$80);
               flu $$85 = this.b(iv.i, false, (double)$$1.u() + $$82 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$84 * 0.1, $$82, $$83, $$84);
               if ($$85 != null) {
                  $$85.c($$80);
               }
            }

            if ($$2 == 1) {
               this.u.a($$1, apd.gV, ape.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.u.a(iv.x, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$86 = 0; $$86 < 8; $$86++) {
               this.u.a(iv.f, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 3000:
            this.u.a(iv.w, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.u.a($$1, apd.hn, ape.e, 10.0F, (1.0F + (this.u.z.i() - this.u.z.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.u.a($$1, apd.gX, ape.f, 64.0F, 0.8F + this.u.z.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < ha.a.d.length) {
               arz.a(ha.a.d[$$2], this.u, $$1, 0.125, iv.aN, bgj.a(10, 19));
            } else {
               arz.a(this.u, $$1, iv.aN, bgj.a(3, 5));
            }
            break;
         case 3003:
            arz.a(this.u, $$1, iv.aL, bgj.a(3, 5));
            this.u.a($$1, apd.la, ape.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            arz.a(this.u, $$1, iv.aM, bgj.a(3, 5));
            break;
         case 3005:
            arz.a(this.u, $$1, iv.aO, bgj.a(3, 5));
            break;
         case 3006:
            int $$46 = $$2 >> 6;
            if ($$46 > 0) {
               if ($$3.i() < 0.3F + (float)$$46 * 0.1F) {
                  float $$47 = 0.15F + 0.02F * (float)$$46 * (float)$$46 * $$3.i();
                  float $$48 = 0.4F + 0.3F * (float)$$46 * $$3.i();
                  this.u.a($$1, apd.uh, ape.e, $$47, $$48, false);
               }

               byte $$49 = (byte)($$2 & 63);
               bgd $$50 = bgj.a(0, $$46);
               float $$51 = 0.005F;
               Supplier<ehn> $$52 = () -> new ehn(arw.a($$3, -0.005F, 0.005F), arw.a($$3, -0.005F, 0.005F), arw.a($$3, -0.005F, 0.005F));
               if ($$49 == 0) {
                  for (ha $$53 : ha.values()) {
                     float $$54 = $$53 == ha.a ? (float) Math.PI : 0.0F;
                     double $$55 = $$53.o() == ha.a.b ? 0.65 : 0.57;
                     arz.a(this.u, $$1, new iw($$54), $$50, $$53, $$52, $$55);
                  }
               } else {
                  for (ha $$56 : cxt.a($$49)) {
                     float $$57 = $$56 == ha.b ? (float) Math.PI : 0.0F;
                     double $$58 = 0.35;
                     arz.a(this.u, $$1, new iw($$57), $$50, $$56, $$52, 0.35);
                  }
               }
            } else {
               this.u.a($$1, apd.uh, ape.e, 1.0F, 1.0F, false);
               boolean $$59 = this.u.a_($$1).r(this.u, $$1);
               int $$60 = $$59 ? 40 : 20;
               float $$61 = $$59 ? 0.45F : 0.25F;
               float $$62 = 0.07F;

               for (int $$63 = 0; $$63 < $$60; $$63++) {
                  float $$64 = 2.0F * $$3.i() - 1.0F;
                  float $$65 = 2.0F * $$3.i() - 1.0F;
                  float $$66 = 2.0F * $$3.i() - 1.0F;
                  this.u
                     .a(
                        iv.G,
                        (double)$$1.u() + 0.5 + (double)($$64 * $$61),
                        (double)$$1.v() + 0.5 + (double)($$65 * $$61),
                        (double)$$1.w() + 0.5 + (double)($$66 * $$61),
                        (double)($$64 * 0.07F),
                        (double)($$65 * 0.07F),
                        (double)($$66 * 0.07F)
                     );
               }
            }
            break;
         case 3007:
            for (int $$67 = 0; $$67 < 10; $$67++) {
               this.u.a(new ix($$67 * 5), false, (double)$$1.u() + 0.5, (double)$$1.v() + czp.e, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dfj $$68 = this.u.a_($$1);
            boolean $$69 = $$68.b(dfz.C) && $$68.c(dfz.C);
            if (!$$69) {
               this.u.a((double)$$1.u() + 0.5, (double)$$1.v() + czp.e, (double)$$1.w() + 0.5, apd.uE, ape.e, 2.0F, 0.6F + this.u.z.i() * 0.4F, false);
            }
            break;
         case 3008:
            dfj $$40 = csv.a($$2);
            if ($$40.b() instanceof csz $$41) {
               this.u.a($$1, $$41.c(), ape.h, 1.0F, 1.0F, false);
            }

            this.u.a($$1, $$40);
            break;
         case 3009:
            arz.a(this.u, $$1, iv.aQ, bgj.a(3, 6));
      }
   }

   public void c(int $$0, gw $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         ajx $$4 = (ajx)this.G.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new ajx($$0, $$1);
            this.G.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.F);
         ((SortedSet)this.H.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         ajx $$3 = (ajx)this.G.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean q() {
      return this.ae.h();
   }

   public void a(cpc $$0) {
      this.v.a($$0);
   }

   public void r() {
      this.v.a();
      this.C = true;
   }

   public void a(Collection<dcv> $$0, Collection<dcv> $$1) {
      synchronized (this.x) {
         this.x.removeAll($$0);
         this.x.addAll($$1);
      }
   }

   public static int a(coy $$0, gw $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(coy $$0, dfj $$1, gw $$2) {
      if ($$1.e($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(cqe.a, $$2);
         int $$4 = $$0.a(cqe.b, $$2);
         int $$5 = $$1.h();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(gw $$0) {
      frc.b $$1 = this.y.a($$0);
      return $$1 != null && $$1.c.get() != frc.a.a;
   }

   @Nullable
   public ekb s() {
      return this.J;
   }

   @Nullable
   public ekb t() {
      return this.L;
   }

   @Nullable
   public ekb u() {
      return this.M;
   }

   @Nullable
   public ekb v() {
      return this.N;
   }

   @Nullable
   public ekb w() {
      return this.O;
   }

   @Nullable
   public ekb x() {
      return this.P;
   }

   public static class a extends RuntimeException {
      public a(String $$0, Throwable $$1) {
         super($$0, $$1);
      }
   }
}
