import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dfp extends dea {
   public static final MapCodec<dea> a = le.e.q().fieldOf("dead");
   public static final MapCodec<dfp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dfp::new));
   private final dea c;

   public dfp(dea $$0, drc.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dfp> a() {
      return b;
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.n(), 2);
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(daf $$0, io $$1) {
      for (it $$2 : it.values()) {
         emw $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awc.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.n();
   }
}
