import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cut extends csn {
   public static final MapCodec<cut> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuq.a.forGetter($$0x -> $$0x.f), t()).apply($$0, cut::new));
   private final ctc f;

   @Override
   public MapCodec<cut> a() {
      return e;
   }

   protected cut(ctc $$0, dfc.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      this.a($$0, (cqc)$$1, $$2);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return cte.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eah.c, eah.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
