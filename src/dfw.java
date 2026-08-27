import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfw extends czo {
   public static final MapCodec<dfw> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dno.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dfw::new)
   );
   public static final dnq f = dnp.w;

   @Override
   public MapCodec<dfw> a() {
      return e;
   }

   protected dfw(dno $$0, dmy.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dmz $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dmz a(dmz $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cwz $$0, ib $$1) {
      Class<? extends bow> $$2 = switch (this.d.f()) {
         case a -> bow.class;
         case b -> bpo.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(f);
   }
}
