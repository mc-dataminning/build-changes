import io.netty.buffer.ByteBuf;
import java.util.List;

public record abb(alc<? extends kf<?>> b, List<kj.a> c) implements zc<aaz> {
   private static final yt<ByteBuf, alc<? extends kf<?>>> d = ald.b.a(alc::a, alc::a);
   public static final yt<vr, abb> a = yt.a(d, abb::b, kj.a.a.a(yr.a()), abb::e, abb::new);

   @Override
   public ze<abb> a() {
      return abf.b;
   }

   public void a(aaz $$0) {
      $$0.a(this);
   }

   public List<kj.a> e() {
      return this.c;
   }
}
