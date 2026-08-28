import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djq extends dhj {
   public static final MapCodec<djq> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djn.a.forGetter($$0x -> $$0x.f), t()).apply($$0, djq::new));
   private final dhy f;

   @Override
   public MapCodec<djq> a() {
      return e;
   }

   protected djq(dhy $$0, dvc.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      this.a($$0, (dew)$$1, $$2);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(d, Boolean.valueOf(false)).b(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dia.a.m();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, erf.c, erf.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
