import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dfh extends ddi {
   public static final MapCodec<dfh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkn.a.fieldOf("wood_type").forGetter(ddi::d), u()).apply($$0, dfh::new));
   public static final dju b = dae.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ic, emf> i = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwj.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ic.d,
         cwj.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ic.f,
         cwj.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ic.e,
         cwj.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dfh> a() {
      return a;
   }

   public dfh(dkn $$0, diz.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ic.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      dja $$1 = this.o();
      eek $$2 = $$0.q().b_($$0.a());
      ctl $$3 = $$0.q();
      hx $$4 = $$0.a();
      ic[] $$5 = $$0.f();

      for (ic $$6 : $$5) {
         if ($$6.o().d()) {
            ic $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eel.c));
            }
         }
      }

      return null;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dja $$0) {
      return $$0.c(b).p();
   }

   @Override
   public elm h(dja $$0) {
      emf $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, f);
   }
}
