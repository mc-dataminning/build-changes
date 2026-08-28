import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class esa extends esj {
   public static final MapCodec<esa> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eve.a.fieldOf("levels").forGetter($$0x -> $$0x.b), jy.a(lr.aK).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, esa::new)
   );
   private final evd b;
   private final Optional<jn<czm>> c;

   esa(List<euh> $$0, evd $$1, Optional<jn<czm>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public esl<esa> b() {
      return esm.g;
   }

   @Override
   public Set<etp<?>> a() {
      return this.b.a();
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      ayo $$2 = $$1.b();
      jx $$3 = $$1.d().H_();
      return czo.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static esa.a a(jl.a $$0, evd $$1) {
      return new esa.a($$1).a($$0.b(lr.aK).b(avz.n));
   }

   public static class a extends esj.a<esa.a> {
      private final evd a;
      private Optional<jn<czm>> b = Optional.empty();

      public a(evd $$0) {
         this.a = $$0;
      }

      protected esa.a a() {
         return this;
      }

      public esa.a a(jn<czm> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public esk b() {
         return new esa(this.g(), this.a, this.b);
      }
   }
}
