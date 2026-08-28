import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fjn extends fjq {
   public static final int a = 854;
   public static final int b = 480;
   static final fjn.a l = new fjn.a(854, 480);

   public fjn(int $$0, int $$1) {
      super("Main", true);
      this.c($$0, $$1);
   }

   private void c(int $$0, int $$1) {
      fjn.a $$2 = this.d($$0, $$1);
      if (this.i != null && this.j != null) {
         this.i.a(flg.a, false);
         this.i.a(flf.b);
         this.i.a(flg.a, false);
         this.i.a(flf.b);
         this.e = $$2.a;
         this.f = $$2.b;
         this.c = $$2.a;
         this.d = $$2.b;
      } else {
         throw new IllegalStateException("Missing color and/or depth textures");
      }
   }

   private fjn.a d(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();

      for (fjn.a $$2 : fjn.a.a($$0, $$1)) {
         if (this.i != null) {
            this.i.close();
            this.i = null;
         }

         if (this.j != null) {
            this.j.close();
            this.j = null;
         }

         this.i = this.a($$2);
         this.j = this.b($$2);
         if (this.i != null && this.j != null) {
            return $$2;
         }
      }

      throw new RuntimeException(
         "Unrecoverable GL_OUT_OF_MEMORY ("
            + (this.i == null ? "missing color" : "have color")
            + ", "
            + (this.j == null ? "missing depth" : "have depth")
            + ")"
      );
   }

   @Nullable
   private flh a(fjn.a $$0) {
      try {
         return RenderSystem.getDevice().a(() -> this.g + " / Color", fli.a, $$0.a, $$0.b, 1);
      } catch (fhs var3) {
         return null;
      }
   }

   @Nullable
   private flh b(fjn.a $$0) {
      try {
         return RenderSystem.getDevice().a(() -> this.g + " / Depth", fli.c, $$0.a, $$0.b, 1);
      } catch (fhs var3) {
         return null;
      }
   }

   static class a {
      public final int a;
      public final int b;

      a(int $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      static List<fjn.a> a(int $$0, int $$1) {
         RenderSystem.assertOnRenderThread();
         int $$2 = RenderSystem.getDevice().j();
         return $$0 > 0 && $$0 <= $$2 && $$1 > 0 && $$1 <= $$2 ? ImmutableList.of(new fjn.a($$0, $$1), fjn.l) : ImmutableList.of(fjn.l);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            fjn.a $$1 = (fjn.a)$$0;
            return this.a == $$1.a && this.b == $$1.b;
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.a, this.b);
      }

      @Override
      public String toString() {
         return this.a + "x" + this.b;
      }
   }
}
