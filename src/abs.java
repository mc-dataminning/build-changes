import io.netty.buffer.ByteBuf;
import java.util.List;

public record abs(ale<? extends jv<?>> b, List<jz.a> c) implements zw<abq> {
   private static final zn<ByteBuf, ale<? extends jv<?>>> d = alf.b.a(ale::a, ale::a);
   public static final zn<wm, abs> a = zn.a(d, abs::b, jz.a.a.a(zl.a()), abs::e, abs::new);

   @Override
   public zy<abs> a() {
      return abw.b;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public List<jz.a> e() {
      return this.c;
   }
}
