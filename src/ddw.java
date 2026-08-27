import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ddw extends dch {
   public static final MapCodec<dch> a = kt.e.q().fieldOf("dead");
   public static final MapCodec<ddw> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, ddw::new));
   private final dch c;

   public ddw(dch $$0, dph.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<ddw> a() {
      return b;
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.n(), 2);
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cym $$0, id $$1) {
      for (ij $$2 : ij.values()) {
         elb $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(avj.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.n();
   }
}
