import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfp extends cvm {
   public static final MapCodec<dfp> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddr.a.b.fieldOf("kind").forGetter(cvm::b), u()).apply($$0, dfp::new));
   public static final dkb d = dal.aE;
   private static final Map<ic, emm> b = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwq.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ic.d,
         cwq.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ic.f,
         cwq.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ic.e,
         cwq.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dfp> a() {
      return c;
   }

   protected dfp(ddr.a $$0, djg.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ic.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public djh a(cph $$0) {
      djh $$1 = super.a($$0);
      csv $$2 = $$0.q();
      hx $$3 = $$0.a();
      ic[] $$4 = $$0.f();

      for (ic $$5 : $$4) {
         if ($$5.o().d()) {
            ic $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
