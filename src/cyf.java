import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyf extends cvx {
   public static final MapCodec<cyf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cye.a.forGetter($$0x -> $$0x.c), u()).apply($$0, cyf::new));
   private final cwp c;

   @Override
   public MapCodec<cyf> a() {
      return b;
   }

   protected cyf(cwp $$0, djf.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      this.a($$0, (ctp)$$1, $$2);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a && !$$0.a($$3, $$4)) {
         return cwr.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eer.c, eer.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
