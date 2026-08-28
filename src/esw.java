import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esw extends esj {
   static final MapCodec<esw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eve.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, esw::new));
   private final evd b;

   private esw(List<euh> $$0, evd $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<etp<?>> a() {
      return this.b.a();
   }

   @Override
   public esl<esw> b() {
      return esm.R;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      $$0.b(kn.o, new cws(this.b.a($$1)));
      return $$0;
   }
}
