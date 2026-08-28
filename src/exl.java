import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class exl extends exu {
   public static final MapCodec<exl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fap.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kf.a(mb.aN).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, exl::new)
   );
   private final fao b;
   private final Optional<ju<ddr>> c;

   exl(List<ezs> $$0, fao $$1, Optional<ju<ddr>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exw<exl> b() {
      return exx.g;
   }

   @Override
   public Set<eza<?>> a() {
      return this.b.a();
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      bam $$2 = $$1.b();
      ke $$3 = $$1.d().K_();
      return ddt.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static exl.a a(js.a $$0, fao $$1) {
      return new exl.a($$1).a($$0.d(mb.aN).b(axx.n));
   }

   public static class a extends exu.a<exl.a> {
      private final fao a;
      private Optional<ju<ddr>> b = Optional.empty();

      public a(fao $$0) {
         this.a = $$0;
      }

      protected exl.a a() {
         return this;
      }

      public exl.a a(ju<ddr> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public exv b() {
         return new exl(this.g(), this.a, this.b);
      }
   }
}
