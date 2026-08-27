import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfe extends cva {
   public static final MapCodec<dfe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clf.q.fieldOf("color").forGetter(cva::b), u()).apply($$0, dfe::new));
   public static final dju b = dae.aE;
   private static final Map<ic, emf> c = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwj.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ic.d,
         cwj.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ic.e,
         cwj.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ic.f,
         cwj.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   public dfe(clf $$0, diz.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dja a(cpa $$0) {
      dja $$1 = this.o();
      ctl $$2 = $$0.q();
      hx $$3 = $$0.a();
      ic[] $$4 = $$0.f();

      for (ic $$5 : $$4) {
         if ($$5.o().d()) {
            ic $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }
}
