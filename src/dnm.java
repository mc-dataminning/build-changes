import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnm extends dlf {
   public static final MapCodec<dnm> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dnj.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dnm::new));
   private final dlu f;

   @Override
   public MapCodec<dnm> a() {
      return e;
   }

   protected dnm(dlu $$0, dzn.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(b, Boolean.valueOf(false)).b(d, $$0.c(d)), 2);
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$4.g() == $$0.c(d) && !$$0.a($$1, $$3)) {
         return dlw.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, evw.c, evw.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
