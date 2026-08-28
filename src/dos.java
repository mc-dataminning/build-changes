import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dos extends dnc {
   public static final MapCodec<dnc> a = mg.e.q().fieldOf("dead");
   public static final MapCodec<dos> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dos::new));
   private final dnc c;

   public dos(dnc $$0, ebd.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dos> a() {
      return b;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(djb $$0, iv $$1) {
      for (jb $$2 : jb.values()) {
         exo $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axj.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().G_().a(40));
      }

      return this.m();
   }
}
