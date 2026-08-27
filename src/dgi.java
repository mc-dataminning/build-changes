import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgi extends ddy {
   public static final MapCodec<dgi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(boz.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dgi::new)
   );
   private final boz b;

   @Override
   public MapCodec<? extends dgi> a() {
      return a;
   }

   public dgi(boz $$0, dra.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, cto $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
