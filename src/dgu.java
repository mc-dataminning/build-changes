import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgu extends dem {
   public static final MapCodec<dgu> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgr.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dgu::new));
   private final dfc f;

   @Override
   public MapCodec<dgu> a() {
      return e;
   }

   protected dgu(dfc $$0, dtb.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      this.a($$0, (dcb)$$1, $$2);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.n().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dfe.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, epf.c, epf.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
