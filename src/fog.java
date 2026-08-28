import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class fog extends fod {
   private static final Logger a = LogUtils.getLogger();
   private static final akr b = akr.b("textures/misc/credits_vignette.png");
   private static final wz c = wz.b("============").a(n.p);
   private static final String r = "           ";
   private static final String s = "" + n.p + n.q + n.k + n.l;
   private static final float u = 5.0F;
   private static final float v = 15.0F;
   private static final akr w = akr.b("texts/end.txt");
   private static final akr x = akr.b("texts/credits.json");
   private static final akr y = akr.b("texts/postcredits.txt");
   private final boolean z;
   private final Runnable A;
   private float B;
   private List<aya> C;
   private IntSet D;
   private int E;
   private boolean F;
   private final IntSet G = new IntOpenHashSet();
   private float H;
   private final float I;
   private int J;
   private final fjd K = new fjd(false);

   public fog(boolean $$0, Runnable $$1) {
      super(fgg.a);
      this.z = $$0;
      this.A = $$1;
      if (!$$0) {
         this.I = 0.75F;
      } else {
         this.I = 0.5F;
      }

      this.J = 1;
      this.H = this.I;
   }

   private float m() {
      return this.F ? this.I * (5.0F + (float)this.G.size() * 15.0F) * (float)this.J : this.I * (float)this.J;
   }

   @Override
   public void e() {
      this.l.s().a();
      this.l.aj().a(false);
      float $$0 = (float)(this.E + this.n + this.n + 24);
      if (this.B > $$0) {
         this.C();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.J = -1;
      } else if ($$0 == 341 || $$0 == 345) {
         this.G.add($$0);
      } else if ($$0 == 32) {
         this.F = true;
      }

      this.H = this.m();
      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.J = 1;
      }

      if ($$0 == 32) {
         this.F = false;
      } else if ($$0 == 341 || $$0 == 345) {
         this.G.remove($$0);
      }

      this.H = this.m();
      return super.c($$0, $$1, $$2);
   }

   @Override
   public void d() {
      this.C();
   }

   private void C() {
      this.A.run();
   }

   @Override
   protected void aT_() {
      if (this.C == null) {
         this.C = Lists.newArrayList();
         this.D = new IntOpenHashSet();
         if (this.z) {
            this.a(w, this::a);
         }

         this.a(x, this::b);
         if (this.z) {
            this.a(y, this::a);
         }

         this.E = this.C.size() * 12;
      }
   }

   private void a(akr $$0, fog.a $$1) {
      try (Reader $$2 = this.l.ab().openAsReader($$0)) {
         $$1.read($$2);
      } catch (Exception var8) {
         a.error("Couldn't load credits from file {}", $$0, var8);
      }
   }

   private void a(Reader $$0) throws IOException {
      BufferedReader $$1 = new BufferedReader($$0);
      ayw $$2 = ayw.a(8124371L);

      String $$3;
      while (($$3 = $$1.readLine()) != null) {
         $$3 = $$3.replaceAll("PLAYERNAME", this.l.X().c());

         int $$4;
         while (($$4 = $$3.indexOf(s)) != -1) {
            String $$5 = $$3.substring(0, $$4);
            String $$6 = $$3.substring($$4 + s.length());
            $$3 = $$5 + n.p + n.q + "XXXXXXXX".substring(0, $$2.a(4) + 3) + $$6;
         }

         this.a($$3);
         this.D();
      }

      for (int $$7 = 0; $$7 < 8; $$7++) {
         this.D();
      }
   }

   private void b(Reader $$0) {
      for (JsonElement $$2 : aye.b($$0)) {
         JsonObject $$3 = $$2.getAsJsonObject();
         String $$4 = $$3.get("section").getAsString();
         this.a(c, true);
         this.a(wz.b($$4).a(n.o), true);
         this.a(c, true);
         this.D();
         this.D();

         for (JsonElement $$6 : $$3.getAsJsonArray("disciplines")) {
            JsonObject $$7 = $$6.getAsJsonObject();
            String $$8 = $$7.get("discipline").getAsString();
            if (StringUtils.isNotEmpty($$8)) {
               this.a(wz.b($$8).a(n.o), true);
               this.D();
               this.D();
            }

            for (JsonElement $$10 : $$7.getAsJsonArray("titles")) {
               JsonObject $$11 = $$10.getAsJsonObject();
               String $$12 = $$11.get("title").getAsString();
               JsonArray $$13 = $$11.getAsJsonArray("names");
               this.a(wz.b($$12).a(n.h), false);

               for (JsonElement $$14 : $$13) {
                  String $$15 = $$14.getAsString();
                  this.a(wz.b("           ").f($$15).a(n.p), false);
               }

               this.D();
               this.D();
            }
         }
      }
   }

   private void D() {
      this.C.add(aya.a);
   }

   private void a(String $$0) {
      this.C.addAll(this.l.h.c(wz.b($$0), 256));
   }

   private void a(wz $$0, boolean $$1) {
      if ($$1) {
         this.D.add(this.C.size());
      }

      this.C.add($$0.g());
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.B = Math.max(0.0F, this.B + $$3 * this.H);
      int $$4 = this.m / 2 - 128;
      int $$5 = this.n + 50;
      float $$6 = -this.B;
      $$0.c().a();
      $$0.c().a(0.0F, $$6, 0.0F);
      this.K.a($$0, this.m, 1.0F, $$5);
      int $$7 = $$5 + 100;

      for (int $$8 = 0; $$8 < this.C.size(); $$8++) {
         if ($$8 == this.C.size() - 1) {
            float $$9 = (float)$$7 + $$6 - (float)(this.n / 2 - 6);
            if ($$9 < 0.0F) {
               $$0.c().a(0.0F, -$$9, 0.0F);
            }
         }

         if ((float)$$7 + $$6 + 12.0F + 8.0F > 0.0F && (float)$$7 + $$6 < (float)this.n) {
            aya $$10 = this.C.get($$8);
            if (this.D.contains($$8)) {
               $$0.a(this.o, $$10, $$4 + 128, $$7, -1);
            } else {
               $$0.b(this.o, $$10, $$4, $$7, -1);
            }
         }

         $$7 += 12;
      }

      $$0.c().b();
   }

   private void c(fhz $$0) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
      $$0.a(b, 0, 0, 0, 0.0F, 0.0F, this.m, this.n, this.m, this.n);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      if (this.z) {
         $$0.b(gfh.u(), 0, 0, this.m, this.n, 0);
      } else {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected void a(fhz $$0, int $$1, int $$2, int $$3, int $$4) {
      float $$5 = this.B * 0.5F;
      fod.a($$0, fod.f, 0, 0, 0.0F, $$5, $$3, $$4);
   }

   @Override
   public boolean k() {
      return !this.z;
   }

   @Override
   public void j() {
      this.l.s().b(avn.c);
   }

   @Override
   public avm B() {
      return avn.c;
   }

   @FunctionalInterface
   interface a {
      void read(Reader var1) throws IOException;
   }
}
