import com.mojang.logging.LogUtils;
import java.util.Set;
import java.util.function.Supplier;
import org.lwjgl.opengl.EXTDebugLabel;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.KHRDebug;
import org.slf4j.Logger;

public abstract class fiy {
   private static final Logger a = LogUtils.getLogger();

   public void a(fiv $$0) {
   }

   public void a(fje $$0) {
   }

   public void a(fjd $$0) {
   }

   public void a(fja $$0) {
   }

   public void a(fjg.c $$0) {
   }

   public static fiy a(GLCapabilities $$0, boolean $$1, Set<String> $$2) {
      if ($$1) {
         if ($$0.GL_KHR_debug && fiz.b) {
            $$2.add("GL_KHR_debug");
            return new fiy.a();
         }

         if ($$0.GL_EXT_debug_label && fiz.c) {
            $$2.add("GL_EXT_debug_label");
            return new fiy.c();
         }

         a.warn("Debug labels unavailable: neither KHR_debug nor EXT_debug_label are supported");
      }

      return new fiy.b();
   }

   public boolean a() {
      return false;
   }

   static class a extends fiy {
      private final int a = GL11.glGetInteger(33512);

      @Override
      public void a(fiv $$0) {
         $$0.e();
         Supplier<String> $$1 = $$0.e;
         if ($$1 != null) {
            KHRDebug.glObjectLabel(33504, $$0.f, bap.a($$1.get(), this.a, true));
         }
      }

      @Override
      public void a(fje $$0) {
         KHRDebug.glObjectLabel(5890, $$0.a, bap.a($$0.e(), this.a, true));
      }

      @Override
      public void a(fjd $$0) {
         KHRDebug.glObjectLabel(33505, $$0.b(), bap.a($$0.c(), this.a, true));
      }

      @Override
      public void a(fja $$0) {
         KHRDebug.glObjectLabel(33506, $$0.b(), bap.a($$0.c(), this.a, true));
      }

      @Override
      public void a(fjg.c $$0) {
         KHRDebug.glObjectLabel(32884, $$0.a, bap.a($$0.b.toString(), this.a, true));
      }

      @Override
      public boolean a() {
         return true;
      }
   }

   static class b extends fiy {
   }

   static class c extends fiy {
      @Override
      public void a(fiv $$0) {
         $$0.e();
         Supplier<String> $$1 = $$0.e;
         if ($$1 != null) {
            EXTDebugLabel.glLabelObjectEXT(37201, $$0.f, bap.a($$1.get(), 256, true));
         }
      }

      @Override
      public void a(fje $$0) {
         EXTDebugLabel.glLabelObjectEXT(5890, $$0.a, bap.a($$0.e(), 256, true));
      }

      @Override
      public void a(fjd $$0) {
         EXTDebugLabel.glLabelObjectEXT(35656, $$0.b(), bap.a($$0.c(), 256, true));
      }

      @Override
      public void a(fja $$0) {
         EXTDebugLabel.glLabelObjectEXT(35648, $$0.b(), bap.a($$0.c(), 256, true));
      }

      @Override
      public void a(fjg.c $$0) {
         EXTDebugLabel.glLabelObjectEXT(32884, $$0.a, bap.a($$0.b.toString(), 256, true));
      }

      @Override
      public boolean a() {
         return true;
      }
   }
}
