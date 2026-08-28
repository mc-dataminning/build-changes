import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fch extends fbg {
   public static final MapCodec<fch> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dcx.h.fieldOf("pages").forGetter($$0x -> $$0x.b), fbf.a.forGetter($$0x -> $$0x.c))).apply($$0, fch::new)
   );
   private final List<asi<wy>> b;
   private final fbf c;

   protected fch(List<fdc> $$0, List<asi<wy>> $$1, fbf $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected czn a(czn $$0, ezt $$1) {
      $$0.a(kk.V, dcx.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public dcx a(dcx $$0) {
      List<asi<wy>> $$1 = this.c.a($$0.a(), this.b);
      return $$0.b($$1);
   }

   @Override
   public fbi<fch> b() {
      return fbj.N;
   }
}
