import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cuq extends ctc {
   public static final MapCodec<ctc> a = jb.f.q().fieldOf("dead");
   public static final MapCodec<cuq> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, cuq::new));
   private final ctc c;

   public cuq(ctc $$0, dfc.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<cuq> a() {
      return b;
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.D_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cph $$0, gw $$1) {
      for (ha $$2 : ha.values()) {
         eag $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(aqa.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().D_().a(40));
      }

      return this.o();
   }
}
