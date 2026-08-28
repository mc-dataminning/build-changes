import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class eyp extends eyy {
   public static final MapCodec<eyp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fbr.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kh.a(me.aS).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, eyp::new)
   );
   private final fbq b;
   private final Optional<jw<deh>> c;

   eyp(List<fau> $$0, fbq $$1, Optional<jw<deh>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eza<eyp> b() {
      return ezb.g;
   }

   @Override
   public Set<bat<?>> a() {
      return this.b.a();
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      azs $$2 = $$1.b();
      kg $$3 = $$1.d().F_();
      return dej.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static eyp.a a(ju.a $$0, fbq $$1) {
      return new eyp.a($$1).a($$0.e(me.aS).b(axc.n));
   }

   public static class a extends eyy.a<eyp.a> {
      private final fbq a;
      private Optional<jw<deh>> b = Optional.empty();

      public a(fbq $$0) {
         this.a = $$0;
      }

      protected eyp.a a() {
         return this;
      }

      public eyp.a a(jw<deh> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public eyz b() {
         return new eyp(this.g(), this.a, this.b);
      }
   }
}
