import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwk extends cue {
   public static final MapCodec<cwk> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwh.a.forGetter($$0x -> $$0x.f), t()).apply($$0, cwk::new));
   private final cut f;

   @Override
   public MapCodec<cwk> a() {
      return e;
   }

   protected cwk(cut $$0, dgv.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      this.a($$0, (crt)$$1, $$2);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return cuv.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, ech.c, ech.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
