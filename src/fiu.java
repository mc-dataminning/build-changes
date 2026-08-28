import com.mojang.blaze3d.platform.GlConst;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Collection;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.lwjgl.opengl.GL11;
import org.slf4j.Logger;

public class fiu implements fkz {
   private static final Logger a = LogUtils.getLogger();
   private final fix b;
   private final int c;
   private final int d;
   @Nullable
   private fjp e;
   private boolean f;
   @Nullable
   private fiy g;

   protected fiu(fix $$0) {
      this.b = $$0;
      this.c = $$0.l().a();
      this.d = $$0.l().a();
   }

   @Override
   public flb a(flh $$0, OptionalInt $$1) {
      return this.a($$0, $$1, null, OptionalDouble.empty());
   }

   @Override
   public flb a(flh $$0, OptionalInt $$1, @Nullable flh $$2, OptionalDouble $$3) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else {
         if ($$3.isPresent() && $$2 == null) {
            a.warn("Depth clear value was provided but no depth texture is being used");
         }

         this.f = true;
         int $$4 = ((fjc)$$0).a(this.b.l(), $$2);
         GlStateManager._glBindFramebuffer(36160, $$4);
         int $$5 = 0;
         if ($$1.isPresent()) {
            int $$6 = $$1.getAsInt();
            GL11.glClearColor(axy.j($$6), axy.k($$6), axy.l($$6), axy.i($$6));
            $$5 |= 16384;
         }

         if ($$2 != null && $$3.isPresent()) {
            GL11.glClearDepth($$3.getAsDouble());
            $$5 |= 256;
         }

         if ($$5 != 0) {
            GlStateManager._depthMask(true);
            GlStateManager._colorMask(true, true, true, true);
            GlStateManager._clear($$5);
         }

         GlStateManager._viewport(0, 0, $$0.a(0), $$0.b(0));
         return new fiz(this, $$2 != null);
      }
   }

   @Override
   public void a(flh $$0, int $$1) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else if ($$0.d() == fli.c) {
         throw new IllegalStateException("Trying to clear a depth texture as a color texture!");
      } else {
         GlStateManager._glBindFramebuffer(36160, this.d);
         this.b.l().a(this.d, ((fjc)$$0).a, 0, 0);
         GL11.glClearColor(axy.j($$1), axy.k($$1), axy.l($$1), axy.i($$1));
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._clear(16384);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   @Override
   public void a(flh $$0, int $$1, flh $$2, double $$3) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else if ($$0.d() == fli.c) {
         throw new IllegalStateException("Trying to clear a depth texture as a color texture!");
      } else if ($$2.d() != fli.c) {
         throw new IllegalStateException("Trying to clear a color texture as a depth texture!");
      } else {
         int $$4 = ((fjc)$$0).a(this.b.l(), $$2);
         GlStateManager._glBindFramebuffer(36160, $$4);
         GL11.glClearDepth($$3);
         GL11.glClearColor(axy.j($$1), axy.k($$1), axy.l($$1), axy.i($$1));
         GlStateManager._depthMask(true);
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._clear(16640);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   @Override
   public void a(flh $$0, double $$1) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else if ($$0.d() != fli.c) {
         throw new IllegalStateException("Trying to clear a color texture as a depth texture!");
      } else {
         GlStateManager._glBindFramebuffer(36160, this.d);
         GL11.glDrawBuffer(0);
         this.b.l().a(this.d, 0, ((fjc)$$0).a, 0);
         GL11.glClearDepth($$1);
         GlStateManager._depthMask(true);
         GlStateManager._clear(256);
         GL11.glDrawBuffer(36064);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   @Override
   public void a(fig $$0, ByteBuffer $$1, int $$2) {
      fit $$3 = (fit)$$0;
      if ($$3.c) {
         throw new IllegalStateException("Buffer already closed");
      } else if (!$$3.c().b()) {
         throw new IllegalStateException("Buffer is not writable");
      } else {
         int $$4 = $$1.remaining();
         if ($$4 + $$2 > $$3.a) {
            throw new IllegalArgumentException(
               "Cannot write more data than this buffer can hold (attempting to write " + $$4 + " bytes at offset " + $$2 + " to " + $$3.a + " size buffer)"
            );
         } else {
            GlStateManager._glBindBuffer(GlConst.toGl($$3.b()), $$3.f);
            if ($$3.d) {
               GlStateManager._glBufferSubData(GlConst.toGl($$3.b()), $$2, $$1);
            } else if ($$2 == 0 && $$4 == $$3.a) {
               GlStateManager._glBufferData(GlConst.toGl($$3.b()), $$1, GlConst.toGl($$3.c()));
               fit.b.malloc((long)$$3.f, $$3.a);
               $$3.d = true;
               this.b.a().a($$3);
            } else {
               GlStateManager._glBufferData(GlConst.toGl($$3.b()), (long)$$3.a, GlConst.toGl($$3.c()));
               GlStateManager._glBufferSubData(GlConst.toGl($$3.b()), $$2, $$1);
               fit.b.malloc((long)$$3.f, $$3.a);
               $$3.d = true;
               this.b.a().a($$3);
            }
         }
      }
   }

   @Override
   public void a(fig $$0, int $$1) {
      fit $$2 = (fit)$$0;
      if ($$2.c) {
         throw new IllegalStateException("Buffer already closed");
      } else {
         if ($$2.d) {
            fit.b.free((long)$$2.f);
         }

         $$2.a = $$1;
         if ($$2.c().b()) {
            $$2.d = false;
         } else {
            GlStateManager._glBindBuffer(GlConst.toGl($$2.b()), $$2.f);
            GlStateManager._glBufferData(GlConst.toGl($$2.b()), (long)$$1, GlConst.toGl($$2.c()));
            fit.b.malloc((long)$$2.f, $$1);
            $$2.d = true;
            this.b.a().a($$2);
         }
      }
   }

   @Override
   public fig.a a(fig $$0) {
      return this.a($$0, 0, $$0.a());
   }

   @Override
   public fig.a a(fig $$0, int $$1, int $$2) {
      fit $$3 = (fit)$$0;
      if ($$3.c) {
         throw new IllegalStateException("Buffer already closed");
      } else if (!$$3.c().a()) {
         throw new IllegalStateException("Buffer is not readable");
      } else if ($$1 + $$2 > $$3.a) {
         throw new IllegalArgumentException(
            "Cannot read more data than this buffer can hold (attempting to read " + $$2 + " bytes at offset " + $$1 + " from " + $$3.a + " size buffer)"
         );
      } else {
         GlStateManager.clearGlErrors();
         GlStateManager._glBindBuffer(GlConst.toGl($$3.b()), $$3.f);
         ByteBuffer $$4 = GlStateManager._glMapBufferRange(GlConst.toGl($$3.b()), $$1, $$2, 1);
         if ($$4 == null) {
            throw new IllegalStateException("Can't read buffer, opengl error " + GlStateManager._getError());
         } else {
            return new fit.a(GlConst.toGl($$3.b()), $$4);
         }
      }
   }

   @Override
   public void a(flh $$0, fkg $$1) {
      int $$2 = $$0.a(0);
      int $$3 = $$0.b(0);
      if ($$1.a() == $$2 && $$1.b() == $$3) {
         this.a($$0, $$1, 0, 0, 0, $$2, $$3, 0, 0);
      } else {
         throw new IllegalArgumentException("Cannot replace texture of size " + $$2 + "x" + $$3 + " with image of size " + $$1.a() + "x" + $$1.b());
      }
   }

   @Override
   public void a(flh $$0, fkg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      if ($$2 >= 0 && $$2 < $$0.c()) {
         if ($$7 + $$5 > $$1.a() || $$8 + $$6 > $$1.b()) {
            throw new IllegalArgumentException(
               "Copy source (" + $$1.a() + "x" + $$1.b() + ") is not large enough to read a rectangle of " + $$5 + "x" + $$6 + " from " + $$7 + "x" + $$8
            );
         } else if ($$3 + $$5 <= $$0.a($$2) && $$4 + $$6 <= $$0.b($$2)) {
            GlStateManager._bindTexture(((fjc)$$0).a);
            GlStateManager._pixelStore(3314, $$1.a());
            GlStateManager._pixelStore(3316, $$7);
            GlStateManager._pixelStore(3315, $$8);
            GlStateManager._pixelStore(3317, $$1.c().a());
            GlStateManager._texSubImage2D(3553, $$2, $$3, $$4, $$5, $$6, GlConst.toGl($$1.c()), 5121, $$1.h());
         } else {
            throw new IllegalArgumentException(
               "Dest texture ("
                  + $$5
                  + "x"
                  + $$6
                  + ") is not large enough to write a rectangle of "
                  + $$5
                  + "x"
                  + $$6
                  + " at "
                  + $$3
                  + "x"
                  + $$4
                  + " (at mip level "
                  + $$2
                  + ")"
            );
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + $$2 + ", must be >= 0 and < " + $$0.c());
      }
   }

   @Override
   public void a(flh $$0, IntBuffer $$1, fkg.a $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      if ($$3 >= 0 && $$3 < $$0.c()) {
         if ($$6 * $$7 > $$1.remaining()) {
            throw new IllegalArgumentException(
               "Copy would overrun the source buffer (remaining length of " + $$1.remaining() + ", but copy is " + $$6 + "x" + $$7 + ")"
            );
         } else if ($$4 + $$6 <= $$0.a($$3) && $$5 + $$7 <= $$0.b($$3)) {
            GlStateManager._bindTexture(((fjc)$$0).a);
            GlStateManager._pixelStore(3314, $$6);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, $$2.a());
            GlStateManager._texSubImage2D(3553, $$3, $$4, $$5, $$6, $$7, GlConst.toGl($$2), 5121, $$1);
         } else {
            throw new IllegalArgumentException(
               "Dest texture (" + $$0.a($$3) + "x" + $$0.b($$3) + ") is not large enough to write a rectangle of " + $$6 + "x" + $$7 + " at " + $$4 + "x" + $$5
            );
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel, must be >= 0 and < " + $$0.c());
      }
   }

   @Override
   public void a(flh $$0, fig $$1, int $$2, Runnable $$3, int $$4) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         this.a($$0, $$1, $$2, $$3, $$4, 0, 0, $$0.a($$4), $$0.b($$4));
      }
   }

   @Override
   public void a(flh $$0, fig $$1, int $$2, Runnable $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if ($$4 >= 0 && $$4 < $$0.c()) {
         if ($$0.a($$4) * $$0.b($$4) * $$0.d().a() + $$2 > $$1.a()) {
            throw new IllegalArgumentException(
               "Buffer of size "
                  + $$1.a()
                  + " is not large enough to hold "
                  + $$7
                  + "x"
                  + $$8
                  + " pixels ("
                  + $$0.d().a()
                  + " bytes each) starting from offset "
                  + $$2
            );
         } else if ($$1.b() != fie.c) {
            throw new IllegalArgumentException("Buffer of type " + $$1.b() + " cannot be used to retrieve a texture");
         } else if ($$5 + $$7 <= $$0.a($$4) && $$6 + $$8 <= $$0.b($$4)) {
            GlStateManager._glBindFramebuffer(36008, this.c);
            GlStateManager._glBindBuffer(GlConst.toGl($$1.b()), ((fit)$$1).f);
            GlStateManager._glFramebufferTexture2D(36008, 36064, 3553, ((fjc)$$0).b(), $$4);
            GlStateManager._pixelStore(3330, $$7);
            GlStateManager._readPixels($$5, $$6, $$7, $$8, GlConst.toGlExternalId($$0.d()), GlConst.toGlType($$0.d()), (long)$$2);
            RenderSystem.queueFencedTask($$3);
            GlStateManager._glBindFramebuffer(36008, 0);
            GlStateManager._glBindBuffer(GlConst.toGl($$1.b()), 0);
            int $$9 = GlStateManager._getError();
            if ($$9 != 0) {
               throw new IllegalStateException("Couldn't perform copyTobuffer for texture " + $$0.e() + ": GL error " + $$9);
            }
         } else {
            throw new IllegalArgumentException(
               "Copy source texture ("
                  + $$0.a($$4)
                  + "x"
                  + $$0.b($$4)
                  + ") is not large enough to read a rectangle of "
                  + $$7
                  + "x"
                  + $$8
                  + " from "
                  + $$5
                  + ","
                  + $$6
            );
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + $$4 + ", must be >= 0 and < " + $$0.c());
      }
   }

   @Override
   public void a(flh $$0, flh $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if ($$2 >= 0 && $$2 < $$0.c() && $$2 < $$1.c()) {
         if ($$3 + $$7 > $$1.a($$2) || $$4 + $$8 > $$1.b($$2)) {
            throw new IllegalArgumentException(
               "Dest texture (" + $$1.a($$2) + "x" + $$1.b($$2) + ") is not large enough to write a rectangle of " + $$7 + "x" + $$8 + " at " + $$3 + "x" + $$4
            );
         } else if ($$5 + $$7 <= $$0.a($$2) && $$6 + $$8 <= $$0.b($$2)) {
            GlStateManager._glBindFramebuffer(36008, this.c);
            GlStateManager._glBindFramebuffer(36009, this.d);
            boolean $$9 = $$0.d() == fli.c;
            GlStateManager._glFramebufferTexture2D(36008, $$9 ? '贀' : '賠', 3553, ((fjc)$$0).b(), $$2);
            GlStateManager._glFramebufferTexture2D(36009, $$9 ? '贀' : '賠', 3553, ((fjc)$$1).b(), $$2);
            GlStateManager._glBlitFrameBuffer($$5, $$6, $$7, $$8, $$3, $$4, $$7, $$8, $$9 ? 256 : 16384, 9728);
            GlStateManager._glBindFramebuffer(36008, 0);
            GlStateManager._glBindFramebuffer(36009, 0);
            int $$10 = GlStateManager._getError();
            if ($$10 != 0) {
               throw new IllegalStateException("Couldn't perform copyToTexture for texture " + $$0.e() + " to " + $$1.e() + ": GL error " + $$10);
            }
         } else {
            throw new IllegalArgumentException(
               "Source texture ("
                  + $$0.a($$2)
                  + "x"
                  + $$0.b($$2)
                  + ") is not large enough to read a rectangle of "
                  + $$7
                  + "x"
                  + $$8
                  + " at "
                  + $$5
                  + "x"
                  + $$6
            );
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + $$2 + ", must be >= 0 and < " + $$0.c() + " and < " + $$1.c());
      }
   }

   @Override
   public void a(flh $$0) {
      if (this.f) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         GlStateManager._glBindFramebuffer(36008, this.d);
         GlStateManager._glFramebufferTexture2D(36008, 36064, 3553, ((fjc)$$0).b(), 0);
         GlStateManager._glBlitFrameBuffer(0, 0, $$0.a(0), $$0.b(0), 0, 0, $$0.a(0), $$0.b(0), 16384, 9728);
         GlStateManager._glBindFramebuffer(36008, 0);
      }
   }

   protected void a(fiz $$0, Collection<flb.a> $$1) {
      if (this.a($$0)) {
         for (flb.a $$2 : $$1) {
            $$0.a($$2.c(), $$2.d());
            $$0.a($$2.a(), $$2.b());
            if (fiz.b) {
               if ($$0.e == null) {
                  throw new IllegalStateException("Missing index buffer");
               }

               if ($$0.d[0] == null) {
                  throw new IllegalStateException("Missing vertex buffer at slot 0");
               }
            }

            Consumer<flb.b> $$3 = $$2.g();
            if ($$3 != null) {
               $$3.accept(($$1x, $$2x) -> {
                  fjd $$3x = $$0.c.c().a($$1x);
                  if ($$3x != null) {
                     $$3x.a($$2x);
                     $$3x.c();
                  }
               });
            }

            this.a($$0, $$2.e(), $$2.f(), $$2.d(), $$0.c);
         }
      }
   }

   protected void a(fiz $$0, int $$1, int $$2, @Nullable fls.b $$3) {
      if (this.a($$0)) {
         if (fiz.b) {
            if ($$0.e == null && $$3 != null) {
               throw new IllegalStateException("Missing index buffer");
            }

            if ($$0.d[0] == null) {
               throw new IllegalStateException("Missing vertex buffer at slot 0");
            }
         }

         this.a($$0, $$1, $$2, $$3, $$0.c);
      }
   }

   private void a(fiz $$0, int $$1, int $$2, @Nullable fls.b $$3, fja $$4) {
      this.b.m().a($$4.b().l(), (fit)$$0.d[0]);
      if ($$3 != null) {
         GlStateManager._glBindBuffer(34963, ((fit)$$0.e).f);
         GlStateManager._drawElements(GlConst.toGl($$4.b().m()), $$2, GlConst.toGl($$3), (long)$$1 * (long)$$3.c);
      } else {
         GlStateManager._drawArrays(GlConst.toGl($$4.b().m()), $$1, $$2);
      }
   }

   private boolean a(fiz $$0) {
      if (fiz.b) {
         if ($$0.c == null) {
            throw new IllegalStateException("Can't draw without a render pipeline");
         }

         if ($$0.c.c() == fiy.b) {
            throw new IllegalStateException("Pipeline contains invalid shader program");
         }

         for (fjp.c $$1 : $$0.c.b().r()) {
            Object $$2 = $$0.h.get($$1.a());
            if ($$2 == null && !fiy.a.contains($$1.a())) {
               throw new IllegalStateException("Missing uniform " + $$1.a() + " (should be " + $$1.b() + ")");
            }
         }

         for (String $$3 : $$0.c.b().q()) {
            if (!$$0.i.containsKey($$3)) {
               throw new IllegalStateException("Missing sampler " + $$3);
            }
         }

         if ($$0.c.b().s() && !$$0.a()) {
            a.warn("Render pipeline {} wants a depth texture but none was provided - this is probably a bug", $$0.c.b().k());
         }
      } else if ($$0.c == null || $$0.c.c() == fiy.b) {
         return false;
      }

      fjp $$4 = $$0.c.b();
      fiy $$5 = $$0.c.c();

      for (fjp.c $$6 : $$4.r()) {
         if ($$0.j.contains($$6.a())) {
            Object $$7 = $$0.h.get($$6.a());
            if ($$7 instanceof int[]) {
               $$5.b($$6.a()).a((int[])$$7);
            } else if ($$7 instanceof float[]) {
               $$5.b($$6.a()).a((float[])$$7);
            } else if ($$7 != null) {
               throw new IllegalStateException("Unknown uniform type - expected " + $$6.b() + ", found " + $$7);
            }
         }
      }

      $$0.j.clear();
      this.a($$4);
      boolean $$8 = this.g != $$5;
      if ($$8) {
         GlStateManager._glUseProgram($$5.b());
         this.g = $$5;
      }

      IntList $$9 = $$5.d();

      for (int $$10 = 0; $$10 < $$4.q().size(); $$10++) {
         String $$11 = $$4.q().get($$10);
         fjc $$12 = (fjc)$$0.i.get($$11);
         if ($$12 != null) {
            if ($$8 || $$0.k.contains($$11)) {
               int $$13 = $$9.getInt($$10);
               fjd.b($$13, $$10);
               RenderSystem.activeTexture(33984 + $$10);
            }

            GlStateManager._bindTexture($$12.b());
            $$12.a();
         }
      }

      fkk $$14 = frd.Q() == null ? null : frd.Q().aO();
      $$5.a(
         $$4.m(),
         RenderSystem.getModelViewMatrix(),
         RenderSystem.getProjectionMatrix(),
         $$14 == null ? 0.0F : (float)$$14.k(),
         $$14 == null ? 0.0F : (float)$$14.l()
      );

      for (fjd $$15 : $$5.e()) {
         $$15.c();
      }

      if ($$0.g.b()) {
         GlStateManager._enableScissorTest();
         GlStateManager._scissorBox($$0.g.c(), $$0.g.d(), $$0.g.e(), $$0.g.f());
      } else {
         GlStateManager._disableScissorTest();
      }

      return true;
   }

   private void a(fjp $$0) {
      if (this.e != $$0) {
         this.e = $$0;
         if ($$0.a() != fjw.a) {
            GlStateManager._enableDepthTest();
            GlStateManager._depthFunc(GlConst.toGl($$0.a()));
         } else {
            GlStateManager._disableDepthTest();
         }

         if ($$0.c()) {
            GlStateManager._enableCull();
         } else {
            GlStateManager._disableCull();
         }

         if ($$0.e().isPresent()) {
            GlStateManager._enableBlend();
            fjl $$1 = $$0.e().get();
            GlStateManager._blendFuncSeparate(GlConst.toGl($$1.a()), GlConst.toGl($$1.b()), GlConst.toGl($$1.c()), GlConst.toGl($$1.d()));
         } else {
            GlStateManager._disableBlend();
         }

         GlStateManager._polygonMode(1032, GlConst.toGl($$0.b()));
         GlStateManager._depthMask($$0.h());
         GlStateManager._colorMask($$0.f(), $$0.f(), $$0.f(), $$0.g());
         if ($$0.j() == 0.0F && $$0.i() == 0.0F) {
            GlStateManager._disablePolygonOffset();
         } else {
            GlStateManager._polygonOffset($$0.i(), $$0.j());
            GlStateManager._enablePolygonOffset();
         }

         switch ($$0.d()) {
            case a:
               GlStateManager._disableColorLogicOp();
               break;
            case b:
               GlStateManager._enableColorLogicOp();
               GlStateManager._logicOp(5387);
         }
      }
   }

   public void a() {
      this.f = false;
      GlStateManager._glBindFramebuffer(36160, 0);
   }

   protected fix b() {
      return this.b;
   }
}
