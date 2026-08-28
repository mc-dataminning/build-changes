import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eus extends euy {
   public static final MapCodec<eus> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(etl.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eus::new)
   );
   private final etl.b b;

   public eus(List<eww> $$0, etl.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eva<eus> b() {
      return evb.B;
   }

   @Override
   public Set<ewe<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      if ($$0.a(cvw.up) && $$1.c(this.b.a()) instanceof cnx $$2) {
         $$0.b(ks.ab, new cyv($$2.gc()));
      }

      return $$0;
   }

   public static euy.a<?> a(etl.b $$0) {
      return a($$1 -> new eus($$1, $$0));
   }
}
