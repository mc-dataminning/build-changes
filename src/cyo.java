import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyo extends cwg {
   public static final MapCodec<cyo> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyn.a.forGetter($$0x -> $$0x.c), u()).apply($$0, cyo::new));
   private final cwy c;

   @Override
   public MapCodec<cyo> a() {
      return b;
   }

   protected cyo(cwy $$0, djo.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      this.a($$0, (cty)$$1, $$2);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a && !$$0.a($$3, $$4)) {
         return cxa.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, efa.c, efa.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
