import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dov extends dmn {
   public static final MapCodec<dov> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dos.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dov::new));
   private final dnc f;

   @Override
   public MapCodec<dov> a() {
      return e;
   }

   protected dov(dnc $$0, ebd.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(b, Boolean.valueOf(false)).b(d, $$0.c(d)), 2);
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$4.g() == $$0.c(d) && !$$0.a($$1, $$3)) {
         return dne.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, exp.c, exp.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
