import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgx extends dfi {
   public static final MapCodec<dfi> a = lq.e.r().fieldOf("dead");
   public static final MapCodec<dgx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgx::new));
   private final dfi c;

   public dgx(dfi $$0, dsk.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dgx> a() {
      return b;
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(dbm $$0, ja $$1) {
      for (jf $$2 : jf.values()) {
         eoj $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awc.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.o();
   }
}
