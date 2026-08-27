import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgr extends dfc {
   public static final MapCodec<dfc> a = lh.e.q().fieldOf("dead");
   public static final MapCodec<dgr> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgr::new));
   private final dfc c;

   public dgr(dfc $$0, dtb.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dgr> a() {
      return b;
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.n(), 2);
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.F_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(dbg $$0, ir $$1) {
      for (iw $$2 : iw.values()) {
         epe $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awj.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().F_().a(40));
      }

      return this.n();
   }
}
