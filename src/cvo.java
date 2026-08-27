import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cvo extends cua {
   public static final MapCodec<cua> a = jy.f.q().fieldOf("dead");
   public static final MapCodec<cvo> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, cvo::new));
   private final cua c;

   public cvo(cua $$0, dga.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<cvo> a() {
      return b;
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cqf $$0, ht $$1) {
      for (hx $$2 : hx.values()) {
         ebe $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(aqx.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.o();
   }
}
