import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector2ic;

public class fkb {
   public static final float a = 10000.0F;
   public static final float b = -10000.0F;
   private static final int c = 2;
   private final fip d;
   private final fdi e;
   private final ghl.a f;
   private final fkb.a g = new fkb.a();
   private final fkc h;

   private fkb(fip $$0, fdi $$1, ghl.a $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.h = $$0.aJ();
   }

   public fkb(fip $$0, ghl.a $$1) {
      this($$0, new fdi(), $$1);
   }

   public int a() {
      return this.d.aP().p();
   }

   public int b() {
      return this.d.aP().q();
   }

   public fdi c() {
      return this.e;
   }

   public ghl.a d() {
      return this.f;
   }

   public void e() {
      this.f.b();
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.a(ghv.F(), $$0, $$1, $$2, $$3);
   }

   public void a(ghv $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$2 < $$1) {
         int $$5 = $$1;
         $$1 = $$2;
         $$2 = $$5;
      }

      this.a($$0, $$1, $$3, $$2 + 1, $$3 + 1, $$4);
   }

   public void b(int $$0, int $$1, int $$2, int $$3) {
      this.b(ghv.F(), $$0, $$1, $$2, $$3);
   }

   public void b(ghv $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$3 < $$2) {
         int $$5 = $$2;
         $$2 = $$3;
         $$3 = $$5;
      }

      this.a($$0, $$1, $$2 + 1, $$1 + 1, $$3, $$4);
   }

   public void c(int $$0, int $$1, int $$2, int $$3) {
      this.a(this.g.a(new fow($$0, $$1, $$2 - $$0, $$3 - $$1)));
   }

   public void f() {
      this.a(this.g.a());
   }

   public boolean a(int $$0, int $$1) {
      return this.g.a($$0, $$1);
   }

   private void a(@Nullable fow $$0) {
      this.e();
      if ($$0 != null) {
         fcl $$1 = fip.Q().aP();
         int $$2 = $$1.m();
         double $$3 = $$1.t();
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
      this.a(ghv.F(), $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(ghv $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, 0, $$5);
   }

   public void a(ghv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
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

      fdm $$10 = this.f.getBuffer($$0);
      $$10.a($$7, (float)$$1, (float)$$2, (float)$$5).a($$6);
      $$10.a($$7, (float)$$1, (float)$$4, (float)$$5).a($$6);
      $$10.a($$7, (float)$$3, (float)$$4, (float)$$5).a($$6);
      $$10.a($$7, (float)$$3, (float)$$2, (float)$$5).a($$6);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, 0, $$4, $$5);
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      this.a(ghv.F(), $$0, $$1, $$2, $$3, $$5, $$6, $$4);
   }

   public void a(ghv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      fdm $$8 = this.f.getBuffer($$0);
      this.a($$8, $$1, $$2, $$3, $$4, $$7, $$5, $$6);
   }

   private void a(fdm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      Matrix4f $$8 = this.e.c().a();
      $$0.a($$8, (float)$$1, (float)$$2, (float)$$5).a($$6);
      $$0.a($$8, (float)$$1, (float)$$4, (float)$$5).a($$7);
      $$0.a($$8, (float)$$3, (float)$$4, (float)$$5).a($$7);
      $$0.a($$8, (float)$$3, (float)$$2, (float)$$5).a($$6);
   }

   public void b(ghv $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      Matrix4f $$6 = this.e.c().a();
      fdm $$7 = this.f.getBuffer($$0);
      $$7.a($$6, (float)$$1, (float)$$2, (float)$$5);
      $$7.a($$6, (float)$$1, (float)$$4, (float)$$5);
      $$7.a($$6, (float)$$3, (float)$$4, (float)$$5);
      $$7.a($$6, (float)$$3, (float)$$2, (float)$$5);
   }

   public void a(fjz $$0, String $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2 - $$0.b($$1) / 2, $$3, $$4);
   }

   public void a(fjz $$0, xe $$1, int $$2, int $$3, int $$4) {
      ayr $$5 = $$1.g();
      this.b($$0, $$5, $$2 - $$0.a($$5) / 2, $$3, $$4);
   }

   public void a(fjz $$0, ayr $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2 - $$0.a($$1) / 2, $$3, $$4);
   }

   public int b(fjz $$0, @Nullable String $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(fjz $$0, @Nullable String $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == null ? 0 : $$0.a($$1, (float)$$2, (float)$$3, $$4, $$5, this.e.c().a(), this.f, fjz.a.a, 0, 15728880, $$0.a());
   }

   public int b(fjz $$0, ayr $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(fjz $$0, ayr $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$0.a($$1, (float)$$2, (float)$$3, $$4, $$5, this.e.c().a(), this.f, fjz.a.a, 0, 15728880);
   }

   public int b(fjz $$0, xe $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(fjz $$0, xe $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return this.a($$0, $$1.g(), $$2, $$3, $$4, $$5);
   }

   public void a(fjz $$0, xj $$1, int $$2, int $$3, int $$4, int $$5) {
      for (ayr $$6 : $$0.c($$1, $$4)) {
         this.a($$0, $$6, $$2, $$3, $$5, false);
         $$3 += 9;
      }
   }

   public int a(fjz $$0, xe $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = this.d.n.b(0.0F);
      if ($$6 != 0) {
         int $$7 = 2;
         this.a($$2 - 2, $$3 - 2, $$2 + $$4 + 2, $$3 + 9 + 2, axq.a($$6, $$5));
      }

      return this.a($$0, $$1, $$2, $$3, $$5, true);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$0 + $$2, $$1 + 1, $$4);
      this.a($$0, $$1 + $$3 - 1, $$0 + $$2, $$1 + $$3, $$4);
      this.a($$0, $$1 + 1, $$0 + 1, $$1 + $$3 - 1, $$4);
      this.a($$0 + $$2 - 1, $$1 + 1, $$0 + $$2, $$1 + $$3 - 1, $$4);
   }

   public void a(Function<ale, ghv> $$0, ale $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, -1);
   }

   public void a(Function<ale, ghv> $$0, ale $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      gxg $$7 = this.h.a($$1);
      gyz $$8 = this.h.a($$7);
      if ($$8 instanceof gyz.b) {
         this.a($$0, $$7, $$2, $$3, $$4, $$5, $$6);
      } else if ($$8 instanceof gyz.c $$9) {
         this.a($$0, $$7, $$2, $$3, $$4, $$5, 0, 0, $$9.b(), $$9.c(), $$9.b(), $$9.c(), $$6);
      } else if ($$8 instanceof gyz.a $$10) {
         this.a($$0, $$7, $$10, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public void a(Function<ale, ghv> $$0, ale $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
      gxg $$10 = this.h.a($$1);
      gyz $$11 = this.h.a($$10);
      if ($$11 instanceof gyz.b) {
         this.a($$0, $$10, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, -1);
      } else {
         this.a($$0, $$10, $$6, $$7, $$8, $$9);
      }
   }

   public void a(Function<ale, ghv> $$0, gxg $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, -1);
   }

   public void a(Function<ale, ghv> $$0, gxg $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      if ($$4 != 0 && $$5 != 0) {
         this.a($$0, $$1.i(), $$2, $$2 + $$4, $$3, $$3 + $$5, $$1.c(), $$1.d(), $$1.g(), $$1.h(), $$6);
      }
   }

   private void a(Function<ale, ghv> $$0, gxg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
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

   private void a(Function<ale, ghv> $$0, gxg $$1, gyz.a $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      gyz.a.a $$8 = $$2.d();
      int $$9 = Math.min($$8.a(), $$5 / 2);
      int $$10 = Math.min($$8.c(), $$5 / 2);
      int $$11 = Math.min($$8.b(), $$6 / 2);
      int $$12 = Math.min($$8.d(), $$6 / 2);
      if ($$5 == $$2.b() && $$6 == $$2.c()) {
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$5, $$6, $$7);
      } else if ($$6 == $$2.c()) {
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$9, $$6, $$7);
         this.a($$0, $$1, $$3 + $$9, $$4, $$5 - $$10 - $$9, $$6, $$9, 0, $$2.b() - $$10 - $$9, $$2.c(), $$2.b(), $$2.c(), $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), $$2.b() - $$10, 0, $$3 + $$5 - $$10, $$4, $$10, $$6, $$7);
      } else if ($$5 == $$2.b()) {
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$5, $$11, $$7);
         this.a($$0, $$1, $$3, $$4 + $$11, $$5, $$6 - $$12 - $$11, 0, $$11, $$2.b(), $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, $$2.c() - $$12, $$3, $$4 + $$6 - $$12, $$5, $$12, $$7);
      } else {
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$9, $$11, $$7);
         this.a($$0, $$1, $$3 + $$9, $$4, $$5 - $$10 - $$9, $$11, $$9, 0, $$2.b() - $$10 - $$9, $$11, $$2.b(), $$2.c(), $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), $$2.b() - $$10, 0, $$3 + $$5 - $$10, $$4, $$10, $$11, $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, $$2.c() - $$12, $$3, $$4 + $$6 - $$12, $$9, $$12, $$7);
         this.a($$0, $$1, $$3 + $$9, $$4 + $$6 - $$12, $$5 - $$10 - $$9, $$12, $$9, $$2.c() - $$12, $$2.b() - $$10 - $$9, $$12, $$2.b(), $$2.c(), $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), $$2.b() - $$10, $$2.c() - $$12, $$3 + $$5 - $$10, $$4 + $$6 - $$12, $$10, $$12, $$7);
         this.a($$0, $$1, $$3, $$4 + $$11, $$9, $$6 - $$12 - $$11, 0, $$11, $$9, $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
         this.a(
            $$0, $$1, $$3 + $$9, $$4 + $$11, $$5 - $$10 - $$9, $$6 - $$12 - $$11, $$9, $$11, $$2.b() - $$10 - $$9, $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7
         );
         this.a($$0, $$1, $$3 + $$5 - $$10, $$4 + $$11, $$9, $$6 - $$12 - $$11, $$2.b() - $$10, $$11, $$10, $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
      }
   }

   private void a(Function<ale, ghv> $$0, gxg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12) {
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

   public void a(Function<ale, ghv> $$0, ale $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$6, $$7, $$8, $$9, $$10);
   }

   public void a(Function<ale, ghv> $$0, ale $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$6, $$7, $$8, $$9);
   }

   public void a(Function<ale, ghv> $$0, ale $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, -1);
   }

   public void a(Function<ale, ghv> $$0, ale $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12) {
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

   private void a(Function<ale, ghv> $$0, ale $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, float $$9, int $$10) {
      ghv $$11 = $$0.apply($$1);
      Matrix4f $$12 = this.e.c().a();
      fdm $$13 = this.f.getBuffer($$11);
      $$13.a($$12, (float)$$2, (float)$$4, 0.0F).a($$6, $$8).a($$10);
      $$13.a($$12, (float)$$2, (float)$$5, 0.0F).a($$6, $$9).a($$10);
      $$13.a($$12, (float)$$3, (float)$$5, 0.0F).a($$7, $$9).a($$10);
      $$13.a($$12, (float)$$3, (float)$$4, 0.0F).a($$7, $$8).a($$10);
   }

   public void a(cvs $$0, int $$1, int $$2) {
      this.a(this.d.t, this.d.s, $$0, $$1, $$2, 0);
   }

   public void a(cvs $$0, int $$1, int $$2, int $$3) {
      this.a(this.d.t, this.d.s, $$0, $$1, $$2, $$3);
   }

   public void a(cvs $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a(this.d.t, this.d.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(cvs $$0, int $$1, int $$2) {
      this.b($$0, $$1, $$2, 0);
   }

   public void b(cvs $$0, int $$1, int $$2, int $$3) {
      this.a(null, this.d.s, $$0, $$1, $$2, $$3);
   }

   public void a(bun $$0, cvs $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$0.dS(), $$1, $$2, $$3, $$4);
   }

   private void a(@Nullable bun $$0, @Nullable dej $$1, cvs $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 0);
   }

   private void a(@Nullable bun $$0, @Nullable dej $$1, cvs $$2, int $$3, int $$4, int $$5, int $$6) {
      if (!$$2.f()) {
         gzi $$7 = this.d.as().a($$2, $$1, $$0, $$5);
         this.e.a();
         this.e.a((float)($$3 + 8), (float)($$4 + 8), (float)(150 + ($$7.b() ? $$6 : 0)));

         try {
            this.e.b(16.0F, -16.0F, 16.0F);
            boolean $$8 = !$$7.c();
            if ($$8) {
               this.e();
               fce.c();
            }

            this.d.as().a($$2, cvp.g, false, this.e, this.d(), 15728880, gwx.d, $$7);
            this.e();
            if ($$8) {
               fce.d();
            }
         } catch (Throwable var12) {
            o $$10 = o.a(var12, "Rendering item");
            p $$11 = $$10.a("Item being rendered");
            $$11.a("Item Type", () -> String.valueOf($$2.h()));
            $$11.a("Item Components", () -> String.valueOf($$2.a()));
            $$11.a("Item Foil", () -> String.valueOf($$2.A()));
            throw new z($$10);
         }

         this.e.b();
      }
   }

   public void a(fjz $$0, cvs $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, null);
   }

   public void a(fjz $$0, cvs $$1, int $$2, int $$3, @Nullable String $$4) {
      if (!$$1.f()) {
         this.e.a();
         if ($$1.K() != 1 || $$4 != null) {
            String $$5 = $$4 == null ? String.valueOf($$1.K()) : $$4;
            this.e.a(0.0F, 0.0F, 200.0F);
            this.a($$0, $$5, $$2 + 19 - 2 - $$0.b($$5), $$3 + 6 + 3, 16777215, true);
         }

         if ($$1.r()) {
            int $$6 = $$1.s();
            int $$7 = $$1.t();
            int $$8 = $$2 + 2;
            int $$9 = $$3 + 13;
            this.a(ghv.G(), $$8, $$9, $$8 + 13, $$9 + 2, -16777216);
            this.a(ghv.G(), $$8, $$9, $$8 + $$6, $$9 + 1, axq.f($$7));
         }

         ggh $$10 = this.d.t;
         float $$11 = $$10 == null ? 0.0F : $$10.gy().a($$1, this.d.av().a(true));
         if ($$11 > 0.0F) {
            int $$12 = $$3 + azf.d(16.0F * (1.0F - $$11));
            int $$13 = $$12 + azf.f(16.0F * $$11);
            this.a(ghv.G(), $$2, $$12, $$2 + 16, $$13, Integer.MAX_VALUE);
         }

         this.e.b();
      }
   }

   public void b(fjz $$0, cvs $$1, int $$2, int $$3) {
      this.a($$0, fqh.a(this.d, $$1), $$1.b(), $$2, $$3);
   }

   public void a(fjz $$0, List<xe> $$1, Optional<ctg> $$2, int $$3, int $$4) {
      List<fsq> $$5 = $$1.stream().map(xe::g).map(fsq::a).collect(ad.b());
      $$2.ifPresent($$1x -> $$5.add($$5.isEmpty() ? 0 : 1, fsq.a($$1x)));
      this.a($$0, $$5, $$3, $$4, fss.a);
   }

   public void a(fjz $$0, xe $$1, int $$2, int $$3) {
      this.b($$0, List.of($$1.g()), $$2, $$3);
   }

   public void a(fjz $$0, List<xe> $$1, int $$2, int $$3) {
      this.b($$0, Lists.transform($$1, xe::g), $$2, $$3);
   }

   public void b(fjz $$0, List<? extends ayr> $$1, int $$2, int $$3) {
      this.a($$0, $$1.stream().map(fsq::a).collect(Collectors.toList()), $$2, $$3, fss.a);
   }

   public void a(fjz $$0, List<ayr> $$1, fsr $$2, int $$3, int $$4) {
      this.a($$0, $$1.stream().map(fsq::a).collect(Collectors.toList()), $$3, $$4, $$2);
   }

   private void a(fjz $$0, List<fsq> $$1, int $$2, int $$3, fsr $$4) {
      if (!$$1.isEmpty()) {
         int $$5 = 0;
         int $$6 = $$1.size() == 1 ? -2 : 0;

         for (fsq $$7 : $$1) {
            int $$8 = $$7.b($$0);
            if ($$8 > $$5) {
               $$5 = $$8;
            }

            $$6 += $$7.a($$0);
         }

         int $$9 = $$5;
         int $$10 = $$6;
         Vector2ic $$11 = $$4.a(this.a(), this.b(), $$2, $$3, $$5, $$6);
         int $$12 = $$11.x();
         int $$13 = $$11.y();
         this.e.a();
         int $$14 = 400;
         fsu.a(this, $$12, $$13, $$5, $$6, 400);
         this.e.a(0.0F, 0.0F, 400.0F);
         int $$15 = $$13;

         for (int $$16 = 0; $$16 < $$1.size(); $$16++) {
            fsq $$17 = $$1.get($$16);
            $$17.a($$0, $$12, $$15, this.e.c().a(), this.f);
            $$15 += $$17.a($$0) + ($$16 == 0 ? 2 : 0);
         }

         $$15 = $$13;

         for (int $$18 = 0; $$18 < $$1.size(); $$18++) {
            fsq $$19 = $$1.get($$18);
            $$19.a($$0, $$12, $$15, $$9, $$10, this);
            $$15 += $$19.a($$0) + ($$18 == 0 ? 2 : 0);
         }

         this.e.b();
      }
   }

   public void a(fjz $$0, @Nullable yb $$1, int $$2, int $$3) {
      if ($$1 != null && $$1.i() != null) {
         xk $$4 = $$1.i();
         xk.c $$5 = $$4.a(xk.a.b);
         if ($$5 != null) {
            this.b($$0, $$5.a(), $$2, $$3);
         } else {
            xk.b $$6 = $$4.a(xk.a.c);
            if ($$6 != null) {
               if (this.d.n.m) {
                  this.a($$0, $$6.a(), $$2, $$3);
               }
            } else {
               xe $$7 = $$4.a(xk.a.a);
               if ($$7 != null) {
                  this.b($$0, $$0.c($$7, Math.max(this.a() / 2, 200)), $$2, $$3);
               }
            }
         }
      }
   }

   static class a {
      private final Deque<fow> a = new ArrayDeque<>();

      public fow a(fow $$0) {
         fow $$1 = this.a.peekLast();
         if ($$1 != null) {
            fow $$2 = Objects.requireNonNullElse($$0.b($$1), fow.a());
            this.a.addLast($$2);
            return $$2;
         } else {
            this.a.addLast($$0);
            return $$0;
         }
      }

      @Nullable
      public fow a() {
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
