import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dou extends dne {
   public static final MapCodec<dne> a = mh.e.q().fieldOf("dead");
   public static final MapCodec<dou> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dou::new));
   private final dne c;

   public dou(dne $$0, ebf.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dou> a() {
      return b;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(djd $$0, iw $$1) {
      for (jc $$2 : jc.values()) {
         exq $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axl.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().G_().a(40));
      }

      return this.m();
   }
}
