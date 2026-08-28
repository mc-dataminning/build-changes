import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dhl extends dfw {
   public static final MapCodec<dfw> a = lt.e.r().fieldOf("dead");
   public static final MapCodec<dhl> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dhl::new));
   private final dfw c;

   public dhl(dfw $$0, dsz.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dhl> a() {
      return b;
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(dca $$0, jd $$1) {
      for (ji $$2 : ji.values()) {
         eoy $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awj.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.o();
   }
}
