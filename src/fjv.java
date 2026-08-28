import java.util.List;
import javax.annotation.Nullable;

public class fjv implements fmh {
   private static final int a = 170;
   private final wz b;
   @Nullable
   private List<aya> c;
   @Nullable
   private tw d;
   @Nullable
   private final wz e;

   private fjv(wz $$0, @Nullable wz $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fjv a(wz $$0, @Nullable wz $$1) {
      return new fjv($$0, $$1);
   }

   public static fjv a(wz $$0) {
      return new fjv($$0, $$0);
   }

   @Override
   public void b(fmg $$0) {
      if (this.e != null) {
         $$0.a(fmf.c, this.e);
      }
   }

   public List<aya> a(fgm $$0) {
      tw $$1 = tw.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<aya> a(fgm $$0, wz $$1) {
      return $$0.h.c($$1, 170);
   }
}
