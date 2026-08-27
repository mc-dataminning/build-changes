import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dko extends dej implements ded {
   public static final MapCodec<dko> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqs.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dko::new)
   );
   public static final dsd f = drt.aU;
   protected static final float g = 6.0F;
   protected static final evf h = dea.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dqs i;

   @Override
   public MapCodec<? extends dko> a() {
      return e;
   }

   protected dko(dqs $$0, drc.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return h;
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aqn $$0, io $$1, drd $$2, aym $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return true;
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(f);
   }
}
