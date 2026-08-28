import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djn extends dhy {
   public static final MapCodec<dhy> a = lx.e.q().fieldOf("dead");
   public static final MapCodec<djn> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, djn::new));
   private final dhy c;

   public djn(dhy $$0, dvc.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<djn> a() {
      return b;
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(dea $$0, jg $$1) {
      for (jl $$2 : jl.values()) {
         ere $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axf.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.m();
   }
}
