import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class fas extends fbb {
   public static final MapCodec<fas> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fdu.a.fieldOf("levels").forGetter($$0x -> $$0x.b), ju.a(mh.aR).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, fas::new)
   );
   private final fdt b;
   private final Optional<jj<dfx>> c;

   fas(List<fcx> $$0, fdt $$1, Optional<jj<dfx>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fbd<fas> b() {
      return fbe.g;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      azv $$2 = $$1.b();
      jt $$3 = $$1.d().F_();
      return dfz.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static fas.a a(jh.a $$0, fdt $$1) {
      return new fas.a($$1).a($$0.e(mh.aR).b(axe.n));
   }

   public static class a extends fbb.a<fas.a> {
      private final fdt a;
      private Optional<jj<dfx>> b = Optional.empty();

      public a(fdt $$0) {
         this.a = $$0;
      }

      protected fas.a a() {
         return this;
      }

      public fas.a a(jj<dfx> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public fbc b() {
         return new fas(this.g(), this.a, this.b);
      }
   }
}
