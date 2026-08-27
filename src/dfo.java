import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dfo extends ddp {
   public static final MapCodec<dfo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dku.a.fieldOf("wood_type").forGetter(ddp::d), u()).apply($$0, dfo::new));
   public static final dkb b = dal.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ic, emm> i = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwq.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ic.d,
         cwq.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ic.f,
         cwq.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ic.e,
         cwq.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dfo> a() {
      return a;
   }

   public dfo(dku $$0, djg.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ic.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      djh $$1 = this.o();
      eer $$2 = $$0.q().b_($$0.a());
      cts $$3 = $$0.q();
      hx $$4 = $$0.a();
      ic[] $$5 = $$0.f();

      for (ic $$6 : $$5) {
         if ($$6.o().d()) {
            ic $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ees.c));
            }
         }
      }

      return null;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(djh $$0) {
      return $$0.c(b).p();
   }

   @Override
   public elt h(djh $$0) {
      emm $$1 = i.get($$0.c(b));
      return $$1.a().f();
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
      $$0.a(b, f);
   }
}
