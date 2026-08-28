import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dla extends dhy {
   public static final MapCodec<dla> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lx.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, dla::new)
   );
   private static final Map<dhy, dhy> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final fab c = dhy.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dhy e;

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   public dla(dhy $$0, dvc.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      dvd $$8 = ($$0.h() instanceof cuc $$7 ? d.getOrDefault($$7.d(), dia.a) : dia.a).m();
      if ($$8.l()) {
         return bry.f;
      } else if (!this.q()) {
         return bry.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, eaa.c, $$3);
         $$4.a(awu.ah);
         $$0.a(1, $$4);
         return bry.a;
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (this.q()) {
         return bry.c;
      } else {
         cvx $$5 = new cvx(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dia.fR.m(), 3);
         $$1.a($$3, eaa.c, $$2);
         return bry.a;
      }
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return this.q() ? super.a($$0, $$1, $$2) : new cvx(this.e);
   }

   private boolean q() {
      return this.e == dia.a;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1 == jl.a && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dhy b() {
      return this.e;
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
