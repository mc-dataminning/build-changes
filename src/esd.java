import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esd extends esj {
   public static final MapCodec<esd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eqw.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, esd::new)
   );
   private final eqw.b b;

   public esd(List<euh> $$0, eqw.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esl<esd> b() {
      return esm.B;
   }

   @Override
   public Set<etp<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      if ($$0.a(cug.un) && $$1.c(this.b.a()) instanceof cml $$2) {
         $$0.b(kn.V, new cxe($$2.fZ()));
      }

      return $$0;
   }

   public static esj.a<?> a(eqw.b $$0) {
      return a($$1 -> new esd($$1, $$0));
   }
}
