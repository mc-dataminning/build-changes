import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcg extends fbg {
   public static final MapCodec<fcg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dcw.d.fieldOf("pages").forGetter($$0x -> $$0x.b), fbf.a(100).forGetter($$0x -> $$0x.c))).apply($$0, fcg::new)
   );
   private final List<asi<String>> b;
   private final fbf c;

   protected fcg(List<fdc> $$0, List<asi<String>> $$1, fbf $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected czn a(czn $$0, ezt $$1) {
      $$0.a(kk.U, dcw.a, this::a);
      return $$0;
   }

   public dcw a(dcw $$0) {
      List<asi<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public fbi<fcg> b() {
      return fbj.O;
   }
}
