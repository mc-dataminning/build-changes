import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlf extends diy {
   public static final MapCodec<dlf> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlc.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dlf::new));
   private final djn f;

   @Override
   public MapCodec<dlf> a() {
      return e;
   }

   protected dlf(djn $$0, dwx.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(d, Boolean.valueOf(false)).b(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$4.g() == $$0.c(c) && !$$0.a($$1, $$3)) {
         return djp.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, etb.c, etb.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
