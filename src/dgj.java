import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgj extends deu {
   public static final MapCodec<deu> a = lp.e.q().fieldOf("dead");
   public static final MapCodec<dgj> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgj::new));
   private final deu c;

   public dgj(deu $$0, drw.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dgj> a() {
      return b;
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.n(), 2);
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(daz $$0, iz $$1) {
      for (je $$2 : je.values()) {
         enq $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awr.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.n();
   }
}
