import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgw extends dfh {
   public static final MapCodec<dfh> a = lq.e.r().fieldOf("dead");
   public static final MapCodec<dgw> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgw::new));
   private final dfh c;

   public dgw(dfh $$0, dsj.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dgw> a() {
      return b;
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(dbl $$0, ja $$1) {
      for (jf $$2 : jf.values()) {
         eoh $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awc.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.o();
   }
}
