import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eig extends eih {
   public static final Codec<eig> a = RecordCodecBuilder.create($$0 -> a($$0).and(egu.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eig::new));
   private final egu b;

   private eig(List<eju> $$0, egu $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eij b() {
      return eik.q;
   }

   @Override
   public Set<ejd<?>> a() {
      return this.b.a();
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static eih.a<?> a(egu $$0) {
      return a($$1 -> new eig($$1, $$0));
   }
}
