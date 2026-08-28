import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewe extends ewa {
   public static final MapCodec<ewe> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eul.e.fieldOf("component").forGetter($$0x -> $$0x.b), ewd.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, ewe::new)
   );
   private final euk<?> b;
   private final ewb c;

   private ewe(List<exy> $$0, euk<?> $$1, ewb $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ewc<ewe> b() {
      return ewd.u;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(eut $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
