import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ded extends cub {
   public static final MapCodec<ded> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dcg.a.b.fieldOf("kind").forGetter(cub::b), u()).apply($$0, ded::new));
   public static final dih d = cza.aE;
   private static final Map<ib, eks> b = Maps.newEnumMap(
      ImmutableMap.of(
         ib.c,
         cvf.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ib.d,
         cvf.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ib.f,
         cvf.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ib.e,
         cvf.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends ded> a() {
      return c;
   }

   protected ded(dcg.a $$0, dhm.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ib.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = super.a($$0);
      crl $$2 = $$0.q();
      hx $$3 = $$0.a();
      ib[] $$4 = $$0.f();

      for (ib $$5 : $$4) {
         if ($$5.o().d()) {
            ib $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
