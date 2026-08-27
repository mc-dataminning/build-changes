import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ddq extends ctp {
   public static final MapCodec<ddq> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbu.a.b.fieldOf("kind").forGetter(ctp::b), t()).apply($$0, ddq::new));
   public static final dhq d = cyo.aE;
   private static final Map<hx, ekb> b = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cut.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         hx.d,
         cut.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         hx.f,
         cut.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         hx.e,
         cut.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends ddq> a() {
      return c;
   }

   protected ddq(dbu.a $$0, dgv.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, hx.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = super.a($$0);
      cqy $$2 = $$0.q();
      ht $$3 = $$0.a();
      hx[] $$4 = $$0.f();

      for (hx $$5 : $$4) {
         if ($$5.o().d()) {
            hx $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
