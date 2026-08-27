import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cvo extends cva {
   public static final MapCodec<cvo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clf.q.fieldOf("color").forGetter(cva::b), u()).apply($$0, cvo::new));
   public static final dka b = djq.ba;
   private static final Map<clf, cwj> c = Maps.newHashMap();
   private static final emf d = cwj.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<cvo> a() {
      return a;
   }

   public cvo(clf $$0, diz.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return d;
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(b, Integer.valueOf(dkg.a($$0.i() + 180.0F)));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   public static cwj a(clf $$0) {
      return c.getOrDefault($$0, cwl.iJ);
   }
}
