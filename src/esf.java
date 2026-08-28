import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esf extends esh {
   public static final MapCodec<esf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eqt.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, esf::new));
   private final eqt b;

   private esf(List<euf> $$0, eqt $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esj<esf> b() {
      return esk.w;
   }

   @Override
   public Set<etn<?>> a() {
      return this.b.a();
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      int $$2 = this.b.a($$1, $$0.H());
      $$0.e($$2);
      return $$0;
   }

   public static esh.a<?> a(eqt $$0) {
      return a($$1 -> new esf($$1, $$0));
   }
}
