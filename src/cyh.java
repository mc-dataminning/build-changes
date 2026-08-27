import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyh extends cwa {
   public static final MapCodec<cyh> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cye.a.forGetter($$0x -> $$0x.f), u()).apply($$0, cyh::new));
   private final cwp f;

   @Override
   public MapCodec<cyh> a() {
      return e;
   }

   protected cyh(cwp $$0, djf.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      this.a($$0, (ctp)$$1, $$2);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return cwr.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eer.c, eer.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
