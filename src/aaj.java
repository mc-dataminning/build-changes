import io.netty.buffer.ByteBuf;
import java.util.List;

public record aaj(ajs<? extends iy<?>> b, List<jc.a> c) implements yn<aah> {
   private static final ye<ByteBuf, ajs<? extends iy<?>>> d = ajt.b.a(ajs::a, ajs::a);
   public static final ye<vg, aaj> a = ye.a(d, aaj::b, jc.a.a.a(yc.a()), aaj::e, aaj::new);

   @Override
   public yp<aaj> a() {
      return aam.b;
   }

   public void a(aah $$0) {
      $$0.a(this);
   }

   public List<jc.a> e() {
      return this.c;
   }
}
