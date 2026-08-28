import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ewu extends exd {
   public static final MapCodec<ewu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezw.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kg.a(mc.aO).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, ewu::new)
   );
   private final ezv b;
   private final Optional<jv<dcy>> c;

   ewu(List<eyz> $$0, ezv $$1, Optional<jv<dcy>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exf<ewu> b() {
      return exg.g;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      azh $$2 = $$1.b();
      kf $$3 = $$1.d().K_();
      return dda.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static ewu.a a(jt.a $$0, ezv $$1) {
      return new ewu.a($$1).a($$0.d(mc.aO).b(aws.n));
   }

   public static class a extends exd.a<ewu.a> {
      private final ezv a;
      private Optional<jv<dcy>> b = Optional.empty();

      public a(ezv $$0) {
         this.a = $$0;
      }

      protected ewu.a a() {
         return this;
      }

      public ewu.a a(jv<dcy> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public exe b() {
         return new ewu(this.g(), this.a, this.b);
      }
   }
}
