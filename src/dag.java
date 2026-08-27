import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dag extends cxz {
   public static final MapCodec<dag> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dad.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dag::new));
   private final cyo f;

   @Override
   public MapCodec<dag> a() {
      return e;
   }

   protected dag(cyo $$0, dle.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      this.a($$0, (cvo)$$1, $$2);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return cyq.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, egq.c, egq.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
