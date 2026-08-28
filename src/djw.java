import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djw extends djv {
   public static final MapCodec<djw> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lt.e.r().fieldOf("host").forGetter(djv::b), u()).apply($$0, djw::new));

   @Override
   public MapCodec<djw> a() {
      return b;
   }

   public djw(dfw $$0, dsz.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dmj.i, ji.a.b));
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return dmj.b($$0, $$1);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(dmj.i);
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(dmj.i, $$0.k().o());
   }
}
