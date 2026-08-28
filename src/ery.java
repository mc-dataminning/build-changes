import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ery extends esh {
   public static final MapCodec<ery> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evc.a.fieldOf("levels").forGetter($$0x -> $$0x.b), jy.a(lr.aK).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, ery::new)
   );
   private final evb b;
   private final Optional<jn<czl>> c;

   ery(List<euf> $$0, evb $$1, Optional<jn<czl>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public esj<ery> b() {
      return esk.g;
   }

   @Override
   public Set<etn<?>> a() {
      return this.b.a();
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      ayo $$2 = $$1.b();
      jx $$3 = $$1.d().H_();
      return czn.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static ery.a a(jl.a $$0, evb $$1) {
      return new ery.a($$1).a($$0.b(lr.aK).b(avz.n));
   }

   public static class a extends esh.a<ery.a> {
      private final evb a;
      private Optional<jn<czl>> b = Optional.empty();

      public a(evb $$0) {
         this.a = $$0;
      }

      protected ery.a a() {
         return this;
      }

      public ery.a a(jn<czl> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public esi b() {
         return new ery(this.g(), this.a, this.b);
      }
   }
}
