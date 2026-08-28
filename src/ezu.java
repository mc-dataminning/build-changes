import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ezu extends faa {
   public static final MapCodec<ezu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eyn.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, ezu::new)
   );
   private final eyn.b b;

   public ezu(List<fbw> $$0, eyn.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fac<ezu> b() {
      return fad.B;
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      if ($$0.a(cyw.vq) && $$1.c(this.b.a()) instanceof cqs $$2) {
         $$0.b(kj.ak, new dbs($$2.gh()));
      }

      return $$0;
   }

   public static faa.a<?> a(eyn.b $$0) {
      return a($$1 -> new ezu($$1, $$0));
   }
}
