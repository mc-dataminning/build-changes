import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector2ic;

public class eox {
   public static final float a = 10000.0F;
   public static final float b = -10000.0F;
   private static final int c = 2;
   private final enn d;
   private final eij e;
   private final fjx.a f;
   private final eox.a g = new eox.a();
   private boolean h;

   private eox(enn $$0, eij $$1, fjx.a $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public eox(enn $$0, fjx.a $$1) {
      this($$0, new eij(), $$1);
   }

   @Deprecated
   public void a(Runnable $$0) {
      this.e();
      this.h = true;
      $$0.run();
      this.h = false;
      this.e();
   }

   @Deprecated
   private void g() {
      if (!this.h) {
         this.e();
      }
   }

   @Deprecated
   private void h() {
      if (this.h) {
         this.e();
      }
   }

   public int a() {
      return this.d.aM().o();
   }

   public int b() {
      return this.d.aM().p();
   }

   public eij c() {
      return this.e;
   }

   public fjx.a d() {
      return this.f;
   }

   public void e() {
      RenderSystem.disableDepthTest();
      this.f.b();
      RenderSystem.enableDepthTest();
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.a(fkf.C(), $$0, $$1, $$2, $$3);
   }

   public void a(fkf $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$2 < $$1) {
         int $$5 = $$1;
         $$1 = $$2;
         $$2 = $$5;
      }

      this.a($$0, $$1, $$3, $$2 + 1, $$3 + 1, $$4);
   }

   public void b(int $$0, int $$1, int $$2, int $$3) {
      this.b(fkf.C(), $$0, $$1, $$2, $$3);
   }

   public void b(fkf $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$3 < $$2) {
         int $$5 = $$2;
         $$2 = $$3;
         $$3 = $$5;
      }

      this.a($$0, $$1, $$2 + 1, $$1 + 1, $$3, $$4);
   }

   public void c(int $$0, int $$1, int $$2, int $$3) {
      this.a(this.g.a(new esz($$0, $$1, $$2 - $$0, $$3 - $$1)));
   }

   public void f() {
      this.a(this.g.a());
   }

   private void a(@Nullable esz $$0) {
      this.h();
      if ($$0 != null) {
         ehn $$1 = enn.N().aM();
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
      this.a(fkf.C(), $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(fkf $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, 0, $$5);
   }

   public void a(fkf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
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

      float $$10 = (float)aok.b.a($$6) / 255.0F;
      float $$11 = (float)aok.b.b($$6) / 255.0F;
      float $$12 = (float)aok.b.c($$6) / 255.0F;
      float $$13 = (float)aok.b.d($$6) / 255.0F;
      ein $$14 = this.f.getBuffer($$0);
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
      this.a(fkf.C(), $$0, $$1, $$2, $$3, $$5, $$6, $$4);
   }

   public void a(fkf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      ein $$8 = this.f.getBuffer($$0);
      this.a($$8, $$1, $$2, $$3, $$4, $$7, $$5, $$6);
      this.g();
   }

   private void a(ein $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      float $$8 = (float)aok.b.a($$6) / 255.0F;
      float $$9 = (float)aok.b.b($$6) / 255.0F;
      float $$10 = (float)aok.b.c($$6) / 255.0F;
      float $$11 = (float)aok.b.d($$6) / 255.0F;
      float $$12 = (float)aok.b.a($$7) / 255.0F;
      float $$13 = (float)aok.b.b($$7) / 255.0F;
      float $$14 = (float)aok.b.c($$7) / 255.0F;
      float $$15 = (float)aok.b.d($$7) / 255.0F;
      Matrix4f $$16 = this.e.c().a();
      $$0.a($$16, (float)$$1, (float)$$2, (float)$$5).a($$9, $$10, $$11, $$8).e();
      $$0.a($$16, (float)$$1, (float)$$4, (float)$$5).a($$13, $$14, $$15, $$12).e();
      $$0.a($$16, (float)$$3, (float)$$4, (float)$$5).a($$13, $$14, $$15, $$12).e();
      $$0.a($$16, (float)$$3, (float)$$2, (float)$$5).a($$9, $$10, $$11, $$8).e();
   }

   public void a(eov $$0, String $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2 - $$0.b($$1) / 2, $$3, $$4);
   }

   public void a(eov $$0, sw $$1, int $$2, int $$3, int $$4) {
      aom $$5 = $$1.f();
      this.b($$0, $$5, $$2 - $$0.a($$5) / 2, $$3, $$4);
   }

   public void a(eov $$0, aom $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2 - $$0.a($$1) / 2, $$3, $$4);
   }

   public int b(eov $$0, @Nullable String $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(eov $$0, @Nullable String $$1, int $$2, int $$3, int $$4, boolean $$5) {
      if ($$1 == null) {
         return 0;
      } else {
         int $$6 = $$0.a($$1, (float)$$2, (float)$$3, $$4, $$5, this.e.c().a(), this.f, eov.a.a, 0, 15728880, $$0.a());
         this.g();
         return $$6;
      }
   }

   public int b(eov $$0, aom $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(eov $$0, aom $$1, int $$2, int $$3, int $$4, boolean $$5) {
      int $$6 = $$0.a($$1, (float)$$2, (float)$$3, $$4, $$5, this.e.c().a(), this.f, eov.a.a, 0, 15728880);
      this.g();
      return $$6;
   }

   public int b(eov $$0, sw $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(eov $$0, sw $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return this.a($$0, $$1.f(), $$2, $$3, $$4, $$5);
   }

   public void a(eov $$0, ta $$1, int $$2, int $$3, int $$4, int $$5) {
      for (aom $$6 : $$0.c($$1, $$4)) {
         this.a($$0, $$6, $$2, $$3, $$5, false);
         $$3 += 9;
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, fuv $$5) {
      this.a($$5.i(), $$0, $$0 + $$3, $$1, $$1 + $$4, $$2, $$5.c(), $$5.d(), $$5.g(), $$5.h());
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, fuv $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$5.i(), $$0, $$0 + $$3, $$1, $$1 + $$4, $$2, $$5.c(), $$5.d(), $$5.g(), $$5.h(), $$6, $$7, $$8, $$9);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$0 + $$2, $$1 + 1, $$4);
      this.a($$0, $$1 + $$3 - 1, $$0 + $$2, $$1 + $$3, $$4);
      this.a($$0, $$1 + 1, $$0 + 1, $$1 + $$3 - 1, $$4);
      this.a($$0 + $$2 - 1, $$1 + 1, $$0 + $$2, $$1 + $$3 - 1, $$4);
   }

   public void a(acq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      this.a($$0, $$1, $$2, 0, (float)$$3, (float)$$4, $$5, $$6, 256, 256);
   }

   public void a(acq $$0, int $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9) {
      this.a($$0, $$1, $$1 + $$6, $$2, $$2 + $$7, $$3, $$6, $$7, $$4, $$5, $$8, $$9);
   }

   public void a(acq $$0, int $$1, int $$2, int $$3, int $$4, float $$5, float $$6, int $$7, int $$8, int $$9, int $$10) {
      this.a($$0, $$1, $$1 + $$3, $$2, $$2 + $$4, 0, $$7, $$8, $$5, $$6, $$9, $$10);
   }

   public void a(acq $$0, int $$1, int $$2, float $$3, float $$4, int $$5, int $$6, int $$7, int $$8) {
      this.a($$0, $$1, $$2, $$5, $$6, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   void a(acq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, float $$8, float $$9, int $$10, int $$11) {
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

   void a(acq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, float $$9) {
      RenderSystem.setShaderTexture(0, $$0);
      RenderSystem.setShader(fjq::s);
      Matrix4f $$10 = this.e.c().a();
      eie $$11 = eil.a().c();
      $$11.a(eio.b.h, eih.q);
      $$11.a($$10, (float)$$1, (float)$$3, (float)$$5).a($$6, $$8).e();
      $$11.a($$10, (float)$$1, (float)$$4, (float)$$5).a($$6, $$9).e();
      $$11.a($$10, (float)$$2, (float)$$4, (float)$$5).a($$7, $$9).e();
      $$11.a($$10, (float)$$2, (float)$$3, (float)$$5).a($$7, $$8).e();
      eif.a($$11.d());
   }

   void a(acq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11, float $$12, float $$13) {
      RenderSystem.setShaderTexture(0, $$0);
      RenderSystem.setShader(fjq::r);
      RenderSystem.enableBlend();
      Matrix4f $$14 = this.e.c().a();
      eie $$15 = eil.a().c();
      $$15.a(eio.b.h, eih.r);
      $$15.a($$14, (float)$$1, (float)$$3, (float)$$5).a($$10, $$11, $$12, $$13).a($$6, $$8).e();
      $$15.a($$14, (float)$$1, (float)$$4, (float)$$5).a($$10, $$11, $$12, $$13).a($$6, $$9).e();
      $$15.a($$14, (float)$$2, (float)$$4, (float)$$5).a($$10, $$11, $$12, $$13).a($$7, $$9).e();
      $$15.a($$14, (float)$$2, (float)$$3, (float)$$5).a($$10, $$11, $$12, $$13).a($$7, $$8).e();
      eif.a($$15.d());
      RenderSystem.disableBlend();
   }

   public void a(acq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$5, $$5, $$5, $$6, $$7, $$8, $$9);
   }

   public void a(acq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$5, $$6, $$7, $$8, $$9, $$10);
   }

   public void a(acq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12) {
      $$5 = Math.min($$5, $$3 / 2);
      $$7 = Math.min($$7, $$3 / 2);
      $$6 = Math.min($$6, $$4 / 2);
      $$8 = Math.min($$8, $$4 / 2);
      if ($$3 == $$9 && $$4 == $$10) {
         this.a($$0, $$1, $$2, $$11, $$12, $$3, $$4);
      } else if ($$4 == $$10) {
         this.a($$0, $$1, $$2, $$11, $$12, $$5, $$4);
         this.a($$0, $$1 + $$5, $$2, $$3 - $$7 - $$5, $$4, $$11 + $$5, $$12, $$9 - $$7 - $$5, $$10);
         this.a($$0, $$1 + $$3 - $$7, $$2, $$11 + $$9 - $$7, $$12, $$7, $$4);
      } else if ($$3 == $$9) {
         this.a($$0, $$1, $$2, $$11, $$12, $$3, $$6);
         this.a($$0, $$1, $$2 + $$6, $$3, $$4 - $$8 - $$6, $$11, $$12 + $$6, $$9, $$10 - $$8 - $$6);
         this.a($$0, $$1, $$2 + $$4 - $$8, $$11, $$12 + $$10 - $$8, $$3, $$8);
      } else {
         this.a($$0, $$1, $$2, $$11, $$12, $$5, $$6);
         this.a($$0, $$1 + $$5, $$2, $$3 - $$7 - $$5, $$6, $$11 + $$5, $$12, $$9 - $$7 - $$5, $$6);
         this.a($$0, $$1 + $$3 - $$7, $$2, $$11 + $$9 - $$7, $$12, $$7, $$6);
         this.a($$0, $$1, $$2 + $$4 - $$8, $$11, $$12 + $$10 - $$8, $$5, $$8);
         this.a($$0, $$1 + $$5, $$2 + $$4 - $$8, $$3 - $$7 - $$5, $$8, $$11 + $$5, $$12 + $$10 - $$8, $$9 - $$7 - $$5, $$8);
         this.a($$0, $$1 + $$3 - $$7, $$2 + $$4 - $$8, $$11 + $$9 - $$7, $$12 + $$10 - $$8, $$7, $$8);
         this.a($$0, $$1, $$2 + $$6, $$5, $$4 - $$8 - $$6, $$11, $$12 + $$6, $$5, $$10 - $$8 - $$6);
         this.a($$0, $$1 + $$5, $$2 + $$6, $$3 - $$7 - $$5, $$4 - $$8 - $$6, $$11 + $$5, $$12 + $$6, $$9 - $$7 - $$5, $$10 - $$8 - $$6);
         this.a($$0, $$1 + $$3 - $$7, $$2 + $$6, $$5, $$4 - $$8 - $$6, $$11 + $$9 - $$7, $$12 + $$6, $$7, $$10 - $$8 - $$6);
      }
   }

   public void a(acq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$1;
      IntIterator $$10 = a($$3, $$7);

      while ($$10.hasNext()) {
         int $$11 = $$10.nextInt();
         int $$12 = ($$7 - $$11) / 2;
         int $$13 = $$2;
         IntIterator $$14 = a($$4, $$8);

         while ($$14.hasNext()) {
            int $$15 = $$14.nextInt();
            int $$16 = ($$8 - $$15) / 2;
            this.a($$0, $$9, $$13, $$5 + $$12, $$6 + $$16, $$11, $$15);
            $$13 += $$15;
         }

         $$9 += $$11;
      }
   }

   private static IntIterator a(int $$0, int $$1) {
      int $$2 = apa.e($$0, $$1);
      return new c($$0, $$2);
   }

   public void a(cfz $$0, int $$1, int $$2) {
      this.a(this.d.t, this.d.s, $$0, $$1, $$2, 0);
   }

   public void a(cfz $$0, int $$1, int $$2, int $$3) {
      this.a(this.d.t, this.d.s, $$0, $$1, $$2, $$3);
   }

   public void a(cfz $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a(this.d.t, this.d.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(cfz $$0, int $$1, int $$2) {
      this.a(null, this.d.s, $$0, $$1, $$2, 0);
   }

   public void a(bfz $$0, cfz $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$0.dI(), $$1, $$2, $$3, $$4);
   }

   private void a(@Nullable bfz $$0, @Nullable cmm $$1, cfz $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 0);
   }

   private void a(@Nullable bfz $$0, @Nullable cmm $$1, cfz $$2, int $$3, int $$4, int $$5, int $$6) {
      if (!$$2.b()) {
         fwr $$7 = this.d.ap().a($$2, $$1, $$0, $$5);
         this.e.a();
         this.e.a((float)($$3 + 8), (float)($$4 + 8), (float)(150 + ($$7.b() ? $$6 : 0)));

         try {
            this.e.a(new Matrix4f().scaling(1.0F, -1.0F, 1.0F));
            this.e.b(16.0F, 16.0F, 16.0F);
            boolean $$8 = !$$7.c();
            if ($$8) {
               ehf.a();
            }

            this.d.ap().a($$2, cfw.g, false, this.e, this.d(), 15728880, fum.d, $$7);
            this.e();
            if ($$8) {
               ehf.b();
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

   public void a(eov $$0, cfz $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, null);
   }

   public void a(eov $$0, cfz $$1, int $$2, int $$3, @Nullable String $$4) {
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
            this.a(fkf.D(), $$8, $$9, $$8 + 13, $$9 + 2, -16777216);
            this.a(fkf.D(), $$8, $$9, $$8 + $$6, $$9 + 1, $$7 | 0xFF000000);
         }

         fiy $$10 = this.d.t;
         float $$11 = $$10 == null ? 0.0F : $$10.gi().a($$1.d(), this.d.av());
         if ($$11 > 0.0F) {
            int $$12 = $$3 + apa.d(16.0F * (1.0F - $$11));
            int $$13 = $$12 + apa.f(16.0F * $$11);
            this.a(fkf.D(), $$2, $$12, $$2 + 16, $$13, Integer.MAX_VALUE);
         }

         this.e.b();
      }
   }

   public void b(eov $$0, cfz $$1, int $$2, int $$3) {
      this.a($$0, euq.a(this.d, $$1), $$1.a(), $$2, $$3);
   }

   public void a(eov $$0, List<sw> $$1, Optional<cdf> $$2, int $$3, int $$4) {
      List<exh> $$5 = $$1.stream().map(sw::f).map(exh::a).collect(Collectors.toList());
      $$2.ifPresent($$1x -> $$5.add(1, exh.a($$1x)));
      this.a($$0, $$5, $$3, $$4, exj.a);
   }

   public void a(eov $$0, sw $$1, int $$2, int $$3) {
      this.b($$0, List.of($$1.f()), $$2, $$3);
   }

   public void a(eov $$0, List<sw> $$1, int $$2, int $$3) {
      this.b($$0, Lists.transform($$1, sw::f), $$2, $$3);
   }

   public void b(eov $$0, List<? extends aom> $$1, int $$2, int $$3) {
      this.a($$0, $$1.stream().map(exh::a).collect(Collectors.toList()), $$2, $$3, exj.a);
   }

   public void a(eov $$0, List<aom> $$1, exi $$2, int $$3, int $$4) {
      this.a($$0, $$1.stream().map(exh::a).collect(Collectors.toList()), $$3, $$4, $$2);
   }

   private void a(eov $$0, List<exh> $$1, int $$2, int $$3, exi $$4) {
      if (!$$1.isEmpty()) {
         int $$5 = 0;
         int $$6 = $$1.size() == 1 ? -2 : 0;

         for (exh $$7 : $$1) {
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
         this.a(() -> exl.a(this, $$12, $$13, $$9, $$10, 400));
         this.e.a(0.0F, 0.0F, 400.0F);
         int $$15 = $$13;

         for (int $$16 = 0; $$16 < $$1.size(); $$16++) {
            exh $$17 = $$1.get($$16);
            $$17.a($$0, $$12, $$15, this.e.c().a(), this.f);
            $$15 += $$17.a() + ($$16 == 0 ? 2 : 0);
         }

         $$15 = $$13;

         for (int $$18 = 0; $$18 < $$1.size(); $$18++) {
            exh $$19 = $$1.get($$18);
            $$19.a($$0, $$12, $$15, this);
            $$15 += $$19.a() + ($$18 == 0 ? 2 : 0);
         }

         this.e.b();
      }
   }

   public void a(eov $$0, @Nullable ts $$1, int $$2, int $$3) {
      if ($$1 != null && $$1.i() != null) {
         tb $$4 = $$1.i();
         tb.c $$5 = $$4.a(tb.a.b);
         if ($$5 != null) {
            this.b($$0, $$5.a(), $$2, $$3);
         } else {
            tb.b $$6 = $$4.a(tb.a.c);
            if ($$6 != null) {
               if (this.d.m.m) {
                  this.a($$0, $$6.b(), $$2, $$3);
               }
            } else {
               sw $$7 = $$4.a(tb.a.a);
               if ($$7 != null) {
                  this.b($$0, $$0.c($$7, Math.max(this.a() / 2, 200)), $$2, $$3);
               }
            }
         }
      }
   }

   static class a {
      private final Deque<esz> a = new ArrayDeque<>();

      public esz a(esz $$0) {
         esz $$1 = this.a.peekLast();
         if ($$1 != null) {
            esz $$2 = Objects.requireNonNullElse($$0.b($$1), esz.a());
            this.a.addLast($$2);
            return $$2;
         } else {
            this.a.addLast($$0);
            return $$0;
         }
      }

      @Nullable
      public esz a() {
         if (this.a.isEmpty()) {
            throw new IllegalStateException("Scissor stack underflow");
         } else {
            this.a.removeLast();
            return this.a.peekLast();
         }
      }
   }
}
