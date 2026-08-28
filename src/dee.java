import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dee extends ddq {
   public static final MapCodec<dee> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cti.q.fieldOf("color").forGetter(ddq::b), u()).apply($$0, dee::new));
   public static final dtc b = dss.ba;
   private static final Map<cti, dez> c = Maps.newHashMap();
   private static final ewk d = dez.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   public dee(cti $$0, dsb.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return d;
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(b, Integer.valueOf(dti.a($$0.i() + 180.0F)));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   public static dez a(cti $$0) {
      return c.getOrDefault($$0, dfb.iJ);
   }
}
