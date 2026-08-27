import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cxy extends cwj {
   public static final MapCodec<cwj> a = kd.e.q().fieldOf("dead");
   public static final MapCodec<cxy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, cxy::new));
   private final cwj c;

   public cxy(cwj $$0, diz.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<cxy> a() {
      return b;
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.F_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cso $$0, hx $$1) {
      for (ic $$2 : ic.values()) {
         eek $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(asg.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().F_().a(40));
      }

      return this.o();
   }
}
