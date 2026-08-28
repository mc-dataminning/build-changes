import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dja extends diz {
   public static final MapCodec<dja> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lp.e.q().fieldOf("host").forGetter(diz::b), u()).apply($$0, dja::new));

   @Override
   public MapCodec<dja> a() {
      return b;
   }

   public dja(dfa $$0, dsc.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dlm.i, je.a.b));
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return dlm.b($$0, $$1);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(dlm.i);
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(dlm.i, $$0.k().o());
   }
}
