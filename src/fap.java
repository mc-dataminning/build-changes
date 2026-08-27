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

public class fap extends fah {
   private static final Logger a = LogUtils.getLogger();
   private static final agg b = new agg("textures/misc/vignette.png");
   private static final ur c = ur.b("============").a(n.p);
   private static final String k = "           ";
   private static final String l = "" + n.p + n.q + n.k + n.l;
   private static final float m = 5.0F;
   private static final float n = 15.0F;
   private final boolean o;
   private final Runnable p;
   private float q;
   private List<asu> r;
   private IntSet t;
   private int u;
   private boolean v;
   private final IntSet w = new IntOpenHashSet();
   private float x;
   private final float y;
   private int z;
   private final evd A = new evd(false);

   public fap(boolean $$0, Runnable $$1) {
      super(esj.a);
      this.o = $$0;
      this.p = $$1;
      if (!$$0) {
         this.y = 0.75F;
      } else {
         this.y = 0.5F;
      }

      this.z = 1;
      this.x = this.y;
   }

   private float l() {
      return this.v ? this.y * (5.0F + (float)this.w.size() * 15.0F) * (float)this.z : this.y * (float)this.z;
   }

   @Override
   public void d() {
      this.f.r().a();
      this.f.ah().a(false);
      float $$0 = (float)(this.u + this.h + this.h + 24);
      if (this.q > $$0) {
         this.C();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.z = -1;
      } else if ($$0 == 341 || $$0 == 345) {
         this.w.add($$0);
      } else if ($$0 == 32) {
         this.v = true;
      }

      this.x = this.l();
      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.z = 1;
      }

      if ($$0 == 32) {
         this.v = false;
      } else if ($$0 == 341 || $$0 == 345) {
         this.w.remove($$0);
      }

      this.x = this.l();
      return super.b($$0, $$1, $$2);
   }

   @Override
   public void aE_() {
      this.C();
   }

   private void C() {
      this.p.run();
   }

   @Override
   protected void aO_() {
      if (this.r == null) {
         this.r = Lists.newArrayList();
         this.t = new IntOpenHashSet();
         if (this.o) {
            this.a("texts/end.txt", this::a);
         }

         this.a("texts/credits.json", this::b);
         if (this.o) {
            this.a("texts/postcredits.txt", this::a);
         }

         this.u = this.r.size() * 12;
      }
   }

   private void a(String $$0, fap.a $$1) {
      try (Reader $$2 = this.f.Y().openAsReader(new agg($$0))) {
         $$1.read($$2);
      } catch (Exception var8) {
         a.error("Couldn't load credits", var8);
      }
   }

   private void a(Reader $$0) throws IOException {
      BufferedReader $$1 = new BufferedReader($$0);
      ato $$2 = ato.a(8124371L);

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
         this.D();
      }

      for (int $$7 = 0; $$7 < 8; $$7++) {
         this.D();
      }
   }

   private void b(Reader $$0) {
      for (JsonElement $$2 : asy.b($$0)) {
         JsonObject $$3 = $$2.getAsJsonObject();
         String $$4 = $$3.get("section").getAsString();
         this.a(c, true);
         this.a(ur.b($$4).a(n.o), true);
         this.a(c, true);
         this.D();
         this.D();

         for (JsonElement $$6 : $$3.getAsJsonArray("disciplines")) {
            JsonObject $$7 = $$6.getAsJsonObject();
            String $$8 = $$7.get("discipline").getAsString();
            if (StringUtils.isNotEmpty($$8)) {
               this.a(ur.b($$8).a(n.o), true);
               this.D();
               this.D();
            }

            for (JsonElement $$10 : $$7.getAsJsonArray("titles")) {
               JsonObject $$11 = $$10.getAsJsonObject();
               String $$12 = $$11.get("title").getAsString();
               JsonArray $$13 = $$11.getAsJsonArray("names");
               this.a(ur.b($$12).a(n.h), false);

               for (JsonElement $$14 : $$13) {
                  String $$15 = $$14.getAsString();
                  this.a(ur.b("           ").f($$15).a(n.p), false);
               }

               this.D();
               this.D();
            }
         }
      }
   }

   private void D() {
      this.r.add(asu.a);
   }

   private void a(String $$0) {
      this.r.addAll(this.f.h.c(ur.b($$0), 256));
   }

   private void a(ur $$0, boolean $$1) {
      if ($$1) {
         this.t.add(this.r.size());
      }

      this.r.add($$0.g());
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      this.q = Math.max(0.0F, this.q + $$3 * this.x);
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.g / 2 - 128;
      int $$5 = this.h + 50;
      float $$6 = -this.q;
      $$0.c().a();
      $$0.c().a(0.0F, $$6, 0.0F);
      this.A.a($$0, this.g, 1.0F, $$5);
      int $$7 = $$5 + 100;

      for (int $$8 = 0; $$8 < this.r.size(); $$8++) {
         if ($$8 == this.r.size() - 1) {
            float $$9 = (float)$$7 + $$6 - (float)(this.h / 2 - 6);
            if ($$9 < 0.0F) {
               $$0.c().a(0.0F, -$$9, 0.0F);
            }
         }

         if ((float)$$7 + $$6 + 12.0F + 8.0F > 0.0F && (float)$$7 + $$6 < (float)this.h) {
            asu $$10 = this.r.get($$8);
            if (this.t.contains($$8)) {
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
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.g;
      float $$5 = this.q * 0.5F;
      int $$6 = 64;
      float $$7 = this.q / this.y;
      float $$8 = $$7 * 0.02F;
      float $$9 = (float)(this.u + this.h + this.h + 24) / this.y;
      float $$10 = ($$9 - 20.0F - $$7) * 0.005F;
      if ($$10 < $$8) {
         $$8 = $$10;
      }

      if ($$8 > 1.0F) {
         $$8 = 1.0F;
      }

      $$8 *= $$8;
      $$8 = $$8 * 96.0F / 255.0F;
      $$0.a($$8, $$8, $$8, 1.0F);
      $$0.a(d, 0, 0, 0, 0.0F, $$5, $$4, this.h, 64, 64);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void aF_() {
      this.f.r().b(aql.c);
   }

   @Override
   public aqk B() {
      return aql.c;
   }

   @FunctionalInterface
   interface a {
      void read(Reader var1) throws IOException;
   }
}
