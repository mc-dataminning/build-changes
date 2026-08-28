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

public class fro {
   public static final float a = 10000.0F;
   public static final float b = -10000.0F;
   private static final int c = 2;
   private final fos d;
   private final fjc e;
   private final gps.a f;
   private final fro.a g = new fro.a();
   private final frp h;
   private final hfi i = new hfi();

   private fro(fos $$0, fjc $$1, gps.a $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.h = $$0.aJ();
   }

   public fro(fos $$0, gps.a $$1) {
      this($$0, new fjc(), $$1);
   }

   public int a() {
      return this.d.aO().o();
   }

   public int b() {
      return this.d.aO().p();
   }

   public fjc c() {
      return this.e;
   }

   public void d() {
      this.f.b();
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.a(gqc.K(), $$0, $$1, $$2, $$3);
   }

   public void a(gqc $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$2 < $$1) {
         int $$5 = $$1;
         $$1 = $$2;
         $$2 = $$5;
      }

      this.a($$0, $$1, $$3, $$2 + 1, $$3 + 1, $$4);
   }

   public void b(int $$0, int $$1, int $$2, int $$3) {
      this.b(gqc.K(), $$0, $$1, $$2, $$3);
   }

   public void b(gqc $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$3 < $$2) {
         int $$5 = $$2;
         $$2 = $$3;
         $$3 = $$5;
      }

      this.a($$0, $$1, $$2 + 1, $$1 + 1, $$3, $$4);
   }

   public void c(int $$0, int $$1, int $$2, int $$3) {
      fwj $$4 = new fwj($$0, $$1, $$2 - $$0, $$3 - $$1).a(this.e.c().a());
      this.a(this.g.a($$4));
   }

   public void e() {
      this.a(this.g.a());
   }

   public boolean a(int $$0, int $$1) {
      return this.g.a($$0, $$1);
   }

   private void a(@Nullable fwj $$0) {
      this.d();
      if ($$0 != null) {
         fif $$1 = fos.Q().aO();
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
      this.a(gqc.K(), $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(gqc $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, 0, $$5);
   }

   public void a(gqc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
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

      fjg $$10 = this.f.getBuffer($$0);
      $$10.a($$7, (float)$$1, (float)$$2, (float)$$5).a($$6);
      $$10.a($$7, (float)$$1, (float)$$4, (float)$$5).a($$6);
      $$10.a($$7, (float)$$3, (float)$$4, (float)$$5).a($$6);
      $$10.a($$7, (float)$$3, (float)$$2, (float)$$5).a($$6);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, 0, $$4, $$5);
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      this.a(gqc.K(), $$0, $$1, $$2, $$3, $$5, $$6, $$4);
   }

   public void a(gqc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      fjg $$8 = this.f.getBuffer($$0);
      this.a($$8, $$1, $$2, $$3, $$4, $$7, $$5, $$6);
   }

   private void a(fjg $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      Matrix4f $$8 = this.e.c().a();
      $$0.a($$8, (float)$$1, (float)$$2, (float)$$5).a($$6);
      $$0.a($$8, (float)$$1, (float)$$4, (float)$$5).a($$7);
      $$0.a($$8, (float)$$3, (float)$$4, (float)$$5).a($$7);
      $$0.a($$8, (float)$$3, (float)$$2, (float)$$5).a($$6);
   }

   public void b(gqc $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      Matrix4f $$6 = this.e.c().a();
      fjg $$7 = this.f.getBuffer($$0);
      $$7.a($$6, (float)$$1, (float)$$2, (float)$$5);
      $$7.a($$6, (float)$$1, (float)$$4, (float)$$5);
      $$7.a($$6, (float)$$3, (float)$$4, (float)$$5);
      $$7.a($$6, (float)$$3, (float)$$2, (float)$$5);
   }

   public void a(frm $$0, String $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2 - $$0.b($$1) / 2, $$3, $$4);
   }

   public void a(frm $$0, wy $$1, int $$2, int $$3, int $$4) {
      ayy $$5 = $$1.g();
      this.b($$0, $$5, $$2 - $$0.a($$5) / 2, $$3, $$4);
   }

   public void a(frm $$0, ayy $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2 - $$0.a($$1) / 2, $$3, $$4);
   }

   public int b(frm $$0, @Nullable String $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(frm $$0, @Nullable String $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == null ? 0 : $$0.a($$1, (float)$$2, (float)$$3, $$4, $$5, this.e.c().a(), this.f, frm.a.a, 0, 15728880);
   }

   public int b(frm $$0, ayy $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(frm $$0, ayy $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$0.a($$1, (float)$$2, (float)$$3, $$4, $$5, this.e.c().a(), this.f, frm.a.a, 0, 15728880);
   }

   public int b(frm $$0, wy $$1, int $$2, int $$3, int $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public int a(frm $$0, wy $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return this.a($$0, $$1.g(), $$2, $$3, $$4, $$5);
   }

   public void a(frm $$0, xd $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, true);
   }

   public void a(frm $$0, xd $$1, int $$2, int $$3, int $$4, int $$5, boolean $$6) {
      for (ayy $$7 : $$0.c($$1, $$4)) {
         this.a($$0, $$7, $$2, $$3, $$5, $$6);
         $$3 += 9;
      }
   }

   public int a(frm $$0, wy $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = this.d.n.b(0.0F);
      if ($$6 != 0) {
         int $$7 = 2;
         this.a($$2 - 2, $$3 - 2, $$2 + $$4 + 2, $$3 + 9 + 2, axw.a($$6, $$5));
      }

      return this.a($$0, $$1, $$2, $$3, $$5, true);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$0 + $$2, $$1 + 1, $$4);
      this.a($$0, $$1 + $$3 - 1, $$0 + $$2, $$1 + $$3, $$4);
      this.a($$0, $$1 + 1, $$0 + 1, $$1 + $$3 - 1, $$4);
      this.a($$0 + $$2 - 1, $$1 + 1, $$0 + $$2, $$1 + $$3 - 1, $$4);
   }

   public void a(Function<alg, gqc> $$0, alg $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, -1);
   }

   public void a(Function<alg, gqc> $$0, alg $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      hip $$7 = this.h.a($$1);
      hkg $$8 = this.h.a($$7);
      if ($$8 instanceof hkg.b) {
         this.a($$0, $$7, $$2, $$3, $$4, $$5, $$6);
      } else if ($$8 instanceof hkg.c $$9) {
         this.a($$0, $$7, $$2, $$3, $$4, $$5, 0, 0, $$9.b(), $$9.c(), $$9.b(), $$9.c(), $$6);
      } else if ($$8 instanceof hkg.a $$10) {
         this.a($$0, $$7, $$10, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public void a(Function<alg, gqc> $$0, alg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
      hip $$10 = this.h.a($$1);
      hkg $$11 = this.h.a($$10);
      if ($$11 instanceof hkg.b) {
         this.a($$0, $$10, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, -1);
      } else {
         this.c($$6, $$7, $$6 + $$8, $$7 + $$9);
         this.a($$0, $$1, $$6 - $$4, $$7 - $$5, $$2, $$3, -1);
         this.e();
      }
   }

   public void a(Function<alg, gqc> $$0, hip $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, -1);
   }

   public void a(Function<alg, gqc> $$0, hip $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      if ($$4 != 0 && $$5 != 0) {
         this.a($$0, $$1.i(), $$2, $$2 + $$4, $$3, $$3 + $$5, $$1.c(), $$1.d(), $$1.g(), $$1.h(), $$6);
      }
   }

   private void a(Function<alg, gqc> $$0, hip $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
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

   private void a(Function<alg, gqc> $$0, hip $$1, hkg.a $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      hkg.a.a $$8 = $$2.d();
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
         this.a($$0, $$2, $$1, $$3 + $$5 - $$10, $$4 + $$11, $$10, $$6 - $$12 - $$11, $$2.b() - $$10, $$11, $$10, $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
      }
   }

   private void a(
      Function<alg, gqc> $$0, hkg.a $$1, hip $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12, int $$13
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

   private void a(Function<alg, gqc> $$0, hip $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12) {
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

   public void a(Function<alg, gqc> $$0, alg $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$6, $$7, $$8, $$9, $$10);
   }

   public void a(Function<alg, gqc> $$0, alg $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$6, $$7, $$8, $$9);
   }

   public void a(Function<alg, gqc> $$0, alg $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, -1);
   }

   public void a(Function<alg, gqc> $$0, alg $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12) {
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

   private void a(Function<alg, gqc> $$0, alg $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, float $$9, int $$10) {
      gqc $$11 = $$0.apply($$1);
      Matrix4f $$12 = this.e.c().a();
      fjg $$13 = this.f.getBuffer($$11);
      $$13.a($$12, (float)$$2, (float)$$4, 0.0F).a($$6, $$8).a($$10);
      $$13.a($$12, (float)$$2, (float)$$5, 0.0F).a($$6, $$9).a($$10);
      $$13.a($$12, (float)$$3, (float)$$5, 0.0F).a($$7, $$9).a($$10);
      $$13.a($$12, (float)$$3, (float)$$4, 0.0F).a($$7, $$8).a($$10);
   }

   public void a(cyy $$0, int $$1, int $$2) {
      this.a(this.d.t, this.d.s, $$0, $$1, $$2, 0);
   }

   public void a(cyy $$0, int $$1, int $$2, int $$3) {
      this.a(this.d.t, this.d.s, $$0, $$1, $$2, $$3);
   }

   public void a(cyy $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a(this.d.t, this.d.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(cyy $$0, int $$1, int $$2) {
      this.b($$0, $$1, $$2, 0);
   }

   public void b(cyy $$0, int $$1, int $$2, int $$3) {
      this.a(null, this.d.s, $$0, $$1, $$2, $$3);
   }

   public void a(bxc $$0, cyy $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$0.dV(), $$1, $$2, $$3, $$4);
   }

   private void a(@Nullable bxc $$0, @Nullable div $$1, cyy $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 0);
   }

   private void a(@Nullable bxc $$0, @Nullable div $$1, cyy $$2, int $$3, int $$4, int $$5, int $$6) {
      if (!$$2.f()) {
         this.d.bf().a(this.i, $$2, cyw.g, false, $$1, $$0, $$5);
         this.e.a();
         this.e.a((float)($$3 + 8), (float)($$4 + 8), (float)(150 + (this.i.d() ? $$6 : 0)));

         try {
            this.e.b(16.0F, -16.0F, 16.0F);
            boolean $$7 = !this.i.e();
            if ($$7) {
               this.d();
               fhy.c();
            }

            this.i.a(this.e, this.f, 15728880, hif.d);
            this.d();
            if ($$7) {
               fhy.d();
            }
         } catch (Throwable var11) {
            o $$9 = o.a(var11, "Rendering item");
            p $$10 = $$9.a("Item being rendered");
            $$10.a("Item Type", () -> String.valueOf($$2.h()));
            $$10.a("Item Components", () -> String.valueOf($$2.a()));
            $$10.a("Item Foil", () -> String.valueOf($$2.C()));
            throw new z($$9);
         }

         this.e.b();
      }
   }

   public void a(frm $$0, cyy $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, null);
   }

   public void a(frm $$0, cyy $$1, int $$2, int $$3, @Nullable String $$4) {
      if (!$$1.f()) {
         this.e.a();
         this.c($$1, $$2, $$3);
         this.b($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$3);
         this.e.b();
      }
   }

   public void b(frm $$0, cyy $$1, int $$2, int $$3) {
      this.a($$0, fxu.a(this.d, $$1), $$1.b(), $$2, $$3, $$1.a(kj.G));
   }

   public void a(frm $$0, List<wy> $$1, Optional<cwx> $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, null);
   }

   public void a(frm $$0, List<wy> $$1, Optional<cwx> $$2, int $$3, int $$4, @Nullable alg $$5) {
      List<gag> $$6 = $$1.stream().map(wy::g).map(gag::a).collect(af.b());
      $$2.ifPresent($$1x -> $$6.add($$6.isEmpty() ? 0 : 1, gag.a($$1x)));
      this.a($$0, $$6, $$3, $$4, gai.a, $$5);
   }

   public void a(frm $$0, wy $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, null);
   }

   public void a(frm $$0, wy $$1, int $$2, int $$3, @Nullable alg $$4) {
      this.b($$0, List.of($$1.g()), $$2, $$3, $$4);
   }

   public void a(frm $$0, List<wy> $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, null);
   }

   public void a(frm $$0, List<wy> $$1, int $$2, int $$3, @Nullable alg $$4) {
      this.a($$0, $$1.stream().map(wy::g).map(gag::a).toList(), $$2, $$3, gai.a, $$4);
   }

   public void b(frm $$0, List<? extends ayy> $$1, int $$2, int $$3) {
      this.b($$0, $$1, $$2, $$3, null);
   }

   public void b(frm $$0, List<? extends ayy> $$1, int $$2, int $$3, @Nullable alg $$4) {
      this.a($$0, $$1.stream().map(gag::a).collect(Collectors.toList()), $$2, $$3, gai.a, $$4);
   }

   public void a(frm $$0, List<ayy> $$1, gah $$2, int $$3, int $$4) {
      this.a($$0, $$1.stream().map(gag::a).collect(Collectors.toList()), $$3, $$4, $$2, null);
   }

   private void a(frm $$0, List<gag> $$1, int $$2, int $$3, gah $$4, @Nullable alg $$5) {
      if (!$$1.isEmpty()) {
         int $$6 = 0;
         int $$7 = $$1.size() == 1 ? -2 : 0;

         for (gag $$8 : $$1) {
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
         gak.a(this, $$13, $$14, $$6, $$7, 400, $$5);
         this.e.a(0.0F, 0.0F, 400.0F);
         int $$16 = $$14;

         for (int $$17 = 0; $$17 < $$1.size(); $$17++) {
            gag $$18 = $$1.get($$17);
            $$18.a($$0, $$13, $$16, this.e.c().a(), this.f);
            $$16 += $$18.a($$0) + ($$17 == 0 ? 2 : 0);
         }

         $$16 = $$14;

         for (int $$19 = 0; $$19 < $$1.size(); $$19++) {
            gag $$20 = $$1.get($$19);
            $$20.a($$0, $$13, $$16, $$10, $$11, this);
            $$16 += $$20.a($$0) + ($$19 == 0 ? 2 : 0);
         }

         this.e.b();
      }
   }

   private void c(cyy $$0, int $$1, int $$2) {
      if ($$0.s()) {
         int $$3 = $$1 + 2;
         int $$4 = $$2 + 13;
         this.a(gqc.K(), $$3, $$4, $$3 + 13, $$4 + 2, 200, -16777216);
         this.a(gqc.K(), $$3, $$4, $$3 + $$0.t(), $$4 + 1, 200, axw.f($$0.u()));
      }
   }

   private void b(frm $$0, cyy $$1, int $$2, int $$3, @Nullable String $$4) {
      if ($$1.M() != 1 || $$4 != null) {
         String $$5 = $$4 == null ? String.valueOf($$1.M()) : $$4;
         this.e.a();
         this.e.a(0.0F, 0.0F, 200.0F);
         this.a($$0, $$5, $$2 + 19 - 2 - $$0.b($$5), $$3 + 6 + 3, -1, true);
         this.e.b();
      }
   }

   private void d(cyy $$0, int $$1, int $$2) {
      gop $$3 = this.d.t;
      float $$4 = $$3 == null ? 0.0F : $$3.gE().a($$0, this.d.av().a(true));
      if ($$4 > 0.0F) {
         int $$5 = $$2 + azm.d(16.0F * (1.0F - $$4));
         int $$6 = $$5 + azm.f(16.0F * $$4);
         this.a(gqc.K(), $$1, $$5, $$1 + 16, $$6, 200, Integer.MAX_VALUE);
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void a(frm $$0, @Nullable xv $$1, int $$2, int $$3) {
      if ($$1 != null && $$1.j() != null) {
         xe var10000 = $$1.j();
         Objects.requireNonNull(var10000);
         Object var5 = var10000;
         Throwable var21;
         switch (var5) {
            case xe.d var7:
               xe.d var25 = var7;

               try {
                  var26 = var25.b();
               } catch (Throwable var16) {
                  var21 = var16;
                  boolean var28 = false;
                  break;
               }

               cyy var18 = var26;
               this.b($$0, var18, $$2, $$3);
               return;
            case xe.c var9:
               xe.c var23 = var9;

               try {
                  var24 = var23.b();
               } catch (Throwable var15) {
                  var21 = var15;
                  boolean var27 = false;
                  break;
               }

               xe.b var19 = var24;
               if (this.d.n.m) {
                  this.a($$0, var19.a(), $$2, $$3);
               }

               return;
            case xe.e var11:
               xe.e var20 = var11;

               try {
                  var22 = var20.b();
               } catch (Throwable var14) {
                  var21 = var14;
                  boolean var10001 = false;
                  break;
               }

               wy var13 = var22;
               this.b($$0, $$0.c(var13, Math.max(this.a() / 2, 200)), $$2, $$3);
               return;
            default:
               return;
         }

         Throwable var17 = var21;
         throw new MatchException(var17.toString(), var17);
      }
   }

   public void a(Consumer<gps> $$0) {
      $$0.accept(this.f);
      this.f.b();
   }

   static class a {
      private final Deque<fwj> a = new ArrayDeque<>();

      public fwj a(fwj $$0) {
         fwj $$1 = this.a.peekLast();
         if ($$1 != null) {
            fwj $$2 = Objects.requireNonNullElse($$0.b($$1), fwj.a());
            this.a.addLast($$2);
            return $$2;
         } else {
            this.a.addLast($$0);
            return $$0;
         }
      }

      @Nullable
      public fwj a() {
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
