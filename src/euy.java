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

public class euy extends euq {
   private static final Logger a = LogUtils.getLogger();
   private static final acq b = new acq("textures/misc/vignette.png");
   private static final sw c = sw.b("============").a(n.p);
   private static final String k = "           ";
   private static final String l = "" + n.p + n.q + n.k + n.l;
   private static final float m = 5.0F;
   private static final float n = 15.0F;
   private final boolean o;
   private final Runnable p;
   private float q;
   private List<aom> r;
   private IntSet s;
   private int t;
   private boolean u;
   private final IntSet v = new IntOpenHashSet();
   private float w;
   private final float x;
   private int y;
   private final epx z = new epx(false);

   public euy(boolean $$0, Runnable $$1) {
      super(enf.a);
      this.o = $$0;
      this.p = $$1;
      if (!$$0) {
         this.x = 0.75F;
      } else {
         this.x = 0.5F;
      }

      this.y = 1;
      this.w = this.x;
   }

   private float l() {
      return this.u ? this.x * (5.0F + (float)this.v.size() * 15.0F) * (float)this.y : this.x * (float)this.y;
   }

   @Override
   public void f() {
      this.f.r().a();
      this.f.ah().a(false);
      float $$0 = (float)(this.t + this.h + this.h + 24);
      if (this.q > $$0) {
         this.B();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.y = -1;
      } else if ($$0 == 341 || $$0 == 345) {
         this.v.add($$0);
      } else if ($$0 == 32) {
         this.u = true;
      }

      this.w = this.l();
      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.y = 1;
      }

      if ($$0 == 32) {
         this.u = false;
      } else if ($$0 == 341 || $$0 == 345) {
         this.v.remove($$0);
      }

      this.w = this.l();
      return super.b($$0, $$1, $$2);
   }

   @Override
   public void aw_() {
      this.B();
   }

   private void B() {
      this.p.run();
   }

   @Override
   protected void b() {
      if (this.r == null) {
         this.r = Lists.newArrayList();
         this.s = new IntOpenHashSet();
         if (this.o) {
            this.a("texts/end.txt", this::a);
         }

         this.a("texts/credits.json", this::b);
         if (this.o) {
            this.a("texts/postcredits.txt", this::a);
         }

         this.t = this.r.size() * 12;
      }
   }

   private void a(String $$0, euy.a $$1) {
      try (Reader $$2 = this.f.Y().openAsReader(new acq($$0))) {
         $$1.read($$2);
      } catch (Exception var8) {
         a.error("Couldn't load credits", var8);
      }
   }

   private void a(Reader $$0) throws IOException {
      BufferedReader $$1 = new BufferedReader($$0);
      apf $$2 = apf.a(8124371L);

      String $$3;
      while (($$3 = $$1.readLine()) != null) {
         $$3 = $$3.replaceAll("PLAYERNAME", this.f.U().c());

         int $$4;
         while (($$4 = $$3.indexOf(l)) != -1) {
            String $$5 = $$3.substring(0, $$4);
            String $$6 = $$3.substring($$4 + l.length());
            $$3 = $$5 + n.p + n.q + "XXXXXXXX".substring(0, $$2.a(4) + 3) + $$6;
         }

         this.a($$3);
         this.C();
      }

      for (int $$7 = 0; $$7 < 8; $$7++) {
         this.C();
      }
   }

   private void b(Reader $$0) {
      for (JsonElement $$2 : aor.b($$0)) {
         JsonObject $$3 = $$2.getAsJsonObject();
         String $$4 = $$3.get("section").getAsString();
         this.a(c, true);
         this.a(sw.b($$4).a(n.o), true);
         this.a(c, true);
         this.C();
         this.C();

         for (JsonElement $$6 : $$3.getAsJsonArray("disciplines")) {
            JsonObject $$7 = $$6.getAsJsonObject();
            String $$8 = $$7.get("discipline").getAsString();
            if (StringUtils.isNotEmpty($$8)) {
               this.a(sw.b($$8).a(n.o), true);
               this.C();
               this.C();
            }

            for (JsonElement $$10 : $$7.getAsJsonArray("titles")) {
               JsonObject $$11 = $$10.getAsJsonObject();
               String $$12 = $$11.get("title").getAsString();
               JsonArray $$13 = $$11.getAsJsonArray("names");
               this.a(sw.b($$12).a(n.h), false);

               for (JsonElement $$14 : $$13) {
                  String $$15 = $$14.getAsString();
                  this.a(sw.b("           ").f($$15).a(n.p), false);
               }

               this.C();
               this.C();
            }
         }
      }
   }

   private void C() {
      this.r.add(aom.a);
   }

   private void a(String $$0) {
      this.r.addAll(this.f.h.c(sw.b($$0), 256));
   }

   private void a(sw $$0, boolean $$1) {
      if ($$1) {
         this.s.add(this.r.size());
      }

      this.r.add($$0.f());
   }

   private void c(eox $$0) {
      int $$1 = this.g;
      float $$2 = this.q * 0.5F;
      int $$3 = 64;
      float $$4 = this.q / this.x;
      float $$5 = $$4 * 0.02F;
      float $$6 = (float)(this.t + this.h + this.h + 24) / this.x;
      float $$7 = ($$6 - 20.0F - $$4) * 0.005F;
      if ($$7 < $$5) {
         $$5 = $$7;
      }

      if ($$5 > 1.0F) {
         $$5 = 1.0F;
      }

      $$5 *= $$5;
      $$5 = $$5 * 96.0F / 255.0F;
      $$0.a($$5, $$5, $$5, 1.0F);
      $$0.a(d, 0, 0, 0, 0.0F, $$2, $$1, this.h, 64, 64);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.q = Math.max(0.0F, this.q + $$3 * this.w);
      this.c($$0);
      int $$4 = this.g / 2 - 128;
      int $$5 = this.h + 50;
      float $$6 = -this.q;
      $$0.c().a();
      $$0.c().a(0.0F, $$6, 0.0F);
      this.z.a($$0, this.g, 1.0F, $$5);
      int $$7 = $$5 + 100;

      for (int $$8 = 0; $$8 < this.r.size(); $$8++) {
         if ($$8 == this.r.size() - 1) {
            float $$9 = (float)$$7 + $$6 - (float)(this.h / 2 - 6);
            if ($$9 < 0.0F) {
               $$0.c().a(0.0F, -$$9, 0.0F);
            }
         }

         if ((float)$$7 + $$6 + 12.0F + 8.0F > 0.0F && (float)$$7 + $$6 < (float)this.h) {
            aom $$10 = this.r.get($$8);
            if (this.s.contains($$8)) {
               $$0.a(this.i, $$10, $$4 + 128, $$7, 16777215);
            } else {
               $$0.b(this.i, $$10, $$4, $$7, 16777215);
            }
         }

         $$7 += 12;
      }

      $$0.c().b();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
      $$0.a(b, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, this.g, this.h);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void ax_() {
      this.f.r().b(amf.c);
   }

   @Override
   public ame A() {
      return amf.c;
   }

   @FunctionalInterface
   interface a {
      void read(Reader var1) throws IOException;
   }
}
