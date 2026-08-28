import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWMonitorCallback;
import org.slf4j.Logger;

public class ezo {
   private static final Logger a = LogUtils.getLogger();
   private final Long2ObjectMap<ezl> b = new Long2ObjectOpenHashMap();
   private final ezm c;

   public ezo(ezm $$0) {
      RenderSystem.assertInInitPhase();
      this.c = $$0;
      GLFW.glfwSetMonitorCallback(this::a);
      PointerBuffer $$1 = GLFW.glfwGetMonitors();
      if ($$1 != null) {
         for (int $$2 = 0; $$2 < $$1.limit(); $$2++) {
            long $$3 = $$1.get($$2);
            this.b.put($$3, $$0.createMonitor($$3));
         }
      }
   }

   private void a(long $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      if ($$1 == 262145) {
         this.b.put($$0, this.c.createMonitor($$0));
         a.debug("Monitor {} connected. Current monitors: {}", $$0, this.b);
      } else if ($$1 == 262146) {
         this.b.remove($$0);
         a.debug("Monitor {} disconnected. Current monitors: {}", $$0, this.b);
      }
   }

   @Nullable
   public ezl a(long $$0) {
      RenderSystem.assertInInitPhase();
      return (ezl)this.b.get($$0);
   }

   @Nullable
   public ezl a(ezq $$0) {
      long $$1 = GLFW.glfwGetWindowMonitor($$0.i());
      if ($$1 != 0L) {
         return this.a($$1);
      } else {
         int $$2 = $$0.q();
         int $$3 = $$2 + $$0.m();
         int $$4 = $$0.r();
         int $$5 = $$4 + $$0.n();
         int $$6 = -1;
         ezl $$7 = null;
         long $$8 = GLFW.glfwGetPrimaryMonitor();
         a.debug("Selecting monitor - primary: {}, current monitors: {}", $$8, this.b);
         ObjectIterator var12 = this.b.values().iterator();

         while (var12.hasNext()) {
            ezl $$9 = (ezl)var12.next();
            int $$10 = $$9.c();
            int $$11 = $$10 + $$9.b().a();
            int $$12 = $$9.d();
            int $$13 = $$12 + $$9.b().b();
            int $$14 = a($$2, $$10, $$11);
            int $$15 = a($$3, $$10, $$11);
            int $$16 = a($$4, $$12, $$13);
            int $$17 = a($$5, $$12, $$13);
            int $$18 = Math.max(0, $$15 - $$14);
            int $$19 = Math.max(0, $$17 - $$16);
            int $$20 = $$18 * $$19;
            if ($$20 > $$6) {
               $$7 = $$9;
               $$6 = $$20;
            } else if ($$20 == $$6 && $$8 == $$9.f()) {
               a.debug("Primary monitor {} is preferred to monitor {}", $$9, $$7);
               $$7 = $$9;
            }
         }

         a.debug("Selected monitor: {}", $$7);
         return $$7;
      }
   }

   public static int a(int $$0, int $$1, int $$2) {
      if ($$0 < $$1) {
         return $$1;
      } else {
         return $$0 > $$2 ? $$2 : $$0;
      }
   }

   public void a() {
      RenderSystem.assertOnRenderThread();
      GLFWMonitorCallback $$0 = GLFW.glfwSetMonitorCallback(null);
      if ($$0 != null) {
         $$0.free();
      }
   }
}
