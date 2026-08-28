import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class euw extends euy {
   public static final MapCodec<euw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(etk.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, euw::new));
   private final etk b;

   private euw(List<eww> $$0, etk $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eva<euw> b() {
      return evb.w;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.b.a();
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      int $$2 = this.b.a($$1, $$0.K());
      $$0.e($$2);
      return $$0;
   }

   public static euy.a<?> a(etk $$0) {
      return a($$1 -> new euw($$1, $$0));
   }
}
