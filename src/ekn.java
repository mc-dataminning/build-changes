import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ekn extends eko {
   public static final Codec<ekn> a = RecordCodecBuilder.create($$0 -> a($$0).and(ejb.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, ekn::new));
   private final ejb b;

   private ekn(List<emb> $$0, ejb $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ekq b() {
      return ekr.q;
   }

   @Override
   public Set<elk<?>> a() {
      return this.b.a();
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.f($$2);
      return $$0;
   }

   public static eko.a<?> a(ejb $$0) {
      return a($$1 -> new ekn($$1, $$0));
   }
}
