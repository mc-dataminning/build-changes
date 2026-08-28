import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esl extends esh {
   public static final MapCodec<esl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqs.e.fieldOf("component").forGetter($$0x -> $$0x.b), esk.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, esl::new)
   );
   private final eqr<?> b;
   private final esi c;

   private esl(List<euf> $$0, eqr<?> $$1, esi $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public esj<esl> b() {
      return esk.u;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(era $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
