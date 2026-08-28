import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dlb extends djm {
   public static final MapCodec<djm> a = mb.e.q().fieldOf("dead");
   public static final MapCodec<dlb> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dlb::new));
   private final djm c;

   public dlb(djm $$0, dww.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dlb> a() {
      return b;
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(dfn $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         esz $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awv.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().H_().a(40));
      }

      return this.m();
   }
}
