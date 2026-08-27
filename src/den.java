import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class den extends dcg {
   public static final MapCodec<den> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dek.a.forGetter($$0x -> $$0x.f), u()).apply($$0, den::new));
   private final dcv f;

   @Override
   public MapCodec<den> a() {
      return e;
   }

   protected den(dcv $$0, dpx.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      this.a($$0, (czv)$$1, $$2);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.n().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dcx.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, els.c, els.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
