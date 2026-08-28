import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.lwjgl.opengl.ARBVertexAttribBinding;
import org.lwjgl.opengl.GLCapabilities;

public abstract class fjn {
   public static fjn a(GLCapabilities $$0, fjf $$1, Set<String> $$2) {
      if ($$0.GL_ARB_vertex_attrib_binding && fjg.a) {
         $$2.add("GL_ARB_vertex_attrib_binding");
         return new fjn.b($$1);
      } else {
         return new fjn.a($$1);
      }
   }

   public abstract void a(VertexFormat var1, fjc var2);

   static class a extends fjn {
      private final Map<VertexFormat, fjn.c> a = new HashMap<>();
      private final fjf b;

      public a(fjf $$0) {
         this.b = $$0;
      }

      @Override
      public void a(VertexFormat $$0, fjc $$1) {
         fjn.c $$2 = this.a.get($$0);
         if ($$2 == null) {
            int $$3 = GlStateManager._glGenVertexArrays();
            GlStateManager._glBindVertexArray($$3);
            GlStateManager._glBindBuffer(34962, $$1.e);
            a($$0, true);
            fjn.c $$4 = new fjn.c($$3, $$0, $$1);
            this.b.a($$4);
            this.a.put($$0, $$4);
         } else {
            GlStateManager._glBindVertexArray($$2.a);
            if ($$2.c != $$1) {
               GlStateManager._glBindBuffer(34962, $$1.e);
               $$2.c = $$1;
               a($$0, false);
            }
         }
      }

      private static void a(VertexFormat $$0, boolean $$1) {
         int $$2 = $$0.getVertexSize();
         List<VertexFormatElement> $$3 = $$0.getElements();

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            VertexFormatElement $$5 = $$3.get($$4);
            if ($$1) {
               GlStateManager._enableVertexAttribArray($$4);
            }

            switch ($$5.usage()) {
               case POSITION:
               case GENERIC:
                  GlStateManager._vertexAttribPointer($$4, $$5.count(), GlConst.toGl($$5.type()), false, $$2, (long)$$0.getOffset($$5));
                  break;
               case NORMAL:
               case COLOR:
                  GlStateManager._vertexAttribPointer($$4, $$5.count(), GlConst.toGl($$5.type()), true, $$2, (long)$$0.getOffset($$5));
                  break;
               case UV:
                  if ($$5.type() == VertexFormatElement.Type.FLOAT) {
                     GlStateManager._vertexAttribPointer($$4, $$5.count(), GlConst.toGl($$5.type()), false, $$2, (long)$$0.getOffset($$5));
                  } else {
                     GlStateManager._vertexAttribIPointer($$4, $$5.count(), GlConst.toGl($$5.type()), $$2, (long)$$0.getOffset($$5));
                  }
            }
         }
      }
   }

   static class b extends fjn {
      private final Map<VertexFormat, fjn.c> a = new HashMap<>();
      private final fjf b;

      public b(fjf $$0) {
         this.b = $$0;
      }

      @Override
      public void a(VertexFormat $$0, fjc $$1) {
         fjn.c $$2 = this.a.get($$0);
         if ($$2 == null) {
            int $$3 = GlStateManager._glGenVertexArrays();
            GlStateManager._glBindVertexArray($$3);
            ARBVertexAttribBinding.glBindVertexBuffer(0, $$1.e, 0L, $$0.getVertexSize());
            List<VertexFormatElement> $$4 = $$0.getElements();

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               VertexFormatElement $$6 = $$4.get($$5);
               GlStateManager._enableVertexAttribArray($$5);
               switch ($$6.usage()) {
                  case POSITION:
                  case GENERIC:
                     ARBVertexAttribBinding.glVertexAttribFormat($$5, $$6.count(), GlConst.toGl($$6.type()), false, $$0.getOffset($$6));
                     break;
                  case NORMAL:
                  case COLOR:
                     ARBVertexAttribBinding.glVertexAttribFormat($$5, $$6.count(), GlConst.toGl($$6.type()), true, $$0.getOffset($$6));
                     break;
                  case UV:
                     if ($$6.type() == VertexFormatElement.Type.FLOAT) {
                        ARBVertexAttribBinding.glVertexAttribFormat($$5, $$6.count(), GlConst.toGl($$6.type()), false, $$0.getOffset($$6));
                     } else {
                        ARBVertexAttribBinding.glVertexAttribIFormat($$5, $$6.count(), GlConst.toGl($$6.type()), $$0.getOffset($$6));
                     }
               }

               ARBVertexAttribBinding.glVertexAttribBinding($$5, 0);
            }

            fjn.c $$7 = new fjn.c($$3, $$0, $$1);
            this.b.a($$7);
            this.a.put($$0, $$7);
         } else {
            GlStateManager._glBindVertexArray($$2.a);
            if ($$2.c != $$1) {
               if ($$2.c != null && $$2.c.e == $$1.e) {
                  ARBVertexAttribBinding.glBindVertexBuffer(0, 0, 0L, 0);
               }

               ARBVertexAttribBinding.glBindVertexBuffer(0, $$1.e, 0L, $$0.getVertexSize());
               $$2.c = $$1;
            }
         }
      }
   }

   public static class c {
      final int a;
      final VertexFormat b;
      @Nullable
      fjc c;

      c(int $$0, VertexFormat $$1, @Nullable fjc $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
