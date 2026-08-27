import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfx extends cvu {
   public static final MapCodec<dfx> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddz.a.b.fieldOf("kind").forGetter(cvu::b), u()).apply($$0, dfx::new));
   public static final dkj d = dat.aE;
   private static final Map<ic, emv> b = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwy.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ic.d,
         cwy.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ic.f,
         cwy.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ic.e,
         cwy.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dfx> a() {
      return c;
   }

   protected dfx(ddz.a $$0, djo.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ic.c));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public djp a(cpp $$0) {
      djp $$1 = super.a($$0);
      ctd $$2 = $$0.q();
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
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
