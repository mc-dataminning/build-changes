import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddz extends ddy {
   public static final MapCodec<ddz> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ki.e.q().fieldOf("host").forGetter(ddy::b), u()).apply($$0, ddz::new));

   @Override
   public MapCodec<ddz> a() {
      return b;
   }

   public ddz(daa $$0, dmy.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dgl.i, ih.a.b));
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return dgl.b($$0, $$1);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(dgl.i);
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(dgl.i, $$0.k().o());
   }
}
