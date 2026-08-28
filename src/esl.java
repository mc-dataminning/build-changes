import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esl extends ers {
   public static final MapCodec<esl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eum.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, esl::new)
   );
   private final eul b;
   private final boolean c;

   private esl(List<etq> $$0, eul $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eru<esl> b() {
      return erv.e;
   }

   @Override
   public Set<esz<?>> a() {
      return this.b.a();
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      int $$2 = this.c ? $$0.I() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static ers.a<?> a(eul $$0) {
      return a($$1 -> new esl($$1, $$0, false));
   }

   public static ers.a<?> a(eul $$0, boolean $$1) {
      return a($$2 -> new esl($$2, $$0, $$1));
   }
}
