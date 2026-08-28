import java.util.List;
import javax.annotation.Nullable;

public class frb implements fto {
   private static final int a = 170;
   private final wp b;
   @Nullable
   private List<ayl> c;
   @Nullable
   private tl d;
   @Nullable
   private final wp e;

   private frb(wp $$0, @Nullable wp $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static frb a(wp $$0, @Nullable wp $$1) {
      return new frb($$0, $$1);
   }

   public static frb a(wp $$0) {
      return new frb($$0, $$0);
   }

   @Override
   public void b(ftn $$0) {
      if (this.e != null) {
         $$0.a(ftm.c, this.e);
      }
   }

   public List<ayl> a(fmg $$0) {
      tl $$1 = tl.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<ayl> a(fmg $$0, wp $$1) {
      return $$0.h.c($$1, 170);
   }
}
