import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cyf extends cwq {
   public static final MapCodec<cwq> a = kd.e.q().fieldOf("dead");
   public static final MapCodec<cyf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, cyf::new));
   private final cwq c;

   public cyf(cwq $$0, djg.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<cyf> a() {
      return b;
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.F_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(csv $$0, hx $$1) {
      for (ic $$2 : ic.values()) {
         eer $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(asm.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().F_().a(40));
      }

      return this.o();
   }
}
