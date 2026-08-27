import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Locale;
import javax.annotation.Nullable;

public class epk {
   @Nullable
   private static epk a;
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final int f;
   private final boolean g;
   private final boolean h;

   private epk(boolean $$0, boolean $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      this.g = $$0;
      this.b = $$2;
      this.d = $$3;
      this.c = $$4;
      this.e = $$5;
      this.h = $$1;
      this.f = $$6;
   }

   public epk() {
      this(false, true, 1, 0, 1, 0, 32774);
   }

   public epk(int $$0, int $$1, int $$2) {
      this(false, false, $$0, $$1, $$0, $$1, $$2);
   }

   public epk(int $$0, int $$1, int $$2, int $$3, int $$4) {
      this(true, false, $$0, $$1, $$2, $$3, $$4);
   }

   public void a() {
      if (!this.equals(a)) {
         if (a == null || this.h != a.b()) {
            a = this;
            if (this.h) {
               RenderSystem.disableBlend();
               return;
            }

            RenderSystem.enableBlend();
         }

         RenderSystem.blendEquation(this.f);
         if (this.g) {
            RenderSystem.blendFuncSeparate(this.b, this.d, this.c, this.e);
         } else {
            RenderSystem.blendFunc(this.b, this.d);
         }
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof epk $$1)) {
         return false;
      } else if (this.f != $$1.f) {
         return false;
      } else if (this.e != $$1.e) {
         return false;
      } else if (this.d != $$1.d) {
         return false;
      } else if (this.h != $$1.h) {
         return false;
      } else if (this.g != $$1.g) {
         return false;
      } else {
         return this.c != $$1.c ? false : this.b == $$1.b;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b;
      $$0 = 31 * $$0 + this.c;
      $$0 = 31 * $$0 + this.d;
      $$0 = 31 * $$0 + this.e;
      $$0 = 31 * $$0 + this.f;
      $$0 = 31 * $$0 + (this.g ? 1 : 0);
      return 31 * $$0 + (this.h ? 1 : 0);
   }

   public boolean b() {
      return this.h;
   }

   public static int a(String $$0) {
      String $$1 = $$0.trim().toLowerCase(Locale.ROOT);
      if ("add".equals($$1)) {
         return 32774;
      } else if ("subtract".equals($$1)) {
         return 32778;
      } else if ("reversesubtract".equals($$1)) {
         return 32779;
      } else if ("reverse_subtract".equals($$1)) {
         return 32779;
      } else if ("min".equals($$1)) {
         return 32775;
      } else {
         return "max".equals($$1) ? 32776 : 32774;
      }
   }

   public static int b(String $$0) {
      String $$1 = $$0.trim().toLowerCase(Locale.ROOT);
      $$1 = $$1.replaceAll("_", "");
      $$1 = $$1.replaceAll("one", "1");
      $$1 = $$1.replaceAll("zero", "0");
      $$1 = $$1.replaceAll("minus", "-");
      if ("0".equals($$1)) {
         return 0;
      } else if ("1".equals($$1)) {
         return 1;
      } else if ("srccolor".equals($$1)) {
         return 768;
      } else if ("1-srccolor".equals($$1)) {
         return 769;
      } else if ("dstcolor".equals($$1)) {
         return 774;
      } else if ("1-dstcolor".equals($$1)) {
         return 775;
      } else if ("srcalpha".equals($$1)) {
         return 770;
      } else if ("1-srcalpha".equals($$1)) {
         return 771;
      } else if ("dstalpha".equals($$1)) {
         return 772;
      } else {
         return "1-dstalpha".equals($$1) ? 773 : -1;
      }
   }
}
