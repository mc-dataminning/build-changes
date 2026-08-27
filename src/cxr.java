import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxr extends cvk {
   public static final MapCodec<cxr> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxo.a.forGetter($$0x -> $$0x.f), u()).apply($$0, cxr::new));
   private final cvz f;

   @Override
   public MapCodec<cxr> a() {
      return e;
   }

   protected cxr(cvz $$0, dio.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      this.a($$0, (csz)$$1, $$2);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return cwb.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eea.c, eea.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
