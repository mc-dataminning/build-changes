import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dey extends cuv {
   public static final MapCodec<dey> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dda.a.b.fieldOf("kind").forGetter(cuv::b), u()).apply($$0, dey::new));
   public static final djj d = czu.aE;
   private static final Map<ia, elu> b = Maps.newEnumMap(
      ImmutableMap.of(
         ia.c,
         cvz.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ia.d,
         cvz.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ia.f,
         cvz.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ia.e,
         cvz.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dey> a() {
      return c;
   }

   protected dey(dda.a $$0, dio.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ia.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dip a(coq $$0) {
      dip $$1 = super.a($$0);
      cse $$2 = $$0.q();
      hv $$3 = $$0.a();
      ia[] $$4 = $$0.f();

      for (ia $$5 : $$4) {
         if ($$5.o().d()) {
            ia $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
