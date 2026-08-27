import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector2ic;

public class exe {
   public static final float a = 10000.0F;
   public static final float b = -10000.0F;
   private static final int c = 2;
   private final evr d;
   private final eqk e;
   private final ftt.a f;
   private final exe.a g = new exe.a();
   private final exf h;
   private boolean i;

   private exe(evr $$0, eqk $$1, ftt.a $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.h = $$0.aF();
   }

   public exe(evr $$0, ftt.a $$1) {
      this($$0, new eqk(), $$1);
   }

   @Deprecated
   public void a(Runnable $$0) {
      this.e();
      this.i = true;
      $$0.run();
      this.i = false;
      this.e();
   }

   @Deprecated
   private void g() {
      if (!this.i) {
         this.e();
      }
   }

   @Deprecated
   private void h() {
      if (this.i) {
         this.e();
      }
   }

   public int a() {
      return this.d.aM().o();
   }

   public int b() {
      return this.d.aM().p();
   }

   public eqk c() {
      return this.e;
   }

   public ftt.a d() {
      return this.f;
   }

   public void e() {
      RenderSystem.disableDepthTest();
      this.f.b();
      RenderSystem.enableDepthTest();
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.a(fub.B(), $$0, $$1, $$2, $$3);
   }

   public void a(fub $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$2 < $$1) {
         int $$5 = $$1;
         $$1 = $$2;
         $$2 = $$5;
      }

      this.a($$0, $$1, $$3, $$2 + 1, $$3 + 1, $$4);
   }

   public void b(int $$0, int $$1, int $$2, int $$3) {
      this.b(fub.B(), $$0, $$1, $$2, $$3);
   }

   public void b(fub $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$3 < $$2) {
         int $$5 = $$2;
         $$2 = $$3;
         $$3 = $$5;
      }

      this.a($$0, $$1, $$2 + 1, $$1 + 1, $$3, $$4);
   }

   public void c(int $$0, int $$1, int $$2, int $$3) {
      this.a(this.g.a(new fbu($$0, $$1, $$2 - $$0, $$3 - $$1)));
   }

   public void f() {
      this.a(this.g.a());
   }

   private void a(@Nullable fbu $$0) {
      this.h();
      if ($$0 != null) {
         epo $$1 = evr.O().aM();
         int $$2 = $$1.l();
         double $$3 = $$1.s();
         double $$4 = (double)$$0.d() * $$3;
         double $$5 = (double)$$2 - (double)$$0.c() * $$3;
         double $$6 = (double)$$0.g() * $$3;
         double $$7 = (double)$$0.h() * $$3;
         RenderSystem.enableScissor((int)$$4, (int)$$5, Math.max(0, (int)$$6), Math.max(0, (int)$$7));
      } else {
         RenderSystem.disableScissor();
      }
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      this.h();
      RenderSystem.setShaderColor($$0, $$1, $$2, $$3);
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$2, $$3, 0, $$4);
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a(fub.B(), $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(fub $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, 0, $$5);
   }

   public void a(fub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      Matrix4f $$7 = this.e.c().a();
      if ($$1 < $$3) {
         int $$8 = $$1;
         $$1 = $$3;
         $$3 = $$8;
      }

      if ($$2 < $$4) {
         int $$9 = $$2;
         $$2 = $$4;
         $$4 = $$9;
      }

      float $$10 = (float)atz.b.a($$6) / 255.0F;
      float $$11 = (float)atz.b.b($$6) / 255.0F;
      float $$12 = (float)atz.b.c($$6) / 255.0F;
      float $$13 = (float)atz.b.d($$6) / 255.0F;
      eqo $$14 = this.f.getBuffer($$0);
      $$14.a($$7, (float)$$1, (float)$$2, (float)$$5).a($$11, $$12, $$13, $$10).e();
      $$14.a($$7, (float)$$1, (float)$$4, (float)$$5).a($$11, $$12, $$13, $$10).e();
      $$14.a($$7, (float)$$3, (float)$$4, (float)$$5).a($$11, $$12, $$13, $$10).e();
      $$14.a($$7, (float)$$3, (float)$$2, (float)$$5).a($$11, $$12, $$13, $$10).e();
      this.g();
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, 0, $$4, $$5);
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      this.a(fub.B(), $$0, $$1, $$2, $$3, $$5, $$6, $$4);
   }

   public void a(fub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      eqo $$8 = this.f.getBuffer($$0);
      this.a($$8, $$1, $$2, $$3, $$4, $$7, $$5, $$6);
      this.g();
   }

   private void a(eqo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      float $$8 = (float)atz.b.a($$6) / 255.0F;
      float $$9 = (float)atz.b.b($$6) / 255.0F;
      float $$10 = (float)atz.b.c($$6) / 255.0F;
      float $$11 = (float)atz.b.d($$6) / 255.0F;
      float $$12 = (float)atz.b.a($$7) / 255.0F;
      float $$13 = (float)atz.b.b($$7) / 255.0F;
      float $$14 = (float)atz.b.c($$7) / 255.0F;
      float $$15 = (float)atz.b.d($$7) / 255.0F;
      Matrix4f $$16 = this.e.c().a();
      $$0.a($$16, (float)$$1, (float)$$2, (float)$$5).a($$9, $$10, $$11, $$8).e();
      $$0.a($$16, (float)$$1, (float)$$4, (float)$$5).a($$13, $$14, $$15, $$12).e();
      $$0.a($$16, (float)$$3, (float)$$4, (float)$$5).a($$13, $$14, $$15, $$12).e();
      $$0.a($$16, (float)$$3, (float)$$2, (float)$$5).a($$9, $$10, $$11, $$8).e();
   }

   public void a(exc $$0, String $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2 - $$0.b($$1) / 2, $$3, $$4);
   }

   public void a(exc $$0, vg $$1, int $$2, int $$3, int $$4) {
      aub $$5 = $$1.g();
      this.b($$0, $$5, $$2 - $$0.a($$5) / 2, $$3, $$4);
   }

   public void a(exc $$0, aub $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2 - $$0.a($$1) / 2, $$3, $$4);
   }

   public int b(exc $$0, @Nullable String $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(exc $$0, @Nullable String $$1, int $$2, int $$3, int $$4, boolean $$5) {
      if ($$1 == null) {
         return 0;
      } else {
         int $$6 = $$0.a($$1, (float)$$2, (float)$$3, $$4, $$5, this.e.c().a(), this.f, exc.a.a, 0, 15728880, $$0.a());
         this.g();
         return $$6;
      }
   }

   public int b(exc $$0, aub $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(exc $$0, aub $$1, int $$2, int $$3, int $$4, boolean $$5) {
      int $$6 = $$0.a($$1, (float)$$2, (float)$$3, $$4, $$5, this.e.c().a(), this.f, exc.a.a, 0, 15728880);
      this.g();
      return $$6;
   }

   public int b(exc $$0, vg $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(exc $$0, vg $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return this.a($$0, $$1.g(), $$2, $$3, $$4, $$5);
   }

   public void a(exc $$0, vl $$1, int $$2, int $$3, int $$4, int $$5) {
      for (aub $$6 : $$0.c($$1, $$4)) {
         this.a($$0, $$6, $$2, $$3, $$5, false);
         $$3 += 9;
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, gfb $$5) {
      this.a($$5, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, gfb $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$5.i(), $$0, $$0 + $$3, $$1, $$1 + $$4, $$2, $$5.c(), $$5.d(), $$5.g(), $$5.h(), $$6, $$7, $$8, $$9);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$0 + $$2, $$1 + 1, $$4);
      this.a($$0, $$1 + $$3 - 1, $$0 + $$2, $$1 + $$3, $$4);
      this.a($$0, $$1 + 1, $$0 + 1, $$1 + $$3 - 1, $$4);
      this.a($$0 + $$2 - 1, $$1 + 1, $$0 + $$2, $$1 + $$3 - 1, $$4);
   }

   public void a(ahh $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$2, 0, $$3, $$4);
   }

   public void a(ahh $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      gfb $$6 = this.h.a($$0);
      ggs $$7 = this.h.a($$6);
      if ($$7 instanceof ggs.b) {
         this.a($$6, $$1, $$2, $$3, $$4, $$5);
      } else if ($$7 instanceof ggs.c $$8) {
         this.a($$6, $$1, $$2, $$3, $$4, $$5, 0, 0, $$8.b(), $$8.c(), $$8.b(), $$8.c());
      } else if ($$7 instanceof ggs.a $$9) {
         this.a($$6, $$9, $$1, $$2, $$3, $$4, $$5);
      }
   }

   public void a(ahh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0, $$7, $$8);
   }

   public void a(ahh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
      gfb $$10 = this.h.a($$0);
      ggs $$11 = this.h.a($$10);
      if ($$11 instanceof ggs.b) {
         this.a($$10, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
      } else {
         this.a($$10, $$5, $$6, $$7, $$8, $$9);
      }
   }

   private void a(gfb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
      if ($$8 != 0 && $$9 != 0) {
         this.a(
            $$0.i(),
            $$5,
            $$5 + $$8,
            $$6,
            $$6 + $$9,
            $$7,
            $$0.a((float)$$3 / (float)$$1),
            $$0.a((float)($$3 + $$8) / (float)$$1),
            $$0.c((float)$$4 / (float)$$2),
            $$0.c((float)($$4 + $$9) / (float)$$2)
         );
      }
   }

   private void a(gfb $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      if ($$4 != 0 && $$5 != 0) {
         this.a($$0.i(), $$1, $$1 + $$4, $$2, $$2 + $$5, $$3, $$0.c(), $$0.d(), $$0.g(), $$0.h());
      }
   }

   public void a(ahh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      this.a($$0, $$1, $$2, 0, (float)$$3, (float)$$4, $$5, $$6, 256, 256);
   }

   public void a(ahh $$0, int $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9) {
      this.a($$0, $$1, $$1 + $$6, $$2, $$2 + $$7, $$3, $$6, $$7, $$4, $$5, $$8, $$9);
   }

   public void a(ahh $$0, int $$1, int $$2, int $$3, int $$4, float $$5, float $$6, int $$7, int $$8, int $$9, int $$10) {
      this.a($$0, $$1, $$1 + $$3, $$2, $$2 + $$4, 0, $$7, $$8, $$5, $$6, $$9, $$10);
   }

   public void a(ahh $$0, int $$1, int $$2, float $$3, float $$4, int $$5, int $$6, int $$7, int $$8) {
      this.a($$0, $$1, $$2, $$5, $$6, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   void a(ahh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, float $$8, float $$9, int $$10, int $$11) {
      this.a(
         $$0,
         $$1,
         $$2,
         $$3,
         $$4,
         $$5,
         ($$8 + 0.0F) / (float)$$10,
         ($$8 + (float)$$6) / (float)$$10,
         ($$9 + 0.0F) / (float)$$11,
         ($$9 + (float)$$7) / (float)$$11
      );
   }

   void a(ahh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, float $$9) {
      RenderSystem.setShaderTexture(0, $$0);
      RenderSystem.setShader(ftm::s);
      Matrix4f $$10 = this.e.c().a();
      eqf $$11 = eqm.b().d();
      $$11.a(eqp.b.h, eqi.q);
      $$11.a($$10, (float)$$1, (float)$$3, (float)$$5).a($$6, $$8).e();
      $$11.a($$10, (float)$$1, (float)$$4, (float)$$5).a($$6, $$9).e();
      $$11.a($$10, (float)$$2, (float)$$4, (float)$$5).a($$7, $$9).e();
      $$11.a($$10, (float)$$2, (float)$$3, (float)$$5).a($$7, $$8).e();
      eqg.a($$11.d());
   }

   void a(ahh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11, float $$12, float $$13) {
      RenderSystem.setShaderTexture(0, $$0);
      RenderSystem.setShader(ftm::r);
      RenderSystem.enableBlend();
      Matrix4f $$14 = this.e.c().a();
      eqf $$15 = eqm.b().d();
      $$15.a(eqp.b.h, eqi.r);
      $$15.a($$14, (float)$$1, (float)$$3, (float)$$5).a($$10, $$11, $$12, $$13).a($$6, $$8).e();
      $$15.a($$14, (float)$$1, (float)$$4, (float)$$5).a($$10, $$11, $$12, $$13).a($$6, $$9).e();
      $$15.a($$14, (float)$$2, (float)$$4, (float)$$5).a($$10, $$11, $$12, $$13).a($$7, $$9).e();
      $$15.a($$14, (float)$$2, (float)$$3, (float)$$5).a($$10, $$11, $$12, $$13).a($$7, $$8).e();
      eqg.a($$15.d());
      RenderSystem.disableBlend();
   }

   private void a(gfb $$0, ggs.a $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      ggs.a.a $$7 = $$1.d();
      int $$8 = Math.min($$7.a(), $$5 / 2);
      int $$9 = Math.min($$7.c(), $$5 / 2);
      int $$10 = Math.min($$7.b(), $$6 / 2);
      int $$11 = Math.min($$7.d(), $$6 / 2);
      if ($$5 == $$1.b() && $$6 == $$1.c()) {
         this.a($$0, $$1.b(), $$1.c(), 0, 0, $$2, $$3, $$4, $$5, $$6);
      } else if ($$6 == $$1.c()) {
         this.a($$0, $$1.b(), $$1.c(), 0, 0, $$2, $$3, $$4, $$8, $$6);
         this.a($$0, $$2 + $$8, $$3, $$4, $$5 - $$9 - $$8, $$6, $$8, 0, $$1.b() - $$9 - $$8, $$1.c(), $$1.b(), $$1.c());
         this.a($$0, $$1.b(), $$1.c(), $$1.b() - $$9, 0, $$2 + $$5 - $$9, $$3, $$4, $$9, $$6);
      } else if ($$5 == $$1.b()) {
         this.a($$0, $$1.b(), $$1.c(), 0, 0, $$2, $$3, $$4, $$5, $$10);
         this.a($$0, $$2, $$3 + $$10, $$4, $$5, $$6 - $$11 - $$10, 0, $$10, $$1.b(), $$1.c() - $$11 - $$10, $$1.b(), $$1.c());
         this.a($$0, $$1.b(), $$1.c(), 0, $$1.c() - $$11, $$2, $$3 + $$6 - $$11, $$4, $$5, $$11);
      } else {
         this.a($$0, $$1.b(), $$1.c(), 0, 0, $$2, $$3, $$4, $$8, $$10);
         this.a($$0, $$2 + $$8, $$3, $$4, $$5 - $$9 - $$8, $$10, $$8, 0, $$1.b() - $$9 - $$8, $$10, $$1.b(), $$1.c());
         this.a($$0, $$1.b(), $$1.c(), $$1.b() - $$9, 0, $$2 + $$5 - $$9, $$3, $$4, $$9, $$10);
         this.a($$0, $$1.b(), $$1.c(), 0, $$1.c() - $$11, $$2, $$3 + $$6 - $$11, $$4, $$8, $$11);
         this.a($$0, $$2 + $$8, $$3 + $$6 - $$11, $$4, $$5 - $$9 - $$8, $$11, $$8, $$1.c() - $$11, $$1.b() - $$9 - $$8, $$11, $$1.b(), $$1.c());
         this.a($$0, $$1.b(), $$1.c(), $$1.b() - $$9, $$1.c() - $$11, $$2 + $$5 - $$9, $$3 + $$6 - $$11, $$4, $$9, $$11);
         this.a($$0, $$2, $$3 + $$10, $$4, $$8, $$6 - $$11 - $$10, 0, $$10, $$8, $$1.c() - $$11 - $$10, $$1.b(), $$1.c());
         this.a($$0, $$2 + $$8, $$3 + $$10, $$4, $$5 - $$9 - $$8, $$6 - $$11 - $$10, $$8, $$10, $$1.b() - $$9 - $$8, $$1.c() - $$11 - $$10, $$1.b(), $$1.c());
         this.a($$0, $$2 + $$5 - $$9, $$3 + $$10, $$4, $$8, $$6 - $$11 - $$10, $$1.b() - $$9, $$10, $$9, $$1.c() - $$11 - $$10, $$1.b(), $$1.c());
      }
   }

   private void a(gfb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11) {
      if ($$4 > 0 && $$5 > 0) {
         if ($$8 > 0 && $$9 > 0) {
            for (int $$12 = 0; $$12 < $$4; $$12 += $$8) {
               int $$13 = Math.min($$8, $$4 - $$12);

               for (int $$14 = 0; $$14 < $$5; $$14 += $$9) {
                  int $$15 = Math.min($$9, $$5 - $$14);
                  this.a($$0, $$10, $$11, $$6, $$7, $$1 + $$12, $$2 + $$14, $$3, $$13, $$15);
               }
            }
         } else {
            throw new IllegalArgumentException("Tiled sprite texture size must be positive, got " + $$8 + "x" + $$9);
         }
      }
   }

   public void a(cng $$0, int $$1, int $$2) {
      this.a(this.d.s, this.d.r, $$0, $$1, $$2, 0);
   }

   public void a(cng $$0, int $$1, int $$2, int $$3) {
      this.a(this.d.s, this.d.r, $$0, $$1, $$2, $$3);
   }

   public void a(cng $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a(this.d.s, this.d.r, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(cng $$0, int $$1, int $$2) {
      this.b($$0, $$1, $$2, 0);
   }

   public void b(cng $$0, int $$1, int $$2, int $$3) {
      this.a(null, this.d.r, $$0, $$1, $$2, $$3);
   }

   public void a(bmo $$0, cng $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$0.dL(), $$1, $$2, $$3, $$4);
   }

   private void a(@Nullable bmo $$0, @Nullable ctx $$1, cng $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 0);
   }

   private void a(@Nullable bmo $$0, @Nullable ctx $$1, cng $$2, int $$3, int $$4, int $$5, int $$6) {
      if (!$$2.b()) {
         ghb $$7 = this.d.aq().a($$2, $$1, $$0, $$5);
         this.e.a();
         this.e.a((float)($$3 + 8), (float)($$4 + 8), (float)(150 + ($$7.b() ? $$6 : 0)));

         try {
            this.e.a(new Matrix4f().scaling(1.0F, -1.0F, 1.0F));
            this.e.b(16.0F, 16.0F, 16.0F);
            boolean $$8 = !$$7.c();
            if ($$8) {
               epg.a();
            }

            this.d.aq().a($$2, cnd.g, false, this.e, this.d(), 15728880, ges.d, $$7);
            this.e();
            if ($$8) {
               epg.b();
            }
         } catch (Throwable var12) {
            o $$10 = o.a(var12, "Rendering item");
            p $$11 = $$10.a("Item being rendered");
            $$11.a("Item Type", () -> String.valueOf($$2.d()));
            $$11.a("Item Damage", () -> String.valueOf($$2.k()));
            $$11.a("Item NBT", () -> String.valueOf($$2.v()));
            $$11.a("Item Foil", () -> String.valueOf($$2.B()));
            throw new y($$10);
         }

         this.e.b();
      }
   }

   public void a(exc $$0, cng $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, null);
   }

   public void a(exc $$0, cng $$1, int $$2, int $$3, @Nullable String $$4) {
      if (!$$1.b()) {
         this.e.a();
         if ($$1.L() != 1 || $$4 != null) {
            String $$5 = $$4 == null ? String.valueOf($$1.L()) : $$4;
            this.e.a(0.0F, 0.0F, 200.0F);
            this.a($$0, $$5, $$2 + 19 - 2 - $$0.b($$5), $$3 + 6 + 3, 16777215, true);
         }

         if ($$1.m()) {
            int $$6 = $$1.n();
            int $$7 = $$1.o();
            int $$8 = $$2 + 2;
            int $$9 = $$3 + 13;
            this.a(fub.C(), $$8, $$9, $$8 + 13, $$9 + 2, -16777216);
            this.a(fub.C(), $$8, $$9, $$8 + $$6, $$9 + 1, $$7 | 0xFF000000);
         }

         fsv $$10 = this.d.s;
         float $$11 = $$10 == null ? 0.0F : $$10.gn().a($$1.d(), this.d.as());
         if ($$11 > 0.0F) {
            int $$12 = $$3 + aup.d(16.0F * (1.0F - $$11));
            int $$13 = $$12 + aup.f(16.0F * $$11);
            this.a(fub.C(), $$2, $$12, $$2 + 16, $$13, Integer.MAX_VALUE);
         }

         this.e.b();
      }
   }

   public void b(exc $$0, cng $$1, int $$2, int $$3) {
      this.a($$0, fdm.a(this.d, $$1), $$1.a(), $$2, $$3);
   }

   public void a(exc $$0, List<vg> $$1, Optional<ckm> $$2, int $$3, int $$4) {
      List<fge> $$5 = $$1.stream().map(vg::g).map(fge::a).collect(Collectors.toList());
      $$2.ifPresent($$1x -> $$5.add(1, fge.a($$1x)));
      this.a($$0, $$5, $$3, $$4, fgg.a);
   }

   public void a(exc $$0, vg $$1, int $$2, int $$3) {
      this.b($$0, List.of($$1.g()), $$2, $$3);
   }

   public void a(exc $$0, List<vg> $$1, int $$2, int $$3) {
      this.b($$0, Lists.transform($$1, vg::g), $$2, $$3);
   }

   public void b(exc $$0, List<? extends aub> $$1, int $$2, int $$3) {
      this.a($$0, $$1.stream().map(fge::a).collect(Collectors.toList()), $$2, $$3, fgg.a);
   }

   public void a(exc $$0, List<aub> $$1, fgf $$2, int $$3, int $$4) {
      this.a($$0, $$1.stream().map(fge::a).collect(Collectors.toList()), $$3, $$4, $$2);
   }

   private void a(exc $$0, List<fge> $$1, int $$2, int $$3, fgf $$4) {
      if (!$$1.isEmpty()) {
         int $$5 = 0;
         int $$6 = $$1.size() == 1 ? -2 : 0;

         for (fge $$7 : $$1) {
            int $$8 = $$7.a($$0);
            if ($$8 > $$5) {
               $$5 = $$8;
            }

            $$6 += $$7.a();
         }

         int $$9 = $$5;
         int $$10 = $$6;
         Vector2ic $$11 = $$4.a(this.a(), this.b(), $$2, $$3, $$9, $$10);
         int $$12 = $$11.x();
         int $$13 = $$11.y();
         this.e.a();
         int $$14 = 400;
         this.a(() -> fgi.a(this, $$12, $$13, $$9, $$10, 400));
         this.e.a(0.0F, 0.0F, 400.0F);
         int $$15 = $$13;

         for (int $$16 = 0; $$16 < $$1.size(); $$16++) {
            fge $$17 = $$1.get($$16);
            $$17.a($$0, $$12, $$15, this.e.c().a(), this.f);
            $$15 += $$17.a() + ($$16 == 0 ? 2 : 0);
         }

         $$15 = $$13;

         for (int $$18 = 0; $$18 < $$1.size(); $$18++) {
            fge $$19 = $$1.get($$18);
            $$19.a($$0, $$12, $$15, this);
            $$15 += $$19.a() + ($$18 == 0 ? 2 : 0);
         }

         this.e.b();
      }
   }

   public void a(exc $$0, @Nullable wd $$1, int $$2, int $$3) {
      if ($$1 != null && $$1.i() != null) {
         vm $$4 = $$1.i();
         vm.c $$5 = $$4.a(vm.a.b);
         if ($$5 != null) {
            this.b($$0, $$5.a(), $$2, $$3);
         } else {
            vm.b $$6 = $$4.a(vm.a.c);
            if ($$6 != null) {
               if (this.d.m.m) {
                  this.a($$0, $$6.a(), $$2, $$3);
               }
            } else {
               vg $$7 = $$4.a(vm.a.a);
               if ($$7 != null) {
                  this.b($$0, $$0.c($$7, Math.max(this.a() / 2, 200)), $$2, $$3);
               }
            }
         }
      }
   }

   static class a {
      private final Deque<fbu> a = new ArrayDeque<>();

      public fbu a(fbu $$0) {
         fbu $$1 = this.a.peekLast();
         if ($$1 != null) {
            fbu $$2 = Objects.requireNonNullElse($$0.b($$1), fbu.a());
            this.a.addLast($$2);
            return $$2;
         } else {
            this.a.addLast($$0);
            return $$0;
         }
      }

      @Nullable
      public fbu a() {
         if (this.a.isEmpty()) {
            throw new IllegalStateException("Scissor stack underflow");
         } else {
            this.a.removeLast();
            return this.a.peekLast();
         }
      }
   }
}
