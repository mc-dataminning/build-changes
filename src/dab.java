import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.stream.Stream;

public class dab extends cwy {
   public static final MapCodec<dab> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dab::new)
   );
   private static final Map<cwy, cwy> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final emv c = cwy.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final cwy e;

   @Override
   public MapCodec<dab> a() {
      return a;
   }

   public dab(cwy $$0, djo.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return c;
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      djp $$8 = ($$0.d() instanceof cla $$7 ? d.getOrDefault($$7.e(), cxa.a) : cxa.a).o();
      if ($$8.i()) {
         return bke.d;
      } else if (!this.g()) {
         return bke.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dnz.c, $$3);
         $$4.a(asd.ah);
         if (!$$4.fT().d) {
            $$0.h(1);
         }

         return bke.a($$2.B);
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if (this.g()) {
         return bkc.b;
      } else {
         cng $$5 = new cng(this.e);
         Stream.of(bkb.a, bkb.b).filter($$1x -> $$3.b($$1x).b()).findFirst().ifPresentOrElse($$2x -> $$3.a($$2x, $$5), () -> {
            if (!$$3.i($$5)) {
               $$3.a($$5, false);
            }
         });
         $$1.a($$2, cxa.fR.o(), 3);
         $$1.a($$3, dnz.c, $$2);
         return bkc.a($$1.B);
      }
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new cng(this.e);
   }

   private boolean g() {
      return this.e == cxa.a;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cwy b() {
      return this.e;
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
