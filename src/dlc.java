import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlc extends div {
   public static final MapCodec<dlc> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkz.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dlc::new));
   private final djk f;

   @Override
   public MapCodec<dlc> a() {
      return e;
   }

   protected dlc(djk $$0, dwu.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(d, Boolean.valueOf(false)).b(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$4.g() == $$0.c(c) && !$$0.a($$1, $$3)) {
         return djm.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, esy.c, esy.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
