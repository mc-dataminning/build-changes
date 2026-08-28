import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class exm extends exv {
   public static final MapCodec<exm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fao.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kf.a(mb.aO).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, exm::new)
   );
   private final fan b;
   private final Optional<ju<ddq>> c;

   exm(List<ezr> $$0, fan $$1, Optional<ju<ddq>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exx<exm> b() {
      return exy.g;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.b.a();
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      bac $$2 = $$1.b();
      ke $$3 = $$1.d().K_();
      return dds.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static exm.a a(js.a $$0, fan $$1) {
      return new exm.a($$1).a($$0.d(mb.aO).b(axn.n));
   }

   public static class a extends exv.a<exm.a> {
      private final fan a;
      private Optional<ju<ddq>> b = Optional.empty();

      public a(fan $$0) {
         this.a = $$0;
      }

      protected exm.a a() {
         return this;
      }

      public exm.a a(ju<ddq> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public exw b() {
         return new exm(this.g(), this.a, this.b);
      }
   }
}
