import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dic extends dez {
   public static final MapCodec<dic> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dic::new)
   );
   private static final Map<dez, dez> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ewk c = dez.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dez e;

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   public dic(dez $$0, dsb.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return c;
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      dsc $$8 = ($$0.g() instanceof csn $$7 ? d.getOrDefault($$7.d(), dfb.a) : dfb.a).o();
      if ($$8.i()) {
         return bqw.d;
      } else if (!this.m()) {
         return bqw.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dwv.c, $$3);
         $$4.a(awk.ah);
         $$0.a(1, $$4);
         return bqw.a($$2.B);
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if (this.m()) {
         return bqu.c;
      } else {
         cup $$5 = new cup(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dfb.fR.o(), 3);
         $$1.a($$3, dwv.c, $$2);
         return bqu.a($$1.B);
      }
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return this.m() ? super.a($$0, $$1, $$2) : new cup(this.e);
   }

   private boolean m() {
      return this.e == dfb.a;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dez b() {
      return this.e;
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
