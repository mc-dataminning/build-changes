import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dhn extends cxj {
   public static final MapCodec<dhn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cnr.q.fieldOf("color").forGetter(cxj::b), u()).apply($$0, dhn::new));
   public static final dmd b = dcn.aE;
   private static final Map<ie, eos> c = Maps.newEnumMap(
      ImmutableMap.of(
         ie.c,
         cys.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ie.d,
         cys.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ie.e,
         cys.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ie.f,
         cys.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   public dhn(cnr $$0, dli.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ie.c));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dlj a(crk $$0) {
      dlj $$1 = this.o();
      cvu $$2 = $$0.q();
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
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }
}
