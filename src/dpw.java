import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dpw extends dnw {
   public static final MapCodec<dpw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dvn.a.fieldOf("wood_type").forGetter(dnw::d), u()).apply($$0, dpw::new));
   public static final duu b = dkr.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jj, eyx> i = Maps.newEnumMap(
      ImmutableMap.of(
         jj.c,
         dgv.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jj.d,
         dgv.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jj.f,
         dgv.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jj.e,
         dgv.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dpw> a() {
      return a;
   }

   public dpw(dvn $$0, dtz.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.E.b().b(b, jj.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      dua $$1 = this.o();
      eqb $$2 = $$0.q().b_($$0.a());
      ddv $$3 = $$0.q();
      je $$4 = $$0.a();
      jj[] $$5 = $$0.f();

      for (jj $$6 : $$5) {
         if ($$6.o().d()) {
            jj $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == eqc.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dua $$0) {
      return $$0.c(b).p();
   }

   @Override
   public eye o(dua $$0) {
      eyx $$1 = i.get($$0.c(b));
      return $$1.a().f();
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
      $$0.a(b, f);
   }
}
