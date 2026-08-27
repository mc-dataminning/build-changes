import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czy extends czx {
   public static final MapCodec<czy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kb.e.q().fieldOf("host").forGetter(czx::b), u()).apply($$0, czy::new));

   @Override
   public MapCodec<czy> a() {
      return b;
   }

   public czy(cvz $$0, dio.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dck.i, ia.a.b));
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return dck.b($$0, $$1);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(dck.i);
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(dck.i, $$0.k().o());
   }
}
