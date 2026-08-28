import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhq extends dfj {
   public static final MapCodec<dhq> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhn.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dhq::new));
   private final dfy f;

   @Override
   public MapCodec<dhq> a() {
      return e;
   }

   protected dhq(dfy $$0, dtb.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      this.a($$0, (dcx)$$1, $$2);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dga.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, epf.c, epf.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
