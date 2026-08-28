import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class eww extends exf {
   public static final MapCodec<eww> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezy.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kg.a(mc.aO).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, eww::new)
   );
   private final ezx b;
   private final Optional<jv<dda>> c;

   eww(List<ezb> $$0, ezx $$1, Optional<jv<dda>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exh<eww> b() {
      return exi.g;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      azh $$2 = $$1.b();
      kf $$3 = $$1.d().K_();
      return ddc.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static eww.a a(jt.a $$0, ezx $$1) {
      return new eww.a($$1).a($$0.d(mc.aO).b(aws.n));
   }

   public static class a extends exf.a<eww.a> {
      private final ezx a;
      private Optional<jv<dda>> b = Optional.empty();

      public a(ezx $$0) {
         this.a = $$0;
      }

      protected eww.a a() {
         return this;
      }

      public eww.a a(jv<dda> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public exg b() {
         return new eww(this.g(), this.a, this.b);
      }
   }
}
