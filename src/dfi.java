import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfi extends cvf {
   public static final MapCodec<dfi> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddk.a.b.fieldOf("kind").forGetter(cvf::b), u()).apply($$0, dfi::new));
   public static final dju d = dae.aE;
   private static final Map<ic, emf> b = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwj.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ic.d,
         cwj.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ic.f,
         cwj.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ic.e,
         cwj.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dfi> a() {
      return c;
   }

   protected dfi(ddk.a $$0, diz.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ic.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dja a(cpa $$0) {
      dja $$1 = super.a($$0);
      cso $$2 = $$0.q();
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
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
