import com.mojang.logging.LogUtils;
import java.util.Set;
import java.util.function.Supplier;
import org.lwjgl.opengl.EXTDebugLabel;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.KHRDebug;
import org.slf4j.Logger;

public abstract class fjf {
   private static final Logger a = LogUtils.getLogger();

   public void a(fjc $$0) {
   }

   public void a(fjl $$0) {
   }

   public void a(fjk $$0) {
   }

   public void a(fjh $$0) {
   }

   public void a(fjn.c $$0) {
   }

   public static fjf a(GLCapabilities $$0, boolean $$1, Set<String> $$2) {
      if ($$1) {
         if ($$0.GL_KHR_debug && fjg.b) {
            $$2.add("GL_KHR_debug");
            return new fjf.a();
         }

         if ($$0.GL_EXT_debug_label && fjg.c) {
            $$2.add("GL_EXT_debug_label");
            return new fjf.c();
         }

         a.warn("Debug labels unavailable: neither KHR_debug nor EXT_debug_label are supported");
      }

      return new fjf.b();
   }

   public boolean a() {
      return false;
   }

   static class a extends fjf {
      private final int a = GL11.glGetInteger(33512);

      @Override
      public void a(fjc $$0) {
         $$0.a();
         Supplier<String> $$1 = $$0.d;
         if ($$1 != null) {
            KHRDebug.glObjectLabel(33504, $$0.e, bay.a($$1.get(), this.a, true));
         }
      }

      @Override
      public void a(fjl $$0) {
         KHRDebug.glObjectLabel(5890, $$0.a, bay.a($$0.getLabel(), this.a, true));
      }

      @Override
      public void a(fjk $$0) {
         KHRDebug.glObjectLabel(33505, $$0.b(), bay.a($$0.c(), this.a, true));
      }

      @Override
      public void a(fjh $$0) {
         KHRDebug.glObjectLabel(33506, $$0.b(), bay.a($$0.c(), this.a, true));
      }

      @Override
      public void a(fjn.c $$0) {
         KHRDebug.glObjectLabel(32884, $$0.a, bay.a($$0.b.toString(), this.a, true));
      }

      @Override
      public boolean a() {
         return true;
      }
   }

   static class b extends fjf {
   }

   static class c extends fjf {
      @Override
      public void a(fjc $$0) {
         $$0.a();
         Supplier<String> $$1 = $$0.d;
         if ($$1 != null) {
            EXTDebugLabel.glLabelObjectEXT(37201, $$0.e, bay.a($$1.get(), 256, true));
         }
      }

      @Override
      public void a(fjl $$0) {
         EXTDebugLabel.glLabelObjectEXT(5890, $$0.a, bay.a($$0.getLabel(), 256, true));
      }

      @Override
      public void a(fjk $$0) {
         EXTDebugLabel.glLabelObjectEXT(35656, $$0.b(), bay.a($$0.c(), 256, true));
      }

      @Override
      public void a(fjh $$0) {
         EXTDebugLabel.glLabelObjectEXT(35648, $$0.b(), bay.a($$0.c(), 256, true));
      }

      @Override
      public void a(fjn.c $$0) {
         EXTDebugLabel.glLabelObjectEXT(32884, $$0.a, bay.a($$0.b.toString(), 256, true));
      }

      @Override
      public boolean a() {
         return true;
      }
   }
}
