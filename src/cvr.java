import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cvr extends ctl {
   public static final MapCodec<cvr> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvo.a.forGetter($$0x -> $$0x.f), t()).apply($$0, cvr::new));
   private final cua f;

   @Override
   public MapCodec<cvr> a() {
      return e;
   }

   protected cvr(cua $$0, dga.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      this.a($$0, (cra)$$1, $$2);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return cuc.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, ebf.c, ebf.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
