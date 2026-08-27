import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dhj extends cxf {
   public static final MapCodec<dhj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cnn.q.fieldOf("color").forGetter(cxf::b), u()).apply($$0, dhj::new));
   public static final dlz b = dcj.aE;
   private static final Map<ie, eol> c = Maps.newEnumMap(
      ImmutableMap.of(
         ie.c,
         cyo.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ie.d,
         cyo.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ie.e,
         cyo.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ie.f,
         cyo.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public dhj(cnn $$0, dle.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ie.c));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dlf a(crg $$0) {
      dlf $$1 = this.o();
      cvq $$2 = $$0.q();
      hz $$3 = $$0.a();
      ie[] $$4 = $$0.f();

      for (ie $$5 : $$4) {
         if ($$5.o().d()) {
            ie $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }
}
