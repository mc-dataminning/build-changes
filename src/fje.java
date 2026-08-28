import com.mojang.blaze3d.platform.GlConst;
import com.mojang.blaze3d.platform.GlStateManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.lwjgl.opengl.ARBVertexAttribBinding;
import org.lwjgl.opengl.GLCapabilities;

public abstract class fje {
   public static fje a(GLCapabilities $$0, fiw $$1) {
      return (fje)($$0.GL_ARB_vertex_attrib_binding ? new fje.b($$1) : new fje.a($$1));
   }

   public abstract void a(fls var1, fit var2);

   static class a extends fje {
      private final Map<fls, fje.c> a = new HashMap<>();
      private final fiw b;

      public a(fiw $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fls $$0, fit $$1) {
         fje.c $$2 = this.a.get($$0);
         if ($$2 == null) {
            int $$3 = GlStateManager._glGenVertexArrays();
            GlStateManager._glBindVertexArray($$3);
            GlStateManager._glBindBuffer(34962, $$1.f);
            a($$0, true);
            fje.c $$4 = new fje.c($$3, $$0, $$1);
            this.b.a($$4);
            this.a.put($$0, $$4);
         } else {
            GlStateManager._glBindVertexArray($$2.a);
            if ($$2.c != $$1) {
               GlStateManager._glBindBuffer(34962, $$1.f);
               $$2.c = $$1;
               a($$0, false);
            }
         }
      }

      private static void a(fls $$0, boolean $$1) {
         int $$2 = $$0.b();
         List<flt> $$3 = $$0.c();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            flt $$5 = $$3.get($$4);
            if ($$1) {
               GlStateManager._enableVertexAttribArray($$4);
            }

            switch ($$5.f()) {
               case a:
               case e:
                  GlStateManager._vertexAttribPointer($$4, $$5.g(), GlConst.toGl($$5.e()), false, $$2, (long)$$0.a($$5));
                  break;
               case b:
               case c:
                  GlStateManager._vertexAttribPointer($$4, $$5.g(), GlConst.toGl($$5.e()), true, $$2, (long)$$0.a($$5));
                  break;
               case d:
                  if ($$5.e() == flt.a.a) {
                     GlStateManager._vertexAttribPointer($$4, $$5.g(), GlConst.toGl($$5.e()), true, $$2, (long)$$0.a($$5));
                  } else {
                     GlStateManager._vertexAttribIPointer($$4, $$5.g(), GlConst.toGl($$5.e()), $$2, (long)$$0.a($$5));
                  }
            }
         }
      }
   }

   static class b extends fje {
      private final Map<fls, fje.c> a = new HashMap<>();
      private final fiw b;

      public b(fiw $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fls $$0, fit $$1) {
         fje.c $$2 = this.a.get($$0);
         if ($$2 == null) {
            int $$3 = GlStateManager._glGenVertexArrays();
            GlStateManager._glBindVertexArray($$3);
            ARBVertexAttribBinding.glBindVertexBuffer(0, $$1.f, 0L, $$0.b());
            List<flt> $$4 = $$0.c();

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               flt $$6 = $$4.get($$5);
               GlStateManager._enableVertexAttribArray($$5);
               switch ($$6.f()) {
                  case a:
                  case e:
                     ARBVertexAttribBinding.glVertexAttribFormat($$5, $$6.g(), GlConst.toGl($$6.e()), false, $$0.a($$6));
                     break;
                  case b:
                  case c:
                     ARBVertexAttribBinding.glVertexAttribFormat($$5, $$6.g(), GlConst.toGl($$6.e()), true, $$0.a($$6));
                     break;
                  case d:
                     if ($$6.e() == flt.a.a) {
                        ARBVertexAttribBinding.glVertexAttribFormat($$5, $$6.g(), GlConst.toGl($$6.e()), true, $$0.a($$6));
                     } else {
                        ARBVertexAttribBinding.glVertexAttribIFormat($$5, $$6.g(), GlConst.toGl($$6.e()), $$0.a($$6));
                     }
               }

               ARBVertexAttribBinding.glVertexAttribBinding($$5, 0);
            }

            fje.c $$7 = new fje.c($$3, $$0, $$1);
            this.b.a($$7);
            this.a.put($$0, $$7);
         } else {
            GlStateManager._glBindVertexArray($$2.a);
            if ($$2.c != $$1) {
               ARBVertexAttribBinding.glBindVertexBuffer(0, $$1.f, 0L, $$0.b());
               $$2.c = $$1;
            }
         }
      }
   }

   public static class c {
      final int a;
      final fls b;
      @Nullable
      fit c;

      c(int $$0, fls $$1, @Nullable fit $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
