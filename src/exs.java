import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class exs extends eyb {
   public static final MapCodec<exs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fau.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kg.a(mc.aP).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, exs::new)
   );
   private final fat b;
   private final Optional<jv<ddr>> c;

   exs(List<ezx> $$0, fat $$1, Optional<jv<ddr>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eyd<exs> b() {
      return eye.g;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      azh $$2 = $$1.b();
      kf $$3 = $$1.d().F_();
      return ddt.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static exs.a a(jt.a $$0, fat $$1) {
      return new exs.a($$1).a($$0.d(mc.aP).b(aws.n));
   }

   public static class a extends eyb.a<exs.a> {
      private final fat a;
      private Optional<jv<ddr>> b = Optional.empty();

      public a(fat $$0) {
         this.a = $$0;
      }

      protected exs.a a() {
         return this;
      }

      public exs.a a(jv<ddr> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public eyc b() {
         return new exs(this.g(), this.a, this.b);
      }
   }
}
