import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector2ic;

public class fnl {
   public static final float a = 10000.0F;
   public static final float b = -10000.0F;
   private static final int c = 2;
   private final flz d;
   private final fgl e;
   private final gle.a f;
   private final fnl.a g = new fnl.a();
   private final fnm h;

   private fnl(flz $$0, fgl $$1, gle.a $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.h = $$0.aJ();
   }

   public fnl(flz $$0, gle.a $$1) {
      this($$0, new fgl(), $$1);
   }

   public int a() {
      return this.d.aO().o();
   }

   public int b() {
      return this.d.aO().p();
   }

   public fgl c() {
      return this.e;
   }

   public void d() {
      this.f.b();
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.a(glo.G(), $$0, $$1, $$2, $$3);
   }

   public void a(glo $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$2 < $$1) {
         int $$5 = $$1;
         $$1 = $$2;
         $$2 = $$5;
      }

      this.a($$0, $$1, $$3, $$2 + 1, $$3 + 1, $$4);
   }

   public void b(int $$0, int $$1, int $$2, int $$3) {
      this.b(glo.G(), $$0, $$1, $$2, $$3);
   }

   public void b(glo $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$3 < $$2) {
         int $$5 = $$2;
         $$2 = $$3;
         $$3 = $$5;
      }

      this.a($$0, $$1, $$2 + 1, $$1 + 1, $$3, $$4);
   }

   public void c(int $$0, int $$1, int $$2, int $$3) {
      this.a(this.g.a(new fsg($$0, $$1, $$2 - $$0, $$3 - $$1)));
   }

   public void e() {
      this.a(this.g.a());
   }

   public boolean a(int $$0, int $$1) {
      return this.g.a($$0, $$1);
   }

   private void a(@Nullable fsg $$0) {
      this.d();
      if ($$0 != null) {
         ffo $$1 = flz.Q().aO();
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

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$2, $$3, 0, $$4);
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a(glo.G(), $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(glo $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, 0, $$5);
   }

   public void a(glo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
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

      fgp $$10 = this.f.getBuffer($$0);
      $$10.a($$7, (float)$$1, (float)$$2, (float)$$5).a($$6);
      $$10.a($$7, (float)$$1, (float)$$4, (float)$$5).a($$6);
      $$10.a($$7, (float)$$3, (float)$$4, (float)$$5).a($$6);
      $$10.a($$7, (float)$$3, (float)$$2, (float)$$5).a($$6);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, 0, $$4, $$5);
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      this.a(glo.G(), $$0, $$1, $$2, $$3, $$5, $$6, $$4);
   }

   public void a(glo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      fgp $$8 = this.f.getBuffer($$0);
      this.a($$8, $$1, $$2, $$3, $$4, $$7, $$5, $$6);
   }

   private void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      Matrix4f $$8 = this.e.c().a();
      $$0.a($$8, (float)$$1, (float)$$2, (float)$$5).a($$6);
      $$0.a($$8, (float)$$1, (float)$$4, (float)$$5).a($$7);
      $$0.a($$8, (float)$$3, (float)$$4, (float)$$5).a($$7);
      $$0.a($$8, (float)$$3, (float)$$2, (float)$$5).a($$6);
   }

   public void b(glo $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      Matrix4f $$6 = this.e.c().a();
      fgp $$7 = this.f.getBuffer($$0);
      $$7.a($$6, (float)$$1, (float)$$2, (float)$$5);
      $$7.a($$6, (float)$$1, (float)$$4, (float)$$5);
      $$7.a($$6, (float)$$3, (float)$$4, (float)$$5);
      $$7.a($$6, (float)$$3, (float)$$2, (float)$$5);
   }

   public void a(fnj $$0, String $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2 - $$0.b($$1) / 2, $$3, $$4);
   }

   public void a(fnj $$0, xv $$1, int $$2, int $$3, int $$4) {
      azq $$5 = $$1.g();
      this.b($$0, $$5, $$2 - $$0.a($$5) / 2, $$3, $$4);
   }

   public void a(fnj $$0, azq $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2 - $$0.a($$1) / 2, $$3, $$4);
   }

   public int b(fnj $$0, @Nullable String $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(fnj $$0, @Nullable String $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == null ? 0 : $$0.a($$1, (float)$$2, (float)$$3, $$4, $$5, this.e.c().a(), this.f, fnj.a.a, 0, 15728880, $$0.a());
   }

   public int b(fnj $$0, azq $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(fnj $$0, azq $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$0.a($$1, (float)$$2, (float)$$3, $$4, $$5, this.e.c().a(), this.f, fnj.a.a, 0, 15728880);
   }

   public int b(fnj $$0, xv $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(fnj $$0, xv $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return this.a($$0, $$1.g(), $$2, $$3, $$4, $$5);
   }

   public void a(fnj $$0, ya $$1, int $$2, int $$3, int $$4, int $$5) {
      for (azq $$6 : $$0.c($$1, $$4)) {
         this.a($$0, $$6, $$2, $$3, $$5, false);
         $$3 += 9;
      }
   }

   public int a(fnj $$0, xv $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = this.d.n.b(0.0F);
      if ($$6 != 0) {
         int $$7 = 2;
         this.a($$2 - 2, $$3 - 2, $$2 + $$4 + 2, $$3 + 9 + 2, ayp.a($$6, $$5));
      }

      return this.a($$0, $$1, $$2, $$3, $$5, true);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$0 + $$2, $$1 + 1, $$4);
      this.a($$0, $$1 + $$3 - 1, $$0 + $$2, $$1 + $$3, $$4);
      this.a($$0, $$1 + 1, $$0 + 1, $$1 + $$3 - 1, $$4);
      this.a($$0 + $$2 - 1, $$1 + 1, $$0 + $$2, $$1 + $$3 - 1, $$4);
   }

   public void a(Function<alz, glo> $$0, alz $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, -1);
   }

   public void a(Function<alz, glo> $$0, alz $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      hbe $$7 = this.h.a($$1);
      hcx $$8 = this.h.a($$7);
      if ($$8 instanceof hcx.b) {
         this.a($$0, $$7, $$2, $$3, $$4, $$5, $$6);
      } else if ($$8 instanceof hcx.c $$9) {
         this.a($$0, $$7, $$2, $$3, $$4, $$5, 0, 0, $$9.b(), $$9.c(), $$9.b(), $$9.c(), $$6);
      } else if ($$8 instanceof hcx.a $$10) {
         this.a($$0, $$7, $$10, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public void a(Function<alz, glo> $$0, alz $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
      hbe $$10 = this.h.a($$1);
      hcx $$11 = this.h.a($$10);
      if ($$11 instanceof hcx.b) {
         this.a($$0, $$10, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, -1);
      } else {
         this.a($$0, $$10, $$6, $$7, $$8, $$9);
      }
   }

   public void a(Function<alz, glo> $$0, hbe $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, -1);
   }

   public void a(Function<alz, glo> $$0, hbe $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      if ($$4 != 0 && $$5 != 0) {
         this.a($$0, $$1.i(), $$2, $$2 + $$4, $$3, $$3 + $$5, $$1.c(), $$1.d(), $$1.g(), $$1.h(), $$6);
      }
   }

   private void a(Function<alz, glo> $$0, hbe $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
      if ($$8 != 0 && $$9 != 0) {
         this.a(
            $$0,
            $$1.i(),
            $$6,
            $$6 + $$8,
            $$7,
            $$7 + $$9,
            $$1.a((float)$$4 / (float)$$2),
            $$1.a((float)($$4 + $$8) / (float)$$2),
            $$1.c((float)$$5 / (float)$$3),
            $$1.c((float)($$5 + $$9) / (float)$$3),
            $$10
         );
      }
   }

   private void a(Function<alz, glo> $$0, hbe $$1, hcx.a $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      hcx.a.a $$8 = $$2.d();
      int $$9 = Math.min($$8.a(), $$5 / 2);
      int $$10 = Math.min($$8.c(), $$5 / 2);
      int $$11 = Math.min($$8.b(), $$6 / 2);
      int $$12 = Math.min($$8.d(), $$6 / 2);
      if ($$5 == $$2.b() && $$6 == $$2.c()) {
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$5, $$6, $$7);
      } else if ($$6 == $$2.c()) {
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$9, $$6, $$7);
         this.a($$0, $$2, $$1, $$3 + $$9, $$4, $$5 - $$10 - $$9, $$6, $$9, 0, $$2.b() - $$10 - $$9, $$2.c(), $$2.b(), $$2.c(), $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), $$2.b() - $$10, 0, $$3 + $$5 - $$10, $$4, $$10, $$6, $$7);
      } else if ($$5 == $$2.b()) {
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$5, $$11, $$7);
         this.a($$0, $$2, $$1, $$3, $$4 + $$11, $$5, $$6 - $$12 - $$11, 0, $$11, $$2.b(), $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, $$2.c() - $$12, $$3, $$4 + $$6 - $$12, $$5, $$12, $$7);
      } else {
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$9, $$11, $$7);
         this.a($$0, $$2, $$1, $$3 + $$9, $$4, $$5 - $$10 - $$9, $$11, $$9, 0, $$2.b() - $$10 - $$9, $$11, $$2.b(), $$2.c(), $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), $$2.b() - $$10, 0, $$3 + $$5 - $$10, $$4, $$10, $$11, $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, $$2.c() - $$12, $$3, $$4 + $$6 - $$12, $$9, $$12, $$7);
         this.a($$0, $$2, $$1, $$3 + $$9, $$4 + $$6 - $$12, $$5 - $$10 - $$9, $$12, $$9, $$2.c() - $$12, $$2.b() - $$10 - $$9, $$12, $$2.b(), $$2.c(), $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), $$2.b() - $$10, $$2.c() - $$12, $$3 + $$5 - $$10, $$4 + $$6 - $$12, $$10, $$12, $$7);
         this.a($$0, $$2, $$1, $$3, $$4 + $$11, $$9, $$6 - $$12 - $$11, 0, $$11, $$9, $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
         this.a(
            $$0,
            $$2,
            $$1,
            $$3 + $$9,
            $$4 + $$11,
            $$5 - $$10 - $$9,
            $$6 - $$12 - $$11,
            $$9,
            $$11,
            $$2.b() - $$10 - $$9,
            $$2.c() - $$12 - $$11,
            $$2.b(),
            $$2.c(),
            $$7
         );
         this.a($$0, $$2, $$1, $$3 + $$5 - $$10, $$4 + $$11, $$9, $$6 - $$12 - $$11, $$2.b() - $$10, $$11, $$10, $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
      }
   }

   private void a(
      Function<alz, glo> $$0, hcx.a $$1, hbe $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12, int $$13
   ) {
      if ($$5 > 0 && $$6 > 0) {
         if ($$1.e()) {
            this.a(
               $$0,
               $$2.i(),
               $$3,
               $$3 + $$5,
               $$4,
               $$4 + $$6,
               $$2.a((float)$$7 / (float)$$11),
               $$2.a((float)($$7 + $$9) / (float)$$11),
               $$2.c((float)$$8 / (float)$$12),
               $$2.c((float)($$8 + $$10) / (float)$$12),
               $$13
            );
         } else {
            this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13);
         }
      }
   }

   private void a(Function<alz, glo> $$0, hbe $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12) {
      if ($$4 > 0 && $$5 > 0) {
         if ($$8 > 0 && $$9 > 0) {
            for (int $$13 = 0; $$13 < $$4; $$13 += $$8) {
               int $$14 = Math.min($$8, $$4 - $$13);

               for (int $$15 = 0; $$15 < $$5; $$15 += $$9) {
                  int $$16 = Math.min($$9, $$5 - $$15);
                  this.a($$0, $$1, $$10, $$11, $$6, $$7, $$2 + $$13, $$3 + $$15, $$14, $$16, $$12);
               }
            }
         } else {
            throw new IllegalArgumentException("Tiled sprite texture size must be positive, got " + $$8 + "x" + $$9);
         }
      }
   }

   public void a(Function<alz, glo> $$0, alz $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$6, $$7, $$8, $$9, $$10);
   }

   public void a(Function<alz, glo> $$0, alz $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$6, $$7, $$8, $$9);
   }

   public void a(Function<alz, glo> $$0, alz $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, -1);
   }

   public void a(Function<alz, glo> $$0, alz $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12) {
      this.a(
         $$0,
         $$1,
         $$2,
         $$2 + $$6,
         $$3,
         $$3 + $$7,
         ($$4 + 0.0F) / (float)$$10,
         ($$4 + (float)$$8) / (float)$$10,
         ($$5 + 0.0F) / (float)$$11,
         ($$5 + (float)$$9) / (float)$$11,
         $$12
      );
   }

   private void a(Function<alz, glo> $$0, alz $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, float $$9, int $$10) {
      glo $$11 = $$0.apply($$1);
      Matrix4f $$12 = this.e.c().a();
      fgp $$13 = this.f.getBuffer($$11);
      $$13.a($$12, (float)$$2, (float)$$4, 0.0F).a($$6, $$8).a($$10);
      $$13.a($$12, (float)$$2, (float)$$5, 0.0F).a($$6, $$9).a($$10);
      $$13.a($$12, (float)$$3, (float)$$5, 0.0F).a($$7, $$9).a($$10);
      $$13.a($$12, (float)$$3, (float)$$4, 0.0F).a($$7, $$8).a($$10);
   }

   public void a(cxk $$0, int $$1, int $$2) {
      this.a(this.d.t, this.d.s, $$0, $$1, $$2, 0);
   }

   public void a(cxk $$0, int $$1, int $$2, int $$3) {
      this.a(this.d.t, this.d.s, $$0, $$1, $$2, $$3);
   }

   public void a(cxk $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a(this.d.t, this.d.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(cxk $$0, int $$1, int $$2) {
      this.b($$0, $$1, $$2, 0);
   }

   public void b(cxk $$0, int $$1, int $$2, int $$3) {
      this.a(null, this.d.s, $$0, $$1, $$2, $$3);
   }

   public void a(bwb $$0, cxk $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$0.dV(), $$1, $$2, $$3, $$4);
   }

   private void a(@Nullable bwb $$0, @Nullable dha $$1, cxk $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 0);
   }

   private void a(@Nullable bwb $$0, @Nullable dha $$1, cxk $$2, int $$3, int $$4, int $$5, int $$6) {
      if (!$$2.f()) {
         hdg $$7 = this.d.as().a($$2, $$1, $$0, $$5);
         this.e.a();
         this.e.a((float)($$3 + 8), (float)($$4 + 8), (float)(150 + ($$7.b() ? $$6 : 0)));

         try {
            this.e.b(16.0F, -16.0F, 16.0F);
            boolean $$8 = !$$7.c();
            if ($$8) {
               this.d();
               ffh.c();
            }

            if ($$2.a(ayd.bT)) {
               this.d.as().a($$2, cxi.g, false, this.e, this.f, 15728880, hav.d, $$7, $$1, $$0, $$5);
            } else {
               this.d.as().a($$2, cxi.g, false, this.e, this.f, 15728880, hav.d, $$7);
            }

            this.d();
            if ($$8) {
               ffh.d();
            }
         } catch (Throwable var12) {
            o $$10 = o.a(var12, "Rendering item");
            p $$11 = $$10.a("Item being rendered");
            $$11.a("Item Type", () -> String.valueOf($$2.h()));
            $$11.a("Item Components", () -> String.valueOf($$2.a()));
            $$11.a("Item Foil", () -> String.valueOf($$2.B()));
            throw new z($$10);
         }

         this.e.b();
      }
   }

   public void a(fnj $$0, cxk $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, null);
   }

   public void a(fnj $$0, cxk $$1, int $$2, int $$3, @Nullable String $$4) {
      if (!$$1.f()) {
         this.e.a();
         this.c($$1, $$2, $$3);
         this.b($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$3);
         this.e.b();
      }
   }

   public void b(fnj $$0, cxk $$1, int $$2, int $$3) {
      this.a($$0, ftr.a(this.d, $$1), $$1.b(), $$2, $$3, $$1.a(ku.G));
   }

   public void a(fnj $$0, List<xv> $$1, Optional<cve> $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, null);
   }

   public void a(fnj $$0, List<xv> $$1, Optional<cve> $$2, int $$3, int $$4, @Nullable alz $$5) {
      List<fwb> $$6 = $$1.stream().map(xv::g).map(fwb::a).collect(ae.b());
      $$2.ifPresent($$1x -> $$6.add($$6.isEmpty() ? 0 : 1, fwb.a($$1x)));
      this.a($$0, $$6, $$3, $$4, fwd.a, $$5);
   }

   public void a(fnj $$0, xv $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, null);
   }

   public void a(fnj $$0, xv $$1, int $$2, int $$3, @Nullable alz $$4) {
      this.b($$0, List.of($$1.g()), $$2, $$3, $$4);
   }

   public void a(fnj $$0, List<xv> $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, null);
   }

   public void a(fnj $$0, List<xv> $$1, int $$2, int $$3, @Nullable alz $$4) {
      this.a($$0, $$1.stream().map(xv::g).map(fwb::a).toList(), $$2, $$3, fwd.a, $$4);
   }

   public void b(fnj $$0, List<? extends azq> $$1, int $$2, int $$3) {
      this.b($$0, $$1, $$2, $$3, null);
   }

   public void b(fnj $$0, List<? extends azq> $$1, int $$2, int $$3, @Nullable alz $$4) {
      this.a($$0, $$1.stream().map(fwb::a).collect(Collectors.toList()), $$2, $$3, fwd.a, $$4);
   }

   public void a(fnj $$0, List<azq> $$1, fwc $$2, int $$3, int $$4) {
      this.a($$0, $$1.stream().map(fwb::a).collect(Collectors.toList()), $$3, $$4, $$2, null);
   }

   private void a(fnj $$0, List<fwb> $$1, int $$2, int $$3, fwc $$4, @Nullable alz $$5) {
      if (!$$1.isEmpty()) {
         int $$6 = 0;
         int $$7 = $$1.size() == 1 ? -2 : 0;

         for (fwb $$8 : $$1) {
            int $$9 = $$8.b($$0);
            if ($$9 > $$6) {
               $$6 = $$9;
            }

            $$7 += $$8.a($$0);
         }

         int $$10 = $$6;
         int $$11 = $$7;
         Vector2ic $$12 = $$4.a(this.a(), this.b(), $$2, $$3, $$6, $$7);
         int $$13 = $$12.x();
         int $$14 = $$12.y();
         this.e.a();
         int $$15 = 400;
         fwf.a(this, $$13, $$14, $$6, $$7, 400, $$5);
         this.e.a(0.0F, 0.0F, 400.0F);
         int $$16 = $$14;

         for (int $$17 = 0; $$17 < $$1.size(); $$17++) {
            fwb $$18 = $$1.get($$17);
            $$18.a($$0, $$13, $$16, this.e.c().a(), this.f);
            $$16 += $$18.a($$0) + ($$17 == 0 ? 2 : 0);
         }

         $$16 = $$14;

         for (int $$19 = 0; $$19 < $$1.size(); $$19++) {
            fwb $$20 = $$1.get($$19);
            $$20.a($$0, $$13, $$16, $$10, $$11, this);
            $$16 += $$20.a($$0) + ($$19 == 0 ? 2 : 0);
         }

         this.e.b();
      }
   }

   private void c(cxk $$0, int $$1, int $$2) {
      if ($$0.s()) {
         int $$3 = $$1 + 2;
         int $$4 = $$2 + 13;
         this.a(glo.G(), $$3, $$4, $$3 + 13, $$4 + 2, 200, -16777216);
         this.a(glo.G(), $$3, $$4, $$3 + $$0.t(), $$4 + 1, 200, ayp.f($$0.u()));
      }
   }

   private void b(fnj $$0, cxk $$1, int $$2, int $$3, @Nullable String $$4) {
      if ($$1.L() != 1 || $$4 != null) {
         String $$5 = $$4 == null ? String.valueOf($$1.L()) : $$4;
         this.e.a(0.0F, 0.0F, 200.0F);
         this.a($$0, $$5, $$2 + 19 - 2 - $$0.b($$5), $$3 + 6 + 3, -1, true);
      }
   }

   private void d(cxk $$0, int $$1, int $$2) {
      gka $$3 = this.d.t;
      float $$4 = $$3 == null ? 0.0F : $$3.gC().a($$0, this.d.av().a(true));
      if ($$4 > 0.0F) {
         int $$5 = $$2 + bae.d(16.0F * (1.0F - $$4));
         int $$6 = $$5 + bae.f(16.0F * $$4);
         this.a(glo.G(), $$1, $$5, $$1 + 16, $$6, 200, Integer.MAX_VALUE);
      }
   }

   public void a(fnj $$0, @Nullable ys $$1, int $$2, int $$3) {
      if ($$1 != null && $$1.i() != null) {
         yb $$4 = $$1.i();
         yb.c $$5 = $$4.a(yb.a.b);
         if ($$5 != null) {
            this.b($$0, $$5.a(), $$2, $$3);
         } else {
            yb.b $$6 = $$4.a(yb.a.c);
            if ($$6 != null) {
               if (this.d.n.m) {
                  this.a($$0, $$6.a(), $$2, $$3);
               }
            } else {
               xv $$7 = $$4.a(yb.a.a);
               if ($$7 != null) {
                  this.b($$0, $$0.c($$7, Math.max(this.a() / 2, 200)), $$2, $$3);
               }
            }
         }
      }
   }

   public void a(Consumer<gle> $$0) {
      $$0.accept(this.f);
      this.f.b();
   }

   static class a {
      private final Deque<fsg> a = new ArrayDeque<>();

      public fsg a(fsg $$0) {
         fsg $$1 = this.a.peekLast();
         if ($$1 != null) {
            fsg $$2 = Objects.requireNonNullElse($$0.b($$1), fsg.a());
            this.a.addLast($$2);
            return $$2;
         } else {
            this.a.addLast($$0);
            return $$0;
         }
      }

      @Nullable
      public fsg a() {
         if (this.a.isEmpty()) {
            throw new IllegalStateException("Scissor stack underflow");
         } else {
            this.a.removeLast();
            return this.a.peekLast();
         }
      }

      public boolean a(int $$0, int $$1) {
         return this.a.isEmpty() ? true : this.a.peek().a($$0, $$1);
      }
   }
}
