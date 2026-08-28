import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dpx extends dfr {
   public static final MapCodec<dpx> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dny.a.b.fieldOf("kind").forGetter(dfr::b), u()).apply($$0, dpx::new));
   public static final duu d = dkr.aE;
   private static final Map<jj, eyx> b = Maps.newEnumMap(
      ImmutableMap.of(
         jj.c,
         dgv.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jj.d,
         dgv.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jj.f,
         dgv.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jj.e,
         dgv.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dpx> a() {
      return c;
   }

   protected dpx(dny.a $$0, dtz.d $$1) {
      super($$0, $$1);
      this.l(this.o().b(d, jj.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dua a(cyw $$0) {
      dua $$1 = super.a($$0);
      dcx $$2 = $$0.q();
      je $$3 = $$0.a();
      jj[] $$4 = $$0.f();

      for (jj $$5 : $$4) {
         if ($$5.o().d()) {
            jj $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
