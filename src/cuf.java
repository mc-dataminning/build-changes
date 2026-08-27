import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cuf extends ctr {
   public static final MapCodec<cuf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cjx.q.fieldOf("color").forGetter(ctr::b), u()).apply($$0, cuf::new));
   public static final dii b = dhy.ba;
   private static final Map<cjx, cva> c = Maps.newHashMap();
   private static final ekn d = cva.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<cuf> a() {
      return a;
   }

   public cuf(cjx $$0, dhh.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return d;
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(b, Integer.valueOf(dio.a($$0.i() + 180.0F)));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   public static cva a(cjx $$0) {
      return c.getOrDefault($$0, cvc.iJ);
   }
}
