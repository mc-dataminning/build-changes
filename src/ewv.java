import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ewv extends exe {
   public static final MapCodec<ewv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezx.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kg.a(mc.aO).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, ewv::new)
   );
   private final ezw b;
   private final Optional<jv<dcz>> c;

   ewv(List<eza> $$0, ezw $$1, Optional<jv<dcz>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exg<ewv> b() {
      return exh.g;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      azh $$2 = $$1.b();
      kf $$3 = $$1.d().K_();
      return ddb.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static ewv.a a(jt.a $$0, ezw $$1) {
      return new ewv.a($$1).a($$0.d(mc.aO).b(aws.n));
   }

   public static class a extends exe.a<ewv.a> {
      private final ezw a;
      private Optional<jv<dcz>> b = Optional.empty();

      public a(ezw $$0) {
         this.a = $$0;
      }

      protected ewv.a a() {
         return this;
      }

      public ewv.a a(jv<dcz> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public exf b() {
         return new ewv(this.g(), this.a, this.b);
      }
   }
}
