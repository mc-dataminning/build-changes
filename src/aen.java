import java.util.List;
import javax.annotation.Nullable;

public record aen(int b, List<csl.a> c) implements aac<acr> {
   public static final zt<ws, aen> a = zt.a(zr.h, aen::b, csl.a.a.a(zr.a()), aen::e, aen::new);

   @Override
   public aae<aen> a() {
      return ahk.T;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   @Nullable
   public bvk a(dhi $$0) {
      return $$0.a(this.b);
   }

   public List<csl.a> e() {
      return this.c;
   }
}
