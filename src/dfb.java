import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfb extends cyx implements cyr {
   public static final MapCodec<dfb> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dku.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dfb::new)
   );
   public static final dmf f = dlv.aU;
   protected static final float g = 6.0F;
   protected static final eol h = cyo.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dku i;

   @Override
   public MapCodec<? extends dfb> a() {
      return e;
   }

   protected dfb(dku $$0, dle.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return h;
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aov $$0, hz $$1, dlf $$2, awo $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return true;
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(f);
   }
}
