import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dai extends cya {
   public static final MapCodec<dai> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dah.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dai::new));
   private final cys c;

   @Override
   public MapCodec<dai> a() {
      return b;
   }

   protected dai(cys $$0, dli.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      this.a($$0, (cvs)$$1, $$2);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$1 == ie.a && !$$0.a($$3, $$4)) {
         return cyu.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, egx.c, egx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
