import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esu extends esh {
   static final MapCodec<esu> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(evc.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, esu::new));
   private final evb b;

   private esu(List<euf> $$0, evb $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<etn<?>> a() {
      return this.b.a();
   }

   @Override
   public esj<esu> b() {
      return esk.R;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      $$0.b(kn.o, new cwr(this.b.a($$1)));
      return $$0;
   }
}
