import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dup extends dqs implements dmd {
   public static final MapCodec<dup> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyi.q.fieldOf("color").forGetter(dup::b), t()).apply($$0, dup::new));
   private final cyi i;

   @Override
   public MapCodec<dup> a() {
      return h;
   }

   public dup(cyi $$0, ean.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(
         this.C
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cyi b() {
      return this.i;
   }
}
