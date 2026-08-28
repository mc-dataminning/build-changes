import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class diz extends diy {
   public static final MapCodec<diz> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lp.e.q().fieldOf("host").forGetter(diy::b), u()).apply($$0, diz::new));

   @Override
   public MapCodec<diz> a() {
      return b;
   }

   public diz(dez $$0, dsb.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dll.i, je.a.b));
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return dll.b($$0, $$1);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(dll.i);
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(dll.i, $$0.k().o());
   }
}
