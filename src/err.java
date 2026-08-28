import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class err extends erw {
   public static final MapCodec<err> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cp.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), erz.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, err::new)
   );
   private final cp b;
   private final erx c;

   private err(List<etu> $$0, cp $$1, erx $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ery<err> b() {
      return erz.v;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(eqq $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
