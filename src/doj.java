import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doj extends dmb {
   public static final MapCodec<doj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(doh.a.forGetter($$0x -> $$0x.c), t()).apply($$0, doj::new));
   private final dmr c;
   private static final ffw d = dmr.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   protected doj(dmr $$0, eas.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.c.m().b(b, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$4 == jb.a && !$$0.a($$1, $$3)) {
         return dmt.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(b)) {
            $$2.a($$3, exb.c, exb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return d;
   }
}
