import io.netty.buffer.ByteBuf;
import java.util.List;

public record abg(alh<? extends js<?>> b, List<jw.a> c) implements zh<abe> {
   private static final yy<ByteBuf, alh<? extends js<?>>> d = ali.b.a(alh::a, alh::a);
   public static final yy<vw, abg> a = yy.a(d, abg::b, jw.a.a.a(yw.a()), abg::e, abg::new);

   @Override
   public zj<abg> a() {
      return abk.b;
   }

   public void a(abe $$0) {
      $$0.a(this);
   }

   public List<jw.a> e() {
      return this.c;
   }
}
