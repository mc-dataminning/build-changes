import java.util.List;
import javax.annotation.Nullable;

public record aen(int b, List<csg.a> c) implements aac<acr> {
   public static final zt<ws, aen> a = zt.a(zr.h, aen::b, csg.a.a.a(zr.a()), aen::e, aen::new);

   @Override
   public aae<aen> a() {
      return ahk.T;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   @Nullable
   public bvf a(dha $$0) {
      return $$0.a(this.b);
   }

   public List<csg.a> e() {
      return this.c;
   }
}
