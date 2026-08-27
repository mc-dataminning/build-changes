import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fkh {
   private static final acq a = new acq("textures/misc/underwater.png");

   public static void a(enn $$0, eij $$1) {
      byo $$2 = $$0.t;
      if (!$$2.ae) {
         dcb $$3 = a($$2);
         if ($$3 != null) {
            a($$0.am().a().a($$3), $$1);
         }
      }

      if (!$$0.t.G_()) {
         if ($$0.t.a(anb.a)) {
            b($$0, $$1);
         }

         if ($$0.t.bL()) {
            c($$0, $$1);
         }
      }
   }

   @Nullable
   private static dcb a(byo $$0) {
      gu.a $$1 = new gu.a();

      for (int $$2 = 0; $$2 < 8; $$2++) {
         double $$3 = $$0.dn() + (double)(((float)(($$2 >> 0) % 2) - 0.5F) * $$0.dd() * 0.8F);
         double $$4 = $$0.dr() + (double)(((float)(($$2 >> 1) % 2) - 0.5F) * 0.1F);
         double $$5 = $$0.dt() + (double)(((float)(($$2 >> 2) % 2) - 0.5F) * $$0.dd() * 0.8F);
         $$1.b($$3, $$4, $$5);
         dcb $$6 = $$0.dI().a_($$1);
         if ($$6.l() != cvs.a && $$6.p($$0.dI(), $$1)) {
            return $$6;
         }
      }

      return null;
   }

   private static void a(fuv $$0, eij $$1) {
      RenderSystem.setShaderTexture(0, $$0.i());
      RenderSystem.setShader(fjq::r);
      eie $$2 = eil.a().c();
      float $$3 = 0.1F;
      float $$4 = -1.0F;
      float $$5 = 1.0F;
      float $$6 = -1.0F;
      float $$7 = 1.0F;
      float $$8 = -0.5F;
      float $$9 = $$0.c();
      float $$10 = $$0.d();
      float $$11 = $$0.g();
      float $$12 = $$0.h();
      Matrix4f $$13 = $$1.c().a();
      $$2.a(eio.b.h, eih.r);
      $$2.a($$13, -1.0F, -1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a($$10, $$12).e();
      $$2.a($$13, 1.0F, -1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a($$9, $$12).e();
      $$2.a($$13, 1.0F, 1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a($$9, $$11).e();
      $$2.a($$13, -1.0F, 1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a($$10, $$11).e();
      eif.a($$2.d());
   }

   private static void b(enn $$0, eij $$1) {
      RenderSystem.setShader(fjq::s);
      RenderSystem.setShaderTexture(0, a);
      eie $$2 = eil.a().c();
      gu $$3 = gu.a($$0.t.dn(), $$0.t.dr(), $$0.t.dt());
      float $$4 = fjw.a($$0.t.dI().x_(), $$0.t.dI().z($$3));
      RenderSystem.enableBlend();
      RenderSystem.setShaderColor($$4, $$4, $$4, 0.1F);
      float $$5 = 4.0F;
      float $$6 = -1.0F;
      float $$7 = 1.0F;
      float $$8 = -1.0F;
      float $$9 = 1.0F;
      float $$10 = -0.5F;
      float $$11 = -$$0.t.dy() / 64.0F;
      float $$12 = $$0.t.dA() / 64.0F;
      Matrix4f $$13 = $$1.c().a();
      $$2.a(eio.b.h, eih.q);
      $$2.a($$13, -1.0F, -1.0F, -0.5F).a(4.0F + $$11, 4.0F + $$12).e();
      $$2.a($$13, 1.0F, -1.0F, -0.5F).a(0.0F + $$11, 4.0F + $$12).e();
      $$2.a($$13, 1.0F, 1.0F, -0.5F).a(0.0F + $$11, 0.0F + $$12).e();
      $$2.a($$13, -1.0F, 1.0F, -0.5F).a(4.0F + $$11, 0.0F + $$12).e();
      eif.a($$2.d());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
   }

   private static void c(enn $$0, eij $$1) {
      eie $$2 = eil.a().c();
      RenderSystem.setShader(fjq::r);
      RenderSystem.depthFunc(519);
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      fuv $$3 = fww.b.c();
      RenderSystem.setShaderTexture(0, $$3.i());
      float $$4 = $$3.c();
      float $$5 = $$3.d();
      float $$6 = ($$4 + $$5) / 2.0F;
      float $$7 = $$3.g();
      float $$8 = $$3.h();
      float $$9 = ($$7 + $$8) / 2.0F;
      float $$10 = $$3.k();
      float $$11 = apa.i($$10, $$4, $$6);
      float $$12 = apa.i($$10, $$5, $$6);
      float $$13 = apa.i($$10, $$7, $$9);
      float $$14 = apa.i($$10, $$8, $$9);
      float $$15 = 1.0F;

      for (int $$16 = 0; $$16 < 2; $$16++) {
         $$1.a();
         float $$17 = -0.5F;
         float $$18 = 0.5F;
         float $$19 = -0.5F;
         float $$20 = 0.5F;
         float $$21 = -0.5F;
         $$1.a((float)(-($$16 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
         $$1.a(a.d.rotationDegrees((float)($$16 * 2 - 1) * 10.0F));
         Matrix4f $$22 = $$1.c().a();
         $$2.a(eio.b.h, eih.r);
         $$2.a($$22, -0.5F, -0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a($$12, $$14).e();
         $$2.a($$22, 0.5F, -0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a($$11, $$14).e();
         $$2.a($$22, 0.5F, 0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a($$11, $$13).e();
         $$2.a($$22, -0.5F, 0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a($$12, $$13).e();
         eif.a($$2.d());
         $$1.b();
      }

      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.depthFunc(515);
   }
}
