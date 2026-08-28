import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dlg extends die {
   public static final MapCodec<dlg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ly.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, dlg::new)
   );
   private static final Map<die, die> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final fah c = die.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final die e;

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   public dlg(die $$0, dvi.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return c;
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      dvj $$8 = ($$0.h() instanceof cuh $$7 ? d.getOrDefault($$7.d(), dig.a) : dig.a).m();
      if ($$8.l()) {
         return bsd.f;
      } else if (!this.q()) {
         return bsd.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, eag.c, $$3);
         $$4.a(awv.ah);
         $$0.a(1, $$4);
         return bsd.a;
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (this.q()) {
         return bsd.c;
      } else {
         cwb $$5 = new cwb(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dig.fR.m(), 3);
         $$1.a($$3, eag.c, $$2);
         return bsd.a;
      }
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return this.q() ? super.a($$0, $$1, $$2) : new cwb(this.e);
   }

   private boolean q() {
      return this.e == dig.a;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1 == jm.a && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public die b() {
      return this.e;
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
