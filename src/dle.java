import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dle extends dix {
   public static final MapCodec<dle> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlb.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dle::new));
   private final djm f;

   @Override
   public MapCodec<dle> a() {
      return e;
   }

   protected dle(djm $$0, dww.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(d, Boolean.valueOf(false)).b(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$4.g() == $$0.c(c) && !$$0.a($$1, $$3)) {
         return djo.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, eta.c, eta.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
