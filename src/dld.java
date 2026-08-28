import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dld extends diw {
   public static final MapCodec<dld> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlb.a.forGetter($$0x -> $$0x.e), t()).apply($$0, dld::new));
   private final djm e;
   protected static final float b = 6.0F;
   protected static final fbu c = djm.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   protected dld(djm $$0, dww.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.e.m().b(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$4 == jn.a && !$$0.a($$1, $$3)) {
         return djo.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(d)) {
            $$2.a($$3, eta.c, eta.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return c;
   }
}
