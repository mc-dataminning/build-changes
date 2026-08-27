import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.joml.Matrix4f;

public class fsu {
   private static final int a = 6;
   private final ahg[] b = new ahg[6];

   public fsu(ahg $$0) {
      for (int $$1 = 0; $$1 < 6; $$1++) {
         this.b[$$1] = $$0.c($$0.a() + "_" + $$1 + ".png");
      }
   }

   public void a(evh $$0, float $$1, float $$2, float $$3) {
      eqc $$4 = eqc.b();
      epv $$5 = $$4.d();
      Matrix4f $$6 = new Matrix4f().setPerspective(1.4835298F, (float)$$0.aM().k() / (float)$$0.aM().l(), 0.05F, 10.0F);
      RenderSystem.backupProjectionMatrix();
      RenderSystem.setProjectionMatrix($$6, eqi.a);
      eqa $$7 = RenderSystem.getModelViewStack();
      $$7.a();
      $$7.e();
      $$7.a(a.b.rotationDegrees(180.0F));
      RenderSystem.applyModelViewMatrix();
      RenderSystem.setShader(fsz::t);
      RenderSystem.enableBlend();
      RenderSystem.disableCull();
      RenderSystem.depthMask(false);
      int $$8 = 2;

      for (int $$9 = 0; $$9 < 4; $$9++) {
         $$7.a();
         float $$10 = ((float)($$9 % 2) / 2.0F - 0.5F) / 256.0F;
         float $$11 = ((float)($$9 / 2) / 2.0F - 0.5F) / 256.0F;
         float $$12 = 0.0F;
         $$7.a($$10, $$11, 0.0F);
         $$7.a(a.b.rotationDegrees($$1));
         $$7.a(a.d.rotationDegrees($$2));
         RenderSystem.applyModelViewMatrix();

         for (int $$13 = 0; $$13 < 6; $$13++) {
            RenderSystem.setShaderTexture(0, this.b[$$13]);
            $$5.a(eqf.b.h, epy.s);
            int $$14 = Math.round(255.0F * $$3) / ($$9 + 1);
            if ($$13 == 0) {
               $$5.a(-1.0, -1.0, 1.0).a(0.0F, 0.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, 1.0, 1.0).a(0.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, 1.0, 1.0).a(1.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, -1.0, 1.0).a(1.0F, 0.0F).a(255, 255, 255, $$14).e();
            }

            if ($$13 == 1) {
               $$5.a(1.0, -1.0, 1.0).a(0.0F, 0.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, 1.0, 1.0).a(0.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, 1.0, -1.0).a(1.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, -1.0, -1.0).a(1.0F, 0.0F).a(255, 255, 255, $$14).e();
            }

            if ($$13 == 2) {
               $$5.a(1.0, -1.0, -1.0).a(0.0F, 0.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, 1.0, -1.0).a(0.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, 1.0, -1.0).a(1.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, -1.0, -1.0).a(1.0F, 0.0F).a(255, 255, 255, $$14).e();
            }

            if ($$13 == 3) {
               $$5.a(-1.0, -1.0, -1.0).a(0.0F, 0.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, 1.0, -1.0).a(0.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, 1.0, 1.0).a(1.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, -1.0, 1.0).a(1.0F, 0.0F).a(255, 255, 255, $$14).e();
            }

            if ($$13 == 4) {
               $$5.a(-1.0, -1.0, -1.0).a(0.0F, 0.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, -1.0, 1.0).a(0.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, -1.0, 1.0).a(1.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, -1.0, -1.0).a(1.0F, 0.0F).a(255, 255, 255, $$14).e();
            }

            if ($$13 == 5) {
               $$5.a(-1.0, 1.0, 1.0).a(0.0F, 0.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, 1.0, -1.0).a(0.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, 1.0, -1.0).a(1.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, 1.0, 1.0).a(1.0F, 0.0F).a(255, 255, 255, $$14).e();
            }

            $$4.c();
         }

         $$7.b();
         RenderSystem.applyModelViewMatrix();
         RenderSystem.colorMask(true, true, true, false);
      }

      RenderSystem.colorMask(true, true, true, true);
      RenderSystem.restoreProjectionMatrix();
      $$7.b();
      RenderSystem.applyModelViewMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.enableDepthTest();
   }

   public CompletableFuture<Void> a(gen $$0, Executor $$1) {
      CompletableFuture<?>[] $$2 = new CompletableFuture[6];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         $$2[$$3] = $$0.a(this.b[$$3], $$1);
      }

      return CompletableFuture.allOf($$2);
   }
}
