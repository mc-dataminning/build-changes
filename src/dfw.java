import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dfw extends ddx {
   public static final MapCodec<dfw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlc.a.fieldOf("wood_type").forGetter(ddx::d), u()).apply($$0, dfw::new));
   public static final dkj b = dat.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ic, emv> i = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwy.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ic.d,
         cwy.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ic.f,
         cwy.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ic.e,
         cwy.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dfw> a() {
      return a;
   }

   public dfw(dlc $$0, djo.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ic.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = this.o();
      eez $$2 = $$0.q().b_($$0.a());
      cua $$3 = $$0.q();
      hx $$4 = $$0.a();
      ic[] $$5 = $$0.f();

      for (ic $$6 : $$5) {
         if ($$6.o().d()) {
            ic $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == efa.c));
            }
         }
      }

      return null;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(djp $$0) {
      return $$0.c(b).p();
   }

   @Override
   public emc h(djp $$0) {
      emv $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, f);
   }
}
