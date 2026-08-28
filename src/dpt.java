import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dpt extends dfm {
   public static final MapCodec<dpt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cue.q.fieldOf("color").forGetter(dfm::b), u()).apply($$0, dpt::new));
   public static final duu b = dkr.aE;
   private static final Map<jj, eyx> c = Maps.newEnumMap(
      ImmutableMap.of(
         jj.c,
         dgv.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jj.d,
         dgv.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jj.e,
         dgv.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jj.f,
         dgv.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   public dpt(cue $$0, dtz.d $$1) {
      super($$0, $$1);
      this.l(this.E.b().b(b, jj.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dua a(cyw $$0) {
      dua $$1 = this.o();
      ddv $$2 = $$0.q();
      je $$3 = $$0.a();
      jj[] $$4 = $$0.f();

      for (jj $$5 : $$4) {
         if ($$5.o().d()) {
            jj $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }
}
