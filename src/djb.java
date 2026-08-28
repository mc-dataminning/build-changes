import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djb extends dgu {
   public static final MapCodec<djb> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(diy.a.forGetter($$0x -> $$0x.f), u()).apply($$0, djb::new));
   private final dhj f;

   @Override
   public MapCodec<djb> a() {
      return e;
   }

   protected djb(dhj $$0, dun.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      this.a($$0, (deh)$$1, $$2);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().b(d, Boolean.valueOf(false)).b(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dhl.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eqq.c, eqq.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
