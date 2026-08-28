import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esn extends esj {
   public static final MapCodec<esn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(equ.e.fieldOf("component").forGetter($$0x -> $$0x.b), esm.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, esn::new)
   );
   private final eqt<?> b;
   private final esk c;

   private esn(List<euh> $$0, eqt<?> $$1, esk $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public esl<esn> b() {
      return esm.u;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(erc $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
