import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
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
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3d;
import org.joml.Vector4f;
import org.slf4j.Logger;

public class fjv implements aky, AutoCloseable {
   private static final Logger c = LogUtils.getLogger();
   public static final int a = 16;
   private static final int d = 8;
   private static final float e = 512.0F;
   private static final int f = 60;
   private static final double g = Math.ceil(Math.sqrt(3.0) * 16.0);
   private static final int h = 32;
   private static final int i = 10;
   private static final int j = 21;
   private static final int k = 15;
   private static final int l = 500;
   private static final acq m = new acq("textures/environment/moon_phases.png");
   private static final acq n = new acq("textures/environment/sun.png");
   private static final acq o = new acq("textures/environment/clouds.png");
   private static final acq p = new acq("textures/environment/end_sky.png");
   private static final acq q = new acq("textures/misc/forcefield.png");
   private static final acq r = new acq("textures/environment/rain.png");
   private static final acq s = new acq("textures/environment/snow.png");
   public static final ha[] b = ha.values();
   private final enn t;
   private final fow u;
   private final flt v;
   private final fkd w;
   @Nullable
   private few x;
   private final BlockingQueue<fmp.c> y = new LinkedBlockingQueue<>();
   private final AtomicReference<fjv.b> z = new AtomicReference<>();
   private final ObjectArrayList<fjv.a> A = new ObjectArrayList(10000);
   private final Set<czn> B = Sets.newHashSet();
   @Nullable
   private Future<?> C;
   @Nullable
   private fkl D;
   @Nullable
   private eim E;
   @Nullable
   private eim F;
   @Nullable
   private eim G;
   private boolean H = true;
   @Nullable
   private eim I;
   private final fkg J = new fkg(100);
   private int K;
   private final Int2ObjectMap<aho> L = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<aho>> M = new Long2ObjectOpenHashMap();
   private final Map<gu, fxy> N = Maps.newHashMap();
   @Nullable
   private egv O;
   @Nullable
   private fka P;
   @Nullable
   private egv Q;
   @Nullable
   private egv R;
   @Nullable
   private egv S;
   @Nullable
   private egv T;
   @Nullable
   private egv U;
   @Nullable
   private fka V;
   private double W = Double.MIN_VALUE;
   private double X = Double.MIN_VALUE;
   private double Y = Double.MIN_VALUE;
   private int Z = Integer.MIN_VALUE;
   private int aa = Integer.MIN_VALUE;
   private int ab = Integer.MIN_VALUE;
   private double ac = Double.MIN_VALUE;
   private double ad = Double.MIN_VALUE;
   private double ae = Double.MIN_VALUE;
   private double af = Double.MIN_VALUE;
   private double ag = Double.MIN_VALUE;
   private int ah = Integer.MIN_VALUE;
   private int ai = Integer.MIN_VALUE;
   private int aj = Integer.MIN_VALUE;
   private eei ak = eei.b;
   @Nullable
   private enc al;
   @Nullable
   private fmp am;
   private int an = -1;
   private int ao;
   private int ap;
   private fmw aq;
   private boolean ar;
   @Nullable
   private fmw as;
   private final Vector4f[] at = new Vector4f[8];
   private final Vector3d au = new Vector3d(0.0, 0.0, 0.0);
   private double av;
   private double aw;
   private double ax;
   private boolean ay = true;
   private final AtomicLong az = new AtomicLong(0L);
   private final AtomicBoolean aA = new AtomicBoolean(false);
   private int aB;
   private final float[] aC = new float[1024];
   private final float[] aD = new float[1024];

   public fjv(enn $$0, fow $$1, flt $$2, fkd $$3) {
      this.t = $$0;
      this.u = $$1;
      this.v = $$2;
      this.w = $$3;

      for (int $$4 = 0; $$4 < 32; $$4++) {
         for (int $$5 = 0; $$5 < 32; $$5++) {
            float $$6 = (float)($$5 - 16);
            float $$7 = (float)($$4 - 16);
            float $$8 = apa.c($$6 * $$6 + $$7 * $$7);
            this.aC[$$4 << 5 | $$5] = -$$7 / $$8;
            this.aD[$$4 << 5 | $$5] = $$6 / $$8;
         }
      }

      this.C();
      this.B();
      this.A();
   }

   private void a(fjw $$0, float $$1, double $$2, double $$3, double $$4) {
      float $$5 = this.t.s.d($$1);
      if (!($$5 <= 0.0F)) {
         $$0.c();
         cmm $$6 = this.t.s;
         int $$7 = apa.a($$2);
         int $$8 = apa.a($$3);
         int $$9 = apa.a($$4);
         eil $$10 = eil.a();
         eie $$11 = $$10.c();
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         int $$12 = 5;
         if (enn.K()) {
            $$12 = 10;
         }

         RenderSystem.depthMask(enn.L());
         int $$13 = -1;
         float $$14 = (float)this.K + $$1;
         RenderSystem.setShader(fjq::u);
         gu.a $$15 = new gu.a();

         for (int $$16 = $$9 - $$12; $$16 <= $$9 + $$12; $$16++) {
            for (int $$17 = $$7 - $$12; $$17 <= $$7 + $$12; $$17++) {
               int $$18 = ($$16 - $$9 + 16) * 32 + $$17 - $$7 + 16;
               double $$19 = (double)this.aC[$$18] * 0.5;
               double $$20 = (double)this.aD[$$18] * 0.5;
               $$15.b((double)$$17, $$3, (double)$$16);
               cnk $$21 = $$6.s($$15).a();
               if ($$21.c()) {
                  int $$22 = $$6.a(dhk.a.e, $$17, $$16);
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
                     apf $$26 = apf.a((long)($$17 * $$17 * 3121 + $$17 * 45238971 ^ $$16 * $$16 * 418711 + $$16 * 13761));
                     $$15.d($$17, $$23, $$16);
                     cnk.c $$27 = $$21.a($$15);
                     if ($$27 == cnk.c.b) {
                        if ($$13 != 0) {
                           if ($$13 >= 0) {
                              $$10.b();
                           }

                           $$13 = 0;
                           RenderSystem.setShaderTexture(0, r);
                           $$11.a(eio.b.h, eih.l);
                        }

                        int $$28 = this.K + $$17 * $$17 * 3121 + $$17 * 45238971 + $$16 * $$16 * 418711 + $$16 * 13761 & 31;
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
                     } else if ($$27 == cnk.c.c) {
                        if ($$13 != 1) {
                           if ($$13 >= 0) {
                              $$10.b();
                           }

                           $$13 = 1;
                           RenderSystem.setShaderTexture(0, s);
                           $$11.a(eio.b.h, eih.l);
                        }

                        float $$35 = -((float)(this.K & 511) + $$1) / 512.0F;
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

   public void a(emz $$0) {
      float $$1 = this.t.s.d(1.0F) / (enn.K() ? 1.0F : 2.0F);
      if (!($$1 <= 0.0F)) {
         apf $$2 = apf.a((long)this.K * 312987231L);
         cmp $$3 = this.t.s;
         gu $$4 = gu.a($$0.b());
         gu $$5 = null;
         int $$6 = (int)(100.0F * $$1 * $$1) / (this.t.m.am().c() == ens.b ? 2 : 1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            int $$8 = $$2.a(21) - 10;
            int $$9 = $$2.a(21) - 10;
            gu $$10 = $$3.a(dhk.a.e, $$4.b($$8, 0, $$9));
            if ($$10.v() > $$3.C_() && $$10.v() <= $$4.v() + 10 && $$10.v() >= $$4.v() - 10) {
               cnk $$11 = $$3.s($$10).a();
               if ($$11.a($$10) == cnk.c.b) {
                  $$5 = $$10.d();
                  if (this.t.m.am().c() == ens.c) {
                     break;
                  }

                  double $$12 = $$2.j();
                  double $$13 = $$2.j();
                  dcb $$14 = $$3.a_($$5);
                  dxe $$15 = $$3.b_($$5);
                  efb $$16 = $$14.k($$3, $$5);
                  double $$17 = $$16.b(ha.a.b, $$12, $$13);
                  double $$18 = (double)$$15.a($$3, $$5);
                  double $$19 = Math.max($$17, $$18);
                  it $$20 = !$$15.a(anb.b) && !$$14.a(cpo.kJ) && !cqa.g($$14) ? iv.Y : iv.Z;
                  this.t.s.a($$20, (double)$$5.u() + $$12, (double)$$5.v() + $$19, (double)$$5.w() + $$13, 0.0, 0.0, 0.0);
               }
            }
         }

         if ($$5 != null && $$2.a(3) < this.aB++) {
            this.aB = 0;
            if ($$5.v() > $$4.v() + 1 && $$3.a(dhk.a.e, $$4).v() > apa.d((float)$$4.v())) {
               this.t.s.a($$5, amh.zM, ami.d, 0.1F, 0.5F, false);
            } else {
               this.t.s.a($$5, amh.zL, ami.d, 0.2F, 1.0F, false);
            }
         }
      }
   }

   @Override
   public void close() {
      if (this.P != null) {
         this.P.close();
      }

      if (this.V != null) {
         this.V.close();
      }
   }

   @Override
   public void a(akx $$0) {
      this.a();
      if (enn.L()) {
         this.y();
      }
   }

   public void a() {
      if (this.P != null) {
         this.P.close();
      }

      acq $$0 = new acq("shaders/post/entity_outline.json");

      try {
         this.P = new fka(this.t.X(), this.t.Y(), this.t.f(), $$0);
         this.P.a(this.t.aM().k(), this.t.aM().l());
         this.O = this.P.a("final");
      } catch (IOException var3) {
         c.warn("Failed to load shader: {}", $$0, var3);
         this.P = null;
         this.O = null;
      } catch (JsonSyntaxException var4) {
         c.warn("Failed to parse shader: {}", $$0, var4);
         this.P = null;
         this.O = null;
      }
   }

   private void y() {
      this.z();
      acq $$0 = new acq("shaders/post/transparency.json");

      try {
         fka $$1 = new fka(this.t.X(), this.t.Y(), this.t.f(), $$0);
         $$1.a(this.t.aM().k(), this.t.aM().l());
         egv $$2 = $$1.a("translucent");
         egv $$3 = $$1.a("itemEntity");
         egv $$4 = $$1.a("particles");
         egv $$5 = $$1.a("weather");
         egv $$6 = $$1.a("clouds");
         this.V = $$1;
         this.Q = $$2;
         this.R = $$3;
         this.S = $$4;
         this.T = $$5;
         this.U = $$6;
      } catch (Exception var8) {
         String $$8 = var8 instanceof JsonSyntaxException ? "parse" : "load";
         String $$9 = "Failed to " + $$8 + " shader: " + $$0;
         fjv.d $$10 = new fjv.d($$9, var8);
         if (this.t.Z().d().size() > 1) {
            sw $$11 = this.t.Y().b().findFirst().map($$0x -> sw.b($$0x.a())).orElse(null);
            this.t.m.i().a(eng.b);
            this.t.a($$10, $$11);
         } else {
            o $$12 = this.t.d(new o($$9, $$10));
            this.t.m.i().a(eng.b);
            this.t.m.aq();
            c.error(LogUtils.FATAL_MARKER, $$9, $$10);
            this.t.o();
            enn.c($$12);
         }
      }
   }

   private void z() {
      if (this.V != null) {
         this.V.close();
         this.Q.a();
         this.R.a();
         this.S.a();
         this.T.a();
         this.U.a();
         this.V = null;
         this.Q = null;
         this.R = null;
         this.S = null;
         this.T = null;
         this.U = null;
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
         this.O.c(this.t.aM().k(), this.t.aM().l(), false);
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   protected boolean d() {
      return !this.t.j.a() && this.O != null && this.P != null && this.t.t != null;
   }

   private void A() {
      eil $$0 = eil.a();
      eie $$1 = $$0.c();
      if (this.G != null) {
         this.G.close();
      }

      this.G = new eim(eim.a.a);
      eie.b $$2 = a($$1, -16.0F);
      this.G.a();
      this.G.a($$2);
      eim.b();
   }

   private void B() {
      eil $$0 = eil.a();
      eie $$1 = $$0.c();
      if (this.F != null) {
         this.F.close();
      }

      this.F = new eim(eim.a.a);
      eie.b $$2 = a($$1, 16.0F);
      this.F.a();
      this.F.a($$2);
      eim.b();
   }

   private static eie.b a(eie $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      float $$3 = 512.0F;
      RenderSystem.setShader(fjq::p);
      $$0.a(eio.b.g, eih.m);
      $$0.a(0.0, (double)$$1, 0.0).e();

      for (int $$4 = -180; $$4 <= 180; $$4 += 45) {
         $$0.a((double)($$2 * apa.b((float)$$4 * (float) (Math.PI / 180.0))), (double)$$1, (double)(512.0F * apa.a((float)$$4 * (float) (Math.PI / 180.0))))
            .e();
      }

      return $$0.d();
   }

   private void C() {
      eil $$0 = eil.a();
      eie $$1 = $$0.c();
      RenderSystem.setShader(fjq::p);
      if (this.E != null) {
         this.E.close();
      }

      this.E = new eim(eim.a.a);
      eie.b $$2 = this.a($$1);
      this.E.a();
      this.E.a($$2);
      eim.b();
   }

   private eie.b a(eie $$0) {
      apf $$1 = apf.a(10842L);
      $$0.a(eio.b.h, eih.m);

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

   public void a(@Nullable few $$0) {
      this.W = Double.MIN_VALUE;
      this.X = Double.MIN_VALUE;
      this.Y = Double.MIN_VALUE;
      this.Z = Integer.MIN_VALUE;
      this.aa = Integer.MIN_VALUE;
      this.ab = Integer.MIN_VALUE;
      this.u.a($$0);
      this.x = $$0;
      if ($$0 != null) {
         this.f();
      } else {
         if (this.D != null) {
            this.D.a();
            this.D = null;
         }

         if (this.am != null) {
            this.am.i();
         }

         this.am = null;
         this.B.clear();
         this.z.set(null);
         this.A.clear();
      }
   }

   public void e() {
      if (enn.L()) {
         this.y();
      } else {
         this.z();
      }
   }

   public void f() {
      if (this.x != null) {
         this.e();
         this.x.g();
         if (this.am == null) {
            this.am = new fmp(this.x, this, ac.f(), this.t.ae(), this.w.a());
         } else {
            this.am.a(this.x);
         }

         this.ay = true;
         this.H = true;
         this.y.clear();
         fjs.a(enn.K());
         this.an = this.t.m.ax();
         if (this.D != null) {
            this.D.a();
         }

         this.am.g();
         synchronized (this.B) {
            this.B.clear();
         }

         this.D = new fkl(this.am, this.x, this.t.m.ax(), this);
         if (this.C != null) {
            try {
               this.C.get();
               this.C = null;
            } catch (Exception var3) {
               c.warn("Full update failed", var3);
            }
         }

         this.z.set(new fjv.b(this.D.f.length));
         this.A.clear();
         bfj $$1 = this.t.al();
         if ($$1 != null) {
            this.D.a($$1.dn(), $$1.dt());
         }
      }
   }

   public void a(int $$0, int $$1) {
      this.r();
      if (this.P != null) {
         this.P.a($$0, $$1);
      }

      if (this.V != null) {
         this.V.a($$0, $$1);
      }
   }

   public String g() {
      int $$0 = this.D.f.length;
      int $$1 = this.k();
      return String.format(Locale.ROOT, "C: %d/%d %sD: %d, %s", $$1, $$0, this.t.E ? "(s) " : "", this.an, this.am == null ? "null" : this.am.a());
   }

   public fmp h() {
      return this.am;
   }

   public double i() {
      return (double)this.D.f.length;
   }

   public double j() {
      return (double)this.an;
   }

   public int k() {
      int $$0 = 0;
      ObjectListIterator var2 = this.A.iterator();

      while (var2.hasNext()) {
         fjv.a $$1 = (fjv.a)var2.next();
         if (!$$1.a.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String l() {
      return "E: " + this.ao + "/" + this.x.h() + ", B: " + this.ap + ", SD: " + this.x.m();
   }

   private void a(emz $$0, fmw $$1, boolean $$2, boolean $$3) {
      eei $$4 = $$0.b();
      if (this.t.m.ax() != this.an) {
         this.f();
      }

      this.x.ad().a("camera");
      double $$5 = this.t.t.dn();
      double $$6 = this.t.t.dp();
      double $$7 = this.t.t.dt();
      int $$8 = hx.a($$5);
      int $$9 = hx.a($$6);
      int $$10 = hx.a($$7);
      if (this.Z != $$8 || this.aa != $$9 || this.ab != $$10) {
         this.W = $$5;
         this.X = $$6;
         this.Y = $$7;
         this.Z = $$8;
         this.aa = $$9;
         this.ab = $$10;
         this.D.a($$5, $$7);
      }

      this.am.a($$4);
      this.x.ad().b("cull");
      this.t.aG().b("culling");
      gu $$11 = $$0.c();
      double $$12 = Math.floor($$4.c / 8.0);
      double $$13 = Math.floor($$4.d / 8.0);
      double $$14 = Math.floor($$4.e / 8.0);
      this.ay = this.ay || $$12 != this.ac || $$13 != this.ad || $$14 != this.ae;
      this.az.updateAndGet($$0x -> {
         if ($$0x > 0L && System.currentTimeMillis() > $$0x) {
            this.ay = true;
            return 0L;
         } else {
            return $$0x;
         }
      });
      this.ac = $$12;
      this.ad = $$13;
      this.ae = $$14;
      this.t.aG().b("update");
      boolean $$15 = this.t.E;
      if ($$3 && this.x.a_($$11).i(this.x, $$11)) {
         $$15 = false;
      }

      if (!$$2) {
         if (this.ay && (this.C == null || this.C.isDone())) {
            this.t.aG().a("full_update_schedule");
            this.ay = false;
            boolean $$16 = $$15;
            this.C = ac.f().submit(() -> {
               Queue<fjv.a> $$3x = Queues.newArrayDeque();
               this.a($$0, $$3x);
               fjv.b $$4x = new fjv.b(this.D.f.length);
               this.a($$4x.b, $$4x.a, $$4, $$3x, $$16);
               this.z.set($$4x);
               this.aA.set(true);
            });
            this.t.aG().c();
         }

         fjv.b $$17 = this.z.get();
         if (!this.y.isEmpty()) {
            this.t.aG().a("partial_update");
            Queue<fjv.a> $$18 = Queues.newArrayDeque();

            while (!this.y.isEmpty()) {
               fmp.c $$19 = this.y.poll();
               fjv.a $$20 = $$17.a.a($$19);
               if ($$20 != null && $$20.a == $$19) {
                  $$18.add($$20);
               }
            }

            this.a($$17.b, $$17.a, $$4, $$18, $$15);
            this.aA.set(true);
            this.t.aG().c();
         }

         double $$21 = Math.floor((double)($$0.d() / 2.0F));
         double $$22 = Math.floor((double)($$0.e() / 2.0F));
         if (this.aA.compareAndSet(true, false) || $$21 != this.af || $$22 != this.ag) {
            this.a(new fmw($$1).a(8));
            this.af = $$21;
            this.ag = $$22;
         }
      }

      this.t.aG().c();
   }

   private void a(fmw $$0) {
      if (!enn.N().bl()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.t.aG().a("apply_frustum");
         this.A.clear();

         for (fjv.a $$1 : this.z.get().b) {
            if ($$0.a($$1.a.b())) {
               this.A.add($$1);
            }
         }

         this.t.aG().c();
      }
   }

   private void a(emz $$0, Queue<fjv.a> $$1) {
      int $$2 = 16;
      eei $$3 = $$0.b();
      gu $$4 = $$0.c();
      fmp.c $$5 = this.D.a($$4);
      if ($$5 == null) {
         boolean $$6 = $$4.v() > this.x.C_();
         int $$7 = $$6 ? this.x.aj() - 8 : this.x.C_() + 8;
         int $$8 = apa.a($$3.c / 16.0) * 16;
         int $$9 = apa.a($$3.e / 16.0) * 16;
         List<fjv.a> $$10 = Lists.newArrayList();

         for (int $$11 = -this.an; $$11 <= this.an; $$11++) {
            for (int $$12 = -this.an; $$12 <= this.an; $$12++) {
               fmp.c $$13 = this.D.a(new gu($$8 + hx.a($$11, 8), $$7, $$9 + hx.a($$12, 8)));
               if ($$13 != null) {
                  $$10.add(new fjv.a($$13, null, 0));
               }
            }
         }

         $$10.sort(Comparator.comparingDouble($$1x -> $$4.j($$1x.a.f().b(8, 8, 8))));
         $$1.addAll($$10);
      } else {
         $$1.add(new fjv.a($$5, null, 0));
      }
   }

   public void a(fmp.c $$0) {
      this.y.add($$0);
   }

   private void a(LinkedHashSet<fjv.a> $$0, fjv.c $$1, eei $$2, Queue<fjv.a> $$3, boolean $$4) {
      int $$5 = 16;
      gu $$6 = new gu(apa.a($$2.c / 16.0) * 16, apa.a($$2.d / 16.0) * 16, apa.a($$2.e / 16.0) * 16);
      gu $$7 = $$6.b(8, 8, 8);
      bfj.b(apa.a((double)this.t.m.ax() / 8.0, 1.0, 2.5) * this.t.m.f().c());

      while (!$$3.isEmpty()) {
         fjv.a $$8 = $$3.poll();
         fmp.c $$9 = $$8.a;
         $$0.add($$8);
         boolean $$10 = Math.abs($$9.f().u() - $$6.u()) > 60 || Math.abs($$9.f().v() - $$6.v()) > 60 || Math.abs($$9.f().w() - $$6.w()) > 60;

         for (ha $$11 : b) {
            fmp.c $$12 = this.a($$6, $$9, $$11);
            if ($$12 != null && (!$$4 || !$$8.a($$11.g()))) {
               if ($$4 && $$8.a()) {
                  fmp.b $$13 = $$9.d();
                  boolean $$14 = false;

                  for (int $$15 = 0; $$15 < b.length; $$15++) {
                     if ($$8.a($$15) && $$13.a(b[$$15].g(), $$11)) {
                        $$14 = true;
                        break;
                     }
                  }

                  if (!$$14) {
                     continue;
                  }
               }

               if ($$4 && $$10) {
                  gu $$16 = $$12.f();
                  gu $$17 = $$16.b(
                     ($$11.o() == ha.a.a ? $$7.u() <= $$16.u() : $$7.u() >= $$16.u()) ? 0 : 16,
                     ($$11.o() == ha.a.b ? $$7.v() <= $$16.v() : $$7.v() >= $$16.v()) ? 0 : 16,
                     ($$11.o() == ha.a.c ? $$7.w() <= $$16.w() : $$7.w() >= $$16.w()) ? 0 : 16
                  );
                  eei $$18 = new eei((double)$$17.u(), (double)$$17.v(), (double)$$17.w());
                  eei $$19 = $$2.d($$18).d().a(g);
                  boolean $$20 = true;

                  while ($$2.d($$18).g() > 3600.0) {
                     $$18 = $$18.e($$19);
                     if ($$18.d > (double)this.x.aj() || $$18.d < (double)this.x.C_()) {
                        break;
                     }

                     fmp.c $$21 = this.D.a(gu.a($$18.c, $$18.d, $$18.e));
                     if ($$21 == null || $$1.a($$21) == null) {
                        $$20 = false;
                        break;
                     }
                  }

                  if (!$$20) {
                     continue;
                  }
               }

               fjv.a $$22 = $$1.a($$12);
               if ($$22 != null) {
                  $$22.b($$11);
               } else if (!$$12.a()) {
                  if (!this.a($$6, $$9)) {
                     this.az.set(System.currentTimeMillis() + 500L);
                  }
               } else {
                  fjv.a $$23 = new fjv.a($$12, $$11, $$8.d + 1);
                  $$23.a($$8.c, $$11);
                  $$3.add($$23);
                  $$1.a($$12, $$23);
               }
            }
         }
      }
   }

   @Nullable
   private fmp.c a(gu $$0, fmp.c $$1, ha $$2) {
      gu $$3 = $$1.a($$2);
      if (apa.a($$0.u() - $$3.u()) > this.an * 16) {
         return null;
      } else if (apa.a($$0.v() - $$3.v()) > this.an * 16 || $$3.v() < this.x.C_() || $$3.v() >= this.x.aj()) {
         return null;
      } else {
         return apa.a($$0.w() - $$3.w()) > this.an * 16 ? null : this.D.a($$3);
      }
   }

   private boolean a(gu $$0, fmp.c $$1) {
      int $$2 = hx.a($$0.u());
      int $$3 = hx.a($$0.w());
      gu $$4 = $$1.f();
      int $$5 = hx.a($$4.u());
      int $$6 = hx.a($$4.w());
      return !ahr.a($$5, $$6, $$2, $$3, this.an - 3);
   }

   private void a(Matrix4f $$0, Matrix4f $$1, double $$2, double $$3, double $$4, fmw $$5) {
      this.as = $$5;
      Matrix4f $$6 = new Matrix4f($$1);
      $$6.mul($$0);
      $$6.invert();
      this.au.x = $$2;
      this.au.y = $$3;
      this.au.z = $$4;
      this.at[0] = new Vector4f(-1.0F, -1.0F, -1.0F, 1.0F);
      this.at[1] = new Vector4f(1.0F, -1.0F, -1.0F, 1.0F);
      this.at[2] = new Vector4f(1.0F, 1.0F, -1.0F, 1.0F);
      this.at[3] = new Vector4f(-1.0F, 1.0F, -1.0F, 1.0F);
      this.at[4] = new Vector4f(-1.0F, -1.0F, 1.0F, 1.0F);
      this.at[5] = new Vector4f(1.0F, -1.0F, 1.0F, 1.0F);
      this.at[6] = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.at[7] = new Vector4f(-1.0F, 1.0F, 1.0F, 1.0F);

      for (int $$7 = 0; $$7 < 8; $$7++) {
         $$6.transform(this.at[$$7]);
         this.at[$$7].div(this.at[$$7].w());
      }
   }

   public void a(eij $$0, eei $$1, Matrix4f $$2) {
      Matrix4f $$3 = $$0.c().a();
      double $$4 = $$1.a();
      double $$5 = $$1.b();
      double $$6 = $$1.c();
      this.aq = new fmw($$3, $$2);
      this.aq.a($$4, $$5, $$6);
   }

   public void a(eij $$0, float $$1, long $$2, boolean $$3, emz $$4, fjq $$5, fjw $$6, Matrix4f $$7) {
      RenderSystem.setShaderGameTime(this.x.V(), $$1);
      this.v.a(this.x, $$4, this.t.w);
      this.u.a(this.x, $$4, this.t.v);
      ban $$8 = this.x.ad();
      $$8.b("light_update_queue");
      this.x.b();
      $$8.b("light_updates");
      this.x.i().p().a();
      eei $$9 = $$4.b();
      double $$10 = $$9.a();
      double $$11 = $$9.b();
      double $$12 = $$9.c();
      Matrix4f $$13 = $$0.c().a();
      $$8.b("culling");
      boolean $$14 = this.as != null;
      fmw $$15;
      if ($$14) {
         $$15 = this.as;
         $$15.a(this.au.x, this.au.y, this.au.z);
      } else {
         $$15 = this.aq;
      }

      this.t.aG().b("captureFrustum");
      if (this.ar) {
         this.a($$13, $$7, $$9.c, $$9.d, $$9.e, $$14 ? new fmw($$13, $$7) : $$15);
         this.ar = false;
      }

      $$8.b("clear");
      fjp.a($$4, $$1, this.t.s, this.t.m.ax(), $$5.b($$1));
      fjp.b();
      RenderSystem.clear(16640, enn.a);
      float $$17 = $$5.l();
      boolean $$18 = this.t.s.d().a(apa.a($$10), apa.a($$11)) || this.t.l.j().d();
      $$8.b("sky");
      RenderSystem.setShader(fjq::p);
      this.a($$0, $$7, $$1, $$4, $$18, () -> fjp.a($$4, fjp.d.a, $$17, $$18, $$1));
      $$8.b("fog");
      fjp.a($$4, fjp.d.b, Math.max($$17, 32.0F), $$18, $$1);
      $$8.b("terrain_setup");
      this.a($$4, $$15, $$14, this.t.t.G_());
      $$8.b("compilechunks");
      this.c($$4);
      $$8.b("terrain");
      this.a(fkf.c(), $$0, $$10, $$11, $$12, $$7);
      this.a(fkf.d(), $$0, $$10, $$11, $$12, $$7);
      this.a(fkf.e(), $$0, $$10, $$11, $$12, $$7);
      if (this.x.d().e()) {
         ehf.a($$0.c().a());
      } else {
         ehf.b($$0.c().a());
      }

      $$8.b("entities");
      this.ao = 0;
      this.ap = 0;
      if (this.R != null) {
         this.R.b(enn.a);
         this.R.a(this.t.f());
         this.t.f().a(false);
      }

      if (this.T != null) {
         this.T.b(enn.a);
      }

      if (this.d()) {
         this.O.b(enn.a);
         this.t.f().a(false);
      }

      boolean $$19 = false;
      fjx.a $$20 = this.w.b();

      for (bfj $$21 : this.x.e()) {
         if (this.u.a($$21, $$15, $$10, $$11, $$12) || $$21.w(this.t.t)) {
            gu $$22 = $$21.di();
            if ((this.x.d($$22.v()) || this.a($$22))
               && ($$21 != $$4.g() || $$4.i() || $$4.g() instanceof bfz && ((bfz)$$4.g()).fy())
               && (!($$21 instanceof fiy) || $$4.g() == $$21)) {
               this.ao++;
               if ($$21.ag == 0) {
                  $$21.ab = $$21.dn();
                  $$21.ac = $$21.dp();
                  $$21.ad = $$21.dt();
               }

               fjx $$24;
               if (this.d() && this.t.b($$21)) {
                  $$19 = true;
                  fjy $$23 = this.w.d();
                  $$24 = $$23;
                  int $$25 = $$21.k_();
                  $$23.a(aok.b.b($$25), aok.b.c($$25), aok.b.d($$25), 255);
               } else {
                  $$24 = $$20;
               }

               this.a($$21, $$10, $$11, $$12, $$1, $$0, $$24);
            }
         }
      }

      $$20.a();
      this.a($$0);
      $$20.a(fkf.b(fuu.e));
      $$20.a(fkf.c(fuu.e));
      $$20.a(fkf.d(fuu.e));
      $$20.a(fkf.j(fuu.e));
      $$8.b("blockentities");
      ObjectListIterator var39 = this.A.iterator();

      while (var39.hasNext()) {
         fjv.a $$27 = (fjv.a)var39.next();
         List<czn> $$28 = $$27.a.d().b();
         if (!$$28.isEmpty()) {
            for (czn $$29 : $$28) {
               gu $$30 = $$29.p();
               fjx $$31 = $$20;
               $$0.a();
               $$0.a((double)$$30.u() - $$10, (double)$$30.v() - $$11, (double)$$30.w() - $$12);
               SortedSet<aho> $$32 = (SortedSet<aho>)this.M.get($$30.a());
               if ($$32 != null && !$$32.isEmpty()) {
                  int $$33 = $$32.last().c();
                  if ($$33 >= 0) {
                     eij.a $$34 = $$0.c();
                     ein $$35 = new eik(this.w.c().getBuffer(fww.l.get($$33)), $$34.a(), $$34.b(), 1.0F);
                     $$31 = $$2x -> {
                        ein $$3x = $$20.getBuffer($$2x);
                        return $$2x.M() ? eiq.a($$35, $$3x) : $$3x;
                     };
                  }
               }

               this.v.a($$29, $$1, $$0, $$31);
               $$0.b();
            }
         }
      }

      synchronized (this.B) {
         for (czn $$36 : this.B) {
            gu $$37 = $$36.p();
            $$0.a();
            $$0.a((double)$$37.u() - $$10, (double)$$37.v() - $$11, (double)$$37.w() - $$12);
            this.v.a($$36, $$1, $$0, $$20);
            $$0.b();
         }
      }

      this.a($$0);
      $$20.a(fkf.c());
      $$20.a(fkf.v());
      $$20.a(fkf.w());
      $$20.a(fkj.i());
      $$20.a(fkj.j());
      $$20.a(fkj.c());
      $$20.a(fkj.d());
      $$20.a(fkj.e());
      $$20.a(fkj.f());
      $$20.a(fkj.g());
      this.w.d().a();
      if ($$19) {
         this.P.a($$1);
         this.t.f().a(false);
      }

      $$8.b("destroyProgress");
      ObjectIterator var41 = this.M.long2ObjectEntrySet().iterator();

      while (var41.hasNext()) {
         Entry<SortedSet<aho>> $$38 = (Entry<SortedSet<aho>>)var41.next();
         gu $$39 = gu.d($$38.getLongKey());
         double $$40 = (double)$$39.u() - $$10;
         double $$41 = (double)$$39.v() - $$11;
         double $$42 = (double)$$39.w() - $$12;
         if (!($$40 * $$40 + $$41 * $$41 + $$42 * $$42 > 1024.0)) {
            SortedSet<aho> $$43 = (SortedSet<aho>)$$38.getValue();
            if ($$43 != null && !$$43.isEmpty()) {
               int $$44 = $$43.last().c();
               $$0.a();
               $$0.a((double)$$39.u() - $$10, (double)$$39.v() - $$11, (double)$$39.w() - $$12);
               eij.a $$45 = $$0.c();
               ein $$46 = new eik(this.w.c().getBuffer(fww.l.get($$44)), $$45.a(), $$45.b(), 1.0F);
               this.t.am().a(this.x.a_($$39), $$39, this.x, $$0, $$46);
               $$0.b();
            }
         }
      }

      this.a($$0);
      eeg $$47 = this.t.w;
      if ($$3 && $$47 != null && $$47.c() == eeg.a.b) {
         $$8.b("outline");
         gu $$48 = ((eee)$$47).a();
         dcb $$49 = this.x.a_($$48);
         if (!$$49.i() && this.x.w_().a($$48)) {
            ein $$50 = $$20.getBuffer(fkf.x());
            this.a($$0, $$50, $$4.g(), $$10, $$11, $$12, $$48, $$49);
         }
      }

      this.t.k.a($$0, $$20, $$10, $$11, $$12);
      $$20.a();
      eij $$51 = RenderSystem.getModelViewStack();
      RenderSystem.applyModelViewMatrix();
      $$20.a(fkj.l());
      $$20.a(fkj.a());
      $$20.a(fkj.b());
      $$20.a(fkf.k());
      $$20.a(fkf.l());
      $$20.a(fkf.n());
      $$20.a(fkf.o());
      $$20.a(fkf.m());
      $$20.a(fkf.p());
      $$20.a(fkf.q());
      $$20.a(fkf.j());
      this.w.c().b();
      if (this.V != null) {
         $$20.a(fkf.x());
         $$20.b();
         this.Q.b(enn.a);
         this.Q.a(this.t.f());
         $$8.b("translucent");
         this.a(fkf.f(), $$0, $$10, $$11, $$12, $$7);
         $$8.b("string");
         this.a(fkf.u(), $$0, $$10, $$11, $$12, $$7);
         this.S.b(enn.a);
         this.S.a(this.t.f());
         fke.aL.a();
         $$8.b("particles");
         this.t.g.a($$0, $$20, $$6, $$4, $$1);
         fke.aL.b();
      } else {
         $$8.b("translucent");
         if (this.Q != null) {
            this.Q.b(enn.a);
         }

         this.a(fkf.f(), $$0, $$10, $$11, $$12, $$7);
         $$20.a(fkf.x());
         $$20.b();
         $$8.b("string");
         this.a(fkf.u(), $$0, $$10, $$11, $$12, $$7);
         $$8.b("particles");
         this.t.g.a($$0, $$20, $$6, $$4, $$1);
      }

      $$51.a();
      $$51.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();
      if (this.t.m.as() != enc.a) {
         if (this.V != null) {
            this.U.b(enn.a);
            fke.aN.a();
            $$8.b("clouds");
            this.a($$0, $$7, $$1, $$10, $$11, $$12);
            fke.aN.b();
         } else {
            $$8.b("clouds");
            RenderSystem.setShader(fjq::x);
            this.a($$0, $$7, $$1, $$10, $$11, $$12);
         }
      }

      if (this.V != null) {
         fke.aM.a();
         $$8.b("weather");
         this.a($$6, $$1, $$10, $$11, $$12);
         this.d($$4);
         fke.aM.b();
         this.V.a($$1);
         this.t.f().a(false);
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
      fjp.a();
   }

   private void a(eij $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(bfj $$0, double $$1, double $$2, double $$3, float $$4, eij $$5, fjx $$6) {
      double $$7 = apa.d((double)$$4, $$0.ab, $$0.dn());
      double $$8 = apa.d((double)$$4, $$0.ac, $$0.dp());
      double $$9 = apa.d((double)$$4, $$0.ad, $$0.dt());
      float $$10 = apa.i($$4, $$0.M, $$0.dy());
      this.u.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$10, $$4, $$5, $$6, this.u.a($$0, $$4));
   }

   private void a(fkf $$0, eij $$1, double $$2, double $$3, double $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      $$0.a();
      if ($$0 == fkf.f()) {
         this.t.aG().a("translucent_sort");
         double $$6 = $$2 - this.av;
         double $$7 = $$3 - this.aw;
         double $$8 = $$4 - this.ax;
         if ($$6 * $$6 + $$7 * $$7 + $$8 * $$8 > 1.0) {
            int $$9 = hx.a($$2);
            int $$10 = hx.a($$3);
            int $$11 = hx.a($$4);
            boolean $$12 = $$9 != hx.a(this.av) || $$11 != hx.a(this.ax) || $$10 != hx.a(this.aw);
            this.av = $$2;
            this.aw = $$3;
            this.ax = $$4;
            int $$13 = 0;
            ObjectListIterator var21 = this.A.iterator();

            while (var21.hasNext()) {
               fjv.a $$14 = (fjv.a)var21.next();
               if ($$13 < 15 && ($$12 || $$14.a($$9, $$10, $$11)) && $$14.a.a($$0, this.am)) {
                  $$13++;
               }
            }
         }

         this.t.aG().c();
      }

      this.t.aG().a("filterempty");
      this.t.aG().b(() -> "render_" + $$0);
      boolean $$15 = $$0 != fkf.f();
      ObjectListIterator<fjv.a> $$16 = this.A.listIterator($$15 ? 0 : this.A.size());
      fki $$17 = RenderSystem.getShader();

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
      eia $$20 = $$17.q;

      while ($$15 ? $$16.hasNext() : $$16.hasPrevious()) {
         fjv.a $$21 = $$15 ? (fjv.a)$$16.next() : (fjv.a)$$16.previous();
         fmp.c $$22 = $$21.a;
         if (!$$22.d().a($$0)) {
            eim $$23 = $$22.a($$0);
            gu $$24 = $$22.f();
            if ($$20 != null) {
               $$20.a((float)((double)$$24.u() - $$2), (float)((double)$$24.v() - $$3), (float)((double)$$24.w() - $$4));
               $$20.b();
            }

            $$23.a();
            $$23.c();
         }
      }

      if ($$20 != null) {
         $$20.a(0.0F, 0.0F, 0.0F);
      }

      $$17.f();
      eim.b();
      this.t.aG().c();
      $$0.b();
   }

   private void a(eij $$0, fjx $$1, emz $$2) {
      if (this.t.C || this.t.D) {
         double $$3 = $$2.b().a();
         double $$4 = $$2.b().b();
         double $$5 = $$2.b().c();
         ObjectListIterator var10 = this.A.iterator();

         while (var10.hasNext()) {
            fjv.a $$6 = (fjv.a)var10.next();
            fmp.c $$7 = $$6.a;
            gu $$8 = $$7.f();
            $$0.a();
            $$0.a((double)$$8.u() - $$3, (double)$$8.v() - $$4, (double)$$8.w() - $$5);
            Matrix4f $$9 = $$0.c().a();
            if (this.t.C) {
               ein $$10 = $$1.getBuffer(fkf.x());
               int $$11 = $$6.d == 0 ? 0 : apa.h((float)$$6.d / 50.0F, 0.9F, 0.9F);
               int $$12 = $$11 >> 16 & 0xFF;
               int $$13 = $$11 >> 8 & 0xFF;
               int $$14 = $$11 & 0xFF;

               for (int $$15 = 0; $$15 < b.length; $$15++) {
                  if ($$6.a($$15)) {
                     ha $$16 = b[$$15];
                     $$10.a($$9, 8.0F, 8.0F, 8.0F).a($$12, $$13, $$14, 255).a((float)$$16.j(), (float)$$16.k(), (float)$$16.l()).e();
                     $$10.a($$9, (float)(8 - 16 * $$16.j()), (float)(8 - 16 * $$16.k()), (float)(8 - 16 * $$16.l()))
                        .a($$12, $$13, $$14, 255)
                        .a((float)$$16.j(), (float)$$16.k(), (float)$$16.l())
                        .e();
                  }
               }
            }

            if (this.t.D && !$$7.d().a()) {
               ein $$17 = $$1.getBuffer(fkf.x());
               int $$18 = 0;

               for (ha $$19 : b) {
                  for (ha $$20 : b) {
                     boolean $$21 = $$7.d().a($$19, $$20);
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
                  ein $$22 = $$1.getBuffer(fkf.A());
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

      if (this.as != null) {
         $$0.a();
         $$0.a((float)(this.au.x - $$2.b().c), (float)(this.au.y - $$2.b().d), (float)(this.au.z - $$2.b().e));
         Matrix4f $$25 = $$0.c().a();
         ein $$26 = $$1.getBuffer(fkf.A());
         this.a($$26, $$25, 0, 1, 2, 3, 0, 1, 1);
         this.a($$26, $$25, 4, 5, 6, 7, 1, 0, 0);
         this.a($$26, $$25, 0, 1, 5, 4, 1, 1, 0);
         this.a($$26, $$25, 2, 3, 7, 6, 0, 0, 1);
         this.a($$26, $$25, 0, 4, 7, 3, 0, 1, 0);
         this.a($$26, $$25, 1, 5, 6, 2, 1, 0, 1);
         ein $$27 = $$1.getBuffer(fkf.x());
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

   private void a(ein $$0, Matrix4f $$1, int $$2) {
      $$0.a($$1, this.at[$$2].x(), this.at[$$2].y(), this.at[$$2].z()).a(0, 0, 0, 255).a(0.0F, 0.0F, -1.0F).e();
   }

   private void a(ein $$0, Matrix4f $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      float $$9 = 0.25F;
      $$0.a($$1, this.at[$$2].x(), this.at[$$2].y(), this.at[$$2].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.at[$$3].x(), this.at[$$3].y(), this.at[$$3].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.at[$$4].x(), this.at[$$4].y(), this.at[$$4].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.at[$$5].x(), this.at[$$5].y(), this.at[$$5].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
   }

   public void m() {
      this.ar = true;
   }

   public void n() {
      this.as = null;
   }

   public void o() {
      this.K++;
      if (this.K % 20 == 0) {
         Iterator<aho> $$0 = this.L.values().iterator();

         while ($$0.hasNext()) {
            aho $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.K - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(aho $$0) {
      long $$1 = $$0.b().a();
      Set<aho> $$2 = (Set<aho>)this.M.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.M.remove($$1);
      }
   }

   private void b(eij $$0) {
      RenderSystem.enableBlend();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(fjq::t);
      RenderSystem.setShaderTexture(0, p);
      eil $$1 = eil.a();
      eie $$2 = $$1.c();

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
         $$2.a(eio.b.h, eih.s);
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

   public void a(eij $$0, Matrix4f $$1, float $$2, emz $$3, boolean $$4, Runnable $$5) {
      $$5.run();
      if (!$$4) {
         dxg $$6 = $$3.k();
         if ($$6 != dxg.c && $$6 != dxg.a && !this.b($$3)) {
            if (this.t.s.d().c() == fjm.d.c) {
               this.b($$0);
            } else if (this.t.s.d().c() == fjm.d.b) {
               eei $$7 = this.x.a(this.t.j.m().b(), $$2);
               float $$8 = (float)$$7.c;
               float $$9 = (float)$$7.d;
               float $$10 = (float)$$7.e;
               fjp.b();
               eie $$11 = eil.a().c();
               RenderSystem.depthMask(false);
               RenderSystem.setShaderColor($$8, $$9, $$10, 1.0F);
               fki $$12 = RenderSystem.getShader();
               this.F.a();
               this.F.a($$0.c().a(), $$1, $$12);
               eim.b();
               RenderSystem.enableBlend();
               float[] $$13 = this.x.d().a(this.x.f($$2), $$2);
               if ($$13 != null) {
                  RenderSystem.setShader(fjq::q);
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  $$0.a();
                  $$0.a(a.b.rotationDegrees(90.0F));
                  float $$14 = apa.a(this.x.a($$2)) < 0.0F ? 180.0F : 0.0F;
                  $$0.a(a.f.rotationDegrees($$14));
                  $$0.a(a.f.rotationDegrees(90.0F));
                  float $$15 = $$13[0];
                  float $$16 = $$13[1];
                  float $$17 = $$13[2];
                  Matrix4f $$18 = $$0.c().a();
                  $$11.a(eio.b.g, eih.n);
                  $$11.a($$18, 0.0F, 100.0F, 0.0F).a($$15, $$16, $$17, $$13[3]).e();
                  int $$19 = 16;

                  for (int $$20 = 0; $$20 <= 16; $$20++) {
                     float $$21 = (float)$$20 * (float) (Math.PI * 2) / 16.0F;
                     float $$22 = apa.a($$21);
                     float $$23 = apa.b($$21);
                     $$11.a($$18, $$22 * 120.0F, $$23 * 120.0F, -$$23 * 40.0F * $$13[3]).a($$13[0], $$13[1], $$13[2], 0.0F).e();
                  }

                  eif.a($$11.d());
                  $$0.b();
               }

               RenderSystem.blendFuncSeparate(
                  GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
               );
               $$0.a();
               float $$24 = 1.0F - this.x.d($$2);
               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$24);
               $$0.a(a.d.rotationDegrees(-90.0F));
               $$0.a(a.b.rotationDegrees(this.x.f($$2) * 360.0F));
               Matrix4f $$25 = $$0.c().a();
               float $$26 = 30.0F;
               RenderSystem.setShader(fjq::s);
               RenderSystem.setShaderTexture(0, n);
               $$11.a(eio.b.h, eih.q);
               $$11.a($$25, -$$26, 100.0F, -$$26).a(0.0F, 0.0F).e();
               $$11.a($$25, $$26, 100.0F, -$$26).a(1.0F, 0.0F).e();
               $$11.a($$25, $$26, 100.0F, $$26).a(1.0F, 1.0F).e();
               $$11.a($$25, -$$26, 100.0F, $$26).a(0.0F, 1.0F).e();
               eif.a($$11.d());
               $$26 = 20.0F;
               RenderSystem.setShaderTexture(0, m);
               int $$27 = this.x.ao();
               int $$28 = $$27 % 4;
               int $$29 = $$27 / 4 % 2;
               float $$30 = (float)($$28 + 0) / 4.0F;
               float $$31 = (float)($$29 + 0) / 2.0F;
               float $$32 = (float)($$28 + 1) / 4.0F;
               float $$33 = (float)($$29 + 1) / 2.0F;
               $$11.a(eio.b.h, eih.q);
               $$11.a($$25, -$$26, -100.0F, $$26).a($$32, $$33).e();
               $$11.a($$25, $$26, -100.0F, $$26).a($$30, $$33).e();
               $$11.a($$25, $$26, -100.0F, -$$26).a($$30, $$31).e();
               $$11.a($$25, -$$26, -100.0F, -$$26).a($$32, $$31).e();
               eif.a($$11.d());
               float $$34 = this.x.i($$2) * $$24;
               if ($$34 > 0.0F) {
                  RenderSystem.setShaderColor($$34, $$34, $$34, $$34);
                  fjp.a();
                  this.E.a();
                  this.E.a($$0.c().a(), $$1, fjq.p());
                  eim.b();
                  $$5.run();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.disableBlend();
               RenderSystem.defaultBlendFunc();
               $$0.b();
               RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
               double $$35 = this.t.t.j($$2).d - this.x.k().a(this.x);
               if ($$35 < 0.0) {
                  $$0.a();
                  $$0.a(0.0F, 12.0F, 0.0F);
                  this.G.a();
                  this.G.a($$0.c().a(), $$1, $$12);
                  eim.b();
                  $$0.b();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.depthMask(true);
            }
         }
      }
   }

   private boolean b(emz $$0) {
      return !($$0.g() instanceof bfz $$1) ? false : $$1.a(bfc.o) || $$1.a(bfc.G);
   }

   public void a(eij $$0, Matrix4f $$1, float $$2, double $$3, double $$4, double $$5) {
      float $$6 = this.x.d().a();
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
         double $$10 = (double)(((float)this.K + $$2) * 0.03F);
         double $$11 = ($$3 + $$10) / 12.0;
         double $$12 = (double)($$6 - (float)$$4 + 0.33F);
         double $$13 = $$5 / 12.0 + 0.33F;
         $$11 -= (double)(apa.a($$11 / 2048.0) * 2048);
         $$13 -= (double)(apa.a($$13 / 2048.0) * 2048);
         float $$14 = (float)($$11 - (double)apa.a($$11));
         float $$15 = (float)($$12 / 4.0 - (double)apa.a($$12 / 4.0)) * 4.0F;
         float $$16 = (float)($$13 - (double)apa.a($$13));
         eei $$17 = this.x.h($$2);
         int $$18 = (int)Math.floor($$11);
         int $$19 = (int)Math.floor($$12 / 4.0);
         int $$20 = (int)Math.floor($$13);
         if ($$18 != this.ah || $$19 != this.ai || $$20 != this.aj || this.t.m.as() != this.al || this.ak.g($$17) > 2.0E-4) {
            this.ah = $$18;
            this.ai = $$19;
            this.aj = $$20;
            this.ak = $$17;
            this.al = this.t.m.as();
            this.H = true;
         }

         if (this.H) {
            this.H = false;
            eie $$21 = eil.a().c();
            if (this.I != null) {
               this.I.close();
            }

            this.I = new eim(eim.a.a);
            eie.b $$22 = this.a($$21, $$11, $$12, $$13, $$17);
            this.I.a();
            this.I.a($$22);
            eim.b();
         }

         RenderSystem.setShader(fjq::x);
         RenderSystem.setShaderTexture(0, o);
         fjp.b();
         $$0.a();
         $$0.b(12.0F, 1.0F, 12.0F);
         $$0.a(-$$14, $$15, -$$16);
         if (this.I != null) {
            this.I.a();
            int $$23 = this.al == enc.c ? 0 : 1;

            for (int $$24 = $$23; $$24 < 2; $$24++) {
               if ($$24 == 0) {
                  RenderSystem.colorMask(false, false, false, false);
               } else {
                  RenderSystem.colorMask(true, true, true, true);
               }

               fki $$25 = RenderSystem.getShader();
               this.I.a($$0.c().a(), $$1, $$25);
            }

            eim.b();
         }

         $$0.b();
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   private eie.b a(eie $$0, double $$1, double $$2, double $$3, eei $$4) {
      float $$5 = 4.0F;
      float $$6 = 0.00390625F;
      int $$7 = 8;
      int $$8 = 4;
      float $$9 = 9.765625E-4F;
      float $$10 = (float)apa.a($$1) * 0.00390625F;
      float $$11 = (float)apa.a($$3) * 0.00390625F;
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
      RenderSystem.setShader(fjq::x);
      $$0.a(eio.b.h, eih.v);
      float $$24 = (float)Math.floor($$2 / 4.0) * 4.0F;
      if (this.al == enc.c) {
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

   private void c(emz $$0) {
      this.t.aG().a("populate_chunks_to_compile");
      dwt $$1 = this.x.s_();
      fms $$2 = new fms();
      gu $$3 = $$0.c();
      List<fmp.c> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.A.iterator();

      while (var6.hasNext()) {
         fjv.a $$5 = (fjv.a)var6.next();
         fmp.c $$6 = $$5.a;
         hx $$7 = hx.a($$6.f());
         if ($$6.h() && $$1.a($$7)) {
            boolean $$8 = false;
            if (this.t.m.k().c() == enu.c) {
               gu $$9 = $$6.f().b(8, 8, 8);
               $$8 = $$9.j($$3) < 768.0 || $$6.i();
            } else if (this.t.m.k().c() == enu.b) {
               $$8 = $$6.i();
            }

            if ($$8) {
               this.t.aG().a("build_near_sync");
               this.am.a($$6, $$2);
               $$6.g();
               this.t.aG().c();
            } else {
               $$4.add($$6);
            }
         }
      }

      this.t.aG().b("upload");
      this.am.f();
      this.t.aG().b("schedule_async_compile");

      for (fmp.c $$10 : $$4) {
         $$10.a(this.am, $$2);
         $$10.g();
      }

      this.t.aG().c();
   }

   private void d(emz $$0) {
      eie $$1 = eil.a().c();
      dds $$2 = this.x.w_();
      double $$3 = (double)(this.t.m.ax() * 16);
      if (!($$0.b().c < $$2.g() - $$3) || !($$0.b().c > $$2.e() + $$3) || !($$0.b().e < $$2.h() - $$3) || !($$0.b().e > $$2.f() + $$3)) {
         double $$4 = 1.0 - $$2.b($$0.b().c, $$0.b().e) / $$3;
         $$4 = Math.pow($$4, 4.0);
         $$4 = apa.a($$4, 0.0, 1.0);
         double $$5 = $$0.b().c;
         double $$6 = $$0.b().e;
         double $$7 = (double)this.t.j.h();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
         RenderSystem.setShaderTexture(0, q);
         RenderSystem.depthMask(enn.L());
         eij $$8 = RenderSystem.getModelViewStack();
         $$8.a();
         RenderSystem.applyModelViewMatrix();
         int $$9 = $$2.d().a();
         float $$10 = (float)($$9 >> 16 & 0xFF) / 255.0F;
         float $$11 = (float)($$9 >> 8 & 0xFF) / 255.0F;
         float $$12 = (float)($$9 & 0xFF) / 255.0F;
         RenderSystem.setShaderColor($$10, $$11, $$12, (float)$$4);
         RenderSystem.setShader(fjq::s);
         RenderSystem.polygonOffset(-3.0F, -3.0F);
         RenderSystem.enablePolygonOffset();
         RenderSystem.disableCull();
         float $$13 = (float)(ac.b() % 3000L) / 3000.0F;
         float $$14 = (float)(-apa.e($$0.b().d * 0.5));
         float $$15 = $$14 + (float)$$7;
         $$1.a(eio.b.h, eih.q);
         double $$16 = Math.max((double)apa.a($$6 - $$3), $$2.f());
         double $$17 = Math.min((double)apa.c($$6 + $$3), $$2.h());
         float $$18 = (float)(apa.a($$16) & 1) * 0.5F;
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

         $$16 = Math.max((double)apa.a($$5 - $$3), $$2.e());
         $$17 = Math.min((double)apa.c($$5 + $$3), $$2.g());
         $$18 = (float)(apa.a($$16) & 1) * 0.5F;
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

         eif.a($$1.d());
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

   private void a(eij $$0, ein $$1, bfj $$2, double $$3, double $$4, double $$5, gu $$6, dcb $$7) {
      a($$0, $$1, $$7.a(this.x, $$6, een.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   private static eei a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(apa.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new eei(1.0, (double)$$3, 0.0);
         case 1 -> new eei((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new eei(0.0, 1.0, (double)$$3);
         case 3 -> new eei(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new eei((double)$$3, 0.0, 1.0);
         case 5 -> new eei(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static eei a(float $$0, float $$1, float $$2, float $$3) {
      eei $$4 = a($$3).a((double)$$0);
      eei $$5 = a(($$3 + 0.33333334F) % 1.0F).a((double)$$1);
      eei $$6 = a(($$3 + 0.6666667F) % 1.0F).a((double)$$2);
      eei $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.c), Math.max($$7.d, $$7.e));
      return new eei($$7.c / $$8, $$7.d / $$8, $$7.e / $$8);
   }

   public static void a(eij $$0, ein $$1, efb $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<eed> $$11 = $$2.d();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         a($$0, $$1, eey.a($$11.get(0)), $$3, $$4, $$5, $$6, $$7, $$8, $$9);

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            eed $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            eei $$16 = a($$6, $$7, $$8, $$15);
            a($$0, $$1, eey.a($$14), $$3, $$4, $$5, (float)$$16.c, (float)$$16.d, (float)$$16.e, $$9);
         }
      }
   }

   private static void a(eij $$0, ein $$1, efb $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9) {
      eij.a $$10 = $$0.c();
      $$2.a(($$9x, $$10x, $$11, $$12, $$13, $$14) -> {
         float $$15 = (float)($$12 - $$9x);
         float $$16 = (float)($$13 - $$10x);
         float $$17 = (float)($$14 - $$11);
         float $$18 = apa.c($$15 * $$15 + $$16 * $$16 + $$17 * $$17);
         $$15 /= $$18;
         $$16 /= $$18;
         $$17 /= $$18;
         $$1.a($$10.a(), (float)($$9x + $$3), (float)($$10x + $$4), (float)($$11 + $$5)).a($$6, $$7, $$8, $$9).a($$10.b(), $$15, $$16, $$17).e();
         $$1.a($$10.a(), (float)($$12 + $$3), (float)($$13 + $$4), (float)($$14 + $$5)).a($$6, $$7, $$8, $$9).a($$10.b(), $$15, $$16, $$17).e();
      });
   }

   public static void a(ein $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, float $$8, float $$9, float $$10) {
      a(new eij(), $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$7, $$8, $$9);
   }

   public static void a(eij $$0, ein $$1, eed $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6, $$3, $$4, $$5);
   }

   public static void a(eij $$0, ein $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$8, $$9, $$10);
   }

   public static void a(
      eij $$0,
      ein $$1,
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

   public static void b(eij $$0, ein $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, (float)$$2, (float)$$3, (float)$$4, (float)$$5, (float)$$6, (float)$$7, $$8, $$9, $$10, $$11);
   }

   public static void a(eij $$0, ein $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11) {
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

   public void a(cls $$0, gu $$1, dcb $$2, dcb $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(gu $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(hx.a($$3), hx.a($$4), hx.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(hx.a($$7), hx.a($$8), hx.a($$6));
            }
         }
      }
   }

   public void a(gu $$0, dcb $$1, dcb $$2) {
      if (this.t.aD().a($$1, $$2)) {
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
      this.D.a($$0, $$1, $$2, $$3);
   }

   public void a(@Nullable amg $$0, gu $$1) {
      fxy $$2 = this.N.get($$1);
      if ($$2 != null) {
         this.t.ah().b($$2);
         this.N.remove($$1);
      }

      if ($$0 != null) {
         cgr $$3 = cgr.a($$0);
         if ($$3 != null) {
            this.t.l.a($$3.i());
         }

         fxy var5 = fxt.a($$0, eei.b($$1));
         this.N.put($$1, var5);
         this.t.ah().a(var5);
      }

      this.a(this.x, $$1, $$0 != null);
   }

   private void a(cmm $$0, gu $$1, boolean $$2) {
      for (bfz $$4 : $$0.a(bfz.class, new eed($$1).g(3.0))) {
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
         $$11.a("Position", () -> p.a(this.x, $$3, $$4, $$5));
         throw new y($$10);
      }
   }

   private <T extends it> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.b().c(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   private fhm b(it $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private fhm b(it $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      emz $$9 = this.t.j.m();
      ens $$10 = this.a($$2);
      if ($$1) {
         return this.t.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == ens.c ? null : this.t.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private ens a(boolean $$0) {
      ens $$1 = this.t.m.am().c();
      if ($$0 && $$1 == ens.c && this.x.z.a(10) == 0) {
         $$1 = ens.b;
      }

      if ($$1 == ens.b && this.x.z.a(3) == 0) {
         $$1 = ens.c;
      }

      return $$1;
   }

   public void p() {
   }

   public void a(int $$0, gu $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            emz $$3 = this.t.j.m();
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
                  this.x.a($$8, $$9, $$10, amh.Ah, ami.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.x.a($$8, $$9, $$10, amh.hp, ami.f, 1.0F, 1.0F, false);
               } else {
                  this.x.a($$8, $$9, $$10, amh.gU, ami.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, gu $$1, int $$2) {
      apf $$3 = this.x.z;
      switch ($$0) {
         case 1000:
            this.x.a($$1, amh.fM, ami.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.x.a($$1, amh.fN, ami.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.x.a($$1, amh.fO, ami.e, 1.0F, 1.2F, false);
            break;
         case 1003:
            this.x.a($$1, amh.hb, ami.g, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.x.a($$1, amh.hJ, ami.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.x.a($$1, amh.hN, ami.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.x.a($$1, amh.iY, ami.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            if (cfu.b($$2) instanceof cgr $$87) {
               this.a($$87.x(), $$1);
            }
            break;
         case 1011:
            this.a(null, $$1);
            break;
         case 1015:
            this.x.a($$1, amh.ji, ami.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.x.a($$1, amh.jh, ami.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.x.a($$1, amh.gZ, ami.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.x.a($$1, amh.bV, ami.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.x.a($$1, amh.AQ, ami.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.x.a($$1, amh.AR, ami.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.x.a($$1, amh.AS, ami.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.x.a($$1, amh.zZ, ami.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.x.a($$1, amh.Ac, ami.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.x.a($$1, amh.bu, ami.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.x.a($$1, amh.Ba, ami.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.x.a($$1, amh.Bh, ami.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.x.a($$1, amh.V, ami.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.x.a($$1, amh.ab, ami.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.x.a($$1, amh.Y, ami.e, 0.3F, this.x.z.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.t.ah().a(fxt.b(amh.sV, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.x.a($$1, amh.ez, ami.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.x.a($$1, amh.ey, ami.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.x.a($$1, amh.ck, ami.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.x.a($$1, amh.rJ, ami.f, 0.3F, this.x.z.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.x.a($$1, amh.AT, ami.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.x.a($$1, amh.ly, ami.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.x.a($$1, amh.kh, ami.e, 1.0F, this.x.z.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.x.a($$1, amh.ce, ami.e, 1.0F, this.x.z.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.x.a($$1, amh.ww, ami.e, 1.0F, this.x.z.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.x.a($$1, amh.gp, ami.e, 2.0F, this.x.z.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.x.a($$1, amh.gs, ami.e, 2.0F, this.x.z.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.x.a($$1, amh.gt, ami.e, 2.0F, this.x.z.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.x.a($$1, amh.vp, ami.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1500:
            cqw.a(this.x, $$1, $$2 > 0);
            break;
         case 1501:
            this.x.a($$1, amh.mo, ami.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$70 = 0; $$70 < 8; $$70++) {
               this.x.a(iv.S, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.x.a($$1, amh.tI, ami.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$71 = 0; $$71 < 5; $$71++) {
               double $$72 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$73 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$74 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.x.a(iv.Z, $$72, $$73, $$74, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.x.a($$1, amh.ho, ami.e, 1.0F, 1.0F, false);

            for (int $$75 = 0; $$75 < 16; $$75++) {
               double $$76 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$77 = (double)$$1.v() + 0.8125;
               double $$78 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.x.a(iv.Z, $$76, $$77, $$78, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            cvd.a(this.x, $$1, this.x.a_($$1));
            break;
         case 1505:
            cdu.a(this.x, $$1, $$2);
            this.x.a($$1, amh.cd, ami.e, 1.0F, 1.0F, false);
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
            dcb $$38 = cpn.a($$2);
            if (!$$38.i()) {
               cxa $$39 = $$38.w();
               this.x.a($$1, $$39.c(), ami.e, ($$39.a() + 1.0F) / 2.0F, $$39.b() * 0.8F, false);
            }

            this.x.a($$1, $$38);
            break;
         case 2002:
         case 2007:
            eei $$24 = eei.c($$1);

            for (int $$25 = 0; $$25 < 8; $$25++) {
               this.a(new ir(iv.O, new cfz(cgc.uu)), $$24.c, $$24.d, $$24.e, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
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
               fhm $$36 = this.b($$29, $$29.b().c(), $$24.c + $$33 * 0.1, $$24.d + 0.3, $$24.e + $$35 * 0.1, $$33, $$34, $$35);
               if ($$36 != null) {
                  float $$37 = 0.75F + $$3.i() * 0.25F;
                  $$36.a($$26 * $$37, $$27 * $$37, $$28 * $$37);
                  $$36.c((float)$$31);
               }
            }

            this.x.a($$1, amh.xc, ami.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$19 = (double)$$1.u() + 0.5;
            double $$20 = (double)$$1.v();
            double $$21 = (double)$$1.w() + 0.5;

            for (int $$22 = 0; $$22 < 8; $$22++) {
               this.a(new ir(iv.O, new cfz(cgc.rD)), $$19, $$20, $$21, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
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
               this.x.a(iv.Z, $$43, $$44, $$45, 0.0, 0.0, 0.0);
               this.x.a(iv.C, $$43, $$44, $$45, 0.0, 0.0, 0.0);
            }
            break;
         case 2005:
            cdu.a(this.x, $$1, $$2);
            break;
         case 2006:
            for (int $$79 = 0; $$79 < 200; $$79++) {
               float $$80 = $$3.i() * 4.0F;
               float $$81 = $$3.i() * (float) (Math.PI * 2);
               double $$82 = (double)(apa.b($$81) * $$80);
               double $$83 = 0.01 + $$3.j() * 0.5;
               double $$84 = (double)(apa.a($$81) * $$80);
               fhm $$85 = this.b(iv.i, false, (double)$$1.u() + $$82 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$84 * 0.1, $$82, $$83, $$84);
               if ($$85 != null) {
                  $$85.c($$80);
               }
            }

            if ($$2 == 1) {
               this.x.a($$1, amh.gV, ami.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.x.a(iv.x, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$86 = 0; $$86 < 8; $$86++) {
               this.x.a(iv.f, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 3000:
            this.x.a(iv.w, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.x.a($$1, amh.hn, ami.e, 10.0F, (1.0F + (this.x.z.i() - this.x.z.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.x.a($$1, amh.gX, ami.f, 64.0F, 0.8F + this.x.z.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < ha.a.d.length) {
               apd.a(ha.a.d[$$2], this.x, $$1, 0.125, iv.aN, bdi.a(10, 19));
            } else {
               apd.a(this.x, $$1, iv.aN, bdi.a(3, 5));
            }
            break;
         case 3003:
            apd.a(this.x, $$1, iv.aL, bdi.a(3, 5));
            this.x.a($$1, amh.la, ami.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            apd.a(this.x, $$1, iv.aM, bdi.a(3, 5));
            break;
         case 3005:
            apd.a(this.x, $$1, iv.aO, bdi.a(3, 5));
            break;
         case 3006:
            int $$46 = $$2 >> 6;
            if ($$46 > 0) {
               if ($$3.i() < 0.3F + (float)$$46 * 0.1F) {
                  float $$47 = 0.15F + 0.02F * (float)$$46 * (float)$$46 * $$3.i();
                  float $$48 = 0.4F + 0.3F * (float)$$46 * $$3.i();
                  this.x.a($$1, amh.uh, ami.e, $$47, $$48, false);
               }

               byte $$49 = (byte)($$2 & 63);
               bdc $$50 = bdi.a(0, $$46);
               float $$51 = 0.005F;
               Supplier<eei> $$52 = () -> new eei(apa.a($$3, -0.005F, 0.005F), apa.a($$3, -0.005F, 0.005F), apa.a($$3, -0.005F, 0.005F));
               if ($$49 == 0) {
                  for (ha $$53 : ha.values()) {
                     float $$54 = $$53 == ha.a ? (float) Math.PI : 0.0F;
                     double $$55 = $$53.o() == ha.a.b ? 0.65 : 0.57;
                     apd.a(this.x, $$1, new iw($$54), $$50, $$53, $$52, $$55);
                  }
               } else {
                  for (ha $$56 : cul.a($$49)) {
                     float $$57 = $$56 == ha.b ? (float) Math.PI : 0.0F;
                     double $$58 = 0.35;
                     apd.a(this.x, $$1, new iw($$57), $$50, $$56, $$52, 0.35);
                  }
               }
            } else {
               this.x.a($$1, amh.uh, ami.e, 1.0F, 1.0F, false);
               boolean $$59 = this.x.a_($$1).r(this.x, $$1);
               int $$60 = $$59 ? 40 : 20;
               float $$61 = $$59 ? 0.45F : 0.25F;
               float $$62 = 0.07F;

               for (int $$63 = 0; $$63 < $$60; $$63++) {
                  float $$64 = 2.0F * $$3.i() - 1.0F;
                  float $$65 = 2.0F * $$3.i() - 1.0F;
                  float $$66 = 2.0F * $$3.i() - 1.0F;
                  this.x
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
               this.x.a(new ix($$67 * 5), false, (double)$$1.u() + 0.5, (double)$$1.v() + cwh.e, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dcb $$68 = this.x.a_($$1);
            boolean $$69 = $$68.b(dcr.C) && $$68.c(dcr.C);
            if (!$$69) {
               this.x.a((double)$$1.u() + 0.5, (double)$$1.v() + cwh.e, (double)$$1.w() + 0.5, amh.uE, ami.e, 2.0F, 0.6F + this.x.z.i() * 0.4F, false);
            }
            break;
         case 3008:
            dcb $$40 = cpn.a($$2);
            if ($$40.b() instanceof cpr $$41) {
               this.x.a($$1, $$41.c(), ami.h, 1.0F, 1.0F, false);
            }

            this.x.a($$1, $$40);
            break;
         case 3009:
            apd.a(this.x, $$1, iv.aQ, bdi.a(3, 6));
      }
   }

   public void c(int $$0, gu $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         aho $$4 = (aho)this.L.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new aho($$0, $$1);
            this.L.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.K);
         ((SortedSet)this.M.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         aho $$3 = (aho)this.L.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean q() {
      return this.am.h();
   }

   public void r() {
      this.ay = true;
      this.H = true;
   }

   public void a(Collection<czn> $$0, Collection<czn> $$1) {
      synchronized (this.B) {
         this.B.removeAll($$0);
         this.B.addAll($$1);
      }
   }

   public static int a(clp $$0, gu $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(clp $$0, dcb $$1, gu $$2) {
      if ($$1.e($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(cmv.a, $$2);
         int $$4 = $$0.a(cmv.b, $$2);
         int $$5 = $$1.h();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(gu $$0) {
      fmp.c $$1 = this.D.a($$0);
      return $$1 != null && $$1.c.get() != fmp.b.a;
   }

   @Nullable
   public egv s() {
      return this.O;
   }

   @Nullable
   public egv t() {
      return this.Q;
   }

   @Nullable
   public egv u() {
      return this.R;
   }

   @Nullable
   public egv v() {
      return this.S;
   }

   @Nullable
   public egv w() {
      return this.T;
   }

   @Nullable
   public egv x() {
      return this.U;
   }

   static class a {
      final fmp.c a;
      private byte b;
      byte c;
      final int d;

      a(fmp.c $$0, @Nullable ha $$1, int $$2) {
         this.a = $$0;
         if ($$1 != null) {
            this.b($$1);
         }

         this.d = $$2;
      }

      public void a(byte $$0, ha $$1) {
         this.c = (byte)(this.c | $$0 | 1 << $$1.ordinal());
      }

      public boolean a(ha $$0) {
         return (this.c & 1 << $$0.ordinal()) > 0;
      }

      public void b(ha $$0) {
         this.b = (byte)(this.b | this.b | 1 << $$0.ordinal());
      }

      public boolean a(int $$0) {
         return (this.b & 1 << $$0) > 0;
      }

      public boolean a() {
         return this.b != 0;
      }

      public boolean a(int $$0, int $$1, int $$2) {
         gu $$3 = this.a.f();
         return $$0 == $$3.u() / 16 || $$2 == $$3.w() / 16 || $$1 == $$3.v() / 16;
      }

      @Override
      public int hashCode() {
         return this.a.f().hashCode();
      }

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof fjv.a $$1) ? false : this.a.f().equals($$1.a.f());
      }
   }

   static class b {
      public final fjv.c a;
      public final LinkedHashSet<fjv.a> b;

      public b(int $$0) {
         this.a = new fjv.c($$0);
         this.b = new LinkedHashSet<>($$0);
      }
   }

   static class c {
      private final fjv.a[] a;

      c(int $$0) {
         this.a = new fjv.a[$$0];
      }

      public void a(fmp.c $$0, fjv.a $$1) {
         this.a[$$0.b] = $$1;
      }

      @Nullable
      public fjv.a a(fmp.c $$0) {
         int $$1 = $$0.b;
         return $$1 >= 0 && $$1 < this.a.length ? this.a[$$1] : null;
      }
   }

   public static class d extends RuntimeException {
      public d(String $$0, Throwable $$1) {
         super($$0, $$1);
      }
   }
}
