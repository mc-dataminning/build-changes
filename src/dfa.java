import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfa(ju<ddq> c, bsf d) implements dey {
   public static final MapCodec<dfa> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(mb.aO).fieldOf("enchantments").forGetter(dfa::b), bsf.c.fieldOf("cost").forGetter(dfa::c)).apply($$0, dfa::new)
   );

   @Override
   public void a(cxg $$0, ddw.a $$1, bac $$2, bsy $$3) {
      for (ddt $$5 : dds.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dfa> a() {
      return b;
   }

   public ju<ddq> b() {
      return this.c;
   }

   public bsf c() {
      return this.d;
   }
}
