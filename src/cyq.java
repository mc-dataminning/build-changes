import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyq extends cwj {
   public static final MapCodec<cyq> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyn.a.forGetter($$0x -> $$0x.f), u()).apply($$0, cyq::new));
   private final cwy f;

   @Override
   public MapCodec<cyq> a() {
      return e;
   }

   protected cyq(cwy $$0, djo.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      this.a($$0, (cty)$$1, $$2);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return cxa.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, efa.c, efa.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
