import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfl extends cvh {
   public static final MapCodec<dfl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clm.q.fieldOf("color").forGetter(cvh::b), u()).apply($$0, dfl::new));
   public static final dkb b = dal.aE;
   private static final Map<ic, emm> c = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwq.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ic.d,
         cwq.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ic.e,
         cwq.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ic.f,
         cwq.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   public dfl(clm $$0, djg.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public djh a(cph $$0) {
      djh $$1 = this.o();
      cts $$2 = $$0.q();
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
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }
}
