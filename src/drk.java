import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drk extends dnp implements djd {
   public static final MapCodec<drk> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvm.q.fieldOf("color").forGetter(drk::b), t()).apply($$0, drk::new));
   private final cvm k;

   @Override
   public MapCodec<drk> a() {
      return j;
   }

   public drk(cvm $$0, dww.d $$1) {
      super($$1);
      this.k = $$0;
      this.l(
         this.F
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cvm b() {
      return this.k;
   }
}
