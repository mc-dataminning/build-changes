import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ddm extends ctj {
   public static final MapCodec<ddm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cjp.q.fieldOf("color").forGetter(ctj::b), t()).apply($$0, ddm::new));
   public static final dhq b = cyo.aE;
   private static final Map<hx, ekb> c = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cut.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         hx.d,
         cut.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         hx.e,
         cut.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         hx.f,
         cut.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<ddm> a() {
      return a;
   }

   public ddm(cjp $$0, dgv.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, hx.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = this.o();
      crv $$2 = $$0.q();
      ht $$3 = $$0.a();
      hx[] $$4 = $$0.f();

      for (hx $$5 : $$4) {
         if ($$5.o().d()) {
            hx $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }
}
