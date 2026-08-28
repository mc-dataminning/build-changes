import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dje extends dgx {
   public static final MapCodec<dje> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djb.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dje::new));
   private final dhm f;

   @Override
   public MapCodec<dje> a() {
      return e;
   }

   protected dje(dhm $$0, dur.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      this.a($$0, (dek)$$1, $$2);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.n().b(d, Boolean.valueOf(false)).b(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dho.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, equ.c, equ.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
