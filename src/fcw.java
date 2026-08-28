import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcw extends fbw {
   public static final MapCodec<fcw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(ddj.d.fieldOf("pages").forGetter($$0x -> $$0x.b), fbv.a(100).forGetter($$0x -> $$0x.c))).apply($$0, fcw::new)
   );
   private final List<asm<String>> b;
   private final fbv c;

   protected fcw(List<fds> $$0, List<asm<String>> $$1, fbv $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected daa a(daa $$0, faj $$1) {
      $$0.a(kl.U, ddj.a, this::a);
      return $$0;
   }

   public ddj a(ddj $$0) {
      List<asm<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public fby<fcw> b() {
      return fbz.O;
   }
}
