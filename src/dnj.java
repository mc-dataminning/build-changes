import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dnj extends dlu {
   public static final MapCodec<dlu> a = mf.e.q().fieldOf("dead");
   public static final MapCodec<dnj> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dnj::new));
   private final dlu c;

   public dnj(dlu $$0, dzn.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dnj> a() {
      return b;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(dhv $$0, iu $$1) {
      for (ja $$2 : ja.values()) {
         evv $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axf.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().C_().a(40));
      }

      return this.m();
   }
}
