import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddc extends cwy implements cws {
   public static final MapCodec<ddc> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(div.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, ddc::new)
   );
   public static final dkg f = djw.aU;
   protected static final float g = 6.0F;
   protected static final eml h = cwp.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final div i;

   @Override
   public MapCodec<? extends ddc> a() {
      return e;
   }

   protected ddc(div $$0, djf.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return h;
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(and $$0, hx $$1, djg $$2, auu $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return true;
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(f);
   }
}
