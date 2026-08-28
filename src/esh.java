import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esh extends esj {
   public static final MapCodec<esh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eqv.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, esh::new));
   private final eqv b;

   private esh(List<euh> $$0, eqv $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esl<esh> b() {
      return esm.w;
   }

   @Override
   public Set<etp<?>> a() {
      return this.b.a();
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      int $$2 = this.b.a($$1, $$0.H());
      $$0.e($$2);
      return $$0;
   }

   public static esj.a<?> a(eqv $$0) {
      return a($$1 -> new esh($$1, $$0));
   }
}
