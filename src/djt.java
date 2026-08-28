import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class djt extends djs implements dsb {
   public static final MapCodec<djt> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.e), Codec.FLOAT.fieldOf("width").forGetter($$0x -> $$0x.f), t())
            .apply($$0, djt::new)
   );
   public static final dzd c = dzc.I;
   public static final dzk<jo> d = dzc.R;
   private final float e;
   private final float f;
   private final Map<jo, fdo> g;

   @Override
   public MapCodec<djt> a() {
      return b;
   }

   public djt(float $$0, float $$1, dyl.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, jo.b));
      this.g = fdl.d(dku.c((double)$$1, (double)(16.0F - $$0), 16.0));
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.g.get($$0.c(d));
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jo $$3 = $$0.c(d);
      jj $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dhq $$1 = $$0.q();
      jj $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == euu.c)).b(d, $$0.k());
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(c) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, d);
   }
}
