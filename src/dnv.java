import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dnv extends ddq {
   public static final MapCodec<dnv> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlw.a.b.fieldOf("kind").forGetter(ddq::b), u()).apply($$0, dnv::new));
   public static final dsr d = diq.aE;
   private static final Map<je, ewf> b = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         deu.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         je.d,
         deu.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         je.f,
         deu.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         je.e,
         deu.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dnv> a() {
      return c;
   }

   protected dnv(dlw.a $$0, drw.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(d, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public drx a(cxv $$0) {
      drx $$1 = super.a($$0);
      daz $$2 = $$0.q();
      iz $$3 = $$0.a();
      je[] $$4 = $$0.f();

      for (je $$5 : $$4) {
         if ($$5.o().d()) {
            je $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
