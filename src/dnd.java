import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnd extends dmi {
   public static final MapCodec<dnd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dty.a.fieldOf("wood_type").forGetter(dmi::d), u()).apply($$0, dnd::new));
   public static final dtl b = dtb.ba;

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   public dnd(dty $$0, dsk.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dtr.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == eok.c));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !this.a($$0, $$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsl $$0) {
      return dtr.b($$0.c(b));
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, f);
   }
}
