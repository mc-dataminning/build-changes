import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dkt extends dks implements dtb {
   public static final MapCodec<dkt> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.e), Codec.FLOAT.fieldOf("width").forGetter($$0x -> $$0x.f), t())
            .apply($$0, dkt::new)
   );
   public static final eaf c = eae.I;
   public static final eam<ja> d = eae.R;
   private final float e;
   private final float f;
   private final Map<ja, feq> g;

   @Override
   public MapCodec<dkt> a() {
      return b;
   }

   public dkt(float $$0, float $$1, dzn.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, ja.b));
      this.g = fen.d(dlu.c((double)$$1, (double)(16.0F - $$0), 16.0));
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.g.get($$0.c(d));
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      ja $$3 = $$0.c(d);
      iu $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      diq $$1 = $$0.q();
      iu $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == evw.c)).b(d, $$0.k());
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(c) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, d);
   }
}
